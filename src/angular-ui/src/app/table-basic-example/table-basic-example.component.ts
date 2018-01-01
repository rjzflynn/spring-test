import {Component, ViewChild, OnInit,OnChanges,Input } from '@angular/core';
import {MatTableDataSource, MatSort} from '@angular/material';
import { MenuService } from './../services/menu.service';
import {DataSource} from '@angular/cdk/collections';
import { MenuItem } from './../models/menuitem';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/observable/of';
import { DataService } from './../data.service';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';





/**
 * @title Basic table
 */
@Component({
  selector: 'table-basic-example',
  styleUrls: ['./table-basic-example.component.css'],
  templateUrl: './table-basic-example.component.html',
})
export class TableBasicExample {

  displayedColumns = ['name', 'calories', 'fat', 'protein', 'carbs'];
  dataSource = new MenuDataSource(this.menuService, this.location, this.route);

  constructor(
    private menuService: MenuService, 
    private dataService: DataService,
    private route: ActivatedRoute,
    private location: Location
    ) { } 

  ngOnInit() {
    this.dataService.currentMenu.subscribe(currentMenu => 
      this.dataSource = new MenuDataSource(this.menuService, this.location, this.route))
  }
  
}

export class MenuDataSource extends DataSource<any> {
  currentMenu : Number;
  constructor(private menuService: MenuService,private location: Location,private route: ActivatedRoute) {
    super();
  }

  connect(): Observable<MenuItem[]> {
    const id = +this.route.snapshot.paramMap.get('id');
   return  this.menuService.getMenuItems(id)
  }

  disconnect() {}
}

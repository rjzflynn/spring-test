import { DataService } from '../services/data.service';
import {Component, ViewChild, OnInit,OnChanges,Input } from '@angular/core';
import {MatTableDataSource, MatSort} from '@angular/material';
import { MenuService } from './../services/menu.service';
import {DataSource} from '@angular/cdk/collections';
import { MenuItem } from './../models/menuitem';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/observable/of';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';


@Component({
  selector: 'table-basic-example',
  styleUrls: ['./table-basic-example.component.css'],
  templateUrl: './table-basic-example.component.html',
})
export class TableBasicExample implements OnInit{

  displayedColumns = ['name', 'calories', 'fat', 'protein', 'carbs'];
  dataSource = new MenuDataSource(this.menuService, this.location, this.route);
  currentResturantName : String;

  constructor(
    private menuService: MenuService, 
    private route: ActivatedRoute,
    private location: Location,
    private dataService:DataService
    ) { } 

    ngOnInit() {
      const id = +this.route.snapshot.paramMap.get('id');
      this.currentResturantName = this.dataService.getCurrentResturantName(id);      
    }

    goBack(): void {
      this.location.back();
    }


}

export class MenuDataSource extends DataSource<any> {
  constructor(
    private menuService: MenuService,
    private location: Location,
    private route: ActivatedRoute
    ) {
    super();
  }

  connect(): Observable<MenuItem[]> {
    const id = +this.route.snapshot.paramMap.get('id');
    return  this.menuService.getMenuItems(id);
  }
  disconnect() {}
}

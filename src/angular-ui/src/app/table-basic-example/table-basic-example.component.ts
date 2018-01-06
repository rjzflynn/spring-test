import { DataService } from '../services/data.service';
import {Component, ViewChild, OnInit,OnChanges,Input } from '@angular/core';
import {MatTableDataSource, MatSort, Sort} from '@angular/material';
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
  sort : Sort;
  currentResturantName : String;
  dataSource = new MenuDataSource(this.menuService, this.route, this.sort);

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

    sortData(sort: Sort){
      this.sort = sort;
      this.dataSource = new MenuDataSource(this.menuService, this.route, this.sort);
    }

    goBack(): void {
      this.location.back();
    }


}

export class MenuDataSource extends DataSource<any> {
  private data: MenuItem[];

  constructor(
    private menuService: MenuService,
    private route: ActivatedRoute,
    private sort: Sort
    ) {
    super();
  }

  updateData(newData: MenuItem[]) {
    this.data = newData;
  }

  connect(): Observable<MenuItem[]> {
    const id = +this.route.snapshot.paramMap.get('id');
    return  this.menuService.getMenuItems(id, this.sort);
  }

  disconnect() {}
}

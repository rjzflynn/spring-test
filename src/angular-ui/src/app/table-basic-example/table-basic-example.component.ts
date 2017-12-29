import {Component, ViewChild, OnInit } from '@angular/core';
import {MatTableDataSource, MatSort} from '@angular/material';
import { MenuService } from './../services/menu.service';
import {DataSource} from '@angular/cdk/collections';
import { Menu } from './../models/menu';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/observable/of';




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
  dataSource = new MenuDataSource(this.menuService);
  constructor(private menuService: MenuService) { } 
  ngOnInit() {
  }
}

export class MenuDataSource extends DataSource<any> {
  constructor(private menuService: MenuService) {
    super();
  }
  connect(): Observable<Menu.MenuItem[]> {
    return this.menuService.getMenuItems();
  }
  disconnect() {}
}

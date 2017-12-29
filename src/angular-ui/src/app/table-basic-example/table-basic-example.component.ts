import {Component, ViewChild} from '@angular/core';
import {MatTableDataSource, MatSort} from '@angular/material';

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
  dataSource = new MatTableDataSource<Element>(ELEMENT_DATA);

  @ViewChild(MatSort) sort: MatSort;

  /**
   * Set the sort after the view init since this component will
   * be able to query its view for the initialized sort.
   */
  ngAfterViewInit() {
    this.dataSource.sort = this.sort;
  }
}

export interface Element {
  name: string;
  calories: number;
  fat: number;
  protein: number;
  carbs: number;
}

const ELEMENT_DATA: Element[] = [
  { name: 'McChicken', calories: 200, fat: 50, protein: 40, carbs: 70 },
  { name: 'McDouble', calories: 300, fat: 60, protein: 60, carbs: 50},
  { name: 'Lobster Roll', calories: 400, fat: 70, protein: 30, carbs: 75},
  { name: 'Double Cheesburger', calories: 450, fat: 50, protein: 29, carbs: 42},
  { name: 'Big Mac', calories: 360, fat: 50, protein: 40, carbs: 80},
];

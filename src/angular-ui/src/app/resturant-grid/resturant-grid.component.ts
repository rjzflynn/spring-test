import { DataService } from '../services/data.service';
import { Component, OnInit } from '@angular/core';
import { MenuService } from './../services/menu.service';


@Component({
  selector: 'app-resturant-grid',
  templateUrl: './resturant-grid.component.html',
  styleUrls: ['./resturant-grid.component.css']
})
export class ResturantGridComponent implements OnInit {
  numOfColums;
  constructor(private dataService:DataService) {}	

  ngOnInit() {
    if (this.dataService.getWindowWidth() < 440){
      this.numOfColums = 2;
    } else {
      this.numOfColums = 3;
    }   
  }
}



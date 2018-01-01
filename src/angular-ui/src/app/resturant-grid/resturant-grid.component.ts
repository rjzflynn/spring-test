import { Component, OnInit } from '@angular/core';
import { DataService } from './../data.service';
import { MenuService } from './../services/menu.service';



@Component({
  selector: 'app-resturant-grid',
  templateUrl: './resturant-grid.component.html',
  styleUrls: ['./resturant-grid.component.css']
})
export class ResturantGridComponent {

	selectMenu(id: number): void {
	  this.dataService.changeMenu(id);
	}

	constructor(private dataService: DataService) { }	

}

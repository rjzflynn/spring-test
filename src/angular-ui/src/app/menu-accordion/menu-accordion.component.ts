import { ActivatedRoute } from '@angular/router';
import { DataService } from '../services/data.service';
import { Observable } from 'rxjs/Rx';
import { MenuService } from '../services/menu.service';
import { Component, OnInit } from '@angular/core';
import { DataSource } from '@angular/cdk/collections';
import { Location } from '@angular/common';


@Component({
  selector: 'app-menu-accordion',
  templateUrl: './menu-accordion.component.html',
  styleUrls: ['./menu-accordion.component.css']
})
export class MenuAccordionComponent implements OnInit {

  currentResturantName : String;
  catagories: String[];

  constructor(
    private menuService: MenuService,
    private dataService:DataService,
    private location: Location,
    private route: ActivatedRoute,
   ) { }

   onExpand(id: string){
    this.dataService.setCurrentMenuCatagory(id);
   }

  ngOnInit() {
    const id = +this.route.snapshot.paramMap.get('id'); 
    this.currentResturantName = this.dataService.getCurrentResturantName(id);     
    this.menuService.getMenuCatagories(id).subscribe((result) => { this.catagories = result; });
  }

  goBack(): void {
    this.location.back();
  }

}


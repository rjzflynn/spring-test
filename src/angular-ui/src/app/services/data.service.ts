import { Injectable } from '@angular/core';

@Injectable()
export class DataService {

  private winHeight: number;
  private winWidth: number;

  //TODO : get from routerLink (override click method)
  private menuMap : Map<Number,String> = new Map([[1,"McDonalds"],[2,"BurgerKing"],
  [3,"Subway"],[4,"KFC"]])

  constructor() {
    this.winHeight = window.screen.height;
    this.winWidth = window.screen.width;
   }

   getWindowWidth(){
    return this.winHeight;
   }

   getWindowHeight(){
    return this.winHeight;
   }

  getCurrentResturantName (menuId: number){
    return this.menuMap.get(menuId);
  }

  currentMenuCatagory: string;
  getCurrentMenuCatagory(){
    return this.currentMenuCatagory;
  }

  setCurrentMenuCatagory(menuCatagory){
    this.currentMenuCatagory = menuCatagory;
  }

}

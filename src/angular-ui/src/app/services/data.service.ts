import { Injectable } from '@angular/core';

@Injectable()
export class DataService {

  private winHeight: number;
  private winWidth: number;

  //TODO : get from routerLink (override click method)
  private menuMap : Map<Number,String> = new Map([[1,"McDonalds"],[2,"BurgerKing"],
  [3,"Subway"],[4,"KFC"]])

  constructor() {
    this.winHeight = Math.max(document.documentElement.clientWidth, window.innerWidth || 0);
    this.winWidth = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);
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

import { Injectable } from '@angular/core';

@Injectable()
export class DataService {

  constructor() { }

  //TODO : get from routerLink (override click method)
  private menuMap : Map<Number,String> = new Map([[1,"McDonalds"],[2,"BurgerKing"],
    [3,"Subway"],[4,"KFC"]])

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

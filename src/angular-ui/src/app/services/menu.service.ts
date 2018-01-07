import { Injectable } from '@angular/core';
import { HttpClient }   from '@angular/common/http';
import { Observable }   from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import { MenuItem } from '../models/menuitem';
import { Sort } from '@angular/material';



@Injectable()
export class MenuService {

  private serviceUrl = 'http://192.168.0.67:8080/';

  constructor(private http: HttpClient) { }

  getMenuItems(id: number, catagory: string, sort: Sort): Observable<MenuItem[]> {
    if(sort != null){
      return this.http.get<MenuItem[]>(this.serviceUrl +   "getMenu/" + id  + "/" + catagory +
        "?sort=" + sort.direction + "&by=" + sort.active);
    }
    return this.http.get<MenuItem[]>(this.serviceUrl +  "getMenu/" + id  + "/" + catagory);
  }

  getMenuCatagories(id: number): Observable<String[]> {
    return this.http.get<string[]>(this.serviceUrl + "/getMenuCatagories/" + id);
  }

}

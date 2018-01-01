import { Injectable } from '@angular/core';
import { HttpClient }   from '@angular/common/http';
import { Observable }   from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import { MenuItem } from '../models/menuitem';
import { DataService } from './../data.service';



@Injectable()
export class MenuService {

  private serviceUrl = 'http://localhost:8080/getMenu/';

  constructor(private http: HttpClient, private dataService: DataService) { }

  getMenuItems(id: number): Observable<MenuItem[]> {
    return this.http.get<MenuItem[]>(this.serviceUrl + id);
  }

}

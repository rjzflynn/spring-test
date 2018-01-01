import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs/BehaviorSubject';


@Injectable()
export class DataService {

private messageSource = new BehaviorSubject<number>();
currentMenu = this.messageSource.asObservable();

changeMenu(num: number) {
  this.messageSource.next(num)
}

  constructor() { }

}

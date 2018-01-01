import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ResturantGridComponent } from './resturant-grid.component';

describe('ResturantGridComponent', () => {
  let component: ResturantGridComponent;
  let fixture: ComponentFixture<ResturantGridComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ResturantGridComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ResturantGridComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuAccordionComponent } from './menu-accordion.component';

describe('MenuAccordionComponent', () => {
  let component: MenuAccordionComponent;
  let fixture: ComponentFixture<MenuAccordionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MenuAccordionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MenuAccordionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

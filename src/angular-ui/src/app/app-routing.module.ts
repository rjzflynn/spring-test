import { MenuAccordionComponent } from './menu-accordion/menu-accordion.component';
import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { ResturantGridComponent } from './resturant-grid/resturant-grid.component';
import { TableBasicExample } from './table-basic-example/table-basic-example.component';


const routes: Routes = [
  { path: 'resturants', component: ResturantGridComponent },
  { path: '', redirectTo: '/resturants', pathMatch: 'full' },
  { path: 'resturant/:id', component: MenuAccordionComponent }
 // { path: 'resturant/:id', component: TableBasicExample }

];
 
@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
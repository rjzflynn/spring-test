import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { TableBasicExample } from './table-basic-example/table-basic-example.component';


const routes: Routes = [
  { path: 'resturant/:id', component: TableBasicExample }
];
 
@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
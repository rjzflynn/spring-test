import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { TableBasicExample } from './table-basic-example/table-basic-example.component';
import {MatTableModule} from '@angular/material/table';
import { HttpClientModule } from '@angular/common/http';
import { MenuService } from './services/menu.service';
import { DataService } from './data.service';
import { ToolbarComponent } from './toolbar/toolbar.component';
import {MatToolbarModule,MatGridListModule} from '@angular/material';
import { ResturantGridComponent } from './resturant-grid/resturant-grid.component';
import { AppRoutingModule } from './/app-routing.module';






@NgModule({
  declarations: [
    AppComponent,
    TableBasicExample,
    ToolbarComponent,
    ResturantGridComponent
  ],
  imports: [
    BrowserModule,
    MatTableModule,
    MatToolbarModule,
    MatGridListModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [MenuService,DataService],
  bootstrap: [AppComponent]
})
export class AppModule { }

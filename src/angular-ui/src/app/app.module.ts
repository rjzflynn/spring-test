import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { TableBasicExample } from './table-basic-example/table-basic-example.component';
import {MatTableModule} from '@angular/material/table';
import { HttpClientModule } from '@angular/common/http';
import { MenuService } from './services/menu.service';




@NgModule({
  declarations: [
    AppComponent,
    TableBasicExample
  ],
  imports: [
    BrowserModule,
    MatTableModule,
    HttpClientModule
  ],
  providers: [MenuService],
  bootstrap: [AppComponent]
})
export class AppModule { }

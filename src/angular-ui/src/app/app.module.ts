import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { TableBasicExample } from './table-basic-example/table-basic-example.component';
import {MatTableModule} from '@angular/material/table';
import { HttpClientModule } from '@angular/common/http';
import { MenuService } from './services/menu.service';
import { ToolbarComponent } from './toolbar/toolbar.component';
import {MatToolbarModule} from '@angular/material';






@NgModule({
  declarations: [
    AppComponent,
    TableBasicExample,
    ToolbarComponent
  ],
  imports: [
    BrowserModule,
    MatTableModule,
    MatToolbarModule,
    HttpClientModule
  ],
  providers: [MenuService],
  bootstrap: [AppComponent]
})
export class AppModule { }

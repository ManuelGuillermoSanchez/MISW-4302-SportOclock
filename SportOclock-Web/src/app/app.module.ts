import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations'; // Importa BrowserAnimationsModule

import { MatSidenavModule } from '@angular/material/sidenav';
import { MatListModule } from '@angular/material/list';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';
import { MatToolbarModule } from '@angular/material/toolbar';

import { AppComponent } from './app.component';
import { RutinasComponent } from './rutinas/rutinas.component';
import { AppRoutingModule } from './app.routes';
import { MatDialogModule } from '@angular/material/dialog';
import { ConfirmDeleteComponent } from './confirm-delete/confirm-delete.component'; // Asegúrate de que la ruta sea correcta



@NgModule({
  declarations: [
    AppComponent,
    RutinasComponent,
    ConfirmDeleteComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,  // Asegúrate de agregarlo aquí
    MatSidenavModule,
    MatListModule,
    MatIconModule,
    MatButtonModule,
    MatToolbarModule,
    AppRoutingModule,
    MatDialogModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

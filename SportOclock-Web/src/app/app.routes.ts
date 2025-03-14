import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RutinasComponent } from './rutinas/rutinas.component';
import { CrearRutinaComponent } from './crear-rutina/crear-rutina.component';

const routes: Routes = [
  { path: '', redirectTo: '/rutinas', pathMatch: 'full' },
  { path: 'rutinas', component: RutinasComponent },
  { path: 'crear-rutina', component: CrearRutinaComponent }, 
  { path: 'historial', component: RutinasComponent },
  { path: 'ajustes', component: RutinasComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

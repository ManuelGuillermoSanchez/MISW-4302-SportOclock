import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RutinasComponent } from './rutinas/rutinas.component';

const routes: Routes = [
  { path: '', redirectTo: '/rutinas', pathMatch: 'full' },
  { path: 'rutinas', component: RutinasComponent },
  { path: 'historial', component: RutinasComponent },
  { path: 'ajustes', component: RutinasComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

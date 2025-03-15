import { Component } from '@angular/core';
import { Router } from '@angular/router';  // Importa el Router
import { MatDialog } from '@angular/material/dialog'; // Importa MatDialog
import { ConfirmDeleteComponent } from '../confirm-delete/confirm-delete.component';  // Importa ConfirmDeleteComponent

@Component({
  selector: 'app-crear-rutina',
  templateUrl: './crear-rutina.component.html',
  styleUrls: ['./crear-rutina.component.css']
})
export class CrearRutinaComponent {

  constructor(private router: Router, public dialog: MatDialog) {} // Inyectamos el router y MatDialog

  // Método para redirigir al usuario al AppComponent
  cancelar() {
    this.router.navigate(['/']);  // Redirige a la página principal (AppComponent)
  }

  // Método para redirigir al usuario al AppComponent después de crear
  crear() {
    // Aquí puedes agregar la lógica de crear rutina si es necesario
    this.router.navigate(['/']);  // Redirige a la página principal (AppComponent)
  }

// Método para abrir el modal
openDeleteDialog(): void {
  const dialogRef = this.dialog.open(ConfirmDeleteComponent);

  dialogRef.afterClosed().subscribe(result => {
    if (result === true) {
      // Lógica para eliminar el ejercicio si el usuario confirma
      console.log('Ejercicio eliminado');
      // Aquí puedes agregar el código real para eliminar el ejercicio
    } else {
      console.log('Eliminación cancelada');
    }
    });
  }
}

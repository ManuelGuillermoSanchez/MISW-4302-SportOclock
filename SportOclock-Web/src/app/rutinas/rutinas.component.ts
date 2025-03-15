import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ConfirmDeleteComponent } from '../confirm-delete/confirm-delete.component'; // Asegúrate de importar el modal

@Component({
  selector: 'app-rutinas',
  templateUrl: './rutinas.component.html',
  styleUrls: ['./rutinas.component.css']
})
export class RutinasComponent {

  constructor(public dialog: MatDialog) { }

  // Función que se llama al hacer clic en el botón eliminar
  openDeleteDialog(): void {
    const dialogRef = this.dialog.open(ConfirmDeleteComponent);

    dialogRef.afterClosed().subscribe(result => {
      if (result) {
        // Aquí deberías implementar la lógica para eliminar el registro
        console.log('Registro eliminado');
      } else {
        console.log('Eliminación cancelada');
      }
    });
  }
}

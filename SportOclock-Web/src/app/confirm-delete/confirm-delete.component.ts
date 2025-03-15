import { Component } from '@angular/core';
import { MatDialogRef } from '@angular/material/dialog';

@Component({
  selector: 'app-confirm-delete',
  templateUrl: './confirm-delete.component.html',
  styleUrls: ['./confirm-delete.component.css']
})
export class ConfirmDeleteComponent {
  constructor(public dialogRef: MatDialogRef<ConfirmDeleteComponent>) {}

  // Método para confirmar eliminación
  onConfirm(): void {
    console.log('Confirmado: eliminar ejercicio');
    this.dialogRef.close(true);  // Cierra el modal y devuelve "true"
  }

  // Método para cancelar
  onCancel(): void {
    console.log('Cancelado: no eliminar');
    this.dialogRef.close(false);  // Cierra el modal y devuelve "false"
  }
}

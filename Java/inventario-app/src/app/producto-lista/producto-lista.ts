import { Component, inject, OnInit } from '@angular/core';
import { Producto } from '../producto';
import { ProductoS } from '../producto-s';
import { Router } from '@angular/router';

@Component({
  selector: 'app-producto-lista',
  imports: [],
  templateUrl: './producto-lista.html',
})
export class ProductoLista{
  productos!: Producto[];

  private productoServicio = inject(ProductoS);
  private enrutador = inject(Router);

  ngOnInit(){
    this.obtenerProductos();
  }

  private obtenerProductos(): void {
    this.productoServicio.obtenerProductosLista().subscribe({
      next: (datos) => {
        this.productos = datos;
      },
      error: (error) => {
        console.error('Error al obtener los productos', error);
      }
    });
  }
  editarProducto(id: number){
    this.enrutador.navigate(['editar-producto', id]);
  }
  elliminarProducto(id: number){
    this.productoServicio.eliminarProducto(id).subscribe({
      next: (datos) => this.obtenerProductos(),
      error: (errores) => console.log(errores)
    })
  }
}
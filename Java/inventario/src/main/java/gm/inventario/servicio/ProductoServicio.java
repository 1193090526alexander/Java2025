package gm.inventario.servicio;

import gm.inventario.modelo.Producto;
import gm.inventario.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoServicio implements IProductoServicio{


    @Autowired
    private ProductoRepositorio productoRepositorio;
    @Override
    public List<Producto> listarProducto() {
        List<Producto> productos = this.productoRepositorio.findAll();
        return productos;
    }

    @Override
    public Producto findProductoById(Integer id) {
        Producto producto = this.productoRepositorio.findById(id).orElse(null);
        return producto;

    }

    @Override
    public Producto insertarProducto(Producto producto) {
         return this.productoRepositorio.save(producto);

    }

    @Override
    public void eliminarProducto(Producto producto) {
        this.productoRepositorio.delete(producto);
    }
}

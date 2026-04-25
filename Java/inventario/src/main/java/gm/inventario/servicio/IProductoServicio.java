package gm.inventario.servicio;

import gm.inventario.modelo.Producto;

import java.util.List;

public interface IProductoServicio {
    public List<Producto> listarProducto();

    public Producto findProductoById(Integer id);
    public Producto insertarProducto(Producto producto);
    public void eliminarProducto(Producto producto);
}

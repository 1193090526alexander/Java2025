package gm.inventario.controlador;


import gm.inventario.excepcion.RecursoNoEncontradoExcepcion;
import gm.inventario.modelo.Producto;
import gm.inventario.servicio.ProductoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("inventario-app") //localhost://808/inventario-app
@CrossOrigin(value = "http://localhost:4200") //puerto por dafault de Angular
public class ProductoControlador {

    private static final Logger logger = LoggerFactory.getLogger(ProductoControlador.class);

    @Autowired
    private ProductoServicio productoServicio;

    @GetMapping("/productos") //http://localhost:8080/inventario-app/productos
    public List<Producto> obtenerProductos(){
        List<Producto> productos = this.productoServicio.listarProducto();
        logger.debug("Obteniendo productos de la lista de productos");
        productos.forEach(producto -> logger.debug(producto.toString()));
        return productos;
    }

    @PostMapping("/productos")
    public Producto agregarProducto(@RequestBody Producto producto){
        return productoServicio.insertarProducto(producto);
    }

    @GetMapping("/productos/{id}")
    public ResponseEntity<Producto> obtenerProducto(@PathVariable Integer id){
        Producto producto = this.productoServicio.findProductoById(id);
        if(producto != null){
            return ResponseEntity.ok(producto);
        }else {
            throw new RecursoNoEncontradoExcepcion("No se encontro el id : " + id);
        }
    }

    @PutMapping("/productos/{id}")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable Integer id, @RequestBody Producto producto){
        Producto productoActual = this.productoServicio.findProductoById(id);
        if(productoActual != null){
            productoActual.setDescripcion(producto.getDescripcion());
            productoActual.setPrecio(producto.getPrecio());
            productoActual.setExistencia(producto.getExistencia());
            this.productoServicio.insertarProducto(productoActual);
            return ResponseEntity.ok(productoActual);
        }
        else {
            throw new RecursoNoEncontradoExcepcion("No se encontro el id : " + id);
        }
    }

    @DeleteMapping("/productos/{id}")
    public ResponseEntity<Map<String, Boolean>> eliminarProducto(@PathVariable Integer id){
        Producto producto = this.productoServicio.findProductoById(id);
        if(producto != null){
            this.productoServicio.eliminarProducto(producto);
            Map<String, Boolean> respuesta = new HashMap<>();
            respuesta.put("eliminado", true);
            return ResponseEntity.ok(respuesta);
        }
        else {
            throw new RecursoNoEncontradoExcepcion("No se encontro el id : " + id);
        }
    }

}

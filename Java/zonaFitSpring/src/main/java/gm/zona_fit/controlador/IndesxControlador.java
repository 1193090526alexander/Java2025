package gm.zona_fit.controlador;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.primefaces.PrimeFaces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.List;

@Named("indesxControlador")
@ViewScoped
public class IndesxControlador implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(IndesxControlador.class);

    @Inject
    private IClienteServicio clienteServicio;

    private Cliente clienteSeleccionado;
    private List<Cliente> clientes;

    @PostConstruct
    public void init() {
        cargarDatos();
    }

    public void cargarDatos() {
        this.clientes = this.clienteServicio.listarClientes();
        this.clientes.forEach(cliente -> logger.info(cliente.toString()));
    }

    public void agregarCliente() {
        this.clienteSeleccionado = new Cliente();
    }

    public void guardarCliente() {
        logger.info("cliente a guardar: {}", this.clienteSeleccionado);

        boolean esNuevo = this.clienteSeleccionado.getIdCliente() == null;
        this.clienteServicio.guardarCliente(this.clienteSeleccionado);

        if (esNuevo) {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO,
                            "Cliente guardado", "Cliente guardado exitosamente")
            );
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO,
                            "Cliente actualizado", "Cliente actualizado exitosamente")
            );
        }

        cargarDatos();

        PrimeFaces.current().executeScript("PF('ventanaModalCliente').hide()");
        PrimeFaces.current().ajax().update("forma-clientes:mensajes", "forma-clientes:clientes-tablas");

        this.clienteSeleccionado = null;
    }
    public  void eliminarCliente() {
        logger.info("cliente a eliminar:" + this.clienteSeleccionado);
        this.clienteServicio.borrarCliente(this.clienteSeleccionado);
        //Eliminar el registro de la lista cleintes
        this.clientes.remove(this.clienteSeleccionado);
        //reset del objeto de cliente selecionado
        this.clienteSeleccionado = null;
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente eliminado"));
        PrimeFaces.current().ajax().update("forma-clientes:mensajes", "forma-clientes:clientes-tablas");
    }

    public Cliente getClienteSeleccionado() {
        return clienteSeleccionado;
    }

    public void setClienteSeleccionado(Cliente clienteSeleccionado) {
        this.clienteSeleccionado = clienteSeleccionado;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
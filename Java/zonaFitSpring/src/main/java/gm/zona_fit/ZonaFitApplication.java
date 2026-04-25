package gm.zona_fit;


import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

//@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {

	@Autowired
	private  IClienteServicio clienteServicio;

	static String nl = System.lineSeparator();

	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);




    public static void main(String[] args) {
		logger.info("Iniciando ZonaFitApplication");
		//levantar la fabrica de spring
		SpringApplication.run(ZonaFitApplication.class, args);
		logger.info("Finalizasa aplicacion ZonaFitApplication");
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(nl + "*** Aplicacion ZonaFitApplication (GYM) ***");
		ZonaFitApp();
	}
	public void ZonaFitApp() {
		var salir = false;
		var consola = new Scanner(System.in);
		while (!salir) {
			var opcion = mostrarMenu(consola);
			salir = ejecutarOpciones(opcion, consola);
			logger.info(nl);
		}
	}

	private  int mostrarMenu(Scanner consola) {
		logger.info("""
              	1. Listar Clientes
                2. Buscar Cliente
                3. Agregar nuevo Cliente
                4. Actualizar nuevo Cliente
                5. Eliminar Cliente
                6. Salir
                Elige una opcion:\s""");
		//Leemos y retornamos la opcion selecionada
		return Integer.parseInt(consola.nextLine());
	}
	private boolean ejecutarOpciones(int menu, Scanner consola) {
		var salir = false;
		switch (menu){
			case 1 -> ListarClientes();
			case 2 -> BuscarCliente(consola);
			case 3 -> AgregarNuevoCliente(consola);
			case 4 -> ModificarCliente(consola);
			case 5 -> EliminarCLiente(consola);
			case 6 -> {
				System.out.println("Regresa pronto!!!");
				salir = true;
			}
			default -> System.out.println("Opcion Invalida" + menu);
		}
		return salir;
	}
	private void ListarClientes() {
		logger.info("*** Listando clientes ***");
		List<Cliente> clientes = clienteServicio.listarClientes();
		clientes.forEach(cliente -> logger.info(cliente.toString() + nl));
	}

	private void BuscarCliente(Scanner consola) {
		logger.info("*** Buscando cliente por id ***");
		var idCliente = Integer.parseInt(consola.nextLine());
		Cliente BuscarCliente = clienteServicio.buscarClientePorId(idCliente);
		if (BuscarCliente != null) {
			logger.info("Cliente encontrado" + BuscarCliente + nl);
		}
		else {
			logger.info("Cliente no encontrado" + idCliente + nl);
		}
	}
	private void AgregarNuevoCliente(Scanner consola) {
		logger.info("*** Agregando cliente ***");
		logger.info("Ingresa el nombre del cliente");
		var NombreCliente = consola.nextLine();
		logger.info("Ingresa el apellido del cliente");
		var ApellidoCliente = consola.nextLine();
		logger.info("Ingresa la membresia");
		var membresiCLiente = Integer.parseInt(consola.nextLine());
		var cliente = new Cliente();
		cliente.setNombre(NombreCliente);
		cliente.setApellido(ApellidoCliente);
		cliente.setMembresia(membresiCLiente);
		clienteServicio.guardarCliente(cliente);
	}

	private void ModificarCliente(Scanner consola) {
		logger.info("*** Modificando cliente ***");
		logger.info("Ingresa el id del cliente");
		var idCliente = Integer.parseInt(consola.nextLine());
		Cliente modificarCliente = clienteServicio.buscarClientePorId(idCliente);
		if (modificarCliente != null) {
			logger.info("Cliente encontrado" + modificarCliente + nl);
			logger.info("Modificando el nombre del cliente");
			var NombreCliente = consola.nextLine();
			logger.info("Modificando el apellido del cliente");
			var ApellidoCliente = consola.nextLine();
			logger.info("Modificando la membresia del cliente");
			var membresiCLiente = Integer.parseInt(consola.nextLine());

			modificarCliente.setNombre(NombreCliente);
			modificarCliente.setApellido(ApellidoCliente);
			modificarCliente.setMembresia(membresiCLiente);
			clienteServicio.guardarCliente(modificarCliente);
			logger.info("Cliente modificado" + modificarCliente + nl);
		}
		else  {
			logger.info("Cliente no encontrado" + idCliente + nl);
		}
	}
	private void EliminarCLiente(Scanner consola) {
		logger.info("*** Eliminar Cliente ***");
		logger.info("Ingresa el id del cliente");
		var idCliente = Integer.parseInt(consola.nextLine());
		var EliminarCliente = clienteServicio.buscarClientePorId(idCliente);
		if (EliminarCliente != null) {
			clienteServicio.borrarCliente(EliminarCliente);
			logger.info("Cliente eliminado" + EliminarCliente + nl);
		}
		else {
			logger.info("Cliente no encontrado" + idCliente + nl);
		}
	}

}

package com.proyectoinventario.inventario;

import com.proyectoinventario.inventario.entity.Categoria;
import com.proyectoinventario.inventario.entity.Envio;
import com.proyectoinventario.inventario.entity.Fabricante;
import com.proyectoinventario.inventario.entity.Producto;
import com.proyectoinventario.inventario.repository.*;
import com.proyectoinventario.inventario.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class InventarioApplication implements CommandLineRunner {

	private CategoriaRepository categoriaRepository;
	private CategoriaService categoriaService;
	private FabricanteRepository fabricanteRepository;
	private FabricanteService fabricanteService;
	private EnvioRepository envioRepository;
	private EnvioService envioService;
	private ProductoRepository productoRepository;
	private ProductoService productoService;

	public InventarioApplication(CategoriaRepository categoriaRepository, CategoriaService categoriaService, FabricanteRepository fabricanteRepository, FabricanteService fabricanteService, EnvioRepository envioRepository, EnvioService envioService, ProductoRepository productoRepository, ProductoService productoService) {
		this.categoriaRepository = categoriaRepository;
		this.categoriaService = categoriaService;
		this.fabricanteRepository = fabricanteRepository;
		this.fabricanteService = fabricanteService;
		this.envioRepository = envioRepository;
		this.envioService = envioService;
		this.productoRepository = productoRepository;
		this.productoService = productoService;
	}

	public static void main(String[] args) {
		SpringApplication.run(InventarioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		saveData();
	}

	public void saveData() {

		Categoria categoria1 = new Categoria(1L, "Tecnologia");
		Categoria categoria2 = new Categoria(2L, "Herreria");
		Categoria categoria3 = new Categoria(3L, "Automoviles");
		Categoria categoria4 = new Categoria(4L, "Carpinteria");
		Categoria categoria5 = new Categoria(5L, "Limpieza");
		Categoria categoria6 = new Categoria(6L, "Comestibles");

		Fabricante fabricante1 = new Fabricante(1L, "Asus");
		Fabricante fabricante2 = new Fabricante(2L, "HP");
		Fabricante fabricante3 = new Fabricante(3L, "Goldex");
		Fabricante fabricante4 = new Fabricante(4L, "Inco");
		Fabricante fabricante5 = new Fabricante(5L, "Ayala");
		Fabricante fabricante6 = new Fabricante(6L, "Acme");
		Fabricante fabricante7 = new Fabricante(7L, "Jane");
		Fabricante fabricante8 = new Fabricante(8L, "Cololo");
		Fabricante fabricante9 = new Fabricante(9L, "Avanti");
		Fabricante fabricante10 = new Fabricante(10L, "El Trigal");

		Envio envio1 = new Envio(1L, "Retira");
		Envio envio2 = new Envio(2L, "Reparto");
		Envio envio3 = new Envio(3L, "Agencia de Encomienda");

		Producto p1 = new Producto(null, "Laptop Asus TUF Gaming", 10, 5, 21500.60, categoria1, fabricante1, envio3);
		Producto p2 = new Producto(null, "Lata de arvejas", 15, 100, 48.90, categoria6, fabricante8, envio1);
		Producto p3 = new Producto(null, "Lata de choclo", 60, 100, 48.90, categoria6, fabricante8, envio1);
		Producto p4 = new Producto(null, "Soldadora industrial", 30, 10, 15600, categoria2, fabricante3, envio1);
		Producto p5 = new Producto(null, "Laptop Asus Rog Strix", 10, 5, 32100.80, categoria1, fabricante1, envio3);
		Producto p6 = new Producto(null, "Soldadora berreta", 88, 10, 3200.80, categoria2, fabricante6, envio1);
		Producto p7 = new Producto(null, "Masa Frolla", 44, 10, 99.90, categoria6, fabricante9, envio1);
		Producto p8 = new Producto(null, "Granola", 20, 10, 49, categoria6, fabricante10, envio1);
		Producto p9 = new Producto(null, "Repuestos motor", 239, 300, 5000.40, categoria3, fabricante5, envio2);
		Producto p10 = new Producto(null, "Laptop HP Celeron", 30, 10, 9500.90, categoria1, fabricante2, envio3);
		Producto p11 = new Producto(null, "Soldadora domestica", 80, 10, 9000.50, categoria2, fabricante4, envio1);
		Producto p12 = new Producto(null, "Clavos", 92000, 50000, 99.99, categoria4, fabricante6, envio1);
		Producto p13 = new Producto(null, "Martillo", 630, 100, 379.90, categoria4, fabricante6, envio1);
		Producto p14 = new Producto(null, "Cloro", 274, 100, 199.90, categoria5, fabricante7, envio1);
		Producto p15 = new Producto(null, "Tablones de segunda", 517, 200, 399.90, categoria4, fabricante6, envio2);
		Producto p16 = new Producto(null, "Perfumol", 453, 100, 199.90, categoria5, fabricante7, envio1);
		Producto p17 = new Producto(null, "Repasadores", 30, 50, 79.90, categoria5, fabricante6, envio1);
		Producto p18 = new Producto(null, "Tapas de empanadas", 30, 10, 70.90, categoria6, fabricante9, envio1);
		Producto p19 = new Producto(null, "Cereales", 23, 10, 39.99, categoria6, fabricante10, envio2);

		List<Categoria> listaCategoria = Arrays.asList(categoria1, categoria2, categoria3, categoria4, categoria5, categoria6);
		listaCategoria.stream().forEach(categoriaRepository::save);

		List<Fabricante> listaFabricante = Arrays.asList(fabricante1, fabricante2, fabricante3, fabricante4, fabricante5, fabricante6, fabricante7, fabricante8, fabricante9, fabricante10);
		listaFabricante.stream().forEach(fabricanteRepository::save);

		List<Envio> listaEnvio = Arrays.asList(envio1, envio2, envio3);
		listaEnvio.stream().forEach((envioRepository::save));

		List<Producto> listaProducto = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19);
		listaProducto.stream().forEach(productoRepository::save);

	}

}

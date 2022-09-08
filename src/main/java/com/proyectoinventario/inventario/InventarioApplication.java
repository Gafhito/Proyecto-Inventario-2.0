package com.proyectoinventario.inventario;

import com.proyectoinventario.inventario.entity.Categoria;
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
	private ProductoRepository productoRepository;
	private ProductoService productoService;

	public InventarioApplication(CategoriaRepository categoriaRepository, CategoriaService categoriaService, FabricanteRepository fabricanteRepository, FabricanteService fabricanteService, ProductoRepository productoRepository, ProductoService productoService) {
		this.categoriaRepository = categoriaRepository;
		this.categoriaService = categoriaService;
		this.fabricanteRepository = fabricanteRepository;
		this.fabricanteService = fabricanteService;
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

		Producto producto1 = new Producto(1L, "Laptop Asus TUF Gaming", 10, 5, 21500.60, categoria1, fabricante1);
		Producto producto2 = new Producto(2L, "Laptop Asus Rog Strix", 10, 5, 32100.80, categoria1, fabricante1);
		Producto producto3 = new Producto(3L, "Laptop HP Celeron", 30, 10, 9500.90, categoria1, fabricante2);

		List<Categoria> listaCategoria = Arrays.asList(categoria1, categoria2, categoria3, categoria4, categoria5, categoria6);
		listaCategoria.stream().forEach(categoriaRepository::save);

		List<Fabricante> listaFabricante = Arrays.asList(fabricante1, fabricante2, fabricante3, fabricante4, fabricante5, fabricante6, fabricante7, fabricante8, fabricante9, fabricante10);
		listaFabricante.stream().forEach(fabricanteRepository::save);

		List<Producto> listaProducto = Arrays.asList(producto1, producto2, producto3);
		listaProducto.stream().forEach(productoRepository::save);

	}

}

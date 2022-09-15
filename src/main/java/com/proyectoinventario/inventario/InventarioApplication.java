package com.proyectoinventario.inventario;

import com.proyectoinventario.inventario.repository.*;
import com.proyectoinventario.inventario.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventarioApplication {

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

}

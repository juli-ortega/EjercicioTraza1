package org.example;

import org.example.entidades.*;
import org.example.repositorio.InMemoryRepository;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        InMemoryRepository<ArticuloManufacturado> repoArticulosManufacturados = new InMemoryRepository<>();
        InMemoryRepository<ArticuloInsumo> repoArticulosInsumos = new InMemoryRepository<>();
        InMemoryRepository<ArticuloManufacturadoDetalle> repoArticulosManufacturadosDetalles = new InMemoryRepository<>();
        InMemoryRepository<Categoria> repocategorias = new InMemoryRepository<>();
        InMemoryRepository<Imagen> repoImagenes = new InMemoryRepository<>();
        InMemoryRepository<UnidadMedida> repoUnidadesMedida = new InMemoryRepository<>();
        //creo las categorias
        Categoria lomos = Categoria.builder()
                .denominacion("lomos")
                .build();
        Categoria pizzas = Categoria.builder()
                .denominacion("pizzas")
                .build();
        Categoria insumos = Categoria.builder()
                .denominacion("insumos")
                .build();
        Categoria sandwiches = Categoria.builder()
                .denominacion("sandwiches")
                .build();
        repocategorias.save(sandwiches);

        //creo las unidades de medida
        UnidadMedida kilogramos = UnidadMedida.builder()
                .denominacion("kilogramos")
                .build();
        repoUnidadesMedida.save(kilogramos);
        UnidadMedida gramos = UnidadMedida.builder()
                .denominacion("gramos")
                .build();
        repoUnidadesMedida.save(gramos);
        UnidadMedida litros = UnidadMedida.builder()
                .denominacion("litros")
                .build();
        repoUnidadesMedida.save(litros);

        //creo los articulos de insumo
        ArticuloInsumo sal = ArticuloInsumo.builder()
                .stockMaximo(100)
                .stockActual(30)
                .esParaElaborar(true)
                .precioCompra(10.0)
                .denominacion("sal")
                .medida(gramos)
                .precioVenta((double) 0)
                .build();
        repoArticulosInsumos.save(sal);
        ArticuloInsumo aceite = ArticuloInsumo.builder()
                .stockMaximo(50)
                .stockActual(20)
                .esParaElaborar(true)
                .precioCompra(50.0)
                .denominacion("aceite")
                .medida(litros)
                .precioVenta((double) 0)
                .build();
        repoArticulosInsumos.save(aceite);
        ArticuloInsumo carne = ArticuloInsumo.builder()
                .stockMaximo(200)
                .stockActual(80)
                .esParaElaborar(true)
                .precioCompra(100.0)
                .denominacion("carne")
                .medida(kilogramos)
                .precioVenta((double) 0)
                .build();
        repoArticulosInsumos.save(carne);
        ArticuloInsumo harina = ArticuloInsumo.builder()
                .stockMaximo(150)
                .stockActual(60)
                .esParaElaborar(true)
                .precioCompra(30.0)
                .denominacion("harina")
                .medida(gramos)
                .precioVenta((double) 0)
                .build();
        repoArticulosInsumos.save(harina);

        //creo las imagenes
        Imagen imagen1 = Imagen.builder()
                .denominacion("hawaianaPizza1")
                .build();
        repoImagenes.save(imagen1);
        Imagen imagen2 = Imagen.builder()
                .denominacion("hawaianaPizza2")
                .build();
        repoImagenes.save(imagen2);
        Imagen imagen3 = Imagen.builder()
                .denominacion("hawaianaPizza3")
                .build();
        repoImagenes.save(imagen3);
        Imagen imagen4 = Imagen.builder()
                .denominacion("LomoCompletoLomo1")
                .build();
        repoImagenes.save(imagen4);
        Imagen imagen5 = Imagen.builder()
                .denominacion("LomoCompletoLomo2")
                .build();
        repoImagenes.save(imagen5);
        Imagen imagen6 = Imagen.builder()
                .denominacion("LomoCompletoLomo3")
                .build();
        repoImagenes.save(imagen6);

        //creo los detalles
        ArticuloManufacturadoDetalle detallePizzaHawaina1 = ArticuloManufacturadoDetalle.builder()
                .cantidad(1)
                .insumo(sal)
                .build();
        repoArticulosManufacturadosDetalles.save(detallePizzaHawaina1);
        ArticuloManufacturadoDetalle detallePizzaHawaina2 = ArticuloManufacturadoDetalle.builder()
                .cantidad(2)
                .insumo(harina)
                .build();
        repoArticulosManufacturadosDetalles.save(detallePizzaHawaina2);
        ArticuloManufacturadoDetalle detallePizzaHawaina3 = ArticuloManufacturadoDetalle.builder()
                .cantidad(1)
                .insumo(aceite)
                .build();
        repoArticulosManufacturadosDetalles.save(detallePizzaHawaina3);
        ArticuloManufacturadoDetalle detalleLomoCompleto1 = ArticuloManufacturadoDetalle.builder()
                .cantidad(1)
                .insumo(sal)
                .build();
        repoArticulosManufacturadosDetalles.save(detalleLomoCompleto1);
        ArticuloManufacturadoDetalle detalleLomoCompleto2 = ArticuloManufacturadoDetalle.builder()
                .cantidad(1)
                .insumo(aceite)
                .build();
        repoArticulosManufacturadosDetalles.save(detalleLomoCompleto2);
        ArticuloManufacturadoDetalle detalleLomoCompleto3 = ArticuloManufacturadoDetalle.builder()
                .cantidad(1)
                .insumo(carne)
                .build();
        repoArticulosManufacturadosDetalles.save(detalleLomoCompleto3);

        //creo los articulos manufacturados
        ArticuloManufacturado pizzaHawaiana = ArticuloManufacturado.builder()
                .denominacion("Pizza Hawaiana")
                .descripcion("Pizza con piña y jamón")
                .tiempoElaboracion(30)
                .preparacion("Preparar la masa, agregar salsa, queso, piña y jamón.")
                .precioVenta(250.0)
                .imagenes(new HashSet<>(Arrays.asList(imagen1, imagen2, imagen3)))
                .detalles(new HashSet<>(Arrays.asList(detallePizzaHawaina1, detallePizzaHawaina2, detallePizzaHawaina3)))
                .build();
        repoArticulosManufacturados.save(pizzaHawaiana);
        ArticuloManufacturado lomoCompleto = ArticuloManufacturado.builder()
                .denominacion("Lomo Completo")
                .descripcion("Lomo completo con acompañamientos")
                .tiempoElaboracion(60)
                .preparacion("Cocinar el lomo, agregar los acompañamientos y servir.")
                .precioVenta(500.0)
                .imagenes(new HashSet<>(Arrays.asList(imagen4, imagen5, imagen6)))
                .detalles(new HashSet<>(Arrays.asList(detalleLomoCompleto1, detalleLomoCompleto2, detalleLomoCompleto3)))
                .build();
        repoArticulosManufacturados.save(lomoCompleto);

        //guardo las categorias con sus articulos
        lomos.setArticulos(new HashSet<>(Arrays.asList(lomoCompleto)));
        repocategorias.save(lomos);
        insumos.setArticulos(new HashSet<>(Arrays.asList(sal, carne, harina, aceite)));
        repocategorias.save(insumos);
        pizzas.setArticulos(new HashSet<>(Arrays.asList(pizzaHawaiana)));
        repocategorias.save(pizzas);

        System.out.println("----------------------------------");
        //muestro todas las categorias
        System.out.println(repocategorias.findAll());

        //muestro todos los articulos insumos
        List<ArticuloInsumo> insumosLista = repoArticulosInsumos.findAll();
        for (ArticuloInsumo art : insumosLista) {
            System.out.println(art);
        }

        //muestro todos los articulos manufacturados
        List<ArticuloManufacturado> manufacturadosLista = repoArticulosManufacturados.findAll();
        for (ArticuloManufacturado art : manufacturadosLista) {
            System.out.println(art);
        }

        //buscar articulo manufacturado 2 por id
        Optional<ArticuloManufacturado> articuloBuscado = repoArticulosManufacturados.findById(2L);
        articuloBuscado.ifPresentOrElse(
                articulo -> {System.out.println("articulo manufacturado id 2: "+articulo);},
                () -> System.out.println("No se encontró el articulo con ID 2")
        );

        //actualizo el articulo manufacturado id 1
        Optional<ArticuloManufacturado> articuloBuscado1 = repoArticulosManufacturados.findById(1L);

        articuloBuscado1.ifPresentOrElse(
                articulo -> {
                    // Actualizar el precio
                    articulo.setPrecioVenta(300.0);
                    repoArticulosManufacturados.genericUpdate(1L, articulo);
                    System.out.println("Artículo manufacturado actualizado: " + articulo);
                },
                () -> System.out.println("No se encontró el artículo manufacturado con ID 1")
        );


        //elimino el articulo manufacturado id 2
        Optional<ArticuloManufacturado> articuloEliminado = repoArticulosManufacturados.genericDelete(2L);
        if (articuloEliminado.isPresent()) {
            System.out.println("Artículo manufacturado eliminado: " + articuloEliminado.get().getDenominacion());
        } else {
            System.out.println("No se encontró el artículo manufacturado con ID 2 para eliminar");
        }

    }
}
package org.example.entidades;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@Getter
@Setter
public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private Integer tiempoElaboracion;
    private String preparacion;
    private HashSet<ArticuloManufacturadoDetalle>detalles= new HashSet<>();



}

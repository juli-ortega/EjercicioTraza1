package org.example.entidades;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Articulo {
    protected Long id;
    protected String denominacion;
    protected Double precioVenta;
    protected UnidadMedida medida;
    @Builder.Default
    protected HashSet<Imagen> imagenes=new HashSet<>();

}

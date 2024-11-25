package org.example.entidades;

import lombok.*;

import java.util.HashSet;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Categoria {
    private Long id;
    private String denominacion;
    @Builder.Default
    private HashSet<Articulo>articulos = new HashSet<>();


}

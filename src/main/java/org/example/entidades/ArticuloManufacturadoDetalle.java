package org.example.entidades;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class ArticuloManufacturadoDetalle {
    private Long id;
    private Integer cantidad;
    private ArticuloInsumo insumo;

}

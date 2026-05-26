package co.edu.asys.autotat.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "Producto")
@Getter
@Setter
@NoArgsConstructor
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private BigDecimal precio;

    @Column(name = "activo")
    private boolean activo;
}
package co.edu.asys.autotat.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Bodega")
@Getter
@Setter
@NoArgsConstructor
public class BodegaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bodega")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "ciudad")
    private String ciudad;
}
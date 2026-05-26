package co.edu.asys.autotat.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Usuario")
@Getter
@Setter
@NoArgsConstructor
public class TenderoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion")
    private String direccion;

    @OneToMany(mappedBy = "", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Entity> departamento = new ArrayList<Entity>();
}

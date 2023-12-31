package br.demo.backend.model.properties;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_limited")
@Inheritance(strategy = InheritanceType.JOINED)
public class Limited extends Property {
    private Integer maximum;
}

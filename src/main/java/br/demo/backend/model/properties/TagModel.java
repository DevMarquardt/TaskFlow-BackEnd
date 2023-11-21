package br.demo.backend.model.properties;

import br.demo.backend.model.OptionModel;
import br.demo.backend.model.PropertyModel;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_tag")
public class TagModel extends PropertyModel {
    @ManyToMany
    private Collection<OptionModel> options;
    @ManyToMany
    private Collection<OptionModel> values;
}

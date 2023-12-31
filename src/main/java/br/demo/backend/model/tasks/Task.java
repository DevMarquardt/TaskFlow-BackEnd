package br.demo.backend.model.tasks;


import br.demo.backend.model.chat.Message;
import br.demo.backend.model.properties.relations.Multivalued;
import br.demo.backend.model.properties.relations.Univalued;
import br.demo.backend.model.properties.relations.UserValue;
import br.demo.backend.model.relations.TaskPage;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@Table(name = "tb_task")
@NoArgsConstructor

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "task", cascade = CascadeType.MERGE)
    private Collection<Multivalued> multiProperties;
    @OneToMany(mappedBy = "task", cascade = CascadeType.MERGE)
    private Collection<Univalued> uniProperties;
    @OneToMany(mappedBy = "task", cascade = CascadeType.MERGE)
    private Collection<UserValue> userProperties;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private Collection<TaskPage> pages;

    private Boolean deleted;
    @OneToMany(cascade = CascadeType.ALL)
    Collection<Log> logs;
    @OneToMany(cascade = CascadeType.ALL)
    Collection<Message> comments;



}

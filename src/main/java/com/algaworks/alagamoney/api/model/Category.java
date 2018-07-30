package com.algaworks.alagamoney.api.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "categoria")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Long code;
    @Column(name = "nome")
    private String name;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (!code.equals(category.code)) return false;
        return name != null ? name.equals(category.name) : category.name == null;
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}

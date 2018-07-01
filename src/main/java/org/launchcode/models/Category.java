package org.launchcode.models;


import org.launchcode.models.Cheese;

import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import javax.persistence.Entity;
import java.util.List;
import javax.persistence.Id;
    /**
     * Created by LaunchCode
     */
    @Entity
    public class Category {

        @Id
        @GeneratedValue
        private int id;

        @NotNull
        @Size(min=3, max=15)
        private String name;

        @OneToMany
        @JoinColumn(name = "category_id")
        private List<Cheese> cheeses = new ArrayList<>();

        public Category() {}

        public Category(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Cheese> getCheeses() {
            return cheeses;
        }
    }


package com.hinako.learn.kotoba;

import jakarta.persistence.*;

@Entity
public class Tango {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="tango_id")
    private Long id;

    @Column(name="tango_kana")
    private String kana;

    public Tango() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKana() {
        return kana;
    }

    public void setKana(String kana) {
        this.kana = kana;
    }
}
package com.hinako.learn.kotoba.po;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "t_tango")
public class Tango implements Serializable {
    @Serial
    private static final long serialVersionUID = -2760660092977787328L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="tango_id")
    private Long id;

    @Column(name="word")
    private String word;

    @Column(name="kana")
    private String kana;

    @Column(name="kana_tone")
    private Integer kanaTone; // allow `-1` meaning no tone yet

    @Column(name="type_info")
    private String typeInfo;

    @Column(name="meaning")
    private String meaning;

    @Column(name="unit_name")
    private String unitName;

    @Column(name="update_time")
    private Timestamp updateTime;

    public Tango() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getKana() {
        return kana;
    }

    public void setKana(String kana) {
        this.kana = kana;
    }

    public Integer getKanaTone() {
        return kanaTone;
    }

    public void setKanaTone(Integer kanaTone) {
        this.kanaTone = kanaTone;
    }

    public String getTypeInfo() {
        return typeInfo;
    }

    public void setTypeInfo(String typeInfo) {
        this.typeInfo = typeInfo;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
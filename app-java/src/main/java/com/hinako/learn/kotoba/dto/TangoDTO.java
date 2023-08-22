package com.hinako.learn.kotoba.dto;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;

public class TangoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -5100685345428416542L;
    private Long id;

    private String word;

    private String kana;

    private String typeInfo;

    private String meaning;

    private String unitName;

    private String updateTime;

    public TangoDTO() {
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

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}

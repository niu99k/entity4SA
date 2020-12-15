package com.gg.entity;

import java.util.Map;

public class Machine {
    private Integer id;
    private Map<Integer, Double> takt;

    @Override
    public String toString() {
        return "Machine{" +
                "id=" + id +
                ", takt=" + takt +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Map<Integer, Double> getTakt() {
        return takt;
    }

    public void setTakt(Map<Integer, Double> takt) {
        this.takt = takt;
    }
}

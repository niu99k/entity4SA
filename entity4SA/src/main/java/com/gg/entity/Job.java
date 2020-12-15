package com.gg.entity;

import java.util.List;

public class Job {
    private Integer id;
    private List<Job> precPre;
    private List<Job> precNext;
    private Long deadLine;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Job> getPrecPre() {
        return precPre;
    }

    public void setPrecPre(List<Job> precPre) {
        this.precPre = precPre;
    }

    public List<Job> getPrecNext() {
        return precNext;
    }

    public void setPrecNext(List<Job> precNext) {
        this.precNext = precNext;
    }
}

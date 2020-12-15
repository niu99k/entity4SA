package com.gg.entity;

import java.util.List;
import java.util.stream.Collectors;

public class Job {
    private Integer id;
    private List<Job> precPre;
    private List<Job> precNext;
    private Long deadLine;

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", precPre=" + precPre.stream().map(job -> job.getId()).collect(Collectors.toList()) +
                ", precNext=" + precNext.stream().map(job -> job.getId()).collect(Collectors.toList()) +
                ", deadLine=" + deadLine +
                '}';
    }

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

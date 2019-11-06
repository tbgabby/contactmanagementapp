package com.travelbetacontact.contactmanagementapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sbjs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private String source;

    private String medium;

    private String campaign;

    private String content;

    private String term;

    public Sbjs() {}

    public Sbjs(String type, String source, String medium, String cmp, String cnt, String trm) {
        this.type = type;
        this.source = source;
        this.medium = medium;
        this.campaign = cmp;
        this.content = cnt;
        this.term = trm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getCampaign() {
        return campaign;
    }

    public void setCampaign(String cmp) {
        this.campaign = cmp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String cnt) {
        this.content = cnt;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String trm) {
        this.term = trm;
    }
}

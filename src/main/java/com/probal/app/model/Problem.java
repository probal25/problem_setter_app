package com.probal.app.model;

import javax.persistence.*;

@Entity
@Table(name = "problem_tbl")
public class Problem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "problem_id")
    private Long problemId;

    @Column(name = "problem_title")
    private String problemTitle;

    @Column(name = "problem_body")
    @Lob
    private String problemBody;

    @ManyToOne
    @JoinColumn(name = "problem_cat_id")
    private Category categoryId;


    public Problem(String problemTitle, String problemBody, Category categoryId) {
        this.problemTitle = problemTitle;
        this.problemBody = problemBody;
        this.categoryId = categoryId;
    }

    public Problem() {
    }

    public Long getProblemId() {
        return problemId;
    }

    public void setProblemId(Long problemId) {
        this.problemId = problemId;
    }

    public String getProblemTitle() {
        return problemTitle;
    }

    public void setProblemTitle(String problemTitle) {
        this.problemTitle = problemTitle;
    }

    public String getProblemBody() {
        return problemBody;
    }

    public void setProblemBody(String problemBody) {
        this.problemBody = problemBody;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }
}

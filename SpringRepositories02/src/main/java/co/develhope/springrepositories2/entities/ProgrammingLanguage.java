package co.develhope.springrepositories2.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="programming_language_tab")
public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_programming_language")
    private long id;

    @Column(nullable=false)
    private String name;


    private LocalDate year;

    @Column(nullable = false)
    private String inventor;

    /**
     * No args constructor
     */
    public ProgrammingLanguage() {
    }

    /**
     * All args constructor
     * @param name
     * @param year
     * @param inventor
     */
    public ProgrammingLanguage(String name, LocalDate year, String inventor) {
        this.name = name;
        this.year = year;
        this.inventor = inventor;
    }

    //GETTER AND SETTER
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}
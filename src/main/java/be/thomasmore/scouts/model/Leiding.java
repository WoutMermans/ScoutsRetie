package be.thomasmore.scouts.model;

import javax.persistence.*;


@Entity
public class Leiding {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "leiding_generator")
    @SequenceGenerator(name = "leiding_generator", sequenceName = "leiding_seq", allocationSize = 1)
    @Id
    private int id;
    private String leiderName;
    private int leiderLeeftijd;
    @Column(length = 1000)
    private String leiderBio;

    public Leiding(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLeiderName() {
        return leiderName;
    }

    public void setLeiderName(String leiderName) {
        this.leiderName = leiderName;
    }

    public int getLeiderLeeftijd() {
        return leiderLeeftijd;
    }

    public void setLeiderLeeftijd(int leiderLeeftijd) {
        this.leiderLeeftijd = leiderLeeftijd;
    }

    public String getLeiderBio() {
        return leiderBio;
    }

    public void setLeiderBio(String leiderBio) {
        this.leiderBio = leiderBio;
    }
}

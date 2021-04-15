package be.thomasmore.scouts.model;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Collection;


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
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Tak> takken;

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

    public Collection<Tak> getTakken() {
        return takken;
    }

    public void setTakken(Collection<Tak> takken) {
        this.takken = takken;
    }
}

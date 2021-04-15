package be.thomasmore.scouts.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Tak {
    @Id
    private int Id;
    private String takName;
    private String takLeeftijd;
    @Column(length = 1000)
    private String takInfo;
    @ManyToMany(mappedBy = "takken", fetch = FetchType.LAZY)
    private Collection<Kamp> kampen;

    public Tak() {

    }

    public String getTakName() {
        return takName;
    }

    public void setTakName(String takName) {
        this.takName = takName;
    }

    public String getTakLeeftijd() {
        return takLeeftijd;
    }

    public void setTakLeeftijd(String takLeeftijd) {
        this.takLeeftijd = takLeeftijd;
    }

    public String getTakInfo() {
        return takInfo;
    }

    public void setTakInfo(String takInfo) {
        this.takInfo = takInfo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Collection<Kamp> getKampen() {
        return kampen;
    }

    public void setKampen(Collection<Kamp> kampen) {
        this.kampen = kampen;
    }
}

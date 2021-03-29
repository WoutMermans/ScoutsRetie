package be.thomasmore.scouts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tak {
    @Id
    private int Id;
    private String takName;
    private String takLeeftijd;
    @Column(length = 1000)
    private String takInfo;

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
}

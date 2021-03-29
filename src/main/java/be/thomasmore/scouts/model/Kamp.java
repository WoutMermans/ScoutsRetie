package be.thomasmore.scouts.model;
import javax.persistence.*;
import java.util.Date;


@Entity
public class Kamp {
    @Id
    private int id;
    private String kampNaam;
    @Column(length = 1000)
    private String kampInfo;
    private String kampLocatie;
    @Temporal(TemporalType.DATE)
    private Date kampBeginDatum;
    @Temporal(TemporalType.DATE)
    private Date kampEindDatum;


    public Kamp(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKampNaam() {
        return kampNaam;
    }

    public void setKampNaam(String kampNaam) {
        this.kampNaam = kampNaam;
    }

    public String getKampInfo() {
        return kampInfo;
    }

    public void setKampInfo(String kampInfo) {
        this.kampInfo = kampInfo;
    }

    public String getKampLocatie() {
        return kampLocatie;
    }

    public void setKampLocatie(String kampLocatie) {
        this.kampLocatie = kampLocatie;
    }

    public Date getKampBeginDatum() {
        return kampBeginDatum;
    }

    public void setKampBeginDatum(Date kampBeginDatum) {
        this.kampBeginDatum = kampBeginDatum;
    }

    public Date getKampEindDatum() {
        return kampEindDatum;
    }

    public void setKampEindDatum(Date kampEindDatum) {
        this.kampEindDatum = kampEindDatum;
    }
}

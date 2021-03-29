package be.thomasmore.scouts.model;
import javax.persistence.*;
import java.util.Date;


@Entity
public class Kamp {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kamp_generator")
    @SequenceGenerator(name = "kamp_generator", sequenceName = "kamp_seq", allocationSize = 1)
    @Id
    private int id;
    @Column(length = 1000)
    private String kampInfo;
    private String kampLabel;
    private String kampLocatie;
    private String kampDatum;


    public Kamp(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getKampDatum() {
        return kampDatum;
    }

    public void setKampDatum(String kampDatum) {
        this.kampDatum = kampDatum;
    }

    public String getKampLabel() {
        return kampLabel;
    }

    public void setKampLabel(String kampLabel) {
        this.kampLabel = kampLabel;
    }
}

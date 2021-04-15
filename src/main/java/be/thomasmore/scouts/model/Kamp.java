package be.thomasmore.scouts.model;
import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Collection;
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
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date kampBeginDatum;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date kampEindDatum;
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Tak> takken;


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

    public String getKampLabel() {
        return kampLabel;
    }

    public void setKampLabel(String kampLabel) {
        this.kampLabel = kampLabel;
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

    public Collection<Tak> getTakken() {
        return takken;
    }

    public void setAnimals(Collection<Tak> takken) {
        this.takken = takken;
    }
}

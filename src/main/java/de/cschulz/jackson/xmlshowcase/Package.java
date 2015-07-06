package de.cschulz.jackson.xmlshowcase;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Package implements Comparable<Package> {

    @NotNull
    @AttributeOverride(name = "value", column = @Column(name = "NUMBER", unique = true))
    private PackageNumber number;

    protected Package() {
        // for JPA
    }

    public PackageNumber getNumber() {
        return number;
    }

    protected void assignPackageNumber(PackageNumber number) {
        this.number = number;
    }

    public int compareTo(Package o) {
        return 0;
    }
}

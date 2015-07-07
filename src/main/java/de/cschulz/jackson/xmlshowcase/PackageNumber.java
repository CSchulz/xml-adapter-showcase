package de.cschulz.jackson.xmlshowcase;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@Embeddable
@XmlJavaTypeAdapter(PackageNumber.Adapter.class)
public class PackageNumber extends AbstractValueObject<Integer> {

    protected PackageNumber() {
        // for jpa
    }

    public PackageNumber(Integer value) {
        super(value);

    }

    public PackageNumber(String value) {
        super(Integer.valueOf(value));

    }

    public static class Adapter extends XmlAdapter<Integer, PackageNumber> {
        @Override
        public PackageNumber unmarshal(Integer v) throws Exception {
            return new PackageNumber(v);
        }

        @Override
        public Integer marshal(PackageNumber v) throws Exception {
            return v.getValue();
        }
    }
}
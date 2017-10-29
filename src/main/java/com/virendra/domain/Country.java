package com.virendra.domain;

import java.util.Date;

/**
 * Created by esha on 05/09/16.
 */
public class Country implements Reference {

    private long countryId;
    private String countryCode;
    private String countryName;
    private int statusIndicator;
    private Date lastModifyDate;
    private long modifyPersonNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (countryId != country.countryId) return false;
        if (!countryCode.equals(country.countryCode)) return false;
        return countryName.equals(country.countryName);

    }

    @Override
    public int hashCode() {
        int result = (int) (countryId ^ (countryId >>> 32));
        result = 31 * result + countryCode.hashCode();
        result = 31 * result + countryName.hashCode();
        return result;
    }

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getStatusIndicator() {
        return statusIndicator;
    }

    public void setStatusIndicator(int statusIndicator) {
        this.statusIndicator = statusIndicator;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public long getModifyPersonNumber() {
        return modifyPersonNumber;
    }

    public void setModifyPersonNumber(long modifyPersonNumber) {
        this.modifyPersonNumber = modifyPersonNumber;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryId=" + countryId +
                ", countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", statusIndicator=" + statusIndicator +
                ", lastModifyDate=" + lastModifyDate +
                ", modifyPersonNumber=" + modifyPersonNumber +
                '}';
    }

    public Long getId() {
        return countryId;
    }
}

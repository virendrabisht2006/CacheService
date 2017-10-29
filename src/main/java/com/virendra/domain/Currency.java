package com.virendra.domain;

import java.util.Date;

/**
 * Created by esha on 05/09/16.
 */
public class Currency implements Reference {

    private long currencyId;
    private String currencyCode;
    private String currencyName;
    private String currencySymbol;
    private int statusIndicator;
    private Date lastModifyDate;
    private long modifyPersonNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Currency currency = (Currency) o;

        if (currencyId != currency.currencyId) return false;
        if (!currencyCode.equals(currency.currencyCode)) return false;
        if (!currencyName.equals(currency.currencyName)) return false;
        return currencySymbol != null ? currencySymbol.equals(currency.currencySymbol) : currency.currencySymbol == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (currencyId ^ (currencyId >>> 32));
        result = 31 * result + currencyCode.hashCode();
        result = 31 * result + currencyName.hashCode();
        result = 31 * result + (currencySymbol != null ? currencySymbol.hashCode() : 0);
        return result;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(long currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
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
        return "Currency{" +
                "currencyId=" + currencyId +
                ", currencyCode='" + currencyCode + '\'' +
                ", currencyName='" + currencyName + '\'' +
                ", currencySymbol='" + currencySymbol + '\'' +
                ", statusIndicator=" + statusIndicator +
                ", lastModifyDate=" + lastModifyDate +
                ", modifyPersonNumber=" + modifyPersonNumber +
                '}';
    }

    public Long getId() {
        return currencyId;
    }
}

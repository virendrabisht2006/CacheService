package com.virendra.domain;

import java.util.Date;

/**
 * Created by esha on 05/09/16.
 */
public class Holiday implements Reference {

    private long holidayId;
    private String holidayCode;
    private String holidayName;
    private Date holidayDate;
    private int statusIndicator;
    private Date lastModifyDate;
    private long modifyPersonNumber;

    public long getHolidayId() {
        return holidayId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Holiday holiday = (Holiday) o;

        if (holidayId != holiday.holidayId) return false;
        if (!holidayCode.equals(holiday.holidayCode)) return false;
        return holidayName.equals(holiday.holidayName);

    }

    @Override
    public int hashCode() {
        int result = (int) (holidayId ^ (holidayId >>> 32));
        result = 31 * result + holidayCode.hashCode();
        result = 31 * result + holidayName.hashCode();
        return result;
    }

    public void setHolidayId(long holidayId) {
        this.holidayId = holidayId;
    }

    public String getHolidayCode() {
        return holidayCode;
    }

    public void setHolidayCode(String holidayCode) {
        this.holidayCode = holidayCode;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    public Date getHolidayDate() {
        return holidayDate;
    }

    public void setHolidayDate(Date holidayDate) {
        this.holidayDate = holidayDate;
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
        return "Holiday{" +
                "holidayId=" + holidayId +
                ", holidayCode='" + holidayCode + '\'' +
                ", holidayName='" + holidayName + '\'' +
                ", holidayDate=" + holidayDate +
                ", statusIndicator=" + statusIndicator +
                ", lastModifyDate=" + lastModifyDate +
                ", modifyPersonNumber=" + modifyPersonNumber +
                '}';
    }

    public Long getId() {
        return holidayId;
    }
}

/* 
 * Copyright 2016 Bryan Daniel.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package clinic;

import java.sql.Date;

/**
 * Represents a blood pressure measurement
 *
 * @author Bryan Daniel
 * @version 1, April 8, 2016
 */
public class BloodPressureResult {

    /**
     * Instance variables
     */
    private Date date;
    private int systolicValue;
    private int diastolicValue;
    private boolean aceOrArb;

    /**
     * Default constructor
     */
    public BloodPressureResult() {
        date = null;
    }

    /**
     * Parameterized constructor
     *
     * @param date the date
     * @param sValue the systolic value
     * @param dValue the diastolic value
     * @param aceOrArb boolean for ACE or ARB medication
     */
    public BloodPressureResult(Date date, int sValue, int dValue, boolean aceOrArb) {
        this.date = date;
        this.systolicValue = sValue;
        this.diastolicValue = dValue;
        this.aceOrArb = aceOrArb;
    }

    /**
     * Get the systolicValue of date
     *
     * @return the systolicValue of date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set the systolicValue of date
     *
     * @param date new systolicValue of date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Get the systolicValue of systolicValue
     *
     * @return the systolicValue of systolicValue
     */
    public int getSystolicValue() {
        return systolicValue;
    }

    /**
     * Set the systolicValue of systolicValue
     *
     * @param sValue new systolicValue of systolicValue
     */
    public void setSystolicValue(int sValue) {
        this.systolicValue = sValue;
    }

    /**
     * Get the value of diastolicValue
     *
     * @return the value of diastolicValue
     */
    public int getDiastolicValue() {
        return diastolicValue;
    }

    /**
     * Set the value of diastolicValue
     *
     * @param dValue new value of diastolicValue
     */
    public void setDiastolicValue(int dValue) {
        this.diastolicValue = dValue;
    }

    /**
     * Get the value of aceOrArb
     *
     * @return the value of aceOrArb
     */
    public boolean getAceOrArb() {
        return aceOrArb;
    }

    /**
     * Set the value of aceOrArb
     *
     * @param aceOrArb new value of aceOrArb
     */
    public void setAceOrArb(boolean aceOrArb) {
        this.aceOrArb = aceOrArb;
    }

}

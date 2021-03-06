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

import java.util.ArrayList;

/**
 * Represents a record of patient treatment
 *
 * @author Bryan Daniel
 * @version 1, April 8, 2016
 */
public class TreatmentHistory {

    /**
     * Instance variables
     */
    private ArrayList<Therapy> therapies;
    private ArrayList<Medication> medications;

    /**
     * Default constructor
     */
    public TreatmentHistory() {
        therapies = null;
        medications = null;
    }

    /**
     * Parameterized constructor
     *
     * @param therapies the therapies
     * @param medications the medications
     */
    public TreatmentHistory(ArrayList<Therapy> therapies, ArrayList<Medication> medications) {
        this.therapies = therapies;
        this.medications = medications;
    }

    /**
     * Get the value of therapies
     *
     * @return the value of therapies
     */
    public ArrayList<Therapy> getTherapies() {
        return therapies;
    }

    /**
     * Set the value of therapies
     *
     * @param therapies new value of therapies
     */
    public void setTherapies(ArrayList<Therapy> therapies) {
        this.therapies = therapies;
    }

    /**
     * Get the value of medications
     *
     * @return the value of medications
     */
    public ArrayList<Medication> getMedications() {
        return medications;
    }

    /**
     * Set the value of medications
     *
     * @param medications new value of medications
     */
    public void setMedications(ArrayList<Medication> medications) {
        this.medications = medications;
    }

}

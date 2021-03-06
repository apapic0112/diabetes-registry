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
 * Contains the reference information used by the application
 *
 * @author Bryan Daniel
 * @version 1, April 8, 2016
 */
public class ReferenceContainer {

    /**
     * Instance variables
     */
    private ArrayList<QualityReference> qualityReferences;
    private ArrayList<Therapy> therapies;
    private ArrayList<Medication> medications;
    private ArrayList<PsychologicalScreeningReference> psychologicalScreeningReferences;
    private ArrayList<TelephoneFollowUpDefinition> telephoneFollowUpDefinitions;
    private ArrayList<FootExamRiskDefinition> footExamRiskDefinitions;
    private ArrayList<EyeExamDefinition> eyeExamDefinitions;
    private ArrayList<Clinic> clinics;
    private ArrayList<String> noteTopics;
    private ArrayList<String> languages;
    private ArrayList<String> reasonsForInactivity;
    private ArrayList<String> emailMessageSubjects;
    private HealthyTargetReference healthyTargets;

    /**
     * Default constructor
     */
    public ReferenceContainer() {
        qualityReferences = null;
        therapies = null;
        medications = null;
        psychologicalScreeningReferences = null;
        telephoneFollowUpDefinitions = null;
        footExamRiskDefinitions = null;
        eyeExamDefinitions = null;
        clinics = null;
        noteTopics = null;
        languages = null;
        reasonsForInactivity = null;
        emailMessageSubjects = null;
        healthyTargets = null;
    }

    /**
     * Parameterized constructor
     *
     * @param qualityReferences the quality references
     * @param therapies the therapies
     * @param medications the medications
     * @param psychologicalScreeningReferences the psychological screening
     * references
     * @param telephoneFollowUpDefinitions the telephone follow-up definitions
     * @param footExamRiskDefinitions the foot exam risk definitions
     * @param eyeExamDefinitions the eye exam definitions
     * @param clinics the clinics
     * @param noteTopics the note topics
     * @param languages the languages
     * @param reasonsForInactivity the reasons for inactivity
     * @param emailMessageSubjects the subjects for email messages
     * @param healthyTargets the healthy target references
     */
    public ReferenceContainer(ArrayList<QualityReference> qualityReferences,
            ArrayList<Therapy> therapies, ArrayList<Medication> medications,
            ArrayList<PsychologicalScreeningReference> psychologicalScreeningReferences,
            ArrayList<TelephoneFollowUpDefinition> telephoneFollowUpDefinitions,
            ArrayList<FootExamRiskDefinition> footExamRiskDefinitions,
            ArrayList<EyeExamDefinition> eyeExamDefinitions,
            ArrayList<Clinic> clinics, ArrayList<String> noteTopics,
            ArrayList<String> languages, ArrayList<String> reasonsForInactivity,
            ArrayList<String> emailMessageSubjects, HealthyTargetReference healthyTargets) {
        this.qualityReferences = qualityReferences;
        this.therapies = therapies;
        this.medications = medications;
        this.psychologicalScreeningReferences = psychologicalScreeningReferences;
        this.telephoneFollowUpDefinitions = telephoneFollowUpDefinitions;
        this.footExamRiskDefinitions = footExamRiskDefinitions;
        this.eyeExamDefinitions = eyeExamDefinitions;
        this.clinics = clinics;
        this.noteTopics = noteTopics;
        this.languages = languages;
        this.reasonsForInactivity = reasonsForInactivity;
        this.emailMessageSubjects = emailMessageSubjects;
        this.healthyTargets = healthyTargets;
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

    /**
     * Get the value of psychologicalScreeningReferences
     *
     * @return the value of psychologicalScreeningReferences
     */
    public ArrayList<PsychologicalScreeningReference> getPsychologicalScreeningReferences() {
        return psychologicalScreeningReferences;
    }

    /**
     * Set the value of psychologicalScreeningReferences
     *
     * @param psychologicalScreeningReferences new value of
     * psychologicalScreeningReferences
     */
    public void setPsychologicalScreeningReferences(ArrayList<PsychologicalScreeningReference> psychologicalScreeningReferences) {
        this.psychologicalScreeningReferences = psychologicalScreeningReferences;
    }

    /**
     * Get the value of telephoneFollowUpDefinitions
     *
     * @return the value of telephoneFollowUpDefinitions
     */
    public ArrayList<TelephoneFollowUpDefinition> getTelephoneFollowUpDefinitions() {
        return telephoneFollowUpDefinitions;
    }

    /**
     * Set the value of telephoneFollowUpDefinitions
     *
     * @param telephoneFollowUpDefinitions new value of
     * telephoneFollowUpDefinitions
     */
    public void setTelephoneFollowUpDefinitions(ArrayList<TelephoneFollowUpDefinition> telephoneFollowUpDefinitions) {
        this.telephoneFollowUpDefinitions = telephoneFollowUpDefinitions;
    }

    /**
     * Get the value of footExamRiskDefinitions
     *
     * @return the value of footExamRiskDefinitions
     */
    public ArrayList<FootExamRiskDefinition> getFootExamRiskDefinitions() {
        return footExamRiskDefinitions;
    }

    /**
     * Set the value of footExamRiskDefinitions
     *
     * @param footExamRiskDefinitions new value of footExamRiskDefinitions
     */
    public void setFootExamRiskDefinitions(ArrayList<FootExamRiskDefinition> footExamRiskDefinitions) {
        this.footExamRiskDefinitions = footExamRiskDefinitions;
    }

    /**
     * Get the value of eyeExamDefinitions
     *
     * @return the value of eyeExamDefinitions
     */
    public ArrayList<EyeExamDefinition> getEyeExamDefinitions() {
        return eyeExamDefinitions;
    }

    /**
     * Set the value of eyeExamDefinitions
     *
     * @param eyeExamDefinitions new value of eyeExamDefinitions
     */
    public void setEyeExamDefinitions(ArrayList<EyeExamDefinition> eyeExamDefinitions) {
        this.eyeExamDefinitions = eyeExamDefinitions;
    }

    /**
     * Get the value of qualityReferences
     *
     * @return the value of qualityReferences
     */
    public ArrayList<QualityReference> getQualityReferences() {
        return qualityReferences;
    }

    /**
     * Set the value of qualityReferences
     *
     * @param qualityReferences new value of qualityReferences
     */
    public void setQualityReferences(ArrayList<QualityReference> qualityReferences) {
        this.qualityReferences = qualityReferences;
    }

    /**
     * Get the value of clinics
     *
     * @return the value of clinics
     */
    public ArrayList<Clinic> getClinics() {
        return clinics;
    }

    /**
     * Set the value of clinicIds
     *
     * @param clinics new value of clinics
     */
    public void setClinics(ArrayList<Clinic> clinics) {
        this.clinics = clinics;
    }

    /**
     * Get the value of noteTopics
     *
     * @return the value of noteTopics
     */
    public ArrayList<String> getNoteTopics() {
        return noteTopics;
    }

    /**
     * Set the value of noteTopics
     *
     * @param noteTopics new value of noteTopics
     */
    public void setNoteTopics(ArrayList<String> noteTopics) {
        this.noteTopics = noteTopics;
    }

    /**
     * Get the value of languages
     *
     * @return the value of languages
     */
    public ArrayList<String> getLanguages() {
        return languages;
    }

    /**
     * Set the value of languages
     *
     * @param languages new value of languages
     */
    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    /**
     * Get the value of reasonsForInactivity
     *
     * @return the value of reasonsForInactivity
     */
    public ArrayList<String> getReasonsForInactivity() {
        return reasonsForInactivity;
    }

    /**
     * Set the value of reasonsForInactivity
     *
     * @param reasonsForInactivity new value of reasonsForInactivity
     */
    public void setReasonsForInactivity(ArrayList<String> reasonsForInactivity) {
        this.reasonsForInactivity = reasonsForInactivity;
    }

    /**
     * Get the value of emailMessageSubjects
     *
     * @return the value of emailMessageSubjects
     */
    public ArrayList<String> getEmailMessageSubjects() {
        return emailMessageSubjects;
    }

    /**
     * Set the value of emailMessageSubjects
     *
     * @param emailMessageSubjects new value of emailMessageSubjects
     */
    public void setEmailMessageSubjects(ArrayList<String> emailMessageSubjects) {
        this.emailMessageSubjects = emailMessageSubjects;
    }

    /**
     * Get the value of healthyTargets
     *
     * @return the value of healthyTargets
     */
    public HealthyTargetReference getHealthyTargets() {
        return healthyTargets;
    }

    /**
     * Set the value of healthyTargets
     *
     * @param healthyTargets new value of healthyTargets
     */
    public void setHealthyTargets(HealthyTargetReference healthyTargets) {
        this.healthyTargets = healthyTargets;
    }
}

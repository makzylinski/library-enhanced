package com.makzylinski.libraryenhanced.model;

public class Option {
    private int stepIndex;
    private String label;

    public Option(int stepIndex, String label) {
        this.stepIndex = stepIndex;
        this.label = label;
    }

    public int getStepIndex() {
        return stepIndex;
    }

    public void setStepIndex(int stepIndex) {
        this.stepIndex = stepIndex;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Option{" +
                "stepIndex=" + stepIndex +
                ", label='" + label + '\'' +
                '}';
    }
}

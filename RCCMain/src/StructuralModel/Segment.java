package StructuralModel;

public class Segment {
    private int segmentNumber;
    private boolean isPass;
    private Incidence incidence;

    public int getSegmentNumber() {
        return segmentNumber;
    }

    public void setSegmentNumber(int segmentNumber) {
        this.segmentNumber = segmentNumber;
    }

    public boolean isPass() {
        return isPass;
    }

    public void setPass(boolean pass) {
        isPass = pass;
    }

    public Incidence getIncidence() {
        return incidence;
    }

    public void setIncidence(Incidence incidence) {
        this.incidence = incidence;
    }
}

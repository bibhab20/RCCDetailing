package StructuralModel;

import java.util.List;

public class Beam extends Segment{
    private double length;
    private double[] size;
    private TopReinforcement topReinforcement;
    private double bottomReinforcement;
    private double cover;
    ConcreteGrade concreteGrade;
    MainReinforcementGrade mainReinforcementGrade;
    ShearReinforcementGrade shearReinforcementGrade;
    List<StirreupSpecification> shearReinforcement;
}

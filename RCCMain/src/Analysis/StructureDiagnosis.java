package Analysis;

import StructuralModel.Beam;
import StructuralModel.Column;
import StructuralModel.Structure;

import java.util.List;

public class StructureDiagnosis {
    private Structure structure;
    public StructureDiagnosis(Structure structure){
        this.structure = structure;
    }
    public String runDiagnosis(){
        StringBuilder sb = new StringBuilder();
        if(this.structure==null){
            sb.append("Structure is null. Stopping diagnosis");
            return sb.toString();
        }

        return sb.toString();
    }

    private String runBeamDiagnosis(){

        //metrices
        int numberOfNullBeams =0;
        StringBuilder sb = new StringBuilder();
        sb.append("B E A M diagnosis starts here");
        List<Beam> beams = this.structure.getBeams();
        if(beams.size()==0){
            sb.append("No beams found in the structure");
            return sb.toString();
        }
        sb.append(beams.size()).append(" beams found in the structure");
        for(Beam beam: beams){
            if(beam==null){
                sb.append("Null beam found");
            }
        }

        return sb.toString();
    }
    private boolean validateBeamLength(Beam beam){
        return beam.getLength()<0;
    }

    private boolean validateBeamSize(Beam beam){
        return beam.getSize()[0]<=0 || beam.getSize()[1]<=0;
    }

    /*private boolean validateBeamTopReinforcement(Beam beam){

    }

    private boolean validateBeamBottomReinforcement(Beam beam){

    }

    private boolean validateBeamCover(Beam beam){

    }

    private boolean validateBeamConcreteGrade(Beam beam){

    }

    private boolean validateBeamMainReinforcementGrade(Beam beam){

    }

    private boolean validateBeamShearReinforcementGrade(Beam beam){

    }

    private boolean validateBeamShearReinforcement(Beam beam){

    }
*/

}

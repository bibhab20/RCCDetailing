package Parsing;

import StructuralModel.AbstractStructure;
import StructuralModel.Segment;
import StructuralModel.Structure;

import java.util.ArrayList;
import java.util.List;

public class Parser extends AbstractParser{
    @Override
    public AbstractStructure getStructure(String text) {
        AbstractStructure structure = new Structure();
        List<String> sections = getSegmentSections(text);
        SimpleSegmentParser segmentParser = new SimpleSegmentParser();
        List<Segment> segments = new ArrayList<>();
        for(String section: sections){
            segments.add(segmentParser.parse(section));
        }
        System.out.println("segment size"+ segments.size());
        for(Segment segment: segments){
            if(segment!=null)
                structure.addSegment(segment);
        }

        return structure;

    }

    private List<String> getSegmentSections(String text){
        String[] arr = text.split("[=]+");
        return cleanUp(arr);

    }
    private List<String> cleanUp(String[] arr){
        List<String> ans = new ArrayList<>();
        for(String s: arr){
            s = s.trim();
            if(s.contains("L I M I T    S T A T E    D E S I G N")){
                ans.add(s);
            }
        }
        return ans;
    }
}

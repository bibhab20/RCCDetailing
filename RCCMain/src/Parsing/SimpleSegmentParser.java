package Parsing;

import StructuralModel.Segment;
import Util.ParseUtil;

import java.util.Properties;

public class SimpleSegmentParser implements SegmentParser {
    @Override
    public Segment parse(String section) {
        Properties properties = ParseUtil.getInstance().getProperties();
        BeamParser beamParser = new BeamParser();
        ColumnParser columnParser = new ColumnParser();
        Segment segment = null;
        if(section.contains(properties.getProperty("beam_identifier"))){
            segment = beamParser.parse(section);
        }
        else if(section.contains(properties.getProperty("column_identifier"))){
            segment = columnParser.parse(section);
        }

        return segment;
    }
}

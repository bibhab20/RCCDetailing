package Parsing;

import StructuralModel.*;
import Util.ParseUtil;

import java.util.Properties;

public class ColumnParser {
    private final Properties properties = ParseUtil.getInstance().getProperties();
    public Column parse(String section){
        Column column = new Column();
        if(!isPass(section)){
            column.setPass(false);
            return column;
        }
        column.setConcreteGrade(getConcreteGrade(section));
        column.setMainReinforcementGrade(getMainReinforcement(section));
        column.setTieReinforcementGrade(getTieReinforcementGrade(section));
        column.setLength(getLength(section));
        column.setCrossSection(getCrossSection(section));
        column.setCover(getCover(section));
        column.setRequiredSteelArea(getRequiredSteelArea(section));
        column.setTieReinforcement(getTieReinforcement(section));
        return column;
    }

    private boolean isPass(String section){
        return !section.contains(properties.getProperty("column_fail_identifier"));
    }
    private ConcreteGrade getConcreteGrade(String section){
        return null;
    }
    private MainReinforcementGrade getMainReinforcement(String section){
        return null;
    }
    private TieReinforcement getTieReinforcement(String section){
        return null;
    }

    private double getLength(String section){
        return 0;
    }
    private double[] getCrossSection(String section){
        return new double[0];
    }

    private double getCover(String section){
        return 0;
    }

    private TieReinforcementGrade getTieReinforcementGrade(String section){
        return null;
    }
    private double getRequiredSteelArea(String section){
        return 0;
    }
}

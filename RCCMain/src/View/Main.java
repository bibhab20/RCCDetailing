package View;

import Parsing.Parser;
import StructuralModel.Beam;
import StructuralModel.Column;
import StructuralModel.Structure;
import Util.ParseUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(ParseUtil.getInstance().getProperties().getProperty("file_path"));
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        StringBuilder sb = new StringBuilder();
        while ((st = br.readLine()) != null)
            sb.append(st).append("\n");
        String text = sb.toString();
        //Nitin' code starts here
        Parser parser = new Parser();
        Structure structure = (Structure) parser.getStructure(text);
        List<Beam> beams = structure.getBeams();
        List<Column> columns = structure.getColumns();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(beams.size()+" beams found");
        System.out.println(columns.size()+" columns found");
        System.out.println("Failed Beam");
        for(Beam beam: beams){
            if(!beam.isPass()){
                stringBuilder.append(beam.getSegmentNumber()).append(" ");
            }
        }
        System.out.println(stringBuilder);
        stringBuilder = new StringBuilder();
        System.out.println("Failed columns");
        for(Column column: columns){
            if(!column.isPass()){
                stringBuilder.append(column.getSegmentNumber()).append(" ");
            }
        }
        System.out.println(stringBuilder);

    }

}

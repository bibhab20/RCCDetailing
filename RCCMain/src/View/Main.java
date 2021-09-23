package View;

import Parsing.Parser;
import StructuralModel.Beam;
import StructuralModel.Column;
import StructuralModel.Structure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Desktop\\Dropbox\\1DoD\\2021\\RCC_DETAILING\\V15 MID.txt");
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
        System.out.println(beams.size());
        StringBuilder stringBuilder = new StringBuilder();
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

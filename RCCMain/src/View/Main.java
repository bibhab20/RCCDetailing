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
        File file = new File("C:\\Myfiles\\Tech Hobby\\NitinFolder\\nitinfile4.txt");
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
        System.out.println(beams.size());
        for(Beam beam: beams){
            System.out.println("************");
            System.out.println(beam.getSegmentNumber());
            System.out.println(beam.getLength());
        }

        for(Column column: structure.getColumns()){
            System.out.println("************");
            System.out.println("Col no: "+column.getSegmentNumber());
        }

    }
}

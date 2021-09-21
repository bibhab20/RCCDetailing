package StructuralModel;

import java.util.List;

public abstract class AbstractStructure {
    private List<Beam> beams;
    private List<Column> columns;

    public List<Beam> getBeams() {
        return beams;
    }

    public List<Column> getColumns() {
        return columns;
    }
}

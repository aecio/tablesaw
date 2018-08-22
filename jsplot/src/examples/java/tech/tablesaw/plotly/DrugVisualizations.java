package tech.tablesaw.plotly;

import tech.tablesaw.AbstractExample;
import tech.tablesaw.api.Table;
import tech.tablesaw.io.csv.CsvReadOptions;
import tech.tablesaw.io.csv.CsvReader;

import java.util.Locale;

public class DrugVisualizations extends AbstractExample {

    public static void main(String[] args) throws Exception {

        System.out.println(new CsvReader().printColumnTypes("../data/PartD_Prescriber_16.txt", true, '\t', Locale.getDefault()));
        Table prescriptions = Table.read()
                .csv(CsvReadOptions.builder("../data/PartD_Prescriber_16.txt")
                        .separator('\t')
                        .build());

        prescriptions.setName("prescriptions");

        out(prescriptions.structure().printAll());
        out(prescriptions.first(20).printAll());
        out(prescriptions.shape());
    }
}

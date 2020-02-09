/*
    The class would essentially read in the file, create a model and call for a construction
*/
import com.google.gson.Gson;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Reading {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void readFile() throws IOException {

        // Pattern for processing the commas in the .csv
        Pattern pattern = Pattern.compile(",");

        //Reader to read the file

        try (BufferedReader in = new BufferedReader(new FileReader("data_file.csv"))) {

            // List model for creating and populating the data
            List<WindDataModel> windData = in
                    .lines()
                    .skip(1)
                    .map(line -> {
                        String[] x = pattern.split(line);
                        return new WindDataModel(x[0],
                                x[1],
                                x[2],
                                x[3],
                                x[4],
                                x[5],
                                x[6]);
                    })
                    .collect(Collectors.toList());
            String json = new Gson().toJson(windData);
            System.out.println(json);

            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(windData);
            System.out.println(jsonString);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

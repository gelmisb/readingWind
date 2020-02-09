/*
    The class would essentially read in the file, create a model and call for a construction
*/
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*;


public class Reading {
    public static void main (String[] args) {
        readFile();


    }

    private static void readFile() {

        String date = "Date/time";
        String ws1 = "WS1";
        String ws2 = "WS2";
        String wd1 = "WD1";
        String wd2 = "WD2";
        String hum = "Humidity";
        String temp = "Temperature";

        try {
            File myObj = new File("data_file.csv");
            Scanner myReader = new Scanner(myObj);

            String headings = myReader.nextLine();

            System.out.println("Heading: " + headings);

            ArrayList<WindDataModel> model = new ArrayList<WindDataModel>();
            ArrayList <String> data = new ArrayList<>();

            int i= 0 ;
            while (myReader.hasNextLine()) {
                WindDataModel modelParams = new WindDataModel();
                data.add(Arrays.toString(myReader.nextLine().split(",")));
//
//                String tempVar = String.valueOf(data.get(i));
//
//
//                System.out.println(date + ":" +  + ": OUTCOME");
//                System.out.println(ws1 + data.get(i) + ": OUTCOME");
//                System.out.println(ws2 + data.get(i) + ": OUTCOME");
//                System.out.println(wd1 + data.get(i) + ": OUTCOME");
//                System.out.println(wd2 + data.get(i) + ": OUTCOME");
//                System.out.println(hum + data.get(i) + ": OUTCOME");
//                System.out.println(temp + data.get(i) + ": OUTCOME");


                ArrayList<HashMap<String,String>> list =  new ArrayList<>();


String[] light = myReader.nextLine().split(",");
                HashMap<String, WindDataModel> productMap = new HashMap<String, WindDataModel>();
                for (data : productMap) {
//                    productMap.put(date, light[0]);
//                    productMap.put(ws1, light[1]);
//                    productMap.put(ws2, light[0]);
//                    productMap.put(wd1, light[0]);
//                    productMap.put(wd2, light[0]);
//                    productMap.put(hum, light[0]);
//                    productMap.put(temp, light[0]);
                }

                list.add(data.get(i));

                System.out.println(list.get(i));


//                modelParams.setWind_speed1(myReader.nextLine());


                i++;
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

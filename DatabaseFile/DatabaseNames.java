package DatabaseFile;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class DatabaseNames {
    private String saveNames;

    public DatabaseNames(String saveNames){

        this.saveNames = saveNames;

        try {

            FileWriter file = new FileWriter("/ScoreBoard/data/databaseNames.txt", true);
            BufferedWriter buffer = new BufferedWriter(file);
            PrintWriter output = new PrintWriter(buffer);


            output.println(saveNames);

            output.flush();

            file.close();
            buffer.close();
            output.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public DatabaseNames(){

    }

    public String getSaveNames() {
        return saveNames;
    }

    public String toString(){
        return saveNames;
    }

    public ArrayList<String> getDatabaseNames() throws IOException {



        File file = new File("/ScoreBoard/data/databaseNames.txt");

        if(!file.exists()){
            //JOptionPane.showMessageDialog(null,"Database Names file not found");
            file.createNewFile();
        }
        Scanner scan = new Scanner(file);
        ArrayList<String> names = new ArrayList<>();

        while(scan.hasNextLine()){
            String dataName = scan.nextLine();
            names.add(dataName);
        }
        return names;



        //InputStream in = new FileInputStream("databaseNames.txt");        // work in compiler

//        InputStream in = getClass().getResourceAsStream("/databaseNames.txt");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//
//        ArrayList<String> names = new ArrayList<>();
//
//        String line;
//        while ((line = reader.readLine())!=null) {
//            String dataName = line;
//            names.add(dataName);
//        }
//
//        in.close();
//        reader.close();
//
//
//        return names;

    }

}


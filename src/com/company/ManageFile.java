package com.company;
import java.io.FileWriter;
import java.io.IOException;

public class ManageFile {
    static GenerateString generate=new GenerateString();
    static com.company.UserInput userInput=new com.company.UserInput();
    public  void writeFile(){
        int count = userInput.getNumber();
        System.out.println("COUNT = "+ count);


        try {
            FileWriter myWriter = new FileWriter("Output.txt");
            for (int i = 0; i< count; i++){

                myWriter.write(generate.generateString()+"\n");
                //System.out.println();
            }
            myWriter.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}

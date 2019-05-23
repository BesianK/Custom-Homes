package kodra_guicustomhomes;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * @author besian kodra
 */
public class Receipt {

    String fileName = "receipts.txt";
    DecimalFormat cost = new DecimalFormat("###.00");

    public void createReceipt(Order custOrder) {
        ArrayList<String> currentList = new ArrayList<>();
        currentList.add(custOrder.getName());
        currentList.add(String.valueOf(cost.format(custOrder.getOrderTotal())));
        writeFile(currentList);
    }

    private void writeFile(ArrayList<String> currentList) {

        try {
            FileWriter fw = new FileWriter(fileName, true);
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                for (String line : currentList) {
                    bw.write(line + "\n");
                }
                bw.close();
                fw.close();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File can NOT open" + fileName);
        } catch (IOException ex) {
            System.out.println("There seems to be an error! " + fileName);
        }
    }
}
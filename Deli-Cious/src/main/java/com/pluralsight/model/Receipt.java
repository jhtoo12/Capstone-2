package com.pluralsight.model;

import javax.swing.text.DateFormatter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Receipt {
    public Receipt(String receiptInfo) {
        LocalDate currentDate = LocalDate.now();
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd-hhmmss");

        String date = ft.format(new Date());

        try {
            File file = new File("receipts/" + date);
            if (!file.createNewFile()) {
                System.out.println("File already exists.");
            }

            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(receiptInfo);
            fileWriter.close();
        }

        catch (IOException e) {
            System.out.println("Error");
        }
    }
}

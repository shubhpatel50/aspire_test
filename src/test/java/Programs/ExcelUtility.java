import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ExcelUtility {

    public static void readDataFromExcel(String fileName, String sheetName) {

        try {

            FileInputStream excelFile = new FileInputStream(new File(fileName).getAbsolutePath());
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheet(sheetName);
            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {

                Row currentRow = rowIterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();

                while (cellIterator.hasNext()) {

                    Cell currentCell = cellIterator.next();
                    System.out.print(currentCell.getStringCellValue() + " || ");

                }
                System.out.println();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args){

        readDataFromExcel("TestData.xlsx","Details");


    }
}

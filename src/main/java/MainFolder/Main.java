package MainFolder;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.usermodel.helpers.HSSFColumnShifter;
import org.apache.poi.ss.format.CellFormat;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet1 = workbook.createSheet("Zestaw Cwiczen");

        //niestety tylko jedna opcja do ustalenia szerokości

        sheet1.setDefaultColumnWidth(55);


        //DEFINICJA STYLU
        //_______________

        //Definicja czcionki
        Font fontTitle = workbook.createFont();
        fontTitle.setFontHeightInPoints((short) 16);
        fontTitle.getBold();
        fontTitle.setColor(IndexedColors.WHITE.getIndex());

        //Definicja stylu
        CellStyle mainStyle = workbook.createCellStyle();
        mainStyle.setAlignment(HorizontalAlignment.CENTER);
        mainStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
        mainStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        mainStyle.setFont(fontTitle);


        // DODANIE PASKA TYTULOWEGO
        HSSFRow row = sheet1.createRow(0);
        {
            HSSFCell cell = row.createCell(0);
            cell.setCellValue("Nazwa Ćwiczenia");
            cell.setCellStyle(mainStyle);
            sheet1.autoSizeColumn(0);

            HSSFCell cell2 = row.createCell(1);
            cell2.setCellValue("Opis Ćwiczenia");
            cell2.setCellStyle(mainStyle);

            HSSFCell cell3 = row.createCell(2);
            cell3.setCellValue("Ilość Powtórzeń");
            cell3.setCellStyle(mainStyle);
            sheet1.autoSizeColumn(2);

        }

        //Tworze sobie nowe komórki

        List<HSSFRow> listRows = new LinkedList<>();
        List<HSSFCell> listCells = new LinkedList<>();

        for (int i = 1; i < 4; i++) {
            listRows.add(sheet1.createRow(i));
            for (int j = 0; j < 3; j++) {
                listCells.add(listRows.get(i - 1).createCell(j));
            }
        }

        //_______________________________________________________

        //Przykład dodania wartości do komórek
        listRows.get(0).getCell(0)
                .setCellValue(MiddleBodyExercises.EXERCISE_1.getName());
        listRows.get(0).getCell(1)
                .setCellValue(MiddleBodyExercises.EXERCISE_1.getDescription());
        listRows.get(0).getCell(2)
                .setCellValue(MiddleBodyExercises.EXERCISE_1.getCount());

        //APLIKACJA DO DALSZEGO ROZWOJU


        try {
            workbook.write(new FileOutputStream("Example.xls"));
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

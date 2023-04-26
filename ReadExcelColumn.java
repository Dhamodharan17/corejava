import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelColumn {
   public static void main(String[] args) {
      try {
         FileInputStream file = new FileInputStream("example.xlsx");
         XSSFWorkbook workbook = new XSSFWorkbook(file);
         Sheet sheet = workbook.getSheetAt(0);
         for (Row row : sheet) {
            Cell cell = row.getCell(0);
            if (cell != null) {
               System.out.println(cell);
            }
         }
         workbook.close();
         file.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}

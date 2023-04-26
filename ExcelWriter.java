import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {
  public static void main(String[] args) {
    // Create a new Excel workbook
    XSSFWorkbook workbook = new XSSFWorkbook();
    
    // Create a new sheet in the workbook
    XSSFSheet sheet = workbook.createSheet("Sheet1");
    
    // Create a new row in the sheet
    XSSFRow row = sheet.createRow(0);
    
    // Create a new cell in the row
    XSSFCell cell = row.createCell(0);
    
    // Set the text of the cell
    cell.setCellValue("Hello, world!");
    
    // Create a new cell style
    XSSFCellStyle style = workbook.createCellStyle();
    style.setAlignment(HorizontalAlignment.CENTER);
    
    // Apply the cell style to the cell
    cell.setCellStyle(style);
    
    // Write the workbook to a file
    try {
      FileOutputStream outputStream = new FileOutputStream("example.xlsx");
      workbook.write(outputStream);
      workbook.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

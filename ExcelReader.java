import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;

public class ExcelReader {

    public static void main(String[] args) throws IOException {
        
        String filePath = "path/to/your/excel/file.xlsx";
        String searchString = "text to search";

        FileInputStream inputStream = new FileInputStream(filePath);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet) {
            for (Cell cell : row) {
                if (cell.getCellType() == CellType.STRING) {
                    if (cell.getStringCellValue().contains(searchString)) {
                        System.out.println("Cell " + cell.getAddress() + " contains " + searchString);
                    }
                }
            }
        }

        workbook.close();
        inputStream.close();
    }
}

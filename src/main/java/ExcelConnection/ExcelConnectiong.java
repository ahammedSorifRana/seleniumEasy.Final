package ExcelConnection;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConnectiong {
	FileInputStream FIS;
	XSSFWorkbook Xbook;
	XSSFSheet xSheet;
	
	public ExcelConnectiong(String FilePath) {
		try {
			File xFile = new File(FilePath);
			 FIS = new FileInputStream(xFile);
			 Xbook = new XSSFWorkbook(FIS);
		} catch (Exception e) {
			System.out.println("File input problem"+e.getMessage());
		}
		}
	public String[][]  getExcelData(int SheetNum) {
		xSheet = Xbook.getSheetAt(SheetNum);
		int Row_Num = xSheet.getLastRowNum();
		int Cal_Num = xSheet.getRow(0).getLastCellNum();
		String[][] xData = new String[Row_Num][Cal_Num];
		for(int i=0;i<Row_Num; i++) {
			XSSFRow Row = xSheet.getRow(i+1);
			for(int j=0;j<Cal_Num; j++) {
				XSSFCell xCell = Row.getCell(j);
				String Value = changeValue(xCell);
				xData[i][j] = Value;
			}
		}
		return xData;
		
		}
	private String changeValue(XSSFCell xCell) {
		Object xValue ;
		String Result = null;
		if(xCell == null)
		{
			Result ="";
		}	
		else {
			if(xCell.getCellTypeEnum()==CellType.STRING) {
				Result = xCell.getStringCellValue();
			}
			else if(xCell.getCellTypeEnum()==CellType.NUMERIC){
				xValue =(int) xCell.getNumericCellValue();
				Result =  xValue.toString();
			}
				
		}
		try {
			FIS.close();
			Xbook.close();
		} catch (Exception e) {
			System.out.println("Excel close error" +e.getMessage());
		}
		return Result;
	}

}

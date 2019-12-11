package com.example.javadesignmode.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;

/**
 * java 操作Excel导入导出数据库（ORACLE）
 * 
 * @author fuxiaorong-len
 * 
 */
public class ExcelOperate {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(DBUtils.getConnection());
		ExcelOperate excelOperate = new ExcelOperate();
		excelOperate.insertData();
	}

	public void insertData() {
		String execelFile = "D://qxjcsj.xlsx";
		try {
			// 构造 Workbook 对象，execelFile 是传入文件路径(获得Excel工作区),读取xls文件
			// HSSFWorkbook book = new HSSFWorkbook(new FileInputStream(execelFile));
			XSSFWorkbook book = new XSSFWorkbook(new FileInputStream(execelFile));
			// 读取表格的第一个sheet页
			Sheet sheet = book.getSheetAt(0);
			// 定义 row、cell
			Row row;
			String cell;
			int totalCells = 0;
			String cellStr = "";
			row = sheet.getRow(1);// 字段名称
			totalCells = row.getLastCellNum();// 列数
			System.out.println("total cell : " + totalCells);
			for (int k = row.getFirstCellNum(); k < totalCells; k++) {
				cellStr += row.getCell(k).toString();
				if (k < totalCells - 1) {
					cellStr += ",";
				}
			}
			// 总共有多少行,从0开始
			int totalRows = sheet.getLastRowNum();
			/*
			 * Random r = new Random(); int[] b = new int[totalRows+2]; for (int
			 * i = 0; i < b.length; i++) { b[i] = r.nextInt(100); for (int j =
			 * 0; j < i + 1; j++) { if ((i != j) && b[i] == b[j]) b[i] =
			 * r.nextInt(100); } }
			 */
			// 循环输出表格中的内容,首先循环取出行,再根据行循环取出列
			for (int i = 2; i <= totalRows; i++) {
				String sql = "insert into JGS_CGQSJ(" + cellStr
						+ ") values (";
				System.out.println("row number : " + i);
				row = sheet.getRow(i);
				// 处理空行
				if (row == null) {
					continue;
				}
				for (int j = row.getFirstCellNum(); j < totalCells; j++) {
					// 通过 row.getCell(j).toString() 获取单元格内容
					Cell cell_obj = row.getCell(j);
					if (cell_obj != null) {
						cell = row.getCell(j).toString();
					} else {
						cell = "";
					}
					if (j == 4) {
						if (cell != null && cell != "" && cell.length() > 0) {
							sql += Double.parseDouble(cell);
						} else {
							sql += 0.0;
						}
					}else if (j == 2) {
						Date dateCellValue = row.getCell(j).getDateCellValue();
						String format = DateUtils.format(dateCellValue, DateUtils.FM_DATE_AND_TIME);
						sql += "to_date('"+format+ "', \'yyyy-MM-dd HH24:mi:ss\')";
					}else if(j==0||j==3){
						if (cell != null && cell != "" && cell.length() > 0) {
							BigDecimal bd = new BigDecimal(Double.parseDouble(cell));
							sql += "'"+bd.intValue()+"'";
						} else {
							sql += "''";
						}
					}else {
						sql += "'" + cell.toString() + "'";
					}
					if (j < totalCells - 1) {
						sql += ",";
					}
				}
				sql += ")";
				System.out.println(sql);
				DBUtils.executeUpdate(sql);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			DBUtils.closeStmt();
			DBUtils.closeConnection();
		}
	}
}

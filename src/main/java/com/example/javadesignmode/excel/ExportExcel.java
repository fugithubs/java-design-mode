package com.example.javadesignmode.excel;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;

public class ExportExcel {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        HSSFWorkbook wb = new HSSFWorkbook();
        ExportExcel ee = new ExportExcel();
        // cc.createSheet01(wb);
        // cc.createSheet02(wb);
        ee.createSheetXB3(wb);
        FileOutputStream fileOut = new FileOutputStream("D:\\HSSFWorkbook.xls");
        wb.write(fileOut);
        fileOut.flush();
    }

    /**
     * 续表三
     *
     * @param wb
     */
    private void createSheetXB3(HSSFWorkbook wb) {
        HSSFSheet sheet = wb.createSheet("续表三");

        sheet.createFreezePane(0, 7);

        HSSFCellStyle style_3_1 = wb.createCellStyle();
        style_3_1.setWrapText(true);
        style_3_1.setAlignment(HorizontalAlignment.CENTER);
        style_3_1.setVerticalAlignment(VerticalAlignment.CENTER);
        // 表头第一行
        Row row0 = sheet.createRow(0);
        row0.setHeightInPoints(35);
        CellRangeAddress cra_0_0 = new CellRangeAddress(0, 0, 0, 15);
        sheet.addMergedRegion(cra_0_0);
        Cell cell_0_0 = row0.createCell(0);
        cell_0_0.setCellValue("北京市不动产登记统计表（续表三）");
        HSSFCellStyle style_0_0 = wb.createCellStyle();
        style_0_0.setAlignment(HorizontalAlignment.CENTER);
        style_0_0.setVerticalAlignment(VerticalAlignment.CENTER);
        HSSFFont font = wb.createFont();
        font.setFontHeightInPoints((short) 20);
        // font.setBold(true);
        style_0_0.setFont(font);
        cell_0_0.setCellStyle(style_0_0);

        CellRangeAddress cra_0_1 = new CellRangeAddress(0, 0, 16, 27);
        sheet.addMergedRegion(cra_0_1);
        Cell cell_0_1 = row0.createCell(16);
        cell_0_1.setCellValue("北京市不动产登记统计表（续表三）");
        cell_0_1.setCellStyle(style_0_0);
        // 表头第二行
        Row row1 = sheet.createRow(1);
        row1.setHeightInPoints(50);
        Cell cell_1_0 = row1.createCell(0);
        cell_1_0.setCellValue("责任单位：");

        CellRangeAddress cra_1_1 = new CellRangeAddress(1, 1, 1, 2);
        sheet.addMergedRegion(cra_1_1);
        Cell cell_1_1 = row1.createCell(1);
        cell_1_1.setCellValue("不动产登记中心");

        CellRangeAddress cra_1_7 = new CellRangeAddress(1, 1, 7, 8);
        sheet.addMergedRegion(cra_1_7);
        HSSFCellStyle style_1_21 = wb.createCellStyle();
        style_1_21.setAlignment(HorizontalAlignment.CENTER);
        Cell cell_1_7 = row1.createCell(7);
        cell_1_7.setCellValue("   年      月         ");
        cell_1_7.setCellStyle(style_1_21);

        CellRangeAddress cra_1_13 = new CellRangeAddress(1, 1, 13, 15);
        sheet.addMergedRegion(cra_1_13);
        Cell cell_1_13 = row1.createCell(13);
        HSSFCellStyle style_1_13 = wb.createCellStyle();
        style_1_13.setWrapText(true);
        cell_1_13.setCellStyle(style_1_13);
        cell_1_13.setCellValue("计量单位：(业务数)件、\r\n（宗地面积）公顷、\r\n（房屋建筑面积）万平方米、\r\n（债权数额）亿元 ");

        CellRangeAddress cra_1_16 = new CellRangeAddress(1, 1, 16, 17);
        sheet.addMergedRegion(cra_1_16);
        Cell cell_1_16 = row1.createCell(16);
        cell_1_16.setCellValue("不动产登记中心");

        CellRangeAddress cra_1_21 = new CellRangeAddress(1, 1, 21, 22);
        sheet.addMergedRegion(cra_1_21);
        Cell cell_1_21 = row1.createCell(21);
        cell_1_21.setCellValue("   年      月         ");
        cell_1_21.setCellStyle(style_1_21);

        CellRangeAddress cra_1_25 = new CellRangeAddress(1, 1, 25, 27);
        sheet.addMergedRegion(cra_1_25);
        Cell cell_1_25 = row1.createCell(25);
        HSSFCellStyle style_1_25 = wb.createCellStyle();
        style_1_25.setWrapText(true);
        cell_1_25.setCellStyle(style_1_25);
        cell_1_25.setCellValue("计量单位：(业务数)件、\r\n（宗地面积）公顷、\r\n（房屋建筑面积）万平方米、\r\n（债权数额）亿元 ");

        // 表头第三行
        Row row2 = sheet.createRow(2);
        row2.setHeightInPoints(20);
        CellRangeAddress cra_2_0 = new CellRangeAddress(2, 5, 0, 0);
        sheet.addMergedRegion(cra_2_0);
        Cell cell_2_0 = row2.createCell(0);
        cell_2_0.setCellValue("项目");
        cell_2_0.setCellStyle(style_3_1);

        CellRangeAddress cra_2_1 = new CellRangeAddress(2, 2, 1, 15);
        sheet.addMergedRegion(cra_2_1);
        Cell cell_2_1 = row2.createCell(1);
        cell_2_1.setCellValue("（五）抵押权登记 ");

        CellRangeAddress cra_2_16 = new CellRangeAddress(2, 2, 16, 27);
        sheet.addMergedRegion(cra_2_16);
        Cell cell_2_16 = row2.createCell(16);
        cell_2_16.setCellValue("（五）抵押权登记 ");

        // 表头第四行
        Row row3 = sheet.createRow(3);
        row3.setHeightInPoints(20);
        CellRangeAddress cra_3_1 = new CellRangeAddress(3, 3, 1, 11);
        sheet.addMergedRegion(cra_3_1);
        Cell cell_3_1 = row3.createCell(1);
        cell_3_1.setCellValue("1、抵押权设立登记（含最高额抵押权设立登记）");
        cell_3_1.setCellStyle(style_3_1);

        CellRangeAddress cra_3_12 = new CellRangeAddress(3, 4, 12, 15);
        sheet.addMergedRegion(cra_3_12);
        Cell cell_3_12 = row3.createCell(12);
        cell_3_12.setCellValue("2、抵押权变更登记");
        cell_3_12.setCellStyle(style_3_1);

        CellRangeAddress cra_3_16 = new CellRangeAddress(3, 4, 16, 19);
        sheet.addMergedRegion(cra_3_16);
        Cell cell_3_16 = row3.createCell(16);
        cell_3_16.setCellValue("3、抵押权转移登记");
        cell_3_16.setCellStyle(style_3_1);

        CellRangeAddress cra_3_20 = new CellRangeAddress(3, 4, 20, 23);
        sheet.addMergedRegion(cra_3_20);
        Cell cell_3_20 = row3.createCell(20);
        cell_3_20.setCellValue("4、抵押权注销登记");
        cell_3_20.setCellStyle(style_3_1);

        CellRangeAddress cra_3_24 = new CellRangeAddress(3, 4, 24, 27);
        sheet.addMergedRegion(cra_3_24);
        Cell cell_3_24 = row3.createCell(24);
        cell_3_24.setCellValue("5、最高额抵押权确定登记");
        cell_3_24.setCellStyle(style_3_1);

        // 表头第五行
        Row row4 = sheet.createRow(4);
        row4.setHeightInPoints(25);
        CellRangeAddress cra_4_1 = new CellRangeAddress(4, 4, 1, 3);
        sheet.addMergedRegion(cra_4_1);
        Cell cell_4_1 = row4.createCell(1);
        cell_4_1.setCellValue("（1）国有建设用地使用权\r\n抵押权设立登记");
        cell_4_1.setCellStyle(style_3_1);

        CellRangeAddress cra_4_4 = new CellRangeAddress(4, 4, 4, 7);
        sheet.addMergedRegion(cra_4_4);
        Cell cell_4_4 = row4.createCell(4);
        cell_4_4.setCellValue("（2）国有建设用地房屋在建工程抵押权设立登记");
        cell_4_4.setCellStyle(style_3_1);

        CellRangeAddress cra_4_8 = new CellRangeAddress(4, 4, 8, 11);
        sheet.addMergedRegion(cra_4_8);
        Cell cell_4_8 = row4.createCell(8);
        cell_4_8.setCellValue("（3）国有建设用地房屋抵押权设立登记");
        cell_4_8.setCellStyle(style_3_1);

        // 表头第六行
        Row row5 = sheet.createRow(5);
        row5.setHeightInPoints(40);

        Cell cell_5_1 = row5.createCell(1);
        cell_5_1.setCellValue("业务数");

        Cell cell_5_2 = row5.createCell(2);
        cell_5_2.setCellValue("宗地面积");

        Cell cell_5_3 = row5.createCell(3);
        cell_5_3.setCellValue("被担保的\r\n主债权\r\n数额");
        cell_5_3.setCellStyle(style_3_1);

        int i = 4;

        String[] strArray = {"业务数", "宗地面积", "房屋\r\n（建筑物、构筑物）\r\n建筑面积", "被担保的\r\n主债权\r\n数额"};
        for (int j = 0; j < 6; j++) {
            for (int n = 0; n < strArray.length; n++) {
                String cellValue = strArray[n];
                Cell cell_5_n = row5.createCell(i);
                cell_5_n.setCellValue(cellValue);
                cell_5_n.setCellStyle(style_3_1);
                i++;
            }
        }
        // 表头第七行
        Row row6 = sheet.createRow(6);
        row6.setHeightInPoints(20);

        Cell cell_6_0 = row6.createCell(0);
        cell_6_0.setCellValue("甲");
        cell_6_0.setCellStyle(style_3_1);

        for (i = 1; i <= 27; i++) {
            Cell cell_6_i = row6.createCell(i);
            cell_6_i.setCellValue(i);
            cell_6_i.setCellStyle(style_3_1);
        }
        i = 0;
    }
}

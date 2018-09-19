package com.pratice.tools;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import com.pratice.entity.Student;
import com.pratice.entity.Teacher;

public class ExcelTool {
	public static synchronized List<Teacher> readTeacher(InputStream is)
			throws BiffException, IOException {
		List<Teacher> list = new ArrayList<Teacher>();
		String[] args = new String[6];
		Workbook wb = Workbook.getWorkbook(is);
		int sheets = wb.getNumberOfSheets();
		for (int page = 0; page < sheets; page++) {
			Sheet sheet = wb.getSheet(page);
			for (int i = 1; i < sheet.getRows(); i++) {
				for (int j = 0; j < sheet.getColumns(); j++) {
					String contents = sheet.getCell(j, i).getContents();
					args[j] = contents;
				}
				Teacher teacher = new Teacher(args[0], args[1], args[2],
						args[3], Integer.parseInt(args[4]), args[5]);
				list.add(teacher);
			}

		}
		return list;
	}

	public static synchronized List<Student> readStudent(InputStream is)
			throws BiffException, IOException {
		List<Student> list = new ArrayList<Student>();
		String[] args = new String[8];
		Workbook wb = Workbook.getWorkbook(is);
		int sheets = wb.getNumberOfSheets();
		for (int page = 0; page < sheets; page++) {
			Sheet sheet = wb.getSheet(page);
			for (int i = 1; i < sheet.getRows(); i++) {
				for (int j = 0; j < sheet.getColumns(); j++) {
					String contents = sheet.getCell(j, i).getContents();
					args[j] = contents;
				}
				Student student = new Student(args[0], args[1], args[2],
						args[3], args[4], args[5], args[6], args[7]);
				list.add(student);
			}
		}
		return list;
	}

	public static synchronized void exportStudent(OutputStream os,
			List<Student> stu) throws IOException, RowsExceededException,
			WriteException {
		WritableWorkbook workbook = Workbook.createWorkbook(os);
		WritableSheet sheet = workbook.createSheet("第一页", 0);
		sheet.setColumnView(0, 15);
		sheet.setColumnView(1, 12);
		sheet.setColumnView(2, 12);
		sheet.setColumnView(3, 12);
		sheet.setColumnView(4, 12);
		sheet.setColumnView(5, 25);
		sheet.setColumnView(6, 15);
		sheet.setColumnView(7, 15);
		sheet.addCell(new Label(0, 0, "学号"));
		sheet.addCell(new Label(1, 0, "姓名"));
		sheet.addCell(new Label(2, 0, "性别"));
		sheet.addCell(new Label(3, 0, "密码"));
		sheet.addCell(new Label(4, 0, "联系电话"));
		sheet.addCell(new Label(5, 0, "学院"));
		sheet.addCell(new Label(6, 0, "班级"));
		sheet.addCell(new Label(7, 0, "指导老师"));
		for (int i = 0; i < stu.size(); i++) {
			Student s = stu.get(i);
			sheet.addCell(new Label(0, i, s.getSId()));
			sheet.addCell(new Label(1, i, s.getName()));
			sheet.addCell(new Label(2, i, s.getSex()));
			sheet.addCell(new Label(3, i, s.getPassword()));
			sheet.addCell(new Label(4, i, s.getTel()));
			sheet.addCell(new Label(5, i, s.getMajor()));
			sheet.addCell(new Label(6, i, s.getClass_()));
			sheet.addCell(new Label(7, i, s.getTutor()));
		}
		workbook.write();
		workbook.close();
	}

	public static synchronized void exportTeacher(OutputStream os,
			List<Teacher> tea) throws Exception {
		WritableWorkbook workbook = Workbook.createWorkbook(os);
		WritableSheet sheet = workbook.createSheet("第一页", 0);
		sheet.setColumnView(0, 15);
		sheet.setColumnView(1, 15);
		sheet.setColumnView(2, 15);
		sheet.setColumnView(3, 15);
		sheet.setColumnView(4, 15);
		sheet.setColumnView(5, 15);
		sheet.addCell(new Label(0, 0, "教工号"));
		sheet.addCell(new Label(1, 0, "教师姓名"));
		sheet.addCell(new Label(2, 0, "电话"));
		sheet.addCell(new Label(3, 0, "ר专业"));
		sheet.addCell(new Label(4, 0, "ָ指导学生数"));
		sheet.addCell(new Label(5, 0, "密码"));
		for (int i = 0; i < tea.size(); i++) {
			Teacher t = tea.get(i);
			sheet.addCell(new Label(0, i, t.getTId()));
			sheet.addCell(new Label(1, i, t.getTName()));
			sheet.addCell(new Label(2, i, t.getTTel()));
			sheet.addCell(new Label(3, i, t.getTMajor()));
			sheet.addCell(new Label(4, i, "" + t.getTStunum()));
			sheet.addCell(new Label(5, i, t.getTPassword()));
		}
		workbook.write();
		workbook.close();
	}
}

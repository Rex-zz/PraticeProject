package com.pratice.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.StrutsStatics;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pratice.entity.StuDiary;
import com.pratice.entity.StuIntention;
import com.pratice.entity.StuPractice;
import com.pratice.entity.StuReport;
import com.pratice.entity.StuSummary;
import com.pratice.entity.Student;
import com.pratice.service.StuDiaryService;
import com.pratice.service.StuIntentionService;
import com.pratice.service.StuPracticeService;
import com.pratice.service.StuReportService;
import com.pratice.service.StuSummaryService;
import com.pratice.service.StudentService;

@Controller
@Scope("prototype")
public class StudentAction extends ActionSupport implements RequestAware,
		SessionAware {
	public String id;
	public int did;
	public String pra;
	public Date start;
	public Date end;
	public String job;
	public String tel;
	public String name;
	public String sex;
	public String content;
	public String title;
	public StuReport report;
	public StuSummary summary;
	public Date date;
	public int way;
	public int DiaryAdded;
	public int diaryPage = 1;
	private Map<String, Object> request, session;
	@Autowired
	private StudentService studentService;
	@Autowired
	private StuPracticeService stuPracticeService;
	@Autowired
	private StuIntentionService stuIntentionService;
	@Autowired
	private StuDiaryService stuDiaryService;
	@Autowired
	private StuReportService stuReportService;
	@Autowired
	private StuSummaryService stusummaryService;

	public String toIntent() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(StrutsStatics.HTTP_REQUEST);
		HttpSession se = request.getSession();
		Student st = (Student) se.getAttribute("user");
		StuIntention sit = stuIntentionService.getEntityBySid(st.getSId());
		if (sit != null) {
			session.put("way", sit.getSInMode());
		}
		return SUCCESS;
	}

	public String intention() {
		StuIntention sti = new StuIntention();
		sti.setSId(id);
		sti.setSName(name);
		sti.setSSex(sex);
		sti.setSTel(tel);
		sti.setSInMode(way);
		session.put("intention", 1);
		if (stuIntentionService.getEntityBySid(id) != null) {
			StuIntention si = stuIntentionService.getEntityBySid(id);
			sti.setId(si.getId());
			stuIntentionService.updateEntity(sti);
		} else {
			stuIntentionService.saveEntity(sti);
		}

		return SUCCESS;
	}

	public String toPractice() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(StrutsStatics.HTTP_REQUEST);
		HttpSession se = request.getSession();
		Student st = (Student) se.getAttribute("user");
		StuPractice spt = stuPracticeService.getEntityById(st.getSId());
		if (spt != null) {
			session.put("stupra", spt);
			session.put("startdate",
					spt.getSStartdate().toString().substring(0, 10));
			session.put("enddate", spt.getSEnddate().toString()
					.substring(0, 10));
		}
		return SUCCESS;
	}

	public String practice() {
		StuPractice sp = new StuPractice();
		sp.setSId(id);
		sp.setSPraName(pra);
		sp.setSJob(job);
		sp.setSStartdate(start);
		sp.setSEnddate(end);
		session.put("practiced", 1);
		stuPracticeService.saveEntity(sp);
		return SUCCESS;
	}

	public String toDiary() throws ParseException {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(StrutsStatics.HTTP_REQUEST);
		HttpSession se = request.getSession();
		Student st = (Student) se.getAttribute("user");
		List<StuDiary> diaries = stuDiaryService.getEntityList(st.getSId());
		if (diaries != null) {
			session.put("diaries", diaries);
			int pagenum = 7;
			if (diaryPage < 1)
				diaryPage = 1;
			if (diaryPage > (diaries.size() - 1) / pagenum + 1)
				diaryPage = (diaries.size() - 1) / pagenum + 1;
			session.put("diaryPage", diaryPage);
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			String last = diaries.get(0).getDate().toString().substring(0, 10);
			String end = stuPracticeService.getEntityById(st.getSId())
					.getSEnddate().toString();
			String now = sf.format(new Date()).substring(0, 10);
			if (last.compareTo(now) >= 0 || end.compareTo(now) < 0)
				DiaryAdded = 1;
			else
				DiaryAdded = 0;
			session.put("DiaryAdded", DiaryAdded);
		}
		return SUCCESS;
	}

	public String toAddDiary() {
		return SUCCESS;
	}

	public String addDiary() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(StrutsStatics.HTTP_REQUEST);
		HttpSession se = request.getSession();
		Student st = (Student) se.getAttribute("user");
		StuDiary sd = new StuDiary();
		sd.setStuId(Integer.parseInt(st.getSId()));
		sd.setStuClass(st.getClass_());
		sd.setStuName(st.getName());
		sd.setStuMajor(st.getMajor());
		sd.setContent(content);
		sd.setTitle(title);
		date = new Date();
		sd.setDate(date);
		stuDiaryService.saveEntity(sd);
		return SUCCESS;
	}

	public String showDiary() {
		StuDiary sd = stuDiaryService.getEntityById(String.valueOf(did));
		session.put("diary", sd);
		return SUCCESS;
	}

	public String updateDiary() {
		StuDiary sd = stuDiaryService.getEntityById(id);
		sd.setContent(content);
		sd.setTitle(title);
		stuDiaryService.updateEntity(sd);
		return SUCCESS;
	}

	public String toReport() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(StrutsStatics.HTTP_REQUEST);
		HttpSession se = request.getSession();
		Student st = (Student) se.getAttribute("user");
		StuReport sr = stuReportService.getEntityById(st.getSId());
		if (sr != null) {
			session.put("report", sr);
		}
		return SUCCESS;
	}

	public String toSummary() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(StrutsStatics.HTTP_REQUEST);
		HttpSession se = request.getSession();
		Student st = (Student) se.getAttribute("user");
		StuSummary ss = stusummaryService.getEntityById(st.getSId());
		if (ss != null) {
			session.put("summary", ss);
		}
		return SUCCESS;
	}

	public String stuReport() {
		stuReportService.saveEntity(report);
		return SUCCESS;
	}

	public String stuSummary() {
		stusummaryService.saveEntity(summary);
		return SUCCESS;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPra() {
		return pra;
	}

	public void setPra(String pra) {
		this.pra = pra;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getWay() {
		return way;
	}

	public void setWay(int way) {
		this.way = way;
	}

	public int getDiaryPage() {
		return diaryPage;
	}

	public void setDiaryPage(int diaryPage) {
		this.diaryPage = diaryPage;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public StuReport getReport() {
		return report;
	}

	public void setReport(StuReport report) {
		this.report = report;
	}

	public StuSummary getSummary() {
		return summary;
	}

	public void setSummary(StuSummary summary) {
		this.summary = summary;
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		request = arg0;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		session = arg0;
	}

}

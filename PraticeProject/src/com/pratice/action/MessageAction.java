package com.pratice.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.pratice.entity.Admin;
import com.pratice.entity.Message;
import com.pratice.service.MessageService;
@Controller
@Scope("prototype")
public class MessageAction extends ActionSupport implements ModelDriven<Message>{
	private Integer page;
	private String id;
	private Message message;
	private File upload;
	private String uploadFileName;
	private String uploadContentType;
	private Integer msgType;
	@Autowired
	private MessageService messageService;
	public String listAllMessage() {
		HttpServletRequest request = ServletActionContext.getRequest();
		List<Message> list=null;
		Long count=null;
		if(msgType==-1) {
			list = messageService.getEntityList(page);
			count=messageService.getCount(null);
		}else if(msgType!=null) {
			list = messageService.getEntityList(page, msgType);
			count=messageService.getCount(msgType);
			request.setAttribute("msgType", msgType);
		}
		request.setAttribute("listmessages", list);
		request.setAttribute("count", count);
		request.setAttribute("pageCount",(int)Math.ceil(count*1.0/15) );
		request.setAttribute("page", page);
		return SUCCESS;
	}
	
	public String getMessageContent() {
		Message message = messageService.getEntityById(id);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("message", message);
		request.setAttribute("page", page);
		return SUCCESS;
	}
	
	public String pushMsg() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		Admin admin = (Admin) session.getAttribute("user");
		message.setAdmin(admin);
		if(upload!=null) {
			String root = ServletActionContext.getServletContext().getRealPath("/files");
			FileInputStream is = new FileInputStream(upload);
			
			File file = new File(root);
			if(!file.exists())
				file.mkdirs();
			FileOutputStream os = new FileOutputStream(new File(file, uploadFileName));
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			byte[] b = new byte[500];
			int length=0;
			while((length=bis.read(b, 0, b.length))!=-1) {
				os.write(b);
			}
			is.close();
			os.close();
			message.setFile(uploadFileName);
		}
		
		message.setDate(new Date());
		messageService.saveEntity(message);
		return SUCCESS;
	}
	public String deleteMessage() {
		messageService.deleteEntity(message);
		return SUCCESS;
	}
	public String getEditForm() {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("message", message);
		return SUCCESS;
	}
	public String updateMessage() throws Exception {
		message.setFile(null);
		if(upload!=null) {
			String root = ServletActionContext.getServletContext().getRealPath("/files");
			FileInputStream is = new FileInputStream(upload);
			
			File file = new File(root);
			if(!file.exists())
				file.mkdirs();
			FileOutputStream os = new FileOutputStream(new File(file, uploadFileName));
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			byte[] b = new byte[500];
			int length=0;
			while((length=bis.read(b, 0, b.length))!=-1) {
				os.write(b);
			}
			is.close();
			os.close();
			message.setFile(uploadFileName);
		}
		message.setDate(new Date());
		messageService.updateEntity(message);
		return SUCCESS;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public Integer getMsgType() {
		return msgType;
	}

	public void setMsgType(Integer msgType) {
		this.msgType = msgType;
	}

	@Override
	public Message getModel() {
		// TODO Auto-generated method stub
		if(id!=null) {
			message=messageService.getEntityById(id);
		}
		return null;
	}
	
	
}

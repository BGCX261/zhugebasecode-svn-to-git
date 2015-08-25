package com.log.mysite.dao.generic;

import com.log.mysite.dao.AttachmentDAO;
import com.log.mysite.dao.base.AbstractDAO;
import com.log.mysite.pojo.Attachment;

public class GenericAttachment  extends AbstractDAO implements AttachmentDAO{

	public void addAttachment(Attachment a) {
		this.save(a);
	}

	public void removeAttachement(Long id) {		
		
	}

	public Attachment selectAttachmentById(Long id) {		
		return null;
	}

	public void updateAttachment(Attachment a) {
		this.update(a);
	}

}

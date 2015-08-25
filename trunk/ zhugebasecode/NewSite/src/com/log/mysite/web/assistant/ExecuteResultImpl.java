package com.log.mysite.web.assistant;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class ExecuteResultImpl implements ExecuteResult {

	private String message;
	private Object object;
	private int state;
	private boolean succeed = false;

	public static final int SUCCESS_STATE = 1; // 成功
	public static final int NOT_LOGIN_STATE = 2; // 没有登陆
	public static final int UNAUTHORIZATION_ACCESS_STATE = 3; // 没有权限
	public static final int USER_DEFINE_STATE = 4; // 用户自定义错误
	public static final int INNER_ERROR_STATE = 5; // 内部错误

	public Document createXML(ObjectWrapper wrapper) {
		Document xmlfile = DocumentHelper.createDocument();
		Element root = xmlfile.addElement("root");
		Element resultEl = root.addElement("result");
		Element successEl = resultEl.addElement("success");
		Element stateEl = resultEl.addElement("state");
		Element infoEl = resultEl.addElement("message");
		if (this.isSuccess()) {
			successEl.setText("true");
		} else {
			successEl.setText("false");
		}
		stateEl.setText(this.state + "");
		if (this.message != null) {
			infoEl.setText(this.message);
		}
		if ((this.object != null) && (wrapper != null)) {
			Element userObjEl = root.addElement("userObj");
			wrapper.createObjectXML(userObjEl, this.object);
		}
		return xmlfile;
	}

	public String getMessage() {

		return this.message;
	}

	public Object getObject() {

		return this.object;
	}

	public int getState() {

		return this.state;
	}

	public boolean isSuccess() {

		return this.succeed;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void setSuccess(boolean succeed) {
		this.succeed = succeed;
	}

}

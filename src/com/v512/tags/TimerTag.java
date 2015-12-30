package com.v512.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TimerTag extends TagSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long start,end;

	@Override
	public int doEndTag() throws JspException {
		end=System.currentTimeMillis();
		long elapsed=end-start;
		try {
			JspWriter out=pageContext.getOut();
			out.println("running time:"+elapsed+"ms.");
			
		} catch (IOException e) {
			// TODO: handle exception
			throw new JspTagException();
		}
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		start=System.currentTimeMillis();
		
		return EVAL_BODY_INCLUDE;
	}
	
	

}

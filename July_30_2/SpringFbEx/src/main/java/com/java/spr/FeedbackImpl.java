package com.java.spr;

public class FeedbackImpl implements Feedback {

	private String sqlFb;
	private String uiFb;
	private String genFb;
	
	public String getSqlFb() {
		return sqlFb;
	}

	public void setSqlFb(String sqlFb) {
		this.sqlFb = sqlFb;
	}

	public String getUiFb() {
		return uiFb;
	}

	public void setUiFb(String uiFb) {
		this.uiFb = uiFb;
	}

	public String getGenFb() {
		return genFb;
	}

	public void setGenFb(String genFb) {
		this.genFb = genFb;
	}

	@Override
	public String fbInfo() {
		return "Sql Fb " +sqlFb + " Ui Fb " +uiFb +
				" Gen Fb " +genFb;
				
	}

}

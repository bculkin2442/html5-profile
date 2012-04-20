package org.bjculk.demo;

public final class AppletGUIDoer implements Runnable {
	/**
	 * 
	 */
	private final DemoMain demoMain;
	private String message;

	public AppletGUIDoer(DemoMain demoMainz, String messagez) {
		super();
		this.demoMain = demoMainz;
		setMessage(messagez);
	}

	public String getMessage() {
		return this.message;
	}

	@Override
	public void run() {
		// add(new JLabel(message));
		this.demoMain.add(new DemoTabs());
	}

	public void setMessage(String messagez) {
		this.message = messagez;
	}
}
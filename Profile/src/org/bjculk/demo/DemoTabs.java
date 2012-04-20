package org.bjculk.demo;

import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

public class DemoTabs extends JTabbedPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1256848615144437307L;

	public DemoTabs() {
		super();
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				addTab("About Me", new MePanel());

			}
		});
	}
}

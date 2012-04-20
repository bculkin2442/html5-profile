package org.bjculk.demo;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public final class MePanelInit implements Runnable {
	/**
	 * 
	 */
	private final MePanel mePanel;

	public MePanelInit(MePanel mePanelz) {
		this.mePanel = mePanelz;
	}

	@Override
	public void run() {
		final BorderLayout layout = new BorderLayout();
		final JPanel jpn = new MeCenter();
		final String title = "<html><h1>About me. Now <u>with</u>&nbsp; <em>100%</em> more HTML!</h1></html>";
		layout.addLayoutComponent(new JLabel(title), BorderLayout.NORTH);
		layout.addLayoutComponent(jpn, BorderLayout.CENTER);
		this.mePanel.setLayout(layout);
		this.mePanel.add(jpn, BorderLayout.CENTER);
		this.mePanel.add(new JLabel(title, SwingConstants.CENTER),
				BorderLayout.NORTH);

	}
}
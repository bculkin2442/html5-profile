package org.bjculk.demo;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6734929835839212910L;

	public MePanel() {
		super();
		SwingUtilities.invokeLater(new MePanelInit(this));
	}
}

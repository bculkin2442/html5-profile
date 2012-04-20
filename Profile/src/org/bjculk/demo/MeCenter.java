package org.bjculk.demo;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MeCenter extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5726088803060072735L;

	public MeCenter() {
		SwingUtilities.invokeLater(new MeCenterInit(this));
	}
}

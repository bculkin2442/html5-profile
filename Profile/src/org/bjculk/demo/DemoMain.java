/**
 * 
 */
package org.bjculk.demo;

import javax.swing.JApplet;
import javax.swing.SwingUtilities;

//import javax.swing.JLabel;

/**
 * @author cromer33
 * 
 */
public class DemoMain extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2101834924305255893L;

	/**
	 * @param args
	 */
	@Override
	public void init() {
		super.init();
		try {
			SwingUtilities.invokeLater(new AppletGUIDoer(this, "Hello World"));
		} catch (final Exception e) {
			// TODO: handle exception
		}
	}

}

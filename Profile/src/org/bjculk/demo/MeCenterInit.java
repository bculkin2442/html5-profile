package org.bjculk.demo;

import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public final class MeCenterInit implements Runnable {
	private final class DefaultLinkListener implements HyperlinkListener {
		private final JEditorPane editorPane;

		DefaultLinkListener(JEditorPane editorPanez) {
			this.editorPane = editorPanez;
		}

		@Override
		public void hyperlinkUpdate(HyperlinkEvent arg0) {
			try {
				this.editorPane.setPage(arg0.getURL());
			} catch (final IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * 
	 */
	private final MeCenter meCenter;

	/**
	 * @param meCenterz
	 */
	MeCenterInit(MeCenter meCenterz) {
		this.meCenter = meCenterz;
	}

	@Override
	public void run() {
		final JEditorPane editorPane = new JEditorPane();
		editorPane.addHyperlinkListener(new DefaultLinkListener(editorPane));
		editorPane.setEditorKit(editorPane
				.getEditorKitForContentType("text/html"));
		editorPane.setBorder(BorderFactory.createRaisedBevelBorder());
		final BoxLayout layout = new BoxLayout(this.meCenter, BoxLayout.Y_AXIS);
		this.meCenter.setLayout(layout);
		this.meCenter.add(new JLabel("Browse sample html"));
		this.meCenter.add(editorPane);
	}
}
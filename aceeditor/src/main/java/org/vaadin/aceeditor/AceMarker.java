package org.vaadin.aceeditor;

import org.vaadin.aceeditor.client.AceClientMarker;

/**
 * 
 * Ace marker.
 * 
 * The cssClass must be defined in some css file. Example:
 * 
 * .ace_marker-layer .mymarker1 {
 *		background: red;
 *  	border-bottom: 2px solid black;
 *  	position: absolute;
 *  }
 *
 */
@SuppressWarnings("serial")
public class AceMarker extends AceClientMarker {
	public AceMarker(AceRange range, String cssClass, Type type, boolean inFront, OnTextChange onChange) {
		this.range = range.isBackwards() ? range.reversed() : range;
		this.cssClass = cssClass;
		this.type = type;
		this.inFront = inFront;
		this.onChange = onChange;
	}
}

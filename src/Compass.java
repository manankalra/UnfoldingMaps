/*
 * Adding a compass
 * 
 * @author Manan Kalra
 */

import de.fhpotsdam.unfolding.*;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.*;
import de.fhpotsdam.unfolding.providers.*;
import de.fhpotsdam.unfolding.utils.*;
import processing.core.*;
import de.fhpotsdam.unfolding.ui.CompassUI;

public class Compass extends PApplet{
	UnfoldingMap map;
	CompassUI compass;
	public void setup(){
		size(800, 600);
		map = new UnfoldingMap(this, 0, 0, 800, 600, new Google.GoogleTerrainProvider());
		compass = new CompassUI(this, map);
		MapUtils.createDefaultEventDispatcher(this, map);
	}
	public void draw(){
		map.draw();
		compass.draw();
	}
}

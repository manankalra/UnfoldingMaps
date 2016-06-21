/*
 * Basic use of the UnfoldingMap library
 * 
 * @author Manan Kalra
 */

import de.fhpotsdam.unfolding.*;
import de.fhpotsdam.unfolding.providers.*;
import de.fhpotsdam.unfolding.utils.*;
import processing.core.*;

public class basic extends PApplet{
	UnfoldingMap map;
	public void setup(){
		size(800, 600);
		AbstractMapProvider provider = new Google.GoogleMapProvider(); 
		map = new UnfoldingMap(this, 0, 0, 800, 600, provider);
		MapUtils.createDefaultEventDispatcher(this, map); //adds interactivity of the map with mouse and keyboard
	}
	public void draw(){
		map.draw();
	}
	
	
}

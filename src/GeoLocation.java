/*
 * Converting a screen position to a location
 * Displaying the geo-position of the mouse pointer
 * Showing latitude and longitude
 * 
 * Zooming into UPES, Dehradun, Uttarakhand, India
 * Restricting interactions to 30 km
 * Zooming restrictions are also specified
 * 
 * @author Manan Kalra
 */

import de.fhpotsdam.unfolding.*;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.providers.*;
import de.fhpotsdam.unfolding.utils.*;
import processing.core.*;

public class GeoLocation extends PApplet{
	UnfoldingMap map;
	int zoomLevel = 20;
	Location Dehradun = new Location(30.416771f, 77.9661903f);
	float maxPanningDistance = 30; //in km
	int down = 15;
	int up = 25;
	public void setup(){
		size(800, 600);
		AbstractMapProvider provider = new Microsoft.AerialProvider();
		map = new UnfoldingMap(this, 0, 0, 800, 600, provider);
		MapUtils.createDefaultEventDispatcher(this, map); //adds interactivity of the map with mouse and keyboard
		map.zoomAndPanTo(zoomLevel, Dehradun); //for showing a particular location
		map.setPanningRestriction(Dehradun, maxPanningDistance); //restricting the map interactions if we only have data for a specific area
	    map.setZoomRange(down, up); //zooming restrictions
		map.setTweening(true);// for simple animations between different zoom levels
	}
	public void draw(){
		map.draw();
		Location location = map.getLocation(mouseX, mouseY);
		fill(0); //black color
		textSize(24);
		text(location.getLat() + ", " + location.getLon(), mouseX, mouseY);
	}
}

/*
 * Creating custom markers
 * 
 * @author Manan Kalra
 */

import de.fhpotsdam.unfolding.*;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.*;
import de.fhpotsdam.unfolding.providers.*;
import de.fhpotsdam.unfolding.utils.*;
import processing.core.*;

public class OwnMarker extends PApplet{
	UnfoldingMap map;
	SimplePointMarker bhiwaniMarker;
	Location Dehradun = new Location(30.416771f, 77.9661903f);
	Location Bhiwani = new Location(28.7990f, 76.1335f);
	public void setup(){
		size(800, 600);
		map = new UnfoldingMap(this, 0, 0, 800, 600, new StamenMapProvider.Toner());
		MapUtils.createDefaultEventDispatcher(this, map);
		map.zoomAndPanTo(6, new Location(20.5937f, 78.9629f));
		bhiwaniMarker = new SimplePointMarker(Bhiwani);
		//map.addMarkers(bhiwaniMarker); //marker should not be added to the map
	}
	public void draw(){
		map.draw();
		ScreenPosition bhiwaniPos = bhiwaniMarker.getScreenPosition(map);
		strokeWeight(10);
		stroke(67, 211, 227, 100);
		noFill();
		ellipse(bhiwaniPos.x, bhiwaniPos.y, 20, 20);
    }
}

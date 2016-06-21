/*
 * Adding markers to desired places in India
 * 
 * @author Manan Kalra
 */
import de.fhpotsdam.unfolding.*;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.*;
import de.fhpotsdam.unfolding.providers.*;
import de.fhpotsdam.unfolding.utils.*;
import processing.core.*;
public class Marker extends PApplet{
	UnfoldingMap map;
	Location Dehradun = new Location(30.416771f, 77.9661903f);
	Location Bhiwani = new Location(28.7990f, 76.1335f);
	public void setup(){
		size(800, 600);
		map = new UnfoldingMap(this, 0, 0, 800, 600, new Google.GoogleMapProvider());
		MapUtils.createDefaultEventDispatcher(this, map);
		map.zoomAndPanTo(6, new Location(20.5937f, 78.9629f));
		SimplePointMarker dehradunMarker = new SimplePointMarker(Dehradun);
		SimplePointMarker bhiwaniMarker = new SimplePointMarker(Bhiwani);
		map.addMarkers(dehradunMarker, bhiwaniMarker);
	}
	public void draw(){
		map.draw();
	}

}

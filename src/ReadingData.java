/*
 * Reading GeoJSON or RSS file
 * 
 * @author Manan Kalra
 */


import processing.core.*;
import java.util.List;
import de.fhpotsdam.unfolding.*;
import de.fhpotsdam.unfolding.utils.*;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.data.GeoJSONReader;
import de.fhpotsdam.unfolding.data.GeoRSSReader;
import de.fhpotsdam.unfolding.data.Feature;

public class ReadingData extends PApplet{
	UnfoldingMap map;
	String rssUrl = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/4.5_week.atom";
	public void setup(){
		size(800, 600, OPENGL);
		map = new UnfoldingMap(this, 0, 0, 800, 600);
		MapUtils.createDefaultEventDispatcher(this, map);
		List<Feature> countries = GeoJSONReader.loadData(this, "countries.geo.json"); //creating a list of type Feature, reading data from the JSON file
		//List<Feature> countries = GeoRSSReader.loadDataGeoRSS(this, rssUrl); //creating a list of type Feature,reading data from the RSS file
		List<Marker> countryMarkers = MapUtils.createSimpleMarkers(countries); //creating a list of type Marker, a Marker marks a country on the map
	    map.addMarkers(countryMarkers); //adding markers to the map
	}
	public void draw(){
		map.draw();
	}
}
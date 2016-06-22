/*
 * Switching between maps dynamically
 * 
 * @author Manan Kalra
 */

import de.fhpotsdam.unfolding.*;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.*;
import de.fhpotsdam.unfolding.providers.*;
import de.fhpotsdam.unfolding.utils.*;
import processing.core.*;

public class MapSwitch extends PApplet{
	UnfoldingMap map1;
	UnfoldingMap map2;
	UnfoldingMap currentMap;
	public void setup(){
		size(800, 600);
		map1 = new UnfoldingMap(this, 0, 0 , 800, 600, new Google.GoogleMapProvider());
		map2 = new UnfoldingMap(this, 0, 0 , 800, 600, new Microsoft.HybridProvider());
		MapUtils.createDefaultEventDispatcher(this, map1, map2);
		map2.zoomAndPanTo(10, new Location(30.2204f, 40.3434f));
		currentMap = map1;
	}
	public void draw(){
		currentMap.draw();
	}
	public void keyPressed(){
		if(key == '1'){
			currentMap = map1;
		}
		else if(key == '2'){
			currentMap = map2;
		}
		else{
			System.out.println("Press a valid key.");
		}
	}
}

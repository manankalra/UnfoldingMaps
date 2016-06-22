/*
 * Switching between providers dynamically
 * 
 * @author Manan Kalra
 */

import de.fhpotsdam.unfolding.*;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.*;
import de.fhpotsdam.unfolding.providers.*;
import de.fhpotsdam.unfolding.utils.*;
import processing.core.*;

public class ProviderSwitch extends PApplet{
	UnfoldingMap map;
	AbstractMapProvider provider1;
	AbstractMapProvider provider2;
	public void setup(){
		size(800, 600);
		provider1 = new Google.GoogleMapProvider();
		provider2 = new Microsoft.AerialProvider();
		map = new UnfoldingMap(this, 0, 0, 800, 600, provider1);
		MapUtils.createDefaultEventDispatcher(this, map);
	}
	public void draw(){
		map.draw();
	}
	public void keyPressed(){
		if(key == '1'){
			map.mapDisplay.setProvider(provider1);
		}
		else if(key == '2'){
			map.mapDisplay.setProvider(provider2);
		}
		else{
			System.out.println("Press a valid key.");
		}
	}
}

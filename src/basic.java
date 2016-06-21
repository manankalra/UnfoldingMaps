import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.*;
import processing.core.*;

public class basic extends PApplet{
	UnfoldingMap map;
	public void setup(){
		size(800, 600);
		AbstractMapProvider provider = new Google.GoogleMapProvider();
		map = new UnfoldingMap(this, 0, 0, 800, 600, provider);
	}
	public void draw(){
		map.draw();
	}
	
	
}

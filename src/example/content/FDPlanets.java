package example.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.graphics.*;
import mindustry.graphics.g3d.*;
import mindustry.maps.planet.*;
import mindustry.type.*;
import mindustry.content.*;

public class FDPlanets implements ContentList {
	public static Planet gluon;

	@Override
	public void load() {
		gluon = new Planet("gluon", Planets.sun, 4, 0.87f) {{
			localizedName = "Gluon";
			generator = new SerpuloPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 6);
            atmosphereColor = Color.valueOf("ff7a38");
            atmosphereRadIn = 0.02f;
            atmosphereRadOut = 0.15f;
            startSector = 15;
            alwaysUnlocked = true;
		}};
	}
}

package example.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.graphics.*;
import mindustry.graphics.g3d.*;
import mindustry.maps.planet.*;
import mindustry.type.*;

public class FDPlanets implements ContentList {
	public static Planet gluon;

	@Override
	public void load() {
		gluon = new Planet("gluon", Planets.sun, 4, 0.87f) {{
			localizedName = "Gluon";
			generator = new SerpuloPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 6);
      //Copied by Serpulo
            cloudMeshLoader = () -> new MultiMesh(
                new HexSkyMesh(this, 11, 0.15f, 0.13f, 5, new Color().set(Pal.spore).mul(0.9f).a(0.75f), 2, 0.45f, 0.9f, 0.38f),
                new HexSkyMesh(this, 1, 0.6f, 0.16f, 5, Color.white.cpy().lerp(Pal.spore, 0.55f).a(0.75f), 2, 0.45f, 1f, 0.41f)
            );
            atmosphereColor = Color.valueOf("ff7a38");
            atmosphereRadIn = 0.02f;
            atmosphereRadOut = 0.15f;
            startSector = 15;
            alwaysUnlocked = true;
		}};
	}
}

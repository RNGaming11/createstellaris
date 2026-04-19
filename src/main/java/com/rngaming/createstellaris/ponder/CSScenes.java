package com.rngaming.createstellaris.ponder;

import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;

import net.minecraft.core.Direction;


public class CSScenes {
    public static void CoalGenPonder(SceneBuilder scene, SceneBuildingUtil util) {
    scene.title("coalgeneratorponder", "Generating Power with Coal Generator");
    scene.showBasePlate();
    scene.idle(20); // Give it a second to fade in

    // This makes sure the rest of the schematic (the generator) appears
    scene.world().showSection(util.select().layersFrom(1), Direction.DOWN);
    scene.idle(40); // Keep the scene open for 2 more seconds
}
}



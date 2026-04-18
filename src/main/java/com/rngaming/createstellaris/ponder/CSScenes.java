package com.rngaming.createstellaris.ponder;

import com.simibubi.create.content.contraptions.actors.psi.PortableItemInterfaceBlockEntity;
import com.simibubi.create.foundation.ponder.CreateSceneBuilder;
import net.createmod.catnip.data.Iterate;
import net.createmod.ponder.api.PonderPalette;
import net.createmod.ponder.api.element.ElementLink;
import net.createmod.ponder.api.element.ParrotElement;
import net.createmod.ponder.api.element.ParrotPose;
import net.createmod.ponder.api.element.WorldSectionElement;
import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;
import net.createmod.ponder.api.scene.Selection;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.LecternBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class CSScenes {
    public static class CoalGenPonder {
        public static void spring(SceneBuilder builder, SceneBuildingUtil util) {
            CreateSceneBuilder scene = new CreateSceneBuilder(builder);
            scene.title("coalgeneratorponder", "Using the Coal Generator");
            BlockPos CoalGenPos = util.grid().at(1, 1, 2);
            scene.configureBasePlate(0, 0, 5);

            scene.idle(5);
            scene.world().showSection(util.select().position(5, 1, 2), Direction.DOWN);
            scene.idle(10);

            scene.overlay().showText(50)
                    .placeNearTarget()
                    .text("When Coal is inserted in the Coal Generator it will Generate Power")
                    .attachKeyFrame()
                    .pointAt(util.vector().of(1, 1, 2));
            scene.effects().indicateSuccess(CoalGenPos);


        }
        public static void Test(SceneBuilder builder, SceneBuildingUtil util){
        }
    }

}


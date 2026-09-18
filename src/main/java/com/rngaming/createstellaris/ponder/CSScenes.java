package com.rngaming.createstellaris.ponder;

import com.st0x0ef.stellaris.common.blocks.machines.PowerBankBlock;
import com.st0x0ef.stellaris.common.registry.BlocksRegistry;
import com.st0x0ef.stellaris.common.registry.ItemsRegistry;
import net.createmod.catnip.math.Pointing;
import net.createmod.ponder.api.PonderPalette;
import net.createmod.ponder.api.element.ElementLink;
import net.createmod.ponder.api.element.WorldSectionElement;
import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;
import net.minecraft.core.Direction;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;

public class CSScenes {
    public static void CoalGenPonder(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("coalgeneratorponder", "Generating Power with Coal Generator");
        scene.showBasePlate();
        scene.configureBasePlate(0, 0, 3);
        scene.world().showSection(util.select().layer(0), Direction.DOWN);
        scene.world().showSection(util.select().layer(1), Direction.DOWN);
        scene.idle(10);
        scene.rotateCameraY(120);
        scene.idle(40);
        BlockPos CoalGen = util.grid().at(3, 2, 2);
        BlockPos Cable = util.grid().at(3, 0, 1);

        scene.overlay().showText(100)
                .colored(PonderPalette.BLUE)
                .text("Insert Coal to start generating power.")
                .pointAt(CoalGen.getCenter())
                        .attachKeyFrame();


        scene.idle(100);
        scene.rotateCameraY(160);
        scene.idle(40);
        scene.overlay().showText(100)
                .colored(PonderPalette.BLUE)
                .text("When Coal is in the machine place Cables on the back and they will transfer power to machines.")
                .pointAt(Cable.getCenter())
        .attachKeyFrame();
        scene.idle(110);

    }
    public static void DieselGenPonder(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("dieselgeneratorponder", "Generating Power with Diesel Generator");
        scene.showBasePlate();
        scene.configureBasePlate(0, 0, 3);
        scene.world().showSection(util.select().layer(0), Direction.DOWN);
        scene.world().showSection(util.select().layer(1), Direction.DOWN);
        scene.idle(10);
        scene.rotateCameraY(120);
        scene.idle(40);
        BlockPos RadioGen = util.grid().at(3, 2, 2);
        BlockPos Cable = util.grid().at(3, 0, 1);

        scene.overlay().showText(100)
                .colored(PonderPalette.BLUE)
                .text("Insert a diesel bucket to start generating power.")
                .pointAt(RadioGen.getCenter())
                .attachKeyFrame();


        scene.idle(100);
        scene.rotateCameraY(160);
        scene.idle(40);
        scene.overlay().showText(100)
                .colored(PonderPalette.BLUE)
                .text("When a diesel bucket is in the machine place Cables on the back and they will transfer power to machines.")
                .pointAt(Cable.getCenter())
                .attachKeyFrame();
        scene.idle(100);

    }
    public static void RadioactiveGenPonder(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("radioactivegeneratorponder", "Generating Power with Coal Generator");
        scene.showBasePlate();
        scene.configureBasePlate(0, 0, 3);
        scene.world().showSection(util.select().layer(0), Direction.DOWN);
        scene.world().showSection(util.select().layer(1), Direction.DOWN);
        scene.idle(10);
        scene.rotateCameraY(120);
        scene.idle(40);
        BlockPos RadioGen = util.grid().at(3, 2, 2);
        BlockPos Cable = util.grid().at(3, 0, 1);

        scene.overlay().showText(100)
                .colored(PonderPalette.BLUE)
                .text("Insert a Uranium ingot or block to start generating power.")
                .pointAt(RadioGen.getCenter())
                .attachKeyFrame();

        scene.idle(120);

        scene.overlay().showText(60)
                .colored(PonderPalette.GREEN)
                .text("The Radioactive Generator can generate maximum 500Fe/Tick.")
                .pointAt(RadioGen.getCenter())
                .attachKeyFrame();
        scene.idle(60);

        scene.rotateCameraY(160);
        scene.idle(40);
        scene.overlay().showText(100)
                .colored(PonderPalette.BLUE)
                .text("When a Uranium ingot or block is in the machine place Cables on the back and they will transfer power to machines.")
                .pointAt(Cable.getCenter())
                .attachKeyFrame();
        scene.idle(100);
    }
    public static void solarpanelponder(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("solarpanelponder", "Generating Power with a Solar panel.");
        scene.showBasePlate();
        scene.configureBasePlate(0, 0, 3);
        scene.world().showSection(util.select().layer(0), Direction.DOWN);
        scene.world().showSection(util.select().layer(1), Direction.DOWN);
        scene.idle(10);
        scene.rotateCameraY(120);
        scene.idle(40);
        BlockPos Solarpanel = util.grid().at(3, 2, 2);
        BlockPos Cable = util.grid().at(3, 0, 1);

        scene.overlay().showText(120)
                .colored(PonderPalette.BLUE)
                .text("When the Solar Panel is placed in day time it will start generating power.")
                .pointAt(Solarpanel.getCenter())
                .attachKeyFrame();

        scene.idle(140);

        scene.overlay().showText(60)
                .colored(PonderPalette.GREEN)
                .text("The Solar Panel can generate maximum 1Fe/Tick.")
                .pointAt(Solarpanel.getCenter())
                .attachKeyFrame();
        scene.idle(60);
        scene.rotateCameraY(160);
        scene.idle(40);
        scene.overlay().showText(100)
                .colored(PonderPalette.BLUE)
                .text("When the Solar Panel is generating power place Cables on the back and they will transfer power to machines.")
                .pointAt(Cable.getCenter())
                .attachKeyFrame();
        scene.idle(100);
    }
    public static void WaterPumpPonder(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("waterpumpponder", "Using the Water Pump");
        scene.showBasePlate();
        scene.configureBasePlate(0, 0, 7);
        scene.world().showSection(util.select().layer(0), Direction.DOWN);
        scene.world().showSection(util.select().layer(1), Direction.DOWN);
        scene.world().showSection(util.select().layer(2), Direction.DOWN);
        scene.idle(10);
        scene.rotateCameraY(120);
        scene.idle(40);
        BlockPos Pump = util.grid().at(3, 2, 3);
        BlockPos CoalGen = util.grid().at(3, 0, 0);
        BlockPos Pipe = util.grid().at(3, 2, 4);

        scene.overlay().showText(100)
                .colored(PonderPalette.BLUE)
                .text("Place the water pump above a infinite water source.")
                .pointAt(Pump.getCenter())
                .attachKeyFrame();

        scene.idle(120);

        scene.overlay().showText(70)
                .colored(PonderPalette.GREEN)
                .text("Then give it a power source.")
                .pointAt(CoalGen.getCenter())
                .attachKeyFrame();
        scene.idle(90);



        scene.overlay().showText(80)
                .colored(PonderPalette.BLUE)
                .text("The water pump should start pumping water.")
                .pointAt(Pump.getCenter())
                .attachKeyFrame();
        scene.idle(100);
        scene.rotateCameraY(160);
        scene.idle(20);
        scene.overlay().showText(120)
                .colored(PonderPalette.BLUE)
                .text("Attach any tier pipe to the Water pump and it will pump it into the pipe and into a attached machine.")
                .pointAt(Pipe.getCenter())
                .attachKeyFrame();
        scene.idle(120);
    }
    public static void OxygendisPonder(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("oxygendisponder", "Using the Oxygen Distributor.");
        scene.showBasePlate();
        scene.configureBasePlate(0, 0, 7);
        scene.world().showSection(util.select().layer(0), Direction.DOWN);
        scene.world().showSection(util.select().layer(1), Direction.DOWN);
        scene.world().showSection(util.select().layer(2), Direction.DOWN);
        scene.world().showSection(util.select().layer(3), Direction.DOWN);
        scene.idle(10);
        scene.rotateCameraY(90);
        scene.idle(40);
        BlockPos Oxygendis = util.grid().at(3, 1, 3);
        BlockPos Glass1 = util.grid().at(4, 1, 1);
        BlockPos Glass2 = util.grid().at(4, 2, 1);
        BlockPos Glass3 = util.grid().at(5, 1, 1);
        BlockPos Glass4 = util.grid().at(5, 2, 1);
        BlockPos Glass5 = util.grid().at(5, 1, 2);
        BlockPos Glass6 = util.grid().at(5, 2, 2);
        BlockPos Glass7 = util.grid().at(4, 3, 2);

        scene.world().destroyBlock(Glass1);
        scene.world().destroyBlock(Glass2);
        scene.world().destroyBlock(Glass3);
        scene.world().destroyBlock(Glass4);
        scene.world().destroyBlock(Glass5);
        scene.world().destroyBlock(Glass6);
        scene.world().destroyBlock(Glass7);

scene.idle(20);

        scene.overlay().showText(120)
                .colored(PonderPalette.BLUE)
                .text("The Oxygen Distributor when placed in a closed area it can provide oxygen.")
                .pointAt(Oxygendis.getCenter())
                .attachKeyFrame();
scene.idle(140);

        scene.overlay().showText(100)
                .colored(PonderPalette.GREEN)
                .text("It can only make the oxygen if it has power and oxygen in the machine.")
                .pointAt(Oxygendis.getCenter())
                .attachKeyFrame();
        scene.idle(120);
        scene.overlay().showText(100)
                .colored(PonderPalette.RED)
                .text("NOTE this block doesnt always work this ponder is just to show how it works not if it works.")
                .pointAt(Oxygendis.getCenter())
                .attachKeyFrame();
        scene.idle(120);
        scene.world().setBlock(Glass1, Blocks.GLASS.defaultBlockState(), true);
        scene.world().setBlock(Glass2, Blocks.GLASS.defaultBlockState(), true);
        scene.world().setBlock(Glass3, Blocks.GLASS.defaultBlockState(), true);
        scene.world().setBlock(Glass4, Blocks.GLASS.defaultBlockState(), true);
        scene.world().setBlock(Glass5, Blocks.GLASS.defaultBlockState(), true);
        scene.world().setBlock(Glass6, Blocks.GLASS.defaultBlockState(), true);
        scene.world().setBlock(Glass7, Blocks.GLASS.defaultBlockState(), true);
        scene.idle(20);
    }
    public static void CablePonder(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("cableponder", "Transfering Power with Cables");
        scene.showBasePlate();
        scene.configureBasePlate(0, 0, 3);
        scene.world().showSection(util.select().layer(0), Direction.DOWN);
        scene.world().showSection(util.select().layer(1), Direction.DOWN);
        scene.idle(10);
        scene.rotateCameraY(120);
        scene.idle(40);
        BlockPos Cable = util.grid().at(3, 3, 1);

        scene.overlay().showText(80)
                .colored(PonderPalette.BLUE)
                .text("A cable can transport power to attached machines.")
                .pointAt(Cable.getCenter())
                .attachKeyFrame();

        scene.idle(100);
    }
    public static void PumpjackPonder(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pumpjackponder", "Using the Pumpjack");
        scene.showBasePlate();
        scene.configureBasePlate(0, 0, 5);
        scene.world().showSection(util.select().layer(0), Direction.DOWN);
        scene.world().showSection(util.select().layer(1), Direction.DOWN);
        scene.idle(40);
        BlockPos Pumpjack = util.grid().at(3, 0, 3);
        BlockPos CoalGen = util.grid().at(3, 0, 0);

        scene.overlay().showText(80)
                .colored(PonderPalette.BLUE)
                .text("The Pumpjack needs to be placed on a block that has oil.")
                .pointAt(Pumpjack.getCenter())
                .attachKeyFrame();

        scene.idle(100);

        scene.overlay().showText(70)
                .colored(PonderPalette.BLUE)
                .text("you can find oil using the oil finder.")
                .pointAt(Pumpjack.getCenter())
                .attachKeyFrame();
        scene.idle(90);
        scene.rotateCameraY(120);
        scene.idle(40);
        scene.overlay().showText(70)
                .colored(PonderPalette.GREEN)
                .text("The Pumpjack needs a power source to work.")
                .pointAt(CoalGen.getCenter())
                .attachKeyFrame();
        scene.idle(90);
    }
    public static void Pipeponder(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("pipeponder", "Using the pipes");
        scene.showBasePlate();
        scene.configureBasePlate(0, 0, 5);
        scene.world().showSection(util.select().layer(0), Direction.DOWN);
        scene.world().showSection(util.select().layer(1), Direction.DOWN);
        scene.world().showSection(util.select().layer(2), Direction.DOWN);
        scene.idle(10);
        scene.rotateCameraY(120);
        scene.idle(40);
        BlockPos Pipe = util.grid().at(3, 3, 1);
        BlockPos Waterseperator = util.grid().at(3, 2, 0);

        scene.overlay().showText(100)
                .colored(PonderPalette.BLUE)
                .text("Place down any tier off pipe next to a water pump.")
                .pointAt(Pipe.getCenter())
                .attachKeyFrame();

        scene.idle(120);

        scene.overlay().showText(120)
                .colored(PonderPalette.BLUE)
                .text("Make sure the pipe is connected to a machine that can take water.")
                .pointAt(Waterseperator.getCenter())
                .attachKeyFrame();
        scene.idle(140);
    }
    public static void Fluidtanks(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("fluidtankponder", "Using the fluid tanks");
        scene.showBasePlate();
        scene.configureBasePlate(0, 0, 4);
        scene.world().showSection(util.select().layer(0), Direction.DOWN);
        scene.world().showSection(util.select().layer(1), Direction.DOWN);
        scene.world().showSection(util.select().layer(2), Direction.DOWN);
        scene.idle(10);
        scene.rotateCameraY(120);
        scene.idle(40);
        BlockPos fluid_tank = util.grid().at(2, 1, 3);

        scene.overlay().showText(100)
                .colored(PonderPalette.BLUE)
                .text("Place down any tier of fluid tank.")
                .pointAt(fluid_tank.getCenter())
                .attachKeyFrame();

        scene.idle(120);
        scene.overlay().showText(100)
                .colored(PonderPalette.BLUE)
                .text("The fluid tank canstore fluids inside.")
                .pointAt(fluid_tank.getCenter())
                .attachKeyFrame();

        scene.idle(120);

        scene.overlay().showText(100)
                .colored(PonderPalette.BLUE)
                .text("Now give it fluids and it will store it")
                .pointAt(fluid_tank.getCenter())
                .attachKeyFrame();
        scene.idle(120);
    }
    public static void powerbankponderstore(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("powerbankponderstore", "Store energy in the power bank.");
        scene.showBasePlate();
        scene.configureBasePlate(0, 0, 3);
        scene.world().showSection(util.select().layer(0), Direction.DOWN);
        scene.world().showSection(util.select().layer(1), Direction.DOWN);
        scene.idle(10);
        scene.rotateCameraY(120);
        scene.idle(40);
        BlockPos CoalGen = util.grid().at(3, 2, 2);
        BlockPos Powerbank = util.grid().at(3, 2, 0);

        scene.overlay().showText(100)
                .colored(PonderPalette.BLUE)
                .text("Give the power bank energy to store energy in the power bank.")
                .pointAt(Powerbank.getCenter())
                .attachKeyFrame();

        scene.idle(100);
    }
    public static void powerbankponderuse(SceneBuilder scene, SceneBuildingUtil util) {
        scene.title("powerbankponderuse", "How to take power out the power bank.");
        scene.showBasePlate();
        scene.configureBasePlate(0, 0, 3);
        scene.world().showSection(util.select().layer(0), Direction.DOWN);
        scene.world().showSection(util.select().layer(1), Direction.DOWN);
        scene.idle(10);
        scene.rotateCameraY(120);
        scene.idle(40);
        BlockPos targetPos = util.grid().at(3, 2, 1);
        ItemStack suit = new ItemStack(ItemsRegistry.SPACESUIT_SUIT.get());
        BlockPos Powerbank = util.grid().at(3, 2, 1);

        scene.overlay().showText(100)
                .colored(PonderPalette.BLUE)
                .text("When the power bank has energy you can put stuff inside it.")
                .pointAt(Powerbank.getCenter())
                .attachKeyFrame();
        scene.idle(120);
        scene.overlay().showControls(util.vector().topOf(targetPos), Pointing.DOWN, 60).rightClick()
                .withItem(suit);
        scene.idle(70);
        scene.overlay().showText(90)
                .colored(PonderPalette.BLUE)
                .text("Now it will start giving the item inside power.")
                .pointAt(Powerbank.getCenter())
                .attachKeyFrame();
        scene.idle(100);
    }
}



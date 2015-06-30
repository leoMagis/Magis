package com.github.leomagis.magis;

import com.github.leomagis.magis.block.BlockEvercrystal;
import com.github.leomagis.magis.block.BlockFusionStation;
import com.github.leomagis.magis.entity.tile.TileFusionStation;
import com.github.leomagis.magis.enums.EnumCompoundType;
import com.github.leomagis.magis.item.ItemCrystalShard;
import com.github.leomagis.magis.item.ItemElementalCompound;
import com.github.leomagis.magis.proxy.CommonProxy;
import com.github.leomagis.magis.recipe.FusionRecipeRegistry;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Magis.MODID, name = Magis.NAME, version = Magis.VERSION)
@SuppressWarnings("unused")
public class Magis {

    public static final String MODID = "magis";
    public static final String NAME = "Magis";
    public static final String VERSION = "0.2.2";

    public static SimpleNetworkWrapper networkWrapper;

    //block declaration
    public static BlockEvercrystal evercrystal;
    public static BlockFusionStation fusionStation;

    //Item declaration
    public static ItemCrystalShard crystalShard;

    public static ItemElementalCompound elementalCompound;

    @Mod.Instance(value = Magis.MODID)
    public static Magis instance;

    @SidedProxy(clientSide="com.github.leomagis.magis.proxy.client.ClientProxy",
            serverSide="com.github.leomagis.magis.proxy.CommonProxy")
    public static CommonProxy proxy;

    //Creative tab declaration
    public static final CreativeTabs tabMagis = new CreativeTabs("tabMagis") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(evercrystal);
        }
    };

    @SuppressWarnings("unused")
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //block Initialization
        evercrystal = new BlockEvercrystal();
        fusionStation = new BlockFusionStation();

        //block registration
        GameRegistry.registerBlock(evercrystal, "blockEvercrystal");
        GameRegistry.registerBlock(fusionStation, "blockFusionStation");

        //Tile Entity registration
        GameRegistry.registerTileEntity(TileFusionStation.class, "tileFusionStation");

        //Item Initialization
        crystalShard = new ItemCrystalShard();
        elementalCompound = new ItemElementalCompound();

        //Item registration
        GameRegistry.registerItem(crystalShard, "itemCrystalShard");
        GameRegistry.registerItem(elementalCompound, "itemCompound");

        //Damage-based Item model registration
        ModelBakery.addVariantName(elementalCompound,
				"magis:itemCompoundAura",
				"magis:itemCompoundAquis",
				"magis:itemCompoundEliquis",
				"magis:itemCompoundFiirus",
				"magis:itemCompoundEartha",
				"magis:itemCompoundYin",
				"magis:itemCompoundYan",
				"magis:itemCompoundChronus",
				"magis:itemCompoundPsycos",
				"magis:itemCompoundAuraRune",
				"magis:itemCompoundAquisRune",
				"magis:itemCompoundEliquisRune",
				"magis:itemCompoundFiirusRune",
				"magis:itemCompoundEarthaRune",
				"magis:itemCompoundYinRune",
				"magis:itemCompoundYanRune",
				"magis:itemCompoundChronusRune",
				"magis:itemCompoundPsycosRune");

        //Recipe registration
        ItemStack stackShard = new ItemStack(crystalShard);
        GameRegistry.addShapedRecipe(new ItemStack(evercrystal),
				"SSS",
				"SSS",
				"SSS",
				'S', stackShard);

        //Magis recipe registration
		ItemStack stackAura = new ItemStack(elementalCompound, 1, EnumCompoundType.AURA.ordinal());
		ItemStack stackAiry = new ItemStack(elementalCompound, 1, EnumCompoundType.AIRY.ordinal());
		ItemStack stackProximity = new ItemStack(elementalCompound, 1, EnumCompoundType.PROXIMITY.ordinal());

		ItemStack stackAquis = new ItemStack(elementalCompound, 1, EnumCompoundType.AQUIS.ordinal());
		ItemStack stackFluidic = new ItemStack(elementalCompound, 1, EnumCompoundType.FLUIDIC.ordinal());
		ItemStack stackWatery = new ItemStack(elementalCompound, 1, EnumCompoundType.WATERY.ordinal());

		ItemStack stackChronus = new ItemStack(elementalCompound, 1, EnumCompoundType.CHRONUS.ordinal());

		ItemStack stackEartha = new ItemStack(elementalCompound, 1, EnumCompoundType.EARTHA.ordinal());
		ItemStack stackEarthy = new ItemStack(elementalCompound, 1, EnumCompoundType.EARTHY.ordinal());
		ItemStack stackMetallic = new ItemStack(elementalCompound, 1, EnumCompoundType.METALLIC.ordinal());
		ItemStack stackSolid = new ItemStack(elementalCompound, 1, EnumCompoundType.SOLID.ordinal());

		ItemStack stackEliquis = new ItemStack(elementalCompound, 1, EnumCompoundType.ELIQUIS.ordinal());
		ItemStack stackElectric = new ItemStack(elementalCompound, 1, EnumCompoundType.ELECTRIC.ordinal());
		ItemStack stackLight = new ItemStack(elementalCompound, 1, EnumCompoundType.LIGHT.ordinal());
		ItemStack stackMagnetic = new ItemStack(elementalCompound, 1, EnumCompoundType.MAGNETIC.ordinal());

		ItemStack stackFiirus = new ItemStack(elementalCompound, 1, EnumCompoundType.FIIRUS.ordinal());
		ItemStack stackHeat = new ItemStack(elementalCompound, 1, EnumCompoundType.HEAT.ordinal());
		ItemStack stackKinetic = new ItemStack(elementalCompound, 1, EnumCompoundType.KINETIC.ordinal());
		ItemStack stackPlasma = new ItemStack(elementalCompound, 1, EnumCompoundType.PLASMA.ordinal());

		ItemStack stackPsycos = new ItemStack(elementalCompound, 1, EnumCompoundType.PSYCOS.ordinal());

		ItemStack stackYan = new ItemStack(elementalCompound, 1, EnumCompoundType.YAN.ordinal());
		ItemStack stackLife = new ItemStack(elementalCompound, 1, EnumCompoundType.LIFE.ordinal());
		ItemStack stackOrder = new ItemStack(elementalCompound, 1, EnumCompoundType.ORDER.ordinal());
		ItemStack stackPositive = new ItemStack(elementalCompound, 1, EnumCompoundType.POSITIVE.ordinal());

		ItemStack stackYin = new ItemStack(elementalCompound, 1, EnumCompoundType.YIN.ordinal());
		ItemStack stackChaotic = new ItemStack(elementalCompound, 1, EnumCompoundType.CHAOTIC.ordinal());
		ItemStack stackDeath = new ItemStack(elementalCompound, 1, EnumCompoundType.DEATH.ordinal());
		ItemStack stackNegative	= new ItemStack(elementalCompound, 1, EnumCompoundType.NEGATIVE.ordinal());


        FusionRecipeRegistry.registerRecipe(
                stackShard,
                	stackYan,
						stackAura,
						stackAquis,
               			stackEliquis,
                		stackFiirus,
                		stackEartha,
                		stackYin,
                		stackChronus,
                		stackPsycos
		);
		FusionRecipeRegistry.registerRecipe(
				stackAura,
						stackAiry,
						stackProximity
		);
		FusionRecipeRegistry.registerRecipe(
				stackAquis,
						stackWatery,
						stackFluidic
		);
		FusionRecipeRegistry.registerRecipe(
				stackEartha,
						stackEarthy,
						stackMetallic,
						stackSolid);
		FusionRecipeRegistry.registerRecipe(
				stackEliquis,
						stackElectric,
						stackLight,
						stackMagnetic
		);
		FusionRecipeRegistry.registerRecipe(
				stackFiirus,
						stackPlasma,
						stackHeat,
						stackKinetic
		);
		FusionRecipeRegistry.registerRecipe(
				stackYan,
						stackNegative,
						stackChaotic,
						stackDeath
		);
		FusionRecipeRegistry.registerRecipe(
				stackYin,
						stackPositive,
						stackLife,
						stackOrder
		);
	}


    @SuppressWarnings("unused")
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.registerRenderers();
    }
}

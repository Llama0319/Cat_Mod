package com.llama0319.catmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.llama0319.catmod.common.entities.ExampleEntity;
import com.llama0319.catmod.core.init.BlockInit;
import com.llama0319.catmod.core.init.EntityTypeInit;
import com.llama0319.catmod.core.init.ItemInit;
import com.llama0319.catmod.world.OreGeneration;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



@Mod(Cat_Mod.MOD_ID)
public class Cat_Mod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "catmod";
    public static final ItemGroup CATMOD_GROUP = new CatMod("catmodtab");

    public Cat_Mod() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	bus.addListener(this::setup);
    	
    	ItemInit.ITEMS.register(bus);
    	BlockInit.BLOCKS.register(bus);
    	//EntityTypeInit.ENTITY_TYPES.register(bus);
    	
    	
    	MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
    	
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void setup(final FMLCommonSetupEvent event) {
    	
    	event.enqueueWork(() -> {
    		GlobalEntityTypeAttributes.put(EntityTypeInit.SQUIRREL.get(), 
    				ExampleEntity.registerAttributes().create());
    	});
       
    }
    
    public static class CatMod extends ItemGroup {

		public CatMod(String label) {
			super(label);
		}

		@Override
		public ItemStack createIcon() {
			return ItemInit.SCREAMING_CAT.get().getDefaultInstance();
		}
    }
    
}

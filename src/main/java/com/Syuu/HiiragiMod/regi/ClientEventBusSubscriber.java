package com.Syuu.HiiragiMod.regi;

import com.Syuu.HiiragiMod.main.HiiragiKeyBind;
import com.Syuu.HiiragiMod.main.HiiragiMod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = HiiragiMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT )
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event){
        HiiragiKeyBind.keyRegister(event);
    }
}

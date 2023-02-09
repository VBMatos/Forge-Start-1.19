package net.vbm.startmod.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DiceItem extends Item {
    public DiceItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND){
            outputRandomNumber(player);
            player.getCooldowns().addCooldown(this, 20);
        }
        return super.use(level, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> lsComponent, TooltipFlag tooltipFlag) {
        lsComponent.add((Component.literal("Right click to roll the Dice and get a number!").withStyle(ChatFormatting.YELLOW)));

        super.appendHoverText(itemStack, level, lsComponent, tooltipFlag);
    }

    private void outputRandomNumber(Player player) {
        player.sendSystemMessage(Component.literal(String.format("Your number is: %d", getRandomNumber())));
    }

    private int getRandomNumber() {
        return RandomSource.createNewThreadLocalInstance().nextInt(1, 7);
    }
}

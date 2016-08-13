package refinedstorage.gui;

import refinedstorage.api.storage.CompareUtils;
import refinedstorage.container.ContainerFluidConstructor;
import refinedstorage.gui.sidebutton.SideButtonCompare;
import refinedstorage.gui.sidebutton.SideButtonRedstoneMode;
import refinedstorage.tile.TileFluidConstructor;

public class GuiFluidConstructor extends GuiBase {
    public GuiFluidConstructor(ContainerFluidConstructor container) {
        super(container, 211, 137);
    }

    @Override
    public void init(int x, int y) {
        addSideButton(new SideButtonRedstoneMode(TileFluidConstructor.REDSTONE_MODE));

        addSideButton(new SideButtonCompare(TileFluidConstructor.COMPARE, CompareUtils.COMPARE_NBT));
    }

    @Override
    public void update(int x, int y) {
    }

    @Override
    public void drawBackground(int x, int y, int mouseX, int mouseY) {
        bindTexture("gui/constructor.png");

        drawTexture(x, y, 0, 0, width, height);
    }

    @Override
    public void drawForeground(int mouseX, int mouseY) {
        drawString(7, 7, t("gui.refinedstorage:fluid_constructor"));
        drawString(7, 43, t("container.inventory"));
    }
}

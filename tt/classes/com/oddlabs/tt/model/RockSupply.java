package com.oddlabs.tt.model;

import java.util.ResourceBundle;

import com.oddlabs.tt.gui.Icons;
import com.oddlabs.tt.gui.ToolTipBox;
import com.oddlabs.tt.util.Utils;
import com.oddlabs.tt.landscape.World;
import com.oddlabs.tt.render.SpriteKey;

public final strictfp class RockSupply extends SupplyModel {
	private final static int INITIAL_SUPPLIES = 10;

	public RockSupply(World world, SpriteKey sprite_renderer, float size, int grid_x, int grid_y, float x, float y, float rotation, boolean increase) {
		super(world, sprite_renderer, size, grid_x, grid_y, x, y, rotation, INITIAL_SUPPLIES, increase);
	}

	public final Supply respawn() {
		return new RockSupply(getWorld(), getSpriteRenderer(), getSize(), getGridX(), getGridY(), getPositionX(), getPositionY(), 0, false);
	}
}

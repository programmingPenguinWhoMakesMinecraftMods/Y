package net.programmingpenguin.prgpengsuite.things.blocks.furniture;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.programmingpenguin.prgpengsuite.things.blocks.enumproperties.TestEnum;

public class CounterBlock extends HorizontalFacingBlock {

    public CounterBlock(Settings settings) {
        super(FabricBlockSettings.of(Material.METAL).hardness(1).resistance(2).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool());
        setDefaultState(getStateManager().getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH).with(TESTEP, TestEnum.MODEL1));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        switch(dir) {
            case NORTH:
                return VoxelShapes.fullCube();
            case SOUTH:
                return VoxelShapes.fullCube();
            case EAST:
                return VoxelShapes.fullCube();
            case WEST:
                return VoxelShapes.fullCube();
            default:
                return VoxelShapes.fullCube();
        }
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(FACING, ctx.getPlayerFacing());
    }

    public static final EnumProperty<TestEnum> TESTEP = EnumProperty.of("enum", TestEnum.class);

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(TESTEP);
        stateManager.add(Properties.HORIZONTAL_FACING);
    }

    double a=1;

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        a++;
        if(a==1){
            world.setBlockState(pos, state.with(TESTEP, TestEnum.MODEL1));
        } else if(a==2) {
            world.setBlockState(pos, state.with(TESTEP, TestEnum.MODEL2));
        } else if(a==3) {
            world.setBlockState(pos, state.with(TESTEP, TestEnum.MODEL3));
        } else if(a==4) {
            world.setBlockState(pos, state.with(TESTEP, TestEnum.MODEL4));
        } else if (a==5) {
            a=0;
        }
        return ActionResult.SUCCESS;
    }
}

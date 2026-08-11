package net.mmg_atros_an.epic_bb.entitypatch;
import com.github.tartaricacid.touhoulittlemaid.client.model.bedrock.BedrockModel;
import com.github.tartaricacid.touhoulittlemaid.entity.passive.EntityMaid;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.world.entity.EntityType;
import yesman.epicfight.api.asset.AssetAccessor;
import yesman.epicfight.api.client.model.Meshes;
import yesman.epicfight.client.mesh.HumanoidMesh;
import yesman.epicfight.client.renderer.patched.entity.PatchedLivingEntityRenderer;


public class MaidPatchRenderer extends PatchedLivingEntityRenderer<EntityMaid, MaidPatch, BedrockModel<EntityMaid>, LivingEntityRenderer<EntityMaid, BedrockModel<EntityMaid>>, HumanoidMesh> {

    public MaidPatchRenderer(EntityRendererProvider.Context context, EntityType<?> entityType) {
        super(context, entityType);

    }

    @Override
    public AssetAccessor<HumanoidMesh> getDefaultMesh() {
        return Meshes.BIPED;
    }

    @Override
    public AssetAccessor<HumanoidMesh> getMeshProvider(MaidPatch entityPatch) {
        return this.getDefaultMesh();
    }
}

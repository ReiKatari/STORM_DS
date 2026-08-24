package defpackage;

import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.domain.model.VulkanPipelineProfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dg6  reason: default package */
/* loaded from: classes.dex */
public final class dg6 extends hw6 implements io2 {
    public /* synthetic */ VideoRenderer X;
    public /* synthetic */ VideoFiltering Y;
    public /* synthetic */ boolean Z;
    public /* synthetic */ int d0;
    public /* synthetic */ boolean e0;

    public dg6(r41 r41Var) {
        super(6, r41Var);
    }

    @Override // defpackage.io2
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        int intValue = ((Number) obj4).intValue();
        boolean booleanValue2 = ((Boolean) obj5).booleanValue();
        dg6 dg6Var = new dg6((r41) obj6);
        dg6Var.X = (VideoRenderer) obj;
        dg6Var.Y = (VideoFiltering) obj2;
        dg6Var.Z = booleanValue;
        dg6Var.d0 = intValue;
        dg6Var.e0 = booleanValue2;
        return dg6Var.s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        VulkanPipelineProfile vulkanPipelineProfile;
        VideoRenderer videoRenderer = this.X;
        VideoFiltering videoFiltering = this.Y;
        boolean z = this.Z;
        int i = this.d0;
        boolean z2 = this.e0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        VulkanPipelineProfile.Companion.getClass();
        if (z2) {
            vulkanPipelineProfile = VulkanPipelineProfile.FASTPATH;
        } else {
            vulkanPipelineProfile = VulkanPipelineProfile.COMPATIBILITY;
        }
        return new wf6(videoRenderer, videoFiltering, z, i, vulkanPipelineProfile, false, false, false);
    }
}

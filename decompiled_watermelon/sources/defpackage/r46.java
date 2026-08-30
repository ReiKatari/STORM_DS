package defpackage;

import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.domain.model.VulkanPipelineProfile;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r46  reason: default package */
/* loaded from: classes.dex */
public final class r46 extends nk6 implements ej2 {
    public /* synthetic */ VideoRenderer X;
    public /* synthetic */ VideoFiltering Y;
    public /* synthetic */ boolean Z;
    public /* synthetic */ int c0;
    public /* synthetic */ boolean d0;

    public r46(j11 j11Var) {
        super(6, j11Var);
    }

    @Override // defpackage.ej2
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        int intValue = ((Number) obj4).intValue();
        boolean booleanValue2 = ((Boolean) obj5).booleanValue();
        r46 r46Var = new r46((j11) obj6);
        r46Var.X = (VideoRenderer) obj;
        r46Var.Y = (VideoFiltering) obj2;
        r46Var.Z = booleanValue;
        r46Var.c0 = intValue;
        r46Var.d0 = booleanValue2;
        return r46Var.v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        VulkanPipelineProfile vulkanPipelineProfile;
        VideoRenderer videoRenderer = this.X;
        VideoFiltering videoFiltering = this.Y;
        boolean z = this.Z;
        int i = this.c0;
        boolean z2 = this.d0;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        VulkanPipelineProfile.Companion.getClass();
        if (z2) {
            vulkanPipelineProfile = VulkanPipelineProfile.FASTPATH;
        } else {
            vulkanPipelineProfile = VulkanPipelineProfile.COMPATIBILITY;
        }
        return new k46(videoRenderer, videoFiltering, z, i, vulkanPipelineProfile, false, false, false);
    }
}

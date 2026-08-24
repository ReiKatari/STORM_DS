package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dg6  reason: default package */
/* loaded from: classes.dex */
public final class dg6 extends defpackage.hw6 implements defpackage.io2 {
    public /* synthetic */ me.magnum.melonds.domain.model.VideoRenderer X;
    public /* synthetic */ me.magnum.melonds.domain.model.VideoFiltering Y;
    public /* synthetic */ boolean Z;
    public /* synthetic */ int d0;
    public /* synthetic */ boolean e0;

    public dg6(defpackage.r41 r2) {
            r1 = this;
            r0 = 6
            r1.<init>(r0, r2)
            return
    }

    @Override // defpackage.io2
    public final java.lang.Object n(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r0 = this;
            me.magnum.melonds.domain.model.VideoRenderer r1 = (me.magnum.melonds.domain.model.VideoRenderer) r1
            me.magnum.melonds.domain.model.VideoFiltering r2 = (me.magnum.melonds.domain.model.VideoFiltering) r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r3 = r4.intValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            r41 r6 = (defpackage.r41) r6
            dg6 r5 = new dg6
            r5.<init>(r6)
            r5.X = r1
            r5.Y = r2
            r5.Z = r0
            r5.d0 = r3
            r5.e0 = r4
            jg7 r0 = defpackage.jg7.a
            java.lang.Object r0 = r5.s(r0)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r10) {
            r9 = this;
            me.magnum.melonds.domain.model.VideoRenderer r1 = r9.X
            me.magnum.melonds.domain.model.VideoFiltering r2 = r9.Y
            boolean r3 = r9.Z
            int r4 = r9.d0
            boolean r9 = r9.e0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r10)
            wf6 r0 = new wf6
            yr7 r10 = me.magnum.melonds.domain.model.VulkanPipelineProfile.Companion
            r10.getClass()
            if (r9 == 0) goto L1c
            me.magnum.melonds.domain.model.VulkanPipelineProfile r9 = me.magnum.melonds.domain.model.VulkanPipelineProfile.FASTPATH
        L1a:
            r5 = r9
            goto L1f
        L1c:
            me.magnum.melonds.domain.model.VulkanPipelineProfile r9 = me.magnum.melonds.domain.model.VulkanPipelineProfile.COMPATIBILITY
            goto L1a
        L1f:
            r7 = 0
            r8 = 0
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }
}

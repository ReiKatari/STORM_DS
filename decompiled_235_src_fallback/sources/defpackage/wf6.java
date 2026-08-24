package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wf6  reason: default package */
/* loaded from: classes.dex */
public final class wf6 {
    public final me.magnum.melonds.domain.model.VideoRenderer a;
    public final me.magnum.melonds.domain.model.VideoFiltering b;
    public final boolean c;
    public final int d;
    public final me.magnum.melonds.domain.model.VulkanPipelineProfile e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public wf6(me.magnum.melonds.domain.model.VideoRenderer r1, me.magnum.melonds.domain.model.VideoFiltering r2, boolean r3, int r4, me.magnum.melonds.domain.model.VulkanPipelineProfile r5, boolean r6, boolean r7, boolean r8) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r5.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            return
    }

    public static defpackage.wf6 a(defpackage.wf6 r9, boolean r10, boolean r11, boolean r12, int r13) {
            me.magnum.melonds.domain.model.VideoRenderer r1 = r9.a
            me.magnum.melonds.domain.model.VideoFiltering r2 = r9.b
            boolean r3 = r9.c
            int r4 = r9.d
            me.magnum.melonds.domain.model.VulkanPipelineProfile r5 = r9.e
            r0 = r13 & 32
            if (r0 == 0) goto L10
            boolean r10 = r9.f
        L10:
            r6 = r10
            r10 = r13 & 64
            if (r10 == 0) goto L17
            boolean r11 = r9.g
        L17:
            r7 = r11
            r10 = r13 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L1e
            boolean r12 = r9.h
        L1e:
            r8 = r12
            r9.getClass()
            r1.getClass()
            r2.getClass()
            r5.getClass()
            wf6 r0 = new wf6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.wf6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wf6 r5 = (defpackage.wf6) r5
            me.magnum.melonds.domain.model.VideoRenderer r1 = r4.a
            me.magnum.melonds.domain.model.VideoRenderer r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            me.magnum.melonds.domain.model.VideoFiltering r1 = r4.b
            me.magnum.melonds.domain.model.VideoFiltering r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L21
            return r2
        L21:
            int r1 = r4.d
            int r3 = r5.d
            if (r1 == r3) goto L28
            return r2
        L28:
            me.magnum.melonds.domain.model.VulkanPipelineProfile r1 = r4.e
            me.magnum.melonds.domain.model.VulkanPipelineProfile r3 = r5.e
            if (r1 == r3) goto L2f
            return r2
        L2f:
            boolean r1 = r4.f
            boolean r3 = r5.f
            if (r1 == r3) goto L36
            return r2
        L36:
            boolean r1 = r4.g
            boolean r3 = r5.g
            if (r1 == r3) goto L3d
            return r2
        L3d:
            boolean r4 = r4.h
            boolean r5 = r5.h
            if (r4 == r5) goto L44
            return r2
        L44:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            me.magnum.melonds.domain.model.VideoRenderer r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            me.magnum.melonds.domain.model.VideoFiltering r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.c
            int r0 = defpackage.xg6.e(r2, r0, r1)
            int r2 = r3.d
            int r0 = defpackage.lb1.a(r2, r0, r1)
            me.magnum.melonds.domain.model.VulkanPipelineProfile r2 = r3.e
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f
            int r0 = defpackage.xg6.e(r2, r0, r1)
            boolean r2 = r3.g
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r3 = r3.h
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CoreRenderConfigurationInputs(renderer="
            r0.<init>(r1)
            me.magnum.melonds.domain.model.VideoRenderer r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", filtering="
            r0.append(r1)
            me.magnum.melonds.domain.model.VideoFiltering r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", threadedRenderingEnabled="
            r0.append(r1)
            boolean r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", resolutionScaling="
            r0.append(r1)
            int r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", vulkanPipelineProfile="
            r0.append(r1)
            me.magnum.melonds.domain.model.VulkanPipelineProfile r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", rendererDebugToolsEnabled="
            r0.append(r1)
            boolean r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", rendererDebugBgObjEnabled="
            r0.append(r1)
            boolean r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", rendererDebugLatchTraceEnabled="
            r0.append(r1)
            boolean r2 = r2.h
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

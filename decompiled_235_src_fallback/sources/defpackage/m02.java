package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m02  reason: default package */
/* loaded from: classes.dex */
public final class m02 extends defpackage.hw6 implements defpackage.fo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ java.lang.Object Y;
    public /* synthetic */ java.lang.Object Z;

    public /* synthetic */ m02(int r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.<init>(r1, r2)
            return
    }

    public m02(defpackage.bx4 r2, defpackage.r41 r3) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.Z = r2
            r2 = 3
            r1.<init>(r2, r3)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r0 = r3.X
            jg7 r1 = defpackage.jg7.a
            r2 = 3
            switch(r0) {
                case 0: goto L5b;
                case 1: goto L46;
                case 2: goto L31;
                case 3: goto L1d;
                default: goto L8;
            }
        L8:
            wf6 r4 = (defpackage.wf6) r4
            xf6 r5 = (defpackage.xf6) r5
            r41 r6 = (defpackage.r41) r6
            m02 r3 = new m02
            r0 = 4
            r3.<init>(r2, r6, r0)
            r3.Y = r4
            r3.Z = r5
            java.lang.Object r3 = r3.s(r1)
            return r3
        L1d:
            yf6 r4 = (defpackage.yf6) r4
            po5 r5 = (defpackage.po5) r5
            r41 r6 = (defpackage.r41) r6
            m02 r3 = new m02
            r3.<init>(r2, r6, r2)
            r3.Y = r4
            r3.Z = r5
            java.lang.Object r3 = r3.s(r1)
            return r3
        L31:
            me.magnum.melonds.domain.model.ConsoleType r4 = (me.magnum.melonds.domain.model.ConsoleType) r4
            me.magnum.melonds.domain.model.MicSource r5 = (me.magnum.melonds.domain.model.MicSource) r5
            r41 r6 = (defpackage.r41) r6
            m02 r3 = new m02
            r0 = 2
            r3.<init>(r2, r6, r0)
            r3.Y = r4
            r3.Z = r5
            java.lang.Object r3 = r3.s(r1)
            return r3
        L46:
            ne2 r4 = (defpackage.ne2) r4
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r41 r6 = (defpackage.r41) r6
            m02 r4 = new m02
            java.lang.Object r3 = r3.Z
            bx4 r3 = (defpackage.bx4) r3
            r4.<init>(r3, r6)
            r4.Y = r5
            r4.s(r1)
            return r1
        L5b:
            u41 r4 = (defpackage.u41) r4
            pq5 r5 = (defpackage.pq5) r5
            r41 r6 = (defpackage.r41) r6
            m02 r3 = new m02
            r0 = 0
            r3.<init>(r2, r6, r0)
            r3.Y = r4
            r3.Z = r5
            java.lang.Object r3 = r3.s(r1)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r22) {
            r21 = this;
            r0 = r21
            int r1 = r0.X
            switch(r1) {
                case 0: goto Lec;
                case 1: goto Lbf;
                case 2: goto Lac;
                case 3: goto L1a;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.Y
            wf6 r1 = (defpackage.wf6) r1
            java.lang.Object r0 = r0.Z
            xf6 r0 = (defpackage.xf6) r0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r22)
            yf6 r2 = new yf6
            r2.<init>(r1, r0)
            return r2
        L1a:
            java.lang.Object r1 = r0.Y
            yf6 r1 = (defpackage.yf6) r1
            java.lang.Object r0 = r0.Z
            po5 r0 = (defpackage.po5) r0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r22)
            wf6 r2 = r1.a
            xf6 r1 = r1.b
            me.magnum.melonds.domain.model.VideoRenderer r3 = r2.a
            me.magnum.melonds.domain.model.VideoRenderer r4 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            if (r3 != r4) goto L3d
            me.magnum.melonds.domain.model.VideoFiltering r3 = r2.b
            boolean r3 = r3.isSupportedByVulkan()
            if (r3 != 0) goto L3d
            me.magnum.melonds.domain.model.VideoFiltering r3 = me.magnum.melonds.domain.model.VideoFiltering.NONE
        L3b:
            r7 = r3
            goto L5e
        L3d:
            me.magnum.melonds.domain.model.VideoRenderer r3 = r2.a
            me.magnum.melonds.domain.model.VideoFiltering r5 = r2.b
            if (r3 == r4) goto L4c
            boolean r3 = r5.isSupportedByOpenGlSurface()
            if (r3 != 0) goto L4c
            me.magnum.melonds.domain.model.VideoFiltering r3 = me.magnum.melonds.domain.model.VideoFiltering.NONE
            goto L3b
        L4c:
            me.magnum.melonds.domain.model.VideoFiltering r3 = me.magnum.melonds.domain.model.VideoFiltering.RETROARCH
            if (r5 != r3) goto L5d
            java.lang.String r3 = r0.a
            if (r3 == 0) goto L5a
            boolean r3 = defpackage.qs6.v0(r3)
            if (r3 == 0) goto L5d
        L5a:
            me.magnum.melonds.domain.model.VideoFiltering r3 = me.magnum.melonds.domain.model.VideoFiltering.NONE
            goto L3b
        L5d:
            r7 = r5
        L5e:
            me.magnum.melonds.domain.model.VideoRenderer r3 = r2.a
            boolean r5 = r2.c
            boolean r8 = defpackage.mp2.X(r3, r5)
            me.magnum.melonds.domain.model.VideoRenderer r6 = r2.a
            me.magnum.melonds.domain.model.VideoRenderer r3 = me.magnum.melonds.domain.model.VideoRenderer.OPENGL
            if (r6 != r3) goto L73
            boolean r3 = r1.a
            if (r3 == 0) goto L73
            r3 = 1
        L71:
            r14 = r3
            goto L75
        L73:
            r3 = 0
            goto L71
        L75:
            me.magnum.melonds.domain.model.RendererConfiguration r5 = new me.magnum.melonds.domain.model.RendererConfiguration
            if (r6 != r4) goto L7d
            me.magnum.melonds.domain.model.VulkanPipelineProfile r3 = r2.e
        L7b:
            r9 = r3
            goto L80
        L7d:
            me.magnum.melonds.domain.model.VulkanPipelineProfile r3 = me.magnum.melonds.domain.model.VulkanPipelineProfile.COMPATIBILITY
            goto L7b
        L80:
            int r10 = r2.d
            boolean r11 = r2.f
            boolean r12 = r2.g
            boolean r13 = r2.h
            float r15 = r1.b
            float r2 = r1.c
            boolean r3 = r1.d
            boolean r4 = r1.e
            boolean r1 = r1.f
            r21 = r0
            me.magnum.melonds.domain.model.VideoFiltering r0 = me.magnum.melonds.domain.model.VideoFiltering.RETROARCH
            if (r7 != r0) goto La3
            r20 = r21
        L9a:
            r19 = r1
            r16 = r2
            r17 = r3
            r18 = r4
            goto La8
        La3:
            po5 r0 = defpackage.ng6.l
            r20 = r0
            goto L9a
        La8:
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r5
        Lac:
            java.lang.Object r1 = r0.Y
            me.magnum.melonds.domain.model.ConsoleType r1 = (me.magnum.melonds.domain.model.ConsoleType) r1
            java.lang.Object r0 = r0.Z
            me.magnum.melonds.domain.model.MicSource r0 = (me.magnum.melonds.domain.model.MicSource) r0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r22)
            vr4 r2 = new vr4
            r2.<init>(r1, r0)
            return r2
        Lbf:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r22)
            java.lang.Object r1 = r0.Y
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r2 = "Error in camera ID flow collection."
            java.lang.String r3 = "PipePresenceSrc"
            android.util.Log.e(r3, r2, r1)
            java.lang.Object r0 = r0.Z
            bx4 r0 = (defpackage.bx4) r0
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.h
            boolean r2 = r2.get()
            if (r2 == 0) goto Le0
            r2 = 0
            r0.c(r2, r1)
            goto Le9
        Le0:
            java.lang.String r0 = "Ignoring error because monitoring is stopped."
            int r0 = android.util.Log.d(r3, r0)
            defpackage.vy7.P(r0)
        Le9:
            jg7 r0 = defpackage.jg7.a
            return r0
        Lec:
            java.lang.Object r1 = r0.Y
            u41 r1 = (defpackage.u41) r1
            java.lang.Object r0 = r0.Z
            pq5 r0 = (defpackage.pq5) r0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r22)
            if (r0 == 0) goto L10e
            jt5 r0 = r0.f
            if (r0 == 0) goto L10e
            r1.getClass()
            nx5 r2 = r0.g
            nx5 r3 = defpackage.nx5.CUSTOM
            if (r2 != r3) goto L10e
            u41 r0 = r0.h
            if (r0 != 0) goto L10d
            goto L10e
        L10d:
            r1 = r0
        L10e:
            return r1
    }
}

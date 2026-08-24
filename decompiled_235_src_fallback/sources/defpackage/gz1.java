package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gz1  reason: default package */
/* loaded from: classes.dex */
public final class gz1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ defpackage.sz1 Z;

    public /* synthetic */ gz1(int r1, defpackage.r41 r2, defpackage.sz1 r3) {
            r0 = this;
            r0.X = r1
            r0.Z = r3
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L31;
                case 1: goto L23;
                case 2: goto L15;
                default: goto L7;
            }
        L7:
            vr4 r3 = (defpackage.vr4) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            gz1 r2 = (defpackage.gz1) r2
            r2.s(r1)
            return r1
        L15:
            jq1 r3 = (defpackage.jq1) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            gz1 r2 = (defpackage.gz1) r2
            r2.s(r1)
            return r1
        L23:
            p66 r3 = (defpackage.p66) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            gz1 r2 = (defpackage.gz1) r2
            r2.s(r1)
            return r1
        L31:
            p66 r3 = (defpackage.p66) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            gz1 r2 = (defpackage.gz1) r2
            r2.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            sz1 r2 = r2.Z
            switch(r0) {
                case 0: goto L22;
                case 1: goto L19;
                case 2: goto L10;
                default: goto L7;
            }
        L7:
            gz1 r0 = new gz1
            r1 = 3
            r0.<init>(r1, r3, r2)
            r0.Y = r4
            return r0
        L10:
            gz1 r0 = new gz1
            r1 = 2
            r0.<init>(r1, r3, r2)
            r0.Y = r4
            return r0
        L19:
            gz1 r0 = new gz1
            r1 = 1
            r0.<init>(r1, r3, r2)
            r0.Y = r4
            return r0
        L22:
            gz1 r0 = new gz1
            r1 = 0
            r0.<init>(r1, r3, r2)
            r0.Y = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.X
            jg7 r1 = defpackage.jg7.a
            sz1 r2 = r14.Z
            java.lang.Object r14 = r14.Y
            switch(r0) {
                case 0: goto L86;
                case 1: goto L79;
                case 2: goto L6c;
                default: goto Lb;
            }
        Lb:
            vr4 r14 = (defpackage.vr4) r14
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r15)
            java.lang.Object r15 = r14.A
            me.magnum.melonds.domain.model.RendererConfiguration r15 = (me.magnum.melonds.domain.model.RendererConfiguration) r15
            java.lang.Object r14 = r14.B
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L2a
            me.magnum.melonds.domain.model.VideoFiltering r14 = r15.getVideoFiltering()
            me.magnum.melonds.domain.model.VideoFiltering r0 = me.magnum.melonds.domain.model.VideoFiltering.RETROARCH
            if (r14 != r0) goto L2a
            r14 = 1
            goto L2b
        L2a:
            r14 = 0
        L2b:
            tp6 r0 = r2.x0
            b36 r2 = new b36
            me.magnum.melonds.domain.model.VideoRenderer r3 = r15.getRenderer()
            if (r14 == 0) goto L38
            me.magnum.melonds.domain.model.VideoFiltering r4 = me.magnum.melonds.domain.model.VideoFiltering.NONE
            goto L3c
        L38:
            me.magnum.melonds.domain.model.VideoFiltering r4 = r15.getVideoFiltering()
        L3c:
            int r5 = r15.getResolutionScaling()
            if (r14 == 0) goto L5d
            po5 r14 = r15.getRetroArchShader()
            hp5 r8 = r14.b
            int r9 = r14.c
            long r10 = r14.d
            java.util.Map r12 = r14.e
            boolean r13 = r14.f
            r8.getClass()
            r12.getClass()
            po5 r6 = new po5
            r7 = 0
            r6.<init>(r7, r8, r9, r10, r12, r13)
            goto L61
        L5d:
            po5 r6 = r15.getRetroArchShader()
        L61:
            r2.<init>(r3, r4, r5, r6)
            r0.getClass()
            r14 = 0
            r0.m(r14, r2)
            return r1
        L6c:
            jq1 r14 = (defpackage.jq1) r14
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r15)
            tp6 r15 = r2.X0
            r15.l(r14)
            return r1
        L79:
            p66 r14 = (defpackage.p66) r14
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r15)
            tp6 r15 = r2.l1
            r15.l(r14)
            return r1
        L86:
            p66 r14 = (defpackage.p66) r14
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r15)
            tp6 r15 = r2.j1
            r15.l(r14)
            return r1
    }
}

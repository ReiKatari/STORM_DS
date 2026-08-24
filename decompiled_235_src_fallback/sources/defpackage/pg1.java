package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pg1  reason: default package */
/* loaded from: classes.dex */
public final class pg1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ java.lang.Object e0;

    public pg1(defpackage.gn r2, boolean r3, defpackage.sc7 r4, defpackage.r41 r5) {
            r1 = this;
            r0 = 2
            r1.X = r0
            r1.d0 = r2
            r1.Z = r3
            r1.e0 = r4
            r1.<init>(r0, r5)
            return
    }

    public pg1(defpackage.qg1 r2, defpackage.r41 r3, boolean r4, java.util.LinkedHashSet r5) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.d0 = r2
            r1.Z = r4
            r1.e0 = r5
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    public pg1(defpackage.sz1 r2, defpackage.vj4 r3, boolean r4, defpackage.r41 r5) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.d0 = r2
            r1.e0 = r3
            r1.Z = r4
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L21;
                case 1: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            pg1 r2 = (defpackage.pg1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            pg1 r2 = (defpackage.pg1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            pg1 r2 = (defpackage.pg1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            java.lang.Object r0 = r2.e0
            boolean r1 = r2.Z
            java.lang.Object r2 = r2.d0
            switch(r4) {
                case 0: goto L1f;
                case 1: goto L15;
                default: goto Lb;
            }
        Lb:
            pg1 r4 = new pg1
            gn r2 = (defpackage.gn) r2
            sc7 r0 = (defpackage.sc7) r0
            r4.<init>(r2, r1, r0, r3)
            return r4
        L15:
            pg1 r4 = new pg1
            sz1 r2 = (defpackage.sz1) r2
            vj4 r0 = (defpackage.vj4) r0
            r4.<init>(r2, r0, r1, r3)
            return r4
        L1f:
            pg1 r4 = new pg1
            qg1 r2 = (defpackage.qg1) r2
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            r4.<init>(r2, r3, r1, r0)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.X
            java.lang.Object r1 = r14.e0
            boolean r2 = r14.Z
            java.lang.Object r3 = r14.d0
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            switch(r0) {
                case 0: goto L9b;
                case 1: goto L46;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r14.Y
            if (r7 == 0) goto L1f
            if (r7 != r6) goto L1b
            defpackage.oi2.Y(r15)
            goto L43
        L1b:
            defpackage.i.m(r5)
            goto L45
        L1f:
            defpackage.oi2.Y(r15)
            r8 = r3
            gn r8 = (defpackage.gn) r8
            if (r2 == 0) goto L2a
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L2d
        L2a:
            r15 = 1061997773(0x3f4ccccd, float:0.8)
        L2d:
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r15)
            r10 = r1
            sc7 r10 = (defpackage.sc7) r10
            r14.Y = r6
            r11 = 0
            r13 = 12
            r12 = r14
            java.lang.Object r14 = defpackage.gn.c(r8, r9, r10, r11, r12, r13)
            if (r14 != r0) goto L43
            r4 = r0
            goto L45
        L43:
            jg7 r4 = defpackage.jg7.a
        L45:
            return r4
        L46:
            r12 = r14
            x61 r14 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r12.Y
            if (r0 == 0) goto L57
            if (r0 != r6) goto L53
            defpackage.oi2.Y(r15)
            goto L6e
        L53:
            defpackage.i.m(r5)
            goto L9a
        L57:
            defpackage.oi2.Y(r15)
            sz1 r3 = (defpackage.sz1) r3
            qf4 r15 = r3.h
            vj4 r1 = (defpackage.vj4) r1
            long r0 = r1.b
            r12.Y = r6
            vm5 r15 = r15.a
            java.lang.Object r15 = r15.r(r0, r2, r12)
            if (r15 != r14) goto L6e
            r4 = r14
            goto L9a
        L6e:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r14 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.ht0.v0(r15, r0)
            r14.<init>(r0)
            java.util.Iterator r15 = r15.iterator()
        L7f:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r0 = r15.next()
            fb5 r0 = (defpackage.fb5) r0
            long r0 = r0.b
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            r14.add(r2)
            goto L7f
        L96:
            java.util.Set r4 = defpackage.gt0.p1(r14)
        L9a:
            return r4
        L9b:
            r12 = r14
            x61 r14 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r12.Y
            if (r0 == 0) goto Lad
            if (r0 != r6) goto La8
            defpackage.oi2.Y(r15)
            goto Lc7
        La8:
            defpackage.i.m(r5)
            r15 = r4
            goto Lc7
        Lad:
            defpackage.oi2.Y(r15)
            qg1 r3 = (defpackage.qg1) r3
            ri7 r15 = defpackage.qg1.k(r3)
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1
            jg1 r15 = r15.g(r1, r2)
            r12.Y = r6
            tu0 r15 = (defpackage.tu0) r15
            java.lang.Object r15 = r15.q(r12)
            if (r15 != r14) goto Lc7
            r15 = r14
        Lc7:
            return r15
    }
}

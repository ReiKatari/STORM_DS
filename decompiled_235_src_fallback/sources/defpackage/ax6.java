package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ax6  reason: default package */
/* loaded from: classes.dex */
public final class ax6 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ java.lang.Object d0;

    public ax6(defpackage.p27 r2, boolean r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.d0 = r2
            r1.Z = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    public ax6(boolean r2, defpackage.dd r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.Z = r2
            r1.d0 = r3
            r2 = 2
            r1.<init>(r2, r4)
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
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            ax6 r2 = (defpackage.ax6) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            ax6 r2 = (defpackage.ax6) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            boolean r0 = r1.Z
            java.lang.Object r1 = r1.d0
            switch(r3) {
                case 0: goto L11;
                default: goto L9;
            }
        L9:
            ax6 r3 = new ax6
            p27 r1 = (defpackage.p27) r1
            r3.<init>(r1, r0, r2)
            return r3
        L11:
            ax6 r3 = new ax6
            dd r1 = (defpackage.dd) r1
            r3.<init>(r0, r1, r2)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.X
            boolean r1 = r9.Z
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            jg7 r3 = defpackage.jg7.a
            r4 = 1
            java.lang.Object r5 = r9.d0
            r6 = 0
            switch(r0) {
                case 0: goto L7a;
                default: goto Lf;
            }
        Lf:
            p27 r5 = (defpackage.p27) r5
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r9.Y
            if (r7 == 0) goto L22
            if (r7 != r4) goto L1d
            defpackage.oi2.Y(r10)
            goto L79
        L1d:
            defpackage.i.m(r2)
            r3 = r6
            goto L79
        L22:
            defpackage.oi2.Y(r10)
            c37 r10 = r5.n()
            long r7 = r10.b
            boolean r10 = defpackage.k47.c(r7)
            if (r10 != 0) goto L64
            wq7 r10 = r5.f
            boolean r10 = r10 instanceof defpackage.jt4
            if (r10 != 0) goto L64
            c37 r10 = r5.n()
            fp r6 = defpackage.ln2.A(r10)
            if (r1 != 0) goto L42
            goto L64
        L42:
            c37 r10 = r5.n()
            long r1 = r10.b
            int r10 = defpackage.k47.e(r1)
            c37 r1 = r5.n()
            fp r1 = r1.a
            long r7 = defpackage.jx2.f(r10, r10)
            c37 r10 = defpackage.p27.e(r1, r7)
            qn2 r1 = r5.c
            r1.g(r10)
            hv2 r10 = defpackage.hv2.None
            r5.q(r10)
        L64:
            if (r6 != 0) goto L67
            goto L79
        L67:
            tr0 r10 = r5.h
            if (r10 == 0) goto L79
            sr0 r1 = defpackage.lb4.I(r6)
            r9.Y = r4
            ce r10 = (defpackage.ce) r10
            r10.a(r1)
            if (r3 != r0) goto L79
            r3 = r0
        L79:
            return r3
        L7a:
            dd r5 = (defpackage.dd) r5
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r9.Y
            if (r7 == 0) goto L8d
            if (r7 != r4) goto L88
            defpackage.oi2.Y(r10)
            goto Lb1
        L88:
            defpackage.i.m(r2)
            r3 = r6
            goto Lb1
        L8d:
            defpackage.oi2.Y(r10)
            vs4 r10 = r5.g
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r1 == r10) goto Lb1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            r9.Y = r4
            rs4 r1 = r5.k
            float r1 = r1.h()
            java.lang.Object r9 = defpackage.mb3.r(r5, r10, r1, r9)
            if (r9 != r0) goto Lb1
            r3 = r0
        Lb1:
            return r3
    }
}

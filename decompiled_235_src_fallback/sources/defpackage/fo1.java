package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fo1  reason: default package */
/* loaded from: classes.dex */
public final class fo1 extends defpackage.yn1 {
    public defpackage.go1 F0;
    public defpackage.lo4 G0;
    public boolean H0;
    public defpackage.fo2 I0;
    public defpackage.fo2 J0;
    public boolean K0;

    @Override // defpackage.yn1
    public final java.lang.Object Y0(defpackage.xn1 r6, defpackage.xn1 r7) {
            r5 = this;
            go1 r0 = r5.F0
            xa4 r1 = defpackage.xa4.UserInput
            b0 r2 = new b0
            r3 = 0
            r4 = 24
            r2.<init>(r6, r5, r3, r4)
            java.lang.Object r5 = r0.b(r1, r2, r7)
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            if (r5 != r6) goto L15
            return r5
        L15:
            jg7 r5 = defpackage.jg7.a
            return r5
    }

    @Override // defpackage.yn1
    public final void d1(long r5) {
            r4 = this;
            boolean r0 = r4.j0
            if (r0 == 0) goto L1f
            fo2 r0 = r4.I0
            do1 r1 = defpackage.eo1.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto Lf
            goto L1f
        Lf:
            w61 r0 = r4.F0()
            a71 r1 = defpackage.a71.UNDISPATCHED
            wk0 r2 = new wk0
            r3 = 0
            r2.<init>(r4, r5, r3)
            r4 = 1
            defpackage.hv.L(r0, r3, r1, r2, r4)
        L1f:
            return
    }

    @Override // defpackage.yn1
    public final void e1(defpackage.hn1 r6) {
            r5 = this;
            boolean r0 = r5.j0
            if (r0 == 0) goto L21
            fo2 r0 = r5.J0
            do1 r1 = defpackage.eo1.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto Lf
            goto L21
        Lf:
            w61 r0 = r5.F0()
            a71 r1 = defpackage.a71.UNDISPATCHED
            b0 r2 = new b0
            r3 = 25
            r4 = 0
            r2.<init>(r5, r6, r4, r3)
            r5 = 1
            defpackage.hv.L(r0, r4, r1, r2, r5)
        L21:
            return
    }

    @Override // defpackage.yn1
    public final boolean j1() {
            r0 = this;
            boolean r0 = r0.H0
            return r0
    }
}

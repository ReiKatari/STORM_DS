package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w51  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w51 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.jt3 B;

    public /* synthetic */ w51(defpackage.jt3 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.A
            jg7 r1 = defpackage.jg7.a
            jt3 r5 = r5.B
            switch(r0) {
                case 0: goto L7b;
                case 1: goto L2d;
                case 2: goto L23;
                case 3: goto L14;
                default: goto L9;
            }
        L9:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
            vs4 r5 = r5.q
            r5.setValue(r6)
            return r1
        L14:
            k33 r6 = (defpackage.k33) r6
            uh3 r5 = r5.r
            int r6 = r6.a
            boolean r5 = r5.b(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L23:
            k33 r6 = (defpackage.k33) r6
            uh3 r5 = r5.r
            int r6 = r6.a
            r5.b(r6)
            return r1
        L2d:
            vs4 r0 = r5.t
            c37 r6 = (defpackage.c37) r6
            fp r2 = r6.a
            java.lang.String r2 = r2.B
            fp r3 = r5.j
            r4 = 0
            if (r3 == 0) goto L3d
            java.lang.String r3 = r3.B
            goto L3e
        L3d:
            r3 = r4
        L3e:
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L64
            hv2 r2 = defpackage.hv2.None
            vs4 r3 = r5.k
            r3.setValue(r2)
            java.lang.Object r2 = r0.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5d
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.setValue(r2)
            goto L64
        L5d:
            vs4 r0 = r5.s
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.setValue(r2)
        L64:
            long r2 = defpackage.k47.b
            r5.f(r2)
            r5.e(r2)
            qn2 r0 = r5.u
            r0.g(r6)
            cf5 r5 = r5.b
            ey0 r6 = r5.a
            if (r6 == 0) goto L7a
            r6.s(r5, r4)
        L7a:
            return r1
        L7b:
            jk3 r6 = (defpackage.jk3) r6
            b47 r5 = r5.d()
            if (r5 == 0) goto L85
            r5.c = r6
        L85:
            return r1
    }
}

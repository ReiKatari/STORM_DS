package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x60  reason: default package */
/* loaded from: classes.dex */
public final class x60 {
    public final defpackage.sg6 a;
    public final defpackage.ga7 b;
    public final defpackage.on2 c;
    public final defpackage.vs4 d;
    public final defpackage.vs4 e;
    public defpackage.rc2 f;
    public final defpackage.vs4 g;

    public x60(defpackage.sg6 r2, defpackage.ga7 r3, defpackage.w97 r4, defpackage.on2 r5) {
            r1 = this;
            af6 r0 = defpackage.lb4.m
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r5
            vs4 r2 = defpackage.np2.Y(r4)
            r1.d = r2
            vs4 r2 = defpackage.np2.Y(r0)
            r1.e = r2
            io6 r2 = defpackage.y60.a
            r1.f = r2
            r2 = 0
            vs4 r2 = defpackage.np2.Y(r2)
            r1.g = r2
            return
    }

    public final void a(defpackage.of5 r5, defpackage.of5 r6, defpackage.af6 r7) {
            r4 = this;
            sg6 r0 = r4.a
            boolean r0 = r0.a()
            if (r0 == 0) goto L49
            vs4 r0 = r4.g
            java.lang.Object r1 = r0.getValue()
            pp6 r1 = (defpackage.pp6) r1
            if (r1 != 0) goto L2e
            if (r7 != 0) goto L1c
            vs4 r7 = r4.e
            java.lang.Object r7 = r7.getValue()
            af6 r7 = (defpackage.af6) r7
        L1c:
            int r7 = r7.a
            switch(r7) {
                case 0: goto L24;
                default: goto L21;
            }
        L21:
            io6 r7 = defpackage.vg6.a
            goto L2c
        L24:
            of5 r7 = defpackage.vq7.a
            r1 = 3
            r2 = 0
            io6 r7 = defpackage.ge7.U(r2, r2, r7, r1)
        L2c:
            r4.f = r7
        L2e:
            vs4 r7 = r4.d
            java.lang.Object r7 = r7.getValue()
            w97 r7 = (defpackage.w97) r7
            mc r1 = new mc
            r2 = 7
            r1.<init>(r4, r2)
            ln r2 = new ln
            r3 = 1
            r2.<init>(r4, r6, r5, r3)
            v97 r4 = r7.a(r1, r2)
            r0.setValue(r4)
        L49:
            return
    }

    public final boolean b() {
            r0 = this;
            ga7 r0 = r0.b
            vs4 r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public final defpackage.of5 c() {
            r5 = this;
            sg6 r0 = r5.a
            boolean r0 = r0.a()
            if (r0 == 0) goto L32
            vs4 r0 = r5.g
            java.lang.Object r0 = r0.getValue()
            pp6 r0 = (defpackage.pp6) r0
            if (r0 == 0) goto L32
            java.lang.Object r0 = r0.getValue()
            of5 r0 = (defpackage.of5) r0
            if (r0 == 0) goto L32
            on2 r5 = r5.c
            java.lang.Object r5 = r5.c()
            jk4 r5 = (defpackage.jk4) r5
            long r1 = r5.a
            r3 = 0
            boolean r5 = defpackage.jk4.c(r1, r3)
            if (r5 != 0) goto L31
            of5 r5 = r0.i(r1)
            return r5
        L31:
            return r0
        L32:
            r5 = 0
            return r5
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gf3  reason: default package */
/* loaded from: classes.dex */
public final class gf3 implements defpackage.gg3 {
    public static final defpackage.gf3 a = null;
    public static final defpackage.yb6 b = null;

    static {
            gf3 r0 = new gf3
            r0.<init>()
            defpackage.gf3.a = r0
            v25 r0 = defpackage.v25.m
            r1 = 0
            wb6[] r1 = new defpackage.wb6[r1]
            java.lang.String r2 = "kotlinx.serialization.json.JsonPrimitive"
            yb6 r0 = defpackage.mp2.m(r2, r0, r1)
            defpackage.gf3.b = r0
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r4) {
            r3 = this;
            yd3 r3 = defpackage.gi2.l(r4)
            de3 r4 = r3.y()
            boolean r0 = r4 instanceof defpackage.df3
            if (r0 != 0) goto L46
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected JSON element, expected JsonPrimitive, had "
            r0.<init>(r1)
            java.lang.Class r1 = r4.getClass()
            ar0 r1 = defpackage.gh5.a(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            id3 r3 = r3.S()
            td3 r3 = r3.a
            boolean r3 = r3.g
            r1 = -1
            r2 = 0
            if (r3 == 0) goto L3b
            java.lang.String r3 = r4.toString()
            java.lang.CharSequence r3 = defpackage.hi2.H(r1, r3)
            java.lang.String r3 = r3.toString()
            goto L3c
        L3b:
            r3 = r2
        L3c:
            ae3 r4 = new ae3
            java.lang.String r3 = defpackage.hi2.x(r0, r2, r1, r2, r3)
            r4.<init>(r3)
            throw r4
        L46:
            df3 r4 = (defpackage.df3) r4
            return r4
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r1, java.lang.Object r2) {
            r0 = this;
            df3 r2 = (defpackage.df3) r2
            r2.getClass()
            defpackage.gi2.j(r1)
            boolean r0 = r2 instanceof defpackage.ue3
            if (r0 == 0) goto L14
            we3 r0 = defpackage.we3.a
            ue3 r2 = defpackage.ue3.INSTANCE
            r1.j(r0, r2)
            return
        L14:
            re3 r0 = defpackage.re3.a
            qe3 r2 = (defpackage.qe3) r2
            r1.j(r0, r2)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            yb6 r0 = defpackage.gf3.b
            return r0
    }
}

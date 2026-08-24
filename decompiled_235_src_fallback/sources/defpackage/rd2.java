package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rd2  reason: default package */
/* loaded from: classes.dex */
final class rd2 implements defpackage.gg3 {
    public static final defpackage.rd2 a = null;
    public static final defpackage.x25 b = null;

    static {
            rd2 r0 = new rd2
            r0.<init>()
            defpackage.rd2.a = r0
            java.lang.String r0 = "FlexibleInt"
            v25 r1 = defpackage.v25.j
            x25 r0 = defpackage.mp2.b(r0, r1)
            defpackage.rd2.b = r0
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.yd3
            if (r0 == 0) goto L22
            yd3 r1 = (defpackage.yd3) r1
            de3 r0 = r1.y()
            df3 r0 = defpackage.fe3.h(r0)
            java.lang.String r1 = r0.a()
            java.lang.Integer r1 = defpackage.xs6.h0(r1)
            if (r1 == 0) goto L1d
            int r0 = r1.intValue()
            goto L26
        L1d:
            int r0 = defpackage.fe3.e(r0)
            goto L26
        L22:
            int r0 = r1.B()
        L26:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Number r2 = (java.lang.Number) r2
            int r0 = r2.intValue()
            r1.T(r0)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            x25 r0 = defpackage.rd2.b
            return r0
    }
}

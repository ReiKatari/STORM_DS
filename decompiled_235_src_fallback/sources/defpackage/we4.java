package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: we4  reason: default package */
/* loaded from: classes.dex */
public final class we4 extends defpackage.c20 {
    public static final java.lang.String c = null;
    public final int b;

    static {
            java.lang.String r0 = "NetworkMeteredCtrlr"
            java.lang.String r0 = defpackage.ga0.h(r0)
            defpackage.we4.c = r0
            return
    }

    public we4(defpackage.if4 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1)
            r1 = 7
            r0.b = r1
            return
    }

    @Override // defpackage.k11
    public final boolean c(defpackage.yw7 r1) {
            r0 = this;
            r1.getClass()
            p21 r0 = r1.j
            kf4 r0 = r0.a
            kf4 r1 = defpackage.kf4.METERED
            if (r0 != r1) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // defpackage.c20
    public final int d() {
            r0 = this;
            int r0 = r0.b
            return r0
    }

    @Override // defpackage.c20
    public final boolean e(java.lang.Object r4) {
            r3 = this;
            gf4 r4 = (defpackage.gf4) r4
            r4.getClass()
            boolean r3 = r4.e
            boolean r0 = r4.a
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 >= r2) goto L1f
            ga0 r4 = defpackage.ga0.f()
            java.lang.String r1 = defpackage.we4.c
            java.lang.String r2 = "Metered network constraint is not supported before API 26, only checking for connected state."
            r4.b(r1, r2)
            if (r0 == 0) goto L2a
            if (r3 == 0) goto L28
            goto L2a
        L1f:
            if (r0 == 0) goto L2a
            boolean r4 = r4.c
            if (r4 == 0) goto L2a
            if (r3 == 0) goto L28
            goto L2a
        L28:
            r3 = 0
            return r3
        L2a:
            r3 = 1
            return r3
    }
}

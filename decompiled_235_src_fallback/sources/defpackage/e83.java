package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e83  reason: default package */
/* loaded from: classes.dex */
public final class e83 {
    public static final defpackage.e83 e = null;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
            e83 r0 = new e83
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            defpackage.e83.e = r0
            return
    }

    public e83(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public static defpackage.e83 a(defpackage.e83 r4, defpackage.e83 r5) {
            int r0 = r4.a
            int r1 = r5.a
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r4.b
            int r2 = r5.b
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r4.c
            int r3 = r5.c
            int r2 = java.lang.Math.max(r2, r3)
            int r4 = r4.d
            int r5 = r5.d
            int r4 = java.lang.Math.max(r4, r5)
            e83 r4 = c(r0, r1, r2, r4)
            return r4
    }

    public static defpackage.e83 b(defpackage.e83 r4, defpackage.e83 r5) {
            int r0 = r4.a
            int r1 = r5.a
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r4.b
            int r2 = r5.b
            int r1 = java.lang.Math.min(r1, r2)
            int r2 = r4.c
            int r3 = r5.c
            int r2 = java.lang.Math.min(r2, r3)
            int r4 = r4.d
            int r5 = r5.d
            int r4 = java.lang.Math.min(r4, r5)
            e83 r4 = c(r0, r1, r2, r4)
            return r4
    }

    public static defpackage.e83 c(int r1, int r2, int r3, int r4) {
            if (r1 != 0) goto Lb
            if (r2 != 0) goto Lb
            if (r3 != 0) goto Lb
            if (r4 != 0) goto Lb
            e83 r1 = defpackage.e83.e
            return r1
        Lb:
            e83 r0 = new e83
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static defpackage.e83 d(android.graphics.Insets r3) {
            int r0 = defpackage.yz0.v(r3)
            int r1 = defpackage.au2.c(r3)
            int r2 = defpackage.au2.p(r3)
            int r3 = defpackage.au2.u(r3)
            e83 r3 = c(r0, r1, r2, r3)
            return r3
    }

    public final android.graphics.Insets e() {
            r3 = this;
            int r0 = r3.c
            int r1 = r3.d
            int r2 = r3.a
            int r3 = r3.b
            android.graphics.Insets r3 = defpackage.rp.n(r2, r3, r0, r1)
            return r3
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2f
            java.lang.Class<e83> r2 = defpackage.e83.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L2f
        L10:
            e83 r5 = (defpackage.e83) r5
            int r2 = r4.d
            int r3 = r5.d
            if (r2 == r3) goto L19
            return r1
        L19:
            int r2 = r4.a
            int r3 = r5.a
            if (r2 == r3) goto L20
            return r1
        L20:
            int r2 = r4.c
            int r3 = r5.c
            if (r2 == r3) goto L27
            return r1
        L27:
            int r4 = r4.b
            int r5 = r5.b
            if (r4 == r5) goto L2e
            return r1
        L2e:
            return r0
        L2f:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.c
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.d
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Insets{left="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            int r2 = r2.d
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}

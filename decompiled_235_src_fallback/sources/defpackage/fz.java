package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fz  reason: default package */
/* loaded from: classes.dex */
public final class fz {
    public final java.lang.String a;
    public final byte[] b;
    public final defpackage.b35 c;

    public fz(java.lang.String r1, byte[] r2, defpackage.b35 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static defpackage.bt a() {
            bt r0 = new bt
            r1 = 5
            r2 = 0
            r0.<init>(r1, r2)
            b35 r1 = defpackage.b35.DEFAULT
            if (r1 == 0) goto Le
            r0.R = r1
            return r0
        Le:
            java.lang.String r0 = "Null priority"
            defpackage.u34.x(r0)
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.fz
            r2 = 0
            if (r1 == 0) goto L2a
            fz r5 = (defpackage.fz) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2a
            byte[] r1 = r4.b
            byte[] r3 = r5.b
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L2a
            b35 r4 = r4.c
            b35 r5 = r5.c
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L2a
            return r0
        L2a:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            byte[] r2 = r3.b
            int r2 = java.util.Arrays.hashCode(r2)
            r0 = r0 ^ r2
            int r0 = r0 * r1
            b35 r3 = r3.c
            int r3 = r3.hashCode()
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            byte[] r0 = r3.b
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            goto Lc
        L7:
            r1 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "TransportContext("
            r1.<init>(r2)
            java.lang.String r2 = r3.a
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            b35 r3 = r3.c
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = ")"
            java.lang.String r3 = defpackage.i61.n(r1, r0, r3)
            return r3
    }
}

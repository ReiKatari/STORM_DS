package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bz  reason: default package */
/* loaded from: classes.dex */
public final class bz {
    public final int a;
    public final android.view.Surface b;

    public bz(int r1, android.view.Surface r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            if (r2 == 0) goto La
            r0.b = r2
            return
        La:
            java.lang.String r0 = "Null surface"
            defpackage.u34.x(r0)
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L19
        L3:
            boolean r0 = r3 instanceof defpackage.bz
            if (r0 == 0) goto L1b
            bz r3 = (defpackage.bz) r3
            int r0 = r2.a
            int r1 = r3.a
            if (r0 != r1) goto L1b
            android.view.Surface r2 = r2.b
            android.view.Surface r3 = r3.b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1b
        L19:
            r2 = 1
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.a
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            android.view.Surface r2 = r2.b
            int r2 = r2.hashCode()
            r2 = r2 ^ r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Result{resultCode="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", surface="
            r0.append(r1)
            android.view.Surface r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

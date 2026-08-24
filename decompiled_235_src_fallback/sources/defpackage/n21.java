package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n21  reason: default package */
/* loaded from: classes.dex */
public final class n21 {
    public final android.net.Uri a;
    public final boolean b;

    public n21(boolean r1, android.net.Uri r2) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            if (r3 == 0) goto La
            java.lang.Class r0 = r3.getClass()
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.Class<n21> r1 = defpackage.n21.class
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L14
            goto L2a
        L14:
            r3.getClass()
            n21 r3 = (defpackage.n21) r3
            android.net.Uri r0 = r2.a
            android.net.Uri r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L24
            goto L2a
        L24:
            boolean r2 = r2.b
            boolean r3 = r3.b
            if (r2 == r3) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            android.net.Uri r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r1.b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}

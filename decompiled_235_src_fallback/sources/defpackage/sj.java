package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sj  reason: default package */
/* loaded from: classes.dex */
public final class sj implements defpackage.ty4 {
    public final int b;

    public sj(int r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            if (r3 == 0) goto La
            java.lang.Class r0 = r3.getClass()
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.Class<sj> r1 = defpackage.sj.class
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L14
            goto L1f
        L14:
            r3.getClass()
            sj r3 = (defpackage.sj) r3
            int r2 = r2.b
            int r3 = r3.b
            if (r2 == r3) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.b
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AndroidPointerIcon(type="
            r0.<init>(r1)
            int r2 = r2.b
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}

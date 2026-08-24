package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q81  reason: default package */
/* loaded from: classes.dex */
public final class q81 {
    public final java.lang.Class a;
    public final boolean b;

    public q81(java.lang.Class r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof defpackage.q81
            r1 = 0
            if (r0 == 0) goto L19
            q81 r4 = (defpackage.q81) r4
            java.lang.Class r0 = r4.a
            java.lang.Class r2 = r3.a
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L19
            boolean r4 = r4.b
            boolean r3 = r3.b
            if (r4 != r3) goto L19
            r3 = 1
            return r3
        L19:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            boolean r2 = r2.b
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            int r2 = r2.hashCode()
            r2 = r2 ^ r0
            return r2
    }
}

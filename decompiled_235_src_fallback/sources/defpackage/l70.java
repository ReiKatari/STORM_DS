package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l70  reason: default package */
/* loaded from: classes.dex */
public final class l70 {
    public final defpackage.qh1 a;
    public final long b;

    public l70(defpackage.qt6 r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final float a() {
            r3 = this;
            long r0 = r3.b
            boolean r2 = defpackage.q21.c(r0)
            if (r2 == 0) goto L13
            int r0 = defpackage.q21.g(r0)
            qh1 r3 = r3.a
            float r3 = r3.Q(r0)
            return r3
        L13:
            r3 = 2139095040(0x7f800000, float:Infinity)
            return r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof defpackage.l70
            if (r0 != 0) goto L8
            goto L1f
        L8:
            l70 r3 = (defpackage.l70) r3
            qh1 r0 = r2.a
            qh1 r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            long r0 = r2.b
            long r2 = r3.b
            boolean r2 = defpackage.q21.b(r0, r2)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            qh1 r0 = r3.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r3.b
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BoxWithConstraintsScopeImpl(density="
            r0.<init>(r1)
            qh1 r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", constraints="
            r0.append(r1)
            long r1 = r3.b
            java.lang.String r3 = defpackage.q21.k(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}

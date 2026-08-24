package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i84  reason: default package */
/* loaded from: classes.dex */
public final class i84 {
    public final long a;
    public final long b;
    public final boolean c;

    public i84(long r1, long r3, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            return
    }

    public final defpackage.i84 a(defpackage.i84 r8) {
            r7 = this;
            i84 r0 = new i84
            long r1 = r7.a
            long r3 = r8.a
            long r1 = defpackage.jk4.f(r1, r3)
            long r3 = r7.b
            long r5 = r8.b
            long r3 = java.lang.Math.max(r3, r5)
            boolean r5 = r7.c
            r0.<init>(r1, r3, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L26
        L3:
            boolean r0 = r5 instanceof defpackage.i84
            if (r0 != 0) goto L8
            goto L24
        L8:
            i84 r5 = (defpackage.i84) r5
            long r0 = r4.a
            long r2 = r5.a
            boolean r0 = defpackage.jk4.c(r0, r2)
            if (r0 != 0) goto L15
            goto L24
        L15:
            long r0 = r4.b
            long r2 = r5.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1e
            goto L24
        L1e:
            boolean r4 = r4.c
            boolean r5 = r5.c
            if (r4 == r5) goto L26
        L24:
            r4 = 0
            return r4
        L26:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            boolean r4 = r4.c
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MouseWheelScrollDelta(value="
            r0.<init>(r1)
            long r1 = r3.a
            java.lang.String r1 = defpackage.jk4.h(r1)
            r0.append(r1)
            java.lang.String r1 = ", timeMillis="
            r0.append(r1)
            long r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", shouldApplyImmediately="
            r0.append(r1)
            boolean r3 = r3.c
            r1 = 41
            java.lang.String r3 = defpackage.xg6.r(r0, r3, r1)
            return r3
    }
}

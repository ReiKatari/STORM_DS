package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ge6  reason: default package */
/* loaded from: classes.dex */
public final class ge6 {
    public static final defpackage.ge6 d = null;
    public final long a;
    public final long b;
    public final float c;

    static {
            ge6 r0 = new ge6
            r1 = 4278190080(0xff000000, double:2.113706745E-314)
            long r2 = defpackage.hv.c(r1)
            r4 = 0
            r1 = 0
            r0.<init>(r1, r2, r4)
            defpackage.ge6.d = r0
            return
    }

    public ge6(float r1, long r2, long r4) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r4
            r0.c = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L28
        L3:
            boolean r0 = r5 instanceof defpackage.ge6
            if (r0 != 0) goto L8
            goto L2a
        L8:
            ge6 r5 = (defpackage.ge6) r5
            long r0 = r5.a
            long r2 = r4.a
            boolean r0 = defpackage.kt0.d(r2, r0)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            long r0 = r4.b
            long r2 = r5.b
            boolean r0 = defpackage.jk4.c(r0, r2)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            float r4 = r4.c
            float r5 = r5.c
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L2a
        L28:
            r4 = 1
            return r4
        L2a:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r4 = this;
            int r0 = defpackage.kt0.i
            long r0 = r4.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            float r4 = r4.c
            int r4 = java.lang.Float.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Shadow(color="
            r0.<init>(r1)
            long r1 = r3.a
            java.lang.String r1 = defpackage.kt0.j(r1)
            r0.append(r1)
            java.lang.String r1 = ", offset="
            r0.append(r1)
            long r1 = r3.b
            java.lang.String r1 = defpackage.jk4.h(r1)
            r0.append(r1)
            java.lang.String r1 = ", blurRadius="
            r0.append(r1)
            float r3 = r3.c
            r1 = 41
            java.lang.String r3 = defpackage.xg6.p(r0, r3, r1)
            return r3
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gi5  reason: default package */
/* loaded from: classes.dex */
public final class gi5 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final defpackage.rz g;

    public gi5(long r1, long r3, long r5, long r7, long r9, float[] r11, defpackage.rz r12) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r7
            r0.e = r9
            r0.f = r11
            r0.g = r12
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L61
            java.lang.Class<gi5> r2 = defpackage.gi5.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            goto L61
        L10:
            gi5 r7 = (defpackage.gi5) r7
            long r2 = r6.a
            long r4 = r7.a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L1b
            goto L61
        L1b:
            long r2 = r6.b
            long r4 = r7.b
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L24
            goto L61
        L24:
            long r2 = r6.e
            long r4 = r7.e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L2d
            goto L61
        L2d:
            long r2 = r6.c
            long r4 = r7.c
            boolean r2 = defpackage.i93.a(r2, r4)
            if (r2 != 0) goto L38
            goto L61
        L38:
            long r2 = r6.d
            long r4 = r7.d
            boolean r2 = defpackage.i93.a(r2, r4)
            if (r2 != 0) goto L43
            goto L61
        L43:
            float[] r2 = r7.f
            float[] r3 = r6.f
            if (r3 != 0) goto L4f
            if (r2 != 0) goto L4d
            r2 = r0
            goto L56
        L4d:
            r2 = r1
            goto L56
        L4f:
            if (r2 != 0) goto L52
            goto L4d
        L52:
            boolean r2 = r3.equals(r2)
        L56:
            if (r2 != 0) goto L59
            goto L61
        L59:
            rz r6 = r6.g
            rz r7 = r7.g
            if (r6 == r7) goto L60
            return r1
        L60:
            return r0
        L61:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.e
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.c
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.d
            int r0 = defpackage.i61.c(r2, r0, r1)
            float[] r2 = r4.f
            if (r2 == 0) goto L2a
            int r2 = java.util.Arrays.hashCode(r2)
            goto L2b
        L2a:
            r2 = 0
        L2b:
            int r0 = r0 + r2
            int r0 = r0 * r1
            rz r4 = r4.g
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }
}

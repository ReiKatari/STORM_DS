package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bd1  reason: default package */
/* loaded from: classes.dex */
public final class bd1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public bd1(long r1, long r3, long r5, long r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r7
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L3f
            java.lang.Class<bd1> r2 = defpackage.bd1.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            goto L3f
        L10:
            bd1 r7 = (defpackage.bd1) r7
            long r2 = r6.a
            long r4 = r7.a
            boolean r2 = defpackage.kt0.d(r2, r4)
            if (r2 != 0) goto L1d
            return r1
        L1d:
            long r2 = r6.b
            long r4 = r7.b
            boolean r2 = defpackage.kt0.d(r2, r4)
            if (r2 != 0) goto L28
            return r1
        L28:
            long r2 = r6.c
            long r4 = r7.c
            boolean r2 = defpackage.kt0.d(r2, r4)
            if (r2 != 0) goto L33
            return r1
        L33:
            long r2 = r6.d
            long r6 = r7.d
            boolean r6 = defpackage.kt0.d(r2, r6)
            if (r6 != 0) goto L3e
            return r1
        L3e:
            return r0
        L3f:
            return r1
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
            long r2 = r4.c
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r1 = r4.d
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }
}

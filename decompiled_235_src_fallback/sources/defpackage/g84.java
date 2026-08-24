package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g84  reason: default package */
/* loaded from: classes.dex */
public final class g84 {
    public long a;
    public long b;
    public android.animation.TimeInterpolator c;
    public int d;
    public int e;

    public final android.animation.TimeInterpolator a() {
            r0 = this;
            android.animation.TimeInterpolator r0 = r0.c
            if (r0 == 0) goto L5
            return r0
        L5:
            q92 r0 = defpackage.vo.b
            return r0
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 != r7) goto L4
            r6 = 1
            return r6
        L4:
            boolean r0 = r7 instanceof defpackage.g84
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            g84 r7 = (defpackage.g84) r7
            long r2 = r6.a
            long r4 = r7.a
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L15
            return r1
        L15:
            long r2 = r6.b
            long r4 = r7.b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1e
            return r1
        L1e:
            int r0 = r6.d
            int r2 = r7.d
            if (r0 == r2) goto L25
            return r1
        L25:
            int r0 = r6.e
            int r2 = r7.e
            if (r0 == r2) goto L2c
            return r1
        L2c:
            android.animation.TimeInterpolator r6 = r6.a()
            java.lang.Class r6 = r6.getClass()
            android.animation.TimeInterpolator r7 = r7.a()
            java.lang.Class r7 = r7.getClass()
            boolean r6 = r6.equals(r7)
            return r6
    }

    public final int hashCode() {
            r5 = this;
            long r0 = r5.a
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r0 = (int) r0
            int r0 = r0 * 31
            long r3 = r5.b
            long r1 = r3 >>> r2
            long r1 = r1 ^ r3
            int r1 = (int) r1
            int r0 = r0 + r1
            int r0 = r0 * 31
            android.animation.TimeInterpolator r1 = r5.a()
            java.lang.Class r1 = r1.getClass()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r5.d
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r5 = r5.e
            int r1 = r1 + r5
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n"
            r0.<init>(r1)
            java.lang.Class<g84> r1 = defpackage.g84.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " delay: "
            r0.append(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = " duration: "
            r0.append(r1)
            long r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = " interpolator: "
            r0.append(r1)
            android.animation.TimeInterpolator r1 = r3.a()
            java.lang.Class r1 = r1.getClass()
            r0.append(r1)
            java.lang.String r1 = " repeatCount: "
            r0.append(r1)
            int r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = " repeatMode: "
            r0.append(r1)
            int r3 = r3.e
            java.lang.String r1 = "}\n"
            java.lang.String r3 = defpackage.lb1.o(r0, r3, r1)
            return r3
    }
}

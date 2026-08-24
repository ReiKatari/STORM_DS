package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: of5  reason: default package */
/* loaded from: classes.dex */
public final class of5 {
    public static final defpackage.of5 e = null;
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    static {
            of5 r0 = new of5
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            defpackage.of5.e = r0
            return
    }

    public of5(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final boolean a(long r5) {
            r4 = this;
            r0 = 32
            long r0 = r5 >> r0
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r1
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r6 = r4.a
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r6 < 0) goto L1e
            r6 = r2
            goto L1f
        L1e:
            r6 = r1
        L1f:
            float r3 = r4.c
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L27
            r0 = r2
            goto L28
        L27:
            r0 = r1
        L28:
            r6 = r6 & r0
            float r0 = r4.b
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L31
            r0 = r2
            goto L32
        L31:
            r0 = r1
        L32:
            r6 = r6 & r0
            float r4 = r4.d
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 >= 0) goto L3a
            r1 = r2
        L3a:
            r4 = r6 & r1
            return r4
    }

    public final long b() {
            r6 = this;
            float r0 = r6.c
            float r1 = r6.a
            float r0 = r0 - r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r0 = r0 + r1
            float r1 = r6.d
            float r6 = r6.b
            float r1 = r1 - r6
            float r1 = r1 / r2
            float r1 = r1 + r6
            int r6 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r6
            r6 = 32
            long r2 = r2 << r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            return r0
    }

    public final long c() {
            r6 = this;
            float r0 = r6.c
            float r1 = r6.a
            float r0 = r0 - r1
            float r1 = r6.d
            float r6 = r6.b
            float r1 = r1 - r6
            int r6 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r6
            r6 = 32
            long r2 = r2 << r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            return r0
    }

    public final long d() {
            r6 = this;
            float r0 = r6.a
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            float r6 = r6.b
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r2 = (long) r6
            r6 = 32
            long r0 = r0 << r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
    }

    public final defpackage.of5 e(defpackage.of5 r6) {
            r5 = this;
            of5 r0 = new of5
            float r1 = r5.a
            float r2 = r6.a
            float r1 = java.lang.Math.max(r1, r2)
            float r2 = r5.b
            float r3 = r6.b
            float r2 = java.lang.Math.max(r2, r3)
            float r3 = r5.c
            float r4 = r6.c
            float r3 = java.lang.Math.min(r3, r4)
            float r5 = r5.d
            float r6 = r6.d
            float r5 = java.lang.Math.min(r5, r6)
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.of5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            of5 r5 = (defpackage.of5) r5
            float r1 = r4.a
            float r3 = r5.a
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r1 = r4.b
            float r3 = r5.b
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L22
            return r2
        L22:
            float r1 = r4.c
            float r3 = r5.c
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L2d
            return r2
        L2d:
            float r4 = r4.d
            float r5 = r5.d
            int r4 = java.lang.Float.compare(r4, r5)
            if (r4 == 0) goto L38
            return r2
        L38:
            return r0
    }

    public final boolean f() {
            r4 = this;
            float r0 = r4.a
            float r1 = r4.c
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 < 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            float r3 = r4.b
            float r4 = r4.d
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 < 0) goto L16
            r1 = r2
        L16:
            r4 = r0 | r1
            return r4
    }

    public final boolean g(defpackage.of5 r6) {
            r5 = this;
            float r0 = r5.a
            float r1 = r6.c
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 >= 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            float r3 = r6.a
            float r4 = r5.c
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L17
            r3 = r2
            goto L18
        L17:
            r3 = r1
        L18:
            r0 = r0 & r3
            float r3 = r5.b
            float r4 = r6.d
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L23
            r3 = r2
            goto L24
        L23:
            r3 = r1
        L24:
            r0 = r0 & r3
            float r6 = r6.b
            float r5 = r5.d
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 >= 0) goto L2e
            r1 = r2
        L2e:
            r5 = r0 & r1
            return r5
    }

    public final defpackage.of5 h(float r5, float r6) {
            r4 = this;
            of5 r0 = new of5
            float r1 = r4.a
            float r1 = r1 + r5
            float r2 = r4.b
            float r2 = r2 + r6
            float r3 = r4.c
            float r3 = r3 + r5
            float r4 = r4.d
            float r4 = r4 + r6
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.b
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r3.c
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r3 = r3.d
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final defpackage.of5 i(long r6) {
            r5 = this;
            of5 r0 = new of5
            r1 = 32
            long r1 = r6 >> r1
            int r1 = (int) r1
            float r2 = java.lang.Float.intBitsToFloat(r1)
            float r3 = r5.a
            float r2 = r2 + r3
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r3
            int r6 = (int) r6
            float r7 = java.lang.Float.intBitsToFloat(r6)
            float r3 = r5.b
            float r7 = r7 + r3
            float r3 = r5.c
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 + r3
            float r5 = r5.d
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = r6 + r5
            r0.<init>(r2, r7, r1, r6)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Rect.fromLTRB("
            r0.<init>(r1)
            float r1 = r3.a
            java.lang.String r1 = defpackage.gi2.Q(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            float r2 = r3.b
            java.lang.String r2 = defpackage.gi2.Q(r2)
            r0.append(r2)
            r0.append(r1)
            float r2 = r3.c
            java.lang.String r2 = defpackage.gi2.Q(r2)
            r0.append(r2)
            r0.append(r1)
            float r3 = r3.d
            java.lang.String r3 = defpackage.gi2.Q(r3)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yr4  reason: default package */
/* loaded from: classes.dex */
public final class yr4 {
    public final defpackage.cj a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public yr4(defpackage.cj r1, int r2, int r3, int r4, int r5, float r6, float r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            return
    }

    public final defpackage.of5 a(defpackage.of5 r7) {
            r6 = this;
            r0 = 0
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            float r6 = r6.f
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r2 = (long) r6
            r6 = 32
            long r0 = r0 << r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            of5 r6 = r7.i(r0)
            return r6
    }

    public final long b(long r3, boolean r5) {
            r2 = this;
            if (r5 == 0) goto Lb
            long r0 = defpackage.k47.b
            boolean r5 = defpackage.k47.b(r3, r0)
            if (r5 == 0) goto Lb
            return r0
        Lb:
            int r5 = defpackage.k47.c
            r5 = 32
            long r0 = r3 >> r5
            int r5 = (int) r0
            int r2 = r2.b
            int r5 = r5 + r2
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            int r3 = (int) r3
            int r3 = r3 + r2
            long r2 = defpackage.jx2.f(r5, r3)
            return r2
    }

    public final defpackage.of5 c(defpackage.of5 r7) {
            r6 = this;
            float r6 = r6.f
            float r6 = -r6
            r0 = 0
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r2 = (long) r6
            r6 = 32
            long r0 = r0 << r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            of5 r6 = r7.i(r0)
            return r6
    }

    public final int d(int r2) {
            r1 = this;
            int r0 = r1.c
            int r1 = r1.b
            int r2 = defpackage.gi2.q(r2, r1, r0)
            int r2 = r2 - r1
            return r2
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L3
            goto L44
        L3:
            boolean r0 = r4 instanceof defpackage.yr4
            r1 = 0
            if (r0 != 0) goto L9
            goto L43
        L9:
            yr4 r4 = (defpackage.yr4) r4
            cj r0 = r3.a
            cj r2 = r4.a
            if (r0 == r2) goto L12
            return r1
        L12:
            int r0 = r3.b
            int r2 = r4.b
            if (r0 == r2) goto L19
            goto L43
        L19:
            int r0 = r3.c
            int r2 = r4.c
            if (r0 == r2) goto L20
            goto L43
        L20:
            int r0 = r3.d
            int r2 = r4.d
            if (r0 == r2) goto L27
            goto L43
        L27:
            int r0 = r3.e
            int r2 = r4.e
            if (r0 == r2) goto L2e
            goto L43
        L2e:
            float r0 = r3.f
            float r2 = r4.f
            int r0 = java.lang.Float.compare(r0, r2)
            if (r0 == 0) goto L39
            goto L43
        L39:
            float r3 = r3.g
            float r4 = r4.g
            int r3 = java.lang.Float.compare(r3, r4)
            if (r3 == 0) goto L44
        L43:
            return r1
        L44:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            cj r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.c
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.d
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.e
            int r0 = defpackage.lb1.a(r2, r0, r1)
            float r2 = r3.f
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r3 = r3.g
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ParagraphInfo(paragraph="
            r0.<init>(r1)
            cj r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", startIndex="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", endIndex="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", startLineIndex="
            r0.append(r1)
            int r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", endLineIndex="
            r0.append(r1)
            int r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            float r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            float r2 = r2.g
            r1 = 41
            java.lang.String r2 = defpackage.xg6.p(r0, r2, r1)
            return r2
    }
}

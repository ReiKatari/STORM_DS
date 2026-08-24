package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ys6  reason: default package */
/* loaded from: classes.dex */
public final class ys6 extends defpackage.oo1 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public ys6(float r2, float r3, int r4, int r5, defpackage.ij r6, int r7) {
            r1 = this;
            r6 = r7 & 2
            if (r6 == 0) goto L6
            r3 = 1082130432(0x40800000, float:4.0)
        L6:
            r6 = r7 & 4
            r0 = 0
            if (r6 == 0) goto Lc
            r4 = r0
        Lc:
            r6 = r7 & 8
            if (r6 == 0) goto L11
            r5 = r0
        L11:
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ys6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ys6 r5 = (defpackage.ys6) r5
            float r1 = r5.a
            float r3 = r4.a
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L31
            float r1 = r4.b
            float r3 = r5.b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L31
            int r1 = r4.c
            int r3 = r5.c
            if (r1 != r3) goto L31
            int r4 = r4.d
            int r5 = r5.d
            if (r4 != r5) goto L31
            r4 = 0
            boolean r4 = defpackage.nb3.k(r4, r4)
            if (r4 != 0) goto L30
            return r2
        L30:
            return r0
        L31:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.b
            int r0 = defpackage.xg6.a(r2, r0, r1)
            int r2 = r3.c
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r3 = r3.d
            int r3 = defpackage.lb1.a(r3, r0, r1)
            int r3 = r3 + 0
            return r3
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Stroke(width="
            r0.<init>(r1)
            float r1 = r6.a
            r0.append(r1)
            java.lang.String r1 = ", miter="
            r0.append(r1)
            float r1 = r6.b
            r0.append(r1)
            java.lang.String r1 = ", cap="
            r0.append(r1)
            java.lang.String r1 = "Unknown"
            r2 = 2
            java.lang.String r3 = "Round"
            r4 = 1
            int r5 = r6.c
            if (r5 != 0) goto L28
            java.lang.String r5 = "Butt"
            goto L32
        L28:
            if (r5 != r4) goto L2c
            r5 = r3
            goto L32
        L2c:
            if (r5 != r2) goto L31
            java.lang.String r5 = "Square"
            goto L32
        L31:
            r5 = r1
        L32:
            r0.append(r5)
            java.lang.String r5 = ", join="
            r0.append(r5)
            int r6 = r6.d
            if (r6 != 0) goto L41
            java.lang.String r1 = "Miter"
            goto L49
        L41:
            if (r6 != r4) goto L45
            r1 = r3
            goto L49
        L45:
            if (r6 != r2) goto L49
            java.lang.String r1 = "Bevel"
        L49:
            r0.append(r1)
            java.lang.String r6 = ", pathEffect="
            r0.append(r6)
            r6 = 0
            r0.append(r6)
            r6 = 41
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }
}

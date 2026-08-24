package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w40  reason: default package */
/* loaded from: classes.dex */
public final class w40 extends defpackage.sr4 {
    public final defpackage.zh X;
    public final long Y;
    public int Z;
    public final long d0;
    public float e0;
    public defpackage.z40 f0;

    public w40(defpackage.zh r7) {
            r6 = this;
            android.graphics.Bitmap r0 = r7.a
            int r0 = r0.getWidth()
            android.graphics.Bitmap r1 = r7.a
            int r1 = r1.getHeight()
            long r2 = (long) r0
            r0 = 32
            long r2 = r2 << r0
            long r0 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            r6.<init>(r7, r0)
            return
    }

    public w40(defpackage.zh r4, long r5) {
            r3 = this;
            r3.<init>()
            r3.X = r4
            r3.Y = r5
            r0 = 1
            r3.Z = r0
            r0 = 32
            long r0 = r5 >> r0
            int r0 = (int) r0
            if (r0 < 0) goto L31
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
            int r1 = (int) r1
            if (r1 < 0) goto L31
            android.graphics.Bitmap r2 = r4.a
            int r2 = r2.getWidth()
            if (r0 > r2) goto L31
            android.graphics.Bitmap r4 = r4.a
            int r4 = r4.getHeight()
            if (r1 > r4) goto L31
            r3.d0 = r5
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.e0 = r4
            return
        L31:
            java.lang.String r3 = "Failed requirement."
            defpackage.i.h(r3)
            r3 = 0
            throw r3
    }

    @Override // defpackage.sr4
    public final void d(float r1) {
            r0 = this;
            r0.e0 = r1
            return
    }

    @Override // defpackage.sr4
    public final void e(defpackage.z40 r1) {
            r0 = this;
            r0.f0 = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L2f
        L3:
            boolean r0 = r5 instanceof defpackage.w40
            if (r0 != 0) goto L8
            goto L31
        L8:
            w40 r5 = (defpackage.w40) r5
            zh r0 = r5.X
            zh r1 = r4.X
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 != 0) goto L15
            goto L31
        L15:
            r0 = 0
            boolean r0 = defpackage.i93.a(r0, r0)
            if (r0 != 0) goto L1e
            goto L31
        L1e:
            long r0 = r4.Y
            long r2 = r5.Y
            boolean r0 = defpackage.q93.b(r0, r2)
            if (r0 != 0) goto L29
            goto L31
        L29:
            int r4 = r4.Z
            int r5 = r5.Z
            if (r4 != r5) goto L31
        L2f:
            r4 = 1
            return r4
        L31:
            r4 = 0
            return r4
    }

    @Override // defpackage.sr4
    public final long h() {
            r2 = this;
            long r0 = r2.d0
            long r0 = defpackage.qo2.S(r0)
            return r0
    }

    public final int hashCode() {
            r4 = this;
            zh r0 = r4.X
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.Y
            int r0 = defpackage.i61.c(r2, r0, r1)
            int r4 = r4.Z
            int r4 = java.lang.Integer.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    @Override // defpackage.sr4
    public final void i(defpackage.um3 r11) {
            r10 = this;
            zj0 r2 = r11.A
            long r3 = r2.e()
            r5 = 32
            long r3 = r3 >> r5
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            int r3 = java.lang.Math.round(r3)
            long r6 = r2.e()
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            int r2 = (int) r6
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r2 = java.lang.Math.round(r2)
            long r3 = (long) r3
            long r3 = r3 << r5
            long r5 = (long) r2
            long r5 = r5 & r8
            long r4 = r3 | r5
            float r6 = r10.e0
            z40 r7 = r10.f0
            int r8 = r10.Z
            r9 = 328(0x148, float:4.6E-43)
            zh r1 = r10.X
            long r2 = r10.Y
            r0 = r11
            defpackage.no1.z(r0, r1, r2, r4, r6, r7, r8, r9)
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BitmapPainter(image="
            r0.<init>(r1)
            zh r1 = r3.X
            r0.append(r1)
            java.lang.String r1 = ", srcOffset="
            r0.append(r1)
            r1 = 0
            java.lang.String r1 = defpackage.i93.d(r1)
            r0.append(r1)
            java.lang.String r1 = ", srcSize="
            r0.append(r1)
            long r1 = r3.Y
            java.lang.String r1 = defpackage.q93.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", filterQuality="
            r0.append(r1)
            int r3 = r3.Z
            if (r3 != 0) goto L34
            java.lang.String r3 = "None"
            goto L48
        L34:
            r1 = 1
            if (r3 != r1) goto L3a
            java.lang.String r3 = "Low"
            goto L48
        L3a:
            r1 = 2
            if (r3 != r1) goto L40
            java.lang.String r3 = "Medium"
            goto L48
        L40:
            r1 = 3
            if (r3 != r1) goto L46
            java.lang.String r3 = "High"
            goto L48
        L46:
            java.lang.String r3 = "Unknown"
        L48:
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}

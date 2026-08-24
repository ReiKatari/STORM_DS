package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ly  reason: default package */
/* loaded from: classes.dex */
public final class ly implements defpackage.i23 {
    public final defpackage.sy6 a;
    public final long b;
    public final int c;
    public final android.graphics.Matrix d;
    public final int e;

    public ly(defpackage.sy6 r1, long r2, int r4, android.graphics.Matrix r5, int r6) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L10
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r5
            r0.e = r6
            return
        L10:
            java.lang.String r0 = "Null tagBundle"
            defpackage.u34.x(r0)
            r0 = 0
            throw r0
    }

    @Override // defpackage.i23
    public final defpackage.sy6 a() {
            r0 = this;
            sy6 r0 = r0.a
            return r0
    }

    @Override // defpackage.i23
    public final int b() {
            r0 = this;
            int r0 = r0.e
            return r0
    }

    @Override // defpackage.i23
    public final long c() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    @Override // defpackage.i23
    public final int d() {
            r0 = this;
            int r0 = r0.c
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r5 != r4) goto L3
            goto L31
        L3:
            boolean r0 = r5 instanceof defpackage.ly
            if (r0 == 0) goto L33
            ly r5 = (defpackage.ly) r5
            sy6 r0 = r4.a
            sy6 r1 = r5.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            long r0 = r4.b
            long r2 = r5.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L33
            int r0 = r4.c
            int r1 = r5.c
            if (r0 != r1) goto L33
            android.graphics.Matrix r0 = r4.d
            android.graphics.Matrix r1 = r5.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            int r4 = r4.e
            int r5 = r5.e
            if (r4 != r5) goto L33
        L31:
            r4 = 1
            return r4
        L33:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r7 = this;
            sy6 r0 = r7.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            r2 = 32
            long r3 = r7.b
            long r5 = r3 >>> r2
            long r2 = r5 ^ r3
            int r2 = (int) r2
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r7.c
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.graphics.Matrix r2 = r7.d
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r7 = r7.e
            r7 = r7 ^ r0
            return r7
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ImmutableImageInfo{tagBundle="
            r0.<init>(r1)
            sy6 r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", timestamp="
            r0.append(r1)
            long r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", rotationDegrees="
            r0.append(r1)
            int r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", sensorToBufferTransformMatrix="
            r0.append(r1)
            android.graphics.Matrix r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", flashState="
            r0.append(r1)
            int r3 = r3.e
            java.lang.String r1 = "}"
            java.lang.String r3 = defpackage.lb1.o(r0, r3, r1)
            return r3
    }
}

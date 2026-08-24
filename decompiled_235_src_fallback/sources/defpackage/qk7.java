package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qk7  reason: default package */
/* loaded from: classes.dex */
public final class qk7 extends defpackage.gk7 {
    public final defpackage.mu2 b;
    public java.lang.String c;
    public boolean d;
    public final defpackage.jo1 e;
    public defpackage.on2 f;
    public final defpackage.vs4 g;
    public defpackage.z40 h;
    public final defpackage.vs4 i;
    public long j;
    public float k;
    public float l;
    public final defpackage.pk7 m;

    public qk7(defpackage.mu2 r4) {
            r3 = this;
            r3.<init>()
            r3.b = r4
            pk7 r0 = new pk7
            r1 = 0
            r0.<init>(r3, r1)
            r4.i = r0
            java.lang.String r4 = ""
            r3.c = r4
            r4 = 1
            r3.d = r4
            jo1 r0 = new jo1
            r0.<init>()
            r3.e = r0
            iy0 r0 = defpackage.iy0.o0
            r3.f = r0
            r0 = 0
            vs4 r0 = defpackage.np2.Y(r0)
            r3.g = r0
            xi6 r0 = new xi6
            r1 = 0
            r0.<init>(r1)
            vs4 r0 = defpackage.np2.Y(r0)
            r3.i = r0
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r3.j = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.k = r0
            r3.l = r0
            pk7 r0 = new pk7
            r0.<init>(r3, r4)
            r3.m = r0
            return
    }

    @Override // defpackage.gk7
    public final void a(defpackage.no1 r3) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r2.e(r3, r0, r1)
            return
    }

    public final void e(defpackage.no1 r34, float r35, defpackage.z40 r36) {
            r33 = this;
            r0 = r33
            r1 = r36
            mu2 r2 = r0.b
            boolean r3 = r2.d
            r4 = 5
            vs4 r5 = r0.g
            r6 = 1
            if (r3 == 0) goto L3d
            long r8 = r2.e
            r10 = 16
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r5.getValue()
            z40 r3 = (defpackage.z40) r3
            int r8 = defpackage.el7.a
            boolean r8 = r3 instanceof defpackage.z40
            r9 = 3
            if (r8 == 0) goto L2b
            int r3 = r3.c
            if (r3 != r4) goto L28
            goto L2d
        L28:
            if (r3 != r9) goto L3d
            goto L2d
        L2b:
            if (r3 != 0) goto L3d
        L2d:
            boolean r3 = r1 instanceof defpackage.z40
            if (r3 == 0) goto L39
            int r3 = r1.c
            if (r3 != r4) goto L36
            goto L3b
        L36:
            if (r3 != r9) goto L3d
            goto L3b
        L39:
            if (r1 != 0) goto L3d
        L3b:
            r3 = r6
            goto L3e
        L3d:
            r3 = 0
        L3e:
            boolean r8 = r0.d
            jo1 r9 = r0.e
            if (r8 != 0) goto L5e
            long r10 = r0.j
            long r12 = r34.e()
            boolean r8 = defpackage.xi6.b(r10, r12)
            if (r8 == 0) goto L5e
            zh r8 = r9.a
            if (r8 == 0) goto L59
            int r8 = r8.a()
            goto L5a
        L59:
            r8 = 0
        L5a:
            if (r3 != r8) goto L5e
            goto L179
        L5e:
            if (r3 != r6) goto L79
            long r10 = r2.e
            int r2 = defpackage.el7.a
            float r2 = defpackage.kt0.e(r10)
            r6 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L6f
            goto L73
        L6f:
            long r10 = defpackage.kt0.c(r6, r10)
        L73:
            z40 r2 = new z40
            r2.<init>(r4, r10)
            goto L7a
        L79:
            r2 = 0
        L7a:
            r0.h = r2
            long r10 = r34.e()
            r2 = 32
            long r10 = r10 >> r2
            int r4 = (int) r10
            float r4 = java.lang.Float.intBitsToFloat(r4)
            vs4 r6 = r0.i
            java.lang.Object r8 = r6.getValue()
            xi6 r8 = (defpackage.xi6) r8
            long r10 = r8.a
            long r10 = r10 >> r2
            int r8 = (int) r10
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r4 = r4 / r8
            r0.k = r4
            long r10 = r34.e()
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r12
            int r4 = (int) r10
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Object r6 = r6.getValue()
            xi6 r6 = (defpackage.xi6) r6
            long r10 = r6.a
            long r10 = r10 & r12
            int r6 = (int) r10
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r4 = r4 / r6
            r0.l = r4
            long r10 = r34.e()
            long r10 = r10 >> r2
            int r4 = (int) r10
            float r4 = java.lang.Float.intBitsToFloat(r4)
            double r10 = (double) r4
            double r10 = java.lang.Math.ceil(r10)
            float r4 = (float) r10
            int r4 = (int) r4
            long r10 = r34.e()
            long r10 = r10 & r12
            int r6 = (int) r10
            float r6 = java.lang.Float.intBitsToFloat(r6)
            double r10 = (double) r6
            double r10 = java.lang.Math.ceil(r10)
            float r6 = (float) r10
            int r6 = (int) r6
            long r10 = (long) r4
            long r10 = r10 << r2
            long r14 = (long) r6
            long r14 = r14 & r12
            long r10 = r10 | r14
            kk3 r4 = r34.getLayoutDirection()
            zh r6 = r9.a
            wd r8 = r9.b
            if (r6 == 0) goto L10b
            if (r8 == 0) goto L10b
            long r14 = r10 >> r2
            int r14 = (int) r14
            android.graphics.Bitmap r15 = r6.a
            r16 = r2
            int r2 = r15.getWidth()
            r17 = r12
            if (r14 > r2) goto L10f
            long r12 = r10 & r17
            int r2 = (int) r12
            int r12 = r15.getHeight()
            if (r2 > r12) goto L10f
            int r2 = r9.d
            if (r2 != r3) goto L10f
            goto L125
        L10b:
            r16 = r2
            r17 = r12
        L10f:
            long r12 = r10 >> r16
            int r2 = (int) r12
            long r12 = r10 & r17
            int r6 = (int) r12
            r8 = 24
            zh r6 = defpackage.uj2.d(r2, r6, r3, r8)
            wd r8 = defpackage.ge7.c(r6)
            r9.a = r6
            r9.b = r8
            r9.d = r3
        L125:
            r9.c = r10
            zj0 r12 = r9.e
            long r2 = defpackage.qo2.S(r10)
            yj0 r10 = r12.A
            qh1 r11 = r10.a
            kk3 r13 = r10.b
            xj0 r14 = r10.c
            r22 = r8
            long r7 = r10.d
            r15 = r34
            r10.a = r15
            r10.b = r4
            r4 = r22
            r10.c = r4
            r10.d = r2
            r4.h()
            r2 = r13
            r3 = r14
            long r13 = defpackage.kt0.b
            r20 = 0
            r21 = 62
            r15 = 0
            r17 = 0
            r19 = 0
            defpackage.no1.F(r12, r13, r15, r17, r19, r20, r21)
            pk7 r10 = r0.m
            r10.g(r12)
            r4.p()
            yj0 r4 = r12.A
            r4.a = r11
            r4.b = r2
            r4.c = r3
            r4.d = r7
            android.graphics.Bitmap r2 = r6.a
            r2.prepareToDraw()
            r2 = 0
            r0.d = r2
            long r2 = r34.e()
            r0.j = r2
        L179:
            if (r1 == 0) goto L17e
            r30 = r1
            goto L192
        L17e:
            java.lang.Object r1 = r5.getValue()
            z40 r1 = (defpackage.z40) r1
            if (r1 == 0) goto L18f
            java.lang.Object r0 = r5.getValue()
            z40 r0 = (defpackage.z40) r0
        L18c:
            r30 = r0
            goto L192
        L18f:
            z40 r0 = r0.h
            goto L18c
        L192:
            zh r0 = r9.a
            if (r0 == 0) goto L197
            goto L19c
        L197:
            java.lang.String r1 = "drawCachedImage must be invoked first before attempting to draw the result into another destination"
            defpackage.p53.c(r1)
        L19c:
            long r1 = r9.c
            r31 = 0
            r32 = 858(0x35a, float:1.202E-42)
            r27 = 0
            r23 = r34
            r29 = r35
            r24 = r0
            r25 = r1
            defpackage.no1.z(r23, r24, r25, r27, r29, r30, r31, r32)
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Params: \tname: "
            r0.<init>(r1)
            java.lang.String r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = "\n\tviewportWidth: "
            r0.append(r1)
            vs4 r5 = r5.i
            java.lang.Object r1 = r5.getValue()
            xi6 r1 = (defpackage.xi6) r1
            long r1 = r1.a
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r0.append(r1)
            java.lang.String r1 = "\n\tviewportHeight: "
            r0.append(r1)
            java.lang.Object r5 = r5.getValue()
            xi6 r5 = (defpackage.xi6) r5
            long r1 = r5.a
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r5 = (int) r1
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r0.append(r5)
            java.lang.String r5 = "\n"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}

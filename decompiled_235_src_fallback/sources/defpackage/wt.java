package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wt  reason: default package */
/* loaded from: classes.dex */
public final class wt extends defpackage.ak7 {
    public final double[] l;
    public final defpackage.vt[] m;

    public wt(int[] r33, double[] r34, double[][] r35) {
            r32 = this;
            r0 = r32
            r1 = r34
            r0.<init>()
            r0.l = r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            vt[] r2 = new defpackage.vt[r2]
            r0.m = r2
            r2 = 0
            r4 = r2
            r5 = r3
            r6 = r5
        L14:
            vt[] r7 = r0.m
            int r8 = r7.length
            if (r4 >= r8) goto L1b0
            r8 = r33[r4]
            r9 = 5
            r10 = 4
            r11 = 3
            if (r8 == 0) goto L39
            if (r8 == r3) goto L37
            r12 = 2
            if (r8 == r12) goto L35
            if (r8 == r11) goto L30
            if (r8 == r10) goto L2e
            if (r8 == r9) goto L2c
            goto L3a
        L2c:
            r6 = r9
            goto L3a
        L2e:
            r6 = r10
            goto L3a
        L30:
            if (r5 != r3) goto L37
            goto L35
        L33:
            r6 = r5
            goto L3a
        L35:
            r5 = r12
            goto L33
        L37:
            r5 = r3
            goto L33
        L39:
            r6 = r11
        L3a:
            vt r8 = new vt
            r12 = r1[r4]
            int r14 = r4 + 1
            r16 = r12
            r11 = r1[r14]
            r13 = r35[r4]
            r9 = r13[r2]
            r20 = r3
            r21 = r4
            r3 = r13[r20]
            r13 = r35[r14]
            r22 = r2
            r23 = r3
            r2 = r13[r22]
            r0 = r13[r20]
            r8.<init>()
            r4 = r22
            r8.r = r4
            r13 = r5
            double r4 = r2 - r9
            r26 = r13
            r25 = r14
            double r13 = r0 - r23
            r27 = 0
            r15 = r20
            if (r6 == r15) goto L90
            r15 = 4
            if (r6 == r15) goto L86
            r15 = 5
            if (r6 == r15) goto L7d
            r15 = 0
            r8.q = r15
        L77:
            r18 = r4
            r4 = r16
            r15 = 1
            goto L96
        L7d:
            r15 = 0
            int r18 = (r13 > r27 ? 1 : (r13 == r27 ? 0 : -1))
            if (r18 >= 0) goto L83
            r15 = 1
        L83:
            r8.q = r15
            goto L77
        L86:
            int r15 = (r13 > r27 ? 1 : (r13 == r27 ? 0 : -1))
            if (r15 <= 0) goto L8c
            r15 = 1
            goto L8d
        L8c:
            r15 = 0
        L8d:
            r8.q = r15
            goto L77
        L90:
            r8.q = r15
            r18 = r4
            r4 = r16
        L96:
            r8.c = r4
            r8.d = r11
            double r11 = r11 - r4
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 / r11
            r8.i = r4
            r16 = r4
            r4 = 3
            if (r4 != r6) goto La7
            r8.r = r15
        La7:
            boolean r4 = r8.r
            if (r4 != 0) goto Lc0
            double r4 = java.lang.Math.abs(r18)
            r29 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r4 = (r4 > r29 ? 1 : (r4 == r29 ? 0 : -1))
            if (r4 < 0) goto Lc0
            double r4 = java.lang.Math.abs(r13)
            int r4 = (r4 > r29 ? 1 : (r4 == r29 ? 0 : -1))
            if (r4 >= 0) goto Lc5
        Lc0:
            r29 = r13
            r15 = 1
            goto L180
        Lc5:
            r4 = 101(0x65, float:1.42E-43)
            double[] r5 = new double[r4]
            r8.a = r5
            boolean r11 = r8.q
            if (r11 == 0) goto Ld3
            r15 = -1
        Ld0:
            r29 = r13
            goto Ld5
        Ld3:
            r15 = 1
            goto Ld0
        Ld5:
            double r12 = (double) r15
            double r12 = r12 * r18
            r8.j = r12
            if (r11 == 0) goto Lde
            r12 = 1
            goto Ldf
        Lde:
            r12 = -1
        Ldf:
            double r12 = (double) r12
            double r12 = r12 * r29
            r8.k = r12
            if (r11 == 0) goto Le7
            r9 = r2
        Le7:
            r8.l = r9
            if (r11 == 0) goto Lee
            r2 = r23
            goto Lef
        Lee:
            r2 = r0
        Lef:
            r8.m = r2
            double r0 = r23 - r0
            r9 = r27
            r11 = r9
            r15 = r11
            r2 = 0
        Lf8:
            r3 = 91
            double[] r13 = defpackage.vt.s
            r23 = 4636033603912859648(0x4056800000000000, double:90.0)
            if (r2 >= r3) goto L135
            r29 = r15
            double r14 = (double) r2
            double r14 = r14 * r23
            double r14 = r14 / r23
            double r14 = java.lang.Math.toRadians(r14)
            double r23 = java.lang.Math.sin(r14)
            double r14 = java.lang.Math.cos(r14)
            double r23 = r23 * r18
            double r14 = r14 * r0
            if (r2 <= 0) goto L129
            double r11 = r23 - r11
            r31 = r5
            double r4 = r14 - r29
            double r3 = java.lang.Math.hypot(r11, r4)
            double r9 = r9 + r3
            r13[r2] = r9
            goto L12b
        L129:
            r31 = r5
        L12b:
            int r2 = r2 + 1
            r15 = r14
            r11 = r23
            r5 = r31
            r4 = 101(0x65, float:1.42E-43)
            goto Lf8
        L135:
            r31 = r5
            r8.b = r9
            r0 = 0
        L13a:
            if (r0 >= r3) goto L144
            r1 = r13[r0]
            double r1 = r1 / r9
            r13[r0] = r1
            int r0 = r0 + 1
            goto L13a
        L144:
            r0 = 0
            r1 = 101(0x65, float:1.42E-43)
        L147:
            if (r0 >= r1) goto L177
            double r2 = (double) r0
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 / r4
            int r4 = java.util.Arrays.binarySearch(r13, r2)
            if (r4 < 0) goto L15a
            double r2 = (double) r4
            double r2 = r2 / r23
            r31[r0] = r2
            r14 = -1
            goto L174
        L15a:
            r14 = -1
            if (r4 != r14) goto L160
            r31[r0] = r27
            goto L174
        L160:
            int r4 = -r4
            int r5 = r4 + (-2)
            r20 = 1
            int r4 = r4 + (-1)
            double r9 = (double) r5
            r11 = r13[r5]
            double r2 = r2 - r11
            r4 = r13[r4]
            double r4 = r4 - r11
            double r2 = r2 / r4
            double r2 = r2 + r9
            double r2 = r2 / r23
            r31[r0] = r2
        L174:
            int r0 = r0 + 1
            goto L147
        L177:
            double r0 = r8.b
            double r2 = r8.i
            double r0 = r0 * r2
            r8.n = r0
            r15 = 1
            goto L1a2
        L180:
            r8.r = r15
            r8.e = r9
            r8.f = r2
            r2 = r23
            r8.g = r2
            r8.h = r0
            r2 = r18
            r0 = r29
            double r4 = java.lang.Math.hypot(r0, r2)
            r8.b = r4
            double r4 = r4 * r16
            r8.n = r4
            double r4 = r2 / r11
            r8.l = r4
            double r13 = r0 / r11
            r8.m = r13
        L1a2:
            r7[r21] = r8
            r0 = r32
            r1 = r34
            r3 = r15
            r4 = r25
            r5 = r26
            r2 = 0
            goto L14
        L1b0:
            return
    }

    @Override // defpackage.ak7
    public final double Z(double r6) {
            r5 = this;
            vt[] r5 = r5.m
            r0 = 0
            r1 = r5[r0]
            double r2 = r1.c
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 >= 0) goto L2d
            double r6 = r6 - r2
            boolean r4 = r1.r
            if (r4 == 0) goto L1b
            double r1 = r1.c(r2)
            r5 = r5[r0]
            double r3 = r5.l
            double r6 = r6 * r3
            double r6 = r6 + r1
            return r6
        L1b:
            r1.g(r2)
            r1 = r5[r0]
            double r1 = r1.e()
            r5 = r5[r0]
            double r3 = r5.a()
            double r3 = r3 * r6
            double r3 = r3 + r1
            return r3
        L2d:
            int r1 = r5.length
            int r1 = r1 + (-1)
            r1 = r5[r1]
            double r1 = r1.d
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L50
            int r0 = r5.length
            int r0 = r0 + (-1)
            r0 = r5[r0]
            double r0 = r0.d
            double r6 = r6 - r0
            int r2 = r5.length
            int r2 = r2 + (-1)
            r3 = r5[r2]
            double r0 = r3.c(r0)
            r5 = r5[r2]
            double r2 = r5.l
            double r6 = r6 * r2
            double r6 = r6 + r0
            return r6
        L50:
            int r1 = r5.length
            if (r0 >= r1) goto L71
            r1 = r5[r0]
            double r2 = r1.d
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 > 0) goto L6e
            boolean r2 = r1.r
            if (r2 == 0) goto L64
            double r5 = r1.c(r6)
            return r5
        L64:
            r1.g(r6)
            r5 = r5[r0]
            double r5 = r5.e()
            return r5
        L6e:
            int r0 = r0 + 1
            goto L50
        L71:
            r5 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r5
    }

    @Override // defpackage.ak7
    public final void a0(double r11, double[] r13) {
            r10 = this;
            vt[] r10 = r10.m
            r0 = 0
            r1 = r10[r0]
            double r2 = r1.c
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            r5 = 1
            if (r4 >= 0) goto L4e
            double r11 = r11 - r2
            boolean r4 = r1.r
            if (r4 == 0) goto L2a
            double r6 = r1.c(r2)
            r1 = r10[r0]
            double r8 = r1.l
            double r8 = r8 * r11
            double r8 = r8 + r6
            r13[r0] = r8
            double r1 = r1.d(r2)
            r10 = r10[r0]
            double r3 = r10.m
            double r11 = r11 * r3
            double r11 = r11 + r1
            r13[r5] = r11
            return
        L2a:
            r1.g(r2)
            r1 = r10[r0]
            double r1 = r1.e()
            r3 = r10[r0]
            double r3 = r3.a()
            double r3 = r3 * r11
            double r3 = r3 + r1
            r13[r0] = r3
            r1 = r10[r0]
            double r1 = r1.f()
            r10 = r10[r0]
            double r3 = r10.b()
            double r3 = r3 * r11
            double r3 = r3 + r1
            r13[r5] = r3
            return
        L4e:
            int r1 = r10.length
            int r1 = r1 - r5
            r1 = r10[r1]
            double r1 = r1.d
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 <= 0) goto La5
            int r1 = r10.length
            int r1 = r1 - r5
            r1 = r10[r1]
            double r1 = r1.d
            double r3 = r11 - r1
            int r6 = r10.length
            int r6 = r6 - r5
            r7 = r10[r6]
            boolean r8 = r7.r
            if (r8 == 0) goto L81
            double r11 = r7.c(r1)
            r7 = r10[r6]
            double r8 = r7.l
            double r8 = r8 * r3
            double r8 = r8 + r11
            r13[r0] = r8
            double r11 = r7.d(r1)
            r10 = r10[r6]
            double r0 = r10.m
            double r3 = r3 * r0
            double r3 = r3 + r11
            r13[r5] = r3
            return
        L81:
            r7.g(r11)
            r11 = r10[r6]
            double r11 = r11.e()
            r1 = r10[r6]
            double r1 = r1.a()
            double r1 = r1 * r3
            double r1 = r1 + r11
            r13[r0] = r1
            r11 = r10[r6]
            double r11 = r11.f()
            r10 = r10[r6]
            double r0 = r10.b()
            double r0 = r0 * r3
            double r0 = r0 + r11
            r13[r5] = r0
            return
        La5:
            r1 = r0
        La6:
            int r2 = r10.length
            if (r1 >= r2) goto Ldb
            r2 = r10[r1]
            double r3 = r2.d
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 > 0) goto Ld8
            boolean r3 = r2.r
            if (r3 == 0) goto Lc4
            double r2 = r2.c(r11)
            r13[r0] = r2
            r10 = r10[r1]
            double r10 = r10.d(r11)
            r13[r5] = r10
            return
        Lc4:
            r2.g(r11)
            r11 = r10[r1]
            double r11 = r11.e()
            r13[r0] = r11
            r10 = r10[r1]
            double r10 = r10.f()
            r13[r5] = r10
            return
        Ld8:
            int r1 = r1 + 1
            goto La6
        Ldb:
            return
    }

    @Override // defpackage.ak7
    public final void b0(double r11, float[] r13) {
            r10 = this;
            vt[] r10 = r10.m
            r0 = 0
            r1 = r10[r0]
            double r2 = r1.c
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            r5 = 1
            if (r4 >= 0) goto L52
            double r11 = r11 - r2
            boolean r4 = r1.r
            if (r4 == 0) goto L2c
            double r6 = r1.c(r2)
            r1 = r10[r0]
            double r8 = r1.l
            double r8 = r8 * r11
            double r8 = r8 + r6
            float r4 = (float) r8
            r13[r0] = r4
            double r1 = r1.d(r2)
            r10 = r10[r0]
            double r3 = r10.m
            double r11 = r11 * r3
            double r11 = r11 + r1
            float r10 = (float) r11
            r13[r5] = r10
            return
        L2c:
            r1.g(r2)
            r1 = r10[r0]
            double r1 = r1.e()
            r3 = r10[r0]
            double r3 = r3.a()
            double r3 = r3 * r11
            double r3 = r3 + r1
            float r1 = (float) r3
            r13[r0] = r1
            r1 = r10[r0]
            double r1 = r1.f()
            r10 = r10[r0]
            double r3 = r10.b()
            double r3 = r3 * r11
            double r3 = r3 + r1
            float r10 = (float) r3
            r13[r5] = r10
            return
        L52:
            int r1 = r10.length
            int r1 = r1 - r5
            r1 = r10[r1]
            double r1 = r1.d
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 <= 0) goto L9d
            int r1 = r10.length
            int r1 = r1 - r5
            r1 = r10[r1]
            double r1 = r1.d
            double r3 = r11 - r1
            int r6 = r10.length
            int r6 = r6 - r5
            r7 = r10[r6]
            boolean r8 = r7.r
            if (r8 == 0) goto L87
            double r11 = r7.c(r1)
            r7 = r10[r6]
            double r8 = r7.l
            double r8 = r8 * r3
            double r8 = r8 + r11
            float r11 = (float) r8
            r13[r0] = r11
            double r11 = r7.d(r1)
            r10 = r10[r6]
            double r0 = r10.m
            double r3 = r3 * r0
            double r3 = r3 + r11
            float r10 = (float) r3
            r13[r5] = r10
            return
        L87:
            r7.g(r11)
            r11 = r10[r6]
            double r11 = r11.e()
            float r11 = (float) r11
            r13[r0] = r11
            r10 = r10[r6]
            double r10 = r10.f()
            float r10 = (float) r10
            r13[r5] = r10
            return
        L9d:
            r1 = r0
        L9e:
            int r2 = r10.length
            if (r1 >= r2) goto Ld7
            r2 = r10[r1]
            double r3 = r2.d
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 > 0) goto Ld4
            boolean r3 = r2.r
            if (r3 == 0) goto Lbe
            double r2 = r2.c(r11)
            float r2 = (float) r2
            r13[r0] = r2
            r10 = r10[r1]
            double r10 = r10.d(r11)
            float r10 = (float) r10
            r13[r5] = r10
            return
        Lbe:
            r2.g(r11)
            r11 = r10[r1]
            double r11 = r11.e()
            float r11 = (float) r11
            r13[r0] = r11
            r10 = r10[r1]
            double r10 = r10.f()
            float r10 = (float) r10
            r13[r5] = r10
            return
        Ld4:
            int r1 = r1 + 1
            goto L9e
        Ld7:
            return
    }

    @Override // defpackage.ak7
    public final void d0(double r8, double[] r10) {
            r7 = this;
            vt[] r7 = r7.m
            r0 = 0
            r1 = r7[r0]
            double r1 = r1.c
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r4 = 1
            if (r3 >= 0) goto Le
            r8 = r1
            goto L1e
        Le:
            int r1 = r7.length
            int r1 = r1 - r4
            r1 = r7[r1]
            double r1 = r1.d
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1e
            int r8 = r7.length
            int r8 = r8 - r4
            r8 = r7[r8]
            double r8 = r8.d
        L1e:
            r1 = r0
        L1f:
            int r2 = r7.length
            if (r1 >= r2) goto L4e
            r2 = r7[r1]
            double r5 = r2.d
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 > 0) goto L4b
            boolean r3 = r2.r
            if (r3 == 0) goto L37
            double r7 = r2.l
            r10[r0] = r7
            double r7 = r2.m
            r10[r4] = r7
            return
        L37:
            r2.g(r8)
            r8 = r7[r1]
            double r8 = r8.a()
            r10[r0] = r8
            r7 = r7[r1]
            double r7 = r7.b()
            r10[r4] = r7
            return
        L4b:
            int r1 = r1 + 1
            goto L1f
        L4e:
            return
    }

    @Override // defpackage.ak7
    public final double[] g0() {
            r0 = this;
            double[] r0 = r0.l
            return r0
    }
}

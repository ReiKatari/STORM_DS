package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m74  reason: default package */
/* loaded from: classes.dex */
public final class m74 {
    public defpackage.rh3[] A;
    public int B;
    public int C;
    public android.view.View D;
    public int E;
    public float F;
    public android.view.animation.Interpolator G;
    public boolean H;
    public final android.graphics.Rect a;
    public final android.view.View b;
    public final int c;
    public boolean d;
    public int e;
    public final defpackage.y74 f;
    public final defpackage.y74 g;
    public final defpackage.k74 h;
    public final defpackage.k74 i;
    public defpackage.ak7[] j;
    public defpackage.wt k;
    public float l;
    public float m;
    public float n;
    public int[] o;
    public double[] p;
    public double[] q;
    public java.lang.String[] r;
    public int[] s;
    public final float[] t;
    public final java.util.ArrayList u;
    public final float[] v;
    public final java.util.ArrayList w;
    public java.util.HashMap x;
    public java.util.HashMap y;
    public java.util.HashMap z;

    public m74(android.view.View r5) {
            r4 = this;
            r4.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r4.a = r0
            r0 = 0
            r4.d = r0
            r1 = -1
            r4.e = r1
            y74 r2 = new y74
            r2.<init>()
            r4.f = r2
            y74 r2 = new y74
            r2.<init>()
            r4.g = r2
            k74 r2 = new k74
            r2.<init>()
            r4.h = r2
            k74 r2 = new k74
            r2.<init>()
            r4.i = r2
            r2 = 2143289344(0x7fc00000, float:NaN)
            r4.l = r2
            r3 = 0
            r4.m = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r4.n = r3
            r3 = 4
            float[] r3 = new float[r3]
            r4.t = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4.u = r3
            r3 = 1
            float[] r3 = new float[r3]
            r4.v = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4.w = r3
            r4.B = r1
            r4.C = r1
            r3 = 0
            r4.D = r3
            r4.E = r1
            r4.F = r2
            r4.G = r3
            r4.H = r0
            r4.b = r5
            int r0 = r5.getId()
            r4.c = r0
            r5.getLayoutParams()
            return
    }

    public static void f(android.graphics.Rect r2, android.graphics.Rect r3, int r4, int r5, int r6) {
            r0 = 1
            r1 = 2
            if (r4 == r0) goto L97
            if (r4 == r1) goto L69
            r0 = 3
            if (r4 == r0) goto L3b
            r6 = 4
            if (r4 == r6) goto Ld
            return
        Ld:
            int r4 = r2.left
            int r6 = r2.right
            int r4 = r4 + r6
            int r6 = r2.bottom
            int r0 = r2.top
            int r6 = r6 + r0
            int r0 = r2.width()
            int r0 = r0 + r6
            int r0 = r0 / r1
            int r5 = r5 - r0
            r3.left = r5
            int r5 = r2.height()
            int r4 = r4 - r5
            int r4 = r4 / r1
            r3.top = r4
            int r4 = r3.left
            int r5 = r2.width()
            int r5 = r5 + r4
            r3.right = r5
            int r4 = r3.top
            int r2 = r2.height()
            int r2 = r2 + r4
            r3.bottom = r2
            return
        L3b:
            int r4 = r2.left
            int r5 = r2.right
            int r4 = r4 + r5
            int r5 = r2.height()
            int r5 = r5 / r1
            int r0 = r2.top
            int r5 = r5 + r0
            int r0 = r4 / 2
            int r5 = r5 - r0
            r3.left = r5
            int r5 = r2.height()
            int r5 = r5 + r4
            int r5 = r5 / r1
            int r6 = r6 - r5
            r3.top = r6
            int r4 = r3.left
            int r5 = r2.width()
            int r5 = r5 + r4
            r3.right = r5
            int r4 = r3.top
            int r2 = r2.height()
            int r2 = r2 + r4
            r3.bottom = r2
            return
        L69:
            int r4 = r2.left
            int r6 = r2.right
            int r4 = r4 + r6
            int r6 = r2.top
            int r0 = r2.bottom
            int r6 = r6 + r0
            int r0 = r2.width()
            int r0 = r0 + r6
            int r0 = r0 / r1
            int r5 = r5 - r0
            r3.left = r5
            int r5 = r2.height()
            int r4 = r4 - r5
            int r4 = r4 / r1
            r3.top = r4
            int r4 = r3.left
            int r5 = r2.width()
            int r5 = r5 + r4
            r3.right = r5
            int r4 = r3.top
            int r2 = r2.height()
            int r2 = r2 + r4
            r3.bottom = r2
            return
        L97:
            int r4 = r2.left
            int r5 = r2.right
            int r4 = r4 + r5
            int r5 = r2.top
            int r0 = r2.bottom
            int r5 = r5 + r0
            int r0 = r2.width()
            int r5 = r5 - r0
            int r5 = r5 / r1
            r3.left = r5
            int r5 = r2.height()
            int r5 = r5 + r4
            int r5 = r5 / r1
            int r6 = r6 - r5
            r3.top = r6
            int r4 = r3.left
            int r5 = r2.width()
            int r5 = r5 + r4
            r3.right = r5
            int r4 = r3.top
            int r2 = r2.height()
            int r2 = r2 + r4
            r3.bottom = r2
            return
    }

    public final float a(float r12, float[] r13) {
            r11 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            if (r13 == 0) goto L9
            r13[r2] = r1
            goto L28
        L9:
            float r3 = r11.n
            double r4 = (double) r3
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L28
            float r4 = r11.m
            int r5 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r5 >= 0) goto L19
            r12 = r0
        L19:
            int r5 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r5 <= 0) goto L28
            double r8 = (double) r12
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L28
            float r12 = r12 - r4
            float r12 = r12 * r3
            float r12 = java.lang.Math.min(r12, r1)
        L28:
            y74 r3 = r11.f
            gr1 r3 = r3.A
            java.util.ArrayList r11 = r11.u
            int r4 = r11.size()
            r5 = 2143289344(0x7fc00000, float:NaN)
            r6 = r2
        L35:
            if (r6 >= r4) goto L55
            java.lang.Object r7 = r11.get(r6)
            int r6 = r6 + 1
            y74 r7 = (defpackage.y74) r7
            gr1 r8 = r7.A
            if (r8 == 0) goto L35
            float r9 = r7.L
            int r10 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4c
            r3 = r8
            r0 = r9
            goto L35
        L4c:
            boolean r8 = java.lang.Float.isNaN(r5)
            if (r8 == 0) goto L35
            float r5 = r7.L
            goto L35
        L55:
            if (r3 == 0) goto L74
            boolean r11 = java.lang.Float.isNaN(r5)
            if (r11 == 0) goto L5e
            goto L5f
        L5e:
            r1 = r5
        L5f:
            float r12 = r12 - r0
            float r1 = r1 - r0
            float r12 = r12 / r1
            double r11 = (double) r12
            double r4 = r3.a(r11)
            float r4 = (float) r4
            float r4 = r4 * r1
            float r4 = r4 + r0
            if (r13 == 0) goto L73
            double r11 = r3.b(r11)
            float r11 = (float) r11
            r13[r2] = r11
        L73:
            return r4
        L74:
            return r12
    }

    public final void b(double r24, float[] r26, float[] r27) {
            r23 = this;
            r0 = r23
            r1 = r24
            r3 = r27
            r4 = 4
            double[] r5 = new double[r4]
            double[] r6 = new double[r4]
            ak7[] r7 = r0.j
            r8 = 0
            r7 = r7[r8]
            r7.a0(r1, r5)
            ak7[] r7 = r0.j
            r7 = r7[r8]
            r7.d0(r1, r6)
            r7 = 0
            java.util.Arrays.fill(r3, r7)
            int[] r9 = r0.o
            y74 r0 = r0.f
            float r10 = r0.X
            float r11 = r0.Y
            float r12 = r0.Z
            float r13 = r0.d0
            r15 = r7
            r16 = r15
            r17 = r16
            r18 = r17
            r14 = r8
            r19 = r14
        L34:
            int r8 = r9.length
            if (r14 >= r8) goto L69
            r8 = r5
            r4 = r8[r14]
            float r4 = (float) r4
            r5 = r4
            r3 = r6[r14]
            float r3 = (float) r3
            r4 = r9[r14]
            r21 = r3
            r3 = 1
            if (r4 == r3) goto L5e
            r3 = 2
            if (r4 == r3) goto L59
            r3 = 3
            if (r4 == r3) goto L54
            r3 = 4
            if (r4 == r3) goto L50
            goto L62
        L50:
            r13 = r5
            r18 = r21
            goto L62
        L54:
            r3 = 4
            r12 = r5
            r16 = r21
            goto L62
        L59:
            r3 = 4
            r11 = r5
            r7 = r21
            goto L62
        L5e:
            r3 = 4
            r10 = r5
            r15 = r21
        L62:
            int r14 = r14 + 1
            r4 = r3
            r5 = r8
            r3 = r27
            goto L34
        L69:
            r3 = 1073741824(0x40000000, float:2.0)
            float r16 = r16 / r3
            float r16 = r16 + r15
            float r18 = r18 / r3
            float r18 = r18 + r7
            m74 r0 = r0.i0
            if (r0 == 0) goto Ld3
            r4 = 2
            float[] r5 = new float[r4]
            float[] r4 = new float[r4]
            r0.b(r1, r5, r4)
            r0 = r5[r19]
            r20 = 1
            r1 = r5[r20]
            r2 = r4[r19]
            r4 = r4[r20]
            double r5 = (double) r0
            double r8 = (double) r10
            double r10 = (double) r11
            double r21 = java.lang.Math.sin(r10)
            double r21 = r21 * r8
            double r21 = r21 + r5
            float r0 = r12 / r3
            double r5 = (double) r0
            double r5 = r21 - r5
            float r0 = (float) r5
            double r5 = (double) r1
            double r21 = java.lang.Math.cos(r10)
            double r21 = r21 * r8
            double r5 = r5 - r21
            float r1 = r13 / r3
            double r8 = (double) r1
            double r5 = r5 - r8
            float r1 = (float) r5
            double r5 = (double) r2
            double r8 = (double) r15
            double r14 = java.lang.Math.sin(r10)
            double r14 = r14 * r8
            double r14 = r14 + r5
            double r5 = java.lang.Math.cos(r10)
            r23 = r3
            r24 = r4
            double r3 = (double) r7
            double r5 = r5 * r3
            double r5 = r5 + r14
            float r2 = (float) r5
            r5 = r24
            double r5 = (double) r5
            double r14 = java.lang.Math.cos(r10)
            double r14 = r14 * r8
            double r5 = r5 - r14
            double r7 = java.lang.Math.sin(r10)
            double r7 = r7 * r3
            double r7 = r7 + r5
            float r3 = (float) r7
            r10 = r0
            r11 = r1
            r16 = r2
            r18 = r3
            goto Ld5
        Ld3:
            r23 = r3
        Ld5:
            float r12 = r12 / r23
            float r12 = r12 + r10
            float r12 = r12 + r17
            r26[r19] = r12
            float r13 = r13 / r23
            float r13 = r13 + r11
            float r13 = r13 + r17
            r20 = 1
            r26[r20] = r13
            r27[r19] = r16
            r27[r20] = r18
            return
    }

    public final float c() {
            r22 = this;
            r0 = r22
            r1 = 2
            float[] r7 = new float[r1]
            r2 = 0
            r10 = r2
            r12 = r10
            r14 = 0
            r15 = 0
        Lb:
            r2 = 100
            if (r14 >= r2) goto L9d
            float r2 = (float) r14
            r3 = 1009090229(0x3c257eb5, float:0.01010101)
            float r2 = r2 * r3
            double r3 = (double) r2
            y74 r5 = r0.f
            gr1 r5 = r5.A
            java.util.ArrayList r6 = r0.u
            int r8 = r6.size()
            r16 = 2143289344(0x7fc00000, float:NaN)
            r1 = 0
            r17 = 0
        L24:
            if (r1 >= r8) goto L52
            java.lang.Object r18 = r6.get(r1)
            int r1 = r1 + 1
            r19 = 0
            r9 = r18
            y74 r9 = (defpackage.y74) r9
            r18 = r1
            gr1 r1 = r9.A
            if (r1 == 0) goto L4f
            r20 = r1
            float r1 = r9.L
            int r21 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r21 >= 0) goto L45
            r17 = r1
            r5 = r20
            goto L4f
        L45:
            boolean r1 = java.lang.Float.isNaN(r16)
            if (r1 == 0) goto L4f
            float r1 = r9.L
            r16 = r1
        L4f:
            r1 = r18
            goto L24
        L52:
            r19 = 0
            if (r5 == 0) goto L6f
            boolean r1 = java.lang.Float.isNaN(r16)
            if (r1 == 0) goto L5e
            r16 = 1065353216(0x3f800000, float:1.0)
        L5e:
            float r2 = r2 - r17
            float r16 = r16 - r17
            float r2 = r2 / r16
            double r1 = (double) r2
            double r1 = r5.a(r1)
            float r1 = (float) r1
            float r1 = r1 * r16
            float r1 = r1 + r17
            double r3 = (double) r1
        L6f:
            ak7[] r1 = r0.j
            r1 = r1[r19]
            double[] r2 = r0.p
            r1.a0(r3, r2)
            int[] r5 = r0.o
            double[] r6 = r0.p
            r8 = 0
            y74 r2 = r0.f
            r2.c(r3, r5, r6, r7, r8)
            r1 = 1
            if (r14 <= 0) goto L93
            r2 = r7[r1]
            double r2 = (double) r2
            double r12 = r12 - r2
            r2 = r7[r19]
            double r2 = (double) r2
            double r10 = r10 - r2
            double r2 = java.lang.Math.hypot(r12, r10)
            float r2 = (float) r2
            float r15 = r15 + r2
        L93:
            r2 = r7[r19]
            double r10 = (double) r2
            r1 = r7[r1]
            double r12 = (double) r1
            int r14 = r14 + 1
            goto Lb
        L9d:
            return r15
    }

    public final boolean d(float r38, long r39, defpackage.ng3 r41, android.view.View r42) {
            r37 = this;
            r0 = r37
            r6 = r42
            r1 = 0
            r2 = r38
            float r2 = r0.a(r2, r1)
            int r3 = r0.E
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = -1
            if (r3 == r9) goto L41
            float r3 = (float) r3
            float r3 = r8 / r3
            float r4 = r2 / r3
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            float r4 = r4 * r3
            float r2 = r2 % r3
            float r2 = r2 / r3
            float r5 = r0.F
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L2c
            float r5 = r0.F
            float r2 = r2 + r5
            float r2 = r2 % r8
        L2c:
            android.view.animation.Interpolator r5 = r0.G
            if (r5 == 0) goto L35
            float r2 = r5.getInterpolation(r2)
            goto L3f
        L35:
            double r10 = (double) r2
            r12 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 <= 0) goto L3e
            r2 = r8
            goto L3f
        L3e:
            r2 = 0
        L3f:
            float r2 = r2 * r3
            float r2 = r2 + r4
        L41:
            java.util.HashMap r3 = r0.y
            if (r3 == 0) goto L5d
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L4d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r3.next()
            qp7 r4 = (defpackage.qp7) r4
            r4.c(r6, r2)
            goto L4d
        L5d:
            java.util.HashMap r3 = r0.x
            r10 = 0
            if (r3 == 0) goto L8e
            java.util.Collection r3 = r3.values()
            java.util.Iterator r11 = r3.iterator()
            r12 = r1
            r13 = r10
        L6c:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r11.next()
            wp7 r1 = (defpackage.wp7) r1
            boolean r3 = r1 instanceof defpackage.up7
            if (r3 == 0) goto L80
            r12 = r1
            up7 r12 = (defpackage.up7) r12
            goto L6c
        L80:
            r3 = r39
            r5 = r41
            boolean r1 = r1.d(r2, r3, r5, r6)
            r13 = r13 | r1
            r6 = r42
            goto L6c
        L8c:
            r1 = r12
            goto L8f
        L8e:
            r13 = r10
        L8f:
            ak7[] r3 = r0.j
            y74 r11 = r0.f
            if (r3 == 0) goto L3a4
            r3 = r3[r10]
            double r14 = (double) r2
            r38 = 1056964608(0x3f000000, float:0.5)
            double[] r4 = r0.p
            r3.a0(r14, r4)
            ak7[] r3 = r0.j
            r3 = r3[r10]
            double[] r4 = r0.q
            r3.d0(r14, r4)
            wt r3 = r0.k
            if (r3 == 0) goto Lbe
            double[] r4 = r0.p
            r16 = 0
            int r7 = r4.length
            if (r7 <= 0) goto Lc0
            r3.a0(r14, r4)
            wt r3 = r0.k
            double[] r4 = r0.q
            r3.d0(r14, r4)
            goto Lc0
        Lbe:
            r16 = 0
        Lc0:
            boolean r3 = r0.H
            if (r3 != 0) goto L27a
            int[] r3 = r0.o
            double[] r7 = r0.p
            r17 = 1073741824(0x40000000, float:2.0)
            double[] r4 = r0.q
            r18 = r8
            boolean r8 = r0.d
            float r9 = r11.X
            r19 = r10
            float r10 = r11.Y
            float r5 = r11.Z
            r20 = 1
            float r12 = r11.d0
            r21 = r1
            int r1 = r3.length
            if (r1 == 0) goto Lfd
            double[] r1 = r11.l0
            int r1 = r1.length
            r22 = r5
            int r5 = r3.length
            int r5 = r5 + (-1)
            r5 = r3[r5]
            if (r1 > r5) goto Lff
            int r1 = r3.length
            int r1 = r1 + (-1)
            r1 = r3[r1]
            int r1 = r1 + 1
            double[] r5 = new double[r1]
            r11.l0 = r5
            double[] r1 = new double[r1]
            r11.m0 = r1
            goto Lff
        Lfd:
            r22 = r5
        Lff:
            double[] r1 = r11.l0
            r5 = r7
            r23 = r8
            r7 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.util.Arrays.fill(r1, r7)
            r1 = r19
        L10b:
            int r7 = r3.length
            if (r1 >= r7) goto L11f
            double[] r7 = r11.l0
            r8 = r3[r1]
            r24 = r5[r1]
            r7[r8] = r24
            double[] r7 = r11.m0
            r24 = r4[r1]
            r7[r8] = r24
            int r1 = r1 + 1
            goto L10b
        L11f:
            r1 = 2143289344(0x7fc00000, float:NaN)
            r7 = r16
            r8 = r7
            r24 = r8
            r3 = r19
            r25 = r22
            r22 = r24
        L12c:
            double[] r5 = r11.l0
            r26 = r12
            int r12 = r5.length
            r27 = r5
            if (r3 >= r12) goto L189
            r28 = r27[r3]
            boolean r12 = java.lang.Double.isNaN(r28)
            if (r12 == 0) goto L140
            r27 = r13
            goto L16e
        L140:
            double[] r12 = r11.l0
            r27 = r12[r3]
            boolean r12 = java.lang.Double.isNaN(r27)
            r27 = 0
            if (r12 == 0) goto L14f
        L14c:
            r5 = r27
            goto L156
        L14f:
            double[] r12 = r11.l0
            r29 = r12[r3]
            double r27 = r29 + r27
            goto L14c
        L156:
            float r5 = (float) r5
            double[] r6 = r11.m0
            r27 = r13
            r12 = r6[r3]
            float r6 = (float) r12
            r12 = r20
            if (r3 == r12) goto L17f
            r12 = 2
            if (r3 == r12) goto L17c
            r12 = 3
            if (r3 == r12) goto L177
            r12 = 4
            if (r3 == r12) goto L173
            r6 = 5
            if (r3 == r6) goto L171
        L16e:
            r12 = r26
            goto L182
        L171:
            r1 = r5
            goto L16e
        L173:
            r12 = r5
            r24 = r6
            goto L182
        L177:
            r25 = r5
            r22 = r6
            goto L16e
        L17c:
            r10 = r5
            r8 = r6
            goto L16e
        L17f:
            r9 = r5
            r7 = r6
            goto L16e
        L182:
            int r3 = r3 + 1
            r13 = r27
            r20 = 1
            goto L12c
        L189:
            r27 = r13
            m74 r3 = r11.i0
            if (r3 == 0) goto L225
            r12 = 2
            float[] r5 = new float[r12]
            float[] r6 = new float[r12]
            r3.b(r14, r5, r6)
            r3 = r5[r19]
            r20 = 1
            r5 = r5[r20]
            r13 = r6[r19]
            r6 = r6[r20]
            r22 = r13
            double r12 = (double) r3
            r29 = r12
            double r12 = (double) r9
            double r9 = (double) r10
            double r31 = java.lang.Math.sin(r9)
            double r31 = r31 * r12
            double r31 = r31 + r29
            float r3 = r25 / r17
            r29 = r9
            double r9 = (double) r3
            double r9 = r31 - r9
            float r9 = (float) r9
            r3 = r9
            double r9 = (double) r5
            double r31 = java.lang.Math.cos(r29)
            double r31 = r31 * r12
            double r9 = r9 - r31
            float r5 = r26 / r17
            r31 = r9
            double r9 = (double) r5
            double r9 = r31 - r9
            float r10 = (float) r9
            r5 = r22
            r22 = r10
            double r9 = (double) r5
            r31 = r9
            double r9 = (double) r7
            double r33 = java.lang.Math.sin(r29)
            double r33 = r33 * r9
            double r33 = r33 + r31
            double r31 = java.lang.Math.cos(r29)
            double r31 = r31 * r12
            double r7 = (double) r8
            double r31 = r31 * r7
            r35 = r7
            double r7 = r31 + r33
            float r5 = (float) r7
            double r6 = (double) r6
            double r31 = java.lang.Math.cos(r29)
            double r31 = r31 * r9
            double r6 = r6 - r31
            double r8 = java.lang.Math.sin(r29)
            double r8 = r8 * r12
            double r8 = r8 * r35
            double r8 = r8 + r6
            float r6 = (float) r8
            int r7 = r4.length
            r12 = 2
            if (r7 < r12) goto L206
            double r7 = (double) r5
            r4[r19] = r7
            double r7 = (double) r6
            r20 = 1
            r4[r20] = r7
        L206:
            boolean r4 = java.lang.Float.isNaN(r1)
            if (r4 != 0) goto L21f
            double r7 = (double) r1
            double r9 = (double) r6
            double r4 = (double) r5
            double r4 = java.lang.Math.atan2(r9, r4)
            double r4 = java.lang.Math.toDegrees(r4)
            double r4 = r4 + r7
            float r1 = (float) r4
            r6 = r42
            r6.setRotation(r1)
            goto L221
        L21f:
            r6 = r42
        L221:
            r9 = r3
            r10 = r22
            goto L246
        L225:
            r6 = r42
            boolean r3 = java.lang.Float.isNaN(r1)
            if (r3 != 0) goto L246
            float r22 = r22 / r17
            float r3 = r22 + r7
            float r24 = r24 / r17
            float r4 = r24 + r8
            double r4 = (double) r4
            double r7 = (double) r3
            double r3 = java.lang.Math.atan2(r4, r7)
            double r3 = java.lang.Math.toDegrees(r3)
            float r3 = (float) r3
            float r1 = r1 + r3
            float r1 = r1 + r16
            r6.setRotation(r1)
        L246:
            float r9 = r9 + r38
            int r1 = (int) r9
            float r10 = r10 + r38
            int r3 = (int) r10
            float r9 = r9 + r25
            int r4 = (int) r9
            float r10 = r10 + r26
            int r5 = (int) r10
            int r7 = r4 - r1
            int r8 = r5 - r3
            int r9 = r6.getMeasuredWidth()
            if (r7 != r9) goto L265
            int r9 = r6.getMeasuredHeight()
            if (r8 == r9) goto L263
            goto L265
        L263:
            if (r23 == 0) goto L272
        L265:
            r9 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            r6.measure(r7, r8)
        L272:
            r6.layout(r1, r3, r4, r5)
            r1 = r19
            r0.d = r1
            goto L284
        L27a:
            r6 = r42
            r21 = r1
            r18 = r8
            r27 = r13
            r17 = 1073741824(0x40000000, float:2.0)
        L284:
            int r1 = r0.C
            r3 = -1
            if (r1 == r3) goto L2e5
            android.view.View r1 = r0.D
            if (r1 != 0) goto L29b
            android.view.ViewParent r1 = r6.getParent()
            android.view.View r1 = (android.view.View) r1
            int r3 = r0.C
            android.view.View r1 = r1.findViewById(r3)
            r0.D = r1
        L29b:
            android.view.View r1 = r0.D
            if (r1 == 0) goto L2e5
            int r1 = r1.getTop()
            android.view.View r3 = r0.D
            int r3 = r3.getBottom()
            int r3 = r3 + r1
            float r1 = (float) r3
            float r1 = r1 / r17
            android.view.View r3 = r0.D
            int r3 = r3.getLeft()
            android.view.View r4 = r0.D
            int r4 = r4.getRight()
            int r4 = r4 + r3
            float r3 = (float) r4
            float r3 = r3 / r17
            int r4 = r6.getRight()
            int r5 = r6.getLeft()
            int r4 = r4 - r5
            if (r4 <= 0) goto L2e5
            int r4 = r6.getBottom()
            int r5 = r6.getTop()
            int r4 = r4 - r5
            if (r4 <= 0) goto L2e5
            int r4 = r6.getLeft()
            float r4 = (float) r4
            float r3 = r3 - r4
            int r4 = r6.getTop()
            float r4 = (float) r4
            float r1 = r1 - r4
            r6.setPivotX(r3)
            r6.setPivotY(r1)
        L2e5:
            java.util.HashMap r1 = r0.y
            if (r1 == 0) goto L321
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L2f1:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L321
            java.lang.Object r3 = r1.next()
            qp7 r3 = (defpackage.qp7) r3
            boolean r4 = r3 instanceof defpackage.op7
            if (r4 == 0) goto L2f1
            double[] r4 = r0.q
            int r5 = r4.length
            r12 = 1
            if (r5 <= r12) goto L2f1
            op7 r3 = (defpackage.op7) r3
            r19 = 0
            r7 = r4[r19]
            r9 = r4[r12]
            float r3 = r3.a(r2)
            double r4 = java.lang.Math.atan2(r9, r7)
            double r4 = java.lang.Math.toDegrees(r4)
            float r4 = (float) r4
            float r3 = r3 + r4
            r6.setRotation(r3)
            goto L2f1
        L321:
            if (r21 == 0) goto L349
            double[] r1 = r0.q
            r19 = 0
            r7 = r1[r19]
            r20 = 1
            r9 = r1[r20]
            r3 = r39
            r5 = r41
            r1 = r21
            float r3 = r1.b(r2, r3, r5, r6)
            double r4 = java.lang.Math.atan2(r9, r7)
            double r4 = java.lang.Math.toDegrees(r4)
            float r4 = (float) r4
            float r3 = r3 + r4
            r6.setRotation(r3)
            boolean r1 = r1.h
            r13 = r27 | r1
            goto L34b
        L349:
            r13 = r27
        L34b:
            r12 = 1
        L34c:
            ak7[] r1 = r0.j
            int r3 = r1.length
            if (r12 >= r3) goto L36c
            r1 = r1[r12]
            float[] r3 = r0.t
            r1.b0(r14, r3)
            java.util.LinkedHashMap r1 = r11.j0
            java.lang.String[] r4 = r0.r
            int r5 = r12 + (-1)
            r4 = r4[r5]
            java.lang.Object r1 = r1.get(r4)
            j11 r1 = (defpackage.j11) r1
            defpackage.l.M(r1, r6, r3)
            int r12 = r12 + 1
            goto L34c
        L36c:
            k74 r1 = r0.h
            int r3 = r1.B
            if (r3 != 0) goto L392
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 > 0) goto L37c
            int r1 = r1.L
            r6.setVisibility(r1)
            goto L392
        L37c:
            int r3 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            k74 r4 = r0.i
            if (r3 < 0) goto L388
            int r1 = r4.L
            r6.setVisibility(r1)
            goto L392
        L388:
            int r3 = r4.L
            int r1 = r1.L
            if (r3 == r1) goto L392
            r1 = 0
            r6.setVisibility(r1)
        L392:
            rh3[] r1 = r0.A
            if (r1 == 0) goto L3fb
            r1 = 0
        L397:
            rh3[] r3 = r0.A
            int r4 = r3.length
            if (r1 >= r4) goto L3fb
            r3 = r3[r1]
            r3.g(r6, r2)
            int r1 = r1 + 1
            goto L397
        L3a4:
            r6 = r42
            r27 = r13
            r38 = 1056964608(0x3f000000, float:0.5)
            float r1 = r11.X
            y74 r3 = r0.g
            float r4 = r3.X
            float r1 = defpackage.i61.a(r4, r1, r2, r1)
            float r4 = r11.Y
            float r5 = r3.Y
            float r4 = defpackage.i61.a(r5, r4, r2, r4)
            float r5 = r11.Z
            float r7 = r3.Z
            float r8 = defpackage.i61.a(r7, r5, r2, r5)
            float r9 = r11.d0
            float r3 = r3.d0
            float r10 = defpackage.i61.a(r3, r9, r2, r9)
            float r1 = r1 + r38
            int r11 = (int) r1
            float r4 = r4 + r38
            int r12 = (int) r4
            float r1 = r1 + r8
            int r1 = (int) r1
            float r4 = r4 + r10
            int r4 = (int) r4
            int r8 = r1 - r11
            int r10 = r4 - r12
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 != 0) goto L3e6
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 != 0) goto L3e6
            boolean r3 = r0.d
            if (r3 == 0) goto L3f6
        L3e6:
            r9 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r9)
            r6.measure(r3, r5)
            r3 = 0
            r0.d = r3
        L3f6:
            r6.layout(r11, r12, r1, r4)
            r13 = r27
        L3fb:
            java.util.HashMap r1 = r0.z
            if (r1 == 0) goto L43d
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L407:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L43d
            java.lang.Object r3 = r1.next()
            hp7 r3 = (defpackage.hp7) r3
            boolean r4 = r3 instanceof defpackage.fp7
            if (r4 == 0) goto L435
            fp7 r3 = (defpackage.fp7) r3
            double[] r4 = r0.q
            r19 = 0
            r7 = r4[r19]
            r20 = 1
            r9 = r4[r20]
            float r3 = r3.a(r2)
            double r4 = java.lang.Math.atan2(r9, r7)
            double r4 = java.lang.Math.toDegrees(r4)
            float r4 = (float) r4
            float r3 = r3 + r4
            r6.setRotation(r3)
            goto L407
        L435:
            r19 = 0
            r20 = 1
            r3.d(r6, r2)
            goto L407
        L43d:
            return r13
    }

    public final void e(defpackage.y74 r4) {
            r3 = this;
            android.view.View r0 = r3.b
            float r0 = r0.getX()
            int r0 = (int) r0
            float r0 = (float) r0
            android.view.View r1 = r3.b
            float r1 = r1.getY()
            int r1 = (int) r1
            float r1 = (float) r1
            android.view.View r2 = r3.b
            int r2 = r2.getWidth()
            float r2 = (float) r2
            android.view.View r3 = r3.b
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r4.d(r0, r1, r2, r3)
            return
    }

    public final void g(long r51, int r53, int r54) {
            r50 = this;
            r0 = r50
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int r5 = r0.B
            y74 r6 = r0.f
            r7 = -1
            if (r5 == r7) goto L24
            r6.f0 = r5
        L24:
            k74 r5 = r0.h
            float r8 = r5.X
            k74 r9 = r0.i
            float r10 = r9.X
            boolean r8 = defpackage.k74.b(r8, r10)
            java.lang.String r10 = "alpha"
            if (r8 == 0) goto L37
            r2.add(r10)
        L37:
            float r8 = r5.Y
            float r11 = r9.Y
            boolean r8 = defpackage.k74.b(r8, r11)
            java.lang.String r11 = "elevation"
            if (r8 == 0) goto L46
            r2.add(r11)
        L46:
            int r8 = r5.L
            int r12 = r9.L
            if (r8 == r12) goto L57
            int r13 = r5.B
            if (r13 != 0) goto L57
            if (r8 == 0) goto L54
            if (r12 != 0) goto L57
        L54:
            r2.add(r10)
        L57:
            float r8 = r5.Z
            float r12 = r9.Z
            boolean r8 = defpackage.k74.b(r8, r12)
            java.lang.String r12 = "rotation"
            if (r8 == 0) goto L66
            r2.add(r12)
        L66:
            float r8 = r5.l0
            boolean r8 = java.lang.Float.isNaN(r8)
            java.lang.String r13 = "transitionPathRotate"
            if (r8 == 0) goto L78
            float r8 = r9.l0
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 != 0) goto L7b
        L78:
            r2.add(r13)
        L7b:
            float r8 = r5.m0
            boolean r8 = java.lang.Float.isNaN(r8)
            java.lang.String r14 = "progress"
            if (r8 == 0) goto L8d
            float r8 = r9.m0
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 != 0) goto L90
        L8d:
            r2.add(r14)
        L90:
            float r8 = r5.d0
            float r15 = r9.d0
            boolean r8 = defpackage.k74.b(r8, r15)
            java.lang.String r15 = "rotationX"
            if (r8 == 0) goto L9f
            r2.add(r15)
        L9f:
            float r8 = r5.A
            float r7 = r9.A
            boolean r7 = defpackage.k74.b(r8, r7)
            java.lang.String r8 = "rotationY"
            if (r7 == 0) goto Lae
            r2.add(r8)
        Lae:
            float r7 = r5.g0
            r16 = r15
            float r15 = r9.g0
            boolean r7 = defpackage.k74.b(r7, r15)
            if (r7 == 0) goto Lbf
            java.lang.String r7 = "transformPivotX"
            r2.add(r7)
        Lbf:
            float r7 = r5.h0
            float r15 = r9.h0
            boolean r7 = defpackage.k74.b(r7, r15)
            if (r7 == 0) goto Lce
            java.lang.String r7 = "transformPivotY"
            r2.add(r7)
        Lce:
            float r7 = r5.e0
            float r15 = r9.e0
            boolean r7 = defpackage.k74.b(r7, r15)
            java.lang.String r15 = "scaleX"
            if (r7 == 0) goto Ldd
            r2.add(r15)
        Ldd:
            float r7 = r5.f0
            r17 = r8
            float r8 = r9.f0
            boolean r7 = defpackage.k74.b(r7, r8)
            java.lang.String r8 = "scaleY"
            if (r7 == 0) goto Lee
            r2.add(r8)
        Lee:
            float r7 = r5.i0
            r18 = r14
            float r14 = r9.i0
            boolean r7 = defpackage.k74.b(r7, r14)
            java.lang.String r14 = "translationX"
            if (r7 == 0) goto Lff
            r2.add(r14)
        Lff:
            float r7 = r5.j0
            r19 = r14
            float r14 = r9.j0
            boolean r7 = defpackage.k74.b(r7, r14)
            java.lang.String r14 = "translationY"
            if (r7 == 0) goto L110
            r2.add(r14)
        L110:
            float r7 = r5.k0
            r20 = r5
            float r5 = r9.k0
            boolean r5 = defpackage.k74.b(r7, r5)
            if (r5 == 0) goto L121
            java.lang.String r5 = "translationZ"
            r2.add(r5)
        L121:
            y74 r7 = r0.g
            java.util.ArrayList r5 = r0.u
            r24 = r9
            java.util.ArrayList r9 = r0.w
            r26 = r14
            if (r9 == 0) goto L65f
            int r14 = r9.size()
            r29 = r15
            r15 = 0
            r30 = 0
        L136:
            if (r15 >= r14) goto L650
            java.lang.Object r31 = r9.get(r15)
            int r15 = r15 + 1
            r32 = r14
            r14 = r31
            jg3 r14 = (defpackage.jg3) r14
            r31 = r15
            boolean r15 = r14 instanceof defpackage.gh3
            if (r15 == 0) goto L608
            gh3 r14 = (defpackage.gh3) r14
            y74 r15 = new y74
            r15.<init>()
            r33 = r8
            r8 = 0
            r15.B = r8
            r8 = 2143289344(0x7fc00000, float:NaN)
            r15.e0 = r8
            r8 = -1
            r15.f0 = r8
            r15.g0 = r8
            r8 = 2143289344(0x7fc00000, float:NaN)
            r15.h0 = r8
            r8 = 0
            r15.i0 = r8
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            r15.j0 = r8
            r8 = 0
            r15.k0 = r8
            r34 = r12
            r8 = 18
            double[] r12 = new double[r8]
            r15.l0 = r12
            double[] r12 = new double[r8]
            r15.m0 = r12
            int r8 = r6.g0
            r12 = -1
            r35 = 1120403456(0x42c80000, float:100.0)
            if (r8 == r12) goto L24e
            int r8 = r14.a
            float r8 = (float) r8
            float r8 = r8 / r35
            r15.L = r8
            int r12 = r14.h
            r15.B = r12
            int r12 = r14.m
            r15.k0 = r12
            float r12 = r14.i
            boolean r12 = java.lang.Float.isNaN(r12)
            if (r12 == 0) goto L19e
            r12 = r8
        L19b:
            r36 = r11
            goto L1a1
        L19e:
            float r12 = r14.i
            goto L19b
        L1a1:
            float r11 = r14.j
            boolean r11 = java.lang.Float.isNaN(r11)
            if (r11 == 0) goto L1ad
            r11 = r8
        L1aa:
            r37 = r13
            goto L1b0
        L1ad:
            float r11 = r14.j
            goto L1aa
        L1b0:
            float r13 = r7.Z
            r35 = r13
            float r13 = r6.Z
            float r35 = r35 - r13
            r38 = r13
            float r13 = r7.d0
            r39 = r13
            float r13 = r6.d0
            float r39 = r39 - r13
            r40 = r13
            float r13 = r15.L
            r15.R = r13
            float r35 = r35 * r12
            float r13 = r35 + r38
            int r13 = (int) r13
            float r13 = (float) r13
            r15.Z = r13
            float r39 = r39 * r11
            float r13 = r39 + r40
            int r13 = (int) r13
            float r13 = (float) r13
            r15.d0 = r13
            int r13 = r14.m
            r38 = r10
            float r10 = r14.k
            r35 = r10
            r10 = 2
            if (r13 == r10) goto L20d
            boolean r10 = java.lang.Float.isNaN(r35)
            if (r10 == 0) goto L1eb
            r10 = r8
            goto L1ed
        L1eb:
            float r10 = r14.k
        L1ed:
            float r11 = r7.X
            float r12 = r6.X
            float r10 = defpackage.i61.a(r11, r12, r10, r12)
            r15.X = r10
            float r10 = r14.l
            boolean r10 = java.lang.Float.isNaN(r10)
            if (r10 == 0) goto L200
            goto L202
        L200:
            float r8 = r14.l
        L202:
            float r10 = r7.Y
            float r11 = r6.Y
            float r8 = defpackage.i61.a(r10, r11, r8, r11)
            r15.Y = r8
            goto L23a
        L20d:
            boolean r10 = java.lang.Float.isNaN(r35)
            if (r10 == 0) goto L21c
            float r10 = r7.X
            float r11 = r6.X
            float r10 = defpackage.i61.a(r10, r11, r8, r11)
            goto L223
        L21c:
            float r10 = r14.k
            float r11 = java.lang.Math.min(r11, r12)
            float r10 = r10 * r11
        L223:
            r15.X = r10
            float r10 = r14.l
            boolean r10 = java.lang.Float.isNaN(r10)
            if (r10 == 0) goto L236
            float r10 = r7.Y
            float r11 = r6.Y
            float r8 = defpackage.i61.a(r10, r11, r8, r11)
            goto L238
        L236:
            float r8 = r14.l
        L238:
            r15.Y = r8
        L23a:
            int r8 = r6.g0
            r15.g0 = r8
            java.lang.String r8 = r14.f
            gr1 r8 = defpackage.gr1.c(r8)
            r15.A = r8
            int r8 = r14.g
            r15.f0 = r8
        L24a:
            r23 = 2143289344(0x7fc00000, float:NaN)
            goto L5d8
        L24e:
            r38 = r10
            r36 = r11
            r37 = r13
            int r8 = r14.m
            int r10 = r14.a
            r13 = 1
            if (r8 == r13) goto L500
            r13 = 2
            if (r8 == r13) goto L440
            r13 = 3
            if (r8 == r13) goto L346
            float r8 = (float) r10
            float r8 = r8 / r35
            r15.L = r8
            int r10 = r14.h
            r15.B = r10
            float r10 = r14.i
            boolean r10 = java.lang.Float.isNaN(r10)
            if (r10 == 0) goto L274
            r10 = r8
            goto L276
        L274:
            float r10 = r14.i
        L276:
            float r13 = r14.j
            boolean r13 = java.lang.Float.isNaN(r13)
            if (r13 == 0) goto L280
            r13 = r8
            goto L282
        L280:
            float r13 = r14.j
        L282:
            float r11 = r7.Z
            r40 = 1073741824(0x40000000, float:2.0)
            float r12 = r6.Z
            float r35 = r11 - r12
            r41 = r8
            float r8 = r7.d0
            r42 = r8
            float r8 = r6.d0
            float r43 = r42 - r8
            r44 = r8
            float r8 = r15.L
            r15.R = r8
            float r8 = r6.X
            float r45 = r12 / r40
            float r45 = r45 + r8
            r46 = r8
            float r8 = r6.Y
            float r47 = r44 / r40
            float r47 = r47 + r8
            r48 = r8
            float r8 = r7.X
            float r11 = r11 / r40
            float r11 = r11 + r8
            float r8 = r7.Y
            float r42 = r42 / r40
            float r42 = r42 + r8
            float r11 = r11 - r45
            float r42 = r42 - r47
            float r8 = r11 * r41
            float r8 = r8 + r46
            float r35 = r35 * r10
            float r10 = r35 / r40
            float r8 = r8 - r10
            int r8 = (int) r8
            float r8 = (float) r8
            r15.X = r8
            float r8 = r42 * r41
            float r8 = r8 + r48
            float r43 = r43 * r13
            float r13 = r43 / r40
            float r8 = r8 - r13
            int r8 = (int) r8
            float r8 = (float) r8
            r15.Y = r8
            float r12 = r12 + r35
            int r8 = (int) r12
            float r8 = (float) r8
            r15.Z = r8
            float r8 = r44 + r43
            int r8 = (int) r8
            float r8 = (float) r8
            r15.d0 = r8
            float r8 = r14.k
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L2ec
            r8 = r41
        L2e9:
            r23 = 2143289344(0x7fc00000, float:NaN)
            goto L2ef
        L2ec:
            float r8 = r14.k
            goto L2e9
        L2ef:
            boolean r12 = java.lang.Float.isNaN(r23)
            if (r12 == 0) goto L2f9
            r12 = 0
        L2f6:
            r35 = r8
            goto L2fc
        L2f9:
            r12 = r23
            goto L2f6
        L2fc:
            float r8 = r14.l
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L307
            r8 = r41
            goto L309
        L307:
            float r8 = r14.l
        L309:
            boolean r40 = java.lang.Float.isNaN(r23)
            if (r40 == 0) goto L315
            r39 = 0
        L311:
            r40 = r8
            r8 = 0
            goto L318
        L315:
            r39 = 2143289344(0x7fc00000, float:NaN)
            goto L311
        L318:
            r15.k0 = r8
            float r8 = r6.X
            float r35 = r35 * r11
            float r35 = r35 + r8
            float r39 = r39 * r42
            float r39 = r39 + r35
            float r8 = r39 - r10
            int r8 = (int) r8
            float r8 = (float) r8
            r15.X = r8
            float r8 = r6.Y
            float r11 = r11 * r12
            float r11 = r11 + r8
            float r42 = r42 * r40
            float r42 = r42 + r11
            float r8 = r42 - r13
            int r8 = (int) r8
            float r8 = (float) r8
            r15.Y = r8
            java.lang.String r8 = r14.f
            gr1 r8 = defpackage.gr1.c(r8)
            r15.A = r8
            int r8 = r14.g
            r15.f0 = r8
            goto L24a
        L346:
            r40 = 1073741824(0x40000000, float:2.0)
            float r8 = (float) r10
            float r8 = r8 / r35
            r15.L = r8
            int r10 = r14.h
            r15.B = r10
            float r10 = r14.i
            boolean r10 = java.lang.Float.isNaN(r10)
            if (r10 == 0) goto L35b
            r10 = r8
            goto L35d
        L35b:
            float r10 = r14.i
        L35d:
            float r11 = r14.j
            boolean r11 = java.lang.Float.isNaN(r11)
            if (r11 == 0) goto L367
            r11 = r8
            goto L369
        L367:
            float r11 = r14.j
        L369:
            float r12 = r7.Z
            float r13 = r6.Z
            float r35 = r12 - r13
            r41 = r8
            float r8 = r7.d0
            r42 = r8
            float r8 = r6.d0
            float r43 = r42 - r8
            r44 = r8
            float r8 = r15.L
            r15.R = r8
            float r8 = r6.X
            float r45 = r13 / r40
            float r45 = r45 + r8
            r46 = r8
            float r8 = r6.Y
            float r47 = r44 / r40
            float r47 = r47 + r8
            r48 = r8
            float r8 = r7.X
            float r12 = r12 / r40
            float r12 = r12 + r8
            float r8 = r7.Y
            float r42 = r42 / r40
            float r42 = r42 + r8
            int r8 = (r45 > r12 ? 1 : (r45 == r12 ? 0 : -1))
            if (r8 <= 0) goto L3a4
            r49 = r45
            r45 = r12
            r12 = r49
        L3a4:
            int r8 = (r47 > r42 ? 1 : (r47 == r42 ? 0 : -1))
            if (r8 <= 0) goto L3a9
            goto L3af
        L3a9:
            r49 = r47
            r47 = r42
            r42 = r49
        L3af:
            float r12 = r12 - r45
            float r47 = r47 - r42
            float r8 = r12 * r41
            float r8 = r8 + r46
            float r35 = r35 * r10
            float r10 = r35 / r40
            float r8 = r8 - r10
            int r8 = (int) r8
            float r8 = (float) r8
            r15.X = r8
            float r8 = r47 * r41
            float r8 = r8 + r48
            float r43 = r43 * r11
            float r11 = r43 / r40
            float r8 = r8 - r11
            int r8 = (int) r8
            float r8 = (float) r8
            r15.Y = r8
            float r13 = r13 + r35
            int r8 = (int) r13
            float r8 = (float) r8
            r15.Z = r8
            float r8 = r44 + r43
            int r8 = (int) r8
            float r8 = (float) r8
            r15.d0 = r8
            float r8 = r14.k
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L3e6
            r8 = r41
        L3e3:
            r23 = 2143289344(0x7fc00000, float:NaN)
            goto L3e9
        L3e6:
            float r8 = r14.k
            goto L3e3
        L3e9:
            boolean r13 = java.lang.Float.isNaN(r23)
            if (r13 == 0) goto L3f3
            r13 = 0
        L3f0:
            r35 = r8
            goto L3f6
        L3f3:
            r13 = r23
            goto L3f0
        L3f6:
            float r8 = r14.l
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L401
            r8 = r41
            goto L403
        L401:
            float r8 = r14.l
        L403:
            boolean r40 = java.lang.Float.isNaN(r23)
            if (r40 == 0) goto L40f
            r39 = 0
        L40b:
            r40 = r8
            r8 = 0
            goto L412
        L40f:
            r39 = r23
            goto L40b
        L412:
            r15.k0 = r8
            float r8 = r6.X
            float r35 = r35 * r12
            float r35 = r35 + r8
            float r39 = r39 * r47
            float r39 = r39 + r35
            float r8 = r39 - r10
            int r8 = (int) r8
            float r8 = (float) r8
            r15.X = r8
            float r8 = r6.Y
            float r12 = r12 * r13
            float r12 = r12 + r8
            float r47 = r47 * r40
            float r47 = r47 + r12
            float r8 = r47 - r11
            int r8 = (int) r8
            float r8 = (float) r8
            r15.Y = r8
            java.lang.String r8 = r14.f
            gr1 r8 = defpackage.gr1.c(r8)
            r15.A = r8
            int r8 = r14.g
            r15.f0 = r8
            goto L5d8
        L440:
            r23 = 2143289344(0x7fc00000, float:NaN)
            r40 = 1073741824(0x40000000, float:2.0)
            float r8 = (float) r10
            float r8 = r8 / r35
            r15.L = r8
            int r10 = r14.h
            r15.B = r10
            float r10 = r14.i
            boolean r10 = java.lang.Float.isNaN(r10)
            if (r10 == 0) goto L457
            r10 = r8
            goto L459
        L457:
            float r10 = r14.i
        L459:
            float r11 = r14.j
            boolean r11 = java.lang.Float.isNaN(r11)
            if (r11 == 0) goto L463
            r11 = r8
            goto L465
        L463:
            float r11 = r14.j
        L465:
            float r12 = r7.Z
            float r13 = r6.Z
            float r35 = r12 - r13
            r39 = r8
            float r8 = r7.d0
            r41 = r8
            float r8 = r6.d0
            float r42 = r41 - r8
            r43 = r8
            float r8 = r15.L
            r15.R = r8
            float r8 = r6.X
            float r44 = r13 / r40
            float r44 = r44 + r8
            r45 = r8
            float r8 = r6.Y
            float r46 = r43 / r40
            float r46 = r46 + r8
            r47 = r8
            float r8 = r7.X
            float r12 = r12 / r40
            float r12 = r12 + r8
            float r8 = r7.Y
            float r41 = r41 / r40
            float r41 = r41 + r8
            float r12 = r12 - r44
            float r41 = r41 - r46
            float r12 = r12 * r39
            float r12 = r12 + r45
            float r35 = r35 * r10
            float r8 = r35 / r40
            float r12 = r12 - r8
            int r8 = (int) r12
            float r8 = (float) r8
            r15.X = r8
            float r41 = r41 * r39
            float r41 = r41 + r47
            float r42 = r42 * r11
            float r8 = r42 / r40
            float r8 = r41 - r8
            int r8 = (int) r8
            float r8 = (float) r8
            r15.Y = r8
            float r13 = r13 + r35
            int r8 = (int) r13
            float r8 = (float) r8
            r15.Z = r8
            float r8 = r43 + r42
            int r8 = (int) r8
            float r8 = (float) r8
            r15.d0 = r8
            r13 = 2
            r15.k0 = r13
            float r8 = r14.k
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 != 0) goto L4d9
            float r8 = r15.Z
            int r8 = (int) r8
            int r8 = r53 - r8
            float r10 = r14.k
            float r8 = (float) r8
            float r10 = r10 * r8
            int r8 = (int) r10
            float r8 = (float) r8
            r15.X = r8
        L4d9:
            float r8 = r14.l
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 != 0) goto L4ee
            float r8 = r15.d0
            int r8 = (int) r8
            int r8 = r54 - r8
            float r10 = r14.l
            float r8 = (float) r8
            float r10 = r10 * r8
            int r8 = (int) r10
            float r8 = (float) r8
            r15.Y = r8
        L4ee:
            int r8 = r15.g0
            r15.g0 = r8
            java.lang.String r8 = r14.f
            gr1 r8 = defpackage.gr1.c(r8)
            r15.A = r8
            int r8 = r14.g
            r15.f0 = r8
            goto L5d8
        L500:
            r23 = 2143289344(0x7fc00000, float:NaN)
            r40 = 1073741824(0x40000000, float:2.0)
            float r8 = (float) r10
            float r8 = r8 / r35
            r15.L = r8
            int r10 = r14.h
            r15.B = r10
            float r10 = r14.i
            boolean r10 = java.lang.Float.isNaN(r10)
            if (r10 == 0) goto L517
            r10 = r8
            goto L519
        L517:
            float r10 = r14.i
        L519:
            float r11 = r14.j
            boolean r11 = java.lang.Float.isNaN(r11)
            if (r11 == 0) goto L523
            r11 = r8
            goto L525
        L523:
            float r11 = r14.j
        L525:
            float r12 = r7.Z
            float r13 = r6.Z
            float r12 = r12 - r13
            float r13 = r7.d0
            r35 = r8
            float r8 = r6.d0
            float r13 = r13 - r8
            float r8 = r15.L
            r15.R = r8
            float r8 = r14.k
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L53e
            goto L542
        L53e:
            float r8 = r14.k
            r35 = r8
        L542:
            float r8 = r6.X
            r41 = r8
            float r8 = r6.Z
            float r42 = r8 / r40
            float r42 = r42 + r41
            r43 = r8
            float r8 = r6.Y
            r44 = r8
            float r8 = r6.d0
            float r45 = r8 / r40
            float r45 = r45 + r44
            r46 = r8
            float r8 = r7.X
            r47 = r8
            float r8 = r7.Z
            float r8 = r8 / r40
            float r8 = r8 + r47
            r47 = r8
            float r8 = r7.Y
            r48 = r8
            float r8 = r7.d0
            float r8 = r8 / r40
            float r8 = r8 + r48
            float r42 = r47 - r42
            float r8 = r8 - r45
            float r45 = r42 * r35
            float r41 = r41 + r45
            float r12 = r12 * r10
            float r10 = r12 / r40
            r47 = r10
            float r10 = r41 - r47
            int r10 = (int) r10
            float r10 = (float) r10
            r15.X = r10
            float r35 = r35 * r8
            float r10 = r44 + r35
            float r13 = r13 * r11
            float r11 = r13 / r40
            float r10 = r10 - r11
            int r10 = (int) r10
            float r10 = (float) r10
            r15.Y = r10
            float r10 = r43 + r12
            int r10 = (int) r10
            float r10 = (float) r10
            r15.Z = r10
            float r10 = r46 + r13
            int r10 = (int) r10
            float r10 = (float) r10
            r15.d0 = r10
            float r10 = r14.l
            boolean r10 = java.lang.Float.isNaN(r10)
            if (r10 == 0) goto L5a6
            r39 = 0
            goto L5aa
        L5a6:
            float r10 = r14.l
            r39 = r10
        L5aa:
            float r8 = -r8
            float r8 = r8 * r39
            float r42 = r42 * r39
            r13 = 1
            r15.k0 = r13
            float r10 = r6.X
            float r10 = r10 + r45
            float r10 = r10 - r47
            int r10 = (int) r10
            float r10 = (float) r10
            float r12 = r6.Y
            float r12 = r12 + r35
            float r12 = r12 - r11
            int r11 = (int) r12
            float r11 = (float) r11
            float r10 = r10 + r8
            r15.X = r10
            float r11 = r11 + r42
            r15.Y = r11
            int r8 = r15.g0
            r15.g0 = r8
            java.lang.String r8 = r14.f
            gr1 r8 = defpackage.gr1.c(r8)
            r15.A = r8
            int r8 = r14.g
            r15.f0 = r8
        L5d8:
            int r8 = java.util.Collections.binarySearch(r5, r15)
            if (r8 != 0) goto L5f8
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = " KeyPath position \""
            r10.<init>(r11)
            float r11 = r15.R
            r10.append(r11)
            java.lang.String r11 = "\" outside of range"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "MotionController"
            android.util.Log.e(r11, r10)
        L5f8:
            int r8 = -r8
            r28 = 1
            int r8 = r8 + (-1)
            r5.add(r8, r15)
            int r8 = r14.e
            r12 = -1
            if (r8 == r12) goto L640
            r0.e = r8
            goto L640
        L608:
            r33 = r8
            r38 = r10
            r36 = r11
            r34 = r12
            r37 = r13
            r23 = 2143289344(0x7fc00000, float:NaN)
            boolean r8 = r14 instanceof defpackage.qg3
            if (r8 == 0) goto L61c
            r14.d(r3)
            goto L640
        L61c:
            boolean r8 = r14 instanceof defpackage.ph3
            if (r8 == 0) goto L624
            r14.d(r1)
            goto L640
        L624:
            boolean r8 = r14 instanceof defpackage.rh3
            if (r8 == 0) goto L63a
            if (r30 != 0) goto L630
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            goto L632
        L630:
            r8 = r30
        L632:
            rh3 r14 = (defpackage.rh3) r14
            r8.add(r14)
            r30 = r8
            goto L640
        L63a:
            r14.f(r4)
            r14.d(r2)
        L640:
            r15 = r31
            r14 = r32
            r8 = r33
            r12 = r34
            r11 = r36
            r13 = r37
            r10 = r38
            goto L136
        L650:
            r33 = r8
            r8 = r30
        L654:
            r38 = r10
            r36 = r11
            r34 = r12
            r37 = r13
            r23 = 2143289344(0x7fc00000, float:NaN)
            goto L665
        L65f:
            r33 = r8
            r29 = r15
            r8 = 0
            goto L654
        L665:
            if (r8 == 0) goto L672
            r10 = 0
            rh3[] r11 = new defpackage.rh3[r10]
            java.lang.Object[] r8 = r8.toArray(r11)
            rh3[] r8 = (defpackage.rh3[]) r8
            r0.A = r8
        L672:
            boolean r8 = r2.isEmpty()
            java.lang.String r13 = "CUSTOM,"
            java.lang.String r15 = ","
            if (r8 != 0) goto Lb63
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r0.y = r8
            java.util.Iterator r8 = r2.iterator()
        L687:
            boolean r30 = r8.hasNext()
            if (r30 == 0) goto Lad8
            java.lang.Object r30 = r8.next()
            r10 = r30
            java.lang.String r10 = (java.lang.String) r10
            boolean r30 = r10.startsWith(r13)
            if (r30 == 0) goto L706
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            java.lang.String[] r32 = r10.split(r15)
            r28 = 1
            r11 = r32[r28]
            int r14 = r9.size()
            r39 = r1
            r1 = 0
        L6af:
            if (r1 >= r14) goto L6d6
            java.lang.Object r40 = r9.get(r1)
            int r1 = r1 + 1
            r41 = r1
            r1 = r40
            jg3 r1 = (defpackage.jg3) r1
            r40 = r3
            java.util.HashMap r3 = r1.d
            if (r3 != 0) goto L6c8
        L6c3:
            r3 = r40
            r1 = r41
            goto L6af
        L6c8:
            java.lang.Object r3 = r3.get(r11)
            j11 r3 = (defpackage.j11) r3
            if (r3 == 0) goto L6c3
            int r1 = r1.a
            r12.append(r1, r3)
            goto L6c3
        L6d6:
            r40 = r3
            np7 r1 = new np7
            r1.<init>()
            java.lang.String[] r3 = r10.split(r15)
            r28 = 1
            r3 = r3[r28]
            r1.f = r12
            r14 = r33
            r12 = r34
            r11 = r36
            r3 = r37
            r33 = r8
            r34 = r19
            r8 = r29
            r29 = r2
            r19 = r5
            r2 = r18
            r5 = r1
            r18 = r6
            r6 = r26
            r1 = r38
            r26 = r7
            goto Laac
        L706:
            r39 = r1
            r40 = r3
            int r1 = r10.hashCode()
            switch(r1) {
                case -1249320806: goto L9be;
                case -1249320805: goto L98f;
                case -1225497657: goto L965;
                case -1225497656: goto L93b;
                case -1225497655: goto L90f;
                case -1001078227: goto L8e5;
                case -908189618: goto L8bb;
                case -908189617: goto L891;
                case -797520672: goto L863;
                case -760884510: goto L838;
                case -760884509: goto L808;
                case -40300674: goto L7f5;
                case -4379043: goto L7c5;
                case 37232917: goto L793;
                case 92909918: goto L760;
                case 156108012: goto L733;
                default: goto L711;
            }
        L711:
            r14 = r33
            r12 = r34
            r11 = r36
            r3 = r37
            r1 = r38
        L71b:
            r33 = r8
            r8 = r29
        L71f:
            r29 = r2
            r2 = r18
        L723:
            r18 = r6
        L725:
            r6 = r26
        L727:
            r26 = r7
            r7 = r19
        L72b:
            r19 = r5
        L72d:
            r5 = r16
        L72f:
            r16 = -1
            goto L9e6
        L733:
            java.lang.String r1 = "waveOffset"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L73c
            goto L711
        L73c:
            r1 = 15
            r14 = r33
            r12 = r34
            r11 = r36
            r3 = r37
            r33 = r8
            r8 = r29
            r29 = r2
            r2 = r18
            r18 = r6
            r6 = r26
            r26 = r7
            r7 = r19
            r19 = r5
            r5 = r16
            r16 = r1
            r1 = r38
            goto L9e6
        L760:
            r1 = r38
            boolean r3 = r10.equals(r1)
            if (r3 != 0) goto L771
            r14 = r33
            r12 = r34
            r11 = r36
            r3 = r37
            goto L71b
        L771:
            r3 = 14
            r14 = r33
            r12 = r34
            r11 = r36
            r33 = r8
            r8 = r29
            r29 = r2
            r2 = r18
            r18 = r6
            r6 = r26
            r26 = r7
            r7 = r19
            r19 = r5
            r5 = r16
            r16 = r3
            r3 = r37
            goto L9e6
        L793:
            r3 = r37
            r1 = r38
            boolean r11 = r10.equals(r3)
            if (r11 != 0) goto L7a5
            r14 = r33
            r12 = r34
            r11 = r36
            goto L71b
        L7a5:
            r11 = 13
            r14 = r33
            r12 = r34
            r33 = r8
            r8 = r29
            r29 = r2
            r2 = r18
            r18 = r6
            r6 = r26
            r26 = r7
            r7 = r19
            r19 = r5
            r5 = r16
            r16 = r11
            r11 = r36
            goto L9e6
        L7c5:
            r11 = r36
            r3 = r37
            r1 = r38
            boolean r12 = r10.equals(r11)
            if (r12 != 0) goto L7d7
            r14 = r33
            r12 = r34
            goto L71b
        L7d7:
            r12 = 12
            r14 = r33
            r33 = r8
            r8 = r29
            r29 = r2
            r2 = r18
            r18 = r6
            r6 = r26
            r26 = r7
            r7 = r19
            r19 = r5
            r5 = r16
            r16 = r12
            r12 = r34
            goto L9e6
        L7f5:
            r12 = r34
            r11 = r36
            r3 = r37
            r1 = r38
            boolean r14 = r10.equals(r12)
            if (r14 != 0) goto L805
            goto L873
        L805:
            r14 = 11
            goto L81c
        L808:
            r12 = r34
            r11 = r36
            r3 = r37
            r1 = r38
            java.lang.String r14 = "transformPivotY"
            boolean r14 = r10.equals(r14)
            if (r14 != 0) goto L81a
            goto L873
        L81a:
            r14 = 10
        L81c:
            r49 = r29
            r29 = r2
            r2 = r18
            r18 = r6
            r6 = r26
            r26 = r7
            r7 = r19
            r19 = r5
            r5 = r16
            r16 = r14
            r14 = r33
            r33 = r8
            r8 = r49
            goto L9e6
        L838:
            r12 = r34
            r11 = r36
            r3 = r37
            r1 = r38
            java.lang.String r14 = "transformPivotX"
            boolean r14 = r10.equals(r14)
            if (r14 != 0) goto L849
            goto L873
        L849:
            r14 = r33
            r33 = r8
            r8 = r29
            r29 = r2
            r2 = r18
            r18 = r6
            r6 = r26
            r26 = r7
            r7 = r19
            r19 = r5
            r5 = r16
            r16 = 9
            goto L9e6
        L863:
            r12 = r34
            r11 = r36
            r3 = r37
            r1 = r38
            java.lang.String r14 = "waveVariesBy"
            boolean r14 = r10.equals(r14)
            if (r14 != 0) goto L877
        L873:
            r14 = r33
            goto L71b
        L877:
            r14 = r33
            r33 = r8
            r8 = r29
            r29 = r2
            r2 = r18
            r18 = r6
            r6 = r26
            r26 = r7
            r7 = r19
            r19 = r5
            r5 = r16
            r16 = 8
            goto L9e6
        L891:
            r14 = r33
            r12 = r34
            r11 = r36
            r3 = r37
            r1 = r38
            boolean r33 = r10.equals(r14)
            if (r33 != 0) goto L8a3
            goto L71b
        L8a3:
            r33 = r8
            r8 = r29
            r29 = r2
            r2 = r18
            r18 = r6
            r6 = r26
            r26 = r7
            r7 = r19
            r19 = r5
            r5 = r16
            r16 = 7
            goto L9e6
        L8bb:
            r14 = r33
            r12 = r34
            r11 = r36
            r3 = r37
            r1 = r38
            r33 = r8
            r8 = r29
            boolean r29 = r10.equals(r8)
            if (r29 != 0) goto L8d1
            goto L71f
        L8d1:
            r29 = r2
            r2 = r18
            r18 = r6
            r6 = r26
            r26 = r7
            r7 = r19
            r19 = r5
            r5 = r16
            r16 = 6
            goto L9e6
        L8e5:
            r14 = r33
            r12 = r34
            r11 = r36
            r3 = r37
            r1 = r38
            r33 = r8
            r8 = r29
            r29 = r2
            r2 = r18
            boolean r18 = r10.equals(r2)
            if (r18 != 0) goto L8ff
            goto L723
        L8ff:
            r18 = r6
            r6 = r26
            r26 = r7
            r7 = r19
            r19 = r5
            r5 = r16
            r16 = 5
            goto L9e6
        L90f:
            r14 = r33
            r12 = r34
            r11 = r36
            r3 = r37
            r1 = r38
            r33 = r8
            r8 = r29
            r29 = r2
            r2 = r18
            r18 = r6
            java.lang.String r6 = "translationZ"
            boolean r6 = r10.equals(r6)
            if (r6 != 0) goto L92d
            goto L725
        L92d:
            r6 = r26
            r26 = r7
            r7 = r19
            r19 = r5
            r5 = r16
            r16 = 4
            goto L9e6
        L93b:
            r14 = r33
            r12 = r34
            r11 = r36
            r3 = r37
            r1 = r38
            r33 = r8
            r8 = r29
            r29 = r2
            r2 = r18
            r18 = r6
            r6 = r26
            boolean r26 = r10.equals(r6)
            if (r26 != 0) goto L959
            goto L727
        L959:
            r26 = r7
            r7 = r19
            r19 = r5
            r5 = r16
            r16 = 3
            goto L9e6
        L965:
            r14 = r33
            r12 = r34
            r11 = r36
            r3 = r37
            r1 = r38
            r33 = r8
            r8 = r29
            r29 = r2
            r2 = r18
            r18 = r6
            r6 = r26
            r26 = r7
            r7 = r19
            boolean r19 = r10.equals(r7)
            if (r19 != 0) goto L987
            goto L72b
        L987:
            r19 = r5
            r5 = r16
            r16 = 2
            goto L9e6
        L98f:
            r14 = r33
            r12 = r34
            r11 = r36
            r3 = r37
            r1 = r38
            r33 = r8
            r8 = r29
            r29 = r2
            r2 = r18
            r18 = r6
            r6 = r26
            r26 = r7
            r7 = r19
            r19 = r5
            r5 = r17
            boolean r17 = r10.equals(r5)
            if (r17 != 0) goto L9b7
            r17 = r5
            goto L72d
        L9b7:
            r17 = r5
            r5 = r16
            r16 = 1
            goto L9e6
        L9be:
            r14 = r33
            r12 = r34
            r11 = r36
            r3 = r37
            r1 = r38
            r33 = r8
            r8 = r29
            r29 = r2
            r2 = r18
            r18 = r6
            r6 = r26
            r26 = r7
            r7 = r19
            r19 = r5
            r5 = r16
            boolean r16 = r10.equals(r5)
            if (r16 != 0) goto L9e4
            goto L72f
        L9e4:
            r16 = 0
        L9e6:
            switch(r16) {
                case 0: goto Laa2;
                case 1: goto La97;
                case 2: goto La8b;
                case 3: goto La7f;
                case 4: goto La73;
                case 5: goto La66;
                case 6: goto La5b;
                case 7: goto La4e;
                case 8: goto La43;
                case 9: goto La37;
                case 10: goto La2b;
                case 11: goto La1f;
                case 12: goto La13;
                case 13: goto La08;
                case 14: goto L9fc;
                case 15: goto L9f0;
                default: goto L9e9;
            }
        L9e9:
            r16 = r5
            r34 = r7
            r5 = 0
            goto Laac
        L9f0:
            r16 = r5
            mp7 r5 = new mp7
            r34 = r7
            r7 = 0
            r5.<init>(r7)
            goto Laac
        L9fc:
            r16 = r5
            r34 = r7
            r7 = 0
            mp7 r5 = new mp7
            r5.<init>(r7)
            goto Laac
        La08:
            r16 = r5
            r34 = r7
            op7 r5 = new op7
            r5.<init>()
            goto Laac
        La13:
            r16 = r5
            r34 = r7
            mp7 r5 = new mp7
            r7 = 1
            r5.<init>(r7)
            goto Laac
        La1f:
            r16 = r5
            r34 = r7
            mp7 r5 = new mp7
            r7 = 4
            r5.<init>(r7)
            goto Laac
        La2b:
            r16 = r5
            r34 = r7
            mp7 r5 = new mp7
            r7 = 3
            r5.<init>(r7)
            goto Laac
        La37:
            r16 = r5
            r34 = r7
            mp7 r5 = new mp7
            r7 = 2
            r5.<init>(r7)
            goto Laac
        La43:
            r16 = r5
            r34 = r7
            mp7 r5 = new mp7
            r7 = 0
            r5.<init>(r7)
            goto Laac
        La4e:
            r16 = r5
            r34 = r7
            r7 = 0
            mp7 r5 = new mp7
            r7 = 8
            r5.<init>(r7)
            goto Laac
        La5b:
            r16 = r5
            r34 = r7
            mp7 r5 = new mp7
            r7 = 7
            r5.<init>(r7)
            goto Laac
        La66:
            r16 = r5
            r34 = r7
            pp7 r5 = new pp7
            r5.<init>()
            r7 = 0
            r5.f = r7
            goto Laac
        La73:
            r16 = r5
            r34 = r7
            mp7 r5 = new mp7
            r7 = 11
            r5.<init>(r7)
            goto Laac
        La7f:
            r16 = r5
            r34 = r7
            mp7 r5 = new mp7
            r7 = 10
            r5.<init>(r7)
            goto Laac
        La8b:
            r16 = r5
            r34 = r7
            mp7 r5 = new mp7
            r7 = 9
            r5.<init>(r7)
            goto Laac
        La97:
            r16 = r5
            r34 = r7
            mp7 r5 = new mp7
            r7 = 6
            r5.<init>(r7)
            goto Laac
        Laa2:
            r16 = r5
            r34 = r7
            mp7 r5 = new mp7
            r7 = 5
            r5.<init>(r7)
        Laac:
            if (r5 != 0) goto Lad0
        Laae:
            r38 = r1
            r37 = r3
            r36 = r11
            r5 = r19
            r7 = r26
            r19 = r34
            r1 = r39
            r3 = r40
            r26 = r6
            r34 = r12
            r6 = r18
            r18 = r2
            r2 = r29
            r29 = r8
            r8 = r33
            r33 = r14
            goto L687
        Lad0:
            r5.e = r10
            java.util.HashMap r7 = r0.y
            r7.put(r10, r5)
            goto Laae
        Lad8:
            r39 = r1
            r40 = r3
            r8 = r29
            r14 = r33
            r12 = r34
            r11 = r36
            r3 = r37
            r1 = r38
            r29 = r2
            r2 = r18
            r34 = r19
            r19 = r5
            r18 = r6
            r6 = r26
            r26 = r7
            if (r9 == 0) goto Lb15
            int r5 = r9.size()
            r7 = 0
        Lafd:
            if (r7 >= r5) goto Lb15
            java.lang.Object r10 = r9.get(r7)
            int r7 = r7 + 1
            jg3 r10 = (defpackage.jg3) r10
            r33 = r5
            boolean r5 = r10 instanceof defpackage.mg3
            if (r5 == 0) goto Lb12
            java.util.HashMap r5 = r0.y
            r10.a(r5)
        Lb12:
            r5 = r33
            goto Lafd
        Lb15:
            java.util.HashMap r5 = r0.y
            r7 = r20
            r10 = 0
            r7.a(r5, r10)
            java.util.HashMap r5 = r0.y
            r7 = 100
            r10 = r24
            r10.a(r5, r7)
            java.util.HashMap r5 = r0.y
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        Lb30:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Lb81
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r10 = r4.containsKey(r7)
            if (r10 == 0) goto Lb51
            java.lang.Object r10 = r4.get(r7)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto Lb51
            int r10 = r10.intValue()
        Lb4e:
            r20 = r5
            goto Lb53
        Lb51:
            r10 = 0
            goto Lb4e
        Lb53:
            java.util.HashMap r5 = r0.y
            java.lang.Object r5 = r5.get(r7)
            qp7 r5 = (defpackage.qp7) r5
            if (r5 == 0) goto Lb60
            r5.d(r10)
        Lb60:
            r5 = r20
            goto Lb30
        Lb63:
            r39 = r1
            r40 = r3
            r8 = r29
            r14 = r33
            r12 = r34
            r11 = r36
            r3 = r37
            r1 = r38
            r29 = r2
            r2 = r18
            r34 = r19
            r19 = r5
            r18 = r6
            r6 = r26
            r26 = r7
        Lb81:
            boolean r5 = r39.isEmpty()
            if (r5 != 0) goto Lde8
            java.util.HashMap r5 = r0.x
            if (r5 != 0) goto Lb92
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0.x = r5
        Lb92:
            java.util.Iterator r5 = r39.iterator()
        Lb96:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Ld8f
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.HashMap r10 = r0.x
            boolean r10 = r10.containsKey(r7)
            if (r10 == 0) goto Lbab
            goto Lb96
        Lbab:
            boolean r10 = r7.startsWith(r13)
            if (r10 == 0) goto Lc17
            android.util.SparseArray r10 = new android.util.SparseArray
            r10.<init>()
            java.lang.String[] r20 = r7.split(r15)
            r24 = r5
            r28 = 1
            r5 = r20[r28]
            r20 = r13
            int r13 = r9.size()
            r33 = r4
            r4 = 0
        Lbc9:
            if (r4 >= r13) goto Lbf0
            java.lang.Object r36 = r9.get(r4)
            int r4 = r4 + 1
            r37 = r4
            r4 = r36
            jg3 r4 = (defpackage.jg3) r4
            r36 = r13
            java.util.HashMap r13 = r4.d
            if (r13 != 0) goto Lbe2
        Lbdd:
            r13 = r36
            r4 = r37
            goto Lbc9
        Lbe2:
            java.lang.Object r13 = r13.get(r5)
            j11 r13 = (defpackage.j11) r13
            if (r13 == 0) goto Lbdd
            int r4 = r4.a
            r10.append(r4, r13)
            goto Lbdd
        Lbf0:
            tp7 r4 = new tp7
            r4.<init>()
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            r4.m = r5
            java.lang.String[] r5 = r7.split(r15)
            r28 = 1
            r5 = r5[r28]
            r4.k = r5
            r4.l = r10
            r38 = r1
            r13 = r4
            r10 = r16
            r5 = r17
            r4 = r34
            r16 = r2
        Lc13:
            r1 = r51
            goto Ld73
        Lc17:
            r33 = r4
            r24 = r5
            r20 = r13
            int r4 = r7.hashCode()
            switch(r4) {
                case -1249320806: goto Lcdf;
                case -1249320805: goto Lccd;
                case -1225497657: goto Lcbb;
                case -1225497656: goto Lcab;
                case -1225497655: goto Lc9a;
                case -1001078227: goto Lc8b;
                case -908189618: goto Lc7b;
                case -908189617: goto Lc6b;
                case -40300674: goto Lc5a;
                case -4379043: goto Lc49;
                case 37232917: goto Lc37;
                case 92909918: goto Lc2d;
                default: goto Lc24;
            }
        Lc24:
            r10 = r16
            r5 = r17
            r4 = r34
        Lc2a:
            r13 = -1
            goto Lcee
        Lc2d:
            boolean r4 = r7.equals(r1)
            if (r4 != 0) goto Lc34
            goto Lc24
        Lc34:
            r4 = 11
            goto Lc40
        Lc37:
            boolean r4 = r7.equals(r3)
            if (r4 != 0) goto Lc3e
            goto Lc24
        Lc3e:
            r4 = 10
        Lc40:
            r13 = r4
            r10 = r16
            r5 = r17
            r4 = r34
            goto Lcee
        Lc49:
            boolean r4 = r7.equals(r11)
            if (r4 != 0) goto Lc50
            goto Lc24
        Lc50:
            r10 = r16
            r5 = r17
            r4 = r34
            r13 = 9
            goto Lcee
        Lc5a:
            boolean r4 = r7.equals(r12)
            if (r4 != 0) goto Lc61
            goto Lc24
        Lc61:
            r10 = r16
            r5 = r17
            r4 = r34
            r13 = 8
            goto Lcee
        Lc6b:
            boolean r4 = r7.equals(r14)
            if (r4 != 0) goto Lc72
            goto Lc24
        Lc72:
            r10 = r16
            r5 = r17
            r4 = r34
            r13 = 7
            goto Lcee
        Lc7b:
            boolean r4 = r7.equals(r8)
            if (r4 != 0) goto Lc82
            goto Lc24
        Lc82:
            r10 = r16
            r5 = r17
            r4 = r34
            r13 = 6
            goto Lcee
        Lc8b:
            boolean r4 = r7.equals(r2)
            if (r4 != 0) goto Lc92
            goto Lc24
        Lc92:
            r10 = r16
            r5 = r17
            r4 = r34
            r13 = 5
            goto Lcee
        Lc9a:
            java.lang.String r4 = "translationZ"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto Lca3
            goto Lc24
        Lca3:
            r10 = r16
            r5 = r17
            r4 = r34
            r13 = 4
            goto Lcee
        Lcab:
            boolean r4 = r7.equals(r6)
            if (r4 != 0) goto Lcb3
            goto Lc24
        Lcb3:
            r10 = r16
            r5 = r17
            r4 = r34
            r13 = 3
            goto Lcee
        Lcbb:
            r4 = r34
            boolean r5 = r7.equals(r4)
            r10 = r16
            if (r5 != 0) goto Lcc9
            r5 = r17
            goto Lc2a
        Lcc9:
            r5 = r17
            r13 = 2
            goto Lcee
        Lccd:
            r5 = r17
            r4 = r34
            boolean r10 = r7.equals(r5)
            if (r10 != 0) goto Lcdb
            r10 = r16
            goto Lc2a
        Lcdb:
            r10 = r16
            r13 = 1
            goto Lcee
        Lcdf:
            r10 = r16
            r5 = r17
            r4 = r34
            boolean r13 = r7.equals(r10)
            if (r13 != 0) goto Lced
            goto Lc2a
        Lced:
            r13 = 0
        Lcee:
            switch(r13) {
                case 0: goto Ld68;
                case 1: goto Ld5e;
                case 2: goto Ld53;
                case 3: goto Ld47;
                case 4: goto Ld3d;
                case 5: goto Ld32;
                case 6: goto Ld29;
                case 7: goto Ld20;
                case 8: goto Ld17;
                case 9: goto Ld0e;
                case 10: goto Ld06;
                case 11: goto Lcf8;
                default: goto Lcf1;
            }
        Lcf1:
            r38 = r1
            r16 = r2
            r13 = 0
            goto Lc13
        Lcf8:
            sp7 r13 = new sp7
            r38 = r1
            r1 = 0
            r13.<init>(r1)
        Ld00:
            r16 = r2
            r1 = r51
            goto Ld71
        Ld06:
            r38 = r1
            up7 r13 = new up7
            r13.<init>()
            goto Ld00
        Ld0e:
            r38 = r1
            sp7 r13 = new sp7
            r1 = 1
            r13.<init>(r1)
            goto Ld00
        Ld17:
            r38 = r1
            sp7 r13 = new sp7
            r1 = 2
            r13.<init>(r1)
            goto Ld00
        Ld20:
            r38 = r1
            sp7 r13 = new sp7
            r1 = 6
            r13.<init>(r1)
            goto Ld00
        Ld29:
            r38 = r1
            sp7 r13 = new sp7
            r1 = 5
            r13.<init>(r1)
            goto Ld00
        Ld32:
            r38 = r1
            vp7 r13 = new vp7
            r13.<init>()
            r1 = 0
            r13.k = r1
            goto Ld00
        Ld3d:
            r38 = r1
            sp7 r13 = new sp7
            r1 = 9
            r13.<init>(r1)
            goto Ld00
        Ld47:
            r38 = r1
            r1 = 9
            sp7 r13 = new sp7
            r1 = 8
            r13.<init>(r1)
            goto Ld00
        Ld53:
            r38 = r1
            r1 = 8
            sp7 r13 = new sp7
            r1 = 7
            r13.<init>(r1)
            goto Ld00
        Ld5e:
            r38 = r1
            r1 = 7
            sp7 r13 = new sp7
            r1 = 4
            r13.<init>(r1)
            goto Ld00
        Ld68:
            r38 = r1
            sp7 r13 = new sp7
            r1 = 3
            r13.<init>(r1)
            goto Ld00
        Ld71:
            r13.i = r1
        Ld73:
            if (r13 != 0) goto Ld87
        Ld75:
            r34 = r4
            r17 = r5
            r2 = r16
            r13 = r20
            r5 = r24
            r4 = r33
            r1 = r38
            r16 = r10
            goto Lb96
        Ld87:
            r13.f = r7
            java.util.HashMap r1 = r0.x
            r1.put(r7, r13)
            goto Ld75
        Ld8f:
            r33 = r4
            r20 = r13
            if (r9 == 0) goto Ldb0
            int r1 = r9.size()
            r2 = 0
        Ld9a:
            if (r2 >= r1) goto Ldb0
            java.lang.Object r3 = r9.get(r2)
            int r2 = r2 + 1
            jg3 r3 = (defpackage.jg3) r3
            boolean r4 = r3 instanceof defpackage.ph3
            if (r4 == 0) goto Ld9a
            ph3 r3 = (defpackage.ph3) r3
            java.util.HashMap r4 = r0.x
            r3.g(r4)
            goto Ld9a
        Ldb0:
            java.util.HashMap r1 = r0.x
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ldba:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ldea
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = r33
            boolean r4 = r3.containsKey(r2)
            if (r4 == 0) goto Ldd9
            java.lang.Object r4 = r3.get(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto Ldda
        Ldd9:
            r4 = 0
        Ldda:
            java.util.HashMap r5 = r0.x
            java.lang.Object r2 = r5.get(r2)
            wp7 r2 = (defpackage.wp7) r2
            r2.e(r4)
            r33 = r3
            goto Ldba
        Lde8:
            r20 = r13
        Ldea:
            int r1 = r19.size()
            int r2 = r1 + 2
            y74[] r3 = new defpackage.y74[r2]
            r8 = 0
            r3[r8] = r18
            r28 = 1
            int r1 = r1 + 1
            r3[r1] = r26
            int r1 = r19.size()
            if (r1 <= 0) goto Le08
            int r1 = r0.e
            r12 = -1
            if (r1 != r12) goto Le08
            r0.e = r8
        Le08:
            int r1 = r19.size()
            r4 = 0
            r5 = 1
        Le0e:
            if (r4 >= r1) goto Le20
            r6 = r19
            java.lang.Object r7 = r6.get(r4)
            int r4 = r4 + 1
            y74 r7 = (defpackage.y74) r7
            int r8 = r5 + 1
            r3[r5] = r7
            r5 = r8
            goto Le0e
        Le20:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r4 = r26
            java.util.LinkedHashMap r4 = r4.j0
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        Le31:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Le6c
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r6 = r18
            java.util.LinkedHashMap r7 = r6.j0
            boolean r7 = r7.containsKey(r5)
            if (r7 == 0) goto Le61
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = r20
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            r10 = r29
            boolean r7 = r10.contains(r7)
            if (r7 != 0) goto Le65
            r1.add(r5)
            goto Le65
        Le61:
            r8 = r20
            r10 = r29
        Le65:
            r18 = r6
            r20 = r8
            r29 = r10
            goto Le31
        Le6c:
            r7 = 0
            java.lang.String[] r4 = new java.lang.String[r7]
            java.lang.Object[] r1 = r1.toArray(r4)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.r = r1
            int r1 = r1.length
            int[] r1 = new int[r1]
            r0.s = r1
            r1 = 0
        Le7d:
            java.lang.String[] r4 = r0.r
            int r5 = r4.length
            if (r1 >= r5) goto Leb5
            r4 = r4[r1]
            int[] r5 = r0.s
            r27 = 0
            r5[r1] = r27
            r5 = 0
        Le8b:
            if (r5 >= r2) goto Leb2
            r6 = r3[r5]
            java.util.LinkedHashMap r6 = r6.j0
            boolean r6 = r6.containsKey(r4)
            if (r6 == 0) goto Leaf
            r6 = r3[r5]
            java.util.LinkedHashMap r6 = r6.j0
            java.lang.Object r6 = r6.get(r4)
            j11 r6 = (defpackage.j11) r6
            if (r6 == 0) goto Leaf
            int[] r4 = r0.s
            r5 = r4[r1]
            int r6 = r6.c()
            int r6 = r6 + r5
            r4[r1] = r6
            goto Leb2
        Leaf:
            int r5 = r5 + 1
            goto Le8b
        Leb2:
            int r1 = r1 + 1
            goto Le7d
        Leb5:
            r27 = 0
            r1 = r3[r27]
            int r1 = r1.f0
            r12 = -1
            if (r1 == r12) goto Lec0
            r1 = 1
            goto Lec1
        Lec0:
            r1 = 0
        Lec1:
            int r4 = r4.length
            r22 = 18
            int r7 = r22 + r4
            boolean[] r4 = new boolean[r7]
            r5 = 1
        Lec9:
            if (r5 >= r2) goto Lf22
            r6 = r3[r5]
            int r8 = r5 + (-1)
            r8 = r3[r8]
            float r10 = r6.X
            float r11 = r8.X
            boolean r10 = defpackage.y74.b(r10, r11)
            float r11 = r6.Y
            float r12 = r8.Y
            boolean r11 = defpackage.y74.b(r11, r12)
            r27 = 0
            boolean r12 = r4[r27]
            float r13 = r6.R
            float r14 = r8.R
            boolean r13 = defpackage.y74.b(r13, r14)
            r12 = r12 | r13
            r4[r27] = r12
            r28 = 1
            boolean r12 = r4[r28]
            r10 = r10 | r11
            r10 = r10 | r1
            r11 = r12 | r10
            r4[r28] = r11
            r25 = 2
            boolean r11 = r4[r25]
            r10 = r10 | r11
            r4[r25] = r10
            r21 = 3
            boolean r10 = r4[r21]
            float r11 = r6.Z
            float r12 = r8.Z
            boolean r11 = defpackage.y74.b(r11, r12)
            r10 = r10 | r11
            r4[r21] = r10
            r32 = 4
            boolean r10 = r4[r32]
            float r6 = r6.d0
            float r8 = r8.d0
            boolean r6 = defpackage.y74.b(r6, r8)
            r6 = r6 | r10
            r4[r32] = r6
            int r5 = r5 + 1
            goto Lec9
        Lf22:
            r1 = 0
            r5 = 1
        Lf24:
            if (r5 >= r7) goto Lf2f
            boolean r6 = r4[r5]
            if (r6 == 0) goto Lf2c
            int r1 = r1 + 1
        Lf2c:
            int r5 = r5 + 1
            goto Lf24
        Lf2f:
            int[] r5 = new int[r1]
            r0.o = r5
            r13 = 2
            int r1 = java.lang.Math.max(r13, r1)
            double[] r5 = new double[r1]
            r0.p = r5
            double[] r1 = new double[r1]
            r0.q = r1
            r1 = 0
            r5 = 1
        Lf42:
            if (r5 >= r7) goto Lf52
            boolean r6 = r4[r5]
            if (r6 == 0) goto Lf4f
            int[] r6 = r0.o
            int r8 = r1 + 1
            r6[r1] = r5
            r1 = r8
        Lf4f:
            int r5 = r5 + 1
            goto Lf42
        Lf52:
            int[] r1 = r0.o
            int r1 = r1.length
            r13 = 2
            int[] r4 = new int[r13]
            r28 = 1
            r4[r28] = r1
            r27 = 0
            r4[r27] = r2
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r1, r4)
            double[][] r4 = (double[][]) r4
            double[] r5 = new double[r2]
            r6 = 0
        Lf6b:
            if (r6 >= r2) goto Lfbe
            r7 = r3[r6]
            r8 = r4[r6]
            int[] r10 = r0.o
            float r11 = r7.R
            float r12 = r7.X
            float r13 = r7.Y
            float r14 = r7.Z
            float r15 = r7.d0
            float r7 = r7.e0
            r16 = r3
            r17 = r6
            r3 = 6
            float[] r6 = new float[r3]
            r27 = 0
            r6[r27] = r11
            r28 = 1
            r6[r28] = r12
            r25 = 2
            r6[r25] = r13
            r21 = 3
            r6[r21] = r14
            r32 = 4
            r6[r32] = r15
            r11 = 5
            r6[r11] = r7
            r7 = 0
            r12 = 0
        Lf9f:
            int r13 = r10.length
            if (r7 >= r13) goto Lfb2
            r13 = r10[r7]
            if (r13 >= r3) goto Lfae
            int r3 = r12 + 1
            r13 = r6[r13]
            double r13 = (double) r13
            r8[r12] = r13
            r12 = r3
        Lfae:
            int r7 = r7 + 1
            r3 = 6
            goto Lf9f
        Lfb2:
            r3 = r16[r17]
            float r3 = r3.L
            double r6 = (double) r3
            r5[r17] = r6
            int r6 = r17 + 1
            r3 = r16
            goto Lf6b
        Lfbe:
            r16 = r3
            r3 = 0
        Lfc1:
            int[] r6 = r0.o
            int r7 = r6.length
            if (r3 >= r7) goto Lff6
            r6 = r6[r3]
            r7 = 6
            if (r6 >= r7) goto Lff3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int[] r8 = r0.o
            r8 = r8[r3]
            java.lang.String[] r10 = defpackage.y74.n0
            r8 = r10[r8]
            java.lang.String r10 = " ["
            java.lang.String r6 = defpackage.i61.n(r6, r8, r10)
            r8 = 0
        Lfdf:
            if (r8 >= r2) goto Lff3
            java.lang.StringBuilder r6 = defpackage.lb1.s(r6)
            r10 = r4[r8]
            r11 = r10[r3]
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            int r8 = r8 + 1
            goto Lfdf
        Lff3:
            int r3 = r3 + 1
            goto Lfc1
        Lff6:
            java.lang.String[] r3 = r0.r
            int r3 = r3.length
            r28 = 1
            int r3 = r3 + 1
            ak7[] r3 = new defpackage.ak7[r3]
            r0.j = r3
            r3 = 0
        L1002:
            java.lang.String[] r6 = r0.r
            int r7 = r6.length
            if (r3 >= r7) goto L10be
            r6 = r6[r3]
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
        L100d:
            if (r7 >= r2) goto L10a3
            r12 = r16[r7]
            java.util.LinkedHashMap r12 = r12.j0
            boolean r12 = r12.containsKey(r6)
            if (r12 == 0) goto L1095
            if (r11 != 0) goto L1041
            double[] r10 = new double[r2]
            r11 = r16[r7]
            java.util.LinkedHashMap r11 = r11.j0
            java.lang.Object r11 = r11.get(r6)
            j11 r11 = (defpackage.j11) r11
            if (r11 != 0) goto L102c
            r11 = 0
        L102a:
            r13 = 2
            goto L1031
        L102c:
            int r11 = r11.c()
            goto L102a
        L1031:
            int[] r12 = new int[r13]
            r28 = 1
            r12[r28] = r11
            r27 = 0
            r12[r27] = r2
            java.lang.Object r11 = java.lang.reflect.Array.newInstance(r1, r12)
            double[][] r11 = (double[][]) r11
        L1041:
            r12 = r16[r7]
            float r13 = r12.L
            double r13 = (double) r13
            r10[r8] = r13
            r13 = r11[r8]
            java.util.LinkedHashMap r12 = r12.j0
            java.lang.Object r12 = r12.get(r6)
            j11 r12 = (defpackage.j11) r12
            if (r12 != 0) goto L1055
            goto L1065
        L1055:
            int r14 = r12.c()
            r15 = 1
            if (r14 != r15) goto L106c
            float r12 = r12.a()
            double r14 = (double) r12
            r27 = 0
            r13[r27] = r14
        L1065:
            r19 = r3
            r51 = r6
            r20 = r7
            goto L1092
        L106c:
            int r14 = r12.c()
            float[] r15 = new float[r14]
            r12.b(r15)
            r12 = 0
            r17 = 0
        L1078:
            if (r12 >= r14) goto L1065
            int r18 = r17 + 1
            r19 = r3
            r3 = r15[r12]
            r51 = r6
            r20 = r7
            double r6 = (double) r3
            r13[r17] = r6
            int r12 = r12 + 1
            r6 = r51
            r17 = r18
            r3 = r19
            r7 = r20
            goto L1078
        L1092:
            int r8 = r8 + 1
            goto L109b
        L1095:
            r19 = r3
            r51 = r6
            r20 = r7
        L109b:
            int r7 = r20 + 1
            r6 = r51
            r3 = r19
            goto L100d
        L10a3:
            r19 = r3
            double[] r3 = java.util.Arrays.copyOf(r10, r8)
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r11, r8)
            double[][] r6 = (double[][]) r6
            ak7[] r7 = r0.j
            int r8 = r19 + 1
            int r10 = r0.e
            ak7 r3 = defpackage.ak7.U(r10, r3, r6)
            r7[r8] = r3
            r3 = r8
            goto L1002
        L10be:
            ak7[] r3 = r0.j
            int r6 = r0.e
            ak7 r4 = defpackage.ak7.U(r6, r5, r4)
            r27 = 0
            r3[r27] = r4
            r3 = r16[r27]
            int r3 = r3.f0
            r12 = -1
            if (r3 == r12) goto L110e
            int[] r3 = new int[r2]
            double[] r4 = new double[r2]
            r13 = 2
            int[] r5 = new int[r13]
            r28 = 1
            r5[r28] = r13
            r5[r27] = r2
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r5)
            double[][] r1 = (double[][]) r1
            r8 = 0
        L10e5:
            if (r8 >= r2) goto L1105
            r5 = r16[r8]
            int r6 = r5.f0
            r3[r8] = r6
            float r6 = r5.L
            double r6 = (double) r6
            r4[r8] = r6
            r6 = r1[r8]
            float r7 = r5.X
            double r10 = (double) r7
            r27 = 0
            r6[r27] = r10
            float r5 = r5.Y
            double r10 = (double) r5
            r28 = 1
            r6[r28] = r10
            int r8 = r8 + 1
            goto L10e5
        L1105:
            r27 = 0
            wt r2 = new wt
            r2.<init>(r3, r4, r1)
            r0.k = r2
        L110e:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.z = r1
            if (r9 == 0) goto L117e
            java.util.Iterator r1 = r40.iterator()
            r5 = r23
        L111d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1148
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            hp7 r3 = defpackage.hp7.b(r2)
            if (r3 != 0) goto L1130
            goto L111d
        L1130:
            int r4 = r3.e
            r13 = 1
            if (r4 != r13) goto L1140
            boolean r4 = java.lang.Float.isNaN(r5)
            if (r4 == 0) goto L1140
            float r4 = r0.c()
            r5 = r4
        L1140:
            r3.b = r2
            java.util.HashMap r4 = r0.z
            r4.put(r2, r3)
            goto L111d
        L1148:
            int r1 = r9.size()
            r14 = r27
        L114e:
            if (r14 >= r1) goto L1164
            java.lang.Object r2 = r9.get(r14)
            int r14 = r14 + 1
            jg3 r2 = (defpackage.jg3) r2
            boolean r3 = r2 instanceof defpackage.qg3
            if (r3 == 0) goto L114e
            qg3 r2 = (defpackage.qg3) r2
            java.util.HashMap r3 = r0.z
            r2.g(r3)
            goto L114e
        L1164:
            java.util.HashMap r0 = r0.z
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L116e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L117e
            java.lang.Object r1 = r0.next()
            hp7 r1 = (defpackage.hp7) r1
            r1.e()
            goto L116e
        L117e:
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " start: x: "
            r0.<init>(r1)
            y74 r1 = r3.f
            float r2 = r1.X
            r0.append(r2)
            java.lang.String r2 = " y: "
            r0.append(r2)
            float r1 = r1.Y
            r0.append(r1)
            java.lang.String r1 = " end: x: "
            r0.append(r1)
            y74 r3 = r3.g
            float r1 = r3.X
            r0.append(r1)
            r0.append(r2)
            float r3 = r3.Y
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}

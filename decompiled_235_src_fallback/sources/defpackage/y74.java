package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y74  reason: default package */
/* loaded from: classes.dex */
public final class y74 implements java.lang.Comparable {
    public static final java.lang.String[] n0 = null;
    public defpackage.gr1 A;
    public int B;
    public float L;
    public float R;
    public float X;
    public float Y;
    public float Z;
    public float d0;
    public float e0;
    public int f0;
    public int g0;
    public float h0;
    public defpackage.m74 i0;
    public java.util.LinkedHashMap j0;
    public int k0;
    public double[] l0;
    public double[] m0;

    static {
            java.lang.String r4 = "height"
            java.lang.String r5 = "pathRotate"
            java.lang.String r0 = "position"
            java.lang.String r1 = "x"
            java.lang.String r2 = "y"
            java.lang.String r3 = "width"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            defpackage.y74.n0 = r0
            return
    }

    public y74() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.B = r0
            r1 = 2143289344(0x7fc00000, float:NaN)
            r3.e0 = r1
            r2 = -1
            r3.f0 = r2
            r3.g0 = r2
            r3.h0 = r1
            r1 = 0
            r3.i0 = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r3.j0 = r1
            r3.k0 = r0
            r0 = 18
            double[] r1 = new double[r0]
            r3.l0 = r1
            double[] r0 = new double[r0]
            r3.m0 = r0
            return
    }

    public static boolean b(float r1, float r2) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L1a
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 == 0) goto Ld
            goto L1a
        Ld:
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            r2 = 897988541(0x358637bd, float:1.0E-6)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L26
            goto L24
        L1a:
            boolean r1 = java.lang.Float.isNaN(r1)
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r1 == r2) goto L26
        L24:
            r1 = 1
            return r1
        L26:
            r1 = 0
            return r1
    }

    public static void e(float r11, float r12, float[] r13, int[] r14, double[] r15, double[] r16) {
            r0 = 0
            r1 = 0
            r3 = r0
            r4 = r3
            r5 = r4
            r6 = r5
            r2 = r1
        L7:
            int r7 = r14.length
            r8 = 1
            if (r2 >= r7) goto L28
            r9 = r15[r2]
            float r7 = (float) r9
            r9 = r16[r2]
            r9 = r14[r2]
            if (r9 == r8) goto L24
            r8 = 2
            if (r9 == r8) goto L22
            r8 = 3
            if (r9 == r8) goto L20
            r8 = 4
            if (r9 == r8) goto L1e
            goto L25
        L1e:
            r6 = r7
            goto L25
        L20:
            r4 = r7
            goto L25
        L22:
            r5 = r7
            goto L25
        L24:
            r3 = r7
        L25:
            int r2 = r2 + 1
            goto L7
        L28:
            float r14 = r0 * r4
            r2 = 1073741824(0x40000000, float:2.0)
            float r14 = r14 / r2
            float r3 = r3 - r14
            float r14 = r0 * r6
            float r14 = r14 / r2
            float r5 = r5 - r14
            r14 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r14
            float r6 = r6 * r14
            float r4 = r4 + r3
            float r6 = r6 + r5
            float r2 = r14 - r11
            float r2 = r2 * r3
            float r4 = r4 * r11
            float r4 = r4 + r2
            float r4 = r4 + r0
            r13[r1] = r4
            float r14 = r14 - r12
            float r14 = r14 * r5
            float r6 = r6 * r12
            float r6 = r6 + r14
            float r6 = r6 + r0
            r13[r8] = r6
            return
    }

    public final void a(defpackage.u11 r6) {
            r5 = this;
            w11 r0 = r6.d
            java.lang.String r0 = r0.d
            gr1 r0 = defpackage.gr1.c(r0)
            r5.A = r0
            w11 r0 = r6.d
            int r1 = r0.e
            r5.f0 = r1
            int r1 = r0.b
            r5.g0 = r1
            float r1 = r0.h
            r5.e0 = r1
            int r0 = r0.f
            r5.B = r0
            v11 r0 = r6.e
            float r0 = r0.C
            r5.h0 = r0
            java.util.HashMap r0 = r6.g
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap r2 = r6.g
            java.lang.Object r2 = r2.get(r1)
            j11 r2 = (defpackage.j11) r2
            if (r2 == 0) goto L2c
            i11 r3 = r2.c
            int r3 = r3.ordinal()
            r4 = 4
            if (r3 == r4) goto L2c
            r4 = 5
            if (r3 == r4) goto L2c
            r4 = 7
            if (r3 == r4) goto L2c
            java.util.LinkedHashMap r3 = r5.j0
            r3.put(r1, r2)
            goto L2c
        L57:
            return
    }

    public final void c(double r15, int[] r17, double[] r18, float[] r19, int r20) {
            r14 = this;
            r0 = r17
            float r1 = r14.X
            float r2 = r14.Y
            float r3 = r14.Z
            float r4 = r14.d0
            r5 = 0
            r6 = r5
        Lc:
            int r7 = r0.length
            r8 = 2
            r9 = 1
            if (r6 >= r7) goto L2b
            r10 = r18[r6]
            float r7 = (float) r10
            r10 = r0[r6]
            if (r10 == r9) goto L27
            if (r10 == r8) goto L25
            r8 = 3
            if (r10 == r8) goto L23
            r8 = 4
            if (r10 == r8) goto L21
            goto L28
        L21:
            r4 = r7
            goto L28
        L23:
            r3 = r7
            goto L28
        L25:
            r2 = r7
            goto L28
        L27:
            r1 = r7
        L28:
            int r6 = r6 + 1
            goto Lc
        L2b:
            m74 r14 = r14.i0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r14 == 0) goto L58
            float[] r6 = new float[r8]
            float[] r7 = new float[r8]
            r10 = r15
            r14.b(r10, r6, r7)
            r14 = r6[r5]
            r5 = r6[r9]
            double r6 = (double) r14
            double r10 = (double) r1
            double r1 = (double) r2
            double r12 = java.lang.Math.sin(r1)
            double r12 = r12 * r10
            double r12 = r12 + r6
            float r14 = r3 / r0
            double r6 = (double) r14
            double r12 = r12 - r6
            float r14 = (float) r12
            double r5 = (double) r5
            double r1 = java.lang.Math.cos(r1)
            double r1 = r1 * r10
            double r5 = r5 - r1
            float r1 = r4 / r0
            double r1 = (double) r1
            double r5 = r5 - r1
            float r2 = (float) r5
            r1 = r14
        L58:
            float r3 = r3 / r0
            float r3 = r3 + r1
            r14 = 0
            float r3 = r3 + r14
            r19[r20] = r3
            int r1 = r20 + 1
            float r4 = r4 / r0
            float r4 = r4 + r2
            float r4 = r4 + r14
            r19[r1] = r4
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r1) {
            r0 = this;
            y74 r1 = (defpackage.y74) r1
            float r0 = r0.R
            float r1 = r1.R
            int r0 = java.lang.Float.compare(r0, r1)
            return r0
    }

    public final void d(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.X = r1
            r0.Y = r2
            r0.Z = r3
            r0.d0 = r4
            return
    }

    public final void f(defpackage.m74 r6, defpackage.y74 r7) {
            r5 = this;
            float r0 = r5.X
            float r1 = r5.Z
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r1 = r1 + r0
            float r0 = r7.X
            float r1 = r1 - r0
            float r0 = r7.Z
            float r0 = r0 / r2
            float r1 = r1 - r0
            double r0 = (double) r1
            float r3 = r5.Y
            float r4 = r5.d0
            float r4 = r4 / r2
            float r4 = r4 + r3
            float r3 = r7.Y
            float r4 = r4 - r3
            float r7 = r7.d0
            float r7 = r7 / r2
            float r4 = r4 - r7
            double r2 = (double) r4
            r5.i0 = r6
            double r6 = java.lang.Math.hypot(r2, r0)
            float r6 = (float) r6
            r5.X = r6
            float r6 = r5.h0
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 == 0) goto L3d
            double r6 = java.lang.Math.atan2(r2, r0)
            r0 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r6 = r6 + r0
            float r6 = (float) r6
            r5.Y = r6
            return
        L3d:
            float r6 = r5.h0
            double r6 = (double) r6
            double r6 = java.lang.Math.toRadians(r6)
            float r6 = (float) r6
            r5.Y = r6
            return
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xt  reason: default package */
/* loaded from: classes.dex */
public final class xt {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public float h;
    public float i;
    public final float[] j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final boolean p;
    public final float q;
    public final float r;

    public xt(int r18, float r19, float r20, float r21, float r22, float r23, float r24) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r0.<init>()
            r0.a = r2
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.e = r6
            r0.f = r7
            float r8 = r6 - r4
            float r9 = r7 - r5
            r10 = 0
            r12 = 1
            if (r1 == r12) goto L33
            r13 = 4
            if (r1 == r13) goto L35
            r13 = 5
            if (r1 == r13) goto L2f
        L2d:
            r13 = 0
            goto L3a
        L2f:
            int r13 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r13 >= 0) goto L2d
        L33:
            r13 = r12
            goto L3a
        L35:
            int r13 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r13 <= 0) goto L2d
            goto L33
        L3a:
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L41
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L42
        L41:
            r15 = r14
        L42:
            r0.m = r15
            float r2 = r3 - r2
            float r14 = r14 / r2
            r0.k = r14
            r2 = 101(0x65, float:1.42E-43)
            float[] r2 = new float[r2]
            r0.j = r2
            r3 = 3
            if (r1 != r3) goto L54
            r1 = r12
            goto L55
        L54:
            r1 = 0
        L55:
            if (r1 != 0) goto L6a
            float r3 = java.lang.Math.abs(r8)
            r16 = 981668463(0x3a83126f, float:0.001)
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 < 0) goto L6a
            float r3 = java.lang.Math.abs(r9)
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 >= 0) goto L6d
        L6a:
            r15 = r12
            goto L10e
        L6d:
            float r8 = r8 * r15
            r0.n = r8
            float r3 = -r15
            float r9 = r9 * r3
            r0.o = r9
            if (r13 == 0) goto L78
            r3 = r6
            goto L79
        L78:
            r3 = r4
        L79:
            r0.q = r3
            if (r13 == 0) goto L7f
            r3 = r5
            goto L80
        L7f:
            r3 = r7
        L80:
            r0.r = r3
            float r3 = r6 - r4
            float r4 = r5 - r7
            float[] r5 = defpackage.n16.a
            r9 = r4
            r7 = r10
            r8 = r7
            r6 = r12
        L8c:
            double r13 = (double) r6
            r15 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r13 = r13 * r15
            double r13 = r13 / r15
            r15 = 4580687790476533049(0x3f91df46a2529d39, double:0.017453292519943295)
            double r13 = r13 * r15
            float r13 = (float) r13
            double r13 = (double) r13
            r15 = r12
            r18 = r13
            double r12 = java.lang.Math.sin(r18)
            float r12 = (float) r12
            double r13 = java.lang.Math.cos(r18)
            float r13 = (float) r13
            float r12 = r12 * r3
            float r13 = r13 * r4
            float r8 = r12 - r8
            r16 = r10
            double r10 = (double) r8
            float r8 = r13 - r9
            double r8 = (double) r8
            double r8 = java.lang.Math.hypot(r10, r8)
            float r8 = (float) r8
            float r7 = r7 + r8
            r5[r6] = r7
            r8 = 90
            if (r6 == r8) goto Lc7
            int r6 = r6 + 1
            r8 = r12
            r9 = r13
            r12 = r15
            r10 = r16
            goto L8c
        Lc7:
            r0.g = r7
            r3 = r15
        Lca:
            r4 = r5[r3]
            float r4 = r4 / r7
            r5[r3] = r4
            if (r3 == r8) goto Ld4
            int r3 = r3 + 1
            goto Lca
        Ld4:
            int r3 = r2.length
            r4 = 0
        Ld6:
            if (r4 >= r3) goto L105
            float r6 = (float) r4
            r7 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r7
            r7 = 91
            r8 = 0
            int r7 = java.util.Arrays.binarySearch(r5, r8, r7, r6)
            r9 = 1119092736(0x42b40000, float:90.0)
            if (r7 < 0) goto Lec
            float r6 = (float) r7
            float r6 = r6 / r9
            r2[r4] = r6
            goto L102
        Lec:
            r10 = -1
            if (r7 != r10) goto Lf2
            r2[r4] = r16
            goto L102
        Lf2:
            int r7 = -r7
            int r10 = r7 + (-2)
            int r7 = r7 - r15
            float r11 = (float) r10
            r10 = r5[r10]
            float r6 = r6 - r10
            r7 = r5[r7]
            float r7 = r7 - r10
            float r6 = r6 / r7
            float r6 = r6 + r11
            float r6 = r6 / r9
            r2[r4] = r6
        L102:
            int r4 = r4 + 1
            goto Ld6
        L105:
            float r2 = r0.g
            float r3 = r0.k
            float r2 = r2 * r3
            r0.l = r2
            r12 = r1
            goto L127
        L10e:
            double r1 = (double) r9
            double r3 = (double) r8
            double r1 = java.lang.Math.hypot(r1, r3)
            float r1 = (float) r1
            r0.g = r1
            float r1 = r1 * r14
            r0.l = r1
            float r8 = r8 * r14
            r0.q = r8
            float r9 = r9 * r14
            r0.r = r9
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0.n = r1
            r0.o = r1
            r12 = r15
        L127:
            r0.p = r12
            return
    }

    public final float a() {
            r6 = this;
            float r0 = r6.n
            float r1 = r6.i
            float r0 = r0 * r1
            float r1 = r6.o
            float r1 = -r1
            float r2 = r6.h
            float r1 = r1 * r2
            double r2 = (double) r0
            double r4 = (double) r1
            double r1 = java.lang.Math.hypot(r2, r4)
            float r1 = (float) r1
            float r2 = r6.l
            float r2 = r2 / r1
            float r6 = r6.m
            float r0 = r0 * r6
            float r0 = r0 * r2
            return r0
    }

    public final float b() {
            r6 = this;
            float r0 = r6.n
            float r1 = r6.i
            float r0 = r0 * r1
            float r1 = r6.o
            float r1 = -r1
            float r2 = r6.h
            float r1 = r1 * r2
            double r2 = (double) r0
            double r4 = (double) r1
            double r2 = java.lang.Math.hypot(r2, r4)
            float r0 = (float) r2
            float r2 = r6.l
            float r2 = r2 / r0
            float r6 = r6.m
            float r1 = r1 * r6
            float r1 = r1 * r2
            return r1
    }

    public final void c(float r5) {
            r4 = this;
            float r0 = r4.m
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lc
            float r0 = r4.b
            float r0 = r0 - r5
            goto L10
        Lc:
            float r0 = r4.a
            float r0 = r5 - r0
        L10:
            float r5 = r4.k
            float r0 = r0 * r5
            r5 = 0
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 > 0) goto L19
            goto L32
        L19:
            r5 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 < 0) goto L20
            goto L32
        L20:
            r5 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r5
            int r5 = (int) r0
            float r1 = (float) r5
            float r0 = r0 - r1
            float[] r1 = r4.j
            r2 = r1[r5]
            int r5 = r5 + 1
            r5 = r1[r5]
            float r5 = defpackage.i61.a(r5, r2, r0, r2)
        L32:
            r0 = 1070141403(0x3fc90fdb, float:1.5707964)
            float r5 = r5 * r0
            double r0 = (double) r5
            double r2 = java.lang.Math.sin(r0)
            float r5 = (float) r2
            r4.h = r5
            double r0 = java.lang.Math.cos(r0)
            float r5 = (float) r0
            r4.i = r5
            return
    }
}

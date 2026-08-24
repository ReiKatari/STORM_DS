package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zq6  reason: default package */
/* loaded from: classes.dex */
public final class zq6 implements defpackage.xq6 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public boolean k;
    public float l;
    public float m;
    public float n;

    @Override // defpackage.xq6
    public final boolean a() {
            r2 = this;
            float r0 = r2.b()
            r1 = 925353388(0x3727c5ac, float:1.0E-5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1a
            float r0 = r2.i
            float r2 = r2.m
            float r0 = r0 - r2
            float r2 = java.lang.Math.abs(r0)
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 >= 0) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @Override // defpackage.xq6
    public final float b() {
            r2 = this;
            boolean r0 = r2.k
            float r1 = r2.n
            float r2 = r2.c(r1)
            if (r0 == 0) goto Lb
            float r2 = -r2
        Lb:
            return r2
    }

    public final float c(float r4) {
            r3 = this;
            float r0 = r3.d
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 > 0) goto Lf
            float r1 = r3.a
            float r3 = r3.b
            float r3 = r3 - r1
            float r3 = r3 * r4
            float r3 = r3 / r0
            float r3 = r3 + r1
            return r3
        Lf:
            int r1 = r3.j
            r2 = 1
            if (r1 != r2) goto L15
            goto L36
        L15:
            float r4 = r4 - r0
            float r0 = r3.e
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L25
            float r1 = r3.b
            float r3 = r3.c
            float r3 = r3 - r1
            float r3 = r3 * r4
            float r3 = r3 / r0
            float r3 = r3 + r1
            return r3
        L25:
            r2 = 2
            if (r1 != r2) goto L29
            goto L36
        L29:
            float r4 = r4 - r0
            float r0 = r3.f
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 >= 0) goto L36
            float r3 = r3.c
            float r4 = r4 * r3
            float r4 = r4 / r0
            float r3 = r3 - r4
            return r3
        L36:
            r3 = 0
            return r3
    }

    public final void d(float r9, float r10, float r11, float r12, float r13) {
            r8 = this;
            r8.i = r10
            r0 = 0
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 != 0) goto La
            r9 = 953267991(0x38d1b717, float:1.0E-4)
        La:
            float r1 = r9 / r11
            float r2 = r1 * r9
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r5 = 3
            r6 = 2
            if (r4 >= 0) goto L68
            float r13 = -r9
            float r13 = r13 / r11
            float r13 = r13 * r9
            float r13 = r13 / r3
            float r13 = r10 - r13
            float r13 = r13 * r11
            double r1 = (double) r13
            double r1 = java.lang.Math.sqrt(r1)
            float r13 = (float) r1
            int r1 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r1 >= 0) goto L43
            r8.j = r6
            r8.a = r9
            r8.b = r13
            r8.c = r0
            float r12 = r13 - r9
            float r12 = r12 / r11
            r8.d = r12
            float r11 = r13 / r11
            r8.e = r11
            float r9 = r9 + r13
            float r9 = r9 * r12
            float r9 = r9 / r3
            r8.g = r9
            r8.h = r10
            r8.i = r10
            return
        L43:
            r8.j = r5
            r8.a = r9
            r8.b = r12
            r8.c = r12
            float r13 = r12 - r9
            float r13 = r13 / r11
            r8.d = r13
            float r11 = r12 / r11
            r8.f = r11
            float r9 = r9 + r12
            float r9 = r9 * r13
            float r9 = r9 / r3
            float r11 = r11 * r12
            float r11 = r11 / r3
            float r13 = r10 - r9
            float r13 = r13 - r11
            float r13 = r13 / r12
            r8.e = r13
            r8.g = r9
            float r9 = r10 - r11
            r8.h = r9
            r8.i = r10
            return
        L68:
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 < 0) goto L7a
            float r3 = r3 * r10
            float r3 = r3 / r9
            r11 = 1
            r8.j = r11
            r8.a = r9
            r8.b = r0
            r8.g = r10
            r8.d = r3
            return
        L7a:
            float r2 = r10 - r2
            float r4 = r2 / r9
            float r7 = r4 + r1
            int r13 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r13 >= 0) goto L95
            r8.j = r6
            r8.a = r9
            r8.b = r9
            r8.c = r0
            r8.g = r2
            r8.h = r10
            r8.d = r4
            r8.e = r1
            return
        L95:
            float r13 = r11 * r10
            float r1 = r9 * r9
            float r1 = r1 / r3
            float r1 = r1 + r13
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            float r13 = (float) r1
            float r1 = r13 - r9
            float r1 = r1 / r11
            r8.d = r1
            float r2 = r13 / r11
            r8.e = r2
            int r4 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r4 >= 0) goto Lc2
            r8.j = r6
            r8.a = r9
            r8.b = r13
            r8.c = r0
            r8.d = r1
            r8.e = r2
            float r9 = r9 + r13
            float r9 = r9 * r1
            float r9 = r9 / r3
            r8.g = r9
            r8.h = r10
            return
        Lc2:
            r8.j = r5
            r8.a = r9
            r8.b = r12
            r8.c = r12
            float r13 = r12 - r9
            float r13 = r13 / r11
            r8.d = r13
            float r11 = r12 / r11
            r8.f = r11
            float r9 = r9 + r12
            float r9 = r9 * r13
            float r9 = r9 / r3
            float r11 = r11 * r12
            float r11 = r11 / r3
            float r13 = r10 - r9
            float r13 = r13 - r11
            float r13 = r13 / r12
            r8.e = r13
            r8.g = r9
            float r9 = r10 - r11
            r8.h = r9
            r8.i = r10
            return
    }

    @Override // defpackage.xq6
    public final float getInterpolation(float r7) {
            r6 = this;
            float r0 = r6.d
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 > 0) goto L15
            float r1 = r6.a
            float r3 = r1 * r7
            float r4 = r6.b
            float r4 = r4 - r1
            float r4 = r4 * r7
            float r4 = r4 * r7
            float r0 = r0 * r2
            float r4 = r4 / r0
            float r4 = r4 + r3
            goto L51
        L15:
            int r1 = r6.j
            r3 = 1
            if (r1 != r3) goto L1d
            float r4 = r6.g
            goto L51
        L1d:
            float r0 = r7 - r0
            float r3 = r6.e
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 >= 0) goto L36
            float r1 = r6.g
            float r4 = r6.b
            float r5 = r4 * r0
            float r5 = r5 + r1
            float r1 = r6.c
            float r1 = r1 - r4
            float r1 = r1 * r0
            float r1 = r1 * r0
            float r3 = r3 * r2
            float r1 = r1 / r3
            float r4 = r1 + r5
            goto L51
        L36:
            r4 = 2
            if (r1 != r4) goto L3c
            float r4 = r6.h
            goto L51
        L3c:
            float r0 = r0 - r3
            float r1 = r6.f
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 > 0) goto L4f
            float r3 = r6.h
            float r4 = r6.c
            float r4 = r4 * r0
            float r3 = r3 + r4
            float r4 = r4 * r0
            float r1 = r1 * r2
            float r4 = r4 / r1
            float r4 = r3 - r4
            goto L51
        L4f:
            float r4 = r6.i
        L51:
            r6.m = r4
            r6.n = r7
            boolean r7 = r6.k
            float r6 = r6.l
            if (r7 == 0) goto L5d
            float r6 = r6 - r4
            return r6
        L5d:
            float r6 = r6 + r4
            return r6
    }
}

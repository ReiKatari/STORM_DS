package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jo6  reason: default package */
/* loaded from: classes.dex */
public final class jo6 implements defpackage.xq6 {
    public double a;
    public double b;
    public double c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;

    @Override // defpackage.xq6
    public final boolean a() {
            r8 = this;
            float r0 = r8.e
            double r0 = (double) r0
            double r2 = r8.c
            double r0 = r0 - r2
            double r2 = r8.b
            float r4 = r8.f
            double r4 = (double) r4
            float r6 = r8.g
            double r6 = (double) r6
            double r4 = r4 * r4
            double r4 = r4 * r6
            double r6 = r2 * r0
            double r6 = r6 * r0
            double r6 = r6 + r4
            double r6 = r6 / r2
            double r0 = java.lang.Math.sqrt(r6)
            float r8 = r8.h
            double r2 = (double) r8
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 > 0) goto L22
            r8 = 1
            return r8
        L22:
            r8 = 0
            return r8
    }

    @Override // defpackage.xq6
    public final float b() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.xq6
    public final float getInterpolation(float r28) {
            r27 = this;
            r0 = r27
            r1 = r28
            float r2 = r0.d
            float r2 = r1 - r2
            double r2 = (double) r2
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L11
            goto La0
        L11:
            double r4 = r0.b
            double r6 = r0.a
            float r8 = r0.g
            double r8 = (double) r8
            double r8 = r4 / r8
            double r8 = java.lang.Math.sqrt(r8)
            double r8 = r8 * r2
            r10 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r8 = r8 * r10
            r10 = 4621256167635550208(0x4022000000000000, double:9.0)
            double r10 = r10 / r8
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 + r8
            int r8 = (int) r10
            double r9 = (double) r8
            double r2 = r2 / r9
            r9 = 0
        L2c:
            if (r9 >= r8) goto La0
            float r10 = r0.e
            double r11 = (double) r10
            double r13 = r0.c
            double r15 = r11 - r13
            r17 = r2
            double r2 = -r4
            double r2 = r2 * r15
            float r15 = r0.f
            r19 = r2
            double r2 = (double) r15
            double r21 = r6 * r2
            double r19 = r19 - r21
            r21 = r2
            float r2 = r0.g
            double r2 = (double) r2
            double r19 = r19 / r2
            double r19 = r19 * r17
            r23 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r19 = r19 / r23
            double r19 = r19 + r21
            double r25 = r17 * r19
            double r25 = r25 / r23
            double r25 = r25 + r11
            double r11 = r25 - r13
            double r11 = -r11
            double r11 = r11 * r4
            double r19 = r19 * r6
            double r11 = r11 - r19
            double r11 = r11 / r2
            double r11 = r11 * r17
            double r2 = r11 / r23
            double r2 = r2 + r21
            float r11 = (float) r11
            float r15 = r15 + r11
            r0.f = r15
            double r2 = r2 * r17
            float r2 = (float) r2
            float r10 = r10 + r2
            r0.e = r10
            int r2 = r0.i
            if (r2 <= 0) goto L9b
            r3 = 0
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 >= 0) goto L84
            r3 = r2 & 1
            r11 = 1
            if (r3 != r11) goto L84
            float r3 = -r10
            r0.e = r3
            float r3 = -r15
            r0.f = r3
        L84:
            float r3 = r0.e
            r10 = 1065353216(0x3f800000, float:1.0)
            int r10 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r10 <= 0) goto L9b
            r2 = r2 & 2
            r10 = 2
            if (r2 != r10) goto L9b
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 - r3
            r0.e = r2
            float r2 = r0.f
            float r2 = -r2
            r0.f = r2
        L9b:
            int r9 = r9 + 1
            r2 = r17
            goto L2c
        La0:
            r0.d = r1
            boolean r1 = r0.a()
            if (r1 == 0) goto Lad
            double r1 = r0.c
            float r1 = (float) r1
            r0.e = r1
        Lad:
            float r0 = r0.e
            return r0
    }
}

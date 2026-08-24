package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rl7  reason: default package */
/* loaded from: classes.dex */
public final class rl7 {
    public final boolean a;
    public final defpackage.pl7 b;
    public final int c;
    public final defpackage.yb1[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public rl7() {
            r2 = this;
            r0 = 1
            pl7 r1 = defpackage.pl7.Impulse
            r2.<init>(r0, r1)
            return
    }

    public rl7(boolean r3, defpackage.pl7 r4) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            r2.b = r4
            if (r3 == 0) goto L19
            pl7 r3 = defpackage.pl7.Lsq2
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L12
            goto L19
        L12:
            java.lang.String r2 = "Lsq2 not (yet) supported for differential axes"
            defpackage.i.m(r2)
            r2 = 0
            throw r2
        L19:
            int[] r3 = defpackage.ql7.a
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 1
            r0 = 3
            r1 = 2
            if (r3 == r4) goto L2f
            if (r3 != r1) goto L2a
            r1 = r0
            goto L2f
        L2a:
            defpackage.i.d()
            r2 = 0
            throw r2
        L2f:
            r2.c = r1
            r3 = 20
            yb1[] r4 = new defpackage.yb1[r3]
            r2.d = r4
            float[] r4 = new float[r3]
            r2.f = r4
            float[] r3 = new float[r3]
            r2.g = r3
            float[] r3 = new float[r0]
            r2.h = r3
            return
    }

    public final void a(float r3, long r4) {
            r2 = this;
            int r0 = r2.e
            int r0 = r0 + 1
            int r0 = r0 % 20
            r2.e = r0
            yb1[] r2 = r2.d
            r1 = r2[r0]
            if (r1 != 0) goto L1a
            yb1 r1 = new yb1
            r1.<init>()
            r1.a = r4
            r1.b = r3
            r2[r0] = r1
            return
        L1a:
            r1.a = r4
            r1.b = r3
            return
    }

    public final float b(float r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto La
            goto L1b
        La:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "maximumVelocity should be a positive value. You specified="
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            defpackage.p53.c(r3)
        L1b:
            int r3 = r0.e
            yb1[] r4 = r0.d
            r5 = r4[r3]
            if (r5 != 0) goto L28
            r0 = r2
            r16 = r0
            goto Lf8
        L28:
            r6 = 0
            r7 = r5
        L2a:
            r8 = r4[r3]
            boolean r10 = r0.a
            pl7 r11 = r0.b
            float[] r12 = r0.f
            float[] r13 = r0.g
            if (r8 != 0) goto L3c
            r16 = r2
            r18 = r10
            r15 = 1
            goto L80
        L3c:
            long r14 = r5.a
            r16 = r2
            r17 = r3
            long r2 = r8.a
            long r14 = r14 - r2
            float r14 = (float) r14
            r18 = r10
            r15 = 1
            long r9 = r7.a
            long r2 = r2 - r9
            long r2 = java.lang.Math.abs(r2)
            float r2 = (float) r2
            pl7 r3 = defpackage.pl7.Lsq2
            if (r11 == r3) goto L5a
            if (r18 == 0) goto L58
            goto L5a
        L58:
            r7 = r5
            goto L5b
        L5a:
            r7 = r8
        L5b:
            r3 = 1120403456(0x42c80000, float:100.0)
            int r3 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r3 > 0) goto L80
            r3 = 1109393408(0x42200000, float:40.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L68
            goto L80
        L68:
            float r2 = r8.b
            r12[r6] = r2
            float r2 = -r14
            r13[r6] = r2
            r2 = 20
            if (r17 != 0) goto L75
            r3 = r2
            goto L77
        L75:
            r3 = r17
        L77:
            int r3 = r3 - r15
            int r6 = r6 + 1
            if (r6 < r2) goto L7d
            goto L80
        L7d:
            r2 = r16
            goto L2a
        L80:
            int r2 = r0.c
            if (r6 < r2) goto Lf6
            int[] r2 = defpackage.ql7.a
            int r3 = r11.ordinal()
            r2 = r2[r3]
            if (r2 == r15) goto La0
            r3 = 2
            if (r2 != r3) goto L9c
            float[] r0 = r0.h     // Catch: java.lang.IllegalArgumentException -> L99
            defpackage.mp2.R(r13, r12, r6, r0)     // Catch: java.lang.IllegalArgumentException -> L99
            r0 = r0[r15]     // Catch: java.lang.IllegalArgumentException -> L99
            goto Lf2
        L99:
            r0 = r16
            goto Lf2
        L9c:
            defpackage.i.d()
            return r16
        La0:
            int r6 = r6 - r15
            r0 = r13[r6]
            r2 = r6
            r3 = r16
        La6:
            r4 = 1073741824(0x40000000, float:2.0)
            if (r2 <= 0) goto Le2
            int r5 = r2 + (-1)
            r7 = r13[r5]
            int r8 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r8 != 0) goto Lb3
            goto Lde
        Lb3:
            if (r18 == 0) goto Lb9
            r5 = r12[r5]
            float r5 = -r5
            goto Lbf
        Lb9:
            r8 = r12[r2]
            r5 = r12[r5]
            float r5 = r8 - r5
        Lbf:
            float r0 = r0 - r7
            float r5 = r5 / r0
            float r0 = java.lang.Math.signum(r3)
            float r8 = java.lang.Math.abs(r3)
            float r8 = r8 * r4
            double r8 = (double) r8
            double r8 = java.lang.Math.sqrt(r8)
            float r4 = (float) r8
            float r0 = r0 * r4
            float r0 = r5 - r0
            float r4 = java.lang.Math.abs(r5)
            float r4 = r4 * r0
            float r3 = r3 + r4
            if (r2 != r6) goto Lde
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r0
        Lde:
            int r2 = r2 + (-1)
            r0 = r7
            goto La6
        Le2:
            float r0 = java.lang.Math.signum(r3)
            float r2 = java.lang.Math.abs(r3)
            float r2 = r2 * r4
            double r2 = (double) r2
            double r2 = java.lang.Math.sqrt(r2)
            float r2 = (float) r2
            float r0 = r0 * r2
        Lf2:
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 * r2
            goto Lf8
        Lf6:
            r0 = r16
        Lf8:
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto Lfd
            goto L103
        Lfd:
            boolean r2 = java.lang.Float.isNaN(r0)
            if (r2 == 0) goto L106
        L103:
            r2 = r16
            goto L117
        L106:
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 <= 0) goto L111
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L10f
            r0 = r1
        L10f:
            r2 = r0
            goto L117
        L111:
            float r1 = -r1
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L10f
            r2 = r1
        L117:
            return r2
    }
}

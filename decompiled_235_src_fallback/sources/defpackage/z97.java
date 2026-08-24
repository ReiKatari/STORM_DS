package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z97  reason: default package */
/* loaded from: classes.dex */
public final class z97 extends defpackage.la7 {
    public long a;
    public boolean b;
    public boolean c;
    public int d;
    public defpackage.fo6 e;
    public final defpackage.ei f;
    public java.lang.Runnable g;
    public final /* synthetic */ defpackage.qa7 h;

    public z97(defpackage.qa7 r6) {
            r5 = this;
            r5.<init>()
            r5.h = r6
            r0 = -1
            r5.a = r0
            r6 = 0
            r5.d = r6
            ei r0 = new ei
            r1 = 10
            r0.<init>(r1)
            r1 = 20
            long[] r2 = new long[r1]
            r0.L = r2
            float[] r1 = new float[r1]
            r0.R = r1
            r0.B = r6
            r3 = -9223372036854775808
            java.util.Arrays.fill(r2, r3)
            r5.f = r0
            return
    }

    @Override // defpackage.la7, defpackage.da7
    public final void f(defpackage.ea7 r1) {
            r0 = this;
            r1 = 1
            r0.c = r1
            return
    }

    public final void g() {
            r5 = this;
            boolean r0 = r5.b
            if (r0 != 0) goto Lb
            r0 = 1
            r5.d = r0
            r0 = 0
            r5.g = r0
            return
        Lb:
            r5.h()
            fo6 r0 = r5.e
            qa7 r5 = r5.h
            long r1 = r5.t0
            r3 = 1
            long r1 = r1 + r3
            float r5 = (float) r1
            r0.a(r5)
            return
    }

    public final void h() {
            r21 = this;
            r0 = r21
            fo6 r1 = r0.e
            if (r1 == 0) goto L8
            goto L15e
        L8:
            long r1 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r3 = r0.a
            float r3 = (float) r3
            ei r4 = r0.f
            int r5 = r4.B
            java.lang.Object r6 = r4.R
            float[] r6 = (float[]) r6
            java.lang.Object r7 = r4.L
            long[] r7 = (long[]) r7
            r8 = 1
            int r5 = r5 + r8
            r9 = 20
            int r5 = r5 % r9
            r4.B = r5
            r7[r5] = r1
            r6[r5] = r3
            fo6 r1 = new fo6
            fe2 r2 = new fe2
            r2.<init>()
            r3 = 0
            r2.a = r3
            r1.<init>(r2)
            r0.e = r1
            go6 r1 = new go6
            r1.<init>()
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.a(r2)
            r2 = 1128792064(0x43480000, float:200.0)
            r1.b(r2)
            fo6 r2 = r0.e
            r2.m = r1
            long r10 = r0.a
            float r1 = (float) r10
            r2.b = r1
            r2.c = r8
            java.util.ArrayList r1 = r2.l
            boolean r2 = r2.f
            if (r2 != 0) goto L15f
            boolean r2 = r1.contains(r0)
            if (r2 != 0) goto L5e
            r1.add(r0)
        L5e:
            fo6 r1 = r0.e
            int r2 = r4.B
            r10 = -9223372036854775808
            if (r2 != 0) goto L6e
            r12 = r7[r2]
            int r5 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r5 != 0) goto L6e
            goto L138
        L6e:
            r12 = r7[r2]
            r5 = 0
            r14 = r12
        L72:
            r16 = r7[r2]
            int r18 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r18 != 0) goto L79
            goto L9e
        L79:
            long r10 = r12 - r16
            float r10 = (float) r10
            long r14 = r16 - r14
            long r14 = java.lang.Math.abs(r14)
            float r11 = (float) r14
            r14 = 1120403456(0x42c80000, float:100.0)
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r10 > 0) goto L9e
            r10 = 1109393408(0x42200000, float:40.0)
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 <= 0) goto L90
            goto L9e
        L90:
            if (r2 != 0) goto L93
            r2 = r9
        L93:
            int r2 = r2 - r8
            int r5 = r5 + 1
            if (r5 < r9) goto L99
            goto L9e
        L99:
            r14 = r16
            r10 = -9223372036854775808
            goto L72
        L9e:
            r2 = 2
            if (r5 >= r2) goto La3
            goto L138
        La3:
            int r4 = r4.B
            r10 = 1148846080(0x447a0000, float:1000.0)
            if (r5 != r2) goto Lc5
            if (r4 != 0) goto Lae
            r2 = 19
            goto Lb0
        Lae:
            int r2 = r4 + (-1)
        Lb0:
            r8 = r7[r4]
            r11 = r7[r2]
            long r8 = r8 - r11
            float r5 = (float) r8
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto Lbc
            goto L138
        Lbc:
            r3 = r6[r4]
            r2 = r6[r2]
            float r3 = r3 - r2
            float r3 = r3 / r5
            float r3 = r3 * r10
            goto L138
        Lc5:
            int r2 = r4 - r5
            int r2 = r2 + 21
            int r2 = r2 % r9
            int r4 = r4 + 21
            int r4 = r4 % r9
            r11 = r7[r2]
            r5 = r6[r2]
            int r2 = r2 + r8
            int r8 = r2 % 20
            r13 = r3
        Ld5:
            r14 = 1073741824(0x40000000, float:2.0)
            if (r8 == r4) goto L123
            r15 = r7[r8]
            r17 = r3
            r18 = r4
            long r3 = r15 - r11
            float r3 = (float) r3
            int r4 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r4 != 0) goto Leb
            r19 = r9
            r20 = r10
            goto L116
        Leb:
            r4 = r6[r8]
            float r11 = java.lang.Math.signum(r13)
            double r11 = (double) r11
            float r19 = java.lang.Math.abs(r13)
            float r14 = r14 * r19
            r19 = r9
            r20 = r10
            double r9 = (double) r14
            double r9 = java.lang.Math.sqrt(r9)
            double r9 = r9 * r11
            float r9 = (float) r9
            float r5 = r4 - r5
            float r5 = r5 / r3
            float r3 = r5 - r9
            float r5 = java.lang.Math.abs(r5)
            float r5 = r5 * r3
            float r5 = r5 + r13
            if (r8 != r2) goto L113
            r3 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r3
        L113:
            r13 = r5
            r5 = r4
            r11 = r15
        L116:
            int r8 = r8 + 1
            int r8 = r8 % 20
            r3 = r17
            r4 = r18
            r9 = r19
            r10 = r20
            goto Ld5
        L123:
            r20 = r10
            float r2 = java.lang.Math.signum(r13)
            double r2 = (double) r2
            float r4 = java.lang.Math.abs(r13)
            float r4 = r4 * r14
            double r4 = (double) r4
            double r4 = java.lang.Math.sqrt(r4)
            double r4 = r4 * r2
            float r2 = (float) r4
            float r3 = r2 * r20
        L138:
            r1.a = r3
            fo6 r1 = r0.e
            qa7 r2 = r0.h
            long r2 = r2.t0
            r4 = 1
            long r2 = r2 + r4
            float r2 = (float) r2
            r1.g = r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.h = r2
            r2 = 1082130432(0x40800000, float:4.0)
            r1.j = r2
            y97 r2 = new y97
            r2.<init>(r0)
            java.util.ArrayList r0 = r1.k
            boolean r1 = r0.contains(r2)
            if (r1 != 0) goto L15e
            r0.add(r2)
        L15e:
            return
        L15f:
            java.lang.String r0 = "Error: Update listeners must be added beforethe animation."
            defpackage.fa6.h(r0)
            return
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ct7  reason: default package */
/* loaded from: classes.dex */
public abstract class ct7 implements defpackage.xh1 {
    public int a;
    public defpackage.l21 b;
    public defpackage.s26 c;
    public defpackage.k21 d;
    public final defpackage.rj1 e;
    public int f;
    public boolean g;
    public final defpackage.ci1 h;
    public final defpackage.ci1 i;
    public defpackage.bt7 j;

    public ct7(defpackage.l21 r2) {
            r1 = this;
            r1.<init>()
            rj1 r0 = new rj1
            r0.<init>(r1)
            r1.e = r0
            r0 = 0
            r1.f = r0
            r1.g = r0
            ci1 r0 = new ci1
            r0.<init>(r1)
            r1.h = r0
            ci1 r0 = new ci1
            r0.<init>(r1)
            r1.i = r0
            bt7 r0 = defpackage.bt7.NONE
            r1.j = r0
            r1.b = r2
            return
    }

    public static void b(defpackage.ci1 r1, defpackage.ci1 r2, int r3) {
            java.util.ArrayList r0 = r1.l
            r0.add(r2)
            r1.f = r3
            java.util.ArrayList r2 = r2.k
            r2.add(r1)
            return
    }

    public static defpackage.ci1 h(defpackage.h11 r2) {
            h11 r2 = r2.f
            if (r2 != 0) goto L5
            goto L20
        L5:
            l21 r0 = r2.d
            g11 r2 = r2.e
            int[] r1 = defpackage.at7.a
            int r2 = r2.ordinal()
            r2 = r1[r2]
            r1 = 1
            if (r2 == r1) goto L36
            r1 = 2
            if (r2 == r1) goto L31
            r1 = 3
            if (r2 == r1) goto L2c
            r1 = 4
            if (r2 == r1) goto L27
            r1 = 5
            if (r2 == r1) goto L22
        L20:
            r2 = 0
            return r2
        L22:
            lm7 r2 = r0.e
            ci1 r2 = r2.i
            return r2
        L27:
            lm7 r2 = r0.e
            ci1 r2 = r2.k
            return r2
        L2c:
            lm7 r2 = r0.e
            ci1 r2 = r2.h
            return r2
        L31:
            ly2 r2 = r0.d
            ci1 r2 = r2.i
            return r2
        L36:
            ly2 r2 = r0.d
            ci1 r2 = r2.h
            return r2
    }

    public static defpackage.ci1 i(defpackage.h11 r1, int r2) {
            h11 r1 = r1.f
            if (r1 != 0) goto L5
            goto L24
        L5:
            l21 r0 = r1.d
            if (r2 != 0) goto Lc
            ly2 r2 = r0.d
            goto Le
        Lc:
            lm7 r2 = r0.e
        Le:
            g11 r1 = r1.e
            int[] r0 = defpackage.at7.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L29
            r0 = 2
            if (r1 == r0) goto L26
            r0 = 3
            if (r1 == r0) goto L29
            r0 = 5
            if (r1 == r0) goto L26
        L24:
            r1 = 0
            return r1
        L26:
            ci1 r1 = r2.i
            return r1
        L29:
            ci1 r1 = r2.h
            return r1
    }

    public final void c(defpackage.ci1 r2, defpackage.ci1 r3, int r4, defpackage.rj1 r5) {
            r1 = this;
            java.util.ArrayList r0 = r2.l
            r0.add(r3)
            java.util.ArrayList r0 = r2.l
            rj1 r1 = r1.e
            r0.add(r1)
            r2.h = r4
            r2.i = r5
            java.util.ArrayList r1 = r3.k
            r1.add(r2)
            java.util.ArrayList r1 = r5.k
            r1.add(r2)
            return
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int r1, int r2) {
            r0 = this;
            l21 r0 = r0.b
            if (r2 != 0) goto L15
            int r2 = r0.v
            int r0 = r0.u
            int r0 = java.lang.Math.max(r0, r1)
            if (r2 <= 0) goto L12
            int r0 = java.lang.Math.min(r2, r1)
        L12:
            if (r0 == r1) goto L26
            return r0
        L15:
            int r2 = r0.y
            int r0 = r0.x
            int r0 = java.lang.Math.max(r0, r1)
            if (r2 <= 0) goto L23
            int r0 = java.lang.Math.min(r2, r1)
        L23:
            if (r0 == r1) goto L26
            return r0
        L26:
            return r1
    }

    public long j() {
            r2 = this;
            rj1 r2 = r2.e
            boolean r0 = r2.j
            if (r0 == 0) goto La
            int r2 = r2.g
            long r0 = (long) r2
            return r0
        La:
            r0 = 0
            return r0
    }

    public abstract boolean k();

    public final void l(defpackage.h11 r13, defpackage.h11 r14, int r15) {
            r12 = this;
            ci1 r0 = h(r13)
            ci1 r1 = h(r14)
            boolean r2 = r0.j
            if (r2 == 0) goto Le7
            boolean r2 = r1.j
            if (r2 != 0) goto L12
            goto Le7
        L12:
            int r2 = r0.g
            int r13 = r13.e()
            int r13 = r13 + r2
            int r2 = r1.g
            int r14 = r14.e()
            int r2 = r2 - r14
            int r14 = r2 - r13
            rj1 r3 = r12.e
            boolean r4 = r3.j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto Lb0
            k21 r4 = r12.d
            k21 r6 = defpackage.k21.MATCH_CONSTRAINT
            if (r4 != r6) goto Lb0
            int r4 = r12.a
            if (r4 == 0) goto La9
            r7 = 1
            if (r4 == r7) goto L9b
            r8 = 2
            if (r4 == r8) goto L73
            r8 = 3
            if (r4 == r8) goto L3f
            goto Lb0
        L3f:
            l21 r4 = r12.b
            ly2 r9 = r4.d
            k21 r10 = r9.d
            if (r10 != r6) goto L56
            int r10 = r9.a
            if (r10 != r8) goto L56
            lm7 r10 = r4.e
            k21 r11 = r10.d
            if (r11 != r6) goto L56
            int r6 = r10.a
            if (r6 != r8) goto L56
            goto Lb0
        L56:
            if (r15 != 0) goto L5a
            lm7 r9 = r4.e
        L5a:
            rj1 r6 = r9.e
            boolean r8 = r6.j
            if (r8 == 0) goto Lb0
            float r4 = r4.X
            int r6 = r6.g
            if (r15 != r7) goto L6b
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L6f
        L6b:
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
        L6f:
            r3.d(r4)
            goto Lb0
        L73:
            l21 r4 = r12.b
            l21 r6 = r4.U
            if (r6 == 0) goto Lb0
            if (r15 != 0) goto L7e
            ly2 r6 = r6.d
            goto L80
        L7e:
            lm7 r6 = r6.e
        L80:
            rj1 r6 = r6.e
            boolean r7 = r6.j
            if (r7 == 0) goto Lb0
            if (r15 != 0) goto L8b
            float r4 = r4.w
            goto L8d
        L8b:
            float r4 = r4.z
        L8d:
            int r6 = r6.g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            int r4 = r12.g(r4, r15)
            r3.d(r4)
            goto Lb0
        L9b:
            int r4 = r3.m
            int r4 = r12.g(r4, r15)
            int r4 = java.lang.Math.min(r4, r14)
            r3.d(r4)
            goto Lb0
        La9:
            int r4 = r12.g(r14, r15)
            r3.d(r4)
        Lb0:
            boolean r4 = r3.j
            if (r4 != 0) goto Lb5
            goto Le7
        Lb5:
            int r4 = r3.g
            ci1 r6 = r12.i
            ci1 r7 = r12.h
            if (r4 != r14) goto Lc4
            r7.d(r13)
            r6.d(r2)
            return
        Lc4:
            l21 r12 = r12.b
            if (r15 != 0) goto Lcb
            float r12 = r12.e0
            goto Lcd
        Lcb:
            float r12 = r12.f0
        Lcd:
            if (r0 != r1) goto Ld4
            int r13 = r0.g
            int r2 = r1.g
            r12 = r5
        Ld4:
            int r2 = r2 - r13
            int r2 = r2 - r4
            float r13 = (float) r13
            float r13 = r13 + r5
            float r14 = (float) r2
            float r14 = r14 * r12
            float r14 = r14 + r13
            int r12 = (int) r14
            r7.d(r12)
            int r12 = r7.g
            int r13 = r3.g
            int r12 = r12 + r13
            r6.d(r12)
        Le7:
            return
    }
}

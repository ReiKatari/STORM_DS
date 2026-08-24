package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uq4  reason: default package */
/* loaded from: classes.dex */
public final class uq4 {
    public final defpackage.s63 a;
    public final defpackage.p94 b;
    public final defpackage.q94 c;
    public final defpackage.n94 d;
    public final defpackage.p94 e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public final defpackage.pq3 n;
    public final defpackage.m44 o;

    public uq4(defpackage.s63 r1, defpackage.pq3 r2, defpackage.jr4 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            p94 r1 = defpackage.h93.a
            p94 r1 = new p94
            r1.<init>()
            r0.b = r1
            q94 r1 = new q94
            r1.<init>()
            r0.c = r1
            int r1 = defpackage.c93.a
            n94 r1 = new n94
            r1.<init>()
            r0.d = r1
            p94 r1 = new p94
            r1.<init>()
            r0.e = r1
            r1 = -1
            r0.g = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.h = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.i = r1
            r0.n = r2
            m44 r1 = new m44
            r1.<init>(r3)
            r0.o = r1
            return
    }

    public final int a(defpackage.m44 r10, int r11, boolean r12) {
            r9 = this;
            p94 r0 = r9.e
            boolean r1 = r0.a(r11)
            if (r1 == 0) goto L14
            java.lang.Object r9 = r0.b(r11)
            r9.getClass()
            xa0 r9 = (defpackage.xa0) r9
            int r9 = r9.b
            return r9
        L14:
            p94 r0 = r9.b
            boolean r1 = r0.a(r11)
            r2 = 0
            if (r1 == 0) goto L39
            if (r12 == 0) goto L7a
            java.lang.Object r9 = r0.b(r11)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L7a
            int r10 = r9.size()
        L2b:
            if (r2 >= r10) goto L7a
            java.lang.Object r11 = r9.get(r2)
            oq3 r11 = (defpackage.oq3) r11
            r11.a()
            int r2 = r2 + 1
            goto L2b
        L39:
            wa0 r1 = new wa0
            r1.<init>(r9, r10, r2)
            cr4 r9 = r10.q()
            long r5 = r9.u
            java.lang.Object r9 = r10.R
            r3 = r9
            pq3 r3 = (defpackage.pq3) r3
            if (r3 == 0) goto L7c
            qk4 r8 = new qk4
            r9 = 2
            r8.<init>(r9, r1, r10)
            r7 = 1
            r4 = r11
            oq3 r9 = r3.a(r4, r5, r7, r8)
            java.util.List r9 = defpackage.hf.b0(r9)
            r0.i(r4, r9)
            if (r12 == 0) goto L7a
            java.lang.Object r9 = r0.b(r4)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L7a
            int r10 = r9.size()
        L6c:
            if (r2 >= r10) goto L7a
            java.lang.Object r11 = r9.get(r2)
            oq3 r11 = (defpackage.oq3) r11
            r11.a()
            int r2 = r2 + 1
            goto L6c
        L7a:
            r9 = -1
            return r9
        L7c:
            java.lang.String r9 = "state"
            defpackage.nb3.a0(r9)
            r9 = 0
            throw r9
    }

    public final boolean b() {
            r2 = this;
            int r0 = r2.h
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto Lf
            int r2 = r2.i
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto Lf
            r2 = 1
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public final void c(defpackage.m44 r9, int r10, int r11) {
            r8 = this;
            p94 r0 = r8.e
            java.lang.Object r1 = r0.b(r10)
            xa0 r1 = (defpackage.xa0) r1
            vs0 r2 = defpackage.xa0.c
            if (r1 == 0) goto L11
            r1.b = r11
            r1.a = r2
            goto L1a
        L11:
            xa0 r1 = new xa0
            r1.<init>()
            r1.a = r2
            r1.b = r11
        L1a:
            r0.i(r10, r1)
            int r0 = r8.i
            if (r10 <= r0) goto L29
            r8.i = r10
            int r10 = r8.k
            int r10 = r10 - r11
            r8.k = r10
            goto L34
        L29:
            int r0 = r8.h
            if (r10 >= r0) goto L34
            r8.h = r10
            int r10 = r8.j
            int r10 = r10 - r11
            r8.j = r10
        L34:
            float r10 = r8.f
            float r10 = java.lang.Math.signum(r10)
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            r0 = 1
            r1 = -1
            if (r10 > 0) goto L4a
            int r10 = r8.k
            if (r10 <= 0) goto L5c
            int r10 = r8.i
            int r10 = r10 + r0
        L48:
            r3 = r10
            goto L5d
        L4a:
            float r10 = r8.f
            float r10 = java.lang.Math.signum(r10)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L5c
            int r10 = r8.j
            if (r10 <= 0) goto L5c
            int r10 = r8.h
            int r10 = r10 - r0
            goto L48
        L5c:
            r3 = r1
        L5d:
            if (r3 <= 0) goto L96
            r9.getClass()
            if (r3 == r1) goto L96
            int r10 = r8.m
            if (r3 >= r10) goto L96
            wa0 r10 = new wa0
            r10.<init>(r8, r9, r0)
            cr4 r11 = r9.q()
            long r4 = r11.u
            java.lang.Object r11 = r9.R
            r2 = r11
            pq3 r2 = (defpackage.pq3) r2
            if (r2 == 0) goto L8f
            qk4 r7 = new qk4
            r11 = 2
            r7.<init>(r11, r10, r9)
            r6 = 1
            oq3 r9 = r2.a(r3, r4, r6, r7)
            java.util.List r9 = defpackage.hf.b0(r9)
            p94 r10 = r8.b
            r10.i(r3, r9)
            goto L96
        L8f:
            java.lang.String r8 = "state"
            defpackage.nb3.a0(r8)
            r8 = 0
            throw r8
        L96:
            r8.h()
            return
    }

    public final void d(defpackage.m44 r6, int r7, int r8, int r9, int r10, int r11, float r12, boolean r13) {
            r5 = this;
            float r0 = java.lang.Math.signum(r12)
            float r1 = r5.f
            float r1 = java.lang.Math.signum(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L12
            r0 = r2
            goto L13
        L12:
            r0 = r1
        L13:
            r3 = 0
            r4 = -1
            if (r13 == 0) goto L76
            if (r0 == 0) goto L30
            boolean r7 = r5.l
            if (r7 == 0) goto L1e
            goto L30
        L1e:
            int r7 = r5.k
            float r11 = java.lang.Math.abs(r12)
            int r11 = defpackage.u24.E(r11)
            int r11 = r11 + r7
            int r9 = r9 - r10
            if (r11 <= r9) goto L2d
            r11 = r9
        L2d:
            r5.k = r11
            goto L35
        L30:
            int r9 = r9 - r10
            r5.k = r9
            r5.i = r8
        L35:
            int r7 = r5.k
            if (r7 <= 0) goto Lcb
            int r7 = r5.i
            r6.getClass()
            if (r7 == r4) goto Lcb
            int r7 = r5.i
            int r9 = r5.m
            int r9 = r9 - r2
            if (r7 >= r9) goto Lcb
            int r9 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r9 != 0) goto L4d
            r9 = r1
            goto L4e
        L4d:
            r9 = r2
        L4e:
            int r7 = r7 + 1
            int r11 = r8 + 1
            if (r7 != r11) goto L61
            if (r9 == 0) goto L61
            float r7 = java.lang.Math.abs(r12)
            float r9 = (float) r10
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L61
            r7 = r2
            goto L62
        L61:
            r7 = r1
        L62:
            int r9 = r5.i
            int r9 = r9 + r2
            int r7 = r5.a(r6, r9, r7)
            if (r7 == r4) goto Lcb
            int r9 = r5.i
            int r9 = r9 + r2
            r5.i = r9
            int r9 = r5.k
            int r9 = r9 - r7
            r5.k = r9
            goto L35
        L76:
            if (r0 == 0) goto L8f
            boolean r8 = r5.l
            if (r8 == 0) goto L7d
            goto L8f
        L7d:
            int r8 = r5.j
            float r10 = java.lang.Math.abs(r12)
            int r10 = defpackage.u24.E(r10)
            int r10 = r10 + r8
            int r9 = r9 - r11
            if (r10 <= r9) goto L8c
            r10 = r9
        L8c:
            r5.j = r10
            goto L94
        L8f:
            int r9 = r9 - r11
            r5.j = r9
            r5.h = r7
        L94:
            int r8 = r5.j
            if (r8 <= 0) goto Lcb
            int r8 = r5.h
            if (r8 <= 0) goto Lcb
            int r9 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r9 != 0) goto La2
            r9 = r1
            goto La3
        La2:
            r9 = r2
        La3:
            int r8 = r8 + (-1)
            int r10 = r7 + (-1)
            if (r8 != r10) goto Lb6
            if (r9 == 0) goto Lb6
            float r8 = java.lang.Math.abs(r12)
            float r9 = (float) r11
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 < 0) goto Lb6
            r8 = r2
            goto Lb7
        Lb6:
            r8 = r1
        Lb7:
            int r9 = r5.h
            int r9 = r9 - r2
            int r8 = r5.a(r6, r9, r8)
            if (r8 == r4) goto Lcb
            int r9 = r5.h
            int r9 = r9 + r4
            r5.h = r9
            int r9 = r5.j
            int r9 = r9 - r8
            r5.j = r9
            goto L94
        Lcb:
            return
    }

    public final void e(float r11, defpackage.cr4 r12) {
            r10 = this;
            m44 r1 = r10.o
            r1.L = r12
            pq3 r12 = r10.n
            r1.R = r12
            float r7 = -r11
            r10.h()
            boolean r11 = r1.o()
            r12 = 0
            r0 = 1
            r2 = 0
            if (r11 == 0) goto Lae
            cr4 r11 = r1.q()
            defpackage.gi2.G(r11)
            r1.q()
            int r11 = r1.w()
            r10.m = r11
            int r11 = r1.m()
            int r3 = r1.p()
            int r4 = r1.w()
            int r5 = r1.s()
            int r6 = r1.r()
            int r8 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            p94 r9 = r10.e
            if (r8 > 0) goto L76
            int r3 = 0 - r5
            r10.j = r3
            r10.h = r11
        L45:
            int r11 = r10.j
            if (r11 <= 0) goto L6f
            int r11 = r10.h
            if (r11 <= 0) goto L6f
            int r11 = r11 + (-1)
            boolean r11 = r9.a(r11)
            if (r11 == 0) goto L6f
            int r11 = r10.h
            int r11 = r11 - r0
            java.lang.Object r11 = r9.b(r11)
            r11.getClass()
            xa0 r11 = (defpackage.xa0) r11
            int r11 = r11.b
            int r3 = r10.h
            int r3 = r3 + (-1)
            r10.h = r3
            int r3 = r10.j
            int r3 = r3 - r11
            r10.j = r3
            goto L45
        L6f:
            int r11 = r10.h
            int r11 = r11 - r0
            r10.f(r2, r11)
            goto Lae
        L76:
            int r11 = 0 - r6
            r10.k = r11
            r10.i = r3
        L7c:
            int r11 = r10.k
            if (r11 <= 0) goto La7
            int r11 = r10.i
            int r3 = r4 + (-1)
            if (r11 >= r3) goto La7
            int r11 = r11 + 1
            boolean r11 = r9.a(r11)
            if (r11 == 0) goto La7
            int r11 = r10.i
            int r11 = r11 + r0
            java.lang.Object r11 = r9.b(r11)
            r11.getClass()
            xa0 r11 = (defpackage.xa0) r11
            int r11 = r11.b
            int r3 = r10.i
            int r3 = r3 + r0
            r10.i = r3
            int r3 = r10.k
            int r3 = r3 - r11
            r10.k = r3
            goto L7c
        La7:
            int r11 = r10.i
            int r11 = r11 + r0
            int r4 = r4 - r0
            r10.f(r11, r4)
        Lae:
            boolean r11 = r1.o()
            if (r11 == 0) goto Led
            cr4 r11 = r1.q()
            defpackage.gi2.G(r11)
            cr4 r11 = r1.q()
            qh1 r11 = r11.t
            if (r11 == 0) goto Lce
            s63 r11 = r10.a
            java.lang.Object r11 = r11.B
            nr4 r11 = (defpackage.nr4) r11
            int r11 = r11.o
            r4 = r11
            r11 = r2
            goto Ld0
        Lce:
            r11 = r2
            r4 = r11
        Ld0:
            int r2 = r1.m()
            int r3 = r1.p()
            int r6 = r1.s()
            int r5 = r1.r()
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 > 0) goto Le7
            r8 = r0
        Le5:
            r0 = r10
            goto Le9
        Le7:
            r8 = r11
            goto Le5
        Le9:
            r0.d(r1, r2, r3, r4, r5, r6, r7, r8)
            goto Lee
        Led:
            r0 = r10
        Lee:
            r0.f = r7
            r0.h()
            return
    }

    public final void f(int r29, int r30) {
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            q94 r3 = r0.c
            r3.b()
            p94 r4 = r0.b
            int[] r5 = r4.b
            long[] r6 = r4.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            r15 = 8
            r16 = 0
            if (r7 < 0) goto L59
            r8 = r16
            r17 = 128(0x80, double:6.3E-322)
            r19 = 255(0xff, double:1.26E-321)
        L20:
            r10 = r6[r8]
            r9 = 7
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = ~r10
            long r12 = r12 << r9
            long r12 = r12 & r10
            long r12 = r12 & r21
            int r12 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r12 == 0) goto L54
            int r12 = r8 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r16
        L3a:
            if (r13 >= r12) goto L52
            long r23 = r10 & r19
            int r14 = (r23 > r17 ? 1 : (r23 == r17 ? 0 : -1))
            if (r14 >= 0) goto L4e
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r5[r14]
            if (r1 > r14) goto L4e
            if (r14 > r2) goto L4e
            r3.a(r14)
        L4e:
            long r10 = r10 >> r15
            int r13 = r13 + 1
            goto L3a
        L52:
            if (r12 != r15) goto L63
        L54:
            if (r8 == r7) goto L63
            int r8 = r8 + 1
            goto L20
        L59:
            r9 = 7
            r17 = 128(0x80, double:6.3E-322)
            r19 = 255(0xff, double:1.26E-321)
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L63:
            n94 r5 = r0.d
            int[] r6 = r5.b
            long[] r7 = r5.a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto Lb2
            r10 = r16
        L70:
            r11 = r7[r10]
            long r13 = ~r11
            long r13 = r13 << r9
            long r13 = r13 & r11
            long r13 = r13 & r21
            int r13 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r13 == 0) goto La9
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r16
        L84:
            if (r14 >= r13) goto La4
            long r23 = r11 & r19
            int r23 = (r23 > r17 ? 1 : (r23 == r17 ? 0 : -1))
            if (r23 >= 0) goto L9c
            int r23 = r10 << 3
            int r23 = r23 + r14
            r24 = r9
            r9 = r6[r23]
            if (r1 > r9) goto L9e
            if (r9 > r2) goto L9e
            r3.a(r9)
            goto L9e
        L9c:
            r24 = r9
        L9e:
            long r11 = r11 >> r15
            int r14 = r14 + 1
            r9 = r24
            goto L84
        La4:
            r24 = r9
            if (r13 != r15) goto Lb4
            goto Lab
        La9:
            r24 = r9
        Lab:
            if (r10 == r8) goto Lb4
            int r10 = r10 + 1
            r9 = r24
            goto L70
        Lb2:
            r24 = r9
        Lb4:
            p94 r0 = r0.e
            int[] r6 = r0.b
            long[] r7 = r0.a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto Lf5
            r9 = r16
        Lc1:
            r10 = r7[r9]
            long r12 = ~r10
            long r12 = r12 << r24
            long r12 = r12 & r10
            long r12 = r12 & r21
            int r12 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r12 == 0) goto Lf0
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r16
        Ld6:
            if (r13 >= r12) goto Lee
            long r25 = r10 & r19
            int r14 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r14 >= 0) goto Lea
            int r14 = r9 << 3
            int r14 = r14 + r13
            r14 = r6[r14]
            if (r1 > r14) goto Lea
            if (r14 > r2) goto Lea
            r3.a(r14)
        Lea:
            long r10 = r10 >> r15
            int r13 = r13 + 1
            goto Ld6
        Lee:
            if (r12 != r15) goto Lf5
        Lf0:
            if (r9 == r8) goto Lf5
            int r9 = r9 + 1
            goto Lc1
        Lf5:
            int[] r1 = r3.b
            long[] r2 = r3.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L19b
            r6 = r16
        L100:
            r7 = r2[r6]
            long r9 = ~r7
            long r9 = r9 << r24
            long r9 = r9 & r7
            long r9 = r9 & r21
            int r9 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r9 == 0) goto L18d
            int r9 = r6 - r3
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = r16
        L115:
            if (r10 >= r9) goto L186
            long r11 = r7 & r19
            int r11 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r11 >= 0) goto L17a
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            java.lang.Object r12 = r4.g(r11)
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L13e
            int r13 = r12.size()
            r14 = r16
        L130:
            if (r14 >= r13) goto L13e
            java.lang.Object r23 = r12.get(r14)
            oq3 r23 = (defpackage.oq3) r23
            r23.cancel()
            int r14 = r14 + 1
            goto L130
        L13e:
            int r12 = r5.c(r11)
            if (r12 < 0) goto L172
            int r13 = r5.e
            int r13 = r13 + (-1)
            r5.e = r13
            long[] r13 = r5.a
            int r14 = r5.d
            int r23 = r12 >> 3
            r25 = r12 & 7
            int r25 = r25 << 3
            r26 = r13[r23]
            r28 = r1
            r29 = r2
            long r1 = r19 << r25
            long r1 = ~r1
            long r1 = r26 & r1
            r26 = 254(0xfe, double:1.255E-321)
            long r25 = r26 << r25
            long r1 = r1 | r25
            r13[r23] = r1
            int r12 = r12 + (-7)
            r12 = r12 & r14
            r14 = r14 & 7
            int r12 = r12 + r14
            int r12 = r12 >> 3
            r13[r12] = r1
            goto L176
        L172:
            r28 = r1
            r29 = r2
        L176:
            r0.g(r11)
            goto L17e
        L17a:
            r28 = r1
            r29 = r2
        L17e:
            long r7 = r7 >> r15
            int r10 = r10 + 1
            r1 = r28
            r2 = r29
            goto L115
        L186:
            r28 = r1
            r29 = r2
            if (r9 != r15) goto L19b
            goto L191
        L18d:
            r28 = r1
            r29 = r2
        L191:
            if (r6 == r3) goto L19b
            int r6 = r6 + 1
            r1 = r28
            r2 = r29
            goto L100
        L19b:
            return
    }

    public final void g() {
            r14 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r14.h = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r14.i = r0
            r0 = 0
            r14.j = r0
            r14.k = r0
            r14.l = r0
            n94 r1 = r14.d
            r1.a()
            p94 r1 = r14.e
            r1.c()
            p94 r14 = r14.b
            long[] r1 = r14.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L77
            r3 = r0
        L24:
            r4 = r1[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L72
            int r6 = r3 - r2
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r0
        L3e:
            if (r8 >= r6) goto L70
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L6c
            int r9 = r3 << 3
            int r9 = r9 + r8
            int[] r10 = r14.b
            r10 = r10[r9]
            java.lang.Object[] r10 = r14.c
            r10 = r10[r9]
            java.util.List r10 = (java.util.List) r10
            int r11 = r10.size()
            r12 = r0
        L5b:
            if (r12 >= r11) goto L69
            java.lang.Object r13 = r10.get(r12)
            oq3 r13 = (defpackage.oq3) r13
            r13.cancel()
            int r12 = r12 + 1
            goto L5b
        L69:
            r14.h(r9)
        L6c:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L3e
        L70:
            if (r6 != r7) goto L77
        L72:
            if (r3 == r2) goto L77
            int r3 = r3 + 1
            goto L24
        L77:
            return
    }

    public final void h() {
            r3 = this;
            int r0 = r3.j
            long r0 = (long) r0
            java.lang.String r2 = "prefetchWindowStartExtraSpace"
            defpackage.lb4.J(r0, r2)
            int r0 = r3.k
            long r0 = (long) r0
            java.lang.String r2 = "prefetchWindowEndExtraSpace"
            defpackage.lb4.J(r0, r2)
            int r0 = r3.h
            long r0 = (long) r0
            java.lang.String r2 = "prefetchWindowStartIndex"
            defpackage.lb4.J(r0, r2)
            int r3 = r3.i
            long r0 = (long) r3
            java.lang.String r3 = "prefetchWindowEndIndex"
            defpackage.lb4.J(r0, r3)
            return
    }
}

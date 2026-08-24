package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cr4  reason: default package */
/* loaded from: classes.dex */
public final class cr4 implements defpackage.f34 {
    public final java.util.List a;
    public final int b;
    public final int c;
    public final int d;
    public final defpackage.lo4 e;
    public final int f;
    public final int g;
    public final int h;
    public final defpackage.i34 i;
    public final defpackage.i34 j;
    public final float k;
    public final int l;
    public final boolean m;
    public final defpackage.cs1 n;
    public final defpackage.f34 o;
    public final boolean p;
    public final java.util.List q;
    public final java.util.List r;
    public final defpackage.w61 s;
    public final defpackage.qh1 t;
    public final long u;

    public /* synthetic */ cr4(int r24, int r25, int r26, defpackage.lo4 r27, int r28, int r29, int r30, defpackage.cs1 r31, defpackage.f34 r32, defpackage.w61 r33, defpackage.qh1 r34, long r35) {
            r23 = this;
            r13 = 0
            r16 = 0
            yt1 r1 = defpackage.yt1.A
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r17 = r1
            r18 = r1
            r0 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r14 = r31
            r15 = r32
            r19 = r33
            r20 = r34
            r21 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
    }

    public cr4(java.util.List r1, int r2, int r3, int r4, defpackage.lo4 r5, int r6, int r7, int r8, defpackage.i34 r9, defpackage.i34 r10, float r11, int r12, boolean r13, defpackage.cs1 r14, defpackage.f34 r15, boolean r16, java.util.List r17, java.util.List r18, defpackage.w61 r19, defpackage.qh1 r20, long r21) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            r0.k = r11
            r0.l = r12
            r0.m = r13
            r0.n = r14
            r0.o = r15
            r1 = r16
            r0.p = r1
            r1 = r17
            r0.q = r1
            r1 = r18
            r0.r = r1
            r1 = r19
            r0.s = r1
            r1 = r20
            r0.t = r1
            r1 = r21
            r0.u = r1
            return
    }

    @Override // defpackage.f34
    public final void a() {
            r0 = this;
            f34 r0 = r0.o
            r0.a()
            return
    }

    @Override // defpackage.f34
    public final java.util.Map b() {
            r0 = this;
            f34 r0 = r0.o
            java.util.Map r0 = r0.b()
            return r0
    }

    @Override // defpackage.f34
    public final defpackage.qn2 c() {
            r0 = this;
            f34 r0 = r0.o
            qn2 r0 = r0.c()
            return r0
    }

    public final defpackage.cr4 d(int r29) {
            r28 = this;
            r0 = r28
            r1 = r29
            int r2 = r0.b
            int r3 = r0.c
            int r2 = r2 + r3
            boolean r3 = r0.p
            if (r3 != 0) goto Lf2
            java.util.List r3 = r0.a
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto Lf2
            i34 r4 = r0.i
            if (r4 == 0) goto Lf2
            int r4 = r0.l
            int r4 = r4 - r1
            if (r4 < 0) goto Lf2
            if (r4 >= r2) goto Lf2
            if (r2 == 0) goto L26
            float r5 = (float) r1
            float r6 = (float) r2
            float r5 = r5 / r6
            goto L27
        L26:
            r5 = 0
        L27:
            float r6 = r0.k
            float r16 = r6 - r5
            i34 r5 = r0.j
            if (r5 == 0) goto Lf2
            r5 = 1056964608(0x3f000000, float:0.5)
            int r5 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r5 >= 0) goto Lf2
            r5 = -1090519040(0xffffffffbf000000, float:-0.5)
            int r5 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r5 > 0) goto L3d
            goto Lf2
        L3d:
            java.lang.Object r5 = defpackage.gt0.H0(r3)
            i34 r5 = (defpackage.i34) r5
            java.lang.Object r6 = defpackage.gt0.Q0(r3)
            i34 r6 = (defpackage.i34) r6
            int r7 = r0.g
            int r8 = r0.f
            if (r1 >= 0) goto L5f
            int r5 = r5.j
            int r5 = r5 + r2
            int r5 = r5 - r8
            int r6 = r6.j
            int r6 = r6 + r2
            int r6 = r6 - r7
            int r2 = java.lang.Math.min(r5, r6)
            int r5 = -r1
            if (r2 <= r5) goto Lf2
            goto L6b
        L5f:
            int r2 = r5.j
            int r8 = r8 - r2
            int r2 = r6.j
            int r7 = r7 - r2
            int r2 = java.lang.Math.min(r8, r7)
            if (r2 <= r1) goto Lf2
        L6b:
            int r2 = r3.size()
            r5 = 0
            r6 = r5
        L71:
            if (r6 >= r2) goto L7f
            java.lang.Object r7 = r3.get(r6)
            i34 r7 = (defpackage.i34) r7
            r7.a(r1)
            int r6 = r6 + 1
            goto L71
        L7f:
            java.util.List r2 = r0.q
            int r3 = r2.size()
            r6 = r5
        L86:
            if (r6 >= r3) goto L94
            java.lang.Object r7 = r2.get(r6)
            i34 r7 = (defpackage.i34) r7
            r7.a(r1)
            int r6 = r6 + 1
            goto L86
        L94:
            java.util.List r2 = r0.r
            int r3 = r2.size()
            r6 = r5
        L9b:
            if (r6 >= r3) goto La9
            java.lang.Object r7 = r2.get(r6)
            i34 r7 = (defpackage.i34) r7
            r7.a(r1)
            int r6 = r6 + 1
            goto L9b
        La9:
            cr4 r2 = new cr4
            boolean r3 = r0.m
            if (r3 != 0) goto Lb5
            if (r1 <= 0) goto Lb2
            goto Lb5
        Lb2:
            r18 = r5
            goto Lb7
        Lb5:
            r5 = 1
            goto Lb2
        Lb7:
            qh1 r1 = r0.t
            long r5 = r0.u
            r26 = r5
            java.util.List r6 = r0.a
            int r7 = r0.b
            int r8 = r0.c
            int r9 = r0.d
            lo4 r10 = r0.e
            int r11 = r0.f
            int r12 = r0.g
            int r13 = r0.h
            i34 r14 = r0.i
            i34 r15 = r0.j
            cs1 r3 = r0.n
            f34 r5 = r0.o
            r25 = r1
            boolean r1 = r0.p
            r21 = r1
            java.util.List r1 = r0.q
            r22 = r1
            java.util.List r1 = r0.r
            w61 r0 = r0.s
            r24 = r0
            r23 = r1
            r19 = r3
            r17 = r4
            r20 = r5
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r5
        Lf2:
            r0 = 0
            return r0
    }

    public final long e() {
            r6 = this;
            f34 r6 = r6.o
            int r0 = r6.getWidth()
            int r6 = r6.getHeight()
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            long r2 = (long) r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
    }

    @Override // defpackage.f34
    public final int getHeight() {
            r0 = this;
            f34 r0 = r0.o
            int r0 = r0.getHeight()
            return r0
    }

    @Override // defpackage.f34
    public final int getWidth() {
            r0 = this;
            f34 r0 = r0.o
            int r0 = r0.getWidth()
            return r0
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wo3  reason: default package */
/* loaded from: classes.dex */
public final class wo3 implements defpackage.f34 {
    public final defpackage.yo3 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final defpackage.f34 e;
    public final float f;
    public final boolean g;
    public final defpackage.w61 h;
    public final defpackage.qh1 i;
    public final int j;
    public final defpackage.qn2 k;
    public final defpackage.qn2 l;
    public final java.util.List m;
    public final int n;
    public final int o;
    public final int p;
    public final defpackage.lo4 q;
    public final int r;
    public final int s;

    public wo3(defpackage.yo3 r1, int r2, boolean r3, float r4, defpackage.f34 r5, float r6, boolean r7, defpackage.w61 r8, defpackage.qh1 r9, int r10, defpackage.qn2 r11, defpackage.qn2 r12, java.util.List r13, int r14, int r15, int r16, defpackage.lo4 r17, int r18, int r19) {
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
            return
    }

    @Override // defpackage.f34
    public final void a() {
            r0 = this;
            f34 r0 = r0.e
            r0.a()
            return
    }

    @Override // defpackage.f34
    public final java.util.Map b() {
            r0 = this;
            f34 r0 = r0.e
            java.util.Map r0 = r0.b()
            return r0
    }

    @Override // defpackage.f34
    public final defpackage.qn2 c() {
            r0 = this;
            f34 r0 = r0.e
            qn2 r0 = r0.c()
            return r0
    }

    public final defpackage.wo3 d(int r24, boolean r25) {
            r23 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r0.g
            if (r2 != 0) goto Le9
            java.util.List r2 = r0.m
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto Le9
            yo3 r3 = r0.a
            if (r3 == 0) goto Le9
            int r3 = r3.g
            int r4 = r0.b
            int r5 = r4 - r1
            if (r5 < 0) goto Le9
            if (r5 >= r3) goto Le9
            java.lang.Object r3 = defpackage.gt0.H0(r2)
            xo3 r3 = (defpackage.xo3) r3
            java.lang.Object r4 = defpackage.gt0.Q0(r2)
            xo3 r4 = (defpackage.xo3) r4
            boolean r6 = r3.r
            if (r6 != 0) goto Le9
            boolean r6 = r4.r
            if (r6 == 0) goto L34
            goto Le9
        L34:
            int r6 = r0.o
            int r7 = r0.n
            lo4 r8 = r0.q
            if (r1 >= 0) goto L54
            int r9 = defpackage.oi2.O(r3, r8)
            int r3 = r3.l
            int r9 = r9 + r3
            int r9 = r9 - r7
            int r3 = defpackage.oi2.O(r4, r8)
            int r4 = r4.l
            int r3 = r3 + r4
            int r3 = r3 - r6
            int r3 = java.lang.Math.min(r9, r3)
            int r4 = -r1
            if (r3 <= r4) goto Le9
            goto L64
        L54:
            int r3 = defpackage.oi2.O(r3, r8)
            int r7 = r7 - r3
            int r3 = defpackage.oi2.O(r4, r8)
            int r6 = r6 - r3
            int r3 = java.lang.Math.min(r7, r6)
            if (r3 <= r1) goto Le9
        L64:
            int r3 = r2.size()
            r4 = 0
            r6 = r4
        L6a:
            if (r6 >= r3) goto Lab
            java.lang.Object r7 = r2.get(r6)
            xo3 r7 = (defpackage.xo3) r7
            r7.getClass()
            boolean r8 = r7.r
            if (r8 == 0) goto L7a
            goto La8
        L7a:
            long r8 = r7.o
            r10 = 32
            long r11 = r8 >> r10
            int r11 = (int) r11
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r12
            int r8 = (int) r8
            int r8 = r8 + r1
            long r14 = (long) r11
            long r9 = r14 << r10
            long r14 = (long) r8
            long r11 = r14 & r12
            long r8 = r9 | r11
            r7.o = r8
            if (r25 == 0) goto La8
            java.util.List r8 = r7.e
            int r8 = r8.size()
            r9 = r4
        L9c:
            if (r9 >= r8) goto La8
            zp3 r10 = r7.h
            java.lang.Object r11 = r7.b
            r10.b(r9, r11)
            int r9 = r9 + 1
            goto L9c
        La8:
            int r6 = r6 + 1
            goto L6a
        Lab:
            boolean r3 = r0.c
            if (r3 != 0) goto Lb4
            if (r1 <= 0) goto Lb2
            goto Lb4
        Lb2:
            r6 = r4
            goto Lb6
        Lb4:
            r4 = 1
            goto Lb2
        Lb6:
            float r7 = (float) r1
            wo3 r3 = new wo3
            yo3 r4 = r0.a
            f34 r8 = r0.e
            float r9 = r0.f
            boolean r10 = r0.g
            w61 r11 = r0.h
            qh1 r12 = r0.i
            int r13 = r0.j
            qn2 r14 = r0.k
            qn2 r15 = r0.l
            int r1 = r0.n
            r17 = r1
            int r1 = r0.o
            r18 = r1
            int r1 = r0.p
            r19 = r1
            lo4 r1 = r0.q
            r20 = r1
            int r1 = r0.r
            int r0 = r0.s
            r22 = r0
            r21 = r1
            r16 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r3
        Le9:
            r0 = 0
            return r0
    }

    public final long e() {
            r6 = this;
            f34 r6 = r6.e
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
            f34 r0 = r0.e
            int r0 = r0.getHeight()
            return r0
    }

    @Override // defpackage.f34
    public final int getWidth() {
            r0 = this;
            f34 r0 = r0.e
            int r0 = r0.getWidth()
            return r0
    }
}

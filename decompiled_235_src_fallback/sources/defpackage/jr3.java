package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jr3  reason: default package */
/* loaded from: classes.dex */
public final class jr3 implements defpackage.f34 {
    public final defpackage.kr3 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final defpackage.f34 e;
    public final float f;
    public final boolean g;
    public final defpackage.w61 h;
    public final defpackage.qh1 i;
    public final long j;
    public final java.util.List k;
    public final int l;
    public final int m;
    public final int n;
    public final defpackage.lo4 o;
    public final int p;
    public final int q;

    public jr3(defpackage.kr3 r1, int r2, boolean r3, float r4, defpackage.f34 r5, float r6, boolean r7, defpackage.w61 r8, defpackage.qh1 r9, long r10, java.util.List r12, int r13, int r14, int r15, defpackage.lo4 r16, int r17, int r18) {
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
            r0.k = r12
            r0.l = r13
            r0.m = r14
            r0.n = r15
            r1 = r16
            r0.o = r1
            r1 = r17
            r0.p = r1
            r1 = r18
            r0.q = r1
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

    public final defpackage.jr3 d(int r23, boolean r24) {
            r22 = this;
            r0 = r22
            r1 = r23
            boolean r2 = r0.g
            if (r2 != 0) goto Ldb
            java.util.List r15 = r0.k
            boolean r2 = r15.isEmpty()
            if (r2 != 0) goto Ldb
            kr3 r2 = r0.a
            if (r2 == 0) goto Ldb
            int r2 = r2.n
            int r3 = r0.b
            int r5 = r3 - r1
            if (r5 < 0) goto Ldb
            if (r5 >= r2) goto Ldb
            java.lang.Object r2 = defpackage.gt0.H0(r15)
            kr3 r2 = (defpackage.kr3) r2
            java.lang.Object r3 = defpackage.gt0.Q0(r15)
            kr3 r3 = (defpackage.kr3) r3
            boolean r4 = r2.p
            if (r4 != 0) goto Ldb
            boolean r4 = r3.p
            if (r4 == 0) goto L34
            goto Ldb
        L34:
            int r4 = r2.l
            int r6 = r0.m
            int r7 = r0.l
            if (r1 >= 0) goto L4e
            int r2 = r2.n
            int r4 = r4 + r2
            int r4 = r4 - r7
            int r2 = r3.l
            int r3 = r3.n
            int r2 = r2 + r3
            int r2 = r2 - r6
            int r2 = java.lang.Math.min(r4, r2)
            int r3 = -r1
            if (r2 <= r3) goto Ldb
            goto L58
        L4e:
            int r7 = r7 - r4
            int r2 = r3.l
            int r6 = r6 - r2
            int r2 = java.lang.Math.min(r7, r6)
            if (r2 <= r1) goto Ldb
        L58:
            int r2 = r15.size()
            r3 = 0
            r4 = r3
        L5e:
            if (r4 >= r2) goto La2
            java.lang.Object r6 = r15.get(r4)
            kr3 r6 = (defpackage.kr3) r6
            boolean r7 = r6.c
            int[] r8 = r6.r
            boolean r9 = r6.p
            if (r9 == 0) goto L6f
            goto L9f
        L6f:
            int r9 = r6.l
            int r9 = r9 + r1
            r6.l = r9
            int r9 = r8.length
            r10 = r3
        L76:
            if (r10 >= r9) goto L8a
            r11 = r10 & 1
            if (r7 == 0) goto L7e
            if (r11 != 0) goto L82
        L7e:
            if (r7 != 0) goto L87
            if (r11 != 0) goto L87
        L82:
            r11 = r8[r10]
            int r11 = r11 + r1
            r8[r10] = r11
        L87:
            int r10 = r10 + 1
            goto L76
        L8a:
            if (r24 == 0) goto L9f
            java.util.List r7 = r6.b
            int r7 = r7.size()
            r8 = r3
        L93:
            if (r8 >= r7) goto L9f
            zp3 r9 = r6.k
            java.lang.Object r10 = r6.i
            r9.b(r8, r10)
            int r8 = r8 + 1
            goto L93
        L9f:
            int r4 = r4 + 1
            goto L5e
        La2:
            jr3 r2 = new jr3
            boolean r4 = r0.c
            if (r4 != 0) goto Lad
            if (r1 <= 0) goto Lab
            goto Lad
        Lab:
            r6 = r3
            goto Laf
        Lad:
            r3 = 1
            goto Lab
        Laf:
            float r7 = (float) r1
            int r1 = r0.p
            int r3 = r0.q
            kr3 r4 = r0.a
            f34 r8 = r0.e
            float r9 = r0.f
            boolean r10 = r0.g
            w61 r11 = r0.h
            qh1 r12 = r0.i
            long r13 = r0.j
            r20 = r1
            int r1 = r0.l
            r16 = r1
            int r1 = r0.m
            r17 = r1
            int r1 = r0.n
            lo4 r0 = r0.o
            r19 = r0
            r18 = r1
            r21 = r3
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21)
            return r3
        Ldb:
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

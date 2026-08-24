package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xo3  reason: default package */
/* loaded from: classes.dex */
public final class xo3 implements defpackage.gq3 {
    public final int a;
    public final java.lang.Object b;
    public final int c;
    public final defpackage.kk3 d;
    public final java.util.List e;
    public final long f;
    public final java.lang.Object g;
    public final defpackage.zp3 h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public int m;
    public final long n;
    public long o;
    public int p;
    public int q;
    public boolean r;

    public xo3(int r1, java.lang.Object r2, int r3, int r4, defpackage.kk3 r5, int r6, int r7, java.util.List r8, long r9, java.lang.Object r11, defpackage.zp3 r12, long r13, int r15, int r16) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r5
            r0.e = r8
            r0.f = r9
            r0.g = r11
            r0.h = r12
            r0.i = r15
            r1 = r16
            r0.j = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.m = r1
            int r1 = r8.size()
            r2 = 0
            r3 = r2
            r5 = r3
        L24:
            if (r3 >= r1) goto L35
            java.lang.Object r6 = r8.get(r3)
            dx4 r6 = (defpackage.dx4) r6
            int r6 = r6.B
            int r5 = java.lang.Math.max(r5, r6)
            int r3 = r3 + 1
            goto L24
        L35:
            r0.k = r5
            int r4 = r4 + r5
            if (r4 >= 0) goto L3b
            goto L3c
        L3b:
            r2 = r4
        L3c:
            r0.l = r2
            int r1 = r0.c
            long r1 = (long) r1
            r3 = 32
            long r1 = r1 << r3
            long r3 = (long) r5
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r1 = r1 | r3
            r0.n = r1
            r1 = 0
            r0.o = r1
            r1 = -1
            r0.p = r1
            r0.q = r1
            return
    }

    @Override // defpackage.gq3
    public final int a() {
            r0 = this;
            java.util.List r0 = r0.e
            int r0 = r0.size()
            return r0
    }

    @Override // defpackage.gq3
    public final int b() {
            r0 = this;
            int r0 = r0.l
            return r0
    }

    @Override // defpackage.gq3
    public final int c() {
            r0 = this;
            int r0 = r0.j
            return r0
    }

    @Override // defpackage.gq3
    public final java.lang.Object d(int r1) {
            r0 = this;
            java.util.List r0 = r0.e
            java.lang.Object r0 = r0.get(r1)
            dx4 r0 = (defpackage.dx4) r0
            java.lang.Object r0 = r0.B()
            return r0
    }

    @Override // defpackage.gq3
    public final boolean e() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.gq3
    public final void f() {
            r1 = this;
            r0 = 1
            r1.r = r0
            return
    }

    @Override // defpackage.gq3
    public final void g(int r8, int r9, int r10) {
            r7 = this;
            r5 = -1
            r6 = -1
            r2 = 0
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            r0.k(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // defpackage.gq3
    public final int getIndex() {
            r0 = this;
            int r0 = r0.a
            return r0
    }

    @Override // defpackage.gq3
    public final java.lang.Object getKey() {
            r0 = this;
            java.lang.Object r0 = r0.b
            return r0
    }

    @Override // defpackage.gq3
    public final long h(int r1) {
            r0 = this;
            long r0 = r0.o
            return r0
    }

    @Override // defpackage.gq3
    public final int i() {
            r0 = this;
            int r0 = r0.i
            return r0
    }

    public final void j(defpackage.cx4 r9) {
            r8 = this;
            int r0 = r8.m
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            goto Lc
        L7:
            java.lang.String r0 = "position() should be called first"
            defpackage.s53.a(r0)
        Lc:
            java.util.List r0 = r8.e
            int r1 = r0.size()
            r2 = 0
        L13:
            if (r2 >= r1) goto L32
            java.lang.Object r3 = r0.get(r2)
            dx4 r3 = (defpackage.dx4) r3
            int r4 = r3.B
            long r4 = r8.o
            zp3 r6 = r8.h
            java.lang.Object r7 = r8.b
            r6.b(r2, r7)
            long r6 = r8.f
            long r4 = defpackage.i93.c(r4, r6)
            defpackage.cx4.r(r9, r3, r4)
            int r2 = r2 + 1
            goto L13
        L32:
            return
    }

    public final void k(int r5, int r6, int r7, int r8, int r9, int r10) {
            r4 = this;
            r4.m = r8
            kk3 r8 = r4.d
            kk3 r0 = defpackage.kk3.Rtl
            if (r8 != r0) goto Ld
            int r7 = r7 - r6
            int r6 = r4.c
            int r6 = r7 - r6
        Ld:
            long r6 = (long) r6
            r8 = 32
            long r6 = r6 << r8
            long r0 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r5 = r6 | r0
            r4.o = r5
            r4.p = r9
            r4.q = r10
            return
    }
}

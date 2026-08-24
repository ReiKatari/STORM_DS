package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kr3  reason: default package */
/* loaded from: classes.dex */
public final class kr3 implements defpackage.gq3 {
    public final int a;
    public final java.util.List b;
    public final boolean c;
    public final defpackage.c40 d;
    public final defpackage.d40 e;
    public final defpackage.kk3 f;
    public final int g;
    public final long h;
    public final java.lang.Object i;
    public final java.lang.Object j;
    public final defpackage.zp3 k;
    public int l;
    public final int m;
    public final int n;
    public final int o;
    public boolean p;
    public int q;
    public final int[] r;

    public kr3(int r4, java.util.List r5, boolean r6, defpackage.c40 r7, defpackage.d40 r8, defpackage.kk3 r9, int r10, int r11, int r12, long r13, java.lang.Object r15, java.lang.Object r16, defpackage.zp3 r17, long r18) {
            r3 = this;
            r3.<init>()
            r3.a = r4
            r3.b = r5
            r3.c = r6
            r3.d = r7
            r3.e = r8
            r3.f = r9
            r3.g = r12
            r3.h = r13
            r3.i = r15
            r4 = r16
            r3.j = r4
            r4 = r17
            r3.k = r4
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.q = r4
            int r4 = r5.size()
            r6 = 0
            r7 = r6
            r8 = r7
            r9 = r8
        L29:
            if (r7 >= r4) goto L49
            java.lang.Object r0 = r5.get(r7)
            dx4 r0 = (defpackage.dx4) r0
            boolean r1 = r3.c
            if (r1 == 0) goto L38
            int r2 = r0.B
            goto L3a
        L38:
            int r2 = r0.A
        L3a:
            int r8 = r8 + r2
            if (r1 != 0) goto L40
            int r0 = r0.B
            goto L42
        L40:
            int r0 = r0.A
        L42:
            int r9 = java.lang.Math.max(r9, r0)
            int r7 = r7 + 1
            goto L29
        L49:
            r3.m = r8
            int r4 = r3.g
            int r8 = r8 + r4
            if (r8 >= 0) goto L51
            goto L52
        L51:
            r6 = r8
        L52:
            r3.n = r6
            r3.o = r9
            java.util.List r4 = r3.b
            int r4 = r4.size()
            int r4 = r4 * 2
            int[] r4 = new int[r4]
            r3.r = r4
            return
    }

    @Override // defpackage.gq3
    public final int a() {
            r0 = this;
            java.util.List r0 = r0.b
            int r0 = r0.size()
            return r0
    }

    @Override // defpackage.gq3
    public final int b() {
            r0 = this;
            int r0 = r0.n
            return r0
    }

    @Override // defpackage.gq3
    public final int c() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.gq3
    public final java.lang.Object d(int r1) {
            r0 = this;
            java.util.List r0 = r0.b
            java.lang.Object r0 = r0.get(r1)
            dx4 r0 = (defpackage.dx4) r0
            java.lang.Object r0 = r0.B()
            return r0
    }

    @Override // defpackage.gq3
    public final boolean e() {
            r0 = this;
            boolean r0 = r0.c
            return r0
    }

    @Override // defpackage.gq3
    public final void f() {
            r1 = this;
            r0 = 1
            r1.p = r0
            return
    }

    @Override // defpackage.gq3
    public final void g(int r1, int r2, int r3) {
            r0 = this;
            r0.k(r1, r2, r3)
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
            java.lang.Object r0 = r0.i
            return r0
    }

    @Override // defpackage.gq3
    public final long h(int r6) {
            r5 = this;
            r0 = 32
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r6 != 0) goto L1d
            java.util.List r3 = r5.b
            int r3 = r3.size()
            if (r3 != 0) goto L1d
            int r6 = r5.l
            boolean r5 = r5.c
            if (r5 == 0) goto L1a
            long r5 = (long) r6
            long r5 = r5 & r1
            return r5
        L1a:
            long r5 = (long) r6
            long r5 = r5 << r0
            return r5
        L1d:
            int r6 = r6 * 2
            int[] r5 = r5.r
            r3 = r5[r6]
            int r6 = r6 + 1
            r5 = r5[r6]
            long r3 = (long) r3
            long r3 = r3 << r0
            long r5 = (long) r5
            long r5 = r5 & r1
            long r5 = r5 | r3
            return r5
    }

    @Override // defpackage.gq3
    public final int i() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final void j(defpackage.cx4 r10) {
            r9 = this;
            int r0 = r9.q
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            goto Lc
        L7:
            java.lang.String r0 = "position() should be called first"
            defpackage.s53.a(r0)
        Lc:
            java.util.List r0 = r9.b
            int r1 = r0.size()
            r2 = 0
        L13:
            if (r2 >= r1) goto L41
            java.lang.Object r3 = r0.get(r2)
            dx4 r3 = (defpackage.dx4) r3
            boolean r4 = r9.c
            if (r4 == 0) goto L22
            int r5 = r3.B
            goto L24
        L22:
            int r5 = r3.A
        L24:
            long r5 = r9.h(r2)
            zp3 r7 = r9.k
            java.lang.Object r8 = r9.i
            r7.b(r2, r8)
            long r7 = r9.h
            long r5 = defpackage.i93.c(r5, r7)
            if (r4 == 0) goto L3b
            defpackage.cx4.r(r10, r3, r5)
            goto L3e
        L3b:
            defpackage.cx4.n(r10, r3, r5)
        L3e:
            int r2 = r2 + 1
            goto L13
        L41:
            return
    }

    public final void k(int r11, int r12, int r13) {
            r10 = this;
            r10.l = r11
            boolean r0 = r10.c
            if (r0 == 0) goto L8
            r1 = r13
            goto L9
        L8:
            r1 = r12
        L9:
            r10.q = r1
            java.util.List r1 = r10.b
            int r2 = r1.size()
            r3 = 0
        L12:
            if (r3 >= r2) goto L5a
            java.lang.Object r4 = r1.get(r3)
            dx4 r4 = (defpackage.dx4) r4
            int r5 = r3 * 2
            int[] r6 = r10.r
            if (r0 == 0) goto L3d
            c40 r7 = r10.d
            if (r7 == 0) goto L36
            int r8 = r4.A
            kk3 r9 = r10.f
            int r7 = r7.a(r8, r12, r9)
            r6[r5] = r7
            int r5 = r5 + 1
            r6[r5] = r11
            int r4 = r4.B
        L34:
            int r11 = r11 + r4
            goto L50
        L36:
            java.lang.String r10 = "null horizontalAlignment when isVertical == true"
            ug r10 = defpackage.lb1.c(r10)
            throw r10
        L3d:
            r6[r5] = r11
            int r5 = r5 + 1
            d40 r7 = r10.e
            if (r7 == 0) goto L53
            int r8 = r4.B
            int r7 = r7.a(r8, r13)
            r6[r5] = r7
            int r4 = r4.A
            goto L34
        L50:
            int r3 = r3 + 1
            goto L12
        L53:
            java.lang.String r10 = "null verticalAlignment when isVertical == false"
            ug r10 = defpackage.lb1.c(r10)
            throw r10
        L5a:
            return
    }
}

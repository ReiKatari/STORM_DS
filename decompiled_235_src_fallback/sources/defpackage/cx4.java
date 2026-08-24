package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cx4  reason: default package */
/* loaded from: classes.dex */
public abstract class cx4 implements defpackage.qh1 {
    public boolean A;

    public static final void b(defpackage.cx4 r1, defpackage.dx4 r2) {
            r1.getClass()
            boolean r0 = r2 instanceof defpackage.z74
            if (r0 == 0) goto Le
            z74 r2 = (defpackage.z74) r2
            boolean r1 = r1.A
            r2.H(r1)
        Le:
            return
    }

    public static void j(defpackage.cx4 r4, defpackage.dx4 r5, int r6, int r7) {
            r4.getClass()
            long r0 = (long) r6
            r6 = 32
            long r0 = r0 << r6
            long r6 = (long) r7
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            long r6 = r6 | r0
            b(r4, r5)
            long r0 = r5.X
            long r6 = defpackage.i93.c(r6, r0)
            r4 = 0
            r0 = 0
            r5.h0(r6, r0, r4)
            return
    }

    public static void k(defpackage.cx4 r2, defpackage.dx4 r3, long r4) {
            r2.getClass()
            b(r2, r3)
            long r0 = r3.X
            long r4 = defpackage.i93.c(r4, r0)
            r2 = 0
            r0 = 0
            r3.h0(r4, r2, r0)
            return
    }

    public static void l(defpackage.cx4 r9, defpackage.dx4 r10, int r11, int r12) {
            long r0 = (long) r11
            r11 = 32
            long r0 = r0 << r11
            long r2 = (long) r12
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            kk3 r12 = r9.f()
            kk3 r2 = defpackage.kk3.Ltr
            r3 = 0
            r6 = 0
            if (r12 == r2) goto L3d
            int r12 = r9.i()
            if (r12 != 0) goto L1d
            goto L3d
        L1d:
            int r12 = r9.i()
            int r2 = r10.A
            int r12 = r12 - r2
            long r7 = r0 >> r11
            int r2 = (int) r7
            int r12 = r12 - r2
            long r0 = r0 & r4
            int r0 = (int) r0
            long r1 = (long) r12
            long r11 = r1 << r11
            long r0 = (long) r0
            long r0 = r0 & r4
            long r11 = r11 | r0
            b(r9, r10)
            long r0 = r10.X
            long r11 = defpackage.i93.c(r11, r0)
            r10.h0(r11, r3, r6)
            return
        L3d:
            b(r9, r10)
            long r11 = r10.X
            long r11 = defpackage.i93.c(r0, r11)
            r10.h0(r11, r3, r6)
            return
    }

    public static void m(defpackage.cx4 r9, defpackage.dx4 r10, int r11, int r12) {
            int r0 = defpackage.ex4.b
            hh2 r0 = defpackage.hh2.n0
            long r1 = (long) r11
            r11 = 32
            long r1 = r1 << r11
            long r3 = (long) r12
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r1 = r1 | r3
            kk3 r12 = r9.f()
            kk3 r3 = defpackage.kk3.Ltr
            r4 = 0
            if (r12 == r3) goto L40
            int r12 = r9.i()
            if (r12 != 0) goto L20
            goto L40
        L20:
            int r12 = r9.i()
            int r3 = r10.A
            int r12 = r12 - r3
            long r7 = r1 >> r11
            int r3 = (int) r7
            int r12 = r12 - r3
            long r1 = r1 & r5
            int r1 = (int) r1
            long r2 = (long) r12
            long r11 = r2 << r11
            long r1 = (long) r1
            long r1 = r1 & r5
            long r11 = r11 | r1
            b(r9, r10)
            long r1 = r10.X
            long r11 = defpackage.i93.c(r11, r1)
            r10.h0(r11, r4, r0)
            return
        L40:
            b(r9, r10)
            long r11 = r10.X
            long r11 = defpackage.i93.c(r1, r11)
            r10.h0(r11, r4, r0)
            return
    }

    public static void n(defpackage.cx4 r8, defpackage.dx4 r9, long r10) {
            int r0 = defpackage.ex4.b
            hh2 r0 = defpackage.hh2.n0
            kk3 r1 = r8.f()
            kk3 r2 = defpackage.kk3.Ltr
            r3 = 0
            if (r1 == r2) goto L3b
            int r1 = r8.i()
            if (r1 != 0) goto L14
            goto L3b
        L14:
            int r1 = r8.i()
            int r2 = r9.A
            int r1 = r1 - r2
            r2 = 32
            long r4 = r10 >> r2
            int r4 = (int) r4
            int r1 = r1 - r4
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r4
            int r10 = (int) r10
            long r6 = (long) r1
            long r1 = r6 << r2
            long r10 = (long) r10
            long r10 = r10 & r4
            long r10 = r10 | r1
            b(r8, r9)
            long r1 = r9.X
            long r10 = defpackage.i93.c(r10, r1)
            r9.h0(r10, r3, r0)
            return
        L3b:
            b(r8, r9)
            long r1 = r9.X
            long r10 = defpackage.i93.c(r10, r1)
            r9.h0(r10, r3, r0)
            return
    }

    public static void o(defpackage.cx4 r4, defpackage.dx4 r5, int r6, int r7, defpackage.qn2 r8, int r9) {
            r9 = r9 & 8
            if (r9 == 0) goto L8
            int r8 = defpackage.ex4.b
            hh2 r8 = defpackage.hh2.n0
        L8:
            r4.getClass()
            long r0 = (long) r6
            r6 = 32
            long r0 = r0 << r6
            long r6 = (long) r7
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            long r6 = r6 | r0
            b(r4, r5)
            long r0 = r5.X
            long r6 = defpackage.i93.c(r6, r0)
            r4 = 0
            r5.h0(r6, r4, r8)
            return
    }

    public static void r(defpackage.cx4 r3, defpackage.dx4 r4, long r5) {
            int r0 = defpackage.ex4.b
            hh2 r0 = defpackage.hh2.n0
            r3.getClass()
            b(r3, r4)
            long r1 = r4.X
            long r5 = defpackage.i93.c(r5, r1)
            r3 = 0
            r4.h0(r5, r3, r0)
            return
    }

    public float c(defpackage.hy2 r1) {
            r0 = this;
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
    }

    public abstract defpackage.jk3 d();

    public abstract defpackage.kk3 f();

    public abstract int i();
}

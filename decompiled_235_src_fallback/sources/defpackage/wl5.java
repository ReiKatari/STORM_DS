package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wl5  reason: default package */
/* loaded from: classes.dex */
public final class wl5 implements java.io.Closeable {
    public final defpackage.pa A;
    public final defpackage.k55 B;
    public final java.lang.String L;
    public final int R;
    public final defpackage.pv2 X;
    public final defpackage.yw2 Y;
    public final defpackage.yl5 Z;
    public final defpackage.rm6 d0;
    public final defpackage.wl5 e0;
    public final defpackage.wl5 f0;
    public final defpackage.wl5 g0;
    public final long h0;
    public final long i0;
    public final defpackage.bk1 j0;
    public final defpackage.a97 k0;
    public defpackage.ma0 l0;
    public final boolean m0;

    public wl5(defpackage.pa r1, defpackage.k55 r2, java.lang.String r3, int r4, defpackage.pv2 r5, defpackage.yw2 r6, defpackage.yl5 r7, defpackage.rm6 r8, defpackage.wl5 r9, defpackage.wl5 r10, defpackage.wl5 r11, long r12, long r14, defpackage.bk1 r16, defpackage.a97 r17) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r7.getClass()
            r17.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            r0.Y = r6
            r0.Z = r7
            r0.d0 = r8
            r0.e0 = r9
            r0.f0 = r10
            r0.g0 = r11
            r0.h0 = r12
            r0.i0 = r14
            r1 = r16
            r0.j0 = r1
            r1 = r17
            r0.k0 = r1
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r1 > r4) goto L3e
            r1 = 300(0x12c, float:4.2E-43)
            if (r4 >= r1) goto L3e
            r2 = 1
        L3e:
            r0.m0 = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            yl5 r0 = r0.Z
            r0.close()
            return
    }

    public final defpackage.ma0 e() {
            r1 = this;
            ma0 r0 = r1.l0
            if (r0 != 0) goto Le
            ma0 r0 = defpackage.ma0.n
            yw2 r0 = r1.Y
            ma0 r0 = defpackage.u24.C(r0)
            r1.l0 = r0
        Le:
            return r0
    }

    public final defpackage.ul5 h() {
            r3 = this;
            ul5 r0 = new ul5
            r0.<init>()
            r1 = -1
            r0.c = r1
            xl5 r1 = defpackage.yl5.A
            r0.g = r1
            jd1 r1 = defpackage.a97.F
            r0.o = r1
            pa r1 = r3.A
            r0.a = r1
            k55 r1 = r3.B
            r0.b = r1
            int r1 = r3.R
            r0.c = r1
            java.lang.String r1 = r3.L
            r0.d = r1
            pv2 r1 = r3.X
            r0.e = r1
            yw2 r1 = r3.Y
            ww2 r1 = r1.c()
            r0.f = r1
            yl5 r1 = r3.Z
            r0.g = r1
            rm6 r1 = r3.d0
            r0.h = r1
            wl5 r1 = r3.e0
            r0.i = r1
            wl5 r1 = r3.f0
            r0.j = r1
            wl5 r1 = r3.g0
            r0.k = r1
            long r1 = r3.h0
            r0.l = r1
            long r1 = r3.i0
            r0.m = r1
            bk1 r1 = r3.j0
            r0.n = r1
            a97 r3 = r3.k0
            r0.o = r3
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Response{protocol="
            r0.<init>(r1)
            k55 r1 = r2.B
            r0.append(r1)
            java.lang.String r1 = ", code="
            r0.append(r1)
            int r1 = r2.R
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = r2.L
            r0.append(r1)
            java.lang.String r1 = ", url="
            r0.append(r1)
            pa r2 = r2.A
            java.lang.Object r2 = r2.B
            i03 r2 = (defpackage.i03) r2
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

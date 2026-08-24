package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lw  reason: default package */
/* loaded from: classes.dex */
public final class lw extends defpackage.sr4 implements defpackage.bj5 {
    public static final defpackage.k4 p0 = null;
    public defpackage.o41 X;
    public final defpackage.tp6 Y;
    public final defpackage.vs4 Z;
    public final defpackage.rs4 d0;
    public final defpackage.vs4 e0;
    public defpackage.hw f0;
    public defpackage.sr4 g0;
    public defpackage.qn2 h0;
    public defpackage.qn2 i0;
    public defpackage.z31 j0;
    public int k0;
    public boolean l0;
    public final defpackage.vs4 m0;
    public final defpackage.vs4 n0;
    public final defpackage.vs4 o0;

    static {
            k4 r0 = new k4
            r1 = 13
            r0.<init>(r1)
            defpackage.lw.p0 = r0
            return
    }

    public lw(defpackage.z23 r4, defpackage.pe5 r5) {
            r3 = this;
            r3.<init>()
            xi6 r0 = new xi6
            r1 = 0
            r0.<init>(r1)
            tp6 r0 = defpackage.up6.a(r0)
            r3.Y = r0
            r0 = 0
            vs4 r1 = defpackage.np2.Y(r0)
            r3.Z = r1
            rs4 r1 = new rs4
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2)
            r3.d0 = r1
            vs4 r0 = defpackage.np2.Y(r0)
            r3.e0 = r0
            dw r0 = defpackage.dw.a
            r3.f0 = r0
            k4 r1 = defpackage.lw.p0
            r3.h0 = r1
            w31 r1 = defpackage.y31.b
            r3.j0 = r1
            r1 = 1
            r3.k0 = r1
            vs4 r0 = defpackage.np2.Y(r0)
            r3.m0 = r0
            vs4 r4 = defpackage.np2.Y(r4)
            r3.n0 = r4
            vs4 r4 = defpackage.np2.Y(r5)
            r3.o0 = r4
            return
    }

    @Override // defpackage.bj5
    public final void a() {
            r2 = this;
            o41 r0 = r2.X
            r1 = 0
            if (r0 == 0) goto L8
            defpackage.g04.x(r0, r1)
        L8:
            r2.X = r1
            sr4 r2 = r2.g0
            boolean r0 = r2 instanceof defpackage.bj5
            if (r0 == 0) goto L13
            r1 = r2
            bj5 r1 = (defpackage.bj5) r1
        L13:
            if (r1 == 0) goto L18
            r1.a()
        L18:
            return
    }

    @Override // defpackage.bj5
    public final void b() {
            r2 = this;
            o41 r0 = r2.X
            r1 = 0
            if (r0 == 0) goto L8
            defpackage.g04.x(r0, r1)
        L8:
            r2.X = r1
            sr4 r2 = r2.g0
            boolean r0 = r2 instanceof defpackage.bj5
            if (r0 == 0) goto L13
            r1 = r2
            bj5 r1 = (defpackage.bj5) r1
        L13:
            if (r1 == 0) goto L18
            r1.b()
        L18:
            return
    }

    @Override // defpackage.bj5
    public final void c() {
            r4 = this;
            java.lang.String r0 = "AsyncImagePainter.onRemembered"
            android.os.Trace.beginSection(r0)
            o41 r0 = r4.X     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L6d
            gu6 r0 = defpackage.oi2.c()     // Catch: java.lang.Throwable -> L71
            xe1 r1 = defpackage.xk1.a     // Catch: java.lang.Throwable -> L71
            jv2 r1 = defpackage.e04.a     // Catch: java.lang.Throwable -> L71
            jv2 r1 = r1.Y     // Catch: java.lang.Throwable -> L71
            l61 r0 = defpackage.jw2.y(r0, r1)     // Catch: java.lang.Throwable -> L71
            o41 r0 = defpackage.g04.i(r0)     // Catch: java.lang.Throwable -> L71
            r4.X = r0     // Catch: java.lang.Throwable -> L71
            sr4 r1 = r4.g0     // Catch: java.lang.Throwable -> L71
            boolean r2 = r1 instanceof defpackage.bj5     // Catch: java.lang.Throwable -> L71
            r3 = 0
            if (r2 == 0) goto L27
            bj5 r1 = (defpackage.bj5) r1     // Catch: java.lang.Throwable -> L71
            goto L28
        L27:
            r1 = r3
        L28:
            if (r1 == 0) goto L2d
            r1.c()     // Catch: java.lang.Throwable -> L71
        L2d:
            boolean r1 = r4.l0     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L64
            vs4 r0 = r4.n0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            z23 r0 = (defpackage.z23) r0     // Catch: java.lang.Throwable -> L71
            x23 r0 = defpackage.z23.a(r0)     // Catch: java.lang.Throwable -> L71
            vs4 r1 = r4.o0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L71
            pe5 r1 = (defpackage.pe5) r1     // Catch: java.lang.Throwable -> L71
            we1 r1 = r1.b     // Catch: java.lang.Throwable -> L71
            r0.b = r1     // Catch: java.lang.Throwable -> L71
            r0.v = r3     // Catch: java.lang.Throwable -> L71
            z23 r0 = r0.a()     // Catch: java.lang.Throwable -> L71
            fw r1 = new fw     // Catch: java.lang.Throwable -> L71
            we1 r0 = r0.B     // Catch: java.lang.Throwable -> L71
            android.graphics.drawable.Drawable r0 = r0.j     // Catch: java.lang.Throwable -> L71
            we1 r2 = defpackage.h.a     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L5d
            sr4 r3 = r4.j(r0)     // Catch: java.lang.Throwable -> L71
        L5d:
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L71
            r4.k(r1)     // Catch: java.lang.Throwable -> L71
            goto L6d
        L64:
            a6 r1 = new a6     // Catch: java.lang.Throwable -> L71
            r2 = 3
            r1.<init>(r4, r3, r2)     // Catch: java.lang.Throwable -> L71
            defpackage.hv.L(r0, r3, r3, r1, r2)     // Catch: java.lang.Throwable -> L71
        L6d:
            android.os.Trace.endSection()
            return
        L71:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
    }

    @Override // defpackage.sr4
    public final void d(float r1) {
            r0 = this;
            rs4 r0 = r0.d0
            r0.i(r1)
            return
    }

    @Override // defpackage.sr4
    public final void e(defpackage.z40 r1) {
            r0 = this;
            vs4 r0 = r0.e0
            r0.setValue(r1)
            return
    }

    @Override // defpackage.sr4
    public final long h() {
            r2 = this;
            vs4 r2 = r2.Z
            java.lang.Object r2 = r2.getValue()
            sr4 r2 = (defpackage.sr4) r2
            if (r2 == 0) goto Lf
            long r0 = r2.h()
            return r0
        Lf:
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            return r0
    }

    @Override // defpackage.sr4
    public final void i(defpackage.um3 r9) {
            r8 = this;
            zj0 r0 = r9.A
            long r1 = r0.e()
            xi6 r3 = new xi6
            r3.<init>(r1)
            tp6 r1 = r8.Y
            r1.getClass()
            r2 = 0
            r1.m(r2, r3)
            vs4 r1 = r8.Z
            java.lang.Object r1 = r1.getValue()
            r2 = r1
            sr4 r2 = (defpackage.sr4) r2
            if (r2 == 0) goto L36
            long r4 = r0.e()
            rs4 r0 = r8.d0
            float r6 = r0.h()
            vs4 r8 = r8.e0
            java.lang.Object r8 = r8.getValue()
            r7 = r8
            z40 r7 = (defpackage.z40) r7
            r3 = r9
            r2.g(r3, r4, r6, r7)
        L36:
            return
    }

    public final defpackage.sr4 j(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L16
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            android.graphics.Bitmap r2 = r2.getBitmap()
            zh r0 = new zh
            r0.<init>(r2)
            int r1 = r1.k0
            w40 r1 = defpackage.g04.h(r0, r1)
            return r1
        L16:
            uo1 r1 = new uo1
            android.graphics.drawable.Drawable r2 = r2.mutate()
            r1.<init>(r2)
            return r1
    }

    public final void k(defpackage.hw r13) {
            r12 = this;
            hw r0 = r12.f0
            qn2 r1 = r12.h0
            java.lang.Object r13 = r1.g(r13)
            hw r13 = (defpackage.hw) r13
            r12.f0 = r13
            vs4 r1 = r12.m0
            r1.setValue(r13)
            boolean r1 = r13 instanceof defpackage.gw
            r2 = 0
            if (r1 == 0) goto L1c
            r1 = r13
            gw r1 = (defpackage.gw) r1
            bu6 r1 = r1.b
            goto L25
        L1c:
            boolean r1 = r13 instanceof defpackage.ew
            if (r1 == 0) goto L60
            r1 = r13
            ew r1 = (defpackage.ew) r1
            b62 r1 = r1.b
        L25:
            z23 r3 = r1.b()
            x97 r3 = r3.i
            mw r4 = defpackage.nw7.A
            fa7 r3 = r3.a(r4, r1)
            boolean r4 = r3 instanceof defpackage.t71
            if (r4 == 0) goto L60
            sr4 r4 = r0.a()
            boolean r5 = r0 instanceof defpackage.fw
            if (r5 == 0) goto L3f
            r7 = r4
            goto L40
        L3f:
            r7 = r2
        L40:
            sr4 r8 = r13.a()
            z31 r9 = r12.j0
            t71 r3 = (defpackage.t71) r3
            int r10 = r3.c
            boolean r3 = r1 instanceof defpackage.bu6
            if (r3 == 0) goto L58
            bu6 r1 = (defpackage.bu6) r1
            boolean r1 = r1.g
            if (r1 != 0) goto L55
            goto L58
        L55:
            r1 = 0
        L56:
            r11 = r1
            goto L5a
        L58:
            r1 = 1
            goto L56
        L5a:
            r71 r6 = new r71
            r6.<init>(r7, r8, r9, r10, r11)
            goto L61
        L60:
            r6 = r2
        L61:
            if (r6 == 0) goto L64
            goto L68
        L64:
            sr4 r6 = r13.a()
        L68:
            r12.g0 = r6
            vs4 r1 = r12.Z
            r1.setValue(r6)
            o41 r1 = r12.X
            if (r1 == 0) goto L9e
            sr4 r1 = r0.a()
            sr4 r3 = r13.a()
            if (r1 == r3) goto L9e
            sr4 r0 = r0.a()
            boolean r1 = r0 instanceof defpackage.bj5
            if (r1 == 0) goto L88
            bj5 r0 = (defpackage.bj5) r0
            goto L89
        L88:
            r0 = r2
        L89:
            if (r0 == 0) goto L8e
            r0.b()
        L8e:
            sr4 r0 = r13.a()
            boolean r1 = r0 instanceof defpackage.bj5
            if (r1 == 0) goto L99
            r2 = r0
            bj5 r2 = (defpackage.bj5) r2
        L99:
            if (r2 == 0) goto L9e
            r2.c()
        L9e:
            qn2 r12 = r12.i0
            if (r12 == 0) goto La5
            r12.g(r13)
        La5:
            return
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hz2  reason: default package */
/* loaded from: classes.dex */
public final class hz2 implements defpackage.v62 {
    public static final defpackage.yw2 f = null;
    public final defpackage.xk4 a;
    public final defpackage.u62 b;
    public final defpackage.bt c;
    public int d;
    public final defpackage.kk e;

    static {
            yw2 r0 = defpackage.yw2.B
            java.lang.String r0 = "OkHttp-Response-Body"
            java.lang.String r1 = "Truncated"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            yw2 r0 = defpackage.ln2.R(r0)
            defpackage.hz2.f = r0
            return
    }

    public hz2(defpackage.xk4 r1, defpackage.u62 r2, defpackage.bt r3) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            kk r1 = new kk
            java.lang.Object r2 = r3.L
            fe5 r2 = (defpackage.fe5) r2
            r1.<init>(r2)
            r0.e = r1
            return
    }

    @Override // defpackage.v62
    public final defpackage.in6 a(defpackage.wl5 r11) {
            r10 = this;
            pa r0 = r11.A
            boolean r1 = defpackage.zz2.a(r11)
            if (r1 != 0) goto L13
            java.lang.Object r11 = r0.B
            i03 r11 = (defpackage.i03) r11
            r0 = 0
            fz2 r10 = r10.k(r11, r0)
            return r10
        L13:
            java.lang.String r1 = "Transfer-Encoding"
            yw2 r2 = r11.Y
            java.lang.String r1 = r2.a(r1)
            r2 = 0
            if (r1 != 0) goto L1f
            r1 = r2
        L1f:
            java.lang.String r3 = "chunked"
            boolean r1 = r3.equalsIgnoreCase(r1)
            java.lang.String r3 = "state: "
            r4 = 5
            r5 = 4
            if (r1 == 0) goto L41
            java.lang.Object r11 = r0.B
            i03 r11 = (defpackage.i03) r11
            int r0 = r10.d
            if (r0 != r5) goto L3b
            r10.d = r4
            ez2 r0 = new ez2
            r0.<init>(r10, r11)
            return r0
        L3b:
            int r10 = r10.d
            defpackage.u34.u(r10, r3)
            return r2
        L41:
            long r6 = defpackage.az7.e(r11)
            r8 = -1
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 == 0) goto L54
            java.lang.Object r11 = r0.B
            i03 r11 = (defpackage.i03) r11
            fz2 r10 = r10.k(r11, r6)
            return r10
        L54:
            java.lang.Object r11 = r0.B
            i03 r11 = (defpackage.i03) r11
            int r0 = r10.d
            if (r0 != r5) goto L6c
            r10.d = r4
            u62 r0 = r10.b
            r0.e()
            gz2 r0 = new gz2
            r11.getClass()
            r0.<init>(r10, r11)
            return r0
        L6c:
            int r10 = r10.d
            defpackage.u34.u(r10, r3)
            return r2
    }

    @Override // defpackage.v62
    public final void b() {
            r0 = this;
            bt r0 = r0.c
            java.lang.Object r0 = r0.R
            ee5 r0 = (defpackage.ee5) r0
            r0.flush()
            return
    }

    @Override // defpackage.v62
    public final boolean c() {
            r1 = this;
            int r1 = r1.d
            r0 = 6
            if (r1 != r0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }

    @Override // defpackage.v62
    public final void cancel() {
            r0 = this;
            u62 r0 = r0.b
            r0.cancel()
            return
    }

    @Override // defpackage.v62
    public final long d(defpackage.wl5 r2) {
            r1 = this;
            boolean r1 = defpackage.zz2.a(r2)
            if (r1 != 0) goto L9
            r1 = 0
            return r1
        L9:
            yw2 r1 = r2.Y
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r1 = r1.a(r0)
            if (r1 != 0) goto L14
            r1 = 0
        L14:
            java.lang.String r0 = "chunked"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L1f
            r1 = -1
            return r1
        L1f:
            long r1 = defpackage.az7.e(r2)
            return r1
    }

    @Override // defpackage.v62
    public final defpackage.ui6 e(defpackage.pa r7, long r8) {
            r6 = this;
            r7.getClass()
            java.lang.Object r7 = r7.R
            yw2 r7 = (defpackage.yw2) r7
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r7 = r7.a(r0)
            java.lang.String r0 = "chunked"
            boolean r7 = r0.equalsIgnoreCase(r7)
            r0 = 0
            java.lang.String r1 = "state: "
            r2 = 2
            r3 = 1
            if (r7 == 0) goto L2c
            int r7 = r6.d
            if (r7 != r3) goto L26
            r6.d = r2
            dz2 r7 = new dz2
            r7.<init>(r6)
            return r7
        L26:
            int r6 = r6.d
            defpackage.u34.u(r6, r1)
            return r0
        L2c:
            r4 = -1
            int r7 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r7 == 0) goto L44
            int r7 = r6.d
            if (r7 != r3) goto L3e
            r6.d = r2
            tg1 r7 = new tg1
            r7.<init>(r6)
            return r7
        L3e:
            int r6 = r6.d
            defpackage.u34.u(r6, r1)
            return r0
        L44:
            java.lang.String r6 = "Cannot stream a request body without chunked encoding or a known content length!"
            defpackage.i.m(r6)
            return r0
    }

    @Override // defpackage.v62
    public final defpackage.ul5 f(boolean r12) {
            r11 = this;
            kk r0 = r11.e
            int r1 = r11.d
            r2 = 0
            r3 = 3
            if (r1 == 0) goto L19
            r4 = 1
            if (r1 == r4) goto L19
            r4 = 2
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            goto L19
        L11:
            java.lang.String r12 = "state: "
            int r11 = r11.d
            defpackage.u34.u(r11, r12)
            return r2
        L19:
            java.lang.Object r1 = r0.L     // Catch: java.io.EOFException -> L7f
            z80 r1 = (defpackage.z80) r1     // Catch: java.io.EOFException -> L7f
            long r4 = r0.B     // Catch: java.io.EOFException -> L7f
            java.lang.String r1 = r1.y(r4)     // Catch: java.io.EOFException -> L7f
            long r4 = r0.B     // Catch: java.io.EOFException -> L7f
            int r6 = r1.length()     // Catch: java.io.EOFException -> L7f
            long r6 = (long) r6     // Catch: java.io.EOFException -> L7f
            long r4 = r4 - r6
            r0.B = r4     // Catch: java.io.EOFException -> L7f
            ei r1 = defpackage.xk2.E(r1)     // Catch: java.io.EOFException -> L7f
            int r4 = r1.B     // Catch: java.io.EOFException -> L7f
            ul5 r5 = new ul5     // Catch: java.io.EOFException -> L7f
            r5.<init>()     // Catch: java.io.EOFException -> L7f
            java.lang.Object r6 = r1.L     // Catch: java.io.EOFException -> L7f
            k55 r6 = (defpackage.k55) r6     // Catch: java.io.EOFException -> L7f
            r6.getClass()     // Catch: java.io.EOFException -> L7f
            r5.b = r6     // Catch: java.io.EOFException -> L7f
            r5.c = r4     // Catch: java.io.EOFException -> L7f
            java.lang.Object r1 = r1.R     // Catch: java.io.EOFException -> L7f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.io.EOFException -> L7f
            r5.d = r1     // Catch: java.io.EOFException -> L7f
            ww2 r1 = new ww2     // Catch: java.io.EOFException -> L7f
            r6 = 0
            r1.<init>(r6, r6)     // Catch: java.io.EOFException -> L7f
        L4f:
            java.lang.Object r6 = r0.L     // Catch: java.io.EOFException -> L7f
            z80 r6 = (defpackage.z80) r6     // Catch: java.io.EOFException -> L7f
            long r7 = r0.B     // Catch: java.io.EOFException -> L7f
            java.lang.String r6 = r6.y(r7)     // Catch: java.io.EOFException -> L7f
            long r7 = r0.B     // Catch: java.io.EOFException -> L7f
            int r9 = r6.length()     // Catch: java.io.EOFException -> L7f
            long r9 = (long) r9     // Catch: java.io.EOFException -> L7f
            long r7 = r7 - r9
            r0.B = r7     // Catch: java.io.EOFException -> L7f
            int r7 = r6.length()     // Catch: java.io.EOFException -> L7f
            if (r7 != 0) goto L90
            yw2 r0 = r1.f()     // Catch: java.io.EOFException -> L7f
            ww2 r0 = r0.c()     // Catch: java.io.EOFException -> L7f
            r5.f = r0     // Catch: java.io.EOFException -> L7f
            r0 = 100
            if (r12 == 0) goto L7a
            if (r4 != r0) goto L7a
            return r2
        L7a:
            if (r4 != r0) goto L81
            r11.d = r3     // Catch: java.io.EOFException -> L7f
            return r5
        L7f:
            r12 = move-exception
            goto L94
        L81:
            r12 = 102(0x66, float:1.43E-43)
            if (r12 > r4) goto L8c
            r12 = 200(0xc8, float:2.8E-43)
            if (r4 >= r12) goto L8c
            r11.d = r3     // Catch: java.io.EOFException -> L7f
            return r5
        L8c:
            r12 = 4
            r11.d = r12     // Catch: java.io.EOFException -> L7f
            return r5
        L90:
            r1.c(r6)     // Catch: java.io.EOFException -> L7f
            goto L4f
        L94:
            u62 r11 = r11.b
            b26 r11 = r11.h()
            ea r11 = r11.a
            i03 r11 = r11.h
            java.lang.String r11 = r11.g()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "unexpected end of stream on "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11, r12)
            throw r0
    }

    @Override // defpackage.v62
    public final void g() {
            r0 = this;
            bt r0 = r0.c
            java.lang.Object r0 = r0.R
            ee5 r0 = (defpackage.ee5) r0
            r0.flush()
            return
    }

    @Override // defpackage.v62
    public final defpackage.rm6 h() {
            r0 = this;
            bt r0 = r0.c
            return r0
    }

    @Override // defpackage.v62
    public final defpackage.u62 i() {
            r0 = this;
            u62 r0 = r0.b
            return r0
    }

    @Override // defpackage.v62
    public final void j(defpackage.pa r5) {
            r4 = this;
            r5.getClass()
            u62 r0 = r4.b
            b26 r0 = r0.h()
            java.net.Proxy r0 = r0.b
            java.net.Proxy$Type r0 = r0.type()
            r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = r5.L
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            java.lang.Object r2 = r5.B
            i03 r2 = (defpackage.i03) r2
            boolean r3 = r2.f()
            if (r3 != 0) goto L35
            java.net.Proxy$Type r3 = java.net.Proxy.Type.HTTP
            if (r0 != r3) goto L35
            r1.append(r2)
            goto L56
        L35:
            java.lang.String r0 = r2.b()
            java.lang.String r2 = r2.d()
            if (r2 == 0) goto L53
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r0 = 63
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
        L53:
            r1.append(r0)
        L56:
            java.lang.String r0 = " HTTP/1.1"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object r5 = r5.R
            yw2 r5 = (defpackage.yw2) r5
            r4.l(r5, r0)
            return
    }

    public final defpackage.fz2 k(defpackage.i03 r3, long r4) {
            r2 = this;
            int r0 = r2.d
            r1 = 4
            if (r0 != r1) goto Le
            r0 = 5
            r2.d = r0
            fz2 r0 = new fz2
            r0.<init>(r2, r3, r4)
            return r0
        Le:
            java.lang.String r3 = "state: "
            int r2 = r2.d
            defpackage.u34.u(r2, r3)
            r2 = 0
            return r2
    }

    public final void l(defpackage.yw2 r6, java.lang.String r7) {
            r5 = this;
            r6.getClass()
            int r0 = r5.d
            if (r0 != 0) goto L40
            bt r0 = r5.c
            java.lang.Object r1 = r0.R
            ee5 r1 = (defpackage.ee5) r1
            r1.H(r7)
            java.lang.String r7 = "\r\n"
            r1.H(r7)
            int r1 = r6.size()
            r2 = 0
        L1a:
            java.lang.Object r3 = r0.R
            ee5 r3 = (defpackage.ee5) r3
            if (r2 >= r1) goto L39
            java.lang.String r4 = r6.b(r2)
            r3.H(r4)
            java.lang.String r4 = ": "
            r3.H(r4)
            java.lang.String r4 = r6.d(r2)
            r3.H(r4)
            r3.H(r7)
            int r2 = r2 + 1
            goto L1a
        L39:
            r3.H(r7)
            r6 = 1
            r5.d = r6
            return
        L40:
            java.lang.String r6 = "state: "
            int r5 = r5.d
            defpackage.u34.u(r5, r6)
            return
    }
}

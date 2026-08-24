package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jb0  reason: default package */
/* loaded from: classes.dex */
public final class jb0 implements defpackage.v93 {
    public static final defpackage.jb0 b = null;
    public static final defpackage.jb0 c = null;
    public final /* synthetic */ int a;

    static {
            jb0 r0 = new jb0
            r1 = 0
            r0.<init>(r1)
            defpackage.jb0.b = r0
            jb0 r0 = new jb0
            r1 = 1
            r0.<init>(r1)
            defpackage.jb0.c = r0
            return
    }

    public /* synthetic */ jb0(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // defpackage.v93
    public final defpackage.wl5 a(defpackage.dp3 r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            int r0 = r0.a
            r2 = 0
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto Lb8;
                default: goto Lc;
            }
        Lc:
            java.lang.Object r0 = r1.g
            r5 = r0
            je5 r5 = (defpackage.je5) r5
            monitor-enter(r5)
            boolean r0 = r5.l0     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto Lae
            boolean r0 = r5.i0     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto La6
            boolean r0 = r5.h0     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto La6
            boolean r0 = r5.k0     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto La6
            boolean r0 = r5.j0     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto La6
            monitor-exit(r5)
            w62 r0 = r5.d0
            r0.getClass()
            ke5 r6 = r0.a()
            xk4 r7 = r5.A
            r6.getClass()
            r7.getClass()
            int r8 = r1.d
            bt r9 = r6.h
            qz2 r10 = r6.i
            if (r10 == 0) goto L46
            rz2 r8 = new rz2
            r8.<init>(r7, r6, r1, r10)
            goto L70
        L46:
            java.net.Socket r10 = r6.e
            r10.setSoTimeout(r8)
            java.lang.Object r10 = r9.L
            fe5 r10 = (defpackage.fe5) r10
            in6 r10 = r10.A
            b67 r10 = r10.b()
            long r11 = (long) r8
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            r10.g(r11, r8)
            java.lang.Object r10 = r9.R
            ee5 r10 = (defpackage.ee5) r10
            ui6 r10 = r10.A
            b67 r10 = r10.b()
            int r11 = r1.e
            long r11 = (long) r11
            r10.g(r11, r8)
            hz2 r8 = new hz2
            r8.<init>(r7, r6, r9)
        L70:
            bk1 r6 = new bk1
            r0.getClass()
            r6.<init>()
            r6.L = r5
            r6.B = r0
            r6.R = r8
            r5.g0 = r6
            r5.n0 = r6
            monitor-enter(r5)
            r5.h0 = r3     // Catch: java.lang.Throwable -> La1
            r5.i0 = r3     // Catch: java.lang.Throwable -> La1
            monitor-exit(r5)
            boolean r0 = r5.m0
            if (r0 != 0) goto L9b
            r0 = 61
            dp3 r0 = defpackage.dp3.a(r1, r2, r6, r4, r0)
            java.lang.Object r1 = r1.i
            pa r1 = (defpackage.pa) r1
            wl5 r4 = r0.f(r1)
            goto La0
        L9b:
            java.lang.String r0 = "Canceled"
            defpackage.e41.i(r0)
        La0:
            return r4
        La1:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        La4:
            r0 = move-exception
            goto Lb6
        La6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La4
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La4
            throw r0     // Catch: java.lang.Throwable -> La4
        Lae:
            java.lang.String r0 = "released"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La4
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La4
            throw r1     // Catch: java.lang.Throwable -> La4
        Lb6:
            monitor-exit(r5)
            throw r0
        Lb8:
            java.lang.String r5 = "close"
            java.lang.String r6 = "upgrade"
            java.lang.String r7 = "Connection"
            java.lang.Object r0 = r1.h
            r9 = r0
            bk1 r9 = (defpackage.bk1) r9
            r9.getClass()
            java.lang.Object r0 = r9.L
            r8 = r0
            je5 r8 = (defpackage.je5) r8
            java.lang.Object r0 = r9.R
            r15 = r0
            v62 r15 = (defpackage.v62) r15
            java.lang.Object r0 = r1.i
            r1 = r0
            pa r1 = (defpackage.pa) r1
            java.lang.Object r0 = r1.X
            mk5 r0 = (defpackage.mk5) r0
            java.lang.Object r10 = r1.R
            yw2 r10 = (defpackage.yw2) r10
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.Object r13 = r1.L
            java.lang.String r13 = (java.lang.String) r13
            boolean r13 = defpackage.ii2.J(r13)
            if (r13 == 0) goto Lef
            if (r0 == 0) goto Lef
            r13 = r3
            goto Lf0
        Lef:
            r13 = r2
        Lf0:
            java.lang.String r14 = r10.a(r7)
            boolean r16 = r6.equalsIgnoreCase(r14)
            r15.j(r1)     // Catch: java.io.IOException -> L18b
            if (r13 == 0) goto L174
            java.lang.String r13 = "100-continue"
            java.lang.String r14 = "Expect"
            java.lang.String r10 = r10.a(r14)     // Catch: java.io.IOException -> L16f
            boolean r10 = r13.equalsIgnoreCase(r10)     // Catch: java.io.IOException -> L16f
            if (r10 == 0) goto L120
            r15.g()     // Catch: java.io.IOException -> L11b
            ul5 r10 = r9.m(r3)     // Catch: java.io.IOException -> L115
            r17 = r10
            goto L122
        L115:
            r0 = move-exception
            r17 = r4
        L118:
            r3 = r11
            goto L191
        L11b:
            r0 = move-exception
            r9.o(r0)     // Catch: java.io.IOException -> L115
            throw r0     // Catch: java.io.IOException -> L115
        L120:
            r17 = r4
        L122:
            if (r17 != 0) goto L151
            r0.getClass()     // Catch: java.io.IOException -> L14f
            java.lang.Object r8 = r1.X     // Catch: java.io.IOException -> L14f
            mk5 r8 = (defpackage.mk5) r8     // Catch: java.io.IOException -> L14f
            r8.getClass()     // Catch: java.io.IOException -> L14f
            long r13 = r8.a()     // Catch: java.io.IOException -> L14f
            ui6 r10 = r15.e(r1, r13)     // Catch: java.io.IOException -> L14f
            s62 r8 = new s62     // Catch: java.io.IOException -> L14f
            r18 = r11
            r11 = r13
            r13 = 0
            r3 = r18
            r8.<init>(r9, r10, r11, r13)     // Catch: java.io.IOException -> L14d
            ee5 r10 = new ee5     // Catch: java.io.IOException -> L14d
            r10.<init>(r8)     // Catch: java.io.IOException -> L14d
            r0.d(r10)     // Catch: java.io.IOException -> L14d
            r10.close()     // Catch: java.io.IOException -> L14d
            goto L17f
        L14d:
            r0 = move-exception
            goto L191
        L14f:
            r0 = move-exception
            goto L118
        L151:
            r3 = r11
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = 1
            r11 = 0
            r8.i(r9, r10, r11, r12, r13, r14)     // Catch: java.io.IOException -> L14d
            ke5 r0 = r9.j()     // Catch: java.io.IOException -> L14d
            qz2 r0 = r0.i     // Catch: java.io.IOException -> L14d
            if (r0 == 0) goto L164
            r0 = 1
            goto L165
        L164:
            r0 = r2
        L165:
            if (r0 != 0) goto L17f
            u62 r0 = r15.i()     // Catch: java.io.IOException -> L14d
            r0.e()     // Catch: java.io.IOException -> L14d
            goto L17f
        L16f:
            r0 = move-exception
            r3 = r11
        L171:
            r17 = 0
            goto L191
        L174:
            r3 = r11
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = 1
            r11 = 0
            r8.i(r9, r10, r11, r12, r13, r14)     // Catch: java.io.IOException -> L189
            r17 = 0
        L17f:
            r15.b()     // Catch: java.io.IOException -> L184
            r14 = 0
            goto L19a
        L184:
            r0 = move-exception
            r9.o(r0)     // Catch: java.io.IOException -> L14d
            throw r0     // Catch: java.io.IOException -> L14d
        L189:
            r0 = move-exception
            goto L171
        L18b:
            r0 = move-exception
            r3 = r11
            r9.o(r0)     // Catch: java.io.IOException -> L189
            throw r0     // Catch: java.io.IOException -> L189
        L191:
            boolean r8 = r0 instanceof defpackage.vz0
            if (r8 != 0) goto L2eb
            boolean r8 = r9.A
            if (r8 == 0) goto L2ea
            r14 = r0
        L19a:
            if (r17 != 0) goto L1a3
            ul5 r17 = r9.m(r2)     // Catch: java.io.IOException -> L1a6
            r17.getClass()     // Catch: java.io.IOException -> L1a6
        L1a3:
            r0 = r17
            goto L1a9
        L1a6:
            r0 = move-exception
            goto L2e3
        L1a9:
            r0.a = r1     // Catch: java.io.IOException -> L1a6
            ke5 r8 = r9.j()     // Catch: java.io.IOException -> L1a6
            pv2 r8 = r8.f     // Catch: java.io.IOException -> L1a6
            r0.e = r8     // Catch: java.io.IOException -> L1a6
            r0.l = r3     // Catch: java.io.IOException -> L1a6
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L1a6
            r0.m = r10     // Catch: java.io.IOException -> L1a6
            wl5 r0 = r0.a()     // Catch: java.io.IOException -> L1a6
            int r8 = r0.R     // Catch: java.io.IOException -> L1a6
        L1c1:
            yw2 r10 = r0.Y
            yl5 r11 = r0.Z
            r12 = 100
            if (r8 != r12) goto L1ca
            goto L1d2
        L1ca:
            r12 = 102(0x66, float:1.43E-43)
            if (r12 > r8) goto L1f2
            r12 = 200(0xc8, float:2.8E-43)
            if (r8 >= r12) goto L1f2
        L1d2:
            ul5 r0 = r9.m(r2)     // Catch: java.io.IOException -> L1a6
            r0.getClass()     // Catch: java.io.IOException -> L1a6
            r0.a = r1     // Catch: java.io.IOException -> L1a6
            ke5 r8 = r9.j()     // Catch: java.io.IOException -> L1a6
            pv2 r8 = r8.f     // Catch: java.io.IOException -> L1a6
            r0.e = r8     // Catch: java.io.IOException -> L1a6
            r0.l = r3     // Catch: java.io.IOException -> L1a6
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L1a6
            r0.m = r10     // Catch: java.io.IOException -> L1a6
            wl5 r0 = r0.a()     // Catch: java.io.IOException -> L1a6
            int r8 = r0.R     // Catch: java.io.IOException -> L1a6
            goto L1c1
        L1f2:
            r1 = 101(0x65, float:1.42E-43)
            if (r8 != r1) goto L1f8
            r1 = 1
            goto L1f9
        L1f8:
            r1 = r2
        L1f9:
            if (r1 == 0) goto L211
            ke5 r3 = r9.j()     // Catch: java.io.IOException -> L1a6
            qz2 r3 = r3.i     // Catch: java.io.IOException -> L1a6
            if (r3 == 0) goto L205
            r3 = 1
            goto L206
        L205:
            r3 = r2
        L206:
            if (r3 != 0) goto L209
            goto L211
        L209:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch: java.io.IOException -> L1a6
            java.lang.String r1 = "Unexpected 101 code on HTTP/2 connection"
            r0.<init>(r1)     // Catch: java.io.IOException -> L1a6
            throw r0     // Catch: java.io.IOException -> L1a6
        L211:
            if (r1 == 0) goto L221
            java.lang.String r1 = r10.a(r7)     // Catch: java.io.IOException -> L1a6
            if (r1 != 0) goto L21a
            r1 = 0
        L21a:
            boolean r1 = r6.equalsIgnoreCase(r1)     // Catch: java.io.IOException -> L1a6
            if (r1 == 0) goto L221
            r2 = 1
        L221:
            if (r16 == 0) goto L244
            if (r2 == 0) goto L244
            ul5 r0 = r0.h()     // Catch: java.io.IOException -> L1a6
            vg7 r1 = new vg7     // Catch: java.io.IOException -> L1a6
            n34 r2 = r11.k()     // Catch: java.io.IOException -> L1a6
            long r3 = r11.h()     // Catch: java.io.IOException -> L1a6
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L1a6
            r0.g = r1     // Catch: java.io.IOException -> L1a6
            bt r1 = r9.q()     // Catch: java.io.IOException -> L1a6
            r0.h = r1     // Catch: java.io.IOException -> L1a6
            wl5 r0 = r0.a()     // Catch: java.io.IOException -> L1a6
            r2 = r8
            goto L279
        L244:
            java.lang.String r1 = "Content-Type"
            java.lang.String r1 = r10.a(r1)     // Catch: java.io.IOException -> L2de
            if (r1 != 0) goto L24d
            r1 = 0
        L24d:
            long r11 = r15.d(r0)     // Catch: java.io.IOException -> L2de
            in6 r10 = r15.a(r0)     // Catch: java.io.IOException -> L2de
            r2 = r8
            t62 r8 = new t62     // Catch: java.io.IOException -> L2de
            r13 = 0
            r8.<init>(r9, r10, r11, r13)     // Catch: java.io.IOException -> L2de
            te5 r3 = new te5     // Catch: java.io.IOException -> L2de
            fe5 r4 = new fe5     // Catch: java.io.IOException -> L2de
            r4.<init>(r8)     // Catch: java.io.IOException -> L2de
            r3.<init>(r1, r11, r4)     // Catch: java.io.IOException -> L2de
            ul5 r0 = r0.h()     // Catch: java.io.IOException -> L1a6
            r0.g = r3     // Catch: java.io.IOException -> L1a6
            xd5 r1 = new xd5     // Catch: java.io.IOException -> L1a6
            r3 = 26
            r1.<init>(r3)     // Catch: java.io.IOException -> L1a6
            r0.o = r1     // Catch: java.io.IOException -> L1a6
            wl5 r0 = r0.a()     // Catch: java.io.IOException -> L1a6
        L279:
            pa r1 = r0.A     // Catch: java.io.IOException -> L1a6
            r1.getClass()     // Catch: java.io.IOException -> L1a6
            java.lang.Object r1 = r1.R     // Catch: java.io.IOException -> L1a6
            yw2 r1 = (defpackage.yw2) r1     // Catch: java.io.IOException -> L1a6
            java.lang.String r1 = r1.a(r7)     // Catch: java.io.IOException -> L1a6
            boolean r1 = r5.equalsIgnoreCase(r1)     // Catch: java.io.IOException -> L1a6
            if (r1 != 0) goto L29d
            yw2 r1 = r0.Y     // Catch: java.io.IOException -> L1a6
            java.lang.String r1 = r1.a(r7)     // Catch: java.io.IOException -> L1a6
            if (r1 != 0) goto L296
            r4 = 0
            goto L297
        L296:
            r4 = r1
        L297:
            boolean r1 = r5.equalsIgnoreCase(r4)     // Catch: java.io.IOException -> L1a6
            if (r1 == 0) goto L2a4
        L29d:
            u62 r1 = r15.i()     // Catch: java.io.IOException -> L1a6
            r1.e()     // Catch: java.io.IOException -> L1a6
        L2a4:
            r1 = 204(0xcc, float:2.86E-43)
            if (r2 == r1) goto L2ac
            r1 = 205(0xcd, float:2.87E-43)
            if (r2 != r1) goto L2b8
        L2ac:
            yl5 r1 = r0.Z     // Catch: java.io.IOException -> L1a6
            long r3 = r1.h()     // Catch: java.io.IOException -> L1a6
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L2b9
        L2b8:
            return r0
        L2b9:
            java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.io.IOException -> L1a6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1a6
            r3.<init>()     // Catch: java.io.IOException -> L1a6
            java.lang.String r4 = "HTTP "
            r3.append(r4)     // Catch: java.io.IOException -> L1a6
            r3.append(r2)     // Catch: java.io.IOException -> L1a6
            java.lang.String r2 = " had non-zero Content-Length: "
            r3.append(r2)     // Catch: java.io.IOException -> L1a6
            yl5 r0 = r0.Z     // Catch: java.io.IOException -> L1a6
            long r4 = r0.h()     // Catch: java.io.IOException -> L1a6
            r3.append(r4)     // Catch: java.io.IOException -> L1a6
            java.lang.String r0 = r3.toString()     // Catch: java.io.IOException -> L1a6
            r1.<init>(r0)     // Catch: java.io.IOException -> L1a6
            throw r1     // Catch: java.io.IOException -> L1a6
        L2de:
            r0 = move-exception
            r9.o(r0)     // Catch: java.io.IOException -> L1a6
            throw r0     // Catch: java.io.IOException -> L1a6
        L2e3:
            if (r14 == 0) goto L2e9
            defpackage.mb3.q(r14, r0)
            throw r14
        L2e9:
            throw r0
        L2ea:
            throw r0
        L2eb:
            throw r0
    }
}

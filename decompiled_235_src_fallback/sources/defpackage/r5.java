package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r5  reason: default package */
/* loaded from: classes.dex */
public final class r5 implements defpackage.qn2, defpackage.nb0 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;
    public final java.lang.Object L;

    public /* synthetic */ r5(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.A = r1
            r0.L = r2
            r0.B = r3
            r0.<init>()
            return
    }

    @Override // defpackage.nb0
    public void f(defpackage.je5 r1, defpackage.wl5 r2) {
            r0 = this;
            java.lang.Object r0 = r0.B
            rj0 r0 = (defpackage.rj0) r0
            r0.i(r2)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.A
            r1 = 4
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L384;
                case 1: goto L36c;
                case 2: goto L354;
                case 3: goto L33d;
                case 4: goto L325;
                case 5: goto L30e;
                case 6: goto L2f3;
                case 7: goto L2e7;
                case 8: goto L2bd;
                case 9: goto L2a6;
                case 10: goto L28f;
                case 11: goto L26d;
                case 12: goto L256;
                case 13: goto L23f;
                case 14: goto L223;
                case 15: goto L20c;
                case 16: goto L1f8;
                case 17: goto L1ad;
                case 18: goto L196;
                case 19: goto L17b;
                case 20: goto L164;
                case 21: goto L14d;
                case 22: goto L132;
                case 23: goto L117;
                case 24: goto L100;
                case 25: goto Le9;
                case 26: goto L57;
                case 27: goto L40;
                case 28: goto L29;
                default: goto La;
            }
        La:
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            boolean r0 = r9 instanceof defpackage.ix7
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r8.L
            nx3 r0 = (defpackage.nx3) r0
            ix7 r9 = (defpackage.ix7) r9
            int r9 = r9.A
            java.util.concurrent.atomic.AtomicInteger r0 = r0.c
            r1 = -256(0xffffffffffffff00, float:NaN)
            r0.compareAndSet(r1, r9)
        L1f:
            java.lang.Object r8 = r8.B
            gx3 r8 = (defpackage.gx3) r8
            r8.cancel(r5)
            jg7 r8 = defpackage.jg7.a
            return r8
        L29:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            rk7 r0 = (defpackage.rk7) r0
            java.lang.Object r8 = r8.B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.g(r8)
            return r8
        L40:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            rk7 r0 = (defpackage.rk7) r0
            java.lang.Object r8 = r8.B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.g(r8)
            return r8
        L57:
            wg3 r9 = (defpackage.wg3) r9
            android.view.KeyEvent r9 = r9.a
            java.lang.Object r0 = r8.L
            ah2 r0 = (defpackage.ah2) r0
            android.view.InputDevice r3 = r9.getDevice()
            if (r3 != 0) goto L68
        L65:
            r4 = r5
            goto Le4
        L68:
            r6 = 513(0x201, float:7.19E-43)
            boolean r6 = r3.supportsSource(r6)
            if (r6 != 0) goto L71
            goto L65
        L71:
            boolean r3 = r3.isVirtual()
            if (r3 == 0) goto L81
            int r3 = r9.getSource()
            r6 = 33554433(0x2000001, float:9.403956E-38)
            if (r3 == r6) goto L81
            goto L65
        L81:
            int r3 = defpackage.xk2.u(r9)
            if (r3 != r2) goto L65
            int r2 = r9.getSource()
            r3 = 257(0x101, float:3.6E-43)
            if (r2 != r3) goto L90
            goto L65
        L90:
            r2 = 19
            boolean r2 = defpackage.kj2.h(r2, r9)
            if (r2 == 0) goto La0
            r8 = 5
            eh2 r0 = (defpackage.eh2) r0
            boolean r4 = r0.g(r8, r4)
            goto Le4
        La0:
            r2 = 20
            boolean r2 = defpackage.kj2.h(r2, r9)
            if (r2 == 0) goto Lb0
            r8 = 6
            eh2 r0 = (defpackage.eh2) r0
            boolean r4 = r0.g(r8, r4)
            goto Le4
        Lb0:
            r2 = 21
            boolean r2 = defpackage.kj2.h(r2, r9)
            if (r2 == 0) goto Lc0
            r8 = 3
            eh2 r0 = (defpackage.eh2) r0
            boolean r4 = r0.g(r8, r4)
            goto Le4
        Lc0:
            r2 = 22
            boolean r2 = defpackage.kj2.h(r2, r9)
            if (r2 == 0) goto Lcf
            eh2 r0 = (defpackage.eh2) r0
            boolean r4 = r0.g(r1, r4)
            goto Le4
        Lcf:
            r0 = 23
            boolean r9 = defpackage.kj2.h(r0, r9)
            if (r9 == 0) goto L65
            java.lang.Object r8 = r8.B
            jt3 r8 = (defpackage.jt3) r8
            xm6 r8 = r8.c
            if (r8 == 0) goto Le4
            bh1 r8 = (defpackage.bh1) r8
            r8.b()
        Le4:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        Le9:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            gn5 r0 = (defpackage.gn5) r0
            java.lang.Object r8 = r8.B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.g(r8)
            return r8
        L100:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            gn5 r0 = (defpackage.gn5) r0
            java.lang.Object r8 = r8.B
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.g(r8)
            return r8
        L117:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            ep3 r0 = (defpackage.ep3) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Object r8 = r8.B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.o(r1, r8)
            return r8
        L132:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            ep3 r0 = (defpackage.ep3) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Object r8 = r8.B
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.o(r1, r8)
            return r8
        L14d:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            gn5 r0 = (defpackage.gn5) r0
            java.lang.Object r8 = r8.B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.g(r8)
            return r8
        L164:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            gn5 r0 = (defpackage.gn5) r0
            java.lang.Object r8 = r8.B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.g(r8)
            return r8
        L17b:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            ep3 r0 = (defpackage.ep3) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Object r8 = r8.B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.o(r1, r8)
            return r8
        L196:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            x84 r0 = (defpackage.x84) r0
            java.lang.Object r8 = r8.B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.g(r8)
            return r8
        L1ad:
            wg3 r9 = (defpackage.wg3) r9
            android.view.KeyEvent r9 = r9.a
            java.lang.Object r0 = r8.B
            qa4 r0 = (defpackage.qa4) r0
            r9.getClass()
            int r1 = defpackage.xk2.u(r9)
            if (r1 != r2) goto L1f2
            int r1 = r9.getKeyCode()
            long r1 = defpackage.qo2.e(r1)
            long r6 = defpackage.kg3.H
            boolean r1 = defpackage.kg3.a(r1, r6)
            if (r1 != 0) goto L1de
            int r9 = r9.getKeyCode()
            long r1 = defpackage.qo2.e(r9)
            long r6 = defpackage.kg3.a
            boolean r9 = defpackage.kg3.a(r1, r6)
            if (r9 == 0) goto L1f2
        L1de:
            java.lang.Object r9 = r0.getValue()
            nu4 r9 = (defpackage.nu4) r9
            if (r9 == 0) goto L1ea
            r0.setValue(r3)
            goto L1f3
        L1ea:
            java.lang.Object r8 = r8.L
            on2 r8 = (defpackage.on2) r8
            r8.c()
            goto L1f3
        L1f2:
            r4 = r5
        L1f3:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        L1f8:
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            java.lang.Object r9 = r8.L
            tu0 r9 = (defpackage.tu0) r9
            java.lang.Object r8 = r8.B
            wz3 r8 = (defpackage.wz3) r8
            tu0 r0 = r8.h
            if (r9 == r0) goto L207
            goto L209
        L207:
            r8.h = r3
        L209:
            jg7 r8 = defpackage.jg7.a
            return r8
        L20c:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            v83 r0 = (defpackage.v83) r0
            java.lang.Object r8 = r8.B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.g(r8)
            return r8
        L223:
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            java.lang.Object r9 = r8.L
            bk1 r9 = (defpackage.bk1) r9
            java.lang.Object r1 = r9.L
            java.lang.Object r8 = r8.B
            rj0 r8 = (defpackage.rj0) r8
            monitor-enter(r1)
            java.lang.Object r9 = r9.B     // Catch: java.lang.Throwable -> L23b
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch: java.lang.Throwable -> L23b
            r9.remove(r8)     // Catch: java.lang.Throwable -> L23b
            monitor-exit(r1)
            jg7 r8 = defpackage.jg7.a
            return r8
        L23b:
            r0 = move-exception
            r8 = r0
            monitor-exit(r1)
            throw r8
        L23f:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            bz1 r0 = (defpackage.bz1) r0
            java.lang.Object r8 = r8.B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.g(r8)
            return r8
        L256:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            bz1 r0 = (defpackage.bz1) r0
            java.lang.Object r8 = r8.B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.g(r8)
            return r8
        L26d:
            r3 = r9
            zl6 r3 = (defpackage.zl6) r3
            java.lang.Object r9 = defpackage.bm6.c
            monitor-enter(r9)
            long r1 = defpackage.bm6.e     // Catch: java.lang.Throwable -> L28b
            r4 = 1
            long r4 = r4 + r1
            defpackage.bm6.e = r4     // Catch: java.lang.Throwable -> L28b
            monitor-exit(r9)
            java.lang.Object r9 = r8.L
            r4 = r9
            qn2 r4 = (defpackage.qn2) r4
            java.lang.Object r8 = r8.B
            r5 = r8
            qn2 r5 = (defpackage.qn2) r5
            oa4 r0 = new oa4
            r0.<init>(r1, r3, r4, r5)
            return r0
        L28b:
            r0 = move-exception
            r8 = r0
            monitor-exit(r9)
            throw r8
        L28f:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            bz1 r0 = (defpackage.bz1) r0
            java.lang.Object r8 = r8.B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.g(r8)
            return r8
        L2a6:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            vn0 r0 = (defpackage.vn0) r0
            java.lang.Object r8 = r8.B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.g(r8)
            return r8
        L2bd:
            wg3 r9 = (defpackage.wg3) r9
            android.view.KeyEvent r9 = r9.a
            java.lang.Object r0 = r8.L
            jt3 r0 = (defpackage.jt3) r0
            hv2 r0 = r0.a()
            hv2 r2 = defpackage.hv2.Selection
            if (r0 != r2) goto L2e1
            int r0 = r9.getKeyCode()
            if (r0 != r1) goto L2e1
            int r9 = defpackage.xk2.u(r9)
            if (r9 != r4) goto L2e1
            java.lang.Object r8 = r8.B
            p27 r8 = (defpackage.p27) r8
            r8.g(r3)
            goto L2e2
        L2e1:
            r4 = r5
        L2e2:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        L2e7:
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            java.lang.Object r8 = r8.L     // Catch: java.lang.Throwable -> L2f0
            je5 r8 = (defpackage.je5) r8     // Catch: java.lang.Throwable -> L2f0
            r8.cancel()     // Catch: java.lang.Throwable -> L2f0
        L2f0:
            jg7 r8 = defpackage.jg7.a
            return r8
        L2f3:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            fn0 r0 = (defpackage.fn0) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Object r8 = r8.B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.o(r1, r8)
            return r8
        L30e:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            k4 r0 = (defpackage.k4) r0
            java.lang.Object r8 = r8.B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.g(r8)
            return r8
        L325:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            k4 r0 = (defpackage.k4) r0
            java.lang.Object r8 = r8.B
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r9)
            r0.g(r8)
            java.lang.String r8 = "leaderboard"
            return r8
        L33d:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            k0 r0 = (defpackage.k0) r0
            java.lang.Object r8 = r8.B
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.g(r8)
            return r8
        L354:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            k4 r0 = (defpackage.k4) r0
            java.lang.Object r8 = r8.B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r9)
            r0.g(r8)
            java.lang.String r8 = "achievement"
            return r8
        L36c:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            k4 r0 = (defpackage.k4) r0
            java.lang.Object r8 = r8.B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r9)
            r0.g(r8)
            java.lang.String r8 = "leaderboard"
            return r8
        L384:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r0 = r8.L
            k4 r0 = (defpackage.k4) r0
            java.lang.Object r8 = r8.B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r8 = r0.g(r8)
            return r8
    }

    @Override // defpackage.nb0
    public void k(defpackage.je5 r1, java.io.IOException r2) {
            r0 = this;
            boolean r1 = r1.m0
            if (r1 != 0) goto L10
            java.lang.Object r0 = r0.B
            rj0 r0 = (defpackage.rj0) r0
            em5 r1 = new em5
            r1.<init>(r2)
            r0.i(r1)
        L10:
            return
    }
}

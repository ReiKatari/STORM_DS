package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qj  reason: default package */
/* loaded from: classes.dex */
public final class qj extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;

    public /* synthetic */ qj(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.B = r1
            r0.R = r2
            r0.L = r3
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.B
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L147;
                case 1: goto Lfe;
                case 2: goto Le8;
                case 3: goto Lce;
                case 4: goto Lba;
                case 5: goto L96;
                case 6: goto L7f;
                case 7: goto L68;
                default: goto L8;
            }
        L8:
            mx0 r8 = (defpackage.mx0) r8
            java.lang.Object r0 = r7.L
            eo2 r0 = (defpackage.eo2) r0
            java.lang.Object r7 = r7.R
            xx7 r7 = (defpackage.xx7) r7
            boolean r1 = r7.L
            if (r1 != 0) goto L65
            hu3 r1 = r8.c
            android.view.View r3 = r8.a
            ut3 r1 = r1.getLifecycle()
            r7.X = r0
            ut3 r4 = r7.R
            if (r4 != 0) goto L47
            android.os.Looper r8 = android.os.Looper.myLooper()
            android.os.Handler r0 = r3.getHandler()
            android.os.Looper r0 = r0.getLooper()
            boolean r8 = defpackage.nb3.k(r8, r0)
            if (r8 != 0) goto L41
            q64 r8 = new q64
            r0 = 14
            r8.<init>(r0, r7, r1)
            r3.post(r8)
            goto L65
        L41:
            r7.R = r1
            r1.a(r7)
            goto L65
        L47:
            tt3 r1 = r1.b()
            tt3 r3 = defpackage.tt3.CREATED
            boolean r1 = r1.isAtLeast(r3)
            if (r1 == 0) goto L65
            ey0 r1 = r7.B
            jy0 r3 = new jy0
            r3.<init>(r7, r8, r0)
            zv0 r7 = new zv0
            r8 = -1723985096(0xffffffff993e1338, float:-9.826651E-24)
            r7.<init>(r8, r2, r3)
            r1.A(r7)
        L65:
            jg7 r7 = defpackage.jg7.a
            return r7
        L68:
            r0 = r8
            cx4 r0 = (defpackage.cx4) r0
            java.lang.Object r8 = r7.R
            r1 = r8
            dx4 r1 = (defpackage.dx4) r1
            java.lang.Object r7 = r7.L
            ei6 r7 = (defpackage.ei6) r7
            mc r4 = r7.w0
            r5 = 4
            r2 = 0
            r3 = 0
            defpackage.cx4.o(r0, r1, r2, r3, r4, r5)
            jg7 r7 = defpackage.jg7.a
            return r7
        L7f:
            r0 = r8
            cx4 r0 = (defpackage.cx4) r0
            java.lang.Object r8 = r7.R
            r1 = r8
            dx4 r1 = (defpackage.dx4) r1
            java.lang.Object r7 = r7.L
            d50 r7 = (defpackage.d50) r7
            qn2 r4 = r7.k0
            r5 = 4
            r2 = 0
            r3 = 0
            defpackage.cx4.o(r0, r1, r2, r3, r4, r5)
            jg7 r7 = defpackage.jg7.a
            return r7
        L96:
            cx4 r8 = (defpackage.cx4) r8
            java.lang.Object r0 = r7.R
            dx4 r0 = (defpackage.dx4) r0
            java.lang.Object r7 = r7.L
            b41 r7 = (defpackage.b41) r7
            rs4 r7 = r7.c
            float r7 = r7.h()
            r8.getClass()
            defpackage.cx4.b(r8, r0)
            long r2 = r0.X
            r4 = 0
            long r2 = defpackage.i93.c(r4, r2)
            r0.h0(r2, r7, r1)
            jg7 r7 = defpackage.jg7.a
            return r7
        Lba:
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Object r8 = r7.R
            um r8 = (defpackage.um) r8
            java.lang.Object r8 = r8.B
            android.view.Choreographer r8 = (android.view.Choreographer) r8
            java.lang.Object r7 = r7.L
            tm r7 = (defpackage.tm) r7
            r8.removeFrameCallback(r7)
            jg7 r7 = defpackage.jg7.a
            return r7
        Lce:
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Object r8 = r7.R
            sm r8 = (defpackage.sm) r8
            java.lang.Object r7 = r7.L
            tm r7 = (defpackage.tm) r7
            java.lang.Object r1 = r8.X
            monitor-enter(r1)
            java.util.ArrayList r8 = r8.Z     // Catch: java.lang.Throwable -> Le4
            r8.remove(r7)     // Catch: java.lang.Throwable -> Le4
            monitor-exit(r1)
            jg7 r7 = defpackage.jg7.a
            return r7
        Le4:
            r0 = move-exception
            r7 = r0
            monitor-exit(r1)
            throw r7
        Le8:
            gl1 r8 = (defpackage.gl1) r8
            java.lang.Object r8 = r7.R
            c05 r8 = (defpackage.c05) r8
            java.lang.Object r7 = r7.L
            f05 r7 = (defpackage.f05) r7
            r8.setPositionProvider(r7)
            r8.q()
            vj r7 = new vj
            r7.<init>(r3)
            return r7
        Lfe:
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Object r8 = r7.R
            v63 r8 = (defpackage.v63) r8
            java.lang.Object r4 = r8.c
            monitor-enter(r4)
            r8.e = r2     // Catch: java.lang.Throwable -> L129
            ua4 r0 = r8.d     // Catch: java.lang.Throwable -> L129
            java.lang.Object[] r2 = r0.A     // Catch: java.lang.Throwable -> L129
            int r0 = r0.L     // Catch: java.lang.Throwable -> L129
        L10f:
            if (r3 >= r0) goto L12c
            r5 = r2[r3]     // Catch: java.lang.Throwable -> L129
            ss7 r5 = (defpackage.ss7) r5     // Catch: java.lang.Throwable -> L129
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L129
            gh4 r5 = (defpackage.gh4) r5     // Catch: java.lang.Throwable -> L129
            if (r5 == 0) goto L126
            lf5 r6 = r5.b     // Catch: java.lang.Throwable -> L129
            if (r6 == 0) goto L126
            r6.closeConnection()     // Catch: java.lang.Throwable -> L129
            r5.b = r1     // Catch: java.lang.Throwable -> L129
        L126:
            int r3 = r3 + 1
            goto L10f
        L129:
            r0 = move-exception
            r7 = r0
            goto L145
        L12c:
            ua4 r8 = r8.d     // Catch: java.lang.Throwable -> L129
            r8.g()     // Catch: java.lang.Throwable -> L129
            monitor-exit(r4)
            java.lang.Object r7 = r7.L
            rj r7 = (defpackage.rj) r7
            o37 r7 = r7.B
            java.util.concurrent.atomic.AtomicReference r8 = r7.b
            r8.set(r1)
            gy4 r7 = r7.a
            r7.c()
            jg7 r7 = defpackage.jg7.a
            return r7
        L145:
            monitor-exit(r4)
            throw r7
        L147:
            w61 r8 = (defpackage.w61) r8
            v63 r8 = new v63
            java.lang.Object r0 = r7.R
            kt3 r0 = (defpackage.kt3) r0
            pj r1 = new pj
            java.lang.Object r7 = r7.L
            rj r7 = (defpackage.rj) r7
            r1.<init>(r7, r3)
            r8.<init>(r0, r1)
            return r8
    }
}

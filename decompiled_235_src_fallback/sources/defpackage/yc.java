package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yc  reason: default package */
/* loaded from: classes.dex */
public final class yc extends defpackage.hw6 implements defpackage.qn2 {
    public final /* synthetic */ int X;
    public int Y;
    public java.lang.Object Z;
    public final /* synthetic */ java.lang.Object d0;

    public /* synthetic */ yc(java.lang.Object r1, java.lang.Object r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Z = r1
            r0.d0 = r2
            r1 = 1
            r0.<init>(r1, r3)
            return
    }

    public yc(defpackage.ri7 r2, defpackage.r41 r3) {
            r1 = this;
            r0 = 8
            r1.X = r0
            r1.d0 = r2
            r2 = 1
            r1.<init>(r2, r3)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.X
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r4.d0
            r41 r5 = (defpackage.r41) r5
            switch(r0) {
                case 0: goto L8e;
                case 1: goto L7d;
                case 2: goto L6c;
                case 3: goto L5b;
                case 4: goto L4a;
                case 5: goto L39;
                case 6: goto L28;
                case 7: goto L17;
                default: goto Lb;
            }
        Lb:
            yc r4 = new yc
            ri7 r2 = (defpackage.ri7) r2
            r4.<init>(r2, r5)
            java.lang.Object r4 = r4.s(r1)
            return r4
        L17:
            yc r0 = new yc
            java.lang.Object r4 = r4.Z
            bn5 r4 = (defpackage.bn5) r4
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r3 = 7
            r0.<init>(r4, r2, r5, r3)
            java.lang.Object r4 = r0.s(r1)
            return r4
        L28:
            yc r0 = new yc
            java.lang.Object r4 = r4.Z
            ne2 r4 = (defpackage.ne2) r4
            dh5 r2 = (defpackage.dh5) r2
            r3 = 6
            r0.<init>(r4, r2, r5, r3)
            java.lang.Object r4 = r0.s(r1)
            return r4
        L39:
            yc r0 = new yc
            java.lang.Object r4 = r4.Z
            sz1 r4 = (defpackage.sz1) r4
            zg5 r2 = (defpackage.zg5) r2
            r3 = 5
            r0.<init>(r4, r2, r5, r3)
            java.lang.Object r4 = r0.s(r1)
            return r4
        L4a:
            yc r0 = new yc
            java.lang.Object r4 = r4.Z
            eo2 r4 = (defpackage.eo2) r4
            pq5 r2 = (defpackage.pq5) r2
            r3 = 4
            r0.<init>(r4, r2, r5, r3)
            java.lang.Object r4 = r0.s(r1)
            return r4
        L5b:
            yc r0 = new yc
            java.lang.Object r4 = r4.Z
            m16 r4 = (defpackage.m16) r4
            qn2 r2 = (defpackage.qn2) r2
            r3 = 3
            r0.<init>(r4, r2, r5, r3)
            java.lang.Object r4 = r0.s(r1)
            return r4
        L6c:
            yc r0 = new yc
            java.lang.Object r4 = r4.Z
            h30 r4 = (defpackage.h30) r4
            g30 r2 = (defpackage.g30) r2
            r3 = 2
            r0.<init>(r4, r2, r5, r3)
            java.lang.Object r4 = r0.s(r1)
            return r4
        L7d:
            yc r0 = new yc
            java.lang.Object r4 = r4.Z
            hm r4 = (defpackage.hm) r4
            m07 r2 = (defpackage.m07) r2
            r3 = 1
            r0.<init>(r4, r2, r5, r3)
            java.lang.Object r4 = r0.s(r1)
            return r4
        L8e:
            yc r0 = new yc
            java.lang.Object r4 = r4.Z
            dd r4 = (defpackage.dd) r4
            fo2 r2 = (defpackage.fo2) r2
            r3 = 0
            r0.<init>(r4, r2, r5, r3)
            java.lang.Object r4 = r0.s(r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r21) {
            r20 = this;
            r1 = r20
            int r0 = r1.X
            r2 = 3
            r3 = 0
            r4 = 4
            jg7 r5 = defpackage.jg7.a
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.Object r7 = r1.d0
            r8 = 1
            r9 = 0
            switch(r0) {
                case 0: goto L2f0;
                case 1: goto L1fe;
                case 2: goto L1c2;
                case 3: goto L196;
                case 4: goto L16f;
                case 5: goto L143;
                case 6: goto L115;
                case 7: goto Lf1;
                default: goto L12;
            }
        L12:
            ri7 r7 = (defpackage.ri7) r7
            ej7 r3 = r7.c
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r1.Y
            java.lang.String r7 = "Cannot acquire the CameraGraph.Session"
            r10 = 2
            java.lang.String r11 = "CXCP"
            if (r0 == 0) goto L54
            if (r0 == r8) goto L4c
            if (r0 == r10) goto L3d
            if (r0 == r2) goto L38
            if (r0 != r4) goto L33
            defpackage.oi2.Y(r21)     // Catch: java.util.concurrent.CancellationException -> L30
            r0 = r21
            goto Lb4
        L30:
            r0 = move-exception
            goto Le4
        L33:
            defpackage.i.m(r6)
            goto Lf0
        L38:
            defpackage.oi2.Y(r21)
            goto La6
        L3d:
            java.lang.Object r0 = r1.Z
            r6 = r0
            java.lang.AutoCloseable r6 = (java.lang.AutoCloseable) r6
            defpackage.oi2.Y(r21)     // Catch: java.lang.Throwable -> L48
            r0 = r21
            goto L84
        L48:
            r0 = move-exception
            r8 = r6
            r6 = r0
            goto L8a
        L4c:
            defpackage.oi2.Y(r21)     // Catch: java.util.concurrent.CancellationException -> L52
            r0 = r21
            goto L6f
        L52:
            r0 = move-exception
            goto L90
        L54:
            defpackage.oi2.Y(r21)
            boolean r0 = defpackage.kj2.F(r11)
            if (r0 == 0) goto L62
            java.lang.String r0 = "UseCaseCameraRequestControlImpl#cancelFocusAndMeteringAsync"
            android.util.Log.d(r11, r0)
        L62:
            sf0 r0 = r3.a()     // Catch: java.util.concurrent.CancellationException -> L52
            r1.Y = r8     // Catch: java.util.concurrent.CancellationException -> L52
            java.lang.Object r0 = r0.h(r1)     // Catch: java.util.concurrent.CancellationException -> L52
            if (r0 != r5) goto L6f
            goto Lb2
        L6f:
            r6 = r0
            java.lang.AutoCloseable r6 = (java.lang.AutoCloseable) r6     // Catch: java.util.concurrent.CancellationException -> L52
            r0 = r6
            vf0 r0 = (defpackage.vf0) r0     // Catch: java.lang.Throwable -> L48
            r1.Z = r6     // Catch: java.lang.Throwable -> L48
            r1.Y = r10     // Catch: java.lang.Throwable -> L48
            r12 = 0
            r8 = 56
            tu0 r0 = defpackage.vf0.k(r0, r12, r8)     // Catch: java.lang.Throwable -> L48
            if (r0 != r5) goto L84
            goto Lb2
        L84:
            jg1 r0 = (defpackage.jg1) r0     // Catch: java.lang.Throwable -> L48
            defpackage.lb4.p(r6, r9)     // Catch: java.util.concurrent.CancellationException -> L52
            goto L9b
        L8a:
            throw r6     // Catch: java.lang.Throwable -> L8b
        L8b:
            r0 = move-exception
            defpackage.lb4.p(r8, r6)     // Catch: java.util.concurrent.CancellationException -> L52
            throw r0     // Catch: java.util.concurrent.CancellationException -> L52
        L90:
            boolean r6 = defpackage.kj2.F(r11)
            if (r6 == 0) goto L99
            android.util.Log.d(r11, r7, r0)
        L99:
            tu0 r0 = defpackage.ri7.l
        L9b:
            r1.Z = r9
            r1.Y = r2
            java.lang.Object r0 = r0.X(r1)
            if (r0 != r5) goto La6
            goto Lb2
        La6:
            sf0 r0 = r3.a()     // Catch: java.util.concurrent.CancellationException -> L30
            r1.Y = r4     // Catch: java.util.concurrent.CancellationException -> L30
            java.lang.Object r0 = r0.h(r1)     // Catch: java.util.concurrent.CancellationException -> L30
            if (r0 != r5) goto Lb4
        Lb2:
            r9 = r5
            goto Lf0
        Lb4:
            r1 = r0
            java.lang.AutoCloseable r1 = (java.lang.AutoCloseable) r1     // Catch: java.util.concurrent.CancellationException -> L30
            r12 = r1
            vf0 r12 = (defpackage.vf0) r12     // Catch: java.lang.Throwable -> Ldc
            android.hardware.camera2.params.MeteringRectangle[] r0 = defpackage.lf0.a     // Catch: java.lang.Throwable -> Ldc
            java.util.List r16 = defpackage.fv.l0(r0)     // Catch: java.lang.Throwable -> Ldc
            java.util.List r17 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> Ldc
            r17.getClass()     // Catch: java.lang.Throwable -> Ldc
            java.util.List r18 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> Ldc
            r18.getClass()     // Catch: java.lang.Throwable -> Ldc
            r19 = 7
            r13 = 0
            r14 = 0
            r15 = 0
            jg1 r0 = defpackage.ye0.e(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> Ldc
            defpackage.lb4.p(r1, r9)     // Catch: java.util.concurrent.CancellationException -> L30
        Lda:
            r9 = r0
            goto Lf0
        Ldc:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> Ldf
        Ldf:
            r0 = move-exception
            defpackage.lb4.p(r1, r2)     // Catch: java.util.concurrent.CancellationException -> L30
            throw r0     // Catch: java.util.concurrent.CancellationException -> L30
        Le4:
            boolean r1 = defpackage.kj2.F(r11)
            if (r1 == 0) goto Led
            android.util.Log.d(r11, r7, r0)
        Led:
            tu0 r0 = defpackage.ri7.l
            goto Lda
        Lf0:
            return r9
        Lf1:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L102
            if (r2 != r8) goto Lfd
            defpackage.oi2.Y(r21)
            goto L114
        Lfd:
            defpackage.i.m(r6)
            r5 = r9
            goto L114
        L102:
            defpackage.oi2.Y(r21)
            java.lang.Object r2 = r1.Z
            bn5 r2 = (defpackage.bn5) r2
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r1.Y = r8
            java.lang.Object r1 = defpackage.vm5.H(r2, r7, r1)
            if (r1 != r0) goto L114
            r5 = r0
        L114:
            return r5
        L115:
            dh5 r7 = (defpackage.dh5) r7
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L128
            if (r2 != r8) goto L123
            defpackage.oi2.Y(r21)
            goto L140
        L123:
            defpackage.i.m(r6)
            r5 = r9
            goto L142
        L128:
            defpackage.oi2.Y(r21)
            java.lang.Object r2 = r1.Z
            ne2 r2 = (defpackage.ne2) r2
            java.lang.Object r3 = r7.A
            gr1 r4 = defpackage.fh4.a
            if (r3 != r4) goto L136
            r3 = r9
        L136:
            r1.Y = r8
            java.lang.Object r1 = r2.a(r3, r1)
            if (r1 != r0) goto L140
            r5 = r0
            goto L142
        L140:
            r7.A = r9
        L142:
            return r5
        L143:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L154
            if (r2 != r8) goto L14f
            defpackage.oi2.Y(r21)
            goto L16a
        L14f:
            defpackage.i.m(r6)
            r5 = r9
            goto L16e
        L154:
            defpackage.oi2.Y(r21)
            java.lang.Object r2 = r1.Z
            sz1 r2 = (defpackage.sz1) r2
            jh r2 = r2.v
            r1.Y = r8
            r2.getClass()
            java.lang.Object r1 = defpackage.jh.j(r8, r1)
            if (r1 != r0) goto L16a
            r5 = r0
            goto L16e
        L16a:
            zg5 r7 = (defpackage.zg5) r7
            r7.A = r8
        L16e:
            return r5
        L16f:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L182
            if (r2 != r8) goto L17d
            defpackage.oi2.Y(r21)
            r0 = r21
            goto L195
        L17d:
            defpackage.i.m(r6)
            r0 = r9
            goto L195
        L182:
            defpackage.oi2.Y(r21)
            java.lang.Object r2 = r1.Z
            eo2 r2 = (defpackage.eo2) r2
            pq5 r7 = (defpackage.pq5) r7
            r1.Y = r8
            java.lang.Object r1 = r2.o(r7, r1)
            if (r1 != r0) goto L194
            goto L195
        L194:
            r0 = r1
        L195:
            return r0
        L196:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L1a9
            if (r2 != r8) goto L1a4
            defpackage.oi2.Y(r21)
            r0 = r21
            goto L1c1
        L1a4:
            defpackage.i.m(r6)
            r0 = r9
            goto L1c1
        L1a9:
            defpackage.oi2.Y(r21)
            java.lang.Object r2 = r1.Z
            m16 r2 = (defpackage.m16) r2
            qn2 r7 = (defpackage.qn2) r7
            x81 r4 = new x81
            r4.<init>(r2, r9, r7, r3)
            r1.Y = r8
            java.lang.Object r1 = r2.q(r3, r4, r1)
            if (r1 != r0) goto L1c0
            goto L1c1
        L1c0:
            r0 = r1
        L1c1:
            return r0
        L1c2:
            g30 r7 = (defpackage.g30) r7
            java.lang.Object r0 = r1.Z
            h30 r0 = (defpackage.h30) r0
            vs4 r2 = r0.c
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Y
            if (r3 == 0) goto L1dd
            if (r3 != r8) goto L1d8
            defpackage.oi2.Y(r21)     // Catch: java.lang.Throwable -> L1d6
            goto L1f6
        L1d6:
            r0 = move-exception
            goto L1fa
        L1d8:
            defpackage.i.m(r6)
            r5 = r9
            goto L1f9
        L1dd:
            defpackage.oi2.Y(r21)
            r2.setValue(r7)     // Catch: java.lang.Throwable -> L1d6
            r1.Y = r8     // Catch: java.lang.Throwable -> L1d6
            v80 r3 = r7.b     // Catch: java.lang.Throwable -> L1d6
            r3.getClass()     // Catch: java.lang.Throwable -> L1d6
            java.lang.Object r1 = defpackage.v80.L(r3, r1)     // Catch: java.lang.Throwable -> L1d6
            if (r1 != r0) goto L1f1
            goto L1f2
        L1f1:
            r1 = r5
        L1f2:
            if (r1 != r0) goto L1f6
            r5 = r0
            goto L1f9
        L1f6:
            r2.setValue(r9)
        L1f9:
            return r5
        L1fa:
            r2.setValue(r9)
            throw r0
        L1fe:
            java.lang.Object r0 = r1.Z
            r2 = r0
            hm r2 = (defpackage.hm) r2
            qm6 r10 = r2.e
            android.view.View r11 = r2.a
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r12 = r1.Y
            if (r12 == 0) goto L21d
            if (r12 != r8) goto L217
            defpackage.oi2.Y(r21)     // Catch: java.lang.Throwable -> L214
            goto L286
        L214:
            r0 = move-exception
            goto L2bb
        L217:
            defpackage.i.m(r6)
            r5 = r9
            goto L2ba
        L21d:
            defpackage.oi2.Y(r21)
            gm r6 = new gm
            r6.<init>()
            m07 r7 = (defpackage.m07) r7
            fm r12 = new fm
            dm r13 = new dm
            r13.<init>(r2, r7, r3)
            dm r3 = new dm
            r3.<init>(r2, r7, r8)
            r12.<init>(r6, r13, r3, r11)
            qn2 r3 = r2.b
            if (r3 == 0) goto L244
            java.lang.Object r3 = r3.g(r12)
            fm r3 = (defpackage.fm) r3
            if (r3 != 0) goto L243
            goto L244
        L243:
            r12 = r3
        L244:
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Handler r7 = r11.getHandler()
            if (r7 == 0) goto L253
            android.os.Looper r7 = r7.getLooper()
            goto L254
        L253:
            r7 = r9
        L254:
            if (r3 == r7) goto L265
            v r3 = r2.i
            if (r3 != 0) goto L261
            v r3 = new v
            r3.<init>(r2, r12, r6, r8)
            r2.i = r3
        L261:
            r11.post(r3)
            goto L273
        L265:
            je2 r3 = new je2
            r3.<init>(r12)
            android.view.ActionMode r3 = r11.startActionMode(r3, r8)
            if (r3 != 0) goto L271
            goto L2ba
        L271:
            r2.h = r3
        L273:
            r1.Y = r8     // Catch: java.lang.Throwable -> L214
            v80 r3 = r6.a     // Catch: java.lang.Throwable -> L214
            r3.getClass()     // Catch: java.lang.Throwable -> L214
            java.lang.Object r1 = defpackage.v80.L(r3, r1)     // Catch: java.lang.Throwable -> L214
            if (r1 != r0) goto L281
            goto L282
        L281:
            r1 = r5
        L282:
            if (r1 != r0) goto L286
            r5 = r0
            goto L2ba
        L286:
            r10.a()
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r1 = r11.getHandler()
            if (r1 == 0) goto L298
            android.os.Looper r1 = r1.getLooper()
            goto L299
        L298:
            r1 = r9
        L299:
            if (r0 == r1) goto L2aa
            java.lang.Runnable r0 = r2.j
            if (r0 != 0) goto L2a6
            n0 r0 = new n0
            r0.<init>(r2, r4)
            r2.j = r0
        L2a6:
            r11.post(r0)
            goto L2b1
        L2aa:
            android.view.ActionMode r0 = r2.h
            if (r0 == 0) goto L2b1
            r0.finish()
        L2b1:
            v r0 = r2.i
            if (r0 == 0) goto L2b8
            r11.removeCallbacks(r0)
        L2b8:
            r2.h = r9
        L2ba:
            return r5
        L2bb:
            r10.a()
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Handler r3 = r11.getHandler()
            if (r3 == 0) goto L2cd
            android.os.Looper r3 = r3.getLooper()
            goto L2ce
        L2cd:
            r3 = r9
        L2ce:
            if (r1 == r3) goto L2df
            java.lang.Runnable r1 = r2.j
            if (r1 != 0) goto L2db
            n0 r1 = new n0
            r1.<init>(r2, r4)
            r2.j = r1
        L2db:
            r11.post(r1)
            goto L2e6
        L2df:
            android.view.ActionMode r1 = r2.h
            if (r1 == 0) goto L2e6
            r1.finish()
        L2e6:
            v r1 = r2.i
            if (r1 == 0) goto L2ed
            r11.removeCallbacks(r1)
        L2ed:
            r2.h = r9
            throw r0
        L2f0:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Y
            if (r3 == 0) goto L301
            if (r3 != r8) goto L2fc
            defpackage.oi2.Y(r21)
            goto L31d
        L2fc:
            defpackage.i.m(r6)
            r5 = r9
            goto L31d
        L301:
            defpackage.oi2.Y(r21)
            java.lang.Object r3 = r1.Z
            dd r3 = (defpackage.dd) r3
            wc r6 = new wc
            r6.<init>(r3, r2)
            b0 r2 = new b0
            fo2 r7 = (defpackage.fo2) r7
            r2.<init>(r7, r3, r9, r4)
            r1.Y = r8
            java.lang.Object r1 = defpackage.mb3.p(r6, r2, r1)
            if (r1 != r0) goto L31d
            r5 = r0
        L31d:
            return r5
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xd0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xd0 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;

    public /* synthetic */ xd0(defpackage.be0 r1, defpackage.ae0 r2, defpackage.yk5 r3, int r4) {
            r0 = this;
            r2 = 0
            r0.A = r2
            r0.<init>()
            r0.L = r1
            r0.R = r3
            r0.B = r4
            return
    }

    public /* synthetic */ xd0(java.lang.Object r1, int r2, int r3, java.lang.Object r4) {
            r0 = this;
            r0.A = r3
            r0.L = r1
            r0.B = r2
            r0.R = r4
            r0.<init>()
            return
    }

    public /* synthetic */ xd0(defpackage.ll0 r2, defpackage.nw4 r3, int r4) {
            r1 = this;
            r0 = 4
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.R = r3
            r1.B = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            int r0 = r12.A
            r1 = 0
            switch(r0) {
                case 0: goto L19a;
                case 1: goto L151;
                case 2: goto L132;
                case 3: goto L122;
                default: goto L6;
            }
        L6:
            java.lang.Object r0 = r12.L
            ll0 r0 = (defpackage.ll0) r0
            java.lang.Object r2 = r12.R
            nw4 r2 = (defpackage.nw4) r2
            int r12 = r12.B
            java.lang.Object r0 = r0.get()
            f35 r0 = (defpackage.f35) r0
            jd0 r3 = new jd0
            r4 = 3
            r3.<init>(r4)
            cs1 r4 = defpackage.cs1.B
            fl5 r5 = new fl5
            android.util.Size r6 = new android.util.Size
            r7 = 640(0x280, float:8.97E-43)
            r8 = 480(0x1e0, float:6.73E-43)
            r6.<init>(r7, r8)
            r7 = 2
            r5.<init>(r7, r6)
            el5 r6 = new el5
            r6.<init>(r4, r5)
            da4 r4 = r3.B
            xx r5 = defpackage.n23.w
            r4.m(r5, r6)
            da4 r4 = r3.B
            xx r5 = defpackage.v13.X
            r6 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r4.m(r5, r8)
            da4 r4 = r3.B
            xx r5 = defpackage.v13.B
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r4.m(r5, r8)
            v13 r4 = new v13
            da4 r3 = r3.B
            go4 r3 = defpackage.go4.a(r3)
            r4.<init>(r3)
            defpackage.n23.J(r4)
            r13 r3 = new r13
            r3.<init>(r4)
            java.util.concurrent.ExecutorService r4 = r2.g
            h61 r5 = new h61
            r8 = 17
            r5.<init>(r2, r8)
            java.lang.Object r8 = r3.q
            monitor-enter(r8)
            t13 r9 = r3.r     // Catch: java.lang.Throwable -> L86
            if (r9 == 0) goto L89
            h61 r10 = new h61     // Catch: java.lang.Throwable -> L86
            r11 = 8
            r10.<init>(r5, r11)     // Catch: java.lang.Throwable -> L86
            java.lang.Object r11 = r9.p0     // Catch: java.lang.Throwable -> L86
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L86
            r9.A = r10     // Catch: java.lang.Throwable -> L83
            r9.Z = r4     // Catch: java.lang.Throwable -> L83
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L83
            goto L89
        L83:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L83
            throw r12     // Catch: java.lang.Throwable -> L86
        L86:
            r12 = move-exception
            goto L120
        L89:
            h61 r9 = r3.t     // Catch: java.lang.Throwable -> L86
            if (r9 != 0) goto L90
            r3.q()     // Catch: java.lang.Throwable -> L86
        L90:
            r3.s = r4     // Catch: java.lang.Throwable -> L86
            r3.t = r5     // Catch: java.lang.Throwable -> L86
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L86
            if (r12 == 0) goto La7
            if (r12 != r6) goto L9c
            mh0 r12 = defpackage.mh0.b
            goto La9
        L9c:
            java.lang.String r0 = "Unknown camera type "
            java.lang.String r12 = defpackage.lb1.g(r12, r0)
            defpackage.fa6.h(r12)
            goto L11f
        La7:
            mh0 r12 = defpackage.mh0.c
        La9:
            r12.getClass()
            ci0 r4 = r0.a
            r4.m()
            iu3 r4 = r2.b
            me.magnum.melonds.ui.emulator.EmulatorActivity r4 = r4.a
            if (r4 == 0) goto L11a
            di7[] r5 = new defpackage.di7[r6]
            r5[r1] = r3
            ci0 r3 = r0.a
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
            di7[] r5 = (defpackage.di7[]) r5
            java.lang.String r8 = "CX:bindToLifecycle"
            java.lang.String r8 = defpackage.ln2.f0(r8)
            android.os.Trace.beginSection(r8)
            java.lang.Object r8 = r3.d     // Catch: java.lang.Throwable -> L115
            gj0 r8 = (defpackage.gj0) r8     // Catch: java.lang.Throwable -> L115
            if (r8 == 0) goto Ld4
            r9 = r6
            goto Ld5
        Ld4:
            r9 = r1
        Ld5:
            if (r9 == 0) goto Lf4
            r8.getClass()     // Catch: java.lang.Throwable -> L115
            if0 r1 = r8.g     // Catch: java.lang.Throwable -> L115
            if (r1 == 0) goto Lec
            java.lang.Object r1 = r1.g     // Catch: java.lang.Throwable -> L115
            ze0 r1 = (defpackage.ze0) r1     // Catch: java.lang.Throwable -> L115
            java.lang.Object r8 = r1.b     // Catch: java.lang.Throwable -> L115
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L115
            int r1 = r1.e     // Catch: java.lang.Throwable -> Le9
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L115
            goto Lf4
        Le9:
            r12 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L115
            throw r12     // Catch: java.lang.Throwable -> L115
        Lec:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L115
            java.lang.String r0 = "CameraX not initialized yet."
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L115
            throw r12     // Catch: java.lang.Throwable -> L115
        Lf4:
            if (r1 == r7) goto L10d
            defpackage.ci0.e(r3, r6)     // Catch: java.lang.Throwable -> L115
            qi1 r1 = new qi1     // Catch: java.lang.Throwable -> L115
            java.util.ArrayList r5 = defpackage.fv.C0(r5)     // Catch: java.lang.Throwable -> L115
            yt1 r6 = defpackage.yt1.A     // Catch: java.lang.Throwable -> L115
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L115
            defpackage.ci0.g(r3, r4, r12, r1)     // Catch: java.lang.Throwable -> L115
            android.os.Trace.endSection()
            r2.e = r0
            goto L11f
        L10d:
            java.lang.UnsupportedOperationException r12 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L115
            java.lang.String r0 = "bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first"
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L115
            throw r12     // Catch: java.lang.Throwable -> L115
        L115:
            r12 = move-exception
            android.os.Trace.endSection()
            throw r12
        L11a:
            java.lang.String r12 = "No current emulator lifecycle owner"
            defpackage.i.m(r12)
        L11f:
            return
        L120:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L86
            throw r12
        L122:
            java.lang.Object r0 = r12.L
            qi1 r0 = (defpackage.qi1) r0
            int r1 = r12.B
            java.lang.Object r12 = r12.R
            java.lang.Object r0 = r0.d
            t35 r0 = (defpackage.t35) r0
            r0.j(r1, r12)
            return
        L132:
            java.lang.Object r0 = r12.L
            kv0 r0 = (defpackage.kv0) r0
            int r2 = r12.B
            java.lang.Object r12 = r12.R
            android.content.IntentSender$SendIntentException r12 = (android.content.IntentSender.SendIntentException) r12
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r4 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
            android.content.Intent r3 = r3.setAction(r4)
            java.lang.String r4 = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"
            android.content.Intent r12 = r3.putExtra(r4, r12)
            r0.a(r2, r1, r12)
            return
        L151:
            java.lang.Object r0 = r12.L
            kv0 r0 = (defpackage.kv0) r0
            int r1 = r12.B
            java.lang.Object r12 = r12.R
            os0 r12 = (defpackage.os0) r12
            java.lang.Object r12 = r12.B
            java.io.Serializable r12 = (java.io.Serializable) r12
            java.util.LinkedHashMap r2 = r0.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L16e
            goto L199
        L16e:
            java.util.LinkedHashMap r2 = r0.e
            java.lang.Object r2 = r2.get(r1)
            g9 r2 = (defpackage.g9) r2
            if (r2 == 0) goto L17b
            a9 r3 = r2.a
            goto L17c
        L17b:
            r3 = 0
        L17c:
            if (r3 != 0) goto L189
            android.os.Bundle r2 = r0.g
            r2.remove(r1)
            java.util.LinkedHashMap r0 = r0.f
            r0.put(r1, r12)
            goto L199
        L189:
            a9 r2 = r2.a
            r2.getClass()
            java.util.ArrayList r0 = r0.d
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto L199
            r2.a(r12)
        L199:
            return
        L19a:
            java.lang.Object r0 = r12.L
            be0 r0 = (defpackage.be0) r0
            java.lang.Object r1 = r12.R
            yk5 r1 = (defpackage.yk5) r1
            int r12 = r12.B
            int r1 = defpackage.ae0.b(r1)
            r0.d(r1, r12)
            return
    }
}

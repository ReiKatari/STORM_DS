package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gt2  reason: default package */
/* loaded from: classes.dex */
public final class gt2 {
    public final defpackage.qf0 a;
    public final defpackage.ft2 b;
    public final java.util.List c;
    public final defpackage.tp6 d;

    public gt2(defpackage.t57 r14, defpackage.qf0 r15, defpackage.kf0 r16, defpackage.ox3 r17, java.util.List r18, defpackage.nd0 r19) {
            r13 = this;
            r0 = r16
            r14.getClass()
            r0.getClass()
            r17.getClass()
            r18.getClass()
            r19.getClass()
            r13.<init>()
            r13.a = r15
            java.util.List r1 = r0.l
            r13.c = r1
            java.util.Map r4 = r0.j
            java.util.Map r5 = r0.m
            k54 r1 = defpackage.ug0.c
            java.lang.Object r2 = r4.get(r1)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = defpackage.nb3.k(r2, r3)
            java.lang.String r10 = "CXCP"
            if (r2 != 0) goto L38
            java.lang.Object r2 = r5.get(r1)
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 == 0) goto L4c
        L38:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " is set to true, ignoring GraphState3A parameters."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.i(r10, r1)
        L4c:
            mf0 r0 = r0.o
            r0.getClass()
            r1 = r19
            ks6 r1 = r1.b
            r1.getClass()
            zb r0 = r0.b
            java.util.Map r1 = defpackage.nd0.c
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.Object r1 = r1.get(r2)
            java.util.Set r1 = (java.util.Set) r1
            r11 = 0
            r2 = 1
            if (r1 == 0) goto L7d
            java.lang.String r3 = android.os.Build.DEVICE
            boolean r1 = r1.contains(r3)
            if (r1 != r2) goto L7d
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r1 >= r3) goto L7d
            r1 = 10
            int r1 = java.lang.Math.max(r11, r1)
            goto L7e
        L7d:
            r1 = r11
        L7e:
            java.lang.Object r3 = r0.L
            nf0 r3 = (defpackage.nf0) r3
            int r0 = r0.B
            int[] r6 = defpackage.md0.a
            int r3 = r3.ordinal()
            r3 = r6[r3]
            r12 = 0
            if (r3 == r2) goto L97
            r1 = 2
            if (r3 != r1) goto L93
            goto L9b
        L93:
            defpackage.i.d()
            throw r12
        L97:
            int r0 = java.lang.Math.max(r1, r0)
        L9b:
            if (r0 == 0) goto La4
            gk0 r1 = new gk0
            long r2 = (long) r0
            r1.<init>(r2)
            goto La5
        La4:
            r1 = r12
        La5:
            ft2 r2 = new ft2
            if (r1 == 0) goto Lb0
            java.util.List r0 = defpackage.hf.b0(r1)
        Lad:
            r3 = r18
            goto Lb3
        Lb0:
            yt1 r0 = defpackage.yt1.A
            goto Lad
        Lb3:
            java.util.ArrayList r6 = defpackage.gt0.V0(r3, r0)
            r0 = r17
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.util.ArrayList r7 = defpackage.fv.C0(r0)
            w61 r8 = r14.a
            n61 r9 = r14.h
            r3 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r13.b = r2
            if (r1 == 0) goto Lfd
            ft2 r14 = r1.L
            if (r14 != 0) goto Lf7
            r1.L = r2
            r2.D(r11)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Capture processing has been disabled for "
            r14.<init>(r15)
            r14.append(r2)
            java.lang.String r15 = " until "
            r14.append(r15)
            long r0 = r1.A
            r14.append(r0)
            java.lang.String r15 = " frames have been completed."
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            android.util.Log.w(r10, r14)
            goto Lfd
        Lf7:
            java.lang.String r13 = "GraphLoop has already been set!"
            defpackage.i.m(r13)
            throw r12
        Lfd:
            mt2 r14 = defpackage.mt2.b
            tp6 r14 = defpackage.up6.a(r14)
            r13.d = r14
            return
    }

    public final void a(defpackage.kt2 r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = " onGraphError("
            r0.append(r1)
            r0.append(r5)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r0)
        L1e:
            tp6 r0 = r4.d
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            pt2 r2 = (defpackage.pt2) r2
            boolean r3 = r2 instanceof defpackage.nt2
            if (r3 != 0) goto L32
            boolean r2 = r2 instanceof defpackage.mt2
            if (r2 == 0) goto L30
            goto L32
        L30:
            r2 = r5
            goto L34
        L32:
            mt2 r2 = defpackage.mt2.b
        L34:
            boolean r0 = r0.j(r1, r2)
            if (r0 == 0) goto L1e
            java.util.List r4 = r4.c
            java.util.Iterator r4 = r4.iterator()
        L40:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r4.next()
            qt2 r0 = (defpackage.qt2) r0
            r0.getClass()
            sh0 r1 = r0.a
            sf0 r0 = r0.a()
            r1.b(r0, r5)
            goto L40
        L59:
            return
    }

    public final void b(defpackage.dk0 r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = " onGraphStarted"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r0)
            lt2 r0 = defpackage.lt2.b
            tp6 r1 = r2.d
            r1.l(r0)
            ft2 r1 = r2.b
            r1.F(r3)
            java.util.List r2 = r2.c
            java.util.Iterator r2 = r2.iterator()
        L28:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r2.next()
            qt2 r3 = (defpackage.qt2) r3
            sh0 r1 = r3.a
            sf0 r3 = r3.a()
            r1.b(r3, r0)
            goto L28
        L3e:
            return
    }

    public final void c() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = " onGraphStopped"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r0)
            tp6 r0 = r3.d
            mt2 r1 = defpackage.mt2.b
            r0.l(r1)
            ft2 r0 = r3.b
            r2 = 0
            r0.F(r2)
            java.util.List r3 = r3.c
            java.util.Iterator r3 = r3.iterator()
        L29:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r3.next()
            qt2 r0 = (defpackage.qt2) r0
            sh0 r2 = r0.a
            sf0 r0 = r0.a()
            r2.b(r0, r1)
            goto L29
        L3f:
            return
    }

    public final void d(defpackage.kk5 r4) {
            r3 = this;
            ft2 r3 = r3.b
            java.lang.Object r0 = r3.d0
            monitor-enter(r0)
            kk5 r1 = r3.g0     // Catch: java.lang.Throwable -> L1b
            r3.g0 = r4     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto Le
            if (r4 != 0) goto Le
            goto L22
        Le:
            s9 r1 = r3.Z
            if (r4 == 0) goto L1d
            xs2 r2 = new xs2     // Catch: java.lang.Throwable -> L1b
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L1b
            r1.H(r2)     // Catch: java.lang.Throwable -> L1b
            goto L22
        L1b:
            r3 = move-exception
            goto L3d
        L1d:
            ts2 r2 = defpackage.ts2.d     // Catch: java.lang.Throwable -> L1b
            r1.H(r2)     // Catch: java.lang.Throwable -> L1b
        L22:
            monitor-exit(r0)
            if (r4 != 0) goto L3c
            java.util.ArrayList r4 = r3.R
            int r4 = r4.size()
            r0 = 0
        L2c:
            if (r0 >= r4) goto L3c
            java.util.ArrayList r1 = r3.R
            java.lang.Object r1 = r1.get(r0)
            bt2 r1 = (defpackage.bt2) r1
            r1.c()
            int r0 = r0 + 1
            goto L2c
        L3c:
            return
        L3d:
            monitor-exit(r0)
            throw r3
    }

    public final void e(java.util.LinkedHashMap r4) {
            r3 = this;
            ft2 r3 = r3.b
            r3.getClass()
            java.lang.Object r0 = r3.d0
            monitor-enter(r0)
            s9 r1 = r3.Z     // Catch: java.lang.Throwable -> L16
            ws2 r2 = new ws2     // Catch: java.lang.Throwable -> L16
            java.util.Map r3 = r3.h0     // Catch: java.lang.Throwable -> L16
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L16
            r1.H(r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return
        L16:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GraphProcessor(cameraGraph: "
            r0.<init>(r1)
            qf0 r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

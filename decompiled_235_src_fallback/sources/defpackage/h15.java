package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h15  reason: default package */
/* loaded from: classes.dex */
public final class h15 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public java.lang.Object B;
    public java.lang.Object L;
    public java.lang.Object R;

    public /* synthetic */ h15() {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            return
    }

    public /* synthetic */ h15(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    public h15(defpackage.k15 r2, androidx.preference.Preference r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.R = r2
            r1.B = r3
            r1.L = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.A
            switch(r0) {
                case 0: goto La9;
                case 1: goto L49;
                case 2: goto L2c;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.B
            r3 = r0
            rj0 r3 = (defpackage.rj0) r3
            l61 r0 = r3.X     // Catch: java.lang.Throwable -> L26
            d90 r1 = defpackage.d90.r0     // Catch: java.lang.Throwable -> L26
            l61 r0 = r0.D(r1)     // Catch: java.lang.Throwable -> L26
            kp5 r1 = new kp5     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r7.L     // Catch: java.lang.Throwable -> L26
            m16 r2 = (defpackage.m16) r2     // Catch: java.lang.Throwable -> L26
            java.lang.Object r7 = r7.R     // Catch: java.lang.Throwable -> L26
            r4 = r7
            w81 r4 = (defpackage.w81) r4     // Catch: java.lang.Throwable -> L26
            r5 = 0
            r6 = 4
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L26
            defpackage.hv.V(r0, r1)     // Catch: java.lang.Throwable -> L26
            goto L2b
        L26:
            r0 = move-exception
            r7 = r0
            r3.w(r7)
        L2b:
            return
        L2c:
            java.lang.Object r0 = r7.B     // Catch: java.lang.Exception -> L35
            xi2 r0 = (defpackage.xi2) r0     // Catch: java.lang.Exception -> L35
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L35
            goto L36
        L35:
            r0 = 0
        L36:
            java.lang.Object r1 = r7.L
            jr1 r1 = (defpackage.jr1) r1
            java.lang.Object r7 = r7.R
            android.os.Handler r7 = (android.os.Handler) r7
            uo2 r2 = new uo2
            r3 = 13
            r2.<init>(r3, r1, r0)
            r7.post(r2)
            return
        L49:
            java.lang.Object r0 = r7.B
            ye1 r0 = (defpackage.ye1) r0
            java.lang.Object r1 = r7.L
            fz r1 = (defpackage.fz) r1
            java.lang.String r2 = r1.a
            java.lang.Object r7 = r7.R
            hy r7 = (defpackage.hy) r7
            java.util.logging.Logger r3 = defpackage.ye1.f
            java.lang.String r4 = "Transport backend '"
            m54 r5 = r0.c     // Catch: java.lang.Exception -> L7d
            pb7 r5 = r5.a(r2)     // Catch: java.lang.Exception -> L7d
            if (r5 != 0) goto L80
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7d
            r7.<init>(r4)     // Catch: java.lang.Exception -> L7d
            r7.append(r2)     // Catch: java.lang.Exception -> L7d
            java.lang.String r0 = "' is not registered"
            r7.append(r0)     // Catch: java.lang.Exception -> L7d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L7d
            r3.warning(r7)     // Catch: java.lang.Exception -> L7d
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L7d
            r0.<init>(r7)     // Catch: java.lang.Exception -> L7d
            goto La8
        L7d:
            r0 = move-exception
            r7 = r0
            goto L93
        L80:
            hl0 r5 = (defpackage.hl0) r5     // Catch: java.lang.Exception -> L7d
            hy r7 = r5.a(r7)     // Catch: java.lang.Exception -> L7d
            i36 r2 = r0.e     // Catch: java.lang.Exception -> L7d
            bt r4 = new bt     // Catch: java.lang.Exception -> L7d
            r5 = 14
            r4.<init>(r0, r1, r7, r5)     // Catch: java.lang.Exception -> L7d
            r2.n(r4)     // Catch: java.lang.Exception -> L7d
            goto La8
        L93:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error scheduling event "
            r0.<init>(r1)
            java.lang.String r7 = r7.getMessage()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r3.warning(r7)
        La8:
            return
        La9:
            java.lang.Object r0 = r7.L
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r7.B
            androidx.preference.Preference r1 = (androidx.preference.Preference) r1
            java.lang.Object r7 = r7.R
            k15 r7 = (defpackage.k15) r7
            androidx.recyclerview.widget.RecyclerView r2 = r7.mList
            wf5 r2 = r2.getAdapter()
            boolean r3 = r2 instanceof defpackage.t15
            if (r3 != 0) goto Lc8
            if (r2 != 0) goto Lc2
            goto Lef
        Lc2:
            java.lang.String r7 = "Adapter must implement PreferencePositionCallback"
            defpackage.i.m(r7)
            goto Lef
        Lc8:
            if (r1 == 0) goto Ld2
            r3 = r2
            t15 r3 = (defpackage.t15) r3
            int r3 = r3.k(r1)
            goto Ld9
        Ld2:
            r3 = r2
            t15 r3 = (defpackage.t15) r3
            int r3 = r3.l(r0)
        Ld9:
            androidx.recyclerview.widget.RecyclerView r7 = r7.mList
            r4 = -1
            if (r3 == r4) goto Le2
            r7.h0(r3)
            goto Lef
        Le2:
            j15 r3 = new j15
            r4 = r2
            t15 r4 = (defpackage.t15) r4
            r3.<init>(r4, r7, r1, r0)
            xf5 r7 = r2.a
            r7.registerObserver(r3)
        Lef:
            return
    }
}

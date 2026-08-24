package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q30  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class q30 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;
    public final /* synthetic */ java.lang.Object Y;

    public /* synthetic */ q30(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            r0 = this;
            r0.A = r6
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r0.Y = r5
            r0.<init>()
            return
    }

    public /* synthetic */ q30(defpackage.xd5 r2, java.lang.String r3, defpackage.on2 r4, defpackage.s94 r5, defpackage.qb0 r6) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.R = r3
            r1.L = r4
            r1.X = r5
            r1.Y = r6
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            int r0 = r12.A
            java.lang.Object r1 = r12.Y
            java.lang.Object r2 = r12.X
            java.lang.Object r3 = r12.L
            java.lang.Object r4 = r12.R
            java.lang.Object r12 = r12.B
            switch(r0) {
                case 0: goto L8e;
                case 1: goto L4e;
                default: goto Lf;
            }
        Lf:
            xd5 r12 = (defpackage.xd5) r12
            java.lang.String r4 = (java.lang.String) r4
            on2 r3 = (defpackage.on2) r3
            s94 r2 = (defpackage.s94) r2
            qb0 r1 = (defpackage.qb0) r1
            r12.getClass()
            boolean r12 = defpackage.ln2.H()
            if (r12 == 0) goto L29
            java.lang.String r0 = defpackage.ln2.f0(r4)     // Catch: java.lang.Throwable -> L47
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L47
        L29:
            r3.c()     // Catch: java.lang.Throwable -> L35
            un4 r0 = defpackage.xd5.k0     // Catch: java.lang.Throwable -> L35
            r2.g(r0)     // Catch: java.lang.Throwable -> L35
            r1.a(r0)     // Catch: java.lang.Throwable -> L35
            goto L41
        L35:
            r0 = move-exception
            tn4 r3 = new tn4     // Catch: java.lang.Throwable -> L47
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L47
            r2.g(r3)     // Catch: java.lang.Throwable -> L47
            r1.c(r0)     // Catch: java.lang.Throwable -> L47
        L41:
            if (r12 == 0) goto L46
            android.os.Trace.endSection()
        L46:
            return
        L47:
            r0 = move-exception
            if (r12 == 0) goto L4d
            android.os.Trace.endSection()
        L4d:
            throw r0
        L4e:
            bs1 r12 = (defpackage.bs1) r12
            ix6 r3 = (defpackage.ix6) r3
            ix6 r4 = (defpackage.ix6) r4
            mv0 r2 = (defpackage.mv0) r2
            r5 = r1
            android.view.View r5 = (android.view.View) r5
            android.view.Window r0 = r2.getWindow()
            r0.getClass()
            qn2 r1 = r3.d
            android.content.res.Resources r2 = r5.getResources()
            r2.getClass()
            java.lang.Object r1 = r1.g(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r6 = r1.booleanValue()
            qn2 r1 = r4.d
            android.content.res.Resources r2 = r5.getResources()
            r2.getClass()
            java.lang.Object r1 = r1.g(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r7 = r1.booleanValue()
            r1 = r12
            r2 = r3
            r3 = r4
            r4 = r0
            r1.b(r2, r3, r4, r5, r6, r7)
            return
        L8e:
            s47 r12 = (defpackage.s47) r12
            kk3 r3 = (defpackage.kk3) r3
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            r11 = r2
            qh1 r11 = (defpackage.qh1) r11
            r10 = r1
            ki2 r10 = (defpackage.ki2) r10
            java.lang.String r0 = "BackgroundTextMeasurement"
            android.os.Trace.beginSection(r0)
            vl6 r0 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> Lec
            boolean r1 = r0 instanceof defpackage.oa4     // Catch: java.lang.Throwable -> Lec
            r2 = 0
            if (r1 == 0) goto Lac
            oa4 r0 = (defpackage.oa4) r0     // Catch: java.lang.Throwable -> Lec
            goto Lad
        Lac:
            r0 = r2
        Lad:
            if (r0 == 0) goto Lef
            oa4 r1 = r0.C(r2, r2)     // Catch: java.lang.Throwable -> Lec
            if (r1 == 0) goto Lef
            vl6 r2 = r1.j()     // Catch: java.lang.Throwable -> Ldc
            s47 r7 = defpackage.gi2.N(r12, r3)     // Catch: java.lang.Throwable -> Ldf
            yt1 r8 = defpackage.yt1.A     // Catch: java.lang.Throwable -> Ldf
            gj r5 = new gj     // Catch: java.lang.Throwable -> Ldf
            r9 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Ldf
            r5.c()     // Catch: java.lang.Throwable -> Ldf
            r5.b()     // Catch: java.lang.Throwable -> Ldf
            defpackage.vl6.q(r2)     // Catch: java.lang.Throwable -> Ldc
            qo2 r12 = r1.w()     // Catch: java.lang.Throwable -> Lec
            r12.m()     // Catch: java.lang.Throwable -> Lec
            r1.c()     // Catch: java.lang.Throwable -> Lec
            android.os.Trace.endSection()
            return
        Ldc:
            r0 = move-exception
            r12 = r0
            goto Le5
        Ldf:
            r0 = move-exception
            r12 = r0
            defpackage.vl6.q(r2)     // Catch: java.lang.Throwable -> Ldc
            throw r12     // Catch: java.lang.Throwable -> Ldc
        Le5:
            throw r12     // Catch: java.lang.Throwable -> Le6
        Le6:
            r0 = move-exception
            r12 = r0
            r1.c()     // Catch: java.lang.Throwable -> Lec
            throw r12     // Catch: java.lang.Throwable -> Lec
        Lec:
            r0 = move-exception
            r12 = r0
            goto Lf7
        Lef:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lec
            java.lang.String r0 = "Cannot create a mutable snapshot of an read-only snapshot"
            r12.<init>(r0)     // Catch: java.lang.Throwable -> Lec
            throw r12     // Catch: java.lang.Throwable -> Lec
        Lf7:
            android.os.Trace.endSection()
            throw r12
    }
}

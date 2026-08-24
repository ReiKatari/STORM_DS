package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r30  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r30 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;
    public final /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ java.lang.Object Z;

    public /* synthetic */ r30(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, int r7) {
            r0 = this;
            r0.A = r7
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r0.Y = r5
            r0.Z = r6
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            int r0 = r12.A
            java.lang.Object r1 = r12.Z
            java.lang.Object r2 = r12.Y
            java.lang.Object r3 = r12.X
            java.lang.Object r4 = r12.R
            java.lang.Object r5 = r12.L
            java.lang.Object r12 = r12.B
            switch(r0) {
                case 0: goto L27;
                default: goto L11;
            }
        L11:
            r6 = r12
            s9 r6 = (defpackage.s9) r6
            r7 = r5
            eg0 r7 = (defpackage.eg0) r7
            r8 = r4
            eg0 r8 = (defpackage.eg0) r8
            r9 = r3
            qv6 r9 = (defpackage.qv6) r9
            r10 = r2
            qv6 r10 = (defpackage.qv6) r10
            r11 = r1
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r6.r(r7, r8, r9, r10, r11)
            return
        L27:
            s47 r12 = (defpackage.s47) r12
            kk3 r5 = (defpackage.kk3) r5
            java.util.List r4 = (java.util.List) r4
            r7 = r3
            fp r7 = (defpackage.fp) r7
            r10 = r2
            qh1 r10 = (defpackage.qh1) r10
            r11 = r1
            ki2 r11 = (defpackage.ki2) r11
            java.lang.String r0 = "BackgroundTextMeasurement"
            android.os.Trace.beginSection(r0)
            vl6 r0 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L8b
            boolean r1 = r0 instanceof defpackage.oa4     // Catch: java.lang.Throwable -> L8b
            r2 = 0
            if (r1 == 0) goto L47
            oa4 r0 = (defpackage.oa4) r0     // Catch: java.lang.Throwable -> L8b
            goto L48
        L47:
            r0 = r2
        L48:
            if (r0 == 0) goto L8e
            oa4 r1 = r0.C(r2, r2)     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L8e
            vl6 r2 = r1.j()     // Catch: java.lang.Throwable -> L7d
            s47 r8 = defpackage.gi2.N(r12, r5)     // Catch: java.lang.Throwable -> L5e
            if (r4 != 0) goto L5c
            yt1 r4 = defpackage.yt1.A     // Catch: java.lang.Throwable -> L5e
        L5c:
            r9 = r4
            goto L61
        L5e:
            r0 = move-exception
            r12 = r0
            goto L80
        L61:
            s9 r6 = new s9     // Catch: java.lang.Throwable -> L5e
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L5e
            r6.c()     // Catch: java.lang.Throwable -> L5e
            r6.b()     // Catch: java.lang.Throwable -> L5e
            defpackage.vl6.q(r2)     // Catch: java.lang.Throwable -> L7d
            qo2 r12 = r1.w()     // Catch: java.lang.Throwable -> L8b
            r12.m()     // Catch: java.lang.Throwable -> L8b
            r1.c()     // Catch: java.lang.Throwable -> L8b
            android.os.Trace.endSection()
            return
        L7d:
            r0 = move-exception
            r12 = r0
            goto L84
        L80:
            defpackage.vl6.q(r2)     // Catch: java.lang.Throwable -> L7d
            throw r12     // Catch: java.lang.Throwable -> L7d
        L84:
            throw r12     // Catch: java.lang.Throwable -> L85
        L85:
            r0 = move-exception
            r12 = r0
            r1.c()     // Catch: java.lang.Throwable -> L8b
            throw r12     // Catch: java.lang.Throwable -> L8b
        L8b:
            r0 = move-exception
            r12 = r0
            goto L96
        L8e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "Cannot create a mutable snapshot of an read-only snapshot"
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L8b
            throw r12     // Catch: java.lang.Throwable -> L8b
        L96:
            android.os.Trace.endSection()
            throw r12
    }
}

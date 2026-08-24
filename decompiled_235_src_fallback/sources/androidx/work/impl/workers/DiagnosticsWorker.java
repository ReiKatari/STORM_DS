package androidx.work.impl.workers;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends androidx.work.Worker {
    public DiagnosticsWorker(android.content.Context r1, androidx.work.WorkerParameters r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>(r1, r2)
            return
    }

    @Override // androidx.work.Worker
    public final defpackage.lx3 e() {
            r9 = this;
            android.content.Context r9 = r9.a
            lw7 r9 = defpackage.lw7.b(r9)
            r9.getClass()
            androidx.work.impl.WorkDatabase r0 = r9.c
            r0.getClass()
            dx7 r1 = r0.w()
            qw7 r2 = r0.u()
            fx7 r3 = r0.x()
            px6 r0 = r0.t()
            az0 r9 = r9.b
            q61 r9 = r9.d
            r9.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 - r6
            m16 r9 = r1.a
            t4 r6 = new t4
            r7 = 19
            r6.<init>(r7, r4)
            r4 = 1
            r5 = 0
            java.lang.Object r9 = defpackage.hv.Q(r9, r4, r5, r6)
            java.util.List r9 = (java.util.List) r9
            m16 r1 = r1.a
            rk7 r6 = new rk7
            r7 = 16
            r6.<init>(r7)
            java.lang.Object r6 = defpackage.hv.Q(r1, r4, r5, r6)
            java.util.List r6 = (java.util.List) r6
            rk7 r7 = new rk7
            r8 = 20
            r7.<init>(r8)
            java.lang.Object r1 = defpackage.hv.Q(r1, r4, r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto L76
            ga0 r4 = defpackage.ga0.f()
            java.lang.String r5 = defpackage.wi1.a
            java.lang.String r7 = "Recently completed work:\n\n"
            r4.g(r5, r7)
            ga0 r4 = defpackage.ga0.f()
            java.lang.String r9 = defpackage.wi1.a(r2, r3, r0, r9)
            r4.g(r5, r9)
        L76:
            boolean r9 = r6.isEmpty()
            if (r9 != 0) goto L92
            ga0 r9 = defpackage.ga0.f()
            java.lang.String r4 = defpackage.wi1.a
            java.lang.String r5 = "Running work:\n\n"
            r9.g(r4, r5)
            ga0 r9 = defpackage.ga0.f()
            java.lang.String r5 = defpackage.wi1.a(r2, r3, r0, r6)
            r9.g(r4, r5)
        L92:
            boolean r9 = r1.isEmpty()
            if (r9 != 0) goto Lae
            ga0 r9 = defpackage.ga0.f()
            java.lang.String r4 = defpackage.wi1.a
            java.lang.String r5 = "Enqueued work:\n\n"
            r9.g(r4, r5)
            ga0 r9 = defpackage.ga0.f()
            java.lang.String r0 = defpackage.wi1.a(r2, r3, r0, r1)
            r9.g(r4, r0)
        Lae:
            lx3 r9 = new lx3
            r9.<init>()
            return r9
    }
}

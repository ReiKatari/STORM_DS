package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pq7  reason: default package */
/* loaded from: classes.dex */
public final class pq7 {
    public final java.lang.String a;
    public final defpackage.gt2 b;
    public final defpackage.w61 c;
    public final int d;
    public final java.lang.Object e;
    public boolean f;
    public defpackage.kq7 g;
    public final defpackage.of6 h;
    public final defpackage.le2 i;
    public defpackage.oh0 j;
    public defpackage.ap6 k;
    public defpackage.jb4 l;

    public pq7(java.lang.String r2, defpackage.gt2 r3, defpackage.w61 r4) {
            r1 = this;
            r2.getClass()
            r4.getClass()
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            uw r2 = defpackage.oq7.a
            r2.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.uw.b
            int r2 = r3.incrementAndGet(r2)
            r1.d = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.e = r2
            r2 = 4
            r3 = 1
            r4 = 3
            r0 = 0
            of6 r2 = defpackage.pf6.b(r3, r4, r0, r2)
            r1.h = r2
            le2 r3 = defpackage.f04.z(r2)
            r1.i = r3
            di0 r3 = defpackage.di0.a
            r1.j = r3
            boolean r1 = r2.k(r3)
            if (r1 == 0) goto L3e
            return
        L3e:
            java.lang.String r1 = "Check failed."
            defpackage.i.m(r1)
            throw r0
    }

    public final void a(defpackage.df0 r13) {
            r12 = this;
            java.lang.String r0 = "Disconnecting "
            java.lang.Object r1 = r12.e
            monitor-enter(r1)
            boolean r2 = r12.f     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = 1
            r12.f = r2     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = "CXCP"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L37
            r4.append(r12)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L37
            android.util.Log.i(r3, r0)     // Catch: java.lang.Throwable -> L37
            kq7 r0 = r12.g     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L2e
            java.lang.Object r3 = r0.B     // Catch: java.lang.Throwable -> L37
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L37
            r0.L = r2     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
            goto L2e
        L2a:
            r0 = move-exception
            r12 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
            throw r12     // Catch: java.lang.Throwable -> L37
        L2e:
            ap6 r0 = r12.k     // Catch: java.lang.Throwable -> L37
            r2 = 0
            if (r0 == 0) goto L3a
            r0.h(r2)     // Catch: java.lang.Throwable -> L37
            goto L3a
        L37:
            r0 = move-exception
            r12 = r0
            goto L70
        L3a:
            jb4 r0 = r12.l     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L41
            r0.b()     // Catch: java.lang.Throwable -> L37
        L41:
            java.lang.Object r3 = r12.e     // Catch: java.lang.Throwable -> L37
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L37
            oh0 r0 = r12.j     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
            boolean r3 = r0 instanceof defpackage.th0     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L6a
            boolean r0 = r0 instanceof defpackage.uh0     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L57
            uh0 r0 = new uh0     // Catch: java.lang.Throwable -> L37
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L37
            r12.b(r0)     // Catch: java.lang.Throwable -> L37
        L57:
            th0 r2 = new th0     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = r12.a     // Catch: java.lang.Throwable -> L37
            ds0 r4 = defpackage.ds0.APP_DISCONNECTED     // Catch: java.lang.Throwable -> L37
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r11 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L37
            r12.b(r2)     // Catch: java.lang.Throwable -> L37
        L6a:
            monitor-exit(r1)
            return
        L6c:
            r0 = move-exception
            r12 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
            throw r12     // Catch: java.lang.Throwable -> L37
        L70:
            monitor-exit(r1)
            throw r12
    }

    public final void b(defpackage.oh0 r3) {
            r2 = this;
            r2.j = r3
            of6 r0 = r2.h
            boolean r0 = r0.k(r3)
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.String r0 = "Failed to emit "
            java.lang.String r1 = " in "
            defpackage.u34.l(r0, r3, r1, r2)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VirtualCamera-"
            r0.<init>(r1)
            int r2 = r2.d
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

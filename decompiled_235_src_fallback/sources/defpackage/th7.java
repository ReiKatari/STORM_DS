package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: th7  reason: default package */
/* loaded from: classes.dex */
public final class th7 implements defpackage.wr0, defpackage.i71, defpackage.k61 {
    public static final defpackage.bn b(int r1, java.lang.String r2) {
            java.util.WeakHashMap r0 = defpackage.dv7.w
            bn r0 = new bn
            r0.<init>(r1, r2)
            return r0
    }

    public static final defpackage.ok7 c(int r2, java.lang.String r3) {
            java.util.WeakHashMap r2 = defpackage.dv7.w
            ok7 r2 = new ok7
            p83 r0 = new p83
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            r2.<init>(r0, r3)
            return r2
    }

    public static defpackage.dv7 d(defpackage.px0 r4) {
            nq6 r0 = defpackage.kf.f
            xq2 r4 = (defpackage.xq2) r4
            java.lang.Object r0 = r4.j(r0)
            android.view.View r0 = (android.view.View) r0
            dv7 r1 = e(r0)
            boolean r2 = r4.h(r1)
            boolean r3 = r4.h(r0)
            r2 = r2 | r3
            java.lang.Object r3 = r4.P()
            if (r2 != 0) goto L21
            vs0 r2 = defpackage.ox0.a
            if (r3 != r2) goto L2b
        L21:
            ja7 r3 = new ja7
            r2 = 8
            r3.<init>(r2, r1, r0)
            r4.l0(r3)
        L2b:
            qn2 r3 = (defpackage.qn2) r3
            defpackage.mb3.d(r1, r3, r4)
            return r1
    }

    public static defpackage.dv7 e(android.view.View r2) {
            java.util.WeakHashMap r0 = defpackage.dv7.w
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r2)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            dv7 r1 = new dv7     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r2 = move-exception
            goto L18
        L14:
            dv7 r1 = (defpackage.dv7) r1     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L18:
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.wr0
    public long a() {
            r2 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            return r0
    }
}

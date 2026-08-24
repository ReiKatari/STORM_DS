package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tg0  reason: default package */
/* loaded from: classes.dex */
public final class tg0 {
    public final defpackage.nb1 a;
    public final int b;
    public final java.lang.Object c;
    public boolean d;

    public tg0(defpackage.nb1 r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            uw r2 = defpackage.vg0.a
            r2.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.uw.b
            int r2 = r0.incrementAndGet(r2)
            r1.b = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.c = r2
            return
    }

    public final defpackage.oi0 a() {
            r2 = this;
            java.lang.Object r0 = r2.c
            monitor-enter(r0)
            boolean r1 = r2.d     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            nb1 r2 = r2.a     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r2.y     // Catch: java.lang.Throwable -> L15
            m55 r2 = (defpackage.m55) r2     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L15
            oi0 r2 = (defpackage.oi0) r2     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return r2
        L15:
            r2 = move-exception
            goto L1f
        L17:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "Check failed."
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L15
            throw r2     // Catch: java.lang.Throwable -> L15
        L1f:
            monitor-exit(r0)
            throw r2
    }

    public final defpackage.cf0 b() {
            r2 = this;
            java.lang.Object r0 = r2.c
            monitor-enter(r0)
            boolean r1 = r2.d     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            nb1 r2 = r2.a     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r2.w     // Catch: java.lang.Throwable -> L15
            m55 r2 = (defpackage.m55) r2     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L15
            cf0 r2 = (defpackage.cf0) r2     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return r2
        L15:
            r2 = move-exception
            goto L1f
        L17:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "Check failed."
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L15
            throw r2     // Catch: java.lang.Throwable -> L15
        L1f:
            monitor-exit(r0)
            throw r2
    }

    public final defpackage.sf0 c(defpackage.kf0 r3, defpackage.qf0 r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CXCP#CameraGraph-"
            r0.<init>(r1)
            java.lang.String r1 = r3.a
            java.lang.String r1 = defpackage.xf0.b(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L33
            nb1 r2 = r2.a     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r2.c     // Catch: java.lang.Throwable -> L33
            nb1 r2 = (defpackage.nb1) r2     // Catch: java.lang.Throwable -> L33
            u63 r0 = new u63     // Catch: java.lang.Throwable -> L33
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33
            kb1 r3 = new kb1     // Catch: java.lang.Throwable -> L33
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L33
            m55 r2 = r3.s     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L33
            sf0 r2 = (defpackage.sf0) r2     // Catch: java.lang.Throwable -> L33
            android.os.Trace.endSection()
            return r2
        L33:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraPipe-"
            r0.<init>(r1)
            int r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

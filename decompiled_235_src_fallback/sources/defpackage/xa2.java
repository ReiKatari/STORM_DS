package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xa2  reason: default package */
/* loaded from: classes.dex */
public final class xa2 extends defpackage.b33 {
    public final defpackage.lt4 A;
    public final defpackage.db2 B;
    public final java.lang.String L;
    public final java.io.Closeable R;
    public boolean X;
    public defpackage.fe5 Y;

    public xa2(defpackage.lt4 r1, defpackage.db2 r2, java.lang.String r3, java.io.Closeable r4) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.X = r0     // Catch: java.lang.Throwable -> Lc
            fe5 r0 = r1.Y     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            defpackage.k.a(r0)     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r0 = move-exception
            goto L17
        Le:
            java.io.Closeable r0 = r1.R     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto L15
            defpackage.k.a(r0)     // Catch: java.lang.Throwable -> Lc
        L15:
            monitor-exit(r1)
            return
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    @Override // defpackage.b33
    public final defpackage.qo2 e() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.b33
    public final synchronized defpackage.z80 h() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.X     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1d
            fe5 r0 = r2.Y     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto Lb
            monitor-exit(r2)
            return r0
        Lb:
            db2 r0 = r2.B     // Catch: java.lang.Throwable -> L1b
            lt4 r1 = r2.A     // Catch: java.lang.Throwable -> L1b
            in6 r0 = r0.N(r1)     // Catch: java.lang.Throwable -> L1b
            fe5 r0 = defpackage.hi2.u(r0)     // Catch: java.lang.Throwable -> L1b
            r2.Y = r0     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r2)
            return r0
        L1b:
            r0 = move-exception
            goto L25
        L1d:
            java.lang.String r0 = "closed"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1     // Catch: java.lang.Throwable -> L1b
        L25:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r0
    }
}

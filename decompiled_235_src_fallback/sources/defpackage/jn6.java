package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jn6  reason: default package */
/* loaded from: classes.dex */
public final class jn6 extends defpackage.b33 {
    public final defpackage.qo2 A;
    public boolean B;
    public final defpackage.z80 L;

    public jn6(defpackage.z80 r1, defpackage.qo2 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r2
            r0.L = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.B = r0     // Catch: java.lang.Throwable -> Lc
            z80 r0 = r1.L     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            defpackage.k.a(r0)     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r0 = move-exception
            goto L10
        Le:
            monitor-exit(r1)
            return
        L10:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    @Override // defpackage.b33
    public final defpackage.qo2 e() {
            r0 = this;
            qo2 r0 = r0.A
            return r0
    }

    @Override // defpackage.b33
    public final synchronized defpackage.z80 h() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.B     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            z80 r0 = r2.L     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lb
            monitor-exit(r2)
            return r0
        Lb:
            xf3 r0 = defpackage.db2.A     // Catch: java.lang.Throwable -> Lf
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> Lf
        Lf:
            r0 = move-exception
            goto L19
        L11:
            java.lang.String r0 = "closed"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1     // Catch: java.lang.Throwable -> Lf
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }
}

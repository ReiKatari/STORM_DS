package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p1  reason: default package */
/* loaded from: classes.dex */
public final class p1 extends defpackage.q60 {
    @Override // defpackage.q60
    public final void S(defpackage.q1 r1, defpackage.q1 r2) {
            r0 = this;
            r1.b = r2
            return
    }

    @Override // defpackage.q60
    public final void T(defpackage.q1 r1, java.lang.Thread r2) {
            r0 = this;
            r1.a = r2
            return
    }

    @Override // defpackage.q60
    public final boolean m(defpackage.r1 r1, defpackage.n1 r2, defpackage.n1 r3) {
            r0 = this;
            monitor-enter(r1)
            n1 r0 = r1.B     // Catch: java.lang.Throwable -> La
            if (r0 != r2) goto Lc
            r1.B = r3     // Catch: java.lang.Throwable -> La
            r0 = 1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return r0
        La:
            r0 = move-exception
            goto Lf
        Lc:
            r0 = 0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return r0
        Lf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    @Override // defpackage.q60
    public final boolean n(defpackage.r1 r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.A     // Catch: java.lang.Throwable -> La
            if (r0 != r2) goto Lc
            r1.A = r3     // Catch: java.lang.Throwable -> La
            r0 = 1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return r0
        La:
            r0 = move-exception
            goto Lf
        Lc:
            r0 = 0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return r0
        Lf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    @Override // defpackage.q60
    public final boolean o(defpackage.r1 r1, defpackage.q1 r2, defpackage.q1 r3) {
            r0 = this;
            monitor-enter(r1)
            q1 r0 = r1.L     // Catch: java.lang.Throwable -> La
            if (r0 != r2) goto Lc
            r1.L = r3     // Catch: java.lang.Throwable -> La
            r0 = 1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return r0
        La:
            r0 = move-exception
            goto Lf
        Lc:
            r0 = 0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return r0
        Lf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }
}

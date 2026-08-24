package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mg1  reason: default package */
/* loaded from: classes.dex */
public final class mg1 implements defpackage.sm6 {
    public final defpackage.lg1 a;
    public defpackage.sm6 b;

    public mg1(defpackage.lg1 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.sm6
    public final boolean a(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            lg1 r0 = r0.a
            boolean r0 = r0.a(r1)
            return r0
    }

    @Override // defpackage.sm6
    public final boolean b() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.sm6
    public final java.lang.String c(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            sm6 r0 = r0.e(r1)
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.c(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // defpackage.sm6
    public final void d(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            r3.getClass()
            sm6 r0 = r0.e(r1)
            if (r0 == 0) goto Lc
            r0.d(r1, r2, r3)
        Lc:
            return
    }

    public final synchronized defpackage.sm6 e(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            monitor-enter(r1)
            sm6 r0 = r1.b     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            lg1 r0 = r1.a     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.a(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L18
            lg1 r0 = r1.a     // Catch: java.lang.Throwable -> L16
            sm6 r2 = r0.j(r2)     // Catch: java.lang.Throwable -> L16
            r1.b = r2     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r2 = move-exception
            goto L1c
        L18:
            sm6 r2 = r1.b     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)
            return r2
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
    }
}

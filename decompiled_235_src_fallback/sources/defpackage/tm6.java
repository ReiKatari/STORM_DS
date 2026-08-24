package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tm6  reason: default package */
/* loaded from: classes.dex */
public final class tm6 extends defpackage.pw {
    public final java.net.Socket n;

    public tm6(java.net.Socket r1) {
            r0 = this;
            r0.<init>()
            r0.n = r1
            return
    }

    @Override // defpackage.pw
    public final java.io.IOException k(java.io.IOException r2) {
            r1 = this;
            java.net.SocketTimeoutException r1 = new java.net.SocketTimeoutException
            java.lang.String r0 = "timeout"
            r1.<init>(r0)
            if (r2 == 0) goto Lc
            r1.initCause(r2)
        Lc:
            return r1
    }

    @Override // defpackage.pw
    public final void l() {
            r5 = this;
            java.lang.String r0 = "Failed to close timed out socket "
            java.net.Socket r5 = r5.n
            r5.close()     // Catch: java.lang.AssertionError -> L8 java.lang.Exception -> L24
            return
        L8:
            r1 = move-exception
            boolean r2 = defpackage.xy7.a(r1)
            if (r2 == 0) goto L23
            java.util.logging.Logger r2 = defpackage.xy7.a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r5 = r4.toString()
            r2.log(r3, r5, r1)
            goto L38
        L23:
            throw r1
        L24:
            r1 = move-exception
            java.util.logging.Logger r2 = defpackage.xy7.a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r5 = r4.toString()
            r2.log(r3, r5, r1)
        L38:
            return
    }
}

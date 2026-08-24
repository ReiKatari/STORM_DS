package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s94  reason: default package */
/* loaded from: classes.dex */
public class s94 extends defpackage.qx3 {
    @Override // defpackage.qx3
    public final void f(java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = "setValue"
            defpackage.qx3.a(r0)
            int r0 = r1.g
            int r0 = r0 + 1
            r1.g = r0
            r1.e = r2
            r2 = 0
            r1.b(r2)
            return
    }

    public final void g(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            java.lang.Object r1 = r3.f     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = defpackage.qx3.k     // Catch: java.lang.Throwable -> L3c
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r3.f = r4     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L12
            return
        L12:
            zt r4 = defpackage.zt.l0()
            g15 r3 = r3.j
            sf1 r4 = r4.e
            android.os.Handler r0 = r4.g
            if (r0 != 0) goto L36
            java.lang.Object r0 = r4.e
            monitor-enter(r0)
            android.os.Handler r1 = r4.g     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto L32
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L30
            android.os.Handler r1 = defpackage.sf1.l0(r1)     // Catch: java.lang.Throwable -> L30
            r4.g = r1     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r3 = move-exception
            goto L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            goto L36
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r3
        L36:
            android.os.Handler r4 = r4.g
            r4.post(r3)
            return
        L3c:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r3
    }
}

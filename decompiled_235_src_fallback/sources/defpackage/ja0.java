package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ja0  reason: default package */
/* loaded from: classes.dex */
public final class ja0 extends defpackage.jk2 {
    public final /* synthetic */ defpackage.la0 B;
    public final /* synthetic */ defpackage.ka0 L;

    public ja0(defpackage.la0 r1, defpackage.ka0 r2, defpackage.ui6 r3) {
            r0 = this;
            r0.B = r1
            r0.L = r2
            r0.<init>(r3)
            return
    }

    @Override // defpackage.jk2, defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r3 = this;
            la0 r0 = r3.B
            ka0 r1 = r3.L
            monitor-enter(r0)
            boolean r2 = r1.a     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto Lb
            monitor-exit(r0)
            return
        Lb:
            r2 = 1
            r1.a = r2     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            super.close()
            ka0 r3 = r3.L
            java.lang.Object r3 = r3.b
            bk1 r3 = (defpackage.bk1) r3
            r3.d()
            return
        L1c:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: de1  reason: default package */
/* loaded from: classes.dex */
public final class de1 extends defpackage.e72 implements java.util.concurrent.Executor {
    public static final defpackage.de1 L = null;
    public static final defpackage.n61 R = null;

    static {
            de1 r0 = new de1
            r0.<init>()
            defpackage.de1.L = r0
            og7 r0 = defpackage.og7.L
            int r1 = defpackage.xx6.a
            r2 = 64
            if (r2 >= r1) goto L10
            goto L11
        L10:
            r1 = r2
        L11:
            r2 = 12
            java.lang.String r3 = "kotlinx.coroutines.io.parallelism"
            int r1 = defpackage.bl2.V(r1, r2, r3)
            n61 r0 = r0.m0(r1)
            defpackage.de1.R = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot be invoked on Dispatchers.IO"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            vt1 r0 = defpackage.vt1.A
            r1.j0(r0, r2)
            return
    }

    @Override // defpackage.n61
    public final void j0(defpackage.l61 r1, java.lang.Runnable r2) {
            r0 = this;
            n61 r0 = defpackage.de1.R
            r0.j0(r1, r2)
            return
    }

    @Override // defpackage.n61
    public final void k0(defpackage.l61 r1, java.lang.Runnable r2) {
            r0 = this;
            n61 r0 = defpackage.de1.R
            r0.k0(r1, r2)
            return
    }

    @Override // defpackage.n61
    public final defpackage.n61 m0(int r1) {
            r0 = this;
            r0 = 1
            og7 r1 = defpackage.og7.L
            n61 r0 = r1.m0(r0)
            return r0
    }

    @Override // defpackage.n61
    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "Dispatchers.IO"
            return r0
    }
}

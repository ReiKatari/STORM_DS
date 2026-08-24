package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xe1  reason: default package */
/* loaded from: classes.dex */
public final class xe1 extends defpackage.e72 {
    public static final defpackage.xe1 R = null;
    public defpackage.v61 L;

    static {
            xe1 r0 = new xe1
            int r2 = defpackage.sz6.c
            int r3 = defpackage.sz6.d
            long r4 = defpackage.sz6.e
            java.lang.String r6 = defpackage.sz6.a
            r0.<init>()
            v61 r1 = new v61
            r1.<init>(r2, r3, r4, r6)
            r0.L = r1
            defpackage.xe1.R = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Dispatchers.Default cannot be closed"
            r1.<init>(r0)
            throw r1
    }

    @Override // defpackage.n61
    public final void j0(defpackage.l61 r1, java.lang.Runnable r2) {
            r0 = this;
            v61 r0 = r0.L
            r1 = 6
            defpackage.v61.k(r0, r2, r1)
            return
    }

    @Override // defpackage.n61
    public final void k0(defpackage.l61 r1, java.lang.Runnable r2) {
            r0 = this;
            v61 r0 = r0.L
            r1 = 2
            defpackage.v61.k(r0, r2, r1)
            return
    }

    @Override // defpackage.n61
    public final defpackage.n61 m0(int r2) {
            r1 = this;
            r2 = 1
            defpackage.kn2.u(r2)
            int r0 = defpackage.sz6.c
            if (r2 < r0) goto L9
            return r1
        L9:
            n61 r1 = super.m0(r2)
            return r1
    }

    @Override // defpackage.n61
    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "Dispatchers.Default"
            return r0
    }
}

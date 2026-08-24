package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p40  reason: default package */
/* loaded from: classes.dex */
public final class p40 extends defpackage.kk2 {
    public final /* synthetic */ int B;
    public java.lang.Object L;

    public /* synthetic */ p40(defpackage.in6 r2) {
            r1 = this;
            r0 = 0
            r1.B = r0
            r1.<init>(r2)
            return
    }

    public p40(defpackage.in6 r2, defpackage.ha0 r3) {
            r1 = this;
            r0 = 1
            r1.B = r0
            r1.L = r3
            r1.<init>(r2)
            return
    }

    public p40(defpackage.tk4 r2, defpackage.z80 r3) {
            r1 = this;
            r0 = 2
            r1.B = r0
            r1.L = r2
            r1.<init>(r3)
            return
    }

    @Override // defpackage.kk2, defpackage.in6
    public long b0(defpackage.k80 r2, long r3) {
            r1 = this;
            int r0 = r1.B
            switch(r0) {
                case 0: goto L17;
                case 1: goto L5;
                case 2: goto La;
                default: goto L5;
            }
        L5:
            long r1 = super.b0(r2, r3)
            return r1
        La:
            long r1 = super.b0(r2, r3)     // Catch: java.io.IOException -> Lf
            return r1
        Lf:
            r2 = move-exception
            java.lang.Object r1 = r1.L
            tk4 r1 = (defpackage.tk4) r1
            r1.R = r2
            throw r2
        L17:
            long r1 = super.b0(r2, r3)     // Catch: java.lang.Exception -> L1c
            return r1
        L1c:
            r2 = move-exception
            r1.L = r2
            throw r2
    }

    @Override // defpackage.kk2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            int r0 = r1.B
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.close()
            return
        L9:
            java.lang.Object r0 = r1.L
            ha0 r0 = (defpackage.ha0) r0
            fk1 r0 = r0.B
            r0.close()
            super.close()
            return
    }
}

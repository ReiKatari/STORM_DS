package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tk4  reason: default package */
/* loaded from: classes.dex */
public final class tk4 extends defpackage.yl5 {
    public final defpackage.yl5 B;
    public final defpackage.fe5 L;
    public java.io.IOException R;

    public tk4(defpackage.yl5 r2) {
            r1 = this;
            r1.<init>()
            r1.B = r2
            p40 r0 = new p40
            z80 r2 = r2.n()
            r0.<init>(r1, r2)
            fe5 r2 = new fe5
            r2.<init>(r0)
            r1.L = r2
            return
    }

    @Override // defpackage.yl5, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            yl5 r0 = r0.B
            r0.close()
            return
    }

    @Override // defpackage.yl5
    public final long h() {
            r2 = this;
            yl5 r2 = r2.B
            long r0 = r2.h()
            return r0
    }

    @Override // defpackage.yl5
    public final defpackage.n34 k() {
            r0 = this;
            yl5 r0 = r0.B
            n34 r0 = r0.k()
            return r0
    }

    @Override // defpackage.yl5
    public final defpackage.z80 n() {
            r0 = this;
            fe5 r0 = r0.L
            return r0
    }
}

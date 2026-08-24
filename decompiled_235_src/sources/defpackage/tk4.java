package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tk4  reason: default package */
/* loaded from: classes.dex */
public final class tk4 extends yl5 {
    public final yl5 B;
    public final fe5 L;
    public IOException R;

    public tk4(yl5 yl5Var) {
        this.B = yl5Var;
        this.L = new fe5(new p40(this, yl5Var.n()));
    }

    @Override // defpackage.yl5, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.B.close();
    }

    @Override // defpackage.yl5
    public final long h() {
        return this.B.h();
    }

    @Override // defpackage.yl5
    public final n34 k() {
        return this.B.k();
    }

    @Override // defpackage.yl5
    public final z80 n() {
        return this.L;
    }
}

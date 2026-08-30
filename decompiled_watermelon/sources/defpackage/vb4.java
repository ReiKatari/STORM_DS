package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vb4  reason: default package */
/* loaded from: classes.dex */
public final class vb4 extends gc5 {
    public final gc5 B;
    public final s45 L;
    public IOException R;

    public vb4(gc5 gc5Var) {
        this.B = gc5Var;
        this.L = new s45(new q20(this, gc5Var.p()));
    }

    @Override // defpackage.gc5, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.B.close();
    }

    @Override // defpackage.gc5
    public final long d() {
        return this.B.d();
    }

    @Override // defpackage.gc5
    public final cw3 i() {
        return this.B.i();
    }

    @Override // defpackage.gc5
    public final u60 p() {
        return this.L;
    }
}

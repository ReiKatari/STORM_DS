package defpackage;

import java.io.Closeable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: le5  reason: default package */
/* loaded from: classes.dex */
public final class le5 implements Closeable {
    public final gk1 A;

    public le5(gk1 gk1Var) {
        this.A = gk1Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }
}

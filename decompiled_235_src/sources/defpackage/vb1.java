package defpackage;

import java.io.Closeable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vb1  reason: default package */
/* loaded from: classes.dex */
public final class vb1 implements Closeable {
    public n55 A;
    public g71 B;
    public n55 L;
    public n55 R;
    public n55 X;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((i36) this.R.get()).close();
    }
}

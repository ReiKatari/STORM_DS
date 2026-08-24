package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: le5  reason: default package */
/* loaded from: classes.dex */
public final class le5 implements java.io.Closeable {
    public final defpackage.gk1 A;

    public le5(defpackage.gk1 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            gk1 r0 = r0.A
            r0.close()
            return
    }
}

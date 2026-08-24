package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zr0  reason: default package */
/* loaded from: classes.dex */
public final class zr0 extends defpackage.p55 {
    public static defpackage.zr0 h(java.io.InputStream r1) {
            zr0 r0 = new zr0
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            cs0 r0 = defpackage.cs0.A
            r1.in = r0
            return
    }
}

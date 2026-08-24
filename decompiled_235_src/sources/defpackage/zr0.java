package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zr0  reason: default package */
/* loaded from: classes.dex */
public final class zr0 extends p55 {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.FilterInputStream, zr0] */
    public static zr0 h(InputStream inputStream) {
        return new FilterInputStream(inputStream);
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((FilterInputStream) this).in = cs0.A;
    }
}

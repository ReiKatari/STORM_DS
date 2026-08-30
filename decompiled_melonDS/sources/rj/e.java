package rj;

import java.io.FilterInputStream;
import java.io.InputStream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends g {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.FilterInputStream, rj.e] */
    public static e i(InputStream inputStream) {
        return new FilterInputStream(inputStream);
    }

    @Override // rj.g, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((FilterInputStream) this).in = f.A;
    }
}

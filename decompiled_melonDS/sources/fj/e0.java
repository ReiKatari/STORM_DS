package fj;

import java.io.Closeable;
import java.io.Flushable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface e0 extends Closeable, Flushable {
    void A(e eVar, long j2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    i0 f();

    void flush();
}

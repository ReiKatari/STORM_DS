package defpackage;

import java.io.Closeable;
import java.io.Flushable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g76  reason: default package */
/* loaded from: classes.dex */
public interface g76 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    kt6 f();

    void flush();

    void l(f60 f60Var, long j);
}

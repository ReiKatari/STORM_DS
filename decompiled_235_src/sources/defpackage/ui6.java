package defpackage;

import java.io.Closeable;
import java.io.Flushable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ui6  reason: default package */
/* loaded from: classes.dex */
public interface ui6 extends Closeable, Flushable {
    void O(k80 k80Var, long j);

    b67 b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}

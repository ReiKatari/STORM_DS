package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mp0  reason: default package */
/* loaded from: classes.dex */
public final class mp0 extends hw4 {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.FilterInputStream, mp0] */
    public static mp0 i(InputStream inputStream) {
        return new FilterInputStream(inputStream);
    }

    @Override // defpackage.hw4, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((FilterInputStream) this).in = pp0.A;
    }
}

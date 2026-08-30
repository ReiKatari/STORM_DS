package defpackage;

import java.io.Closeable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y45  reason: default package */
/* loaded from: classes.dex */
public final class y45 implements Closeable {
    public final cg1 A;

    public y45(cg1 cg1Var) {
        this.A = cg1Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }
}

package defpackage;

import java.util.concurrent.CompletableFuture;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: js0  reason: default package */
/* loaded from: classes.dex */
public final class js0 extends CompletableFuture {
    public final xb4 A;

    public js0(xb4 xb4Var) {
        this.A = xb4Var;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.A.cancel();
        }
        return super.cancel(z);
    }
}

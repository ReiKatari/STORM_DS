package gk;

import java.util.concurrent.CompletableFuture;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends CompletableFuture {
    public final a0 A;

    public k(a0 a0Var) {
        this.A = a0Var;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        if (z10) {
            this.A.cancel();
        }
        return super.cancel(z10);
    }
}

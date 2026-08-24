package defpackage;

import java.util.concurrent.CompletableFuture;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wu0  reason: default package */
/* loaded from: classes.dex */
public final class wu0 extends CompletableFuture {
    public final vk4 A;

    public wu0(vk4 vk4Var) {
        this.A = vk4Var;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.A.cancel();
        }
        return super.cancel(z);
    }
}

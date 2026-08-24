package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wu0  reason: default package */
/* loaded from: classes.dex */
public final class wu0 extends java.util.concurrent.CompletableFuture {
    public final defpackage.vk4 A;

    public wu0(defpackage.vk4 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L7
            vk4 r0 = r1.A
            r0.cancel()
        L7:
            boolean r1 = super.cancel(r2)
            return r1
    }
}

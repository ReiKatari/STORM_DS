package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ce7  reason: default package */
/* loaded from: classes.dex */
public class ce7 extends defpackage.yc7 {
    public ce7() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r1) {
            r0 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger     // Catch: java.lang.NumberFormatException -> La
            int r1 = r1.Z()     // Catch: java.lang.NumberFormatException -> La
            r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> La
            return r0
        La:
            r0 = move-exception
            ne3 r1 = new ne3
            r1.<init>(r0)
            throw r1
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r3, java.lang.Object r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r4 = (java.util.concurrent.atomic.AtomicInteger) r4
            int r2 = r4.get()
            long r0 = (long) r2
            r3.X(r0)
            return
    }
}

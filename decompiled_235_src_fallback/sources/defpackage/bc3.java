package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bc3  reason: default package */
/* loaded from: classes.dex */
public final class bc3 extends defpackage.uc3 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater e0 = null;
    private volatile /* synthetic */ int _invoked$volatile;
    public final defpackage.a0 d0;

    static {
            java.lang.Class<bc3> r0 = defpackage.bc3.class
            java.lang.String r1 = "_invoked$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.bc3.e0 = r0
            return
    }

    public bc3(defpackage.a0 r1) {
            r0 = this;
            r0.<init>()
            r0.d0 = r1
            return
    }

    @Override // defpackage.uc3
    public final boolean q() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.uc3
    public final void r(java.lang.Throwable r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.bc3.e0
            boolean r0 = r2.compareAndSet(r3, r0, r1)
            if (r0 == 0) goto Lf
            a0 r3 = r3.d0
            r3.g(r4)
        Lf:
            return
    }
}

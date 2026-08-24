package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r57  reason: default package */
/* loaded from: classes.dex */
public final class r57 extends defpackage.uc3 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f0 = null;
    private volatile /* synthetic */ int _state$volatile;
    public final java.lang.Thread d0;
    public defpackage.il1 e0;

    static {
            java.lang.Class<r57> r0 = defpackage.r57.class
            java.lang.String r1 = "_state$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.r57.f0 = r0
            return
    }

    public r57() {
            r1 = this;
            r1.<init>()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1.d0 = r0
            return
    }

    public static void t(int r3) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Illegal state "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
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
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.r57.f0
            int r0 = r4.get(r3)
            r1 = 3
            r2 = 2
            if (r0 == 0) goto L18
            r3 = 1
            if (r0 == r3) goto L17
            if (r0 == r2) goto L17
            if (r0 != r1) goto L12
            goto L17
        L12:
            t(r0)
            r3 = 0
            throw r3
        L17:
            return
        L18:
            boolean r0 = r4.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L0
            java.lang.Thread r0 = r3.d0
            r0.interrupt()
            r4.set(r3, r1)
            return
    }

    public final void s() {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.r57.f0
            int r1 = r0.get(r3)
            if (r1 == 0) goto L17
            r0 = 2
            if (r1 == r0) goto L0
            r3 = 3
            if (r1 != r3) goto L12
            java.lang.Thread.interrupted()
            return
        L12:
            t(r1)
            r3 = 0
            throw r3
        L17:
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L0
            il1 r3 = r3.e0
            if (r3 == 0) goto L25
            r3.dispose()
        L25:
            return
    }
}

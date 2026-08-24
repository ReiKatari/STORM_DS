package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p96  reason: default package */
/* loaded from: classes.dex */
public abstract class p96 extends defpackage.vy0 implements defpackage.sg4 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater Y = null;
    public final long X;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    static {
            java.lang.Class<p96> r0 = defpackage.p96.class
            java.lang.String r1 = "cleanedAndPointers$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.p96.Y = r0
            return
    }

    public p96(long r1, defpackage.p96 r3, int r4) {
            r0 = this;
            r0.<init>(r3)
            r0.X = r1
            int r1 = r4 << 16
            r0.cleanedAndPointers$volatile = r1
            return
    }

    @Override // defpackage.vy0
    public final boolean g() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.p96.Y
            int r0 = r0.get(r2)
            int r1 = r2.l()
            if (r0 != r1) goto L15
            vy0 r2 = r2.d()
            if (r2 != 0) goto L13
            goto L15
        L13:
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }

    public final boolean k() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.p96.Y
            r1 = -65536(0xffffffffffff0000, float:NaN)
            int r0 = r0.addAndGet(r2, r1)
            int r1 = r2.l()
            if (r0 != r1) goto L17
            vy0 r2 = r2.d()
            if (r2 != 0) goto L15
            goto L17
        L15:
            r2 = 1
            return r2
        L17:
            r2 = 0
            return r2
    }

    public abstract int l();

    public abstract void m(int r1, defpackage.l61 r2);

    public final void n() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.p96.Y
            int r0 = r0.incrementAndGet(r2)
            int r1 = r2.l()
            if (r0 != r1) goto Lf
            r2.i()
        Lf:
            return
    }

    public final boolean o() {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.p96.Y
            int r1 = r0.get(r3)
            int r2 = r3.l()
            if (r1 != r2) goto L15
            vy0 r2 = r3.d()
            if (r2 != 0) goto L13
            goto L15
        L13:
            r3 = 0
            return r3
        L15:
            r2 = 65536(0x10000, float:9.1835E-41)
            int r2 = r2 + r1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L0
            r3 = 1
            return r3
    }
}

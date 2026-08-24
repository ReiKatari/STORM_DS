package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vl0  reason: default package */
/* loaded from: classes.dex */
public final class vl0 extends defpackage.wl0 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater Y = null;
    public final defpackage.ul0 R;
    public final boolean X;
    private volatile /* synthetic */ int consumed$volatile;

    static {
            java.lang.Class<vl0> r0 = defpackage.vl0.class
            java.lang.String r1 = "consumed$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.vl0.Y = r0
            return
    }

    public /* synthetic */ vl0(defpackage.ul0 r7, boolean r8) {
            r6 = this;
            r4 = -3
            m80 r5 = defpackage.m80.SUSPEND
            vt1 r3 = defpackage.vt1.A
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public vl0(defpackage.ul0 r1, boolean r2, defpackage.l61 r3, int r4, defpackage.m80 r5) {
            r0 = this;
            r0.<init>(r3, r4, r5)
            r0.R = r1
            r0.X = r2
            return
    }

    @Override // defpackage.wl0, defpackage.le2
    public final java.lang.Object b(defpackage.ne2 r4, defpackage.r41 r5) {
            r3 = this;
            int r0 = r3.B
            r1 = -3
            if (r0 != r1) goto L25
            boolean r0 = r3.X
            if (r0 == 0) goto L1a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.vl0.Y
            r2 = 1
            int r1 = r1.getAndSet(r3, r2)
            if (r1 == r2) goto L13
            goto L1a
        L13:
            java.lang.String r3 = "ReceiveChannel.consumeAsFlow can be collected just once"
            defpackage.i.m(r3)
            r3 = 0
            return r3
        L1a:
            ul0 r3 = r3.R
            java.lang.Object r3 = defpackage.g04.D(r4, r3, r0, r5)
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            if (r3 != r4) goto L2e
            return r3
        L25:
            java.lang.Object r3 = super.b(r4, r5)
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            if (r3 != r4) goto L2e
            return r3
        L2e:
            jg7 r3 = defpackage.jg7.a
            return r3
    }

    @Override // defpackage.wl0
    public final java.lang.String d() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "channel="
            r0.<init>(r1)
            ul0 r2 = r2.R
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.wl0
    public final java.lang.Object e(defpackage.r35 r2, defpackage.r41 r3) {
            r1 = this;
            pb6 r0 = new pb6
            r0.<init>(r2)
            ul0 r2 = r1.R
            boolean r1 = r1.X
            java.lang.Object r1 = defpackage.g04.D(r0, r2, r1, r3)
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            if (r1 != r2) goto L12
            return r1
        L12:
            jg7 r1 = defpackage.jg7.a
            return r1
    }

    @Override // defpackage.wl0
    public final defpackage.wl0 f(defpackage.l61 r7, int r8, defpackage.m80 r9) {
            r6 = this;
            vl0 r0 = new vl0
            ul0 r1 = r6.R
            boolean r2 = r6.X
            r3 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // defpackage.wl0
    public final defpackage.le2 g() {
            r2 = this;
            vl0 r0 = new vl0
            ul0 r1 = r2.R
            boolean r2 = r2.X
            r0.<init>(r1, r2)
            return r0
    }

    @Override // defpackage.wl0
    public final defpackage.ul0 i(defpackage.w61 r3) {
            r2 = this;
            boolean r0 = r2.X
            if (r0 == 0) goto L15
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.vl0.Y
            r1 = 1
            int r0 = r0.getAndSet(r2, r1)
            if (r0 == r1) goto Le
            goto L15
        Le:
            java.lang.String r2 = "ReceiveChannel.consumeAsFlow can be collected just once"
            defpackage.i.m(r2)
            r2 = 0
            return r2
        L15:
            int r0 = r2.B
            r1 = -3
            if (r0 != r1) goto L1d
            ul0 r2 = r2.R
            return r2
        L1d:
            ul0 r2 = super.i(r3)
            return r2
    }
}

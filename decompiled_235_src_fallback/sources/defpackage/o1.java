package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o1  reason: default package */
/* loaded from: classes.dex */
public final class o1 extends defpackage.q60 {
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater p;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater q;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater r;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater s;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater t;

    public o1(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5) {
            r0 = this;
            r0.<init>()
            r0.p = r1
            r0.q = r2
            r0.r = r3
            r0.s = r4
            r0.t = r5
            return
    }

    @Override // defpackage.q60
    public final void S(defpackage.q1 r1, defpackage.q1 r2) {
            r0 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r0.q
            r0.lazySet(r1, r2)
            return
    }

    @Override // defpackage.q60
    public final void T(defpackage.q1 r1, java.lang.Thread r2) {
            r0 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r0.p
            r0.lazySet(r1, r2)
            return
    }

    @Override // defpackage.q60
    public final boolean m(defpackage.r1 r3, defpackage.n1 r4, defpackage.n1 r5) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.s
            boolean r1 = r0.compareAndSet(r3, r4, r5)
            if (r1 == 0) goto La
            r2 = 1
            return r2
        La:
            java.lang.Object r0 = r0.get(r3)
            if (r0 == r4) goto L0
            r2 = 0
            return r2
    }

    @Override // defpackage.q60
    public final boolean n(defpackage.r1 r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.t
            boolean r1 = r0.compareAndSet(r3, r4, r5)
            if (r1 == 0) goto La
            r2 = 1
            return r2
        La:
            java.lang.Object r0 = r0.get(r3)
            if (r0 == r4) goto L0
            r2 = 0
            return r2
    }

    @Override // defpackage.q60
    public final boolean o(defpackage.r1 r3, defpackage.q1 r4, defpackage.q1 r5) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.r
            boolean r1 = r0.compareAndSet(r3, r4, r5)
            if (r1 == 0) goto La
            r2 = 1
            return r2
        La:
            java.lang.Object r0 = r0.get(r3)
            if (r0 == r4) goto L0
            r2 = 0
            return r2
    }
}

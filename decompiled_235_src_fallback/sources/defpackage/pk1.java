package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pk1  reason: default package */
/* loaded from: classes.dex */
public final class pk1 extends defpackage.o66 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater Z = null;
    private volatile /* synthetic */ int _decision$volatile;

    static {
            java.lang.Class<pk1> r0 = defpackage.pk1.class
            java.lang.String r1 = "_decision$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.pk1.Z = r0
            return
    }

    @Override // defpackage.o66, defpackage.ed3
    public final void d(java.lang.Object r1) {
            r0 = this;
            r0.g(r1)
            return
    }

    @Override // defpackage.o66, defpackage.ed3
    public final void g(java.lang.Object r4) {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.pk1.Z
            int r1 = r0.get(r3)
            if (r1 == 0) goto L1f
            r0 = 1
            if (r1 != r0) goto L19
            r41 r3 = r3.Y
            r41 r3 = defpackage.np2.V(r3)
            java.lang.Object r4 = defpackage.lb4.H(r4)
            defpackage.ok1.a(r3, r4)
            return
        L19:
            java.lang.String r3 = "Already resumed"
            defpackage.i.m(r3)
            return
        L1f:
            r1 = 2
            r2 = 0
            boolean r0 = r0.compareAndSet(r3, r2, r1)
            if (r0 == 0) goto L0
            return
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vp6  reason: default package */
/* loaded from: classes.dex */
public final class vp6 extends defpackage.u1 {
    public final java.util.concurrent.atomic.AtomicReference a;

    public vp6() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            r2.a = r0
            return
    }

    @Override // defpackage.u1
    public final boolean a(defpackage.t1 r1) {
            r0 = this;
            tp6 r1 = (defpackage.tp6) r1
            java.util.concurrent.atomic.AtomicReference r0 = r0.a
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto Lc
            r0 = 0
            return r0
        Lc:
            gr1 r1 = defpackage.up6.a
            r0.set(r1)
            r0 = 1
            return r0
    }

    @Override // defpackage.u1
    public final defpackage.r41[] b(defpackage.t1 r1) {
            r0 = this;
            tp6 r1 = (defpackage.tp6) r1
            java.util.concurrent.atomic.AtomicReference r0 = r0.a
            r1 = 0
            r0.set(r1)
            r41[] r0 = defpackage.q60.a
            return r0
    }
}

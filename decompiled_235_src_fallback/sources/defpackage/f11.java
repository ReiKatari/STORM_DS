package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f11  reason: default package */
/* loaded from: classes.dex */
public final class f11 implements defpackage.qb6 {
    public final java.util.concurrent.atomic.AtomicReference a;

    public f11(defpackage.qb6 r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r2)
            r1.a = r0
            return
    }

    @Override // defpackage.qb6
    public final java.util.Iterator iterator() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r1 = r1.a
            r0 = 0
            java.lang.Object r1 = r1.getAndSet(r0)
            qb6 r1 = (defpackage.qb6) r1
            if (r1 == 0) goto L10
            java.util.Iterator r1 = r1.iterator()
            return r1
        L10:
            java.lang.String r1 = "This sequence can be consumed only once."
            defpackage.i.m(r1)
            return r0
    }
}

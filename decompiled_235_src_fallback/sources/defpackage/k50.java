package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k50  reason: default package */
/* loaded from: classes.dex */
public final class k50 extends defpackage.q0 {
    public final java.lang.Thread Y;
    public final defpackage.l62 Z;

    public k50(defpackage.l61 r2, java.lang.Thread r3, defpackage.l62 r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            r1.Y = r3
            r1.Z = r4
            return
    }

    @Override // defpackage.ed3
    public final void d(java.lang.Object r1) {
            r0 = this;
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread r0 = r0.Y
            boolean r1 = defpackage.nb3.k(r1, r0)
            if (r1 != 0) goto Lf
            java.util.concurrent.locks.LockSupport.unpark(r0)
        Lf:
            return
    }
}

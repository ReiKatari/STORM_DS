package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dm0  reason: default package */
/* loaded from: classes.dex */
public final class dm0 extends defpackage.wl0 {
    public final java.lang.Iterable R;

    public dm0(java.lang.Iterable r1, defpackage.l61 r2, int r3, defpackage.m80 r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0.R = r1
            return
    }

    @Override // defpackage.wl0
    public final java.lang.Object e(defpackage.r35 r5, defpackage.r41 r6) {
            r4 = this;
            pb6 r6 = new pb6
            r6.<init>(r5)
            java.lang.Iterable r4 = r4.R
            java.util.Iterator r4 = r4.iterator()
        Lb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r4.next()
            le2 r0 = (defpackage.le2) r0
            z r1 = new z
            r2 = 15
            r3 = 0
            r1.<init>(r0, r6, r3, r2)
            r0 = 3
            defpackage.hv.L(r5, r3, r3, r1, r0)
            goto Lb
        L24:
            jg7 r4 = defpackage.jg7.a
            return r4
    }

    @Override // defpackage.wl0
    public final defpackage.wl0 f(defpackage.l61 r2, int r3, defpackage.m80 r4) {
            r1 = this;
            dm0 r0 = new dm0
            java.lang.Iterable r1 = r1.R
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // defpackage.wl0
    public final defpackage.ul0 i(defpackage.w61 r7) {
            r6 = this;
            z r0 = new z
            r1 = 13
            r2 = 0
            r0.<init>(r6, r2, r1)
            m80 r1 = defpackage.m80.SUSPEND
            a71 r3 = defpackage.a71.DEFAULT
            r4 = 4
            int r5 = r6.B
            v80 r1 = defpackage.nb3.c(r5, r1, r2, r4)
            l61 r6 = r6.A
            l61 r6 = defpackage.mb3.M(r7, r6)
            r35 r7 = new r35
            r7.<init>(r6, r1)
            r3.invoke(r0, r7, r7)
            return r7
    }
}

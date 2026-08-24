package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rx6  reason: default package */
/* loaded from: classes.dex */
public final class rx6 extends defpackage.n83 {
    public defpackage.qn2 n0;
    public defpackage.dv7 o0;

    @Override // defpackage.h83, defpackage.z64
    public final void J0() {
            r3 = this;
            android.view.View r0 = defpackage.jw2.z(r3)
            java.util.WeakHashMap r1 = defpackage.dv7.w
            dv7 r1 = defpackage.th7.e(r0)
            r1.a(r0)
            qn2 r0 = r3.n0
            java.lang.Object r0 = r0.g(r1)
            tt7 r0 = (defpackage.tt7) r0
            tt7 r2 = r3.m0
            boolean r2 = defpackage.nb3.k(r0, r2)
            if (r2 != 0) goto L22
            r3.m0 = r0
            r3.S0()
        L22:
            r3.o0 = r1
            super.J0()
            return
    }

    @Override // defpackage.h83, defpackage.z64
    public final void K0() {
            r3 = this;
            android.view.View r0 = defpackage.jw2.z(r3)
            dv7 r1 = r3.o0
            if (r1 == 0) goto L1e
            int r2 = r1.u
            int r2 = r2 + (-1)
            r1.u = r2
            if (r2 != 0) goto L1e
            java.util.WeakHashMap r2 = defpackage.ao7.a
            r2 = 0
            defpackage.sn7.c(r0, r2)
            defpackage.ao7.p(r0, r2)
            k83 r1 = r1.v
            r0.removeOnAttachStateChangeListener(r1)
        L1e:
            super.K0()
            return
    }
}

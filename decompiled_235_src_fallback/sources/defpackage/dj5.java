package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dj5  reason: default package */
/* loaded from: classes.dex */
public final class dj5 extends defpackage.r0 implements defpackage.o61 {
    public final /* synthetic */ defpackage.cy0 B;
    public final /* synthetic */ defpackage.ej5 L;

    public dj5(defpackage.cy0 r2, defpackage.ej5 r3) {
            r1 = this;
            cs1 r0 = defpackage.cs1.Z
            r1.B = r2
            r1.L = r3
            r1.<init>(r0)
            return
    }

    @Override // defpackage.o61
    public final void u(defpackage.l61 r4, java.lang.Throwable r5) {
            r3 = this;
            q6 r0 = new q6
            r1 = 18
            cy0 r2 = r3.B
            ej5 r3 = r3.L
            r0.<init>(r1, r2, r3)
            defpackage.nw7.s0(r5, r0)
            cs1 r0 = defpackage.cs1.Z
            l61 r3 = r3.A
            j61 r3 = r3.Z(r0)
            o61 r3 = (defpackage.o61) r3
            if (r3 == 0) goto L1e
            r3.u(r4, r5)
            return
        L1e:
            throw r5
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rz  reason: default package */
/* loaded from: classes.dex */
public final class rz extends defpackage.z64 {
    public defpackage.u57 k0;
    public final /* synthetic */ defpackage.sz l0;

    public rz(defpackage.sz r1) {
            r0 = this;
            r0.l0 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.z64
    public final void J0() {
            r1 = this;
            sz r0 = r1.l0
            r0.a = r1
            tu0 r0 = r0.b
            if (r0 == 0) goto Lb
            r1.R0()
        Lb:
            return
    }

    @Override // defpackage.z64
    public final void K0() {
            r3 = this;
            sz r0 = r3.l0
            rz r1 = r0.a
            r2 = 0
            if (r1 != r3) goto L9
            r0.a = r2
        L9:
            u57 r0 = r3.k0
            if (r0 == 0) goto L10
            r0.b()
        L10:
            r3.k0 = r2
            return
    }

    public final void R0() {
            r6 = this;
            y r0 = new y
            r1 = 2
            sz r2 = r6.l0
            r0.<init>(r1, r6, r2)
            sm3 r1 = defpackage.nc1.f0(r6)
            int r2 = r1.B
            zp4 r1 = defpackage.vm3.a(r1)
            te r1 = (defpackage.te) r1
            rf5 r1 = r1.getRectManager()
            v57 r3 = r1.c
            r3.getClass()
            p94 r4 = r3.a
            u57 r5 = new u57
            r5.<init>(r3, r2, r6, r0)
            java.lang.Object r0 = r4.b(r2)
            if (r0 != 0) goto L2e
            r4.i(r2, r5)
            r0 = r5
        L2e:
            u57 r0 = (defpackage.u57) r0
            if (r0 == r5) goto L3a
        L32:
            u57 r3 = r0.d
            if (r3 == 0) goto L38
            r0 = r3
            goto L32
        L38:
            r0.d = r5
        L3a:
            z64 r0 = r6.A
            sm3 r0 = defpackage.nc1.f0(r0)
            boolean r0 = r0.Z
            r3 = 1
            if (r0 == 0) goto L4a
            ei r0 = r1.b
            r0.k(r2, r3)
        L4a:
            r1.e = r3
            r1.i()
            r6.k0 = r5
            return
    }
}

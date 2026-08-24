package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w70  reason: default package */
/* loaded from: classes.dex */
public final class w70 extends defpackage.z64 implements defpackage.o70, defpackage.kj3 {
    public defpackage.p31 k0;
    public boolean l0;

    public static final defpackage.of5 R0(defpackage.w70 r2, defpackage.eg4 r3, defpackage.le r4) {
            boolean r0 = r2.j0
            r1 = 0
            if (r0 != 0) goto L6
            goto L24
        L6:
            boolean r0 = r2.l0
            if (r0 != 0) goto Lb
            goto L24
        Lb:
            eg4 r2 = defpackage.nc1.e0(r2)
            z64 r0 = r3.Y0()
            boolean r0 = r0.j0
            if (r0 == 0) goto L18
            goto L19
        L18:
            r3 = r1
        L19:
            if (r3 != 0) goto L1c
            goto L24
        L1c:
            java.lang.Object r4 = r4.c()
            of5 r4 = (defpackage.of5) r4
            if (r4 != 0) goto L25
        L24:
            return r1
        L25:
            r0 = 0
            of5 r2 = r2.O(r3, r0)
            long r2 = r2.d()
            of5 r2 = r4.i(r2)
            return r2
    }

    @Override // defpackage.o70
    public final java.lang.Object G(defpackage.eg4 r8, defpackage.le r9, defpackage.s41 r10) {
            r7 = this;
            u6 r4 = new u6
            r0 = 3
            r4.<init>(r7, r8, r9, r0)
            v70 r0 = new v70
            r5 = 0
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.Object r7 = defpackage.g04.C(r0, r10)
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            if (r7 != r8) goto L19
            return r7
        L19:
            jg7 r7 = defpackage.jg7.a
            return r7
    }

    @Override // defpackage.z64
    public final boolean G0() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.kj3
    public final void m(defpackage.jk3 r1) {
            r0 = this;
            r1 = 1
            r0.l0 = r1
            return
    }
}

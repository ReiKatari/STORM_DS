package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a86  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a86 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.e86 B;

    public /* synthetic */ a86(defpackage.e86 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r3 = this;
            int r0 = r3.A
            e86 r3 = r3.B
            switch(r0) {
                case 0: goto L45;
                default: goto L7;
            }
        L7:
            vh2 r3 = r3.L0
            r0 = r3
            z64 r0 = (defpackage.z64) r0
            z64 r0 = r0.A
            boolean r0 = r0.j0
            r1 = 0
            if (r0 != 0) goto L14
            goto L44
        L14:
            sh2 r0 = r3.W0()
            boolean r2 = r0.getHasFocus()
            if (r2 != 0) goto L1f
            goto L44
        L1f:
            boolean r0 = r0.isFocused()
            if (r0 == 0) goto L2a
            of5 r1 = r3.U0(r1)
            goto L44
        L2a:
            zp4 r0 = defpackage.nc1.g0(r3)
            te r0 = (defpackage.te) r0
            ah2 r0 = r0.getFocusOwner()
            eh2 r0 = (defpackage.eh2) r0
            vh2 r0 = r0.f()
            if (r0 == 0) goto L44
            eg4 r3 = defpackage.nc1.e0(r3)
            of5 r1 = r0.U0(r3)
        L44:
            return r1
        L45:
            boolean r3 = r3.j0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
    }
}

package me.magnum.melonds.ui.inputsetup;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class a extends defpackage.hw6 implements defpackage.fo2 {
    public /* synthetic */ defpackage.b63 X;
    public /* synthetic */ me.magnum.melonds.ui.inputsetup.b.a Y;

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            b63 r2 = (defpackage.b63) r2
            me.magnum.melonds.ui.inputsetup.b$a r3 = (me.magnum.melonds.ui.inputsetup.b.a) r3
            r41 r4 = (defpackage.r41) r4
            me.magnum.melonds.ui.inputsetup.a r1 = new me.magnum.melonds.ui.inputsetup.a
            r0 = 3
            r1.<init>(r0, r4)
            r1.X = r2
            r1.Y = r3
            jg7 r2 = defpackage.jg7.a
            java.lang.Object r1 = r1.s(r2)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r3) {
            r2 = this;
            b63 r0 = r2.X
            me.magnum.melonds.ui.inputsetup.b$a r2 = r2.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r3)
            if (r0 != 0) goto L10
            if (r2 == 0) goto Le
            goto L10
        Le:
            r2 = 0
            goto L11
        L10:
            r2 = 1
        L11:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }
}

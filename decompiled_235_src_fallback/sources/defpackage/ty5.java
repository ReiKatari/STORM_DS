package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ty5  reason: default package */
/* loaded from: classes.dex */
public final class ty5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ me.magnum.melonds.MelonRomDecryptor.a X;
    public final /* synthetic */ defpackage.qa4 Y;

    public ty5(me.magnum.melonds.MelonRomDecryptor.a r1, defpackage.qa4 r2, defpackage.r41 r3) {
            r0 = this;
            r0.X = r1
            r0.Y = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            ty5 r0 = (defpackage.ty5) r0
            jg7 r1 = defpackage.jg7.a
            r0.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            ty5 r3 = new ty5
            me.magnum.melonds.MelonRomDecryptor$a r0 = r1.X
            qa4 r1 = r1.Y
            r3.<init>(r0, r1, r2)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r2) {
            r1 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r2)
            me.magnum.melonds.MelonRomDecryptor$a r2 = me.magnum.melonds.MelonRomDecryptor.a.SUCCESS
            qa4 r0 = r1.Y
            me.magnum.melonds.MelonRomDecryptor$a r1 = r1.X
            if (r1 == r2) goto L18
            me.magnum.melonds.MelonRomDecryptor$a r2 = me.magnum.melonds.MelonRomDecryptor.a.ALREADY_DECRYPTED
            if (r1 != r2) goto L12
            goto L18
        L12:
            xc1 r1 = defpackage.xc1.ERROR
            r0.setValue(r1)
            goto L1d
        L18:
            xc1 r1 = defpackage.xc1.SUCCESS
            r0.setValue(r1)
        L1d:
            jg7 r1 = defpackage.jg7.a
            return r1
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fh  reason: default package */
/* loaded from: classes.dex */
public final class fh extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ boolean X;

    public fh(boolean r1, defpackage.r41 r2) {
            r0 = this;
            r0.X = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            fh r0 = (defpackage.fh) r0
            jg7 r1 = defpackage.jg7.a
            r0.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r1, java.lang.Object r2) {
            r0 = this;
            fh r2 = new fh
            boolean r0 = r0.X
            r2.<init>(r0, r1)
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r2) {
            r1 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r2)
            me.magnum.melonds.MelonEmulator r2 = me.magnum.melonds.MelonEmulator.a
            boolean r1 = r1.X
            r2.setRetroAchievementsSubmissionTransportSuspended(r1)
            jg7 r1 = defpackage.jg7.a
            return r1
    }
}

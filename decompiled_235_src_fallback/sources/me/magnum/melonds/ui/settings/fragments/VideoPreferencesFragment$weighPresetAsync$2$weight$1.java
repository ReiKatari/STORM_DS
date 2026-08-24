package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$weighPresetAsync$2$weight$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$weighPresetAsync$2$weight$1 extends defpackage.hw6 implements defpackage.eo2 {
    public /* synthetic */ java.lang.Object X;
    public final /* synthetic */ java.lang.String Y;
    public final /* synthetic */ java.io.File Z;

    public VideoPreferencesFragment$weighPresetAsync$2$weight$1(java.lang.String r1, java.io.File r2, defpackage.r41 r3) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
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
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$weighPresetAsync$2$weight$1 r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$weighPresetAsync$2$weight$1) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$weighPresetAsync$2$weight$1 r0 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$weighPresetAsync$2$weight$1
            java.lang.String r1 = r2.Y
            java.io.File r2 = r2.Z
            r0.<init>(r1, r2, r3)
            r0.X = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = r2.X
            w61 r0 = (defpackage.w61) r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r3)
            java.lang.String r3 = r2.Y
            java.io.File r2 = r2.Z
            uf6 r0 = new uf6     // Catch: java.lang.Throwable -> L18
            r1 = 1
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L18
            ep5 r2 = defpackage.fp5.g(r3, r0)     // Catch: java.lang.Throwable -> L18
            goto L1f
        L18:
            r2 = move-exception
            em5 r3 = new em5
            r3.<init>(r2)
            r2 = r3
        L1f:
            boolean r3 = r2 instanceof defpackage.em5
            if (r3 == 0) goto L25
            r2 = 0
        L25:
            return r2
    }
}

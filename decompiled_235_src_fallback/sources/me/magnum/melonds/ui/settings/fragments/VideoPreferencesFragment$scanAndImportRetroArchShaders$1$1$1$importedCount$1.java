package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1 extends defpackage.hw6 implements defpackage.eo2 {
    public /* synthetic */ java.lang.Object X;
    public final /* synthetic */ java.io.File Y;
    public final /* synthetic */ java.io.File Z;

    public VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1(java.io.File r1, java.io.File r2, defpackage.r41 r3) {
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
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1 r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1 r0 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$1$1$importedCount$1
            java.io.File r1 = r2.Y
            java.io.File r2 = r2.Z
            r0.<init>(r1, r2, r3)
            r0.X = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = r3.X
            w61 r0 = (defpackage.w61) r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            java.io.File r4 = r3.Y
            java.io.File r3 = r3.Z
            r0 = 0
            defpackage.jc2.v0(r4, r3)     // Catch: java.lang.Throwable -> L3d
            ic2 r4 = defpackage.ic2.TOP_DOWN     // Catch: java.lang.Throwable -> L3d
            hc2 r3 = defpackage.jc2.E0(r3, r4)     // Catch: java.lang.Throwable -> L3d
            rk7 r4 = new rk7     // Catch: java.lang.Throwable -> L3d
            r1 = 2
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L3d
            pc2 r1 = new pc2     // Catch: java.lang.Throwable -> L3d
            r2 = 1
            r1.<init>(r3, r2, r4)     // Catch: java.lang.Throwable -> L3d
            oc2 r3 = new oc2     // Catch: java.lang.Throwable -> L3d
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L3d
            r4 = r0
        L29:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L3c
            r3.next()     // Catch: java.lang.Throwable -> L3d
            int r4 = r4 + 1
            if (r4 < 0) goto L37
            goto L29
        L37:
            defpackage.hf.p0()     // Catch: java.lang.Throwable -> L3d
            r3 = 0
            throw r3     // Catch: java.lang.Throwable -> L3d
        L3c:
            r0 = r4
        L3d:
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r0)
            return r3
    }
}

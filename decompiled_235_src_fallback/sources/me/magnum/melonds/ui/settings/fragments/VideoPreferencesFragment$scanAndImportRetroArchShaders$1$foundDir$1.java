package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$foundDir$1", f = "VideoPreferencesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$scanAndImportRetroArchShaders$1$foundDir$1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ java.util.List X;

    public VideoPreferencesFragment$scanAndImportRetroArchShaders$1$foundDir$1(java.util.List r1, defpackage.r41 r2) {
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
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$foundDir$1 r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$foundDir$1) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r1, java.lang.Object r2) {
            r0 = this;
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$foundDir$1 r2 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1$foundDir$1
            java.util.List r0 = r0.X
            r2.<init>(r0, r1)
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r0 = 10
            java.util.List r7 = r7.X
            int r0 = defpackage.ht0.v0(r7, r0)
            r8.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
        L16:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            r8.add(r1)
            goto L16
        L2b:
            int r7 = r8.size()
            r0 = 0
        L30:
            r1 = 0
            if (r0 >= r7) goto L76
            java.lang.Object r2 = r8.get(r0)
            int r0 = r0 + 1
            r3 = r2
            java.io.File r3 = (java.io.File) r3
            boolean r4 = r3.exists()
            if (r4 == 0) goto L30
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L30
            ic2 r4 = defpackage.ic2.TOP_DOWN
            hc2 r3 = defpackage.jc2.E0(r3, r4)
            hc2 r4 = new hc2
            java.io.File r5 = r3.a
            ic2 r3 = r3.b
            r6 = 3
            r4.<init>(r5, r3, r1, r6)
            fc2 r1 = new fc2
            r1.<init>(r4)
        L5d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r1.next()
            java.io.File r3 = (java.io.File) r3
            java.lang.String r3 = defpackage.jc2.y0(r3)
            java.lang.String r4 = "slangp"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L5d
            return r2
        L76:
            return r1
    }
}

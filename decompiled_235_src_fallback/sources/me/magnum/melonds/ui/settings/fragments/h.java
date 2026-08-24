package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements android.view.View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ h(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            int r4 = r3.A
            java.lang.Object r0 = r3.L
            java.lang.Object r3 = r3.B
            switch(r4) {
                case 0: goto L15;
                default: goto L9;
            }
        L9:
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserAdapter r3 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserAdapter) r3
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserItem r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserItem) r0
            int r4 = me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserAdapter.ViewHolder.A
            me.magnum.melonds.ui.settings.fragments.d r3 = r3.e
            r3.g(r0)
            return
        L15:
            ac r3 = (defpackage.ac) r3
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r0 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment) r0
            r3.dismiss()
            android.content.Context r3 = r0.requireContext()
            r3.getClass()
            au3 r4 = defpackage.bl2.C(r0)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1 r1 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$scanAndImportRetroArchShaders$1
            r2 = 0
            r1.<init>(r3, r0, r2)
            r3 = 3
            defpackage.hv.L(r4, r2, r2, r1, r3)
            return
    }
}

package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements defpackage.qn2 {
    public final /* synthetic */ java.lang.String A;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserAdapter B;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserAdapter.ViewHolder L;

    public /* synthetic */ l(java.lang.String r1, me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserAdapter r2, me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserAdapter.ViewHolder r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r9) {
            r8 = this;
            ep5 r9 = (defpackage.ep5) r9
            int r0 = me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserAdapter.ViewHolder.A
            r9.getClass()
            int r0 = r9.a
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserAdapter$ViewHolder r1 = r8.L
            wf5 r2 = r1.s
            android.widget.TextView r3 = r1.x
            android.widget.TextView r4 = r1.w
            r5 = -1
            if (r2 != 0) goto L15
            goto L2f
        L15:
            androidx.recyclerview.widget.RecyclerView r2 = r1.r
            if (r2 != 0) goto L1a
            goto L2f
        L1a:
            wf5 r2 = r2.getAdapter()
            if (r2 != 0) goto L21
            goto L2f
        L21:
            androidx.recyclerview.widget.RecyclerView r6 = r1.r
            int r6 = r6.K(r1)
            if (r6 != r5) goto L2a
            goto L2f
        L2a:
            wf5 r7 = r1.s
            if (r7 != r2) goto L2f
            r5 = r6
        L2f:
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserAdapter r2 = r8.B
            java.util.ArrayList r2 = r2.f
            java.lang.Object r2 = defpackage.gt0.K0(r5, r2)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserItem r2 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserItem) r2
            if (r2 == 0) goto L3e
            java.lang.String r2 = r2.b
            goto L3f
        L3e:
            r2 = 0
        L3f:
            java.lang.String r8 = r8.A
            boolean r8 = defpackage.nb3.k(r8, r2)
            jg7 r2 = defpackage.jg7.a
            if (r8 != 0) goto L4a
            goto L94
        L4a:
            r8 = 0
            r4.setVisibility(r8)
            android.view.View r1 = r1.a
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r6 = 2131886084(0x7f120004, float:1.9406737E38)
            java.lang.String r1 = r1.getQuantityString(r6, r0, r5)
            r4.setText(r1)
            long r4 = r9.b
            r6 = 15
            long r4 = r4 * r6
            r6 = 100
            long r4 = r4 / r6
            long r0 = (long) r0
            r6 = 40
            long r0 = r0 * r6
            long r0 = r0 + r4
            r4 = 2
            long r0 = r0 * r4
            r4 = 60000(0xea60, double:2.9644E-319)
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 < 0) goto L83
            r9 = 1
            goto L84
        L83:
            r9 = r8
        L84:
            if (r9 == 0) goto L87
            goto L89
        L87:
            r8 = 8
        L89:
            r3.setVisibility(r8)
            if (r9 == 0) goto L94
            r8 = 2131952826(0x7f1304ba, float:1.9542106E38)
            r3.setText(r8)
        L94:
            return r2
    }
}

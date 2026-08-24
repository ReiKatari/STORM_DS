package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements defpackage.qn2 {
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment A;
    public final /* synthetic */ androidx.preference.ListPreference B;
    public final /* synthetic */ defpackage.ac L;
    public final /* synthetic */ defpackage.dh5 R;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderDirectoryLister X;
    public final /* synthetic */ java.util.LinkedHashMap Y;
    public final /* synthetic */ android.widget.TextView Z;
    public final /* synthetic */ android.widget.TextView d0;
    public final /* synthetic */ defpackage.dh5 e0;

    public /* synthetic */ d(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1, androidx.preference.ListPreference r2, defpackage.ac r3, defpackage.dh5 r4, me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderDirectoryLister r5, java.util.LinkedHashMap r6, android.widget.TextView r7, android.widget.TextView r8, defpackage.dh5 r9) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            r0.Y = r6
            r0.Z = r7
            r0.d0 = r8
            r0.e0 = r9
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r10) {
            r9 = this;
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderBrowserItem r10 = (me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderBrowserItem) r10
            r10.getClass()
            boolean r0 = r10.c
            java.lang.String r8 = r10.b
            if (r0 == 0) goto L1d
            dh5 r1 = r9.R
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r2 = r9.A
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$ShaderDirectoryLister r3 = r9.X
            java.util.LinkedHashMap r4 = r9.Y
            android.widget.TextView r5 = r9.Z
            android.widget.TextView r6 = r9.d0
            dh5 r7 = r9.e0
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.z(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L3b
        L1d:
            androidx.preference.ListPreference r10 = r9.B
            r10.h(r8)
            java.lang.String[] r0 = new java.lang.String[]{r8}
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            r10.g(r0)
            java.lang.String[] r0 = new java.lang.String[]{r8}
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            r10.d0 = r0
            r10.setSummary(r8)
            ac r9 = r9.L
            r9.dismiss()
        L3b:
            jg7 r9 = defpackage.jg7.a
            return r9
    }
}

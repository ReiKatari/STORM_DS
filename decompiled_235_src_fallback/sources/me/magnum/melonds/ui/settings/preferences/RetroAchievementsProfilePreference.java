package me.magnum.melonds.ui.settings.preferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RetroAchievementsProfilePreference extends androidx.preference.Preference {
    public final defpackage.vs4 A;

    public RetroAchievementsProfilePreference(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1, r2)
            r1 = 0
            vs4 r1 = defpackage.np2.Y(r1)
            r0.A = r1
            r1 = 2131624084(0x7f0e0094, float:1.8875338E38)
            r0.setLayoutResource(r1)
            r1 = 0
            r0.setSelectable(r1)
            r0.setVisible(r1)
            return
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(defpackage.x15 r4) {
            r3 = this;
            r4.getClass()
            super.onBindViewHolder(r4)
            android.view.View r4 = r4.a
            boolean r0 = r4 instanceof androidx.compose.ui.platform.ComposeView
            if (r0 == 0) goto Lf
            androidx.compose.ui.platform.ComposeView r4 = (androidx.compose.ui.platform.ComposeView) r4
            goto L10
        Lf:
            r4 = 0
        L10:
            if (r4 != 0) goto L13
            return
        L13:
            cs1 r0 = defpackage.cs1.p0
            r4.setViewCompositionStrategy(r0)
            nn5 r0 = new nn5
            r1 = 0
            r0.<init>(r3, r1)
            zv0 r3 = new zv0
            r1 = -1262964841(0xffffffffb4b8af97, float:-3.440043E-7)
            r2 = 1
            r3.<init>(r1, r2, r0)
            r4.setContent(r3)
            return
    }
}

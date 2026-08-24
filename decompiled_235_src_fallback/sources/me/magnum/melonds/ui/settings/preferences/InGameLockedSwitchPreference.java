package me.magnum.melonds.ui.settings.preferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class InGameLockedSwitchPreference extends androidx.preference.SwitchPreference {
    public boolean e0;
    public int f0;

    public InGameLockedSwitchPreference(android.content.Context r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public InGameLockedSwitchPreference(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r7.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public InGameLockedSwitchPreference(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1, r2, r3)
            return
    }

    public /* synthetic */ InGameLockedSwitchPreference(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, defpackage.id1 r5) {
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Lc
            r3 = 2130969850(0x7f0404fa, float:1.7548394E38)
        Lc:
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    public final void onBindViewHolder(defpackage.x15 r1) {
            r0 = this;
            r1.getClass()
            super.onBindViewHolder(r1)
            android.view.View r1 = r1.a
            boolean r0 = r0.e0
            if (r0 == 0) goto Lf
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L11
        Lf:
            r0 = 1065353216(0x3f800000, float:1.0)
        L11:
            r1.setAlpha(r0)
            return
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    public final void onClick() {
            r2 = this;
            boolean r0 = r2.e0
            if (r0 == 0) goto L17
            int r0 = r2.f0
            if (r0 == 0) goto L16
            android.content.Context r0 = r2.getContext()
            int r2 = r2.f0
            r1 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r0, r2, r1)
            r2.show()
        L16:
            return
        L17:
            super.onClick()
            return
    }
}

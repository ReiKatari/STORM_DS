package me.magnum.melonds.ui.settings.preferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class InGameLockedListPreference extends androidx.preference.ListPreference {
    public boolean h0;
    public int i0;

    public InGameLockedListPreference(android.content.Context r7) {
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

    public InGameLockedListPreference(android.content.Context r7, android.util.AttributeSet r8) {
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

    public InGameLockedListPreference(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r2.getClass()
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public /* synthetic */ InGameLockedListPreference(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, defpackage.id1 r5) {
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Lc
            r3 = 2130969007(0x7f0401af, float:1.7546684E38)
        Lc:
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(defpackage.x15 r1) {
            r0 = this;
            r1.getClass()
            super.onBindViewHolder(r1)
            android.view.View r1 = r1.a
            boolean r0 = r0.h0
            if (r0 == 0) goto Lf
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L11
        Lf:
            r0 = 1065353216(0x3f800000, float:1.0)
        L11:
            r1.setAlpha(r0)
            return
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void onClick() {
            r2 = this;
            boolean r0 = r2.h0
            if (r0 == 0) goto L17
            int r0 = r2.i0
            if (r0 == 0) goto L16
            android.content.Context r0 = r2.getContext()
            int r2 = r2.i0
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

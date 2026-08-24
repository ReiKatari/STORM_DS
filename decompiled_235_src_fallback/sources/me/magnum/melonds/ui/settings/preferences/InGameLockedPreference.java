package me.magnum.melonds.ui.settings.preferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class InGameLockedPreference extends androidx.preference.Preference {
    public boolean A;
    public int B;

    public InGameLockedPreference(android.content.Context r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
    }

    public InGameLockedPreference(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1, r2)
            return
    }

    public /* synthetic */ InGameLockedPreference(android.content.Context r1, android.util.AttributeSet r2, int r3, defpackage.id1 r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(defpackage.x15 r1) {
            r0 = this;
            r1.getClass()
            super.onBindViewHolder(r1)
            android.view.View r1 = r1.a
            boolean r0 = r0.A
            if (r0 == 0) goto Lf
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L11
        Lf:
            r0 = 1065353216(0x3f800000, float:1.0)
        L11:
            r1.setAlpha(r0)
            return
    }

    @Override // androidx.preference.Preference
    public final void onClick() {
            r2 = this;
            boolean r0 = r2.A
            if (r0 == 0) goto L17
            int r0 = r2.B
            if (r0 == 0) goto L16
            android.content.Context r0 = r2.getContext()
            int r2 = r2.B
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

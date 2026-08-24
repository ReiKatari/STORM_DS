package androidx.preference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class PreferenceCategory extends androidx.preference.PreferenceGroup {
    public PreferenceCategory(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 2130969656(0x7f040438, float:1.7548E38)
            r1 = 16842892(0x101008c, float:2.369395E-38)
            int r0 = defpackage.xk2.l(r3, r0, r1)
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            return
    }

    @Override // androidx.preference.Preference
    public final boolean isEnabled() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(defpackage.x15 r2) {
            r1 = this;
            super.onBindViewHolder(r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto Le
            android.view.View r1 = r2.a
            defpackage.o05.o(r1)
        Le:
            return
    }

    @Override // androidx.preference.Preference
    public final boolean shouldDisableDependents() {
            r0 = this;
            boolean r0 = super.isEnabled()
            r0 = r0 ^ 1
            return r0
    }
}

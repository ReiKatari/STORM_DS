package androidx.preference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class PreferenceScreen extends androidx.preference.PreferenceGroup {
    public final boolean Z;

    public PreferenceScreen(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 2130969663(0x7f04043f, float:1.7548014E38)
            r1 = 16842891(0x101008b, float:2.3693948E-38)
            int r0 = defpackage.xk2.l(r3, r0, r1)
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            r3 = 1
            r2.Z = r3
            return
    }

    @Override // androidx.preference.Preference
    public final void onClick() {
            r1 = this;
            android.content.Intent r0 = r1.getIntent()
            if (r0 != 0) goto L20
            java.lang.String r0 = r1.getFragment()
            if (r0 != 0) goto L20
            java.util.ArrayList r0 = r1.B
            int r0 = r0.size()
            if (r0 != 0) goto L15
            goto L20
        L15:
            v15 r0 = r1.getPreferenceManager()
            k15 r0 = r0.j
            if (r0 == 0) goto L20
            r0.onNavigateToScreen(r1)
        L20:
            return
    }
}

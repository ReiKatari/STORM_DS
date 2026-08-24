package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bq0  reason: default package */
/* loaded from: classes.dex */
public final class bq0 implements android.widget.CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.preference.TwoStatePreference b;

    public /* synthetic */ bq0(androidx.preference.TwoStatePreference r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton r2, boolean r3) {
            r1 = this;
            int r0 = r1.a
            androidx.preference.TwoStatePreference r1 = r1.b
            switch(r0) {
                case 0: goto L33;
                case 1: goto L1d;
                default: goto L7;
            }
        L7:
            androidx.preference.SwitchPreferenceCompat r1 = (androidx.preference.SwitchPreferenceCompat) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = r1.callChangeListener(r0)
            if (r0 != 0) goto L19
            r1 = r3 ^ 1
            r2.setChecked(r1)
            goto L1c
        L19:
            r1.e(r3)
        L1c:
            return
        L1d:
            androidx.preference.SwitchPreference r1 = (androidx.preference.SwitchPreference) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = r1.callChangeListener(r0)
            if (r0 != 0) goto L2f
            r1 = r3 ^ 1
            r2.setChecked(r1)
            goto L32
        L2f:
            r1.e(r3)
        L32:
            return
        L33:
            androidx.preference.CheckBoxPreference r1 = (androidx.preference.CheckBoxPreference) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = r1.callChangeListener(r0)
            if (r0 != 0) goto L45
            r1 = r3 ^ 1
            r2.setChecked(r1)
            goto L48
        L45:
            r1.e(r3)
        L48:
            return
    }
}

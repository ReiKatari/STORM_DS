package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dx3  reason: default package */
/* loaded from: classes.dex */
public class dx3 extends defpackage.f15 {
    public int e0;
    public java.lang.CharSequence[] f0;
    public java.lang.CharSequence[] g0;

    public dx3() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.f15
    public final void k(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L1d
            int r2 = r1.e0
            if (r2 < 0) goto L1d
            java.lang.CharSequence[] r0 = r1.g0
            r2 = r0[r2]
            java.lang.String r2 = r2.toString()
            androidx.preference.DialogPreference r1 = r1.i()
            androidx.preference.ListPreference r1 = (androidx.preference.ListPreference) r1
            boolean r0 = r1.callChangeListener(r2)
            if (r0 == 0) goto L1d
            r1.h(r2)
        L1d:
            return
    }

    @Override // defpackage.f15
    public final void l(defpackage.zb r4) {
            r3 = this;
            java.lang.CharSequence[] r0 = r3.f0
            int r1 = r3.e0
            cx3 r2 = new cx3
            r2.<init>(r3)
            java.lang.Object r3 = r4.L
            wb r3 = (defpackage.wb) r3
            r3.q = r0
            r3.s = r2
            r3.y = r1
            r4 = 1
            r3.x = r4
            r4 = 0
            r3.g = r4
            r3.h = r4
            return
    }

    @Override // defpackage.f15, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            if (r3 != 0) goto L2a
            androidx.preference.DialogPreference r3 = r2.i()
            androidx.preference.ListPreference r3 = (androidx.preference.ListPreference) r3
            java.lang.CharSequence[] r0 = r3.Z
            if (r0 == 0) goto L24
            java.lang.CharSequence[] r0 = r3.d0
            if (r0 == 0) goto L24
            java.lang.String r0 = r3.e0
            int r0 = r3.e(r0)
            r2.e0 = r0
            java.lang.CharSequence[] r0 = r3.Z
            r2.f0 = r0
            java.lang.CharSequence[] r3 = r3.d0
            r2.g0 = r3
            return
        L24:
            java.lang.String r2 = "ListPreference requires an entries array and an entryValues array."
            defpackage.i.m(r2)
            return
        L2a:
            java.lang.String r0 = "ListPreferenceDialogFragment.index"
            r1 = 0
            int r0 = r3.getInt(r0, r1)
            r2.e0 = r0
            java.lang.String r0 = "ListPreferenceDialogFragment.entries"
            java.lang.CharSequence[] r0 = r3.getCharSequenceArray(r0)
            r2.f0 = r0
            java.lang.String r0 = "ListPreferenceDialogFragment.entryValues"
            java.lang.CharSequence[] r3 = r3.getCharSequenceArray(r0)
            r2.g0 = r3
            return
    }

    @Override // defpackage.f15, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            java.lang.String r0 = "ListPreferenceDialogFragment.index"
            int r1 = r2.e0
            r3.putInt(r0, r1)
            java.lang.String r0 = "ListPreferenceDialogFragment.entries"
            java.lang.CharSequence[] r1 = r2.f0
            r3.putCharSequenceArray(r0, r1)
            java.lang.String r0 = "ListPreferenceDialogFragment.entryValues"
            java.lang.CharSequence[] r2 = r2.g0
            r3.putCharSequenceArray(r0, r2)
            return
    }
}

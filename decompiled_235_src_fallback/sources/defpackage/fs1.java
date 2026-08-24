package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fs1  reason: default package */
/* loaded from: classes.dex */
public class fs1 extends defpackage.f15 {
    public android.widget.EditText e0;
    public java.lang.CharSequence f0;
    public final defpackage.g15 g0;
    public long h0;

    public fs1() {
            r2 = this;
            r2.<init>()
            g15 r0 = new g15
            r1 = 6
            r0.<init>(r2, r1)
            r2.g0 = r0
            r0 = -1
            r2.h0 = r0
            return
    }

    @Override // defpackage.f15
    public final void j(android.view.View r2) {
            r1 = this;
            super.j(r2)
            r0 = 16908291(0x1020003, float:2.3877237E-38)
            android.view.View r2 = r2.findViewById(r0)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.e0 = r2
            if (r2 == 0) goto L31
            r2.requestFocus()
            android.widget.EditText r2 = r1.e0
            java.lang.CharSequence r0 = r1.f0
            r2.setText(r0)
            android.widget.EditText r2 = r1.e0
            android.text.Editable r0 = r2.getText()
            int r0 = r0.length()
            r2.setSelection(r0)
            androidx.preference.DialogPreference r1 = r1.i()
            androidx.preference.EditTextPreference r1 = (androidx.preference.EditTextPreference) r1
            r1.getClass()
            return
        L31:
            java.lang.String r1 = "Dialog view must contain an EditText with id @android:id/edit"
            defpackage.i.m(r1)
            return
    }

    @Override // defpackage.f15
    public final void k(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L1b
            android.widget.EditText r2 = r1.e0
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            androidx.preference.DialogPreference r1 = r1.i()
            androidx.preference.EditTextPreference r1 = (androidx.preference.EditTextPreference) r1
            boolean r0 = r1.callChangeListener(r2)
            if (r0 == 0) goto L1b
            r1.e(r2)
        L1b:
            return
    }

    public final void m() {
            r6 = this;
            long r0 = r6.h0
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L49
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r4
            long r4 = android.os.SystemClock.currentThreadTimeMillis()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L49
            android.widget.EditText r0 = r6.e0
            if (r0 == 0) goto L47
            boolean r0 = r0.isFocused()
            if (r0 != 0) goto L1e
            goto L47
        L1e:
            android.widget.EditText r0 = r6.e0
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            android.widget.EditText r1 = r6.e0
            r4 = 0
            boolean r0 = r0.showSoftInput(r1, r4)
            if (r0 == 0) goto L38
            r6.h0 = r2
            return
        L38:
            android.widget.EditText r0 = r6.e0
            g15 r1 = r6.g0
            r0.removeCallbacks(r1)
            android.widget.EditText r6 = r6.e0
            r2 = 50
            r6.postDelayed(r1, r2)
            return
        L47:
            r6.h0 = r2
        L49:
            return
    }

    @Override // defpackage.f15, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            if (r2 != 0) goto L10
            androidx.preference.DialogPreference r2 = r1.i()
            androidx.preference.EditTextPreference r2 = (androidx.preference.EditTextPreference) r2
            java.lang.String r2 = r2.Z
            r1.f0 = r2
            return
        L10:
            java.lang.String r0 = "EditTextPreferenceDialogFragment.text"
            java.lang.CharSequence r2 = r2.getCharSequence(r0)
            r1.f0 = r2
            return
    }

    @Override // defpackage.f15, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(android.os.Bundle r2) {
            r1 = this;
            super.onSaveInstanceState(r2)
            java.lang.String r0 = "EditTextPreferenceDialogFragment.text"
            java.lang.CharSequence r1 = r1.f0
            r2.putCharSequence(r0, r1)
            return
    }
}

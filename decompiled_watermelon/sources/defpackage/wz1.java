package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wz1  reason: default package */
/* loaded from: classes.dex */
public final class wz1 {
    public final /* synthetic */ yz1 a;

    public wz1(yz1 yz1Var) {
        this.a = yz1Var;
    }

    public final void a(TextInputLayout textInputLayout) {
        yz1 yz1Var = this.a;
        vz1 vz1Var = yz1Var.t0;
        if (yz1Var.q0 == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = yz1Var.q0;
        if (editText != null) {
            editText.removeTextChangedListener(vz1Var);
            if (yz1Var.q0.getOnFocusChangeListener() == yz1Var.b().e()) {
                yz1Var.q0.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        yz1Var.q0 = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(vz1Var);
        }
        yz1Var.b().l(yz1Var.q0);
        yz1Var.j(yz1Var.b());
    }
}

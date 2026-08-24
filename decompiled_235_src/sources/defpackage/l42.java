package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l42  reason: default package */
/* loaded from: classes.dex */
public final class l42 {
    public final /* synthetic */ n42 a;

    public l42(n42 n42Var) {
        this.a = n42Var;
    }

    public final void a(TextInputLayout textInputLayout) {
        n42 n42Var = this.a;
        k42 k42Var = n42Var.u0;
        if (n42Var.r0 == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = n42Var.r0;
        if (editText != null) {
            editText.removeTextChangedListener(k42Var);
            if (n42Var.r0.getOnFocusChangeListener() == n42Var.b().e()) {
                n42Var.r0.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        n42Var.r0 = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(k42Var);
        }
        n42Var.b().l(n42Var.r0);
        n42Var.j(n42Var.b());
    }
}

package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: it4  reason: default package */
/* loaded from: classes.dex */
public final class it4 extends o42 {
    public final int e;
    public EditText f;
    public final hr0 g;

    public it4(n42 n42Var, int i) {
        super(n42Var);
        this.e = R.drawable.design_password_eye;
        this.g = new hr0(this, 4);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.o42
    public final void b() {
        p();
    }

    @Override // defpackage.o42
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.o42
    public final int d() {
        return this.e;
    }

    @Override // defpackage.o42
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.o42
    public final boolean j() {
        return true;
    }

    @Override // defpackage.o42
    public final boolean k() {
        boolean z;
        EditText editText = this.f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // defpackage.o42
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.o42
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.o42
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

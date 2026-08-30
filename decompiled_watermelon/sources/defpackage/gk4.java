package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gk4  reason: default package */
/* loaded from: classes.dex */
public final class gk4 extends zz1 {
    public final int e;
    public EditText f;
    public final xo0 g;

    public gk4(yz1 yz1Var, int i) {
        super(yz1Var);
        this.e = R.drawable.design_password_eye;
        this.g = new xo0(5, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.zz1
    public final void b() {
        p();
    }

    @Override // defpackage.zz1
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.zz1
    public final int d() {
        return this.e;
    }

    @Override // defpackage.zz1
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.zz1
    public final boolean j() {
        return true;
    }

    @Override // defpackage.zz1
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

    @Override // defpackage.zz1
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.zz1
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.zz1
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

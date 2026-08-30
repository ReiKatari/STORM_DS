package qa;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends n {

    /* renamed from: e  reason: collision with root package name */
    public final int f12499e;

    /* renamed from: f  reason: collision with root package name */
    public EditText f12500f;

    /* renamed from: g  reason: collision with root package name */
    public final ah.f f12501g;

    public t(m mVar, int i2) {
        super(mVar);
        this.f12499e = R.drawable.design_password_eye;
        this.f12501g = new ah.f(5, this);
        if (i2 != 0) {
            this.f12499e = i2;
        }
    }

    @Override // qa.n
    public final void b() {
        p();
    }

    @Override // qa.n
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // qa.n
    public final int d() {
        return this.f12499e;
    }

    @Override // qa.n
    public final View.OnClickListener f() {
        return this.f12501g;
    }

    @Override // qa.n
    public final boolean j() {
        return true;
    }

    @Override // qa.n
    public final boolean k() {
        boolean z10;
        EditText editText = this.f12500f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }

    @Override // qa.n
    public final void l(EditText editText) {
        this.f12500f = editText;
        p();
    }

    @Override // qa.n
    public final void q() {
        EditText editText = this.f12500f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f12500f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // qa.n
    public final void r() {
        EditText editText = this.f12500f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

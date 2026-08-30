package qa;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f12438a;

    public l(m mVar) {
        this.f12438a = mVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        m mVar = this.f12438a;
        k kVar = mVar.f12455s0;
        if (mVar.p0 == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = mVar.p0;
        if (editText != null) {
            editText.removeTextChangedListener(kVar);
            if (mVar.p0.getOnFocusChangeListener() == mVar.b().e()) {
                mVar.p0.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        mVar.p0 = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(kVar);
        }
        mVar.b().l(mVar.p0);
        mVar.j(mVar.b());
    }
}

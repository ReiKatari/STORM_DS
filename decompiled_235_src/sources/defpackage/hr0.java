package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hr0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hr0 implements View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ hr0(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                lr0 lr0Var = (lr0) obj;
                EditText editText = lr0Var.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    lr0Var.p();
                    return;
                }
                return;
            case 1:
                ((vp1) obj).t();
                return;
            case 2:
                LayoutEditorView layoutEditorView = (LayoutEditorView) obj;
                if (layoutEditorView.h0 != null) {
                    layoutEditorView.n();
                    return;
                }
                View.OnClickListener onClickListener = layoutEditorView.e0;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 3:
                ((k24) obj).i();
                throw null;
            case 4:
                it4 it4Var = (it4) obj;
                EditText editText2 = it4Var.f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = it4Var.f;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    EditText editText4 = it4Var.f;
                    if (z) {
                        editText4.setTransformationMethod(null);
                    } else {
                        editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        it4Var.f.setSelection(selectionEnd);
                    }
                    it4Var.p();
                    return;
                }
                return;
            default:
                int i2 = RomListActivity.K0;
                ((ac) obj).dismiss();
                return;
        }
    }
}

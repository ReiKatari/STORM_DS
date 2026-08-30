package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import java.util.List;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xo0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xo0 implements View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ xo0(int i, Object obj) {
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
                bp0 bp0Var = (bp0) obj;
                EditText editText = bp0Var.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    bp0Var.p();
                    return;
                }
                return;
            case 1:
                ((ol1) obj).t();
                return;
            case 2:
                LayoutEditorView layoutEditorView = (LayoutEditorView) obj;
                if (layoutEditorView.g0 != null) {
                    layoutEditorView.m();
                    return;
                }
                View.OnClickListener onClickListener = layoutEditorView.d0;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 3:
                ((bv3) obj).k();
                throw null;
            case 4:
                List list = f74.c0;
                ((c9) obj).a(null);
                return;
            default:
                gk4 gk4Var = (gk4) obj;
                EditText editText2 = gk4Var.f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = gk4Var.f;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    EditText editText4 = gk4Var.f;
                    if (z) {
                        editText4.setTransformationMethod(null);
                    } else {
                        editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        gk4Var.f.setSelection(selectionEnd);
                    }
                    gk4Var.p();
                    return;
                }
                return;
        }
    }
}

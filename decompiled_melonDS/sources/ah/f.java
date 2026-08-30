package ah;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ f(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        int i2 = this.A;
        Object obj = this.B;
        switch (i2) {
            case 0:
                int i10 = EmulatorActivity.f9503a1;
                ((EmulatorActivity) obj).B();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                List list = bi.e.f2279b0;
                ((h.c) obj).a(null);
                return;
            case 2:
                ((com.google.android.material.datepicker.o) obj).k();
                throw null;
            case 3:
                qa.c cVar = (qa.c) obj;
                EditText editText = cVar.f12418i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    cVar.p();
                    return;
                }
                return;
            case 4:
                ((qa.j) obj).t();
                return;
            case l1.c.f8511g /* 5 */:
                qa.t tVar = (qa.t) obj;
                EditText editText2 = tVar.f12500f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = tVar.f12500f;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    EditText editText4 = tVar.f12500f;
                    if (z10) {
                        editText4.setTransformationMethod(null);
                    } else {
                        editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        tVar.f12500f.setSelection(selectionEnd);
                    }
                    tVar.p();
                    return;
                }
                return;
            default:
                LayoutEditorView layoutEditorView = (LayoutEditorView) obj;
                if (layoutEditorView.f9533f0 != null) {
                    layoutEditorView.j();
                    return;
                }
                View.OnClickListener onClickListener = layoutEditorView.f9530c0;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}

package q;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ j0(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        Object item;
        CharSequence convertSelectionToString;
        int selectedItemPosition;
        switch (this.A) {
            case 0:
                l0 l0Var = (l0) this.B;
                p0 p0Var = l0Var.A0;
                p0Var.setSelection(i2);
                if (p0Var.getOnItemClickListener() != null) {
                    p0Var.performItemClick(view, i2, l0Var.f11949x0.getItemId(i2));
                }
                l0Var.dismiss();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((SearchView) this.B).n(i2);
                return;
            default:
                qa.s sVar = (qa.s) this.B;
                d2 d2Var = sVar.f12491b0;
                if (i2 < 0) {
                    if (!d2Var.f11882t0.isShowing()) {
                        item = null;
                    } else {
                        item = d2Var.L.getSelectedItem();
                    }
                } else {
                    item = sVar.getAdapter().getItem(i2);
                }
                convertSelectionToString = sVar.convertSelectionToString(item);
                sVar.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = sVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i2 < 0) {
                        if (!d2Var.f11882t0.isShowing()) {
                            view = null;
                        } else {
                            view = d2Var.L.getSelectedView();
                        }
                        if (!d2Var.f11882t0.isShowing()) {
                            selectedItemPosition = -1;
                        } else {
                            selectedItemPosition = d2Var.L.getSelectedItemPosition();
                        }
                        i2 = selectedItemPosition;
                        if (!d2Var.f11882t0.isShowing()) {
                            j2 = Long.MIN_VALUE;
                        } else {
                            j2 = d2Var.L.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(d2Var.L, view, i2, j2);
                }
                d2Var.dismiss();
                return;
        }
    }
}

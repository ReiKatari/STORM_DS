package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nr  reason: default package */
/* loaded from: classes.dex */
public final class nr implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ nr(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        CharSequence convertSelectionToString;
        int selectedItemPosition;
        int i2 = this.A;
        Object obj = this.B;
        switch (i2) {
            case 0:
                pr prVar = (pr) obj;
                sr srVar = prVar.B0;
                srVar.setSelection(i);
                if (srVar.getOnItemClickListener() != null) {
                    srVar.performItemClick(view, i, prVar.y0.getItemId(i));
                }
                prVar.dismiss();
                return;
            case 1:
                mu3 mu3Var = (mu3) obj;
                yp3 yp3Var = mu3Var.c0;
                if (i < 0) {
                    if (!yp3Var.u0.isShowing()) {
                        item = null;
                    } else {
                        item = yp3Var.L.getSelectedItem();
                    }
                } else {
                    item = mu3Var.getAdapter().getItem(i);
                }
                convertSelectionToString = mu3Var.convertSelectionToString(item);
                mu3Var.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = mu3Var.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        if (!yp3Var.u0.isShowing()) {
                            view = null;
                        } else {
                            view = yp3Var.L.getSelectedView();
                        }
                        if (!yp3Var.u0.isShowing()) {
                            selectedItemPosition = -1;
                        } else {
                            selectedItemPosition = yp3Var.L.getSelectedItemPosition();
                        }
                        i = selectedItemPosition;
                        if (!yp3Var.u0.isShowing()) {
                            j = Long.MIN_VALUE;
                        } else {
                            j = yp3Var.L.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(yp3Var.L, view, i, j);
                }
                yp3Var.dismiss();
                return;
            default:
                ((SearchView) obj).n(i);
                return;
        }
    }
}

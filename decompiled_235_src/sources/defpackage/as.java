package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: as  reason: default package */
/* loaded from: classes.dex */
public final class as implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ as(Object obj, int i) {
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
                cs csVar = (cs) obj;
                fs fsVar = csVar.C0;
                fsVar.setSelection(i);
                if (fsVar.getOnItemClickListener() != null) {
                    fsVar.performItemClick(view, i, csVar.z0.getItemId(i));
                }
                csVar.dismiss();
                return;
            case 1:
                p14 p14Var = (p14) obj;
                ax3 ax3Var = p14Var.d0;
                if (i < 0) {
                    if (!ax3Var.v0.isShowing()) {
                        item = null;
                    } else {
                        item = ax3Var.L.getSelectedItem();
                    }
                } else {
                    item = p14Var.getAdapter().getItem(i);
                }
                convertSelectionToString = p14Var.convertSelectionToString(item);
                p14Var.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = p14Var.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        if (!ax3Var.v0.isShowing()) {
                            view = null;
                        } else {
                            view = ax3Var.L.getSelectedView();
                        }
                        if (!ax3Var.v0.isShowing()) {
                            selectedItemPosition = -1;
                        } else {
                            selectedItemPosition = ax3Var.L.getSelectedItemPosition();
                        }
                        i = selectedItemPosition;
                        if (!ax3Var.v0.isShowing()) {
                            j = Long.MIN_VALUE;
                        } else {
                            j = ax3Var.L.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(ax3Var.L, view, i, j);
                }
                ax3Var.dismiss();
                return;
            default:
                ((SearchView) obj).n(i);
                return;
        }
    }
}

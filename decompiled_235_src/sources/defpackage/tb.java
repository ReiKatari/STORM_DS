package defpackage;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tb  reason: default package */
/* loaded from: classes.dex */
public final class tb extends ArrayAdapter {
    public final /* synthetic */ AlertController$RecycleListView A;
    public final /* synthetic */ wb B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(wb wbVar, ContextThemeWrapper contextThemeWrapper, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(contextThemeWrapper, i, 16908308, charSequenceArr);
        this.B = wbVar;
        this.A = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.B.v;
        if (zArr != null && zArr[i]) {
            this.A.setItemChecked(i, true);
        }
        return view2;
    }
}

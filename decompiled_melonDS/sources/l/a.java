package l;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends ArrayAdapter {
    public final /* synthetic */ AlertController$RecycleListView A;
    public final /* synthetic */ d B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, ContextThemeWrapper contextThemeWrapper, int i2, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(contextThemeWrapper, i2, 16908308, charSequenceArr);
        this.B = dVar;
        this.A = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i2, view, viewGroup);
        boolean[] zArr = this.B.f8376v;
        if (zArr != null && zArr[i2]) {
            this.A.setItemChecked(i2, true);
        }
        return view2;
    }
}

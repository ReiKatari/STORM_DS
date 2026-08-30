package l;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController$RecycleListView A;
    public final /* synthetic */ f B;
    public final /* synthetic */ d L;

    public c(d dVar, AlertController$RecycleListView alertController$RecycleListView, f fVar) {
        this.L = dVar;
        this.A = alertController$RecycleListView;
        this.B = fVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        d dVar = this.L;
        boolean[] zArr = dVar.f8376v;
        AlertController$RecycleListView alertController$RecycleListView = this.A;
        if (zArr != null) {
            zArr[i2] = alertController$RecycleListView.isItemChecked(i2);
        }
        dVar.f8380z.onClick(this.B.f8389b, i2, alertController$RecycleListView.isItemChecked(i2));
    }
}

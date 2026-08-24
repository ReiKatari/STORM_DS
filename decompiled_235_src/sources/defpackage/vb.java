package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vb  reason: default package */
/* loaded from: classes.dex */
public final class vb implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController$RecycleListView A;
    public final /* synthetic */ yb B;
    public final /* synthetic */ wb L;

    public vb(wb wbVar, AlertController$RecycleListView alertController$RecycleListView, yb ybVar) {
        this.L = wbVar;
        this.A = alertController$RecycleListView;
        this.B = ybVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        wb wbVar = this.L;
        boolean[] zArr = wbVar.v;
        AlertController$RecycleListView alertController$RecycleListView = this.A;
        if (zArr != null) {
            zArr[i] = alertController$RecycleListView.isItemChecked(i);
        }
        wbVar.z.onClick(this.B.b, i, alertController$RecycleListView.isItemChecked(i));
    }
}

package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ob  reason: default package */
/* loaded from: classes.dex */
public final class ob implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController$RecycleListView A;
    public final /* synthetic */ rb B;
    public final /* synthetic */ pb L;

    public ob(pb pbVar, AlertController$RecycleListView alertController$RecycleListView, rb rbVar) {
        this.L = pbVar;
        this.A = alertController$RecycleListView;
        this.B = rbVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        pb pbVar = this.L;
        boolean[] zArr = pbVar.v;
        AlertController$RecycleListView alertController$RecycleListView = this.A;
        if (zArr != null) {
            zArr[i] = alertController$RecycleListView.isItemChecked(i);
        }
        pbVar.z.onClick(this.B.b, i, alertController$RecycleListView.isItemChecked(i));
    }
}

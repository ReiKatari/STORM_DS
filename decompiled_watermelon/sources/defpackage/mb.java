package defpackage;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mb  reason: default package */
/* loaded from: classes.dex */
public final class mb extends ArrayAdapter {
    public final /* synthetic */ AlertController$RecycleListView A;
    public final /* synthetic */ pb B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(pb pbVar, ContextThemeWrapper contextThemeWrapper, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(contextThemeWrapper, i, 16908308, charSequenceArr);
        this.B = pbVar;
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

package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nb  reason: default package */
/* loaded from: classes.dex */
public final class nb implements AdapterView.OnItemClickListener {
    public final /* synthetic */ rb A;
    public final /* synthetic */ pb B;

    public nb(pb pbVar, rb rbVar) {
        this.B = pbVar;
        this.A = rbVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        pb pbVar = this.B;
        DialogInterface.OnClickListener onClickListener = pbVar.s;
        rb rbVar = this.A;
        onClickListener.onClick(rbVar.b, i);
        if (!pbVar.x) {
            rbVar.b.dismiss();
        }
    }
}

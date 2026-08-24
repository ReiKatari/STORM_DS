package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ub  reason: default package */
/* loaded from: classes.dex */
public final class ub implements AdapterView.OnItemClickListener {
    public final /* synthetic */ yb A;
    public final /* synthetic */ wb B;

    public ub(wb wbVar, yb ybVar) {
        this.B = wbVar;
        this.A = ybVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        wb wbVar = this.B;
        DialogInterface.OnClickListener onClickListener = wbVar.s;
        yb ybVar = this.A;
        onClickListener.onClick(ybVar.b, i);
        if (!wbVar.x) {
            ybVar.b.dismiss();
        }
    }
}

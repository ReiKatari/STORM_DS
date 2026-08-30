package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements AdapterView.OnItemClickListener {
    public final /* synthetic */ f A;
    public final /* synthetic */ d B;

    public b(d dVar, f fVar) {
        this.B = dVar;
        this.A = fVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        d dVar = this.B;
        DialogInterface.OnClickListener onClickListener = dVar.f8373s;
        f fVar = this.A;
        onClickListener.onClick(fVar.f8389b, i2);
        if (!dVar.f8378x) {
            fVar.f8389b.dismiss();
        }
    }
}

package g6;

import android.database.DataSetObserver;
import q.d2;
import q.z2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5599a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5600b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f5599a = i2;
        this.f5600b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f5599a) {
            case 0:
                z2 z2Var = (z2) this.f5600b;
                z2Var.A = true;
                z2Var.notifyDataSetChanged();
                return;
            default:
                d2 d2Var = (d2) this.f5600b;
                if (d2Var.f11882t0.isShowing()) {
                    d2Var.c();
                    return;
                }
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f5599a) {
            case 0:
                z2 z2Var = (z2) this.f5600b;
                z2Var.A = false;
                z2Var.notifyDataSetInvalidated();
                return;
            default:
                ((d2) this.f5600b).dismiss();
                return;
        }
    }
}

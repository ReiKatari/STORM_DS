package defpackage;

import android.database.DataSetObserver;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y71  reason: default package */
/* loaded from: classes.dex */
public final class y71 extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y71(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                du6 du6Var = (du6) obj;
                du6Var.A = true;
                du6Var.notifyDataSetChanged();
                return;
            default:
                ax3 ax3Var = (ax3) obj;
                if (ax3Var.v0.isShowing()) {
                    ax3Var.e();
                    return;
                }
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                du6 du6Var = (du6) obj;
                du6Var.A = false;
                du6Var.notifyDataSetInvalidated();
                return;
            default:
                ((ax3) obj).dismiss();
                return;
        }
    }
}

package defpackage;

import android.database.DataSetObserver;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o41  reason: default package */
/* loaded from: classes.dex */
public final class o41 extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o41(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ji6 ji6Var = (ji6) obj;
                ji6Var.A = true;
                ji6Var.notifyDataSetChanged();
                return;
            default:
                yp3 yp3Var = (yp3) obj;
                if (yp3Var.u0.isShowing()) {
                    yp3Var.c();
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
                ji6 ji6Var = (ji6) obj;
                ji6Var.A = false;
                ji6Var.notifyDataSetInvalidated();
                return;
            default:
                ((yp3) obj).dismiss();
                return;
        }
    }
}

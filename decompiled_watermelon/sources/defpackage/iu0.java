package defpackage;

import android.os.CancellationSignal;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iu0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class iu0 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iu0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((kd6) obj).i(null);
                return;
            default:
                bq6 bq6Var = (bq6) obj;
                if (bq6Var != null) {
                    hm3 hm3Var = bq6Var.d;
                    if (hm3Var != null) {
                        hm3Var.e(vr6.b);
                    }
                    hm3 hm3Var2 = bq6Var.d;
                    if (hm3Var2 != null) {
                        hm3Var2.f(vr6.b);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

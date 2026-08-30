package defpackage;

import android.content.Context;
import defpackage.hv1;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: su1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class su1 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ hv1 B;

    public /* synthetic */ su1(hv1 hv1Var, int i) {
        this.A = i;
        this.B = hv1Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        Object kc5Var;
        int i = this.A;
        o27 o27Var = o27.a;
        Object obj = null;
        hv1 hv1Var = this.B;
        switch (i) {
            case 0:
                Context context = hv1Var.b;
                try {
                    kc5Var = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (Throwable th) {
                    kc5Var = new kc5(th);
                }
                if (!(kc5Var instanceof kc5)) {
                    obj = kc5Var;
                }
                String str = (String) obj;
                if (str == null) {
                    str = "";
                }
                if (zg6.B0(str)) {
                    return "unknown";
                }
                return str;
            case 1:
                hv1Var.T0.p(yt1.a);
                return o27Var;
            case 2:
                hv1Var.N = null;
                hv1Var.O = hv1.c.DISABLED;
                hv1Var.K = false;
                return o27Var;
            case 3:
                hv1Var.N = null;
                hv1Var.O = hv1.c.DISABLED;
                hv1Var.K = false;
                return o27Var;
            default:
                hv1Var.N = null;
                hv1Var.O = hv1.c.DISABLED;
                hv1Var.K = false;
                return o27Var;
        }
    }
}

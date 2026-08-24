package defpackage;

import android.content.Context;
import defpackage.sz1;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dz1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dz1 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ sz1 B;

    public /* synthetic */ dz1(sz1 sz1Var, int i) {
        this.A = i;
        this.B = sz1Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        Object em5Var;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj = null;
        sz1 sz1Var = this.B;
        switch (i) {
            case 0:
                Context context = sz1Var.b;
                try {
                    em5Var = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (Throwable th) {
                    em5Var = new em5(th);
                }
                if (!(em5Var instanceof em5)) {
                    obj = em5Var;
                }
                String str = (String) obj;
                if (str == null) {
                    str = "";
                }
                if (qs6.v0(str)) {
                    return "unknown";
                }
                return str;
            case 1:
                sz1Var.T0.k(jy1.a);
                return jg7Var;
            case 2:
                sz1Var.N = null;
                sz1Var.O = sz1.c.DISABLED;
                sz1Var.K = false;
                return jg7Var;
            case 3:
                sz1Var.N = null;
                sz1Var.O = sz1.c.DISABLED;
                sz1Var.K = false;
                return jg7Var;
            default:
                sz1Var.N = null;
                sz1Var.O = sz1.c.DISABLED;
                sz1Var.K = false;
                return jg7Var;
        }
    }
}

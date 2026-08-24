package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dv0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dv0 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ mv0 B;

    public /* synthetic */ dv0(mv0 mv0Var, int i) {
        this.A = i;
        this.B = mv0Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ld4] */
    @Override // defpackage.on2
    public final Object c() {
        Bundle bundle;
        int i = this.A;
        mv0 mv0Var = this.B;
        switch (i) {
            case 0:
                mv0Var.reportFullyDrawn();
                return jg7.a;
            case 1:
                return new nn2(mv0Var.Y, new dv0(mv0Var, 0));
            case 2:
                ?? obj = new Object();
                mv0Var.a().f(obj);
                return obj;
            case 3:
                Application application = mv0Var.getApplication();
                if (mv0Var.getIntent() != null) {
                    bundle = mv0Var.getIntent().getExtras();
                } else {
                    bundle = null;
                }
                return new h56(application, mv0Var, bundle);
            default:
                il4 il4Var = new il4(new cv0(mv0Var, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!nb3.k(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new mf(12, mv0Var, il4Var));
                    } else {
                        mv0Var.A.a(new ev0(il4Var, mv0Var));
                    }
                }
                return il4Var;
        }
    }
}

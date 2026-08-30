package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.p;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ps0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ps0 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ p B;

    public /* synthetic */ ps0(p pVar, int i) {
        this.A = i;
        this.B = pVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [f54, java.lang.Object] */
    @Override // defpackage.ki2
    public final Object c() {
        Bundle bundle;
        int i = this.A;
        p pVar = this.B;
        switch (i) {
            case 0:
                pVar.reportFullyDrawn();
                return o27.a;
            case 1:
                return new ji2(pVar.Y, new ps0(pVar, 0));
            case 2:
                ?? obj = new Object();
                pVar.a().f(obj);
                return obj;
            case 3:
                Application application = pVar.getApplication();
                if (pVar.getIntent() != null) {
                    bundle = pVar.getIntent().getExtras();
                } else {
                    bundle = null;
                }
                return new bu5(application, pVar, bundle);
            default:
                kc4 kc4Var = new kc4(new os0(pVar, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!b53.x(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new we(12, pVar, kc4Var));
                    } else {
                        pVar.A.a(new qs0(kc4Var, pVar));
                    }
                }
                return kc4Var;
        }
    }
}

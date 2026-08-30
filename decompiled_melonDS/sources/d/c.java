package d;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.o0;
import androidx.lifecycle.v0;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ o0 B;

    public /* synthetic */ c(o0 o0Var, int i2) {
        this.A = i2;
        this.B = o0Var;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [f7.f, java.lang.Object] */
    @Override // mc.a
    public final Object b() {
        Bundle bundle;
        switch (this.A) {
            case 0:
                this.B.reportFullyDrawn();
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                o0 o0Var = this.B;
                return new u(o0Var.Y, new c(o0Var, 0));
            case 2:
                ?? obj = new Object();
                this.B.b().d(obj);
                return obj;
            case 3:
                o0 o0Var2 = this.B;
                Application application = o0Var2.getApplication();
                if (o0Var2.getIntent() != null) {
                    bundle = o0Var2.getIntent().getExtras();
                } else {
                    bundle = null;
                }
                return new v0(application, o0Var2, bundle);
            default:
                o0 o0Var3 = this.B;
                a0 a0Var = new a0(new b(o0Var3, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!nc.k.a(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new ad.c(1, o0Var3, a0Var));
                    } else {
                        o0Var3.A.a(new d(a0Var, o0Var3));
                    }
                }
                return a0Var;
        }
    }
}

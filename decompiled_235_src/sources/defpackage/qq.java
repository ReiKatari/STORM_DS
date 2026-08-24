package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qq implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Context B;

    public /* synthetic */ qq(Context context, int i) {
        this.A = i;
        this.B = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
        if (r2 != null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        hy3 hy3Var;
        int i = this.A;
        Context context = this.B;
        switch (i) {
            case 0:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i2 >= 33) {
                            Object b = tq.b();
                            if (b != null) {
                                hy3Var = new hy3(new iy3(sq.a(b)));
                                if (hy3Var.a.a.isEmpty()) {
                                    String G = lb4.G(context);
                                    Object systemService = context.getSystemService("locale");
                                    if (systemService != null) {
                                        sq.b(systemService, rq.a(G));
                                    }
                                }
                                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            hy3Var = hy3.b;
                            if (hy3Var.a.a.isEmpty()) {
                            }
                            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        } else {
                            hy3Var = tq.L;
                            break;
                        }
                    }
                }
                tq.Y = true;
                return;
            case 1:
                tq.p(context);
                return;
            case 2:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new qq(context, 3));
                return;
            default:
                u35.b(context, new yt(1), u35.a, false);
                return;
        }
    }
}

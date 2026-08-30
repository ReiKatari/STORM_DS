package b4;

import android.os.Build;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int A;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                a1.h0 h0Var = x.G1;
                synchronized (h0Var) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        Object[] objArr = h0Var.f44a;
                        int i10 = h0Var.f45b;
                        int i11 = 0;
                        if (i2 < 30) {
                            while (i11 < i10) {
                                x xVar = (x) objArr[i11];
                                boolean showLayoutBounds = xVar.getShowLayoutBounds();
                                Class cls = x.D1;
                                xVar.setShowLayoutBounds(l0.k());
                                if (showLayoutBounds != xVar.getShowLayoutBounds()) {
                                    x.k(xVar.getRoot());
                                }
                                i11++;
                            }
                        } else {
                            while (i11 < i10) {
                                x.k(((x) objArr[i11]).getRoot());
                                i11++;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
            default:
                return;
        }
    }

    public /* synthetic */ l(int i2) {
        this.A = i2;
    }

    private final void a() {
    }

    private final void b() {
    }
}

package defpackage;

import android.os.Build;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rd implements Runnable {
    public final /* synthetic */ int A;

    public /* synthetic */ rd(we0 we0Var, Set set) {
        this.A = 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                w14 w14Var = ee.K1;
                synchronized (w14Var) {
                    try {
                        int i = Build.VERSION.SDK_INT;
                        Object[] objArr = w14Var.a;
                        int i2 = w14Var.b;
                        int i3 = 0;
                        if (i < 30) {
                            while (i3 < i2) {
                                ee eeVar = (ee) objArr[i3];
                                boolean showLayoutBounds = eeVar.getShowLayoutBounds();
                                Class cls = ee.H1;
                                eeVar.setShowLayoutBounds(n40.J());
                                if (showLayoutBounds != eeVar.getShowLayoutBounds()) {
                                    eeVar.post(new pd(eeVar, 2));
                                }
                                i3++;
                            }
                        } else {
                            while (i3 < i2) {
                                ee eeVar2 = (ee) objArr[i3];
                                eeVar2.post(new pd(eeVar2, 3));
                                i3++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
            case 2:
            case 3:
            default:
                return;
        }
    }

    public /* synthetic */ rd(int i) {
        this.A = i;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}

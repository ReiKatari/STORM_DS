package defpackage;

import android.os.Build;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ge  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ge implements Runnable {
    public final /* synthetic */ int A;

    public /* synthetic */ ge(fh0 fh0Var, Set set) {
        this.A = 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                ca4 ca4Var = te.L1;
                synchronized (ca4Var) {
                    try {
                        int i = Build.VERSION.SDK_INT;
                        Object[] objArr = ca4Var.a;
                        int i2 = ca4Var.b;
                        int i3 = 0;
                        if (i < 30) {
                            while (i3 < i2) {
                                te teVar = (te) objArr[i3];
                                boolean showLayoutBounds = teVar.getShowLayoutBounds();
                                Class cls = te.I1;
                                teVar.setShowLayoutBounds(g04.F());
                                if (showLayoutBounds != teVar.getShowLayoutBounds()) {
                                    teVar.post(new ee(teVar, 2));
                                }
                                i3++;
                            }
                        } else {
                            while (i3 < i2) {
                                te teVar2 = (te) objArr[i3];
                                teVar2.post(new ee(teVar2, 3));
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

    public /* synthetic */ ge(int i) {
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

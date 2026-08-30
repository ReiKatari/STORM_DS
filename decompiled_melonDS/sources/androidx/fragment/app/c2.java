package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c2 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ q B;
    public final /* synthetic */ e2 L;

    public /* synthetic */ c2(q qVar, e2 e2Var, int i2) {
        this.A = i2;
        this.B = qVar;
        this.L = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                q qVar = this.B;
                ArrayList arrayList = qVar.f1396b;
                e2 e2Var = this.L;
                if (arrayList.contains(e2Var)) {
                    i2 i2Var = e2Var.f1271a;
                    View view = e2Var.f1273c.mView;
                    view.getClass();
                    i2Var.applyState(view, qVar.f1395a);
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.a(this.L);
                return;
            default:
                q qVar2 = this.B;
                ArrayList arrayList2 = qVar2.f1396b;
                e2 e2Var2 = this.L;
                arrayList2.remove(e2Var2);
                qVar2.f1397c.remove(e2Var2);
                return;
        }
    }
}

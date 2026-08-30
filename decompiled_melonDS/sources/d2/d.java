package d2;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import j0.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.IntConsumer;
import me.magnum.melonds.common.camera.DSiCameraSource;
import w.g1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    public /* synthetic */ d(int i2, int i10, Object obj) {
        this.A = i10;
        this.L = obj;
        this.B = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                ((IntConsumer) this.L).accept(this.B);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((lf.d) this.L).a(this.B);
                return;
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.L;
                int i2 = this.B;
                View view = (View) sideSheetBehavior.f3093p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, i2, false);
                    return;
                }
                return;
            case 3:
                ((p5.b) this.L).i(this.B);
                return;
            case 4:
                ((j0.m) this.L).a(this.B);
                return;
            default:
                int i10 = this.B;
                Iterator it = ((LinkedHashSet) this.L).iterator();
                while (it.hasNext()) {
                    g1 g1Var = (g1) it.next();
                    if (i10 == 5) {
                        synchronized (g1Var.f13940p) {
                            try {
                                if (g1Var.l() && g1Var.f13941q != null) {
                                    g1Var.k("Close DeferrableSurfaces for CameraDevice error.");
                                    ArrayList arrayList = g1Var.f13941q;
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        ((u0) obj).a();
                                    }
                                }
                            } finally {
                            }
                        }
                    } else {
                        g1Var.getClass();
                    }
                }
                return;
        }
    }
}

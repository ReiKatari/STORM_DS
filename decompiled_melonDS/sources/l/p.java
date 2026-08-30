package l;

import a6.n0;
import a6.x0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends pc.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f8441d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f8442e;

    public /* synthetic */ p(int i2, Object obj) {
        this.f8441d = i2;
        this.f8442e = obj;
    }

    @Override // a6.g1
    public final void a() {
        int i2 = this.f8441d;
        Object obj = this.f8442e;
        switch (i2) {
            case 0:
                x xVar = ((n) obj).B;
                xVar.p0.setAlpha(1.0f);
                xVar.f8480s0.d(null);
                xVar.f8480s0 = null;
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                x xVar2 = (x) obj;
                xVar2.p0.setAlpha(1.0f);
                xVar2.f8480s0.d(null);
                xVar2.f8480s0 = null;
                return;
            default:
                x xVar3 = (x) ((jb.c) obj).L;
                xVar3.p0.setVisibility(8);
                PopupWindow popupWindow = xVar3.f8478q0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (xVar3.p0.getParent() instanceof View) {
                    WeakHashMap weakHashMap = x0.f533a;
                    n0.c((View) xVar3.p0.getParent());
                }
                xVar3.p0.e();
                xVar3.f8480s0.d(null);
                xVar3.f8480s0 = null;
                ViewGroup viewGroup = xVar3.f8482u0;
                WeakHashMap weakHashMap2 = x0.f533a;
                n0.c(viewGroup);
                return;
        }
    }

    @Override // pc.a, a6.g1
    public void c() {
        int i2 = this.f8441d;
        Object obj = this.f8442e;
        switch (i2) {
            case 0:
                ((n) obj).B.p0.setVisibility(0);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                x xVar = (x) obj;
                xVar.p0.setVisibility(0);
                if (xVar.p0.getParent() instanceof View) {
                    WeakHashMap weakHashMap = x0.f533a;
                    n0.c((View) xVar.p0.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }
}

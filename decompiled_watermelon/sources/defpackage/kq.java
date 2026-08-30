package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kq  reason: default package */
/* loaded from: classes.dex */
public final class kq extends gk2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kq(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.jb7
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                tq tqVar = ((iq) obj).B;
                tqVar.p0.setAlpha(1.0f);
                tqVar.s0.d(null);
                tqVar.s0 = null;
                return;
            case 1:
                tq tqVar2 = (tq) obj;
                tqVar2.p0.setAlpha(1.0f);
                tqVar2.s0.d(null);
                tqVar2.s0 = null;
                return;
            default:
                tq tqVar3 = (tq) ((q03) obj).L;
                tqVar3.p0.setVisibility(8);
                PopupWindow popupWindow = tqVar3.q0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (tqVar3.p0.getParent() instanceof View) {
                    WeakHashMap weakHashMap = aa7.a;
                    ((View) tqVar3.p0.getParent()).requestApplyInsets();
                }
                tqVar3.p0.e();
                tqVar3.s0.d(null);
                tqVar3.s0 = null;
                ViewGroup viewGroup = tqVar3.u0;
                WeakHashMap weakHashMap2 = aa7.a;
                viewGroup.requestApplyInsets();
                return;
        }
    }

    @Override // defpackage.gk2, defpackage.jb7
    public void c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((iq) obj).B.p0.setVisibility(0);
                return;
            case 1:
                tq tqVar = (tq) obj;
                tqVar.p0.setVisibility(0);
                if (tqVar.p0.getParent() instanceof View) {
                    WeakHashMap weakHashMap = aa7.a;
                    ((View) tqVar.p0.getParent()).requestApplyInsets();
                    return;
                }
                return;
            default:
                return;
        }
    }
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wq  reason: default package */
/* loaded from: classes.dex */
public final class wq extends uj2 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ wq(Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    @Override // defpackage.uj2, defpackage.kp7
    public void b() {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                ((uq) obj).B.q0.setVisibility(0);
                return;
            case 1:
                fr frVar = (fr) obj;
                frVar.q0.setVisibility(0);
                if (frVar.q0.getParent() instanceof View) {
                    WeakHashMap weakHashMap = ao7.a;
                    ((View) frVar.q0.getParent()).requestApplyInsets();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.kp7
    public final void c() {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                fr frVar = ((uq) obj).B;
                frVar.q0.setAlpha(1.0f);
                frVar.t0.d(null);
                frVar.t0 = null;
                return;
            case 1:
                fr frVar2 = (fr) obj;
                frVar2.q0.setAlpha(1.0f);
                frVar2.t0.d(null);
                frVar2.t0 = null;
                return;
            default:
                fr frVar3 = (fr) ((u63) obj).L;
                frVar3.q0.setVisibility(8);
                PopupWindow popupWindow = frVar3.r0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (frVar3.q0.getParent() instanceof View) {
                    WeakHashMap weakHashMap = ao7.a;
                    ((View) frVar3.q0.getParent()).requestApplyInsets();
                }
                frVar3.q0.e();
                frVar3.t0.d(null);
                frVar3.t0 = null;
                ViewGroup viewGroup = frVar3.v0;
                WeakHashMap weakHashMap2 = ao7.a;
                viewGroup.requestApplyInsets();
                return;
        }
    }
}

package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sp1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sp1 implements View.OnTouchListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ sp1(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                vp1 vp1Var = (vp1) obj;
                if (motionEvent.getAction() == 1) {
                    long uptimeMillis = SystemClock.uptimeMillis() - vp1Var.o;
                    if (uptimeMillis < 0 || uptimeMillis > 300) {
                        vp1Var.m = false;
                    }
                    vp1Var.t();
                    vp1Var.m = true;
                    vp1Var.o = SystemClock.uptimeMillis();
                }
                return false;
            default:
                b bVar = (b) obj;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 3) {
                            bVar.v0 = null;
                        }
                    } else {
                        view.post(new cl3(bVar, 3));
                    }
                } else {
                    bVar.v0 = ((LayoutEditorView) bVar.L.A).getSelectedComponent();
                }
                return false;
        }
    }
}

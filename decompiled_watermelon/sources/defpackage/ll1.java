package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ll1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ll1 implements View.OnTouchListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ ll1(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                ol1 ol1Var = (ol1) obj;
                if (motionEvent.getAction() == 1) {
                    long uptimeMillis = SystemClock.uptimeMillis() - ol1Var.o;
                    if (uptimeMillis < 0 || uptimeMillis > 300) {
                        ol1Var.m = false;
                    }
                    ol1Var.t();
                    ol1Var.m = true;
                    ol1Var.o = SystemClock.uptimeMillis();
                }
                return false;
            default:
                b bVar = (b) obj;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 3) {
                            bVar.u0 = null;
                        }
                    } else {
                        view.post(new ie3(bVar, 5));
                    }
                } else {
                    bVar.u0 = bVar.L.v.getSelectedComponent();
                }
                return false;
        }
    }
}

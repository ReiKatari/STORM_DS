package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ql  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ql implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ vl B;

    public /* synthetic */ ql(vl vlVar, int i) {
        this.A = i;
        this.B = vlVar;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        Looper looper;
        int i = this.A;
        o27 o27Var = o27.a;
        vl vlVar = this.B;
        switch (i) {
            case 0:
                ki2 ki2Var = (ki2) obj;
                View view = vlVar.a;
                Handler handler = view.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    ki2Var.c();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new qd(2, ki2Var));
                    }
                }
                return o27Var;
            case 1:
                ActionMode actionMode = vlVar.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return o27Var;
            case 2:
                ActionMode actionMode2 = vlVar.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return o27Var;
            default:
                ch1 ch1Var = (ch1) obj;
                vlVar.e.e();
                return new y3(4, vlVar);
        }
    }
}

package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cm implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ hm B;

    public /* synthetic */ cm(hm hmVar, int i) {
        this.A = i;
        this.B = hmVar;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        Looper looper;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        hm hmVar = this.B;
        switch (i) {
            case 0:
                on2 on2Var = (on2) obj;
                View view = hmVar.a;
                Handler handler = view.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    on2Var.c();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new fe(2, on2Var));
                    }
                }
                return jg7Var;
            case 1:
                ActionMode actionMode = hmVar.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return jg7Var;
            case 2:
                ActionMode actionMode2 = hmVar.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return jg7Var;
            default:
                gl1 gl1Var = (gl1) obj;
                hmVar.e.e();
                return new z3(hmVar, 4);
        }
    }
}

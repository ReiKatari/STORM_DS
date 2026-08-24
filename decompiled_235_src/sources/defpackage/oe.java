package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oe  reason: default package */
/* loaded from: classes.dex */
public final class oe extends aj3 implements qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ te L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oe(te teVar, int i) {
        super(1);
        this.B = i;
        this.L = teVar;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        Looper looper;
        int i = this.B;
        jg7 jg7Var = jg7.a;
        te teVar = this.L;
        switch (i) {
            case 0:
                ((eh2) teVar.getFocusOwner()).g(((qg2) obj).a, false);
                return jg7Var;
            case 1:
                on2 on2Var = (on2) obj;
                teVar.getUncaughtExceptionHandler$ui();
                Handler handler = teVar.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    on2Var.c();
                } else {
                    Handler handler2 = teVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new fe(1, on2Var));
                    }
                }
                return jg7Var;
            default:
                return new rj(teVar, teVar.getTextInputService(), (w61) obj);
        }
    }
}

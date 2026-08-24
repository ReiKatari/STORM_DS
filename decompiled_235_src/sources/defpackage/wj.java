package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wj  reason: default package */
/* loaded from: classes.dex */
public final class wj extends aj3 implements qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ c05 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wj(c05 c05Var, int i) {
        super(1);
        this.B = i;
        this.L = c05Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        Looper looper;
        int i = this.B;
        jg7 jg7Var = jg7.a;
        c05 c05Var = this.L;
        switch (i) {
            case 0:
                jk3 D = ((jk3) obj).D();
                D.getClass();
                c05Var.p(D);
                return jg7Var;
            case 1:
                c05Var.m1setPopupContentSizefhxjrPA(new q93(((q93) obj).a));
                c05Var.q();
                return jg7Var;
            default:
                on2 on2Var = (on2) obj;
                Handler handler = c05Var.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    on2Var.c();
                } else {
                    Handler handler2 = c05Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new fe(5, on2Var));
                    }
                }
                return jg7Var;
        }
    }
}

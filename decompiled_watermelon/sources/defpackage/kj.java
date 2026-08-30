package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kj  reason: default package */
/* loaded from: classes.dex */
public final class kj extends ic3 implements mi2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ yq4 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj(yq4 yq4Var, int i) {
        super(1);
        this.B = i;
        this.L = yq4Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        Looper looper;
        int i = this.B;
        o27 o27Var = o27.a;
        yq4 yq4Var = this.L;
        switch (i) {
            case 0:
                rd3 m = ((rd3) obj).m();
                m.getClass();
                yq4Var.p(m);
                return o27Var;
            case 1:
                yq4Var.m17setPopupContentSizefhxjrPA(new i33(((i33) obj).a));
                yq4Var.q();
                return o27Var;
            default:
                ki2 ki2Var = (ki2) obj;
                Handler handler = yq4Var.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    ki2Var.c();
                } else {
                    Handler handler2 = yq4Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new qd(5, ki2Var));
                    }
                }
                return o27Var;
        }
    }
}

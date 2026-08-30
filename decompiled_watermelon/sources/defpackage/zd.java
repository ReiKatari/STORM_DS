package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zd  reason: default package */
/* loaded from: classes.dex */
public final class zd extends ic3 implements mi2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ ee L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zd(ee eeVar, int i) {
        super(1);
        this.B = i;
        this.L = eeVar;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        Looper looper;
        int i = this.B;
        o27 o27Var = o27.a;
        ee eeVar = this.L;
        switch (i) {
            case 0:
                ((nc2) eeVar.getFocusOwner()).g(((zb2) obj).a, false);
                return o27Var;
            case 1:
                ki2 ki2Var = (ki2) obj;
                eeVar.getUncaughtExceptionHandler$ui();
                Handler handler = eeVar.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    ki2Var.c();
                } else {
                    Handler handler2 = eeVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new qd(1, ki2Var));
                    }
                }
                return o27Var;
            default:
                return new fj(eeVar, eeVar.getTextInputService(), (o31) obj);
        }
    }
}

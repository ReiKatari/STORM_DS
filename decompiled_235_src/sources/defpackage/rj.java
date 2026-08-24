package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rj  reason: default package */
/* loaded from: classes.dex */
public final class rj implements w61 {
    public final View A;
    public final o37 B;
    public final w61 L;
    public final AtomicReference R = new AtomicReference(null);

    public rj(View view, o37 o37Var, w61 w61Var) {
        this.A = view;
        this.B = o37Var;
        this.L = w61Var;
    }

    @Override // defpackage.w61
    public final l61 A() {
        return this.L.A();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x61 a(kt3 kt3Var, s41 s41Var) {
        oj ojVar;
        int i;
        if (s41Var instanceof oj) {
            ojVar = (oj) s41Var;
            int i2 = ojVar.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ojVar.Y = i2 - Integer.MIN_VALUE;
                Object obj = ojVar.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ojVar.Y;
                if (i == 0) {
                    if (i != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    qj qjVar = new qj(0, kt3Var, this);
                    z zVar = new z(this, (r41) null, 4);
                    ojVar.Y = 1;
                    if (g04.C(new kp5(qjVar, this.R, zVar, null, 5), ojVar) == x61Var) {
                        return x61Var;
                    }
                }
                e41.c();
                return null;
            }
        }
        ojVar = new oj(this, s41Var);
        Object obj2 = ojVar.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ojVar.Y;
        if (i == 0) {
        }
        e41.c();
        return null;
    }
}

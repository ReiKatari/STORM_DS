package defpackage;

import android.util.Log;
import java.util.LinkedList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wq6  reason: default package */
/* loaded from: classes.dex */
public final class wq6 implements gi7 {
    public final od2 a;
    public final kj7 b;
    public final hb4 c;
    public li7 d;
    public final LinkedList e;

    public wq6(od2 od2Var, kj7 kj7Var) {
        od2Var.getClass();
        kj7Var.getClass();
        this.a = od2Var;
        this.b = kj7Var;
        this.c = new hb4();
        this.e = new LinkedList();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(wq6 wq6Var, uq6 uq6Var, li7 li7Var, s41 s41Var) {
        vq6 vq6Var;
        int i;
        wq6Var.getClass();
        if (s41Var instanceof vq6) {
            vq6Var = (vq6) s41Var;
            int i2 = vq6Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vq6Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = vq6Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = vq6Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "StillCaptureRequestControl: submitting " + uq6Var + " at " + li7Var);
                    }
                    od2 od2Var = wq6Var.a;
                    vq6Var.Y = 1;
                    obj = od2Var.a(vq6Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                ((Number) obj).intValue();
                if (kj2.F("CXCP")) {
                    Log.d("CXCP", "StillCaptureRequestControl: Issuing single capture");
                }
                throw null;
            }
        }
        vq6Var = new vq6(wq6Var, s41Var);
        Object obj2 = vq6Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = vq6Var.Y;
        if (i == 0) {
        }
        ((Number) obj2).intValue();
        if (kj2.F("CXCP")) {
        }
        throw null;
    }

    @Override // defpackage.gi7
    public final void b(li7 li7Var) {
        this.d = li7Var;
        hv.L(this.b.f, null, null, new hn(this, null), 3);
    }

    @Override // defpackage.gi7
    public final void reset() {
        hv.L(this.b.f, null, null, new vy5(this, null, 10), 3);
    }
}

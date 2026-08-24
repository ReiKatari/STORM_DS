package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: od2  reason: default package */
/* loaded from: classes.dex */
public final class od2 implements gi7 {
    public final op6 a;
    public li7 b;
    public volatile int c;
    public tu0 d;

    public od2(sg0 sg0Var, op6 op6Var, kj7 kj7Var, r87 r87Var, d90 d90Var) {
        sg0Var.getClass();
        op6Var.getClass();
        kj7Var.getClass();
        r87Var.getClass();
        this.a = op6Var;
        this.c = 2;
        u24.b(jg7.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(s41 s41Var) {
        nd2 nd2Var;
        int i;
        int i2;
        if (s41Var instanceof nd2) {
            nd2Var = (nd2) s41Var;
            int i3 = nd2Var.Z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nd2Var.Z = i3 - Integer.MIN_VALUE;
                Object obj = nd2Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = nd2Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        i2 = nd2Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "FlashControl: Waiting for any ongoing update to be completed");
                    }
                    int i4 = this.c;
                    tu0 tu0Var = this.d;
                    if (tu0Var == null) {
                        tu0Var = u24.b(jg7.a);
                    }
                    nd2Var.R = i4;
                    nd2Var.Z = 1;
                    if (tu0Var.c0(nd2Var) == x61Var) {
                        return x61Var;
                    }
                    i2 = i4;
                }
                if (kj2.F("CXCP")) {
                    Log.d("CXCP", "awaitFlashModeUpdate: initialFlashMode = " + i2);
                }
                return new Integer(i2);
            }
        }
        nd2Var = new nd2(this, s41Var);
        Object obj2 = nd2Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = nd2Var.Z;
        if (i == 0) {
        }
        if (kj2.F("CXCP")) {
        }
        return new Integer(i2);
    }

    @Override // defpackage.gi7
    public final void b(li7 li7Var) {
        this.b = li7Var;
        c(this.c, false);
    }

    public final tu0 c(int i, boolean z) {
        if (kj2.F("CXCP")) {
            StringBuilder t = xg6.t("setFlashAsync: flashMode = ", i, ", requestControl = ");
            t.append(this.b);
            Log.d("CXCP", t.toString());
        }
        tu0 tu0Var = new tu0();
        if (this.b != null) {
            this.c = i;
            tu0 tu0Var2 = this.d;
            if (z) {
                if (tu0Var2 != null) {
                    i61.A("There is a new flash mode being set or camera was closed", tu0Var2);
                }
                this.d = null;
            } else if (tu0Var2 != null) {
                nc1.a0(tu0Var, tu0Var2);
            }
            this.d = tu0Var;
            op6 op6Var = this.a;
            synchronized (op6Var.d) {
                op6Var.h = i;
            }
            nc1.a0(op6Var.f(), tu0Var);
            return tu0Var;
        }
        i61.A("Camera is not active.", tu0Var);
        return tu0Var;
    }

    @Override // defpackage.gi7
    public final void reset() {
        this.c = 2;
        tu0 tu0Var = this.d;
        if (tu0Var != null) {
            i61.A("There is a new flash mode being set or camera was closed", tu0Var);
        }
        this.d = null;
        c(2, true);
    }
}

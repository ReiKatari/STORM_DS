package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e26  reason: default package */
/* loaded from: classes.dex */
public final class e26 extends nw7 {
    public final ap3 t0;
    public int u0 = -1;
    public String v0 = "";
    public final jd1 w0 = ic6.a;

    public e26(Bundle bundle, LinkedHashMap linkedHashMap) {
        this.t0 = new ap3(27, bundle, linkedHashMap);
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final sc1 F(wb6 wb6Var) {
        wb6Var.getClass();
        if (np2.X(wb6Var)) {
            this.v0 = wb6Var.g(0);
            this.u0 = 0;
        }
        return this;
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final boolean M() {
        Object obj;
        String str = this.v0;
        ap3 ap3Var = this.t0;
        ap3Var.getClass();
        str.getClass();
        fd4 fd4Var = (fd4) ((LinkedHashMap) ap3Var.L).get(str);
        if (fd4Var != null) {
            obj = fd4Var.a((Bundle) ap3Var.B, str);
        } else {
            obj = null;
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nw7
    public final Object V() {
        return y0();
    }

    @Override // defpackage.ux0
    public final jd1 b() {
        return this.w0;
    }

    @Override // defpackage.sc1
    public final Object k(gg3 gg3Var) {
        gg3Var.getClass();
        return y0();
    }

    @Override // defpackage.ux0
    public final int q(wb6 wb6Var) {
        String g;
        ap3 ap3Var;
        wb6Var.getClass();
        int i = this.u0;
        do {
            i++;
            if (i >= wb6Var.f()) {
                return -1;
            }
            g = wb6Var.g(i);
            ap3Var = this.t0;
            ap3Var.getClass();
            g.getClass();
        } while (!((Bundle) ap3Var.B).containsKey(g));
        this.u0 = i;
        this.v0 = g;
        return i;
    }

    public final Object y0() {
        Object obj;
        String str = this.v0;
        ap3 ap3Var = this.t0;
        ap3Var.getClass();
        str.getClass();
        fd4 fd4Var = (fd4) ((LinkedHashMap) ap3Var.L).get(str);
        if (fd4Var != null) {
            obj = fd4Var.a((Bundle) ap3Var.B, str);
        } else {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        u34.i(this.v0, "Unexpected null value for non-nullable argument ");
        return null;
    }
}

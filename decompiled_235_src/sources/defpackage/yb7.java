package defpackage;

import java.io.EOFException;
import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yb7  reason: default package */
/* loaded from: classes.dex */
public final class yb7 extends ec6 {
    public final if3 a;
    public final be3 b;
    public final su2 c;
    public final ie7 d;
    public final zc7 e;
    public final j97 f = new j97(this, 1);
    public final boolean g;
    public volatile yc7 h;

    public yb7(if3 if3Var, be3 be3Var, su2 su2Var, ie7 ie7Var, zc7 zc7Var, boolean z) {
        this.a = if3Var;
        this.b = be3Var;
        this.c = su2Var;
        this.d = ie7Var;
        this.e = zc7Var;
        this.g = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    @Override // defpackage.yc7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(hf3 hf3Var) {
        boolean z;
        ee3 ee3Var;
        be3 be3Var = this.b;
        if (be3Var == null) {
            yc7 yc7Var = this.h;
            if (yc7Var == null) {
                yc7Var = this.c.e(this.e, this.d);
                this.h = yc7Var;
            }
            return yc7Var.b(hf3Var);
        }
        try {
            try {
                hf3Var.n0();
                z = false;
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                ke3.a.getClass();
                ee3Var = ke3.d(hf3Var);
            } catch (EOFException e2) {
                e = e2;
                if (z) {
                    ee3Var = ve3.A;
                    if (this.g) {
                    }
                    return be3Var.a(ee3Var, this.d.b, this.f);
                }
                throw new RuntimeException(e);
            }
            if (this.g) {
                ee3Var.getClass();
                if (ee3Var instanceof ve3) {
                    return null;
                }
            }
            return be3Var.a(ee3Var, this.d.b, this.f);
        } catch (i04 e3) {
            throw new RuntimeException(e3);
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        } catch (NumberFormatException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        if3 if3Var = this.a;
        if (if3Var == null) {
            yc7 yc7Var = this.h;
            if (yc7Var == null) {
                yc7Var = this.c.e(this.e, this.d);
                this.h = yc7Var;
            }
            yc7Var.c(vf3Var, obj);
        } else if (this.g && obj == null) {
            vf3Var.A();
        } else {
            ee3 b = if3Var.b(obj, this.d.b, this.f);
            ke3.a.getClass();
            ke3.g(vf3Var, b);
        }
    }

    @Override // defpackage.ec6
    public final yc7 d() {
        if (this.a != null) {
            return this;
        }
        yc7 yc7Var = this.h;
        if (yc7Var == null) {
            yc7 e = this.c.e(this.e, this.d);
            this.h = e;
            return e;
        }
        return yc7Var;
    }
}

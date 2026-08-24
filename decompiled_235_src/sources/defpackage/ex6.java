package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ex6  reason: default package */
/* loaded from: classes.dex */
public final class ex6 implements go3, Serializable {
    public on2 A;
    public volatile Object B;
    public final Object L;

    public ex6(on2 on2Var) {
        on2Var.getClass();
        this.A = on2Var;
        this.B = xd5.u0;
        this.L = this;
    }

    public final boolean a() {
        if (this.B != xd5.u0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.go3
    public final Object getValue() {
        Object obj;
        Object obj2 = this.B;
        xd5 xd5Var = xd5.u0;
        if (obj2 != xd5Var) {
            return obj2;
        }
        synchronized (this.L) {
            obj = this.B;
            if (obj == xd5Var) {
                on2 on2Var = this.A;
                on2Var.getClass();
                obj = on2Var.c();
                this.B = obj;
                this.A = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (a()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}

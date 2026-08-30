package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: il6  reason: default package */
/* loaded from: classes.dex */
public final class il6 implements gh3, Serializable {
    public ki2 A;
    public volatile Object B;
    public final Object L;

    public il6(ki2 ki2Var) {
        ki2Var.getClass();
        this.A = ki2Var;
        this.B = sn1.u0;
        this.L = this;
    }

    public final boolean a() {
        if (this.B != sn1.u0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gh3
    public final Object getValue() {
        Object obj;
        Object obj2 = this.B;
        sn1 sn1Var = sn1.u0;
        if (obj2 != sn1Var) {
            return obj2;
        }
        synchronized (this.L) {
            obj = this.B;
            if (obj == sn1Var) {
                ki2 ki2Var = this.A;
                ki2Var.getClass();
                obj = ki2Var.c();
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

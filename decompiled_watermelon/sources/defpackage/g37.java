package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g37  reason: default package */
/* loaded from: classes.dex */
public final class g37 implements gh3, Serializable {
    public ki2 A;
    public Object B;

    @Override // defpackage.gh3
    public final Object getValue() {
        if (this.B == sn1.u0) {
            ki2 ki2Var = this.A;
            ki2Var.getClass();
            this.B = ki2Var.c();
            this.A = null;
        }
        return this.B;
    }

    public final String toString() {
        boolean z;
        if (this.B != sn1.u0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}

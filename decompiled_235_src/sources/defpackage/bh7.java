package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bh7  reason: default package */
/* loaded from: classes.dex */
public final class bh7 implements go3, Serializable {
    public on2 A;
    public Object B;

    @Override // defpackage.go3
    public final Object getValue() {
        if (this.B == xd5.u0) {
            on2 on2Var = this.A;
            on2Var.getClass();
            this.B = on2Var.c();
            this.A = null;
        }
        return this.B;
    }

    public final String toString() {
        boolean z;
        if (this.B != xd5.u0) {
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

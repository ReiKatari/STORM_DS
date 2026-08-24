package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zb5  reason: default package */
/* loaded from: classes.dex */
public final class zb5 implements bc5 {
    public final xb5 a;
    public final boolean b;
    public final ArrayList c;

    public zb5(xb5 xb5Var, boolean z, ArrayList arrayList) {
        this.a = xb5Var;
        this.b = z;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zb5) {
                zb5 zb5Var = (zb5) obj;
                if (!this.a.equals(zb5Var.a) || this.b != zb5Var.b || !this.c.equals(zb5Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + xg6.e(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "Committed(discarded=" + this.a + ", authenticationCleared=" + this.b + ", failures=" + this.c + ")";
    }
}

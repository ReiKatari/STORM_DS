package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mb2  reason: default package */
/* loaded from: classes.dex */
public final class mb2 {
    public final List a;
    public final boolean b;

    public mb2(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mb2) {
                mb2 mb2Var = (mb2) obj;
                if (!this.a.equals(mb2Var.a) || this.b != mb2Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RomCacheReadResult(roms=" + this.a + ", isValid=" + this.b + ")";
    }
}

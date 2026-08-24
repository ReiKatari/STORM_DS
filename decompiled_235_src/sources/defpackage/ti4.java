package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: ti4  reason: default package */
/* loaded from: classes.dex */
public final class ti4 {
    public static final si4 Companion = new Object();
    public static final go3[] c = {kj2.M(xr3.PUBLICATION, new pi3(15)), null};
    public final List a;
    public final int b;

    public /* synthetic */ ti4(int i, List list, int i2) {
        this.a = (i & 1) == 0 ? yt1.A : list;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti4)) {
            return false;
        }
        ti4 ti4Var = (ti4) obj;
        if (nb3.k(this.a, ti4Var.a) && this.b == ti4Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OfflineLedgerFile(records=" + this.a + ", expirationPolicyVersion=" + this.b + ")";
    }

    public ti4(int i, List list) {
        list.getClass();
        this.a = list;
        this.b = i;
    }
}

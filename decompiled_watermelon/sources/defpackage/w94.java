package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: w94  reason: default package */
/* loaded from: classes.dex */
public final class w94 {
    public static final v94 Companion = new Object();
    public static final gh3[] c = {yf2.H(wk3.PUBLICATION, new vq3(9)), null};
    public final List a;
    public final int b;

    public /* synthetic */ w94(int i, int i2, List list) {
        this.a = (i & 1) == 0 ? pp1.A : list;
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
        if (!(obj instanceof w94)) {
            return false;
        }
        w94 w94Var = (w94) obj;
        if (b53.x(this.a, w94Var.a) && this.b == w94Var.b) {
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

    public w94(int i, List list) {
        list.getClass();
        this.a = list;
        this.b = i;
    }
}

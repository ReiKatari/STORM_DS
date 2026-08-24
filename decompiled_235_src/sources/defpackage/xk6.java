package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xk6  reason: default package */
/* loaded from: classes.dex */
public final class xk6 {
    public final int a;
    public final List b;
    public final int c;

    public xk6(int i, List list, int i2) {
        this.a = i;
        this.b = list;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xk6) {
                xk6 xk6Var = (xk6) obj;
                if (this.a != xk6Var.a || !this.b.equals(xk6Var.b) || this.c != xk6Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + i61.b(Integer.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmartSyncResult(submittedCount=");
        sb.append(this.a);
        sb.append(", skipped=");
        sb.append(this.b);
        sb.append(", totalCount=");
        return lb1.o(sb, this.c, ")");
    }
}

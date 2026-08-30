package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i96  reason: default package */
/* loaded from: classes.dex */
public final class i96 {
    public final int a;
    public final List b;
    public final int c;

    public i96(int i, int i2, List list) {
        this.a = i;
        this.b = list;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i96) {
                i96 i96Var = (i96) obj;
                if (this.a != i96Var.a || !this.b.equals(i96Var.b) || this.c != i96Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + b31.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmartSyncResult(submittedCount=");
        sb.append(this.a);
        sb.append(", skipped=");
        sb.append(this.b);
        sb.append(", totalCount=");
        return wh1.m(sb, this.c, ")");
    }
}

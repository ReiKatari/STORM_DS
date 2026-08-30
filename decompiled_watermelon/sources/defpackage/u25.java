package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u25  reason: default package */
/* loaded from: classes.dex */
public final class u25 {
    public final long a;
    public final int b;
    public final List c;
    public final boolean d;

    public u25(long j, int i, List list, boolean z) {
        this.a = j;
        this.b = i;
        this.c = list;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u25) {
                u25 u25Var = (u25) obj;
                if (this.a != u25Var.a || this.b != u25Var.b || !this.c.equals(u25Var.c) || this.d != u25Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + b31.b(wh1.a(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "RaNativePendingRetryResult(submissionSessionId=" + this.a + ", forcedRetryCount=" + this.b + ", resolutions=" + this.c + ", transportFailure=" + this.d + ")";
    }
}

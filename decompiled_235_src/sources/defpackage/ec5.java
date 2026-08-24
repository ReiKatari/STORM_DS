package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ec5  reason: default package */
/* loaded from: classes.dex */
public final class ec5 {
    public final long a;
    public final int b;
    public final List c;
    public final boolean d;

    public ec5(long j, int i, List list, boolean z) {
        this.a = j;
        this.b = i;
        this.c = list;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ec5) {
                ec5 ec5Var = (ec5) obj;
                if (this.a != ec5Var.a || this.b != ec5Var.b || !this.c.equals(ec5Var.c) || this.d != ec5Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + i61.b(lb1.a(this.b, Long.hashCode(this.a) * 31, 31), this.c, 31);
    }

    public final String toString() {
        return "RaNativePendingRetryResult(submissionSessionId=" + this.a + ", forcedRetryCount=" + this.b + ", resolutions=" + this.c + ", transportFailure=" + this.d + ")";
    }
}

package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pb4  reason: default package */
/* loaded from: classes.dex */
public final class pb4 {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final boolean e;

    public pb4(Set set, Set set2, Set set3, Set set4, boolean z) {
        this.a = set;
        this.b = set2;
        this.c = set3;
        this.d = set4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pb4) {
                pb4 pb4Var = (pb4) obj;
                if (!nb3.k(this.a, pb4Var.a) || !nb3.k(this.b, pb4Var.b) || !nb3.k(this.c, pb4Var.c) || !nb3.k(this.d, pb4Var.d) || this.e != pb4Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        return Boolean.hashCode(this.e) + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NativeRaRetryOutcome(acceptedNativeSubmissionIds=");
        sb.append(this.a);
        sb.append(", alreadyAcceptedNativeSubmissionIds=");
        sb.append(this.b);
        sb.append(", retryableFailureNativeSubmissionIds=");
        sb.append(this.c);
        sb.append(", permanentFailureNativeSubmissionIds=");
        sb.append(this.d);
        sb.append(", transientFailure=");
        return i61.o(sb, this.e, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ pb4() {
        this(r1, r1, r1, r1, true);
        du1 du1Var = du1.A;
    }
}

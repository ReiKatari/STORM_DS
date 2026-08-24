package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: av4  reason: default package */
/* loaded from: classes.dex */
public final class av4 {
    public final zu4 a;
    public final cv4 b;

    public av4(zu4 zu4Var, cv4 cv4Var) {
        cv4Var.getClass();
        this.a = zu4Var;
        this.b = cv4Var;
    }

    public static av4 a(av4 av4Var, cv4 cv4Var) {
        zu4 zu4Var = av4Var.a;
        av4Var.getClass();
        cv4Var.getClass();
        return new av4(zu4Var, cv4Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof av4) {
                av4 av4Var = (av4) obj;
                if (!this.a.equals(av4Var.a) || this.b != av4Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingRaSubmissionRecord(submission=" + this.a + ", status=" + this.b + ")";
    }
}

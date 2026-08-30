package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: be5  reason: default package */
/* loaded from: classes.dex */
public final class be5 extends de5 {
    public final ae5 a;
    public final List b;

    public be5(ae5 ae5Var, List list) {
        this.a = ae5Var;
        this.b = list;
    }

    @Override // defpackage.de5
    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof be5) {
                be5 be5Var = (be5) obj;
                if (!this.a.equals(be5Var.a) || !this.b.equals(be5Var.b)) {
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
        return "Failure(nextSubmissionAttempt=" + this.a + ", uiEvents=" + this.b + ")";
    }
}

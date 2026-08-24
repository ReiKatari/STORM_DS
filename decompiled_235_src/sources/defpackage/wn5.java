package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wn5  reason: default package */
/* loaded from: classes.dex */
public final class wn5 extends yn5 {
    public final vn5 b;
    public final List c;

    public wn5(vn5 vn5Var, List list) {
        super(list);
        this.b = vn5Var;
        this.c = list;
    }

    @Override // defpackage.yn5
    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wn5) {
                wn5 wn5Var = (wn5) obj;
                if (!this.b.equals(wn5Var.b) || !this.c.equals(wn5Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(nextSubmissionAttempt=" + this.b + ", uiEvents=" + this.c + ")";
    }
}

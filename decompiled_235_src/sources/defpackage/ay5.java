package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ay5  reason: default package */
/* loaded from: classes.dex */
public final class ay5 extends cy5 {
    public final qo6 a;

    public ay5(qo6 qo6Var) {
        this.a = qo6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ay5) && this.a == ((ay5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LaunchFailedSramProblem(reason=" + this.a + ")";
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vh3  reason: default package */
/* loaded from: classes.dex */
public final class vh3 {
    public static final vh3 b = new vh3(63, null);
    public final qn2 a;

    public vh3(int i, qn2 qn2Var) {
        this.a = (i & 1) != 0 ? null : qn2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vh3) {
            if (this.a == ((vh3) obj).a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        qn2 qn2Var = this.a;
        if (qn2Var != null) {
            i = qn2Var.hashCode();
        } else {
            i = 0;
        }
        return i * 28629151;
    }
}

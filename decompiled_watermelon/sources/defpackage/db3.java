package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: db3  reason: default package */
/* loaded from: classes.dex */
public final class db3 {
    public static final db3 b = new db3(63, null);
    public final mi2 a;

    public db3(int i, mi2 mi2Var) {
        this.a = (i & 1) != 0 ? null : mi2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof db3) {
            if (this.a == ((db3) obj).a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        mi2 mi2Var = this.a;
        if (mi2Var != null) {
            i = mi2Var.hashCode();
        } else {
            i = 0;
        }
        return i * 28629151;
    }
}

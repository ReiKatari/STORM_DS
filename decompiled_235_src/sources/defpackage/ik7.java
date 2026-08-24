package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ik7  reason: default package */
/* loaded from: classes.dex */
public final class ik7 {
    public final String a;
    public final String b;

    public ik7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ik7) {
                ik7 ik7Var = (ik7) obj;
                if (!this.a.equals(ik7Var.a) || !this.b.equals(ik7Var.b)) {
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
        return lb1.n("ValidatedRetroAchievementsHost(clientHost=", this.a, ", apiUrl=", this.b, ")");
    }
}

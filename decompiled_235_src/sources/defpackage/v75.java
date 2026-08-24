package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v75  reason: default package */
/* loaded from: classes.dex */
public final class v75 {
    public final t75 a;
    public final List b;
    public final List c;

    public v75(t75 t75Var, List list, List list2) {
        this.a = t75Var;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v75) {
                v75 v75Var = (v75) obj;
                if (!this.a.equals(v75Var.a) || !this.b.equals(v75Var.b) || !this.c.equals(v75Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + i61.b(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "RAAchievementSetWithDataEntity(set=" + this.a + ", achievements=" + this.b + ", leaderboards=" + this.c + ")";
    }
}

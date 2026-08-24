package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h3  reason: default package */
/* loaded from: classes.dex */
public final class h3 {
    public final g3 a;
    public final List b;

    public h3(g3 g3Var, List list) {
        g3Var.getClass();
        list.getClass();
        this.a = g3Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj;
        if (this.a == h3Var.a && nb3.k(this.b, h3Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AchievementBucketUiModel(bucket=" + this.a + ", achievements=" + this.b + ")";
    }
}

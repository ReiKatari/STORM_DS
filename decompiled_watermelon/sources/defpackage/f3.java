package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f3  reason: default package */
/* loaded from: classes.dex */
public final class f3 {
    public final e3 a;
    public final List b;

    public f3(e3 e3Var, List list) {
        e3Var.getClass();
        list.getClass();
        this.a = e3Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        if (this.a == f3Var.a && b53.x(this.b, f3Var.b)) {
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

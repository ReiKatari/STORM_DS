package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ky4  reason: default package */
/* loaded from: classes.dex */
public final class ky4 {
    public final iy4 a;
    public final List b;
    public final List c;

    public ky4(iy4 iy4Var, List list, List list2) {
        this.a = iy4Var;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ky4) {
                ky4 ky4Var = (ky4) obj;
                if (!this.a.equals(ky4Var.a) || !this.b.equals(ky4Var.b) || !this.c.equals(ky4Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + b31.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "RAAchievementSetWithDataEntity(set=" + this.a + ", achievements=" + this.b + ", leaderboards=" + this.c + ")";
    }
}

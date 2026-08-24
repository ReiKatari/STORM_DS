package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ku5  reason: default package */
/* loaded from: classes.dex */
public final class ku5 extends tu5 {
    public final Boolean a;

    public ku5(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ku5) && nb3.k(this.a, ((ku5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "RetroAchievementsEnabledUpdate(enabled=" + this.a + ")";
    }
}

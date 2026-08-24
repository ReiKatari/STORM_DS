package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wz4  reason: default package */
/* loaded from: classes.dex */
public final class wz4 extends zz4 {
    public final o75 a;

    public wz4(o75 o75Var) {
        o75Var.getClass();
        this.a = o75Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof wz4) && nb3.k(this.a, ((wz4) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AchievementUnlockPopup(achievement=" + this.a + ")";
    }
}

package defpackage;

import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bs5  reason: default package */
/* loaded from: classes.dex */
public final class bs5 {
    public static final bs5 c = new bs5(null, BackgroundMode.STRETCH);
    public final vy a;
    public final BackgroundMode b;

    public bs5(vy vyVar, BackgroundMode backgroundMode) {
        backgroundMode.getClass();
        this.a = vyVar;
        this.b = backgroundMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs5)) {
            return false;
        }
        bs5 bs5Var = (bs5) obj;
        if (b53.x(this.a, bs5Var.a) && this.b == bs5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        vy vyVar = this.a;
        if (vyVar == null) {
            hashCode = 0;
        } else {
            hashCode = vyVar.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "RuntimeBackground(background=" + this.a + ", mode=" + this.b + ")";
    }
}

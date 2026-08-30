package defpackage;

import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ul0  reason: default package */
/* loaded from: classes.dex */
public final class ul0 {
    public final Cheat a;
    public final String b;

    public ul0(Cheat cheat, String str) {
        cheat.getClass();
        str.getClass();
        this.a = cheat;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul0)) {
            return false;
        }
        ul0 ul0Var = (ul0) obj;
        if (b53.x(this.a, ul0Var.a) && b53.x(this.b, ul0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CheatInFolder(cheat=" + this.a + ", folderName=" + this.b + ")";
    }
}

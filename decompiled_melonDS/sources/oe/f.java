package oe;

import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Cheat f10927a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10928b;

    public f(Cheat cheat, String str) {
        cheat.getClass();
        str.getClass();
        this.f10927a = cheat;
        this.f10928b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (nc.k.a(this.f10927a, fVar.f10927a) && nc.k.a(this.f10928b, fVar.f10928b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10928b.hashCode() + (this.f10927a.hashCode() * 31);
    }

    public final String toString() {
        return "CheatInFolder(cheat=" + this.f10927a + ", folderName=" + this.f10928b + ")";
    }
}

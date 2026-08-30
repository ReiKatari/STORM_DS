package oe;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f10929a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10930b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10931c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10932d;

    public f0(String str, String str2, String str3, boolean z10) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f10929a = str;
        this.f10930b = str2;
        this.f10931c = z10;
        this.f10932d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (nc.k.a(this.f10929a, f0Var.f10929a) && nc.k.a(this.f10930b, f0Var.f10930b) && this.f10931c == f0Var.f10931c && nc.k.a(this.f10932d, f0Var.f10932d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10932d.hashCode() + w.d.e(w.d.d(this.f10929a.hashCode() * 31, 31, this.f10930b), this.f10931c, 31);
    }

    public final String toString() {
        StringBuilder k10 = kc.a.k("RomMetadata(romTitle=", this.f10929a, ", developerName=", this.f10930b, ", isDSiWareTitle=");
        k10.append(this.f10931c);
        k10.append(", retroAchievementsHash=");
        k10.append(this.f10932d);
        k10.append(")");
        return k10.toString();
    }
}

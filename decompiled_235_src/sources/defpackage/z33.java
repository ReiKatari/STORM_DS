package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z33  reason: default package */
/* loaded from: classes.dex */
public final class z33 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;

    public z33(String str, String str2, String str3, boolean z, String str4, String str5, boolean z2, String str6, String str7) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = str5;
        this.g = z2;
        this.h = str6;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z33) {
                z33 z33Var = (z33) obj;
                if (!nb3.k(this.a, z33Var.a) || !this.b.equals(z33Var.b) || !this.c.equals(z33Var.c) || this.d != z33Var.d || !this.e.equals(z33Var.e) || !this.f.equals(z33Var.f) || this.g != z33Var.g || !this.h.equals(z33Var.h) || !this.i.equals(z33Var.i)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.i.hashCode() + xg6.d(xg6.e(xg6.d(xg6.d(xg6.e(xg6.d(xg6.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), 31, this.e), 31, this.f), this.g, 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder u = i61.u("InGameRomSettingsMenuState(controllerMappingValue=", this.a, ", layoutValue=", this.b, ", videoFilteringValue=");
        u.append(this.c);
        u.append(", showRetroArchSettings=");
        u.append(this.d);
        u.append(", retroArchPresetPathValue=");
        i61.B(u, this.e, ", retroArchParametersValue=", this.f, ", hasValidRetroArchShaderRoot=");
        u.append(this.g);
        u.append(", micSourceValue=");
        u.append(this.h);
        u.append(", dualScreenPresetValue=");
        return i61.n(u, this.i, ")");
    }
}

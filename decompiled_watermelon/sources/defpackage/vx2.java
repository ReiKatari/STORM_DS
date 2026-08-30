package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vx2  reason: default package */
/* loaded from: classes.dex */
public final class vx2 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;

    public vx2(String str, String str2, String str3, boolean z, String str4, String str5, boolean z2, String str6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = str5;
        this.g = z2;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vx2) {
                vx2 vx2Var = (vx2) obj;
                if (!b53.x(this.a, vx2Var.a) || !this.b.equals(vx2Var.b) || !this.c.equals(vx2Var.c) || this.d != vx2Var.d || !this.e.equals(vx2Var.e) || !this.f.equals(vx2Var.f) || this.g != vx2Var.g || !this.h.equals(vx2Var.h)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.h.hashCode() + ej6.c(ej6.b(ej6.b(ej6.c(ej6.b(ej6.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), 31, this.e), 31, this.f), this.g, 31);
    }

    public final String toString() {
        StringBuilder v = b31.v("InGameRomSettingsMenuState(controllerMappingValue=", this.a, ", layoutValue=", this.b, ", videoFilteringValue=");
        v.append(this.c);
        v.append(", showRetroArchSettings=");
        v.append(this.d);
        v.append(", retroArchPresetPathValue=");
        b31.B(v, this.e, ", retroArchParametersValue=", this.f, ", hasValidRetroArchShaderRoot=");
        v.append(this.g);
        v.append(", micSourceValue=");
        v.append(this.h);
        v.append(")");
        return v.toString();
    }
}

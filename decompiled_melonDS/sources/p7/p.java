package p7;

import java.util.Locale;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final String f11428a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11429b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11430c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11431d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11432e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11433f;

    /* renamed from: g  reason: collision with root package name */
    public final int f11434g;

    public p(String str, String str2, boolean z10, int i2, String str3, int i10) {
        int i11;
        str.getClass();
        str2.getClass();
        this.f11428a = str;
        this.f11429b = str2;
        this.f11430c = z10;
        this.f11431d = i2;
        this.f11432e = str3;
        this.f11433f = i10;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (vc.h.Y(upperCase, "INT", false)) {
            i11 = 3;
        } else if (!vc.h.Y(upperCase, "CHAR", false) && !vc.h.Y(upperCase, "CLOB", false) && !vc.h.Y(upperCase, "TEXT", false)) {
            if (vc.h.Y(upperCase, "BLOB", false)) {
                i11 = 5;
            } else if (!vc.h.Y(upperCase, "REAL", false) && !vc.h.Y(upperCase, "FLOA", false) && !vc.h.Y(upperCase, "DOUB", false)) {
                i11 = 1;
            } else {
                i11 = 4;
            }
        } else {
            i11 = 2;
        }
        this.f11434g = i11;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this != obj) {
            if (obj instanceof p) {
                if (this.f11431d > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p pVar = (p) obj;
                int i2 = pVar.f11433f;
                if (pVar.f11431d > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11 && nc.k.a(this.f11428a, pVar.f11428a) && this.f11430c == pVar.f11430c) {
                    String str = pVar.f11432e;
                    int i10 = this.f11433f;
                    String str2 = this.f11432e;
                    if ((i10 != 1 || i2 != 2 || str2 == null || t.h(str2, str)) && ((i10 != 2 || i2 != 1 || str == null || t.h(str, str2)) && ((i10 == 0 || i10 != i2 || (str2 == null ? str == null : t.h(str2, str))) && this.f11434g == pVar.f11434g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int hashCode = ((this.f11428a.hashCode() * 31) + this.f11434g) * 31;
        if (this.f11430c) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return ((hashCode + i2) * 31) + this.f11431d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |Column {\n            |   name = '");
        sb2.append(this.f11428a);
        sb2.append("',\n            |   type = '");
        sb2.append(this.f11429b);
        sb2.append("',\n            |   affinity = '");
        sb2.append(this.f11434g);
        sb2.append("',\n            |   notNull = '");
        sb2.append(this.f11430c);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(this.f11431d);
        sb2.append("',\n            |   defaultValue = '");
        String str = this.f11432e;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return vc.i.I(vc.i.K(sb2.toString()));
    }
}

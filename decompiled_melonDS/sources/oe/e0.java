package oe;

import java.util.Locale;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f10923a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10924b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10925c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10926d;

    public e0(int i2, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f10923a = str;
        this.f10924b = i2;
        this.f10925c = str2;
        this.f10926d = str3;
    }

    public final String a() {
        p7.k.f(16);
        String upperCase = vc.h.o0(8, p7.k.A(16, this.f10924b & 4294967295L)).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (nc.k.a(this.f10923a, e0Var.f10923a) && this.f10924b == e0Var.f10924b && nc.k.a(this.f10925c, e0Var.f10925c) && nc.k.a(this.f10926d, e0Var.f10926d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10926d.hashCode() + w.d.d(w.d.c(this.f10924b, this.f10923a.hashCode() * 31, 31), 31, this.f10925c);
    }

    public final String toString() {
        StringBuilder k10 = kc.a.k("RomInfo(gameCode=", this.f10923a, ", headerChecksum=", String.valueOf(this.f10924b & 4294967295L), ", gameTitle=");
        k10.append(this.f10925c);
        k10.append(", gameName=");
        k10.append(this.f10926d);
        k10.append(")");
        return k10.toString();
    }
}

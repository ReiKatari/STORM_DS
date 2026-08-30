package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wm5  reason: default package */
/* loaded from: classes.dex */
public final class wm5 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;

    public wm5(int i, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        String upperCase = zg6.H0(8, nl2.Z(this.b)).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm5)) {
            return false;
        }
        wm5 wm5Var = (wm5) obj;
        if (b53.x(this.a, wm5Var.a) && this.b == wm5Var.b && b53.x(this.c, wm5Var.c) && b53.x(this.d, wm5Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ej6.b(wh1.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b31.v("RomInfo(gameCode=", this.a, ", headerChecksum=", String.valueOf(this.b & 4294967295L), ", gameTitle=");
        v.append(this.c);
        v.append(", gameName=");
        v.append(this.d);
        v.append(")");
        return v.toString();
    }
}

package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: xu  reason: default package */
/* loaded from: classes.dex */
public final class xu {
    public static final wu Companion = new Object();
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;

    public /* synthetic */ xu(int i, long j, String str, String str2, long j2, String str3) {
        if ((i & 1) == 0) {
            this.a = 0L;
        } else {
            this.a = j;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = 0L;
        } else {
            this.d = j2;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu)) {
            return false;
        }
        xu xuVar = (xu) obj;
        if (this.a == xuVar.a && b53.x(this.b, xuVar.b) && b53.x(this.c, xuVar.c) && this.d == xuVar.d && b53.x(this.e, xuVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + b31.c(this.d, ej6.b(ej6.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        return "AssetDto(id=" + this.a + ", url=" + this.b + ", name=" + this.c + ", size=" + this.d + ", contentType=" + this.e + ")";
    }
}

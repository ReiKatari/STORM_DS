package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: pv  reason: default package */
/* loaded from: classes.dex */
public final class pv {
    public static final ov Companion = new Object();
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;

    public /* synthetic */ pv(int i, long j, String str, String str2, long j2, String str3) {
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
        if (!(obj instanceof pv)) {
            return false;
        }
        pv pvVar = (pv) obj;
        if (this.a == pvVar.a && nb3.k(this.b, pvVar.b) && nb3.k(this.c, pvVar.c) && this.d == pvVar.d && nb3.k(this.e, pvVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + i61.c(this.d, xg6.d(xg6.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        return "AssetDto(id=" + this.a + ", url=" + this.b + ", name=" + this.c + ", size=" + this.d + ", contentType=" + this.e + ")";
    }
}

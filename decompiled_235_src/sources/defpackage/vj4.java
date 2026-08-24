package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: vj4  reason: default package */
/* loaded from: classes.dex */
public final class vj4 {
    public static final uj4 Companion = new Object();
    public static final go3[] h;
    public final String a;
    public final long b;
    public final List c;
    public final List d;
    public final String e;
    public final String f;
    public final long g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, uj4] */
    static {
        xr3 xr3Var = xr3.PUBLICATION;
        h = new go3[]{null, null, kj2.M(xr3Var, new pi3(20)), kj2.M(xr3Var, new pi3(21)), null, null, null};
    }

    public /* synthetic */ vj4(int i, long j, long j2, String str, String str2, String str3, List list, List list2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = 0L;
        } else {
            this.b = j;
        }
        int i2 = i & 4;
        yt1 yt1Var = yt1.A;
        if (i2 == 0) {
            this.c = yt1Var;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = yt1Var;
        } else {
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = 0L;
        } else {
            this.g = j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj4)) {
            return false;
        }
        vj4 vj4Var = (vj4) obj;
        if (nb3.k(this.a, vj4Var.a) && this.b == vj4Var.b && nb3.k(this.c, vj4Var.c) && nb3.k(this.d, vj4Var.d) && nb3.k(this.e, vj4Var.e) && nb3.k(this.f, vj4Var.f) && this.g == vj4Var.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b = i61.b(i61.b(i61.c(this.b, this.a.hashCode() * 31, 31), this.c, 31), this.d, 31);
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Long.hashCode(this.g) + xg6.d((b + hashCode) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflinePrefetchCacheFile(romHash=");
        sb.append(this.a);
        sb.append(", gameId=");
        sb.append(this.b);
        sb.append(", achievements=");
        sb.append(this.c);
        sb.append(", leaderboards=");
        sb.append(this.d);
        i61.B(sb, ", richPresencePatch=", this.e, ", iconUrl=", this.f);
        return lb1.r(sb, ", fetchedAtEpochMs=", this.g, ")");
    }

    public vj4(String str, long j, List list, List list2, String str2, String str3, long j2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = j;
        this.c = list;
        this.d = list2;
        this.e = str2;
        this.f = str3;
        this.g = j2;
    }
}

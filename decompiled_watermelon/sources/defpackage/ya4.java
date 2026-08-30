package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: ya4  reason: default package */
/* loaded from: classes.dex */
public final class ya4 {
    public static final xa4 Companion = new Object();
    public static final gh3[] h;
    public final String a;
    public final long b;
    public final List c;
    public final List d;
    public final String e;
    public final String f;
    public final long g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa4] */
    static {
        wk3 wk3Var = wk3.PUBLICATION;
        h = new gh3[]{null, null, yf2.H(wk3Var, new vq3(14)), yf2.H(wk3Var, new vq3(15)), null, null, null};
    }

    public /* synthetic */ ya4(int i, long j, long j2, String str, String str2, String str3, List list, List list2) {
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
        pp1 pp1Var = pp1.A;
        if (i2 == 0) {
            this.c = pp1Var;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = pp1Var;
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
        if (!(obj instanceof ya4)) {
            return false;
        }
        ya4 ya4Var = (ya4) obj;
        if (b53.x(this.a, ya4Var.a) && this.b == ya4Var.b && b53.x(this.c, ya4Var.c) && b53.x(this.d, ya4Var.d) && b53.x(this.e, ya4Var.e) && b53.x(this.f, ya4Var.f) && this.g == ya4Var.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b = b31.b(b31.b(b31.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Long.hashCode(this.g) + ej6.b((b + hashCode) * 31, 31, this.f);
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
        b31.B(sb, ", richPresencePatch=", this.e, ", iconUrl=", this.f);
        return wh1.p(sb, ", fetchedAtEpochMs=", this.g, ")");
    }

    public ya4(String str, long j, List list, List list2, String str2, String str3, long j2) {
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

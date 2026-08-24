package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: yi4  reason: default package */
/* loaded from: classes.dex */
public final class yi4 {
    public static final xi4 Companion = new Object();
    public static final go3[] r;
    public final dj4 a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final boolean g;
    public final String h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final byte[] n;
    public final gk4 o;
    public final ik4 p;
    public final boolean q;

    /* JADX WARN: Type inference failed for: r0v0, types: [xi4, java.lang.Object] */
    static {
        xr3 xr3Var = xr3.PUBLICATION;
        r = new go3[]{kj2.M(xr3Var, new pi3(16)), null, null, null, null, null, null, null, null, null, null, null, null, null, kj2.M(xr3Var, new pi3(17)), kj2.M(xr3Var, new pi3(18)), null};
    }

    public /* synthetic */ yi4(int i, dj4 dj4Var, long j, String str, String str2, long j2, long j3, boolean z, String str3, long j4, long j5, long j6, long j7, long j8, byte[] bArr, gk4 gk4Var, ik4 ik4Var, boolean z2) {
        gk4 gk4Var2;
        ik4 ik4Var2;
        this.a = (i & 1) == 0 ? dj4.SESSION_START : dj4Var;
        if ((i & 2) == 0) {
            this.b = 0L;
        } else {
            this.b = j;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = 0L;
        } else {
            this.e = j2;
        }
        if ((i & 32) == 0) {
            this.f = 0L;
        } else {
            this.f = j3;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = 0L;
        } else {
            this.i = j4;
        }
        if ((i & 512) == 0) {
            this.j = 0L;
        } else {
            this.j = j5;
        }
        if ((i & 1024) == 0) {
            this.k = 0L;
        } else {
            this.k = j6;
        }
        if ((i & 2048) == 0) {
            this.l = 0L;
        } else {
            this.l = j7;
        }
        if ((i & 4096) == 0) {
            this.m = 0L;
        } else {
            this.m = j8;
        }
        if ((i & 8192) == 0) {
            this.n = new byte[0];
        } else {
            this.n = bArr;
        }
        if ((i & 16384) == 0) {
            gk4Var2 = gk4.UNKNOWN;
        } else {
            gk4Var2 = gk4Var;
        }
        this.o = gk4Var2;
        if ((32768 & i) == 0) {
            ik4Var2 = ik4.UNKNOWN;
        } else {
            ik4Var2 = ik4Var;
        }
        this.p = ik4Var2;
        if ((i & 65536) == 0) {
            this.q = false;
        } else {
            this.q = z2;
        }
    }

    public static yi4 a(yi4 yi4Var, long j, byte[] bArr) {
        dj4 dj4Var = yi4Var.a;
        String str = yi4Var.c;
        String str2 = yi4Var.d;
        long j2 = yi4Var.e;
        long j3 = yi4Var.f;
        boolean z = yi4Var.g;
        String str3 = yi4Var.h;
        long j4 = yi4Var.i;
        long j5 = yi4Var.j;
        long j6 = yi4Var.k;
        long j7 = yi4Var.l;
        long j8 = yi4Var.m;
        gk4 gk4Var = yi4Var.o;
        ik4 ik4Var = yi4Var.p;
        boolean z2 = yi4Var.q;
        yi4Var.getClass();
        dj4Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        gk4Var.getClass();
        ik4Var.getClass();
        return new yi4(dj4Var, j, str, str2, j2, j3, z, str3, j4, j5, j6, j7, j8, bArr, gk4Var, ik4Var, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi4)) {
            return false;
        }
        yi4 yi4Var = (yi4) obj;
        if (this.a == yi4Var.a && this.b == yi4Var.b && nb3.k(this.c, yi4Var.c) && nb3.k(this.d, yi4Var.d) && this.e == yi4Var.e && this.f == yi4Var.f && this.g == yi4Var.g && nb3.k(this.h, yi4Var.h) && this.i == yi4Var.i && this.j == yi4Var.j && this.k == yi4Var.k && this.l == yi4Var.l && this.m == yi4Var.m && nb3.k(this.n, yi4Var.n) && this.o == yi4Var.o && this.p == yi4Var.p && this.q == yi4Var.q) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int c = i61.c(this.m, i61.c(this.l, i61.c(this.k, i61.c(this.j, i61.c(this.i, xg6.d(xg6.e(i61.c(this.f, i61.c(this.e, xg6.d(xg6.d(i61.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31), 31), this.g, 31), 31, this.h), 31), 31), 31), 31), 31);
        int hashCode = this.o.hashCode();
        int hashCode2 = this.p.hashCode();
        return Boolean.hashCode(this.q) + ((hashCode2 + ((hashCode + ((Arrays.hashCode(this.n) + c) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.n);
        StringBuilder sb = new StringBuilder("OfflineLedgerPayload(recordType=");
        sb.append(this.a);
        sb.append(", seq=");
        sb.append(this.b);
        i61.B(sb, ", userId=", this.c, ", contentId=", this.d);
        xg6.B(sb, ", gameId=", this.e, ", achievementId=");
        sb.append(this.f);
        sb.append(", isHardcore=");
        sb.append(this.g);
        sb.append(", sessionId=");
        sb.append(this.h);
        sb.append(", localTimestampEpochMs=");
        sb.append(this.i);
        xg6.B(sb, ", offsetFromSessionStartMs=", this.j, ", orderIndex=");
        sb.append(this.k);
        xg6.B(sb, ", ackedSeq=", this.l, ", estimatedPlayDurationMs=");
        sb.append(this.m);
        sb.append(", prevHash=");
        sb.append(arrays);
        sb.append(", unlockMode=");
        sb.append(this.o);
        sb.append(", offlineType=");
        sb.append(this.p);
        sb.append(", pendingSync=");
        sb.append(this.q);
        sb.append(")");
        return sb.toString();
    }

    public yi4(dj4 dj4Var, long j, String str, String str2, long j2, long j3, boolean z, String str3, long j4, long j5, long j6, long j7, long j8, byte[] bArr, gk4 gk4Var, ik4 ik4Var, boolean z2) {
        dj4Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        gk4Var.getClass();
        ik4Var.getClass();
        this.a = dj4Var;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = j2;
        this.f = j3;
        this.g = z;
        this.h = str3;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = j7;
        this.m = j8;
        this.n = bArr;
        this.o = gk4Var;
        this.p = ik4Var;
        this.q = z2;
    }

    public /* synthetic */ yi4(dj4 dj4Var, String str, String str2, long j, long j2, boolean z, String str3, long j3, long j4, long j5, long j6, long j7, gk4 gk4Var, ik4 ik4Var, boolean z2, int i) {
        this((i & 1) != 0 ? dj4.SESSION_START : dj4Var, 0L, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? 0L : j2, (i & 64) != 0 ? false : z, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? 0L : j3, (i & 512) != 0 ? 0L : j4, (i & 1024) != 0 ? 0L : j5, (i & 2048) != 0 ? 0L : j6, (i & 4096) != 0 ? 0L : j7, new byte[0], (i & 16384) != 0 ? gk4.UNKNOWN : gk4Var, (32768 & i) != 0 ? ik4.UNKNOWN : ik4Var, (i & 65536) != 0 ? false : z2);
    }
}

package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: ba4  reason: default package */
/* loaded from: classes.dex */
public final class ba4 {
    public static final aa4 Companion = new Object();
    public static final gh3[] r;
    public final ga4 a;
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
    public final jb4 o;
    public final lb4 p;
    public final boolean q;

    /* JADX WARN: Type inference failed for: r0v0, types: [aa4, java.lang.Object] */
    static {
        wk3 wk3Var = wk3.PUBLICATION;
        r = new gh3[]{yf2.H(wk3Var, new vq3(10)), null, null, null, null, null, null, null, null, null, null, null, null, null, yf2.H(wk3Var, new vq3(11)), yf2.H(wk3Var, new vq3(12)), null};
    }

    public /* synthetic */ ba4(int i, ga4 ga4Var, long j, String str, String str2, long j2, long j3, boolean z, String str3, long j4, long j5, long j6, long j7, long j8, byte[] bArr, jb4 jb4Var, lb4 lb4Var, boolean z2) {
        jb4 jb4Var2;
        lb4 lb4Var2;
        this.a = (i & 1) == 0 ? ga4.SESSION_START : ga4Var;
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
            jb4Var2 = jb4.UNKNOWN;
        } else {
            jb4Var2 = jb4Var;
        }
        this.o = jb4Var2;
        if ((32768 & i) == 0) {
            lb4Var2 = lb4.UNKNOWN;
        } else {
            lb4Var2 = lb4Var;
        }
        this.p = lb4Var2;
        if ((i & 65536) == 0) {
            this.q = false;
        } else {
            this.q = z2;
        }
    }

    public static ba4 a(ba4 ba4Var, long j, byte[] bArr) {
        ga4 ga4Var = ba4Var.a;
        String str = ba4Var.c;
        String str2 = ba4Var.d;
        long j2 = ba4Var.e;
        long j3 = ba4Var.f;
        boolean z = ba4Var.g;
        String str3 = ba4Var.h;
        long j4 = ba4Var.i;
        long j5 = ba4Var.j;
        long j6 = ba4Var.k;
        long j7 = ba4Var.l;
        long j8 = ba4Var.m;
        jb4 jb4Var = ba4Var.o;
        lb4 lb4Var = ba4Var.p;
        boolean z2 = ba4Var.q;
        ba4Var.getClass();
        ga4Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        jb4Var.getClass();
        lb4Var.getClass();
        return new ba4(ga4Var, j, str, str2, j2, j3, z, str3, j4, j5, j6, j7, j8, bArr, jb4Var, lb4Var, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba4)) {
            return false;
        }
        ba4 ba4Var = (ba4) obj;
        if (this.a == ba4Var.a && this.b == ba4Var.b && b53.x(this.c, ba4Var.c) && b53.x(this.d, ba4Var.d) && this.e == ba4Var.e && this.f == ba4Var.f && this.g == ba4Var.g && b53.x(this.h, ba4Var.h) && this.i == ba4Var.i && this.j == ba4Var.j && this.k == ba4Var.k && this.l == ba4Var.l && this.m == ba4Var.m && b53.x(this.n, ba4Var.n) && this.o == ba4Var.o && this.p == ba4Var.p && this.q == ba4Var.q) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int c = b31.c(this.m, b31.c(this.l, b31.c(this.k, b31.c(this.j, b31.c(this.i, ej6.b(ej6.c(b31.c(this.f, b31.c(this.e, ej6.b(ej6.b(b31.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31), 31), this.g, 31), 31, this.h), 31), 31), 31), 31), 31);
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
        b31.B(sb, ", userId=", this.c, ", contentId=", this.d);
        ej6.k(sb, ", gameId=", this.e, ", achievementId=");
        sb.append(this.f);
        sb.append(", isHardcore=");
        sb.append(this.g);
        sb.append(", sessionId=");
        sb.append(this.h);
        sb.append(", localTimestampEpochMs=");
        sb.append(this.i);
        ej6.k(sb, ", offsetFromSessionStartMs=", this.j, ", orderIndex=");
        sb.append(this.k);
        ej6.k(sb, ", ackedSeq=", this.l, ", estimatedPlayDurationMs=");
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

    public ba4(ga4 ga4Var, long j, String str, String str2, long j2, long j3, boolean z, String str3, long j4, long j5, long j6, long j7, long j8, byte[] bArr, jb4 jb4Var, lb4 lb4Var, boolean z2) {
        ga4Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        jb4Var.getClass();
        lb4Var.getClass();
        this.a = ga4Var;
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
        this.o = jb4Var;
        this.p = lb4Var;
        this.q = z2;
    }

    public /* synthetic */ ba4(ga4 ga4Var, String str, String str2, long j, long j2, boolean z, String str3, long j3, long j4, long j5, long j6, long j7, jb4 jb4Var, lb4 lb4Var, boolean z2, int i) {
        this((i & 1) != 0 ? ga4.SESSION_START : ga4Var, 0L, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? 0L : j2, (i & 64) != 0 ? false : z, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? 0L : j3, (i & 512) != 0 ? 0L : j4, (i & 1024) != 0 ? 0L : j5, (i & 2048) != 0 ? 0L : j6, (i & 4096) != 0 ? 0L : j7, new byte[0], (i & 16384) != 0 ? jb4.UNKNOWN : jb4Var, (32768 & i) != 0 ? lb4.UNKNOWN : lb4Var, (i & 65536) != 0 ? false : z2);
    }
}

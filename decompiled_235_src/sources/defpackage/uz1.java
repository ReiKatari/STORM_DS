package defpackage;

import defpackage.sz1;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uz1  reason: default package */
/* loaded from: classes.dex */
public final class uz1 {
    public final sz1.b a;
    public final sz1.d b;
    public final ik4 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final long i;

    public uz1(sz1.b bVar, sz1.d dVar, ik4 ik4Var, boolean z, boolean z2, boolean z3, boolean z4, String str, long j) {
        bVar.getClass();
        dVar.getClass();
        this.a = bVar;
        this.b = dVar;
        this.c = ik4Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str;
        this.i = j;
    }

    public static uz1 a(uz1 uz1Var, sz1.b bVar, sz1.d dVar, ik4 ik4Var, String str, long j, int i) {
        ik4 ik4Var2;
        boolean z;
        boolean z2;
        String str2;
        long j2;
        if ((i & 1) != 0) {
            bVar = uz1Var.a;
        }
        sz1.b bVar2 = bVar;
        if ((i & 2) != 0) {
            dVar = uz1Var.b;
        }
        sz1.d dVar2 = dVar;
        if ((i & 4) != 0) {
            ik4Var2 = uz1Var.c;
        } else {
            ik4Var2 = ik4Var;
        }
        boolean z3 = false;
        if ((i & 8) != 0) {
            z = uz1Var.d;
        } else {
            z = false;
        }
        if ((i & 16) != 0) {
            z3 = uz1Var.e;
        }
        boolean z4 = z3;
        if ((i & 32) != 0) {
            z2 = uz1Var.f;
        } else {
            z2 = true;
        }
        boolean z5 = z2;
        boolean z6 = uz1Var.g;
        if ((i & 128) != 0) {
            str2 = uz1Var.h;
        } else {
            str2 = str;
        }
        if ((i & 256) != 0) {
            j2 = uz1Var.i;
        } else {
            j2 = j;
        }
        uz1Var.getClass();
        bVar2.getClass();
        dVar2.getClass();
        str2.getClass();
        return new uz1(bVar2, dVar2, ik4Var2, z, z4, z5, z6, str2, j2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uz1) {
                uz1 uz1Var = (uz1) obj;
                if (this.a != uz1Var.a || this.b != uz1Var.b || this.c != uz1Var.c || this.d != uz1Var.d || this.e != uz1Var.e || this.f != uz1Var.f || this.g != uz1Var.g || !nb3.k(this.h, uz1Var.h) || this.i != uz1Var.i) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ik4 ik4Var = this.c;
        if (ik4Var == null) {
            hashCode = 0;
        } else {
            hashCode = ik4Var.hashCode();
        }
        return Long.hashCode(this.i) + xg6.d(xg6.e(xg6.e(xg6.e(xg6.e((hashCode2 + hashCode) * 31, this.d, 31), this.e, 31), this.f, 31), this.g, 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RetroAchievementsLaunchDecision(networkMode=");
        sb.append(this.a);
        sb.append(", sessionMode=");
        sb.append(this.b);
        sb.append(", initialOfflineType=");
        sb.append(this.c);
        sb.append(", isHardcoreEligibleAfterOnlineStart=");
        sb.append(this.d);
        sb.append(", offlineDueToNoInternetAtStart=");
        sb.append(this.e);
        sb.append(", hardcoreOfflineDisabled=");
        sb.append(this.f);
        sb.append(", usesProxyBackend=");
        sb.append(this.g);
        sb.append(", nativeClientHost=");
        sb.append(this.h);
        sb.append(", endpointGeneration=");
        return lb1.p(sb, this.i, ")");
    }

    public /* synthetic */ uz1(sz1.b bVar, sz1.d dVar, ik4 ik4Var, boolean z, boolean z2, boolean z3) {
        this(bVar, dVar, ik4Var, z, z2, z3, false, "https://retroachievements.org", 0L);
    }
}

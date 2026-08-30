package defpackage;

import defpackage.hv1;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jv1  reason: default package */
/* loaded from: classes.dex */
public final class jv1 {
    public final hv1.b a;
    public final hv1.d b;
    public final lb4 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final long i;

    public jv1(hv1.b bVar, hv1.d dVar, lb4 lb4Var, boolean z, boolean z2, boolean z3, boolean z4, String str, long j) {
        bVar.getClass();
        dVar.getClass();
        this.a = bVar;
        this.b = dVar;
        this.c = lb4Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str;
        this.i = j;
    }

    public static jv1 a(jv1 jv1Var, hv1.b bVar, hv1.d dVar, lb4 lb4Var, String str, long j, int i) {
        lb4 lb4Var2;
        boolean z;
        boolean z2;
        String str2;
        long j2;
        if ((i & 1) != 0) {
            bVar = jv1Var.a;
        }
        hv1.b bVar2 = bVar;
        if ((i & 2) != 0) {
            dVar = jv1Var.b;
        }
        hv1.d dVar2 = dVar;
        if ((i & 4) != 0) {
            lb4Var2 = jv1Var.c;
        } else {
            lb4Var2 = lb4Var;
        }
        boolean z3 = false;
        if ((i & 8) != 0) {
            z = jv1Var.d;
        } else {
            z = false;
        }
        if ((i & 16) != 0) {
            z3 = jv1Var.e;
        }
        boolean z4 = z3;
        if ((i & 32) != 0) {
            z2 = jv1Var.f;
        } else {
            z2 = true;
        }
        boolean z5 = z2;
        boolean z6 = jv1Var.g;
        if ((i & 128) != 0) {
            str2 = jv1Var.h;
        } else {
            str2 = str;
        }
        if ((i & 256) != 0) {
            j2 = jv1Var.i;
        } else {
            j2 = j;
        }
        jv1Var.getClass();
        bVar2.getClass();
        dVar2.getClass();
        str2.getClass();
        return new jv1(bVar2, dVar2, lb4Var2, z, z4, z5, z6, str2, j2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jv1) {
                jv1 jv1Var = (jv1) obj;
                if (this.a != jv1Var.a || this.b != jv1Var.b || this.c != jv1Var.c || this.d != jv1Var.d || this.e != jv1Var.e || this.f != jv1Var.f || this.g != jv1Var.g || !b53.x(this.h, jv1Var.h) || this.i != jv1Var.i) {
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
        lb4 lb4Var = this.c;
        if (lb4Var == null) {
            hashCode = 0;
        } else {
            hashCode = lb4Var.hashCode();
        }
        return Long.hashCode(this.i) + ej6.b(ej6.c(ej6.c(ej6.c(ej6.c((hashCode2 + hashCode) * 31, this.d, 31), this.e, 31), this.f, 31), this.g, 31), 31, this.h);
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
        return wh1.n(sb, this.i, ")");
    }

    public /* synthetic */ jv1(hv1.b bVar, hv1.d dVar, lb4 lb4Var, boolean z, boolean z2, boolean z3) {
        this(bVar, dVar, lb4Var, z, z2, z3, false, "https://retroachievements.org", 0L);
    }
}

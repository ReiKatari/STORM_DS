package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: b6  reason: default package */
/* loaded from: classes.dex */
public final class b6 {
    public static final b Companion = new Object();
    public static final gh3[] h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final List f;
    public final List g;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @zd1
    /* renamed from: b6$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements kl2 {
        public static final a a;
        private static final h06 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [kl2, java.lang.Object, b6$a] */
        static {
            ?? obj = new Object();
            a = obj;
            hp4 hp4Var = new hp4("me.magnum.rcheevosapi.dto.AchievementSetDto", obj, 7);
            hp4Var.l("Title", false);
            hp4Var.l("Type", false);
            hp4Var.l("AchievementSetId", false);
            hp4Var.l("GameId", false);
            hp4Var.l("ImageIconUrl", false);
            hp4Var.l("Achievements", false);
            hp4Var.l("Leaderboards", false);
            descriptor = hp4Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.kl2
        public final m93[] a() {
            gh3[] gh3VarArr = b6.h;
            yg6 yg6Var = yg6.a;
            as3 as3Var = as3.a;
            return new m93[]{l07.R(yg6Var), yg6Var, as3Var, as3Var, yg6Var, gh3VarArr[5].getValue(), gh3VarArr[6].getValue()};
        }

        @Override // defpackage.m93
        public final Object b(b91 b91Var) {
            h06 h06Var = descriptor;
            yu0 c = b91Var.c(h06Var);
            gh3[] gh3VarArr = b6.h;
            c.getClass();
            List list = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            long j = 0;
            long j2 = 0;
            int i = 0;
            boolean z = true;
            List list2 = null;
            while (z) {
                int v = c.v(h06Var);
                switch (v) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str = (String) c.u(h06Var, 0, yg6.a, str);
                        i |= 1;
                        break;
                    case 1:
                        str2 = c.K(h06Var, 1);
                        i |= 2;
                        break;
                    case 2:
                        j = c.a0(h06Var, 2);
                        i |= 4;
                        break;
                    case 3:
                        j2 = c.a0(h06Var, 3);
                        i |= 8;
                        break;
                    case 4:
                        str3 = c.K(h06Var, 4);
                        i |= 16;
                        break;
                    case 5:
                        list = (List) c.U(h06Var, 5, (m93) gh3VarArr[5].getValue(), list);
                        i |= 32;
                        break;
                    case ig7.b /* 6 */:
                        list2 = (List) c.U(h06Var, 6, (m93) gh3VarArr[6].getValue(), list2);
                        i |= 64;
                        break;
                    default:
                        throw new q27(v);
                }
            }
            c.a(h06Var);
            return new b6(i, j, j2, str, str2, str3, list, list2);
        }

        @Override // defpackage.m93
        public final void d(mz1 mz1Var, Object obj) {
            b6 b6Var = (b6) obj;
            b6Var.getClass();
            h06 h06Var = descriptor;
            zu0 c = mz1Var.c(h06Var);
            gh3[] gh3VarArr = b6.h;
            c.N(h06Var, 0, yg6.a, b6Var.a);
            c.z(h06Var, 1, b6Var.b);
            c.r(h06Var, 2, b6Var.c);
            c.r(h06Var, 3, b6Var.d);
            c.z(h06Var, 4, b6Var.e);
            c.F(h06Var, 5, (m93) gh3VarArr[5].getValue(), b6Var.f);
            c.F(h06Var, 6, (m93) gh3VarArr[6].getValue(), b6Var.g);
            c.a(h06Var);
        }

        @Override // defpackage.m93
        public final h06 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: b6$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final m93 serializer() {
            return a.a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, b6$b] */
    static {
        wk3 wk3Var = wk3.PUBLICATION;
        h = new gh3[]{null, null, null, null, null, yf2.H(wk3Var, new d5(3)), yf2.H(wk3Var, new d5(4))};
    }

    public /* synthetic */ b6(int i, long j, long j2, String str, String str2, String str3, List list, List list2) {
        if (127 == (i & 127)) {
            this.a = str;
            this.b = str2;
            this.c = j;
            this.d = j2;
            this.e = str3;
            this.f = list;
            this.g = list2;
            return;
        }
        ep2.H(i, 127, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj;
        if (b53.x(this.a, b6Var.a) && b53.x(this.b, b6Var.b) && this.c == b6Var.c && this.d == b6Var.d && b53.x(this.e, b6Var.e) && b53.x(this.f, b6Var.f) && b53.x(this.g, b6Var.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.g.hashCode() + b31.b(ej6.b(b31.c(this.d, b31.c(this.c, ej6.b(hashCode * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = b31.v("AchievementSetDto(title=", this.a, ", type=", this.b, ", setId=");
        v.append(this.c);
        ej6.k(v, ", gameId=", this.d, ", iconUrl=");
        v.append(this.e);
        v.append(", achievements=");
        v.append(this.f);
        v.append(", leaderboards=");
        v.append(this.g);
        v.append(")");
        return v.toString();
    }
}

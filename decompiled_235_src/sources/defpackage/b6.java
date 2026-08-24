package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: b6  reason: default package */
/* loaded from: classes.dex */
public final class b6 {
    public static final b Companion = new Object();
    public static final go3[] h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final List f;
    public final List g;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @di1
    /* renamed from: b6$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements qr2 {
        public static final a a;
        private static final wb6 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [qr2, java.lang.Object, b6$a] */
        static {
            ?? obj = new Object();
            a = obj;
            ly4 ly4Var = new ly4("me.magnum.rcheevosapi.dto.AchievementSetDto", obj, 7);
            ly4Var.l("Title", false);
            ly4Var.l("Type", false);
            ly4Var.l("AchievementSetId", false);
            ly4Var.l("GameId", false);
            ly4Var.l("ImageIconUrl", false);
            ly4Var.l("Achievements", false);
            ly4Var.l("Leaderboards", false);
            descriptor = ly4Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qr2
        public final gg3[] b() {
            go3[] go3VarArr = b6.h;
            ps6 ps6Var = ps6.a;
            fz3 fz3Var = fz3.a;
            return new gg3[]{q60.I(ps6Var), ps6Var, fz3Var, fz3Var, ps6Var, go3VarArr[5].getValue(), go3VarArr[6].getValue()};
        }

        @Override // defpackage.gg3
        public final Object c(sc1 sc1Var) {
            wb6 wb6Var = descriptor;
            ux0 c = sc1Var.c(wb6Var);
            go3[] go3VarArr = b6.h;
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
                int q = c.q(wb6Var);
                switch (q) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str = (String) c.P(wb6Var, 0, ps6.a, str);
                        i |= 1;
                        break;
                    case 1:
                        str2 = c.A(wb6Var, 1);
                        i |= 2;
                        break;
                    case 2:
                        j = c.c0(wb6Var, 2);
                        i |= 4;
                        break;
                    case 3:
                        j2 = c.c0(wb6Var, 3);
                        i |= 8;
                        break;
                    case 4:
                        str3 = c.A(wb6Var, 4);
                        i |= 16;
                        break;
                    case 5:
                        list = (List) c.G(wb6Var, 5, (gg3) go3VarArr[5].getValue(), list);
                        i |= 32;
                        break;
                    case 6:
                        list2 = (List) c.G(wb6Var, 6, (gg3) go3VarArr[6].getValue(), list2);
                        i |= 64;
                        break;
                    default:
                        throw new lg7(q);
                }
            }
            c.a(wb6Var);
            return new b6(i, j, j2, str, str2, str3, list, list2);
        }

        @Override // defpackage.gg3
        public final void d(x32 x32Var, Object obj) {
            b6 b6Var = (b6) obj;
            b6Var.getClass();
            wb6 wb6Var = descriptor;
            vx0 c = x32Var.c(wb6Var);
            go3[] go3VarArr = b6.h;
            c.V(wb6Var, 0, ps6.a, b6Var.a);
            c.Q(wb6Var, 1, b6Var.b);
            c.n(wb6Var, 2, b6Var.c);
            c.n(wb6Var, 3, b6Var.d);
            c.Q(wb6Var, 4, b6Var.e);
            c.w(wb6Var, 5, (gg3) go3VarArr[5].getValue(), b6Var.f);
            c.w(wb6Var, 6, (gg3) go3VarArr[6].getValue(), b6Var.g);
            c.a(wb6Var);
        }

        @Override // defpackage.gg3
        public final wb6 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: b6$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final gg3 serializer() {
            return a.a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, b6$b] */
    static {
        xr3 xr3Var = xr3.PUBLICATION;
        h = new go3[]{null, null, null, null, null, kj2.M(xr3Var, new c5(3)), kj2.M(xr3Var, new c5(4))};
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
        ii2.S(i, 127, a.a.e());
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
        if (nb3.k(this.a, b6Var.a) && nb3.k(this.b, b6Var.b) && this.c == b6Var.c && this.d == b6Var.d && nb3.k(this.e, b6Var.e) && nb3.k(this.f, b6Var.f) && nb3.k(this.g, b6Var.g)) {
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
        return this.g.hashCode() + i61.b(xg6.d(i61.c(this.d, i61.c(this.c, xg6.d(hashCode * 31, 31, this.b), 31), 31), 31, this.e), this.f, 31);
    }

    public final String toString() {
        StringBuilder u = i61.u("AchievementSetDto(title=", this.a, ", type=", this.b, ", setId=");
        u.append(this.c);
        xg6.B(u, ", gameId=", this.d, ", iconUrl=");
        u.append(this.e);
        u.append(", achievements=");
        u.append(this.f);
        u.append(", leaderboards=");
        u.append(this.g);
        u.append(")");
        return u.toString();
    }
}

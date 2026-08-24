package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: fp2  reason: default package */
/* loaded from: classes.dex */
public final class fp2 {
    public static final b Companion = new Object();
    public static final go3[] g = {null, null, null, null, null, kj2.M(xr3.PUBLICATION, new ns1(5))};
    public final long a;
    public final String b;
    public final String c;
    public final Long d;
    public final String e;
    public final List f;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @di1
    /* renamed from: fp2$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements qr2 {
        public static final a a;
        private static final wb6 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [qr2, fp2$a, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            ly4 ly4Var = new ly4("me.magnum.rcheevosapi.dto.GameAchievementSetsDto", obj, 6);
            ly4Var.l("GameId", false);
            ly4Var.l("Title", false);
            ly4Var.l("ImageIconUrl", false);
            ly4Var.l("RichPresenceGameId", false);
            ly4Var.l("RichPresencePatch", false);
            ly4Var.l("Sets", false);
            descriptor = ly4Var;
        }

        @Override // defpackage.qr2
        public final gg3[] b() {
            go3[] go3VarArr = fp2.g;
            fz3 fz3Var = fz3.a;
            ps6 ps6Var = ps6.a;
            return new gg3[]{fz3Var, ps6Var, ps6Var, q60.I(fz3Var), q60.I(ps6Var), q60.I((gg3) go3VarArr[5].getValue())};
        }

        @Override // defpackage.gg3
        public final Object c(sc1 sc1Var) {
            wb6 wb6Var = descriptor;
            ux0 c = sc1Var.c(wb6Var);
            go3[] go3VarArr = fp2.g;
            c.getClass();
            List list = null;
            int i = 0;
            long j = 0;
            String str = null;
            String str2 = null;
            Long l = null;
            String str3 = null;
            boolean z = true;
            while (z) {
                int q = c.q(wb6Var);
                switch (q) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        j = c.c0(wb6Var, 0);
                        i |= 1;
                        break;
                    case 1:
                        str = c.A(wb6Var, 1);
                        i |= 2;
                        break;
                    case 2:
                        str2 = c.A(wb6Var, 2);
                        i |= 4;
                        break;
                    case 3:
                        l = (Long) c.P(wb6Var, 3, fz3.a, l);
                        i |= 8;
                        break;
                    case 4:
                        str3 = (String) c.P(wb6Var, 4, ps6.a, str3);
                        i |= 16;
                        break;
                    case 5:
                        list = (List) c.P(wb6Var, 5, (gg3) go3VarArr[5].getValue(), list);
                        i |= 32;
                        break;
                    default:
                        throw new lg7(q);
                }
            }
            c.a(wb6Var);
            return new fp2(i, j, str, str2, l, str3, list);
        }

        @Override // defpackage.gg3
        public final void d(x32 x32Var, Object obj) {
            fp2 fp2Var = (fp2) obj;
            fp2Var.getClass();
            wb6 wb6Var = descriptor;
            vx0 c = x32Var.c(wb6Var);
            go3[] go3VarArr = fp2.g;
            c.n(wb6Var, 0, fp2Var.a);
            c.Q(wb6Var, 1, fp2Var.b);
            c.Q(wb6Var, 2, fp2Var.c);
            c.V(wb6Var, 3, fz3.a, fp2Var.d);
            c.V(wb6Var, 4, ps6.a, fp2Var.e);
            c.V(wb6Var, 5, (gg3) go3VarArr[5].getValue(), fp2Var.f);
            c.a(wb6Var);
        }

        @Override // defpackage.gg3
        public final wb6 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: fp2$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final gg3 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ fp2(int i, long j, String str, String str2, Long l, String str3, List list) {
        if (63 == (i & 63)) {
            this.a = j;
            this.b = str;
            this.c = str2;
            this.d = l;
            this.e = str3;
            this.f = list;
            return;
        }
        ii2.S(i, 63, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp2)) {
            return false;
        }
        fp2 fp2Var = (fp2) obj;
        if (this.a == fp2Var.a && nb3.k(this.b, fp2Var.b) && nb3.k(this.c, fp2Var.c) && nb3.k(this.d, fp2Var.d) && nb3.k(this.e, fp2Var.e) && nb3.k(this.f, fp2Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int d = xg6.d(xg6.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        Long l = this.d;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (d + hashCode) * 31;
        String str = this.e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List list = this.f;
        if (list != null) {
            i = list.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "GameAchievementSetsDto(id=" + this.a + ", title=" + this.b + ", iconUrl=" + this.c + ", richPresenceGameId=" + this.d + ", richPresencePatch=" + this.e + ", sets=" + this.f + ")";
    }
}

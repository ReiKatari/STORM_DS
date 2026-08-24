package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: ua5  reason: default package */
/* loaded from: classes.dex */
public final class ua5 {
    public static final b Companion = new Object();
    public static final go3[] d = {null, kj2.M(xr3.PUBLICATION, new pi3(27)), null};
    public final String a;
    public final List b;
    public final int c;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @di1
    /* renamed from: ua5$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements qr2 {
        public static final a a;
        private static final wb6 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [qr2, java.lang.Object, ua5$a] */
        static {
            ?? obj = new Object();
            a = obj;
            ly4 ly4Var = new ly4("me.magnum.rcheevosapi.dto.RALeaderboardDataDto", obj, 3);
            ly4Var.l("LBFormat", false);
            ly4Var.l("Entries", false);
            ly4Var.l("TotalEntries", false);
            descriptor = ly4Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qr2
        public final gg3[] b() {
            return new gg3[]{ps6.a, ua5.d[1].getValue(), rd2.a};
        }

        @Override // defpackage.gg3
        public final Object c(sc1 sc1Var) {
            wb6 wb6Var = descriptor;
            ux0 c = sc1Var.c(wb6Var);
            go3[] go3VarArr = ua5.d;
            c.getClass();
            String str = null;
            boolean z = true;
            int i = 0;
            int i2 = 0;
            List list = null;
            while (z) {
                int q = c.q(wb6Var);
                if (q != -1) {
                    if (q != 0) {
                        if (q != 1) {
                            if (q == 2) {
                                i2 = ((Number) c.G(wb6Var, 2, rd2.a, Integer.valueOf(i2))).intValue();
                                i |= 4;
                            } else {
                                throw new lg7(q);
                            }
                        } else {
                            list = (List) c.G(wb6Var, 1, (gg3) go3VarArr[1].getValue(), list);
                            i |= 2;
                        }
                    } else {
                        str = c.A(wb6Var, 0);
                        i |= 1;
                    }
                } else {
                    z = false;
                }
            }
            c.a(wb6Var);
            return new ua5(i, str, list, i2);
        }

        @Override // defpackage.gg3
        public final void d(x32 x32Var, Object obj) {
            ua5 ua5Var = (ua5) obj;
            ua5Var.getClass();
            wb6 wb6Var = descriptor;
            vx0 c = x32Var.c(wb6Var);
            go3[] go3VarArr = ua5.d;
            c.Q(wb6Var, 0, ua5Var.a);
            c.w(wb6Var, 1, (gg3) go3VarArr[1].getValue(), ua5Var.b);
            c.w(wb6Var, 2, rd2.a, Integer.valueOf(ua5Var.c));
            c.a(wb6Var);
        }

        @Override // defpackage.gg3
        public final wb6 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: ua5$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final gg3 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ ua5(int i, String str, List list, int i2) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = list;
            this.c = i2;
            return;
        }
        ii2.S(i, 7, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua5)) {
            return false;
        }
        ua5 ua5Var = (ua5) obj;
        if (nb3.k(this.a, ua5Var.a) && nb3.k(this.b, ua5Var.b) && this.c == ua5Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + i61.b(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RALeaderboardDataDto(format=");
        sb.append(this.a);
        sb.append(", entries=");
        sb.append(this.b);
        sb.append(", totalEntries=");
        return lb1.o(sb, this.c, ")");
    }
}

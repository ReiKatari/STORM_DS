package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: wa5  reason: default package */
/* loaded from: classes.dex */
public final class wa5 {
    public static final b Companion = new Object();
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final String e;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @di1
    /* renamed from: wa5$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements qr2 {
        public static final a a;
        private static final wb6 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [qr2, wa5$a, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            ly4 ly4Var = new ly4("me.magnum.rcheevosapi.dto.RALeaderboardEntryDto", obj, 5);
            ly4Var.l("User", false);
            ly4Var.l("Rank", false);
            ly4Var.l("Score", false);
            ly4Var.l("DateSubmitted", false);
            ly4Var.l("AvatarUrl", true);
            descriptor = ly4Var;
        }

        @Override // defpackage.qr2
        public final gg3[] b() {
            ps6 ps6Var = ps6.a;
            gg3 I = q60.I(ps6Var);
            o93 o93Var = o93.a;
            return new gg3[]{ps6Var, o93Var, o93Var, fz3.a, I};
        }

        @Override // defpackage.gg3
        public final Object c(sc1 sc1Var) {
            wb6 wb6Var = descriptor;
            ux0 c = sc1Var.c(wb6Var);
            c.getClass();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            String str = null;
            String str2 = null;
            long j = 0;
            boolean z = true;
            while (z) {
                int q = c.q(wb6Var);
                if (q != -1) {
                    if (q != 0) {
                        if (q != 1) {
                            if (q != 2) {
                                if (q != 3) {
                                    if (q == 4) {
                                        str2 = (String) c.P(wb6Var, 4, ps6.a, str2);
                                        i |= 16;
                                    } else {
                                        throw new lg7(q);
                                    }
                                } else {
                                    j = c.c0(wb6Var, 3);
                                    i |= 8;
                                }
                            } else {
                                i3 = c.H(wb6Var, 2);
                                i |= 4;
                            }
                        } else {
                            i2 = c.H(wb6Var, 1);
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
            return new wa5(i, str, i2, i3, j, str2);
        }

        @Override // defpackage.gg3
        public final void d(x32 x32Var, Object obj) {
            wa5 wa5Var = (wa5) obj;
            wa5Var.getClass();
            wb6 wb6Var = descriptor;
            vx0 c = x32Var.c(wb6Var);
            String str = wa5Var.a;
            String str2 = wa5Var.e;
            c.Q(wb6Var, 0, str);
            c.O(1, wa5Var.b, wb6Var);
            c.O(2, wa5Var.c, wb6Var);
            c.n(wb6Var, 3, wa5Var.d);
            if (c.i(wb6Var) || str2 != null) {
                c.V(wb6Var, 4, ps6.a, str2);
            }
            c.a(wb6Var);
        }

        @Override // defpackage.gg3
        public final wb6 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: wa5$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final gg3 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ wa5(int i, String str, int i2, int i3, long j, String str2) {
        if (15 == (i & 15)) {
            this.a = str;
            this.b = i2;
            this.c = i3;
            this.d = j;
            if ((i & 16) == 0) {
                this.e = null;
                return;
            } else {
                this.e = str2;
                return;
            }
        }
        ii2.S(i, 15, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa5)) {
            return false;
        }
        wa5 wa5Var = (wa5) obj;
        if (nb3.k(this.a, wa5Var.a) && this.b == wa5Var.b && this.c == wa5Var.c && this.d == wa5Var.d && nb3.k(this.e, wa5Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c = i61.c(this.d, lb1.a(this.c, lb1.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return c + hashCode;
    }

    public final String toString() {
        return "RALeaderboardEntryDto(user=" + this.a + ", rank=" + this.b + ", score=" + this.c + ", dateSubmitted=" + this.d + ", avatarUrl=" + this.e + ")";
    }
}

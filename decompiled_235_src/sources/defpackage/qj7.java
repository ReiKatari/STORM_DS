package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: qj7  reason: default package */
/* loaded from: classes.dex */
public final class qj7 {
    public static final b Companion = new Object();
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @di1
    /* renamed from: qj7$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements qr2 {
        public static final a a;
        private static final wb6 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [qr2, qj7$a, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            ly4 ly4Var = new ly4("me.magnum.rcheevosapi.dto.UserLoginDto", obj, 4);
            ly4Var.l("User", false);
            ly4Var.l("Token", false);
            ly4Var.l("Score", false);
            ly4Var.l("SoftcoreScore", false);
            descriptor = ly4Var;
        }

        @Override // defpackage.qr2
        public final gg3[] b() {
            ps6 ps6Var = ps6.a;
            fz3 fz3Var = fz3.a;
            return new gg3[]{ps6Var, ps6Var, fz3Var, fz3Var};
        }

        @Override // defpackage.gg3
        public final Object c(sc1 sc1Var) {
            wb6 wb6Var = descriptor;
            ux0 c = sc1Var.c(wb6Var);
            c.getClass();
            int i = 0;
            String str = null;
            String str2 = null;
            long j = 0;
            long j2 = 0;
            boolean z = true;
            while (z) {
                int q = c.q(wb6Var);
                if (q != -1) {
                    if (q != 0) {
                        if (q != 1) {
                            if (q != 2) {
                                if (q == 3) {
                                    j2 = c.c0(wb6Var, 3);
                                    i |= 8;
                                } else {
                                    throw new lg7(q);
                                }
                            } else {
                                j = c.c0(wb6Var, 2);
                                i |= 4;
                            }
                        } else {
                            str2 = c.A(wb6Var, 1);
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
            return new qj7(i, str, str2, j, j2);
        }

        @Override // defpackage.gg3
        public final void d(x32 x32Var, Object obj) {
            qj7 qj7Var = (qj7) obj;
            qj7Var.getClass();
            wb6 wb6Var = descriptor;
            vx0 c = x32Var.c(wb6Var);
            c.Q(wb6Var, 0, qj7Var.a);
            c.Q(wb6Var, 1, qj7Var.b);
            c.n(wb6Var, 2, qj7Var.c);
            c.n(wb6Var, 3, qj7Var.d);
            c.a(wb6Var);
        }

        @Override // defpackage.gg3
        public final wb6 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: qj7$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final gg3 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ qj7(int i, String str, String str2, long j, long j2) {
        if (15 == (i & 15)) {
            this.a = str;
            this.b = str2;
            this.c = j;
            this.d = j2;
            return;
        }
        ii2.S(i, 15, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj7)) {
            return false;
        }
        qj7 qj7Var = (qj7) obj;
        if (nb3.k(this.a, qj7Var.a) && nb3.k(this.b, qj7Var.b) && this.c == qj7Var.c && this.d == qj7Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + i61.c(this.c, xg6.d(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder u = i61.u("UserLoginDto(user=", this.a, ", token=", this.b, ", score=");
        u.append(this.c);
        return lb1.r(u, ", softcoreScore=", this.d, ")");
    }
}

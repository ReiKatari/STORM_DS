package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: os3  reason: default package */
/* loaded from: classes.dex */
public final class os3 {
    public static final b Companion = new Object();
    public final long a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @di1
    /* renamed from: os3$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements qr2 {
        public static final a a;
        private static final wb6 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [qr2, java.lang.Object, os3$a] */
        static {
            ?? obj = new Object();
            a = obj;
            ly4 ly4Var = new ly4("me.magnum.rcheevosapi.dto.LeaderboardDto", obj, 7);
            ly4Var.l("ID", false);
            ly4Var.l("Mem", false);
            ly4Var.l("Format", false);
            ly4Var.l("LowerIsBetter", false);
            ly4Var.l("Title", false);
            ly4Var.l("Description", false);
            ly4Var.l("Hidden", false);
            descriptor = ly4Var;
        }

        @Override // defpackage.qr2
        public final gg3[] b() {
            ps6 ps6Var = ps6.a;
            u50 u50Var = u50.a;
            return new gg3[]{fz3.a, ps6Var, ps6Var, u50Var, ps6Var, ps6Var, u50Var};
        }

        @Override // defpackage.gg3
        public final Object c(sc1 sc1Var) {
            wb6 wb6Var = descriptor;
            ux0 c = sc1Var.c(wb6Var);
            c.getClass();
            int i = 0;
            boolean z = false;
            boolean z2 = false;
            long j = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            boolean z3 = true;
            while (z3) {
                int q = c.q(wb6Var);
                switch (q) {
                    case -1:
                        z3 = false;
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
                        z = c.W(wb6Var, 3);
                        i |= 8;
                        break;
                    case 4:
                        str3 = c.A(wb6Var, 4);
                        i |= 16;
                        break;
                    case 5:
                        str4 = c.A(wb6Var, 5);
                        i |= 32;
                        break;
                    case 6:
                        z2 = c.W(wb6Var, 6);
                        i |= 64;
                        break;
                    default:
                        throw new lg7(q);
                }
            }
            c.a(wb6Var);
            return new os3(i, j, str, str2, z, str3, str4, z2);
        }

        @Override // defpackage.gg3
        public final void d(x32 x32Var, Object obj) {
            os3 os3Var = (os3) obj;
            os3Var.getClass();
            wb6 wb6Var = descriptor;
            vx0 c = x32Var.c(wb6Var);
            c.n(wb6Var, 0, os3Var.a);
            c.Q(wb6Var, 1, os3Var.b);
            c.Q(wb6Var, 2, os3Var.c);
            c.u(wb6Var, 3, os3Var.d);
            c.Q(wb6Var, 4, os3Var.e);
            c.Q(wb6Var, 5, os3Var.f);
            c.u(wb6Var, 6, os3Var.g);
            c.a(wb6Var);
        }

        @Override // defpackage.gg3
        public final wb6 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: os3$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final gg3 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ os3(int i, long j, String str, String str2, boolean z, String str3, String str4, boolean z2) {
        if (127 == (i & 127)) {
            this.a = j;
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = str3;
            this.f = str4;
            this.g = z2;
            return;
        }
        ii2.S(i, 127, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os3)) {
            return false;
        }
        os3 os3Var = (os3) obj;
        if (this.a == os3Var.a && nb3.k(this.b, os3Var.b) && nb3.k(this.c, os3Var.c) && this.d == os3Var.d && nb3.k(this.e, os3Var.e) && nb3.k(this.f, os3Var.f) && this.g == os3Var.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xg6.d(xg6.d(xg6.e(xg6.d(xg6.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardDto(id=");
        sb.append(this.a);
        sb.append(", mem=");
        sb.append(this.b);
        sb.append(", format=");
        sb.append(this.c);
        sb.append(", lowerIsBetter=");
        sb.append(this.d);
        i61.B(sb, ", title=", this.e, ", description=", this.f);
        sb.append(", hidden=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}

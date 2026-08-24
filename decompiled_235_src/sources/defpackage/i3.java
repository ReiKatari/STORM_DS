package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: i3  reason: default package */
/* loaded from: classes.dex */
public final class i3 {
    public static final b Companion = new Object();
    public final long a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @di1
    /* renamed from: i3$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements qr2 {
        public static final a a;
        private static final wb6 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [qr2, i3$a, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            ly4 ly4Var = new ly4("me.magnum.rcheevosapi.dto.AchievementDto", obj, 11);
            ly4Var.l("ID", false);
            ly4Var.l("NumAwarded", false);
            ly4Var.l("NumAwardedHardcore", false);
            ly4Var.l("Title", false);
            ly4Var.l("Description", false);
            ly4Var.l("Points", false);
            ly4Var.l("Flags", false);
            ly4Var.l("BadgeURL", false);
            ly4Var.l("BadgeLockedURL", false);
            ly4Var.l("DisplayOrder", false);
            ly4Var.l("MemAddr", false);
            descriptor = ly4Var;
        }

        @Override // defpackage.qr2
        public final gg3[] b() {
            o93 o93Var = o93.a;
            gg3 I = q60.I(o93Var);
            gg3 I2 = q60.I(o93Var);
            ps6 ps6Var = ps6.a;
            return new gg3[]{fz3.a, I, I2, ps6Var, ps6Var, o93Var, o93Var, ps6Var, ps6Var, q60.I(ps6Var), ps6Var};
        }

        @Override // defpackage.gg3
        public final Object c(sc1 sc1Var) {
            wb6 wb6Var = descriptor;
            ux0 c = sc1Var.c(wb6Var);
            c.getClass();
            String str = null;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            long j = 0;
            Integer num = null;
            Integer num2 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
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
                        num = (Integer) c.P(wb6Var, 1, o93.a, num);
                        i |= 2;
                        break;
                    case 2:
                        num2 = (Integer) c.P(wb6Var, 2, o93.a, num2);
                        i |= 4;
                        break;
                    case 3:
                        str2 = c.A(wb6Var, 3);
                        i |= 8;
                        break;
                    case 4:
                        str3 = c.A(wb6Var, 4);
                        i |= 16;
                        break;
                    case 5:
                        i2 = c.H(wb6Var, 5);
                        i |= 32;
                        break;
                    case 6:
                        i3 = c.H(wb6Var, 6);
                        i |= 64;
                        break;
                    case 7:
                        str4 = c.A(wb6Var, 7);
                        i |= 128;
                        break;
                    case 8:
                        str5 = c.A(wb6Var, 8);
                        i |= 256;
                        break;
                    case 9:
                        str = (String) c.P(wb6Var, 9, ps6.a, str);
                        i |= 512;
                        break;
                    case 10:
                        str6 = c.A(wb6Var, 10);
                        i |= 1024;
                        break;
                    default:
                        throw new lg7(q);
                }
            }
            c.a(wb6Var);
            return new i3(i, j, num, num2, str2, str3, i2, i3, str4, str5, str, str6);
        }

        @Override // defpackage.gg3
        public final void d(x32 x32Var, Object obj) {
            i3 i3Var = (i3) obj;
            i3Var.getClass();
            wb6 wb6Var = descriptor;
            vx0 c = x32Var.c(wb6Var);
            c.n(wb6Var, 0, i3Var.a);
            o93 o93Var = o93.a;
            c.V(wb6Var, 1, o93Var, i3Var.b);
            c.V(wb6Var, 2, o93Var, i3Var.c);
            c.Q(wb6Var, 3, i3Var.d);
            c.Q(wb6Var, 4, i3Var.e);
            c.O(5, i3Var.f, wb6Var);
            c.O(6, i3Var.g, wb6Var);
            c.Q(wb6Var, 7, i3Var.h);
            c.Q(wb6Var, 8, i3Var.i);
            c.V(wb6Var, 9, ps6.a, i3Var.j);
            c.Q(wb6Var, 10, i3Var.k);
            c.a(wb6Var);
        }

        @Override // defpackage.gg3
        public final wb6 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: i3$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final gg3 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ i3(int i, long j, Integer num, Integer num2, String str, String str2, int i2, int i3, String str3, String str4, String str5, String str6) {
        if (2047 == (i & 2047)) {
            this.a = j;
            this.b = num;
            this.c = num2;
            this.d = str;
            this.e = str2;
            this.f = i2;
            this.g = i3;
            this.h = str3;
            this.i = str4;
            this.j = str5;
            this.k = str6;
            return;
        }
        ii2.S(i, 2047, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        if (this.a == i3Var.a && nb3.k(this.b, i3Var.b) && nb3.k(this.c, i3Var.c) && nb3.k(this.d, i3Var.d) && nb3.k(this.e, i3Var.e) && this.f == i3Var.f && this.g == i3Var.g && nb3.k(this.h, i3Var.h) && nb3.k(this.i, i3Var.i) && nb3.k(this.j, i3Var.j) && nb3.k(this.k, i3Var.k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = Long.hashCode(this.a) * 31;
        int i = 0;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Integer num2 = this.c;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int d = xg6.d(xg6.d(lb1.a(this.g, lb1.a(this.f, xg6.d(xg6.d((i2 + hashCode2) * 31, 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i);
        String str = this.j;
        if (str != null) {
            i = str.hashCode();
        }
        return this.k.hashCode() + ((d + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AchievementDto(id=");
        sb.append(this.a);
        sb.append(", numAwarded=");
        sb.append(this.b);
        sb.append(", numAwardedHardcore=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", points=");
        sb.append(this.f);
        sb.append(", flags=");
        sb.append(this.g);
        sb.append(", badgeUrl=");
        sb.append(this.h);
        i61.B(sb, ", badgeUrlLocked=", this.i, ", displayOrder=", this.j);
        sb.append(", memoryAddress=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}

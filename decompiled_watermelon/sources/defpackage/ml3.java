package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: ml3  reason: default package */
/* loaded from: classes.dex */
public final class ml3 {
    public static final b Companion = new Object();
    public final long a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @zd1
    /* renamed from: ml3$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements kl2 {
        public static final a a;
        private static final h06 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [ml3$a, kl2, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            hp4 hp4Var = new hp4("me.magnum.rcheevosapi.dto.LeaderboardDto", obj, 7);
            hp4Var.l("ID", false);
            hp4Var.l("Mem", false);
            hp4Var.l("Format", false);
            hp4Var.l("LowerIsBetter", false);
            hp4Var.l("Title", false);
            hp4Var.l("Description", false);
            hp4Var.l("Hidden", false);
            descriptor = hp4Var;
        }

        @Override // defpackage.kl2
        public final m93[] a() {
            yg6 yg6Var = yg6.a;
            w30 w30Var = w30.a;
            return new m93[]{as3.a, yg6Var, yg6Var, w30Var, yg6Var, yg6Var, w30Var};
        }

        @Override // defpackage.m93
        public final Object b(b91 b91Var) {
            h06 h06Var = descriptor;
            yu0 c = b91Var.c(h06Var);
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
                int v = c.v(h06Var);
                switch (v) {
                    case -1:
                        z3 = false;
                        break;
                    case 0:
                        j = c.a0(h06Var, 0);
                        i |= 1;
                        break;
                    case 1:
                        str = c.K(h06Var, 1);
                        i |= 2;
                        break;
                    case 2:
                        str2 = c.K(h06Var, 2);
                        i |= 4;
                        break;
                    case 3:
                        z = c.O(h06Var, 3);
                        i |= 8;
                        break;
                    case 4:
                        str3 = c.K(h06Var, 4);
                        i |= 16;
                        break;
                    case 5:
                        str4 = c.K(h06Var, 5);
                        i |= 32;
                        break;
                    case ig7.b /* 6 */:
                        z2 = c.O(h06Var, 6);
                        i |= 64;
                        break;
                    default:
                        throw new q27(v);
                }
            }
            c.a(h06Var);
            return new ml3(i, j, str, str2, z, str3, str4, z2);
        }

        @Override // defpackage.m93
        public final void d(mz1 mz1Var, Object obj) {
            ml3 ml3Var = (ml3) obj;
            ml3Var.getClass();
            h06 h06Var = descriptor;
            zu0 c = mz1Var.c(h06Var);
            c.r(h06Var, 0, ml3Var.a);
            c.z(h06Var, 1, ml3Var.b);
            c.z(h06Var, 2, ml3Var.c);
            c.A(h06Var, 3, ml3Var.d);
            c.z(h06Var, 4, ml3Var.e);
            c.z(h06Var, 5, ml3Var.f);
            c.A(h06Var, 6, ml3Var.g);
            c.a(h06Var);
        }

        @Override // defpackage.m93
        public final h06 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: ml3$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final m93 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ ml3(int i, long j, String str, String str2, boolean z, String str3, String str4, boolean z2) {
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
        ep2.H(i, 127, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml3)) {
            return false;
        }
        ml3 ml3Var = (ml3) obj;
        if (this.a == ml3Var.a && b53.x(this.b, ml3Var.b) && b53.x(this.c, ml3Var.c) && this.d == ml3Var.d && b53.x(this.e, ml3Var.e) && b53.x(this.f, ml3Var.f) && this.g == ml3Var.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ej6.b(ej6.b(ej6.c(ej6.b(ej6.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31), 31, this.e), 31, this.f);
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
        b31.B(sb, ", title=", this.e, ", description=", this.f);
        sb.append(", hidden=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}

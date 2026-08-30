package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: g3  reason: default package */
/* loaded from: classes.dex */
public final class g3 {
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

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @zd1
    /* renamed from: g3$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements kl2 {
        public static final a a;
        private static final h06 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [kl2, g3$a, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            hp4 hp4Var = new hp4("me.magnum.rcheevosapi.dto.AchievementDto", obj, 11);
            hp4Var.l("ID", false);
            hp4Var.l("NumAwarded", false);
            hp4Var.l("NumAwardedHardcore", false);
            hp4Var.l("Title", false);
            hp4Var.l("Description", false);
            hp4Var.l("Points", false);
            hp4Var.l("Flags", false);
            hp4Var.l("BadgeURL", false);
            hp4Var.l("BadgeLockedURL", false);
            hp4Var.l("DisplayOrder", false);
            hp4Var.l("MemAddr", false);
            descriptor = hp4Var;
        }

        @Override // defpackage.kl2
        public final m93[] a() {
            g33 g33Var = g33.a;
            m93 R = l07.R(g33Var);
            m93 R2 = l07.R(g33Var);
            yg6 yg6Var = yg6.a;
            return new m93[]{as3.a, R, R2, yg6Var, yg6Var, g33Var, g33Var, yg6Var, yg6Var, l07.R(yg6Var), yg6Var};
        }

        @Override // defpackage.m93
        public final Object b(b91 b91Var) {
            h06 h06Var = descriptor;
            yu0 c = b91Var.c(h06Var);
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
                int v = c.v(h06Var);
                switch (v) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        j = c.a0(h06Var, 0);
                        i |= 1;
                        break;
                    case 1:
                        num = (Integer) c.u(h06Var, 1, g33.a, num);
                        i |= 2;
                        break;
                    case 2:
                        num2 = (Integer) c.u(h06Var, 2, g33.a, num2);
                        i |= 4;
                        break;
                    case 3:
                        str2 = c.K(h06Var, 3);
                        i |= 8;
                        break;
                    case 4:
                        str3 = c.K(h06Var, 4);
                        i |= 16;
                        break;
                    case 5:
                        i2 = c.V(h06Var, 5);
                        i |= 32;
                        break;
                    case ig7.b /* 6 */:
                        i3 = c.V(h06Var, 6);
                        i |= 64;
                        break;
                    case 7:
                        str4 = c.K(h06Var, 7);
                        i |= 128;
                        break;
                    case 8:
                        str5 = c.K(h06Var, 8);
                        i |= 256;
                        break;
                    case 9:
                        str = (String) c.u(h06Var, 9, yg6.a, str);
                        i |= 512;
                        break;
                    case 10:
                        str6 = c.K(h06Var, 10);
                        i |= 1024;
                        break;
                    default:
                        throw new q27(v);
                }
            }
            c.a(h06Var);
            return new g3(i, j, num, num2, str2, str3, i2, i3, str4, str5, str, str6);
        }

        @Override // defpackage.m93
        public final void d(mz1 mz1Var, Object obj) {
            g3 g3Var = (g3) obj;
            g3Var.getClass();
            h06 h06Var = descriptor;
            zu0 c = mz1Var.c(h06Var);
            c.r(h06Var, 0, g3Var.a);
            g33 g33Var = g33.a;
            c.N(h06Var, 1, g33Var, g3Var.b);
            c.N(h06Var, 2, g33Var, g3Var.c);
            c.z(h06Var, 3, g3Var.d);
            c.z(h06Var, 4, g3Var.e);
            c.q(5, g3Var.f, h06Var);
            c.q(6, g3Var.g, h06Var);
            c.z(h06Var, 7, g3Var.h);
            c.z(h06Var, 8, g3Var.i);
            c.N(h06Var, 9, yg6.a, g3Var.j);
            c.z(h06Var, 10, g3Var.k);
            c.a(h06Var);
        }

        @Override // defpackage.m93
        public final h06 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: g3$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final m93 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ g3(int i, long j, Integer num, Integer num2, String str, String str2, int i2, int i3, String str3, String str4, String str5, String str6) {
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
        ep2.H(i, 2047, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj;
        if (this.a == g3Var.a && b53.x(this.b, g3Var.b) && b53.x(this.c, g3Var.c) && b53.x(this.d, g3Var.d) && b53.x(this.e, g3Var.e) && this.f == g3Var.f && this.g == g3Var.g && b53.x(this.h, g3Var.h) && b53.x(this.i, g3Var.i) && b53.x(this.j, g3Var.j) && b53.x(this.k, g3Var.k)) {
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
        int b2 = ej6.b(ej6.b(wh1.a(this.g, wh1.a(this.f, ej6.b(ej6.b((i2 + hashCode2) * 31, 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i);
        String str = this.j;
        if (str != null) {
            i = str.hashCode();
        }
        return this.k.hashCode() + ((b2 + i) * 31);
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
        b31.B(sb, ", badgeUrlLocked=", this.i, ", displayOrder=", this.j);
        sb.append(", memoryAddress=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}

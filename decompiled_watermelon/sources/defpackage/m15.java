package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: m15  reason: default package */
/* loaded from: classes.dex */
public final class m15 {
    public static final b Companion = new Object();
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final String e;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @zd1
    /* renamed from: m15$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements kl2 {
        public static final a a;
        private static final h06 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [kl2, m15$a, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            hp4 hp4Var = new hp4("me.magnum.rcheevosapi.dto.RALeaderboardEntryDto", obj, 5);
            hp4Var.l("User", false);
            hp4Var.l("Rank", false);
            hp4Var.l("Score", false);
            hp4Var.l("DateSubmitted", false);
            hp4Var.l("AvatarUrl", true);
            descriptor = hp4Var;
        }

        @Override // defpackage.kl2
        public final m93[] a() {
            yg6 yg6Var = yg6.a;
            m93 R = l07.R(yg6Var);
            g33 g33Var = g33.a;
            return new m93[]{yg6Var, g33Var, g33Var, as3.a, R};
        }

        @Override // defpackage.m93
        public final Object b(b91 b91Var) {
            h06 h06Var = descriptor;
            yu0 c = b91Var.c(h06Var);
            c.getClass();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            String str = null;
            String str2 = null;
            long j = 0;
            boolean z = true;
            while (z) {
                int v = c.v(h06Var);
                if (v != -1) {
                    if (v != 0) {
                        if (v != 1) {
                            if (v != 2) {
                                if (v != 3) {
                                    if (v == 4) {
                                        str2 = (String) c.u(h06Var, 4, yg6.a, str2);
                                        i |= 16;
                                    } else {
                                        throw new q27(v);
                                    }
                                } else {
                                    j = c.a0(h06Var, 3);
                                    i |= 8;
                                }
                            } else {
                                i3 = c.V(h06Var, 2);
                                i |= 4;
                            }
                        } else {
                            i2 = c.V(h06Var, 1);
                            i |= 2;
                        }
                    } else {
                        str = c.K(h06Var, 0);
                        i |= 1;
                    }
                } else {
                    z = false;
                }
            }
            c.a(h06Var);
            return new m15(i, str, i2, i3, j, str2);
        }

        @Override // defpackage.m93
        public final void d(mz1 mz1Var, Object obj) {
            m15 m15Var = (m15) obj;
            m15Var.getClass();
            h06 h06Var = descriptor;
            zu0 c = mz1Var.c(h06Var);
            String str = m15Var.a;
            String str2 = m15Var.e;
            c.z(h06Var, 0, str);
            c.q(1, m15Var.b, h06Var);
            c.q(2, m15Var.c, h06Var);
            c.r(h06Var, 3, m15Var.d);
            if (c.k(h06Var) || str2 != null) {
                c.N(h06Var, 4, yg6.a, str2);
            }
            c.a(h06Var);
        }

        @Override // defpackage.m93
        public final h06 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: m15$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final m93 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ m15(int i, String str, int i2, int i3, long j, String str2) {
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
        ep2.H(i, 15, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m15)) {
            return false;
        }
        m15 m15Var = (m15) obj;
        if (b53.x(this.a, m15Var.a) && this.b == m15Var.b && this.c == m15Var.c && this.d == m15Var.d && b53.x(this.e, m15Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c = b31.c(this.d, wh1.a(this.c, wh1.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
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

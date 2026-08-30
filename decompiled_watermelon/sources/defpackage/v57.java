package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: v57  reason: default package */
/* loaded from: classes.dex */
public final class v57 {
    public static final b Companion = new Object();
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @zd1
    /* renamed from: v57$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements kl2 {
        public static final a a;
        private static final h06 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [kl2, v57$a, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            hp4 hp4Var = new hp4("me.magnum.rcheevosapi.dto.UserLoginDto", obj, 4);
            hp4Var.l("User", false);
            hp4Var.l("Token", false);
            hp4Var.l("Score", false);
            hp4Var.l("SoftcoreScore", false);
            descriptor = hp4Var;
        }

        @Override // defpackage.kl2
        public final m93[] a() {
            yg6 yg6Var = yg6.a;
            as3 as3Var = as3.a;
            return new m93[]{yg6Var, yg6Var, as3Var, as3Var};
        }

        @Override // defpackage.m93
        public final Object b(b91 b91Var) {
            h06 h06Var = descriptor;
            yu0 c = b91Var.c(h06Var);
            c.getClass();
            int i = 0;
            String str = null;
            String str2 = null;
            long j = 0;
            long j2 = 0;
            boolean z = true;
            while (z) {
                int v = c.v(h06Var);
                if (v != -1) {
                    if (v != 0) {
                        if (v != 1) {
                            if (v != 2) {
                                if (v == 3) {
                                    j2 = c.a0(h06Var, 3);
                                    i |= 8;
                                } else {
                                    throw new q27(v);
                                }
                            } else {
                                j = c.a0(h06Var, 2);
                                i |= 4;
                            }
                        } else {
                            str2 = c.K(h06Var, 1);
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
            return new v57(i, str, str2, j, j2);
        }

        @Override // defpackage.m93
        public final void d(mz1 mz1Var, Object obj) {
            v57 v57Var = (v57) obj;
            v57Var.getClass();
            h06 h06Var = descriptor;
            zu0 c = mz1Var.c(h06Var);
            c.z(h06Var, 0, v57Var.a);
            c.z(h06Var, 1, v57Var.b);
            c.r(h06Var, 2, v57Var.c);
            c.r(h06Var, 3, v57Var.d);
            c.a(h06Var);
        }

        @Override // defpackage.m93
        public final h06 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: v57$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final m93 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ v57(int i, String str, String str2, long j, long j2) {
        if (15 == (i & 15)) {
            this.a = str;
            this.b = str2;
            this.c = j;
            this.d = j2;
            return;
        }
        ep2.H(i, 15, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v57)) {
            return false;
        }
        v57 v57Var = (v57) obj;
        if (b53.x(this.a, v57Var.a) && b53.x(this.b, v57Var.b) && this.c == v57Var.c && this.d == v57Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + b31.c(this.c, ej6.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder v = b31.v("UserLoginDto(user=", this.a, ", token=", this.b, ", score=");
        v.append(this.c);
        return wh1.p(v, ", softcoreScore=", this.d, ")");
    }
}

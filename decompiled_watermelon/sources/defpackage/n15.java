package defpackage;

import defpackage.k15;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: n15  reason: default package */
/* loaded from: classes.dex */
public final class n15 {
    public static final b Companion = new Object();
    public final k15 a;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @zd1
    /* renamed from: n15$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements kl2 {
        public static final a a;
        private static final h06 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [kl2, java.lang.Object, n15$a] */
        static {
            ?? obj = new Object();
            a = obj;
            hp4 hp4Var = new hp4("me.magnum.rcheevosapi.dto.RALeaderboardInfoDto", obj, 1);
            hp4Var.l("LeaderboardData", false);
            descriptor = hp4Var;
        }

        @Override // defpackage.kl2
        public final m93[] a() {
            return new m93[]{k15.a.a};
        }

        @Override // defpackage.m93
        public final Object b(b91 b91Var) {
            h06 h06Var = descriptor;
            yu0 c = b91Var.c(h06Var);
            c.getClass();
            k15 k15Var = null;
            boolean z = true;
            int i = 0;
            while (z) {
                int v = c.v(h06Var);
                if (v != -1) {
                    if (v == 0) {
                        k15Var = (k15) c.U(h06Var, 0, k15.a.a, k15Var);
                        i = 1;
                    } else {
                        throw new q27(v);
                    }
                } else {
                    z = false;
                }
            }
            c.a(h06Var);
            return new n15(i, k15Var);
        }

        @Override // defpackage.m93
        public final void d(mz1 mz1Var, Object obj) {
            n15 n15Var = (n15) obj;
            n15Var.getClass();
            h06 h06Var = descriptor;
            zu0 c = mz1Var.c(h06Var);
            c.F(h06Var, 0, k15.a.a, n15Var.a);
            c.a(h06Var);
        }

        @Override // defpackage.m93
        public final h06 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: n15$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final m93 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ n15(int i, k15 k15Var) {
        if (1 == (i & 1)) {
            this.a = k15Var;
        } else {
            ep2.H(i, 1, a.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n15) && b53.x(this.a, ((n15) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RALeaderboardInfoDto(leaderboardData=" + this.a + ")";
    }
}

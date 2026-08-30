package defpackage;

import defpackage.g45;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: hc5  reason: default package */
/* loaded from: classes.dex */
public final class hc5 {
    public static final b Companion = new Object();
    public final g45 a;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @zd1
    /* renamed from: hc5$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements kl2 {
        public static final a a;
        private static final h06 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [hc5$a, kl2, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            hp4 hp4Var = new hp4("me.magnum.rcheevosapi.dto.ResponseDto", obj, 1);
            hp4Var.l("RankInfo", false);
            descriptor = hp4Var;
        }

        @Override // defpackage.kl2
        public final m93[] a() {
            return new m93[]{g45.a.a};
        }

        @Override // defpackage.m93
        public final Object b(b91 b91Var) {
            h06 h06Var = descriptor;
            yu0 c = b91Var.c(h06Var);
            c.getClass();
            g45 g45Var = null;
            boolean z = true;
            int i = 0;
            while (z) {
                int v = c.v(h06Var);
                if (v != -1) {
                    if (v == 0) {
                        g45Var = (g45) c.U(h06Var, 0, g45.a.a, g45Var);
                        i = 1;
                    } else {
                        throw new q27(v);
                    }
                } else {
                    z = false;
                }
            }
            c.a(h06Var);
            return new hc5(i, g45Var);
        }

        @Override // defpackage.m93
        public final void d(mz1 mz1Var, Object obj) {
            hc5 hc5Var = (hc5) obj;
            hc5Var.getClass();
            h06 h06Var = descriptor;
            zu0 c = mz1Var.c(h06Var);
            c.F(h06Var, 0, g45.a.a, hc5Var.a);
            c.a(h06Var);
        }

        @Override // defpackage.m93
        public final h06 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: hc5$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final m93 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ hc5(int i, g45 g45Var) {
        if (1 == (i & 1)) {
            this.a = g45Var;
        } else {
            ep2.H(i, 1, a.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof hc5) && b53.x(this.a, ((hc5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResponseDto(rankInfo=" + this.a + ")";
    }
}

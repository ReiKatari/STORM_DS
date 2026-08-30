package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: g45  reason: default package */
/* loaded from: classes.dex */
public final class g45 {
    public static final b Companion = new Object();
    public final int a;
    public final int b;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @zd1
    /* renamed from: g45$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements kl2 {
        public static final a a;
        private static final h06 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [kl2, g45$a, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            hp4 hp4Var = new hp4("me.magnum.rcheevosapi.dto.RankInfoDto", obj, 2);
            hp4Var.l("NumEntries", false);
            hp4Var.l("Rank", false);
            descriptor = hp4Var;
        }

        @Override // defpackage.kl2
        public final m93[] a() {
            g33 g33Var = g33.a;
            return new m93[]{g33Var, g33Var};
        }

        @Override // defpackage.m93
        public final Object b(b91 b91Var) {
            h06 h06Var = descriptor;
            yu0 c = b91Var.c(h06Var);
            c.getClass();
            boolean z = true;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (z) {
                int v = c.v(h06Var);
                if (v != -1) {
                    if (v != 0) {
                        if (v == 1) {
                            i3 = c.V(h06Var, 1);
                            i |= 2;
                        } else {
                            throw new q27(v);
                        }
                    } else {
                        i2 = c.V(h06Var, 0);
                        i |= 1;
                    }
                } else {
                    z = false;
                }
            }
            c.a(h06Var);
            return new g45(i, i2, i3);
        }

        @Override // defpackage.m93
        public final void d(mz1 mz1Var, Object obj) {
            g45 g45Var = (g45) obj;
            g45Var.getClass();
            h06 h06Var = descriptor;
            zu0 c = mz1Var.c(h06Var);
            c.q(0, g45Var.a, h06Var);
            c.q(1, g45Var.b, h06Var);
            c.a(h06Var);
        }

        @Override // defpackage.m93
        public final h06 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: g45$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final m93 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ g45(int i, int i2, int i3) {
        if (3 == (i & 3)) {
            this.a = i2;
            this.b = i3;
            return;
        }
        ep2.H(i, 3, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g45)) {
            return false;
        }
        g45 g45Var = (g45) obj;
        if (this.a == g45Var.a && this.b == g45Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RankInfoDto(numEntries=" + this.a + ", rank=" + this.b + ")";
    }
}

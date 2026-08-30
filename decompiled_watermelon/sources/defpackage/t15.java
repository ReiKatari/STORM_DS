package defpackage;

import defpackage.hc5;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: t15  reason: default package */
/* loaded from: classes.dex */
public final class t15 {
    public static final b Companion = new Object();
    public final hc5 a;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @zd1
    /* renamed from: t15$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements kl2 {
        public static final a a;
        private static final h06 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [kl2, java.lang.Object, t15$a] */
        static {
            ?? obj = new Object();
            a = obj;
            hp4 hp4Var = new hp4("me.magnum.rcheevosapi.dto.RASubmitLeaderboardEntryResponseDto", obj, 1);
            hp4Var.l("Response", false);
            descriptor = hp4Var;
        }

        @Override // defpackage.kl2
        public final m93[] a() {
            return new m93[]{hc5.a.a};
        }

        @Override // defpackage.m93
        public final Object b(b91 b91Var) {
            h06 h06Var = descriptor;
            yu0 c = b91Var.c(h06Var);
            c.getClass();
            hc5 hc5Var = null;
            boolean z = true;
            int i = 0;
            while (z) {
                int v = c.v(h06Var);
                if (v != -1) {
                    if (v == 0) {
                        hc5Var = (hc5) c.U(h06Var, 0, hc5.a.a, hc5Var);
                        i = 1;
                    } else {
                        throw new q27(v);
                    }
                } else {
                    z = false;
                }
            }
            c.a(h06Var);
            return new t15(i, hc5Var);
        }

        @Override // defpackage.m93
        public final void d(mz1 mz1Var, Object obj) {
            t15 t15Var = (t15) obj;
            t15Var.getClass();
            h06 h06Var = descriptor;
            zu0 c = mz1Var.c(h06Var);
            c.F(h06Var, 0, hc5.a.a, t15Var.a);
            c.a(h06Var);
        }

        @Override // defpackage.m93
        public final h06 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: t15$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final m93 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ t15(int i, hc5 hc5Var) {
        if (1 == (i & 1)) {
            this.a = hc5Var;
        } else {
            ep2.H(i, 1, a.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t15) && b53.x(this.a, ((t15) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "RASubmitLeaderboardEntryResponseDto(response=" + this.a + ")";
    }
}

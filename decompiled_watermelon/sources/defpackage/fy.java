package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: fy  reason: default package */
/* loaded from: classes.dex */
public final class fy {
    public static final b Companion = new Object();
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @zd1
    /* renamed from: fy$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements kl2 {
        public static final a a;
        private static final h06 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [fy$a, kl2, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            hp4 hp4Var = new hp4("me.magnum.rcheevosapi.dto.AwardAchievementResponseDto", obj, 5);
            hp4Var.l("Success", false);
            hp4Var.l("AchievementsRemaining", false);
            hp4Var.l("Score", false);
            hp4Var.l("SoftcoreScore", false);
            hp4Var.l("AchievementID", false);
            descriptor = hp4Var;
        }

        @Override // defpackage.kl2
        public final m93[] a() {
            g33 g33Var = g33.a;
            return new m93[]{w30.a, g33Var, g33Var, g33Var, g33Var};
        }

        @Override // defpackage.m93
        public final Object b(b91 b91Var) {
            h06 h06Var = descriptor;
            yu0 c = b91Var.c(h06Var);
            c.getClass();
            boolean z = true;
            int i = 0;
            boolean z2 = false;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (z) {
                int v = c.v(h06Var);
                if (v != -1) {
                    if (v != 0) {
                        if (v != 1) {
                            if (v != 2) {
                                if (v != 3) {
                                    if (v == 4) {
                                        i5 = c.V(h06Var, 4);
                                        i |= 16;
                                    } else {
                                        throw new q27(v);
                                    }
                                } else {
                                    i4 = c.V(h06Var, 3);
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
                        z2 = c.O(h06Var, 0);
                        i |= 1;
                    }
                } else {
                    z = false;
                }
            }
            c.a(h06Var);
            return new fy(i, z2, i2, i3, i4, i5);
        }

        @Override // defpackage.m93
        public final void d(mz1 mz1Var, Object obj) {
            fy fyVar = (fy) obj;
            fyVar.getClass();
            h06 h06Var = descriptor;
            zu0 c = mz1Var.c(h06Var);
            c.A(h06Var, 0, fyVar.a);
            c.q(1, fyVar.b, h06Var);
            c.q(2, fyVar.c, h06Var);
            c.q(3, fyVar.d, h06Var);
            c.q(4, fyVar.e, h06Var);
            c.a(h06Var);
        }

        @Override // defpackage.m93
        public final h06 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: fy$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final m93 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ fy(int i, boolean z, int i2, int i3, int i4, int i5) {
        if (31 == (i & 31)) {
            this.a = z;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            return;
        }
        ep2.H(i, 31, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy)) {
            return false;
        }
        fy fyVar = (fy) obj;
        if (this.a == fyVar.a && this.b == fyVar.b && this.c == fyVar.c && this.d == fyVar.d && this.e == fyVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + wh1.a(this.d, wh1.a(this.c, wh1.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwardAchievementResponseDto(success=");
        sb.append(this.a);
        sb.append(", achievementsRemaining=");
        sb.append(this.b);
        sb.append(", score=");
        b31.A(sb, this.c, ", softcoreScore=", this.d, ", achievementId=");
        return wh1.m(sb, this.e, ")");
    }
}

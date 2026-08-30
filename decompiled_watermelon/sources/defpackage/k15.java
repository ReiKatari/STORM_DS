package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: k15  reason: default package */
/* loaded from: classes.dex */
public final class k15 {
    public static final b Companion = new Object();
    public static final gh3[] d = {null, yf2.H(wk3.PUBLICATION, new vq3(21)), null};
    public final String a;
    public final List b;
    public final int c;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @zd1
    /* renamed from: k15$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements kl2 {
        public static final a a;
        private static final h06 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [kl2, k15$a, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            hp4 hp4Var = new hp4("me.magnum.rcheevosapi.dto.RALeaderboardDataDto", obj, 3);
            hp4Var.l("LBFormat", false);
            hp4Var.l("Entries", false);
            hp4Var.l("TotalEntries", false);
            descriptor = hp4Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.kl2
        public final m93[] a() {
            return new m93[]{yg6.a, k15.d[1].getValue(), z82.a};
        }

        @Override // defpackage.m93
        public final Object b(b91 b91Var) {
            h06 h06Var = descriptor;
            yu0 c = b91Var.c(h06Var);
            gh3[] gh3VarArr = k15.d;
            c.getClass();
            String str = null;
            boolean z = true;
            int i = 0;
            int i2 = 0;
            List list = null;
            while (z) {
                int v = c.v(h06Var);
                if (v != -1) {
                    if (v != 0) {
                        if (v != 1) {
                            if (v == 2) {
                                i2 = ((Number) c.U(h06Var, 2, z82.a, Integer.valueOf(i2))).intValue();
                                i |= 4;
                            } else {
                                throw new q27(v);
                            }
                        } else {
                            list = (List) c.U(h06Var, 1, (m93) gh3VarArr[1].getValue(), list);
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
            return new k15(i, str, list, i2);
        }

        @Override // defpackage.m93
        public final void d(mz1 mz1Var, Object obj) {
            k15 k15Var = (k15) obj;
            k15Var.getClass();
            h06 h06Var = descriptor;
            zu0 c = mz1Var.c(h06Var);
            gh3[] gh3VarArr = k15.d;
            c.z(h06Var, 0, k15Var.a);
            c.F(h06Var, 1, (m93) gh3VarArr[1].getValue(), k15Var.b);
            c.F(h06Var, 2, z82.a, Integer.valueOf(k15Var.c));
            c.a(h06Var);
        }

        @Override // defpackage.m93
        public final h06 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: k15$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final m93 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ k15(int i, String str, List list, int i2) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = list;
            this.c = i2;
            return;
        }
        ep2.H(i, 7, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k15)) {
            return false;
        }
        k15 k15Var = (k15) obj;
        if (b53.x(this.a, k15Var.a) && b53.x(this.b, k15Var.b) && this.c == k15Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + b31.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RALeaderboardDataDto(format=");
        sb.append(this.a);
        sb.append(", entries=");
        sb.append(this.b);
        sb.append(", totalEntries=");
        return wh1.m(sb, this.c, ")");
    }
}

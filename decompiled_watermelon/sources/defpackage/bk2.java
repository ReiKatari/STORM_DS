package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: bk2  reason: default package */
/* loaded from: classes.dex */
public final class bk2 {
    public static final b Companion = new Object();
    public static final gh3[] g = {null, null, null, null, null, yf2.H(wk3.PUBLICATION, new do1(5))};
    public final long a;
    public final String b;
    public final String c;
    public final Long d;
    public final String e;
    public final List f;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @zd1
    /* renamed from: bk2$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements kl2 {
        public static final a a;
        private static final h06 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [bk2$a, kl2, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            hp4 hp4Var = new hp4("me.magnum.rcheevosapi.dto.GameAchievementSetsDto", obj, 6);
            hp4Var.l("GameId", false);
            hp4Var.l("Title", false);
            hp4Var.l("ImageIconUrl", false);
            hp4Var.l("RichPresenceGameId", false);
            hp4Var.l("RichPresencePatch", false);
            hp4Var.l("Sets", false);
            descriptor = hp4Var;
        }

        @Override // defpackage.kl2
        public final m93[] a() {
            gh3[] gh3VarArr = bk2.g;
            as3 as3Var = as3.a;
            yg6 yg6Var = yg6.a;
            return new m93[]{as3Var, yg6Var, yg6Var, l07.R(as3Var), l07.R(yg6Var), l07.R((m93) gh3VarArr[5].getValue())};
        }

        @Override // defpackage.m93
        public final Object b(b91 b91Var) {
            h06 h06Var = descriptor;
            yu0 c = b91Var.c(h06Var);
            gh3[] gh3VarArr = bk2.g;
            c.getClass();
            List list = null;
            int i = 0;
            long j = 0;
            String str = null;
            String str2 = null;
            Long l = null;
            String str3 = null;
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
                        str = c.K(h06Var, 1);
                        i |= 2;
                        break;
                    case 2:
                        str2 = c.K(h06Var, 2);
                        i |= 4;
                        break;
                    case 3:
                        l = (Long) c.u(h06Var, 3, as3.a, l);
                        i |= 8;
                        break;
                    case 4:
                        str3 = (String) c.u(h06Var, 4, yg6.a, str3);
                        i |= 16;
                        break;
                    case 5:
                        list = (List) c.u(h06Var, 5, (m93) gh3VarArr[5].getValue(), list);
                        i |= 32;
                        break;
                    default:
                        throw new q27(v);
                }
            }
            c.a(h06Var);
            return new bk2(i, j, str, str2, l, str3, list);
        }

        @Override // defpackage.m93
        public final void d(mz1 mz1Var, Object obj) {
            bk2 bk2Var = (bk2) obj;
            bk2Var.getClass();
            h06 h06Var = descriptor;
            zu0 c = mz1Var.c(h06Var);
            gh3[] gh3VarArr = bk2.g;
            c.r(h06Var, 0, bk2Var.a);
            c.z(h06Var, 1, bk2Var.b);
            c.z(h06Var, 2, bk2Var.c);
            c.N(h06Var, 3, as3.a, bk2Var.d);
            c.N(h06Var, 4, yg6.a, bk2Var.e);
            c.N(h06Var, 5, (m93) gh3VarArr[5].getValue(), bk2Var.f);
            c.a(h06Var);
        }

        @Override // defpackage.m93
        public final h06 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: bk2$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final m93 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ bk2(int i, long j, String str, String str2, Long l, String str3, List list) {
        if (63 == (i & 63)) {
            this.a = j;
            this.b = str;
            this.c = str2;
            this.d = l;
            this.e = str3;
            this.f = list;
            return;
        }
        ep2.H(i, 63, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk2)) {
            return false;
        }
        bk2 bk2Var = (bk2) obj;
        if (this.a == bk2Var.a && b53.x(this.b, bk2Var.b) && b53.x(this.c, bk2Var.c) && b53.x(this.d, bk2Var.d) && b53.x(this.e, bk2Var.e) && b53.x(this.f, bk2Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int b2 = ej6.b(ej6.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        Long l = this.d;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (b2 + hashCode) * 31;
        String str = this.e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List list = this.f;
        if (list != null) {
            i = list.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "GameAchievementSetsDto(id=" + this.a + ", title=" + this.b + ", iconUrl=" + this.c + ", richPresenceGameId=" + this.d + ", richPresencePatch=" + this.e + ", sets=" + this.f + ")";
    }
}

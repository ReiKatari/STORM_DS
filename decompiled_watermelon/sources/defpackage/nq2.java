package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: nq2  reason: default package */
/* loaded from: classes.dex */
public final class nq2 {
    public static final b Companion = new Object();
    public static final gh3[] b = {yf2.H(wk3.PUBLICATION, new do1(8))};
    public final Map a;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @zd1
    /* renamed from: nq2$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements kl2 {
        public static final a a;
        private static final h06 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [kl2, java.lang.Object, nq2$a] */
        static {
            ?? obj = new Object();
            a = obj;
            hp4 hp4Var = new hp4("me.magnum.rcheevosapi.dto.HashLibraryDto", obj, 1);
            hp4Var.l("MD5List", false);
            descriptor = hp4Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.kl2
        public final m93[] a() {
            return new m93[]{nq2.b[0].getValue()};
        }

        @Override // defpackage.m93
        public final Object b(b91 b91Var) {
            h06 h06Var = descriptor;
            yu0 c = b91Var.c(h06Var);
            gh3[] gh3VarArr = nq2.b;
            c.getClass();
            Map map = null;
            boolean z = true;
            int i = 0;
            while (z) {
                int v = c.v(h06Var);
                if (v != -1) {
                    if (v == 0) {
                        map = (Map) c.U(h06Var, 0, (m93) gh3VarArr[0].getValue(), map);
                        i = 1;
                    } else {
                        throw new q27(v);
                    }
                } else {
                    z = false;
                }
            }
            c.a(h06Var);
            return new nq2(i, map);
        }

        @Override // defpackage.m93
        public final void d(mz1 mz1Var, Object obj) {
            nq2 nq2Var = (nq2) obj;
            nq2Var.getClass();
            h06 h06Var = descriptor;
            zu0 c = mz1Var.c(h06Var);
            c.F(h06Var, 0, (m93) nq2.b[0].getValue(), nq2Var.a);
            c.a(h06Var);
        }

        @Override // defpackage.m93
        public final h06 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: nq2$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final m93 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ nq2(int i, Map map) {
        if (1 == (i & 1)) {
            this.a = map;
        } else {
            ep2.H(i, 1, a.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nq2) && b53.x(this.a, ((nq2) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HashLibraryDto(md5List=" + this.a + ")";
    }
}

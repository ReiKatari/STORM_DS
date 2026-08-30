package defpackage;

import defpackage.i03;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: o11 */
/* loaded from: classes.dex */
public final class o11 {
    public static final b Companion = new b(null);
    public static final int b = 8;
    private static final gh3[] c = {yf2.H(wk3.PUBLICATION, new d5(25))};
    private final List<i03> a;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    @zd1
    /* renamed from: o11$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements kl2 {
        public static final a a;
        public static final int b;
        private static final h06 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            b = 8;
            hp4 hp4Var = new hp4("me.magnum.melonds.migrations.legacy.input.ControllerConfigurationDto33", aVar, 1);
            hp4Var.l("a", false);
            descriptor = hp4Var;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.kl2
        public final m93[] a() {
            return new m93[]{o11.c[0].getValue()};
        }

        @Override // defpackage.kl2
        public /* bridge */ m93[] c() {
            return dk7.i;
        }

        @Override // defpackage.m93
        public final h06 e() {
            return descriptor;
        }

        @Override // defpackage.m93
        /* renamed from: f */
        public final o11 b(b91 b91Var) {
            b91Var.getClass();
            h06 h06Var = descriptor;
            yu0 c = b91Var.c(h06Var);
            gh3[] gh3VarArr = o11.c;
            c.getClass();
            boolean z = true;
            int i = 0;
            List list = null;
            while (z) {
                int v = c.v(h06Var);
                if (v != -1) {
                    if (v == 0) {
                        list = (List) c.U(h06Var, 0, (m93) gh3VarArr[0].getValue(), list);
                        i = 1;
                    } else {
                        throw new q27(v);
                    }
                } else {
                    z = false;
                }
            }
            c.a(h06Var);
            return new o11(i, list, null);
        }

        @Override // defpackage.m93
        /* renamed from: g */
        public final void d(mz1 mz1Var, o11 o11Var) {
            mz1Var.getClass();
            o11Var.getClass();
            h06 h06Var = descriptor;
            zu0 c = mz1Var.c(h06Var);
            o11.i(o11Var, c, h06Var);
            c.a(h06Var);
        }
    }

    public /* synthetic */ o11(int i, List list, o06 o06Var) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            ep2.H(i, 1, a.a.e());
            throw null;
        }
    }

    public static final /* synthetic */ m93 b() {
        return new zt(i03.a.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o11 f(o11 o11Var, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = o11Var.a;
        }
        return o11Var.e(list);
    }

    public static final /* synthetic */ void i(o11 o11Var, zu0 zu0Var, h06 h06Var) {
        zu0Var.F(h06Var, 0, (m93) c[0].getValue(), o11Var.a);
    }

    public final List<i03> d() {
        return this.a;
    }

    public final o11 e(List<i03> list) {
        list.getClass();
        return new o11(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o11) && b53.x(this.a, ((o11) obj).a)) {
            return true;
        }
        return false;
    }

    public final List<i03> g() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        List<i03> list = this.a;
        return "ControllerConfigurationDto33(inputMapper=" + list + ")";
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: o11$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(n91 n91Var) {
            this();
        }

        public final m93 serializer() {
            return a.a;
        }

        private b() {
        }
    }

    public o11(List<i03> list) {
        list.getClass();
        this.a = list;
    }

    public static /* synthetic */ void h() {
    }
}

package defpackage;

import java.io.Serializable;
import java.time.ZoneId;
import java.time.ZoneOffset;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v53  reason: default package */
/* loaded from: classes.dex */
public final class v53 implements j07 {
    public static final u53 a = new u53(new String[]{"seconds", "nanos"}, 2);
    public static final u53 b = new u53(new String[]{"seconds", "nanos"}, 3);
    public static final u53 c = new u53(new String[]{"year", "month", "day"}, 4);
    public static final u53 d = new u53(new String[]{"hour", "minute", "second", "nano"}, 5);
    public static final u53 e = new u53(new String[]{"month", "day"}, 6);
    public static final u53 f = new u53(new String[]{"years", "months", "days"}, 7);
    public static final u53 g = new u53(new String[]{"year"}, 0);
    public static final u53 h = new u53(new String[]{"year", "month"}, 1);
    public static final cz6 i = new a().a();
    public static final b j = new b();

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: v53$a */
    /* loaded from: classes.dex */
    public class a extends dz6 {
        @Override // defpackage.dz6
        public final Object b(o83 o83Var) {
            ZoneOffset ofTotalSeconds;
            ZoneId of;
            o83Var.i();
            String str = null;
            Integer num = null;
            while (o83Var.n0() != q83.END_OBJECT) {
                String Z = o83Var.Z();
                Z.getClass();
                if (!Z.equals("totalSeconds")) {
                    if (!Z.equals("id")) {
                        o83Var.u0();
                    } else {
                        str = o83Var.l0();
                    }
                } else {
                    num = Integer.valueOf(o83Var.T());
                }
            }
            o83Var.B();
            if (str != null) {
                of = ZoneId.of(str);
                return of;
            } else if (num != null) {
                ofTotalSeconds = ZoneOffset.ofTotalSeconds(num.intValue());
                return ofTotalSeconds;
            } else {
                throw new RuntimeException("Missing id or totalSeconds field; at path ".concat(o83Var.I()));
            }
        }

        @Override // defpackage.dz6
        public final void c(b93 b93Var, Object obj) {
            String id;
            int totalSeconds;
            ZoneId s = f72.s(obj);
            if (f72.x(s)) {
                b93Var.p();
                b93Var.C("totalSeconds");
                totalSeconds = f72.v(s).getTotalSeconds();
                b93Var.R(totalSeconds);
                b93Var.B();
                return;
            }
            b93Var.p();
            b93Var.C("id");
            id = s.getId();
            b93Var.Z(id);
            b93Var.B();
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: v53$b */
    /* loaded from: classes.dex */
    public class b implements ez6 {
        @Override // defpackage.ez6
        public final dz6 a(qo2 qo2Var, n07 n07Var) {
            Class cls = n07Var.a;
            if (cls.getName().startsWith("java.time.")) {
                if (cls == w53.e()) {
                    return v53.a;
                }
                if (cls == w53.x()) {
                    return v53.b;
                }
                if (cls == f72.i()) {
                    return v53.c;
                }
                if (cls == f72.z()) {
                    return v53.d;
                }
                if (cls == w53.y()) {
                    return v53.b(qo2Var);
                }
                if (cls == w53.z()) {
                    return v53.e;
                }
                if (cls == w53.A()) {
                    return new rq0(1, v53.b(qo2Var), qo2Var.d(new n07(f72.C()))).a();
                }
                if (cls == w53.B()) {
                    u53 u53Var = v53.a;
                    Class z = f72.z();
                    qo2Var.getClass();
                    return new z53(qo2Var.d(new n07(z)), qo2Var.d(new n07(f72.C())), 1).a();
                } else if (cls == w53.C()) {
                    return v53.f;
                } else {
                    if (cls == w53.D()) {
                        return v53.g;
                    }
                    if (cls == w53.u()) {
                        return v53.h;
                    }
                    if (cls != f72.D() && cls != f72.C()) {
                        if (cls == w53.w()) {
                            return new x53(v53.b(qo2Var), qo2Var.d(new n07(f72.C())), qo2Var.d(new n07(f72.D())), 0).a();
                        }
                        return null;
                    }
                    return v53.i;
                }
            }
            return null;
        }
    }

    public static void a(Serializable serializable, String str, o83 o83Var) {
        if (serializable != null) {
            return;
        }
        StringBuilder u = b31.u("Missing ", str, " field; at path ");
        u.append(o83Var.I());
        throw new RuntimeException(u.toString());
    }

    public static cz6 b(qo2 qo2Var) {
        Class i2 = f72.i();
        qo2Var.getClass();
        return new z53(qo2Var.d(new n07(i2)), qo2Var.d(new n07(f72.z())), 0).a();
    }
}

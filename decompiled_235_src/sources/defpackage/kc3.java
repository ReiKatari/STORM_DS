package defpackage;

import java.io.Serializable;
import java.time.ZoneId;
import java.time.ZoneOffset;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kc3  reason: default package */
/* loaded from: classes.dex */
public final class kc3 implements ee7 {
    public static final ic3 a = new ic3(new String[]{"seconds", "nanos"}, 2);
    public static final ic3 b = new ic3(new String[]{"seconds", "nanos"}, 3);
    public static final ic3 c = new ic3(new String[]{"year", "month", "day"}, 4);
    public static final ic3 d = new ic3(new String[]{"hour", "minute", "second", "nano"}, 5);
    public static final ic3 e = new ic3(new String[]{"month", "day"}, 6);
    public static final ic3 f = new ic3(new String[]{"years", "months", "days"}, 7);
    public static final ic3 g = new ic3(new String[]{"year"}, 0);
    public static final ic3 h = new ic3(new String[]{"year", "month"}, 1);
    public static final xc7 i = new a().a();
    public static final b j = new b();

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: kc3$a */
    /* loaded from: classes.dex */
    public class a extends yc7 {
        @Override // defpackage.yc7
        public final Object b(hf3 hf3Var) {
            ZoneOffset ofTotalSeconds;
            ZoneId of;
            hf3Var.h();
            String str = null;
            Integer num = null;
            while (hf3Var.n0() != jf3.END_OBJECT) {
                String c0 = hf3Var.c0();
                c0.getClass();
                if (!c0.equals("totalSeconds")) {
                    if (!c0.equals("id")) {
                        hf3Var.u0();
                    } else {
                        str = hf3Var.l0();
                    }
                } else {
                    num = Integer.valueOf(hf3Var.Z());
                }
            }
            hf3Var.u();
            if (str != null) {
                of = ZoneId.of(str);
                return of;
            } else if (num != null) {
                ofTotalSeconds = ZoneOffset.ofTotalSeconds(num.intValue());
                return ofTotalSeconds;
            } else {
                throw new RuntimeException("Missing id or totalSeconds field; at path ".concat(hf3Var.D()));
            }
        }

        @Override // defpackage.yc7
        public final void c(vf3 vf3Var, Object obj) {
            String id;
            int totalSeconds;
            ZoneId i = jc3.i(obj);
            if (jc3.q(i)) {
                vf3Var.k();
                vf3Var.v("totalSeconds");
                totalSeconds = jc3.m(i).getTotalSeconds();
                vf3Var.X(totalSeconds);
                vf3Var.u();
                return;
            }
            vf3Var.k();
            vf3Var.v("id");
            id = i.getId();
            vf3Var.c0(id);
            vf3Var.u();
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: kc3$b */
    /* loaded from: classes.dex */
    public class b implements zc7 {
        @Override // defpackage.zc7
        public final yc7 a(su2 su2Var, ie7 ie7Var) {
            Class cls = ie7Var.a;
            if (cls.getName().startsWith("java.time.")) {
                if (cls == jc3.c()) {
                    return kc3.a;
                }
                if (cls == jc3.x()) {
                    return kc3.b;
                }
                if (cls == wa2.l()) {
                    return kc3.c;
                }
                if (cls == wa2.A()) {
                    return kc3.d;
                }
                if (cls == jc3.y()) {
                    return kc3.b(su2Var);
                }
                if (cls == jc3.z()) {
                    return kc3.e;
                }
                if (cls == jc3.A()) {
                    return new et0(1, kc3.b(su2Var), su2Var.d(new ie7(wa2.C()))).a();
                }
                if (cls == jc3.B()) {
                    ic3 ic3Var = kc3.a;
                    Class A = wa2.A();
                    su2Var.getClass();
                    return new nc3(su2Var.d(new ie7(A)), su2Var.d(new ie7(wa2.C())), 1).a();
                } else if (cls == jc3.C()) {
                    return kc3.f;
                } else {
                    if (cls == jc3.D()) {
                        return kc3.g;
                    }
                    if (cls == jc3.s()) {
                        return kc3.h;
                    }
                    if (cls != wa2.D() && cls != wa2.C()) {
                        if (cls == jc3.w()) {
                            return new lc3(kc3.b(su2Var), su2Var.d(new ie7(wa2.C())), su2Var.d(new ie7(wa2.D())), 0).a();
                        }
                        return null;
                    }
                    return kc3.i;
                }
            }
            return null;
        }
    }

    public static void a(Serializable serializable, String str, hf3 hf3Var) {
        if (serializable != null) {
            return;
        }
        StringBuilder t = i61.t("Missing ", str, " field; at path ");
        t.append(hf3Var.D());
        throw new RuntimeException(t.toString());
    }

    public static xc7 b(su2 su2Var) {
        Class l = wa2.l();
        su2Var.getClass();
        return new nc3(su2Var.d(new ie7(l)), su2Var.d(new ie7(wa2.A())), 0).a();
    }
}

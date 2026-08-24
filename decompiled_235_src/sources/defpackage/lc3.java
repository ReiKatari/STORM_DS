package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lc3  reason: default package */
/* loaded from: classes.dex */
public final class lc3 extends yc7 {
    public final /* synthetic */ int a;
    public final Object b;
    public final yc7 c;
    public final Object d;

    public lc3(ft0 ft0Var, lc3 lc3Var, lc3 lc3Var2, ph4 ph4Var) {
        this.a = 1;
        this.b = lc3Var;
        this.c = lc3Var2;
        this.d = ph4Var;
    }

    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        ZonedDateTime ofInstant;
        LocalDateTime localDateTime = null;
        Map map = null;
        switch (this.a) {
            case 0:
                hf3Var.h();
                ZoneOffset zoneOffset = null;
                ZoneId zoneId = null;
                while (hf3Var.n0() != jf3.END_OBJECT) {
                    String c0 = hf3Var.c0();
                    c0.getClass();
                    char c = 65535;
                    switch (c0.hashCode()) {
                        case -1019779949:
                            if (c0.equals("offset")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 3744684:
                            if (c0.equals("zone")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1792749467:
                            if (c0.equals("dateTime")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            zoneOffset = jc3.m(this.c.b(hf3Var));
                            break;
                        case 1:
                            zoneId = jc3.i(((yc7) this.d).b(hf3Var));
                            break;
                        case 2:
                            localDateTime = jc3.e(((xc7) this.b).b(hf3Var));
                            break;
                        default:
                            hf3Var.u0();
                            break;
                    }
                }
                hf3Var.u();
                kc3.a(localDateTime, "dateTime", hf3Var);
                LocalDateTime t = jc3.t(localDateTime);
                kc3.a(zoneOffset, "offset", hf3Var);
                ZoneOffset v = jc3.v(zoneOffset);
                kc3.a(zoneId, "zone", hf3Var);
                ofInstant = ZonedDateTime.ofInstant(t, v, jc3.u(zoneId));
                return ofInstant;
            case 1:
                jf3 n0 = hf3Var.n0();
                if (n0 == jf3.NULL) {
                    hf3Var.j0();
                } else {
                    map = (Map) ((ph4) this.d).e();
                    if (n0 == jf3.BEGIN_ARRAY) {
                        hf3Var.e();
                        while (hf3Var.F()) {
                            hf3Var.e();
                            Object b = ((lc3) this.b).c.b(hf3Var);
                            Object b2 = ((lc3) this.c).c.b(hf3Var);
                            if (!map.containsKey(b)) {
                                map.put(b, b2);
                                hf3Var.r();
                            } else {
                                throw new RuntimeException("duplicate key: " + b);
                            }
                        }
                        hf3Var.r();
                    } else {
                        hf3Var.h();
                        while (hf3Var.F()) {
                            x31.B.getClass();
                            if (hf3Var instanceof rf3) {
                                rf3 rf3Var = (rf3) hf3Var;
                                rf3Var.y0(jf3.NAME);
                                Map.Entry entry = (Map.Entry) ((Iterator) rf3Var.C0()).next();
                                rf3Var.E0(entry.getValue());
                                rf3Var.E0(new ef3((String) entry.getKey()));
                            } else {
                                int i = hf3Var.e0;
                                if (i == 0) {
                                    i = hf3Var.n();
                                }
                                if (i == 13) {
                                    hf3Var.e0 = 9;
                                } else if (i == 12) {
                                    hf3Var.e0 = 8;
                                } else if (i == 14) {
                                    hf3Var.e0 = 10;
                                } else {
                                    throw hf3Var.w0("a name");
                                }
                            }
                            Object b3 = ((lc3) this.b).c.b(hf3Var);
                            Object b4 = ((lc3) this.c).c.b(hf3Var);
                            if (!map.containsKey(b3)) {
                                map.put(b3, b4);
                            } else {
                                throw new RuntimeException("duplicate key: " + b3);
                            }
                        }
                        hf3Var.u();
                    }
                }
                return map;
            default:
                return this.c.b(hf3Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        if ((r1 instanceof defpackage.rh5) == false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.reflect.Type] */
    @Override // defpackage.yc7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(vf3 vf3Var, Object obj) {
        LocalDateTime localDateTime;
        ZoneOffset offset;
        ZoneId zone;
        Class<?> cls;
        yc7 d;
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.d;
        yc7 yc7Var = this.c;
        switch (i) {
            case 0:
                ZonedDateTime o = jc3.o(obj);
                if (o == null) {
                    vf3Var.A();
                    return;
                }
                vf3Var.k();
                vf3Var.v("dateTime");
                localDateTime = o.toLocalDateTime();
                ((xc7) obj2).c(vf3Var, localDateTime);
                vf3Var.v("offset");
                offset = o.getOffset();
                yc7Var.c(vf3Var, offset);
                vf3Var.v("zone");
                zone = o.getZone();
                ((yc7) obj3).c(vf3Var, zone);
                vf3Var.u();
                return;
            case 1:
                Map map = (Map) obj;
                if (map == null) {
                    vf3Var.A();
                    return;
                }
                vf3Var.k();
                for (Map.Entry entry : map.entrySet()) {
                    vf3Var.v(String.valueOf(entry.getKey()));
                    ((lc3) yc7Var).c(vf3Var, entry.getValue());
                }
                vf3Var.u();
                return;
            default:
                ?? r2 = (Type) obj3;
                if (obj != null && ((r2 instanceof Class) || (r2 instanceof TypeVariable))) {
                    cls = obj.getClass();
                } else {
                    cls = r2;
                }
                if (cls != r2) {
                    yc7 d2 = ((su2) obj2).d(new ie7(cls));
                    if (d2 instanceof rh5) {
                        yc7 yc7Var2 = yc7Var;
                        while ((yc7Var2 instanceof ec6) && (d = ((ec6) yc7Var2).d()) != yc7Var2) {
                            yc7Var2 = d;
                        }
                        break;
                    }
                    yc7Var = d2;
                }
                yc7Var.c(vf3Var, obj);
                return;
        }
    }

    public /* synthetic */ lc3(Object obj, yc7 yc7Var, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = yc7Var;
        this.d = obj2;
    }
}

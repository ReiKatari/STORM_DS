package defpackage;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Collection;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: et0  reason: default package */
/* loaded from: classes.dex */
public final class et0 extends yc7 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public et0(ud7 ud7Var, Class cls) {
        this.a = 2;
        this.c = ud7Var;
        this.b = cls;
    }

    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        OffsetDateTime of;
        int i = this.a;
        Collection collection = null;
        LocalDateTime localDateTime = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (hf3Var.n0() == jf3.NULL) {
                    hf3Var.j0();
                } else {
                    collection = (Collection) ((ph4) obj).e();
                    hf3Var.e();
                    while (hf3Var.F()) {
                        collection.add(((lc3) obj2).c.b(hf3Var));
                    }
                    hf3Var.r();
                }
                return collection;
            case 1:
                hf3Var.h();
                ZoneOffset zoneOffset = null;
                while (hf3Var.n0() != jf3.END_OBJECT) {
                    String c0 = hf3Var.c0();
                    c0.getClass();
                    if (!c0.equals("offset")) {
                        if (!c0.equals("dateTime")) {
                            hf3Var.u0();
                        } else {
                            localDateTime = jc3.e(((xc7) obj2).b(hf3Var));
                        }
                    } else {
                        zoneOffset = jc3.m(((yc7) obj).b(hf3Var));
                    }
                }
                hf3Var.u();
                kc3.a(localDateTime, "dateTime", hf3Var);
                LocalDateTime t = jc3.t(localDateTime);
                kc3.a(zoneOffset, "offset", hf3Var);
                of = OffsetDateTime.of(t, jc3.v(zoneOffset));
                return of;
            default:
                Class cls = (Class) obj2;
                Object b = ((ud7) obj).L.b(hf3Var);
                if (b != null && !cls.isInstance(b)) {
                    throw new RuntimeException("Expected a " + cls.getName() + " but was " + b.getClass().getName() + "; at path " + hf3Var.D());
                }
                return b;
        }
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        LocalDateTime localDateTime;
        ZoneOffset offset;
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    vf3Var.A();
                    return;
                }
                vf3Var.h();
                for (Object obj4 : collection) {
                    ((lc3) obj2).c(vf3Var, obj4);
                }
                vf3Var.r();
                return;
            case 1:
                OffsetDateTime r = mc3.r(obj);
                vf3Var.k();
                vf3Var.v("dateTime");
                localDateTime = r.toLocalDateTime();
                ((xc7) obj2).c(vf3Var, localDateTime);
                vf3Var.v("offset");
                offset = r.getOffset();
                ((yc7) obj3).c(vf3Var, offset);
                vf3Var.u();
                return;
            default:
                ((ud7) obj3).L.c(vf3Var, obj);
                return;
        }
    }

    public /* synthetic */ et0(int i, yc7 yc7Var, Object obj) {
        this.a = i;
        this.b = yc7Var;
        this.c = obj;
    }
}

package defpackage;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Collection;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rq0  reason: default package */
/* loaded from: classes.dex */
public final class rq0 extends dz6 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public rq0(zz6 zz6Var, Class cls) {
        this.a = 2;
        this.c = zz6Var;
        this.b = cls;
    }

    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        OffsetDateTime of;
        int i = this.a;
        Collection collection = null;
        LocalDateTime localDateTime = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (o83Var.n0() == q83.NULL) {
                    o83Var.j0();
                } else {
                    collection = (Collection) ((y84) obj).d();
                    o83Var.d();
                    while (o83Var.J()) {
                        collection.add(((x53) obj2).c.b(o83Var));
                    }
                    o83Var.x();
                }
                return collection;
            case 1:
                o83Var.i();
                ZoneOffset zoneOffset = null;
                while (o83Var.n0() != q83.END_OBJECT) {
                    String Z = o83Var.Z();
                    Z.getClass();
                    if (!Z.equals("offset")) {
                        if (!Z.equals("dateTime")) {
                            o83Var.u0();
                        } else {
                            localDateTime = f72.n(((cz6) obj2).b(o83Var));
                        }
                    } else {
                        zoneOffset = f72.v(((dz6) obj).b(o83Var));
                    }
                }
                o83Var.B();
                v53.a(localDateTime, "dateTime", o83Var);
                LocalDateTime B = f72.B(localDateTime);
                v53.a(zoneOffset, "offset", o83Var);
                of = OffsetDateTime.of(B, w53.o(zoneOffset));
                return of;
            default:
                Class cls = (Class) obj2;
                Object b = ((zz6) obj).L.b(o83Var);
                if (b != null && !cls.isInstance(b)) {
                    throw new RuntimeException("Expected a " + cls.getName() + " but was " + b.getClass().getName() + "; at path " + o83Var.I());
                }
                return b;
        }
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        LocalDateTime localDateTime;
        ZoneOffset offset;
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    b93Var.F();
                    return;
                }
                b93Var.i();
                for (Object obj4 : collection) {
                    ((x53) obj2).c(b93Var, obj4);
                }
                b93Var.x();
                return;
            case 1:
                OffsetDateTime o = y53.o(obj);
                b93Var.p();
                b93Var.C("dateTime");
                localDateTime = o.toLocalDateTime();
                ((cz6) obj2).c(b93Var, localDateTime);
                b93Var.C("offset");
                offset = o.getOffset();
                ((dz6) obj3).c(b93Var, offset);
                b93Var.B();
                return;
            default:
                ((zz6) obj3).L.c(b93Var, obj);
                return;
        }
    }

    public /* synthetic */ rq0(int i, dz6 dz6Var, Object obj) {
        this.a = i;
        this.b = dz6Var;
        this.c = obj;
    }
}

package defpackage;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z53  reason: default package */
/* loaded from: classes.dex */
public final class z53 extends dz6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dz6 b;
    public final /* synthetic */ dz6 c;

    public /* synthetic */ z53(dz6 dz6Var, dz6 dz6Var2, int i) {
        this.a = i;
        this.b = dz6Var;
        this.c = dz6Var2;
    }

    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        LocalDateTime of;
        OffsetTime of2;
        int i = this.a;
        dz6 dz6Var = this.c;
        dz6 dz6Var2 = this.b;
        Serializable serializable = null;
        switch (i) {
            case 0:
                o83Var.i();
                LocalTime localTime = null;
                while (o83Var.n0() != q83.END_OBJECT) {
                    String Z = o83Var.Z();
                    Z.getClass();
                    if (!Z.equals("date")) {
                        if (!Z.equals("time")) {
                            o83Var.u0();
                        } else {
                            localTime = y53.j(dz6Var.b(o83Var));
                        }
                    } else {
                        serializable = y53.f(dz6Var2.b(o83Var));
                    }
                }
                o83Var.B();
                v53.a(serializable, "date", o83Var);
                LocalDate i2 = w53.i(serializable);
                v53.a(localTime, "time", o83Var);
                of = LocalDateTime.of(i2, w53.l(localTime));
                return of;
            default:
                o83Var.i();
                ZoneOffset zoneOffset = null;
                while (o83Var.n0() != q83.END_OBJECT) {
                    String Z2 = o83Var.Z();
                    Z2.getClass();
                    if (!Z2.equals("offset")) {
                        if (!Z2.equals("time")) {
                            o83Var.u0();
                        } else {
                            serializable = y53.j(dz6Var2.b(o83Var));
                        }
                    } else {
                        zoneOffset = f72.v(dz6Var.b(o83Var));
                    }
                }
                o83Var.B();
                v53.a(serializable, "time", o83Var);
                LocalTime l = w53.l(serializable);
                v53.a(zoneOffset, "offset", o83Var);
                of2 = OffsetTime.of(l, w53.o(zoneOffset));
                return of2;
        }
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        LocalDate localDate;
        LocalTime localTime;
        LocalTime localTime2;
        ZoneOffset offset;
        int i = this.a;
        dz6 dz6Var = this.c;
        dz6 dz6Var2 = this.b;
        switch (i) {
            case 0:
                LocalDateTime n = f72.n(obj);
                b93Var.p();
                b93Var.C("date");
                localDate = n.toLocalDate();
                dz6Var2.c(b93Var, localDate);
                b93Var.C("time");
                localTime = n.toLocalTime();
                dz6Var.c(b93Var, localTime);
                b93Var.B();
                return;
            default:
                OffsetTime q = y53.q(obj);
                b93Var.p();
                b93Var.C("time");
                localTime2 = q.toLocalTime();
                dz6Var2.c(b93Var, localTime2);
                b93Var.C("offset");
                offset = q.getOffset();
                dz6Var.c(b93Var, offset);
                b93Var.B();
                return;
        }
    }
}

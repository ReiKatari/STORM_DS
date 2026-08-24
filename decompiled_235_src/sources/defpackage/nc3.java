package defpackage;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nc3  reason: default package */
/* loaded from: classes.dex */
public final class nc3 extends yc7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yc7 b;
    public final /* synthetic */ yc7 c;

    public /* synthetic */ nc3(yc7 yc7Var, yc7 yc7Var2, int i) {
        this.a = i;
        this.b = yc7Var;
        this.c = yc7Var2;
    }

    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        LocalDateTime of;
        OffsetTime of2;
        int i = this.a;
        yc7 yc7Var = this.c;
        yc7 yc7Var2 = this.b;
        Serializable serializable = null;
        switch (i) {
            case 0:
                hf3Var.h();
                LocalTime localTime = null;
                while (hf3Var.n0() != jf3.END_OBJECT) {
                    String c0 = hf3Var.c0();
                    c0.getClass();
                    if (!c0.equals("date")) {
                        if (!c0.equals("time")) {
                            hf3Var.u0();
                        } else {
                            localTime = mc3.A(yc7Var.b(hf3Var));
                        }
                    } else {
                        serializable = mc3.z(yc7Var2.b(hf3Var));
                    }
                }
                hf3Var.u();
                kc3.a(serializable, "date", hf3Var);
                LocalDate h = mc3.h(serializable);
                kc3.a(localTime, "time", hf3Var);
                of = LocalDateTime.of(h, mc3.m(localTime));
                return of;
            default:
                hf3Var.h();
                ZoneOffset zoneOffset = null;
                while (hf3Var.n0() != jf3.END_OBJECT) {
                    String c02 = hf3Var.c0();
                    c02.getClass();
                    if (!c02.equals("offset")) {
                        if (!c02.equals("time")) {
                            hf3Var.u0();
                        } else {
                            serializable = mc3.A(yc7Var2.b(hf3Var));
                        }
                    } else {
                        zoneOffset = jc3.m(yc7Var.b(hf3Var));
                    }
                }
                hf3Var.u();
                kc3.a(serializable, "time", hf3Var);
                LocalTime m = mc3.m(serializable);
                kc3.a(zoneOffset, "offset", hf3Var);
                of2 = OffsetTime.of(m, jc3.v(zoneOffset));
                return of2;
        }
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        LocalDate localDate;
        LocalTime localTime;
        LocalTime localTime2;
        ZoneOffset offset;
        int i = this.a;
        yc7 yc7Var = this.c;
        yc7 yc7Var2 = this.b;
        switch (i) {
            case 0:
                LocalDateTime e = jc3.e(obj);
                vf3Var.k();
                vf3Var.v("date");
                localDate = e.toLocalDate();
                yc7Var2.c(vf3Var, localDate);
                vf3Var.v("time");
                localTime = e.toLocalTime();
                yc7Var.c(vf3Var, localTime);
                vf3Var.u();
                return;
            default:
                OffsetTime t = mc3.t(obj);
                vf3Var.k();
                vf3Var.v("time");
                localTime2 = t.toLocalTime();
                yc7Var2.c(vf3Var, localTime2);
                vf3Var.v("offset");
                offset = t.getOffset();
                yc7Var.c(vf3Var, offset);
                vf3Var.u();
                return;
        }
    }
}

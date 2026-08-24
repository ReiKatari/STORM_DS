package defpackage;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ic3  reason: default package */
/* loaded from: classes.dex */
public final class ic3 extends yc7 {
    public final List a;
    public final /* synthetic */ int b;

    public ic3(String[] strArr, int i) {
        this.b = i;
        this.a = Arrays.asList(strArr);
    }

    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        Year of;
        YearMonth of2;
        Duration ofSeconds;
        Instant ofEpochSecond;
        LocalDate of3;
        LocalTime of4;
        MonthDay of5;
        Period of6;
        if (hf3Var.n0() == jf3.NULL) {
            hf3Var.j0();
            return null;
        }
        hf3Var.h();
        List list = this.a;
        long[] jArr = new long[list.size()];
        while (hf3Var.n0() != jf3.END_OBJECT) {
            int indexOf = list.indexOf(hf3Var.c0());
            if (indexOf >= 0) {
                jArr[indexOf] = hf3Var.a0();
            } else {
                hf3Var.u0();
            }
        }
        hf3Var.u();
        switch (this.b) {
            case 0:
                of = Year.of(Math.toIntExact(jArr[0]));
                return of;
            case 1:
                of2 = YearMonth.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]));
                return of2;
            case 2:
                ofSeconds = Duration.ofSeconds(jArr[0], jArr[1]);
                return ofSeconds;
            case 3:
                ofEpochSecond = Instant.ofEpochSecond(jArr[0], jArr[1]);
                return ofEpochSecond;
            case 4:
                of3 = LocalDate.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]));
                return of3;
            case 5:
                of4 = LocalTime.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]), Math.toIntExact(jArr[3]));
                return of4;
            case 6:
                of5 = MonthDay.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]));
                return of5;
            case 7:
                of6 = Period.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]));
                return of6;
            default:
                return new GregorianCalendar(fe7.b(jArr[0]), fe7.b(jArr[1]), fe7.b(jArr[2]), fe7.b(jArr[3]), fe7.b(jArr[4]), fe7.b(jArr[5]));
        }
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        int i;
        int value;
        long[] jArr;
        int year;
        int monthValue;
        long[] jArr2;
        long seconds;
        int nano;
        long epochSecond;
        int nano2;
        int year2;
        int monthValue2;
        int dayOfMonth;
        int hour;
        int minute;
        int second;
        int nano3;
        int monthValue3;
        int dayOfMonth2;
        int years;
        int months;
        int days;
        if (obj == null) {
            vf3Var.A();
            return;
        }
        vf3Var.k();
        switch (this.b) {
            case 0:
                i = 0;
                value = wa2.t(obj).getValue();
                jArr = new long[]{value};
                jArr2 = jArr;
                break;
            case 1:
                i = 0;
                YearMonth h = jc3.h(obj);
                year = h.getYear();
                monthValue = h.getMonthValue();
                jArr2 = new long[]{year, monthValue};
                break;
            case 2:
                i = 0;
                Duration p = wa2.p(obj);
                seconds = p.getSeconds();
                nano = p.getNano();
                jArr2 = new long[]{seconds, nano};
                break;
            case 3:
                i = 0;
                Instant f = mc3.f(obj);
                epochSecond = f.getEpochSecond();
                nano2 = f.getNano();
                jArr2 = new long[]{epochSecond, nano2};
                break;
            case 4:
                i = 0;
                LocalDate h2 = mc3.h(obj);
                year2 = h2.getYear();
                long j = year2;
                monthValue2 = h2.getMonthValue();
                dayOfMonth = h2.getDayOfMonth();
                jArr = new long[]{j, monthValue2, dayOfMonth};
                jArr2 = jArr;
                break;
            case 5:
                i = 0;
                LocalTime m = mc3.m(obj);
                hour = m.getHour();
                minute = m.getMinute();
                second = m.getSecond();
                nano3 = m.getNano();
                jArr2 = new long[]{hour, minute, second, nano3};
                break;
            case 6:
                i = 0;
                MonthDay q = mc3.q(obj);
                monthValue3 = q.getMonthValue();
                dayOfMonth2 = q.getDayOfMonth();
                jArr2 = new long[]{monthValue3, dayOfMonth2};
                break;
            case 7:
                i = 0;
                Period j2 = oc3.j(obj);
                years = j2.getYears();
                long j3 = years;
                months = j2.getMonths();
                days = j2.getDays();
                jArr = new long[]{j3, months, days};
                jArr2 = jArr;
                break;
            default:
                Calendar calendar = (Calendar) obj;
                i = 0;
                jArr2 = new long[]{calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13)};
                break;
        }
        int i2 = i;
        while (true) {
            List list = this.a;
            if (i2 < list.size()) {
                vf3Var.v((String) list.get(i2));
                vf3Var.X(jArr2[i2]);
                i2++;
            } else {
                vf3Var.u();
                return;
            }
        }
    }
}

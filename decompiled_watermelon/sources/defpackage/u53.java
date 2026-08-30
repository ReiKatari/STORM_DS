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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u53  reason: default package */
/* loaded from: classes.dex */
public final class u53 extends dz6 {
    public final List a;
    public final /* synthetic */ int b;

    public u53(String[] strArr, int i) {
        this.b = i;
        this.a = Arrays.asList(strArr);
    }

    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        Year of;
        YearMonth of2;
        Duration ofSeconds;
        Instant ofEpochSecond;
        LocalDate of3;
        LocalTime of4;
        MonthDay of5;
        Period of6;
        if (o83Var.n0() == q83.NULL) {
            o83Var.j0();
            return null;
        }
        o83Var.i();
        List list = this.a;
        long[] jArr = new long[list.size()];
        while (o83Var.n0() != q83.END_OBJECT) {
            int indexOf = list.indexOf(o83Var.Z());
            if (indexOf >= 0) {
                jArr[indexOf] = o83Var.V();
            } else {
                o83Var.u0();
            }
        }
        o83Var.B();
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
            case ig7.b /* 6 */:
                of5 = MonthDay.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]));
                return of5;
            case 7:
                of6 = Period.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]));
                return of6;
            default:
                return new GregorianCalendar(k07.b(jArr[0]), k07.b(jArr[1]), k07.b(jArr[2]), k07.b(jArr[3]), k07.b(jArr[4]), k07.b(jArr[5]));
        }
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
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
            b93Var.F();
            return;
        }
        b93Var.p();
        switch (this.b) {
            case 0:
                i = 0;
                value = f72.p(obj).getValue();
                jArr = new long[]{value};
                jArr2 = jArr;
                break;
            case 1:
                i = 0;
                YearMonth r = f72.r(obj);
                year = r.getYear();
                monthValue = r.getMonthValue();
                jArr2 = new long[]{year, monthValue};
                break;
            case 2:
                i = 0;
                Duration l = f72.l(obj);
                seconds = l.getSeconds();
                nano = l.getNano();
                jArr2 = new long[]{seconds, nano};
                break;
            case 3:
                i = 0;
                Instant g = w53.g(obj);
                epochSecond = g.getEpochSecond();
                nano2 = g.getNano();
                jArr2 = new long[]{epochSecond, nano2};
                break;
            case 4:
                i = 0;
                LocalDate i2 = w53.i(obj);
                year2 = i2.getYear();
                long j = year2;
                monthValue2 = i2.getMonthValue();
                dayOfMonth = i2.getDayOfMonth();
                jArr = new long[]{j, monthValue2, dayOfMonth};
                jArr2 = jArr;
                break;
            case 5:
                i = 0;
                LocalTime l2 = w53.l(obj);
                hour = l2.getHour();
                minute = l2.getMinute();
                second = l2.getSecond();
                nano3 = l2.getNano();
                jArr2 = new long[]{hour, minute, second, nano3};
                break;
            case ig7.b /* 6 */:
                i = 0;
                MonthDay n = y53.n(obj);
                monthValue3 = n.getMonthValue();
                dayOfMonth2 = n.getDayOfMonth();
                jArr2 = new long[]{monthValue3, dayOfMonth2};
                break;
            case 7:
                i = 0;
                Period t = y53.t(obj);
                years = t.getYears();
                long j2 = years;
                months = t.getMonths();
                days = t.getDays();
                jArr = new long[]{j2, months, days};
                jArr2 = jArr;
                break;
            default:
                Calendar calendar = (Calendar) obj;
                i = 0;
                jArr2 = new long[]{calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13)};
                break;
        }
        int i3 = i;
        while (true) {
            List list = this.a;
            if (i3 < list.size()) {
                b93Var.C((String) list.get(i3));
                b93Var.R(jArr2[i3]);
                i3++;
            } else {
                b93Var.B();
                return;
            }
        }
    }
}

package defpackage;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vc6  reason: default package */
/* loaded from: classes.dex */
public final class vc6 extends dz6 {
    public static final a b = new a();
    public final SimpleDateFormat a;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: vc6$a */
    /* loaded from: classes.dex */
    public class a implements ez6 {
        @Override // defpackage.ez6
        public final dz6 a(qo2 qo2Var, n07 n07Var) {
            if (n07Var.a == Time.class) {
                return new vc6(0);
            }
            return null;
        }
    }

    private vc6() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        Time time;
        if (o83Var.n0() == q83.NULL) {
            o83Var.j0();
            return null;
        }
        String l0 = o83Var.l0();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                time = new Time(this.a.parse(l0).getTime());
                this.a.setTimeZone(timeZone);
            } catch (ParseException e) {
                throw new RuntimeException("Failed parsing '" + l0 + "' as SQL Time; at path " + o83Var.I(), e);
            }
        }
        return time;
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            b93Var.F();
            return;
        }
        synchronized (this) {
            format = this.a.format((Date) time);
        }
        b93Var.Z(format);
    }

    public /* synthetic */ vc6(int i) {
        this();
    }
}

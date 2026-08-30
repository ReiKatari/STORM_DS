package defpackage;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uc6  reason: default package */
/* loaded from: classes.dex */
public final class uc6 extends dz6 {
    public static final a b = new a();
    public final SimpleDateFormat a;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: uc6$a */
    /* loaded from: classes.dex */
    public class a implements ez6 {
        @Override // defpackage.ez6
        public final dz6 a(qo2 qo2Var, n07 n07Var) {
            if (n07Var.a == Date.class) {
                return new uc6(0);
            }
            return null;
        }
    }

    private uc6() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        Date date;
        if (o83Var.n0() == q83.NULL) {
            o83Var.j0();
            return null;
        }
        String l0 = o83Var.l0();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                date = new Date(this.a.parse(l0).getTime());
                this.a.setTimeZone(timeZone);
            } catch (ParseException e) {
                throw new RuntimeException("Failed parsing '" + l0 + "' as SQL Date; at path " + o83Var.I(), e);
            }
        }
        return date;
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            b93Var.F();
            return;
        }
        synchronized (this) {
            format = this.a.format((java.util.Date) date);
        }
        b93Var.Z(format);
    }

    public /* synthetic */ uc6(int i) {
        this();
    }
}

package defpackage;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ko6  reason: default package */
/* loaded from: classes.dex */
public final class ko6 extends yc7 {
    public static final a b = new a();
    public final SimpleDateFormat a;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: ko6$a */
    /* loaded from: classes.dex */
    public class a implements zc7 {
        @Override // defpackage.zc7
        public final yc7 a(su2 su2Var, ie7 ie7Var) {
            if (ie7Var.a == Date.class) {
                return new ko6(0);
            }
            return null;
        }
    }

    private ko6() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        Date date;
        if (hf3Var.n0() == jf3.NULL) {
            hf3Var.j0();
            return null;
        }
        String l0 = hf3Var.l0();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                date = new Date(this.a.parse(l0).getTime());
                this.a.setTimeZone(timeZone);
            } catch (ParseException e) {
                throw new RuntimeException("Failed parsing '" + l0 + "' as SQL Date; at path " + hf3Var.D(), e);
            }
        }
        return date;
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            vf3Var.A();
            return;
        }
        synchronized (this) {
            format = this.a.format((java.util.Date) date);
        }
        vf3Var.c0(format);
    }

    public /* synthetic */ ko6(int i) {
        this();
    }
}

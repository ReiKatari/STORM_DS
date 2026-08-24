package defpackage;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lo6  reason: default package */
/* loaded from: classes.dex */
public final class lo6 extends yc7 {
    public static final a b = new a();
    public final SimpleDateFormat a;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: lo6$a */
    /* loaded from: classes.dex */
    public class a implements zc7 {
        @Override // defpackage.zc7
        public final yc7 a(su2 su2Var, ie7 ie7Var) {
            if (ie7Var.a == Time.class) {
                return new lo6(0);
            }
            return null;
        }
    }

    private lo6() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        Time time;
        if (hf3Var.n0() == jf3.NULL) {
            hf3Var.j0();
            return null;
        }
        String l0 = hf3Var.l0();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                time = new Time(this.a.parse(l0).getTime());
                this.a.setTimeZone(timeZone);
            } catch (ParseException e) {
                throw new RuntimeException("Failed parsing '" + l0 + "' as SQL Time; at path " + hf3Var.D(), e);
            }
        }
        return time;
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            vf3Var.A();
            return;
        }
        synchronized (this) {
            format = this.a.format((Date) time);
        }
        vf3Var.c0(format);
    }

    public /* synthetic */ lo6(int i) {
        this();
    }
}

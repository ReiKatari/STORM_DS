package ab;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import ua.h;
import ua.u;
import ua.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends u {

    /* renamed from: b  reason: collision with root package name */
    public static final a f689b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f690a;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public class a implements v {
        @Override // ua.v
        public final u a(h hVar, bb.a aVar) {
            if (aVar.f2155a == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    private b() {
        this.f690a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // ua.u
    public final Object b(cb.a aVar) {
        Time time;
        if (aVar.d0() == cb.b.NULL) {
            aVar.Z();
            return null;
        }
        String b02 = aVar.b0();
        synchronized (this) {
            TimeZone timeZone = this.f690a.getTimeZone();
            try {
                time = new Time(this.f690a.parse(b02).getTime());
                this.f690a.setTimeZone(timeZone);
            } catch (ParseException e6) {
                throw new RuntimeException("Failed parsing '" + b02 + "' as SQL Time; at path " + aVar.B(true), e6);
            }
        }
        return time;
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            cVar.F();
            return;
        }
        synchronized (this) {
            format = this.f690a.format((Date) time);
        }
        cVar.Y(format);
    }

    public /* synthetic */ b(int i2) {
        this();
    }
}

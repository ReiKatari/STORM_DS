package ab;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import ua.h;
import ua.u;
import ua.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends u {

    /* renamed from: b  reason: collision with root package name */
    public static final C0000a f687b = new C0000a();

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f688a;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* renamed from: ab.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0000a implements v {
        @Override // ua.v
        public final u a(h hVar, bb.a aVar) {
            if (aVar.f2155a == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    private a() {
        this.f688a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // ua.u
    public final Object b(cb.a aVar) {
        Date date;
        if (aVar.d0() == cb.b.NULL) {
            aVar.Z();
            return null;
        }
        String b02 = aVar.b0();
        synchronized (this) {
            TimeZone timeZone = this.f688a.getTimeZone();
            try {
                date = new Date(this.f688a.parse(b02).getTime());
                this.f688a.setTimeZone(timeZone);
            } catch (ParseException e6) {
                throw new RuntimeException("Failed parsing '" + b02 + "' as SQL Date; at path " + aVar.B(true), e6);
            }
        }
        return date;
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            cVar.F();
            return;
        }
        synchronized (this) {
            format = this.f688a.format((java.util.Date) date);
        }
        cVar.Y(format);
    }

    public /* synthetic */ a(int i2) {
        this();
    }
}

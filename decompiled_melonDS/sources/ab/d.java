package ab;

import java.sql.Timestamp;
import java.util.Date;
import ua.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends u {

    /* renamed from: b  reason: collision with root package name */
    public static final c f691b = new c();

    /* renamed from: a  reason: collision with root package name */
    public final u f692a;

    public d(u uVar) {
        this.f692a = uVar;
    }

    @Override // ua.u
    public final Object b(cb.a aVar) {
        Date date = (Date) this.f692a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        this.f692a.c(cVar, (Timestamp) obj);
    }
}

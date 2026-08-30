package ab;

import java.sql.Timestamp;
import java.util.Date;
import xa.g;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f693b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i2, Class cls) {
        super(cls);
        this.f693b = i2;
    }

    @Override // xa.g
    public final Date a(Date date) {
        switch (this.f693b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}

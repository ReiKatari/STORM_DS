package sd;

import android.content.Context;
import android.net.Uri;
import java.util.List;
import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final List f12868b = t.y("zip", "7z", "rar", "tar");

    /* renamed from: a  reason: collision with root package name */
    public final Context f12869a;

    public d(Context context) {
        this.f12869a = context;
    }

    public final c a(Uri uri, f fVar) {
        uri.getClass();
        fVar.getClass();
        k6.c e6 = k6.a.e(this.f12869a, uri);
        String f8 = e6.f();
        if (f8 == null) {
            return c.NOT_FOUND;
        }
        if (fVar == f.READ) {
            return c.OK;
        }
        if (e6.i()) {
            return c.READ_ONLY;
        }
        String x02 = vc.h.x0('.', f8, "");
        if (x02.length() == 0) {
            return c.OK;
        }
        if (f12868b.contains(x02)) {
            return c.READ_ONLY;
        }
        return c.OK;
    }
}

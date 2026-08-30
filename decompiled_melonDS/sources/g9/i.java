package g9;

import android.net.Uri;
import yb.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: a  reason: collision with root package name */
    public final n f5615a;

    /* renamed from: b  reason: collision with root package name */
    public final n f5616b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5617c;

    public i(n nVar, n nVar2, boolean z10) {
        this.f5615a = nVar;
        this.f5616b = nVar2;
        this.f5617c = z10;
    }

    @Override // g9.f
    public final g a(Object obj, m9.n nVar, b9.h hVar) {
        Uri uri = (Uri) obj;
        if (!nc.k.a(uri.getScheme(), "http") && !nc.k.a(uri.getScheme(), "https")) {
            return null;
        }
        return new l(uri.toString(), nVar, this.f5615a, this.f5616b, this.f5617c);
    }
}

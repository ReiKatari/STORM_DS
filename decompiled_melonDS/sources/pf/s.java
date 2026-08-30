package pf;

import android.net.Uri;
import kf.d2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final cf.d f11647a;

    /* renamed from: b  reason: collision with root package name */
    public final be.c f11648b;

    public s(cf.d dVar, be.c cVar) {
        this.f11647a = dVar;
        this.f11648b = cVar;
    }

    public final Uri a(ze.a aVar) {
        String f8;
        Uri g10;
        aVar.getClass();
        Uri e6 = ((d2) this.f11647a).e(aVar);
        be.c cVar = this.f11648b;
        k6.a b10 = cVar.b(e6);
        if (b10 != null) {
            k6.a a10 = cVar.a(aVar.f15056d);
            Uri uri = null;
            if (a10 != null && (f8 = a10.f()) != null) {
                String concat = f8.concat(".sav");
                int l02 = vc.h.l0('.', 0, 6, f8);
                if (l02 != -1) {
                    concat = vc.h.s0(f8, l02 + 1, f8.length(), "sav").toString();
                }
                k6.a c4 = b10.c(concat);
                if (c4 != null) {
                    Uri g11 = c4.g();
                    g11.getClass();
                    return g11;
                }
                k6.a a11 = b10.a("application/*", concat);
                if (a11 != null) {
                    uri = a11.g();
                }
                if (uri == null) {
                    k6.a c10 = b10.c(concat);
                    if (c10 != null && (g10 = c10.g()) != null) {
                        return g10;
                    }
                    throw new Exception(kc.a.f("Could not create temporary SRAM file at ", b10.g()));
                }
                return uri;
            }
            if (a10 != null) {
                uri = a10.g();
            }
            throw new Exception(kc.a.f("Cannot determine SRAM file name: ", uri));
        }
        throw new Exception(kc.a.f("Cannot create root document: ", e6));
    }
}

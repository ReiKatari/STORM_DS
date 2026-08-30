package hg;

import a7.k0;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import p7.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends k0 {
    @Override // a7.k0
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        return (eg.c) ((Parcelable) o.k(bundle, str, eg.c.class));
    }

    @Override // a7.k0
    public final Object d(String str) {
        od.b bVar = od.c.f10884d;
        bVar.getClass();
        return (eg.c) bVar.b(str, eg.c.Companion.serializer());
    }

    @Override // a7.k0
    public final void e(Bundle bundle, String str, Object obj) {
        eg.c cVar = (eg.c) obj;
        str.getClass();
        cVar.getClass();
        bundle.putParcelable(str, cVar);
    }

    @Override // a7.k0
    public final String f(Object obj) {
        eg.c cVar = (eg.c) obj;
        cVar.getClass();
        od.b bVar = od.c.f10884d;
        bVar.getClass();
        String encode = Uri.encode(bVar.c(eg.c.Companion.serializer(), cVar));
        encode.getClass();
        return encode;
    }
}

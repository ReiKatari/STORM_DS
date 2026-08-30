package g9;

import android.webkit.MimeTypeMap;
import d9.o;
import fj.x;
import java.io.File;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public final File f5614a;

    public h(File file) {
        this.f5614a = file;
    }

    @Override // g9.g
    public final Object a(cc.c cVar) {
        String str = x.B;
        File file = this.f5614a;
        o oVar = new o(x8.e.n(file), fj.k.A, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        name.getClass();
        return new m(oVar, singleton.getMimeTypeFromExtension(vc.h.x0('.', name, "")), d9.f.DISK);
    }
}

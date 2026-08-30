package i9;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import m9.n;
import nc.k;
import q9.g;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements b {
    @Override // i9.b
    public final String a(Object obj, n nVar) {
        Uri uri = (Uri) obj;
        if (k.a(uri.getScheme(), "android.resource")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uri);
            sb2.append('-');
            Configuration configuration = nVar.f9429a.getResources().getConfiguration();
            Bitmap.Config[] configArr = g.f12393a;
            sb2.append(configuration.uiMode & 48);
            return sb2.toString();
        }
        return uri.toString();
    }
}

package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vh7  reason: default package */
/* loaded from: classes.dex */
public final class vh7 implements zh3 {
    @Override // defpackage.zh3
    public final String a(Object obj, fo4 fo4Var) {
        Uri uri = (Uri) obj;
        if (nb3.k(uri.getScheme(), "android.resource")) {
            StringBuilder sb = new StringBuilder();
            sb.append(uri);
            sb.append('-');
            Configuration configuration = fo4Var.a.getResources().getConfiguration();
            Bitmap.Config[] configArr = k.a;
            sb.append(configuration.uiMode & 48);
            return sb.toString();
        }
        return uri.toString();
    }
}

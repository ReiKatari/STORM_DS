package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x37  reason: default package */
/* loaded from: classes.dex */
public final class x37 implements hb3 {
    @Override // defpackage.hb3
    public final String a(Object obj, df4 df4Var) {
        Uri uri = (Uri) obj;
        if (b53.x(uri.getScheme(), "android.resource")) {
            StringBuilder sb = new StringBuilder();
            sb.append(uri);
            sb.append('-');
            Configuration configuration = df4Var.a.getResources().getConfiguration();
            Bitmap.Config[] configArr = k.a;
            sb.append(configuration.uiMode & 48);
            return sb.toString();
        }
        return uri.toString();
    }
}

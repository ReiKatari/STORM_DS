package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l70  reason: default package */
/* loaded from: classes.dex */
public final class l70 {
    public final /* synthetic */ int a;

    public /* synthetic */ l70(int i) {
        this.a = i;
    }

    public final Object a(Object obj, df4 df4Var) {
        String authority;
        String str = "";
        switch (this.a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                String url = ((URL) obj).toString();
                url.getClass();
                return Uri.parse(url);
            case 2:
                Uri uri = (Uri) obj;
                if (k.c(uri)) {
                    return null;
                }
                String scheme = uri.getScheme();
                if (scheme != null && !scheme.equals("file")) {
                    return null;
                }
                String path = uri.getPath();
                if (path != null) {
                    str = path;
                }
                if (!zg6.R0(str, '/') || ((String) tq0.M0(uri.getPathSegments())) == null) {
                    return null;
                }
                if (b53.x(uri.getScheme(), "file")) {
                    String path2 = uri.getPath();
                    if (path2 == null) {
                        return null;
                    }
                    return new File(path2);
                }
                return new File(uri.toString());
            case 3:
                return ((hu2) obj).i;
            case 4:
                int intValue = ((Number) obj).intValue();
                Context context = df4Var.a;
                try {
                    if (context.getResources().getResourceEntryName(intValue) == null) {
                        return null;
                    }
                    return Uri.parse("android.resource://" + context.getPackageName() + '/' + intValue);
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            case 5:
                Uri uri2 = (Uri) obj;
                if (!b53.x(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || zg6.B0(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                if (authority2 != null) {
                    str = authority2;
                }
                Resources resourcesForApplication = df4Var.a.getPackageManager().getResourcesForApplication(str);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), str);
                if (identifier != 0) {
                    return Uri.parse("android.resource://" + str + '/' + identifier);
                }
                c44.e(wh1.i(uri2, "Invalid android.resource URI: "));
                return null;
            default:
                return Uri.parse((String) obj);
        }
    }
}

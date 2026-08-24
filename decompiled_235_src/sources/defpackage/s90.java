package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s90  reason: default package */
/* loaded from: classes.dex */
public final class s90 {
    public final /* synthetic */ int a;

    public /* synthetic */ s90(int i) {
        this.a = i;
    }

    public final Object a(Object obj, fo4 fo4Var) {
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
                if (!qs6.L0(str, '/') || ((String) gt0.J0(uri.getPathSegments())) == null) {
                    return null;
                }
                if (nb3.k(uri.getScheme(), "file")) {
                    String path2 = uri.getPath();
                    if (path2 == null) {
                        return null;
                    }
                    return new File(path2);
                }
                return new File(uri.toString());
            case 3:
                return ((i03) obj).i;
            case 4:
                int intValue = ((Number) obj).intValue();
                Context context = fo4Var.a;
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
                if (!nb3.k(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || qs6.v0(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                if (authority2 != null) {
                    str = authority2;
                }
                Resources resourcesForApplication = fo4Var.a.getPackageManager().getResourcesForApplication(str);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), str);
                if (identifier != 0) {
                    return Uri.parse("android.resource://" + str + '/' + identifier);
                }
                u34.f(xg6.n(uri2, "Invalid android.resource URI: "));
                return null;
            default:
                return Uri.parse((String) obj);
        }
    }
}

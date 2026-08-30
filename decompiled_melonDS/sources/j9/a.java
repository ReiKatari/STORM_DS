package j9;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
import l1.c;
import m9.n;
import m9.o;
import me.magnum.melonds.common.camera.DSiCameraSource;
import p7.k;
import pi.r;
import q9.g;
import vc.h;
import zb.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7783a;

    public /* synthetic */ a(int i2) {
        this.f7783a = i2;
    }

    public final Object a(Object obj, n nVar) {
        String scheme;
        String authority;
        switch (this.f7783a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case DSiCameraSource.FrontCamera /* 1 */:
                Uri uri = (Uri) obj;
                if (!g.c(uri) && ((scheme = uri.getScheme()) == null || scheme.equals("file"))) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    if (path.length() > 0 && k.j(path.charAt(0), '/', false) && ((String) l.T(uri.getPathSegments())) != null) {
                        if (nc.k.a(uri.getScheme(), "file")) {
                            String path2 = uri.getPath();
                            if (path2 != null) {
                                return new File(path2);
                            }
                        } else {
                            return new File(uri.toString());
                        }
                    }
                }
                return null;
            case 2:
                return ((r) obj).f11789i;
            case 3:
                int intValue = ((Number) obj).intValue();
                Context context = nVar.f9429a;
                try {
                    if (context.getResources().getResourceEntryName(intValue) != null) {
                        return Uri.parse("android.resource://" + context.getPackageName() + '/' + intValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            case 4:
                Uri uri2 = (Uri) obj;
                if (nc.k.a(uri2.getScheme(), "android.resource") && (authority = uri2.getAuthority()) != null && !h.j0(authority) && uri2.getPathSegments().size() == 2) {
                    String authority2 = uri2.getAuthority();
                    if (authority2 == null) {
                        authority2 = "";
                    }
                    Resources resourcesForApplication = nVar.f9429a.getPackageManager().getResourcesForApplication(authority2);
                    List<String> pathSegments = uri2.getPathSegments();
                    int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                    if (identifier != 0) {
                        return Uri.parse("android.resource://" + authority2 + '/' + identifier);
                    }
                    o.g(kc.a.f("Invalid android.resource URI: ", uri2));
                }
                return null;
            case c.f8511g /* 5 */:
                return Uri.parse((String) obj);
            default:
                String url = ((URL) obj).toString();
                url.getClass();
                return Uri.parse(url);
        }
    }
}

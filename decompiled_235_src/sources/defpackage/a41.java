package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a41  reason: default package */
/* loaded from: classes.dex */
public class a41 extends xk5 {
    public final /* synthetic */ int a;
    public final Context b;

    public /* synthetic */ a41(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.xk5
    public boolean a(m44 m44Var) {
        switch (this.a) {
            case 0:
                return "content".equals(((Uri) m44Var.B).getScheme());
            default:
                return "android.resource".equals(((Uri) m44Var.B).getScheme());
        }
    }

    @Override // defpackage.xk5
    public aj c(m44 m44Var, int i) {
        Resources resourcesForApplication;
        int parseInt;
        int i2 = this.a;
        Context context = this.b;
        switch (i2) {
            case 0:
                return new aj(hi2.P(context.getContentResolver().openInputStream((Uri) m44Var.B)), qw4.DISK);
            default:
                StringBuilder sb = ck7.a;
                m44Var.getClass();
                Uri uri = (Uri) m44Var.B;
                if (uri == null) {
                    resourcesForApplication = context.getResources();
                } else {
                    String authority = uri.getAuthority();
                    if (authority != null) {
                        try {
                            resourcesForApplication = context.getPackageManager().getResourcesForApplication(authority);
                        } catch (PackageManager.NameNotFoundException unused) {
                            throw new FileNotFoundException(xg6.n(uri, "Unable to obtain resources for package: "));
                        }
                    } else {
                        throw new FileNotFoundException(xg6.n(uri, "No package provided: "));
                    }
                }
                if (uri == null) {
                    parseInt = 0;
                } else {
                    String authority2 = uri.getAuthority();
                    if (authority2 != null) {
                        List<String> pathSegments = uri.getPathSegments();
                        if (pathSegments != null && !pathSegments.isEmpty()) {
                            if (pathSegments.size() == 1) {
                                try {
                                    parseInt = Integer.parseInt(pathSegments.get(0));
                                } catch (NumberFormatException unused2) {
                                    throw new FileNotFoundException(xg6.n(uri, "Last path segment is not a resource ID: "));
                                }
                            } else if (pathSegments.size() == 2) {
                                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                            } else {
                                throw new FileNotFoundException(xg6.n(uri, "More than two path segments: "));
                            }
                        } else {
                            throw new FileNotFoundException(xg6.n(uri, "No path segments: "));
                        }
                    } else {
                        throw new FileNotFoundException(xg6.n(uri, "No package provided: "));
                    }
                }
                Bitmap decodeResource = BitmapFactory.decodeResource(resourcesForApplication, parseInt, null);
                qw4 qw4Var = qw4.DISK;
                if (decodeResource != null) {
                    return new aj(decodeResource, (in6) null, qw4Var, 0);
                }
                u34.x("bitmap == null");
                return null;
        }
    }
}

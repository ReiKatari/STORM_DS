package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t01  reason: default package */
/* loaded from: classes.dex */
public class t01 extends fb5 {
    public final /* synthetic */ int a;
    public final Context b;

    public /* synthetic */ t01(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.fb5
    public boolean a(n85 n85Var) {
        switch (this.a) {
            case 0:
                return "content".equals(((Uri) n85Var.B).getScheme());
            default:
                return "android.resource".equals(((Uri) n85Var.B).getScheme());
        }
    }

    @Override // defpackage.fb5
    public oi c(n85 n85Var, int i) {
        Resources resourcesForApplication;
        int parseInt;
        int i2 = this.a;
        Context context = this.b;
        switch (i2) {
            case 0:
                return new oi(sn2.P(context.getContentResolver().openInputStream((Uri) n85Var.B)), ln4.DISK);
            default:
                StringBuilder sb = e67.a;
                n85Var.getClass();
                Uri uri = (Uri) n85Var.B;
                if (uri == null) {
                    resourcesForApplication = context.getResources();
                } else {
                    String authority = uri.getAuthority();
                    if (authority != null) {
                        try {
                            resourcesForApplication = context.getPackageManager().getResourcesForApplication(authority);
                        } catch (PackageManager.NameNotFoundException unused) {
                            throw new FileNotFoundException(wh1.i(uri, "Unable to obtain resources for package: "));
                        }
                    } else {
                        throw new FileNotFoundException(wh1.i(uri, "No package provided: "));
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
                                    throw new FileNotFoundException(wh1.i(uri, "Last path segment is not a resource ID: "));
                                }
                            } else if (pathSegments.size() == 2) {
                                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                            } else {
                                throw new FileNotFoundException(wh1.i(uri, "More than two path segments: "));
                            }
                        } else {
                            throw new FileNotFoundException(wh1.i(uri, "No path segments: "));
                        }
                    } else {
                        throw new FileNotFoundException(wh1.i(uri, "No package provided: "));
                    }
                }
                Bitmap decodeResource = BitmapFactory.decodeResource(resourcesForApplication, parseInt, null);
                ln4 ln4Var = ln4.DISK;
                if (decodeResource != null) {
                    return new oi(decodeResource, (sb6) null, ln4Var, 0);
                }
                c44.i("bitmap == null");
                return null;
        }
    }
}

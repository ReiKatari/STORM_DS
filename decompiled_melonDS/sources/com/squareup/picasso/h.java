package com.squareup.picasso;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import cd.h1;
import java.io.FileNotFoundException;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class h extends f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3229a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f3230b;

    public /* synthetic */ h(Context context, int i2) {
        this.f3229a = i2;
        this.f3230b = context;
    }

    @Override // com.squareup.picasso.f0
    public boolean a(a4.n nVar) {
        switch (this.f3229a) {
            case 0:
                return "content".equals(((Uri) nVar.B).getScheme());
            default:
                return "android.resource".equals(((Uri) nVar.B).getScheme());
        }
    }

    @Override // com.squareup.picasso.f0
    public h1 c(a4.n nVar, int i2) {
        Resources resourcesForApplication;
        int parseInt;
        int i10 = this.f3229a;
        Context context = this.f3230b;
        switch (i10) {
            case 0:
                return new h1(ij.a.w0(context.getContentResolver().openInputStream((Uri) nVar.B)), y.DISK);
            default:
                StringBuilder sb2 = k0.f3247a;
                nVar.getClass();
                Uri uri = (Uri) nVar.B;
                if (uri == null) {
                    resourcesForApplication = context.getResources();
                } else {
                    String authority = uri.getAuthority();
                    if (authority != null) {
                        try {
                            resourcesForApplication = context.getPackageManager().getResourcesForApplication(authority);
                        } catch (PackageManager.NameNotFoundException unused) {
                            throw new FileNotFoundException(kc.a.f("Unable to obtain resources for package: ", uri));
                        }
                    } else {
                        throw new FileNotFoundException(kc.a.f("No package provided: ", uri));
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
                                    throw new FileNotFoundException(kc.a.f("Last path segment is not a resource ID: ", uri));
                                }
                            } else if (pathSegments.size() == 2) {
                                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                            } else {
                                throw new FileNotFoundException(kc.a.f("More than two path segments: ", uri));
                            }
                        } else {
                            throw new FileNotFoundException(kc.a.f("No path segments: ", uri));
                        }
                    } else {
                        throw new FileNotFoundException(kc.a.f("No package provided: ", uri));
                    }
                }
                Bitmap decodeResource = BitmapFactory.decodeResource(resourcesForApplication, parseInt, null);
                y yVar = y.DISK;
                if (decodeResource != null) {
                    return new h1(decodeResource, (fj.g0) null, yVar, 0);
                }
                m9.o.i("bitmap == null");
                return null;
        }
    }
}

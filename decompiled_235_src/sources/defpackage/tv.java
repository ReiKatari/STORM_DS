package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import java.io.InputStream;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tv  reason: default package */
/* loaded from: classes.dex */
public final class tv implements la2 {
    public final /* synthetic */ int a;
    public final Uri b;
    public final fo4 c;

    public /* synthetic */ tv(Uri uri, fo4 fo4Var, int i) {
        this.a = i;
        this.b = uri;
        this.c = fo4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d7  */
    /* JADX WARN: Type inference failed for: r10v25, types: [qo2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [qo2, java.lang.Object] */
    @Override // defpackage.la2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r41 r41Var) {
        InputStream openInputStream;
        List<String> pathSegments;
        int size;
        pj1 pj1Var;
        Bundle bundle;
        AssetFileDescriptor openTypedAssetFile;
        pj1 pj1Var2;
        Integer h0;
        Resources resourcesForApplication;
        Drawable drawable;
        int i = this.a;
        Uri uri = this.b;
        fo4 fo4Var = this.c;
        boolean z = true;
        switch (i) {
            case 0:
                String P0 = gt0.P0(gt0.D0(uri.getPathSegments(), 1), "/", null, null, null, 62);
                return new mn6(new jn6(new fe5(hi2.P(fo4Var.a.getAssets().open(P0))), new Object()), k.b(MimeTypeMap.getSingleton(), P0), zb1.DISK);
            case 1:
                ContentResolver contentResolver = fo4Var.a.getContentResolver();
                if (nb3.k(uri.getAuthority(), "com.android.contacts") && nb3.k(uri.getLastPathSegment(), "display_photo")) {
                    AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    if (openAssetFileDescriptor != null) {
                        openInputStream = openAssetFileDescriptor.createInputStream();
                    } else {
                        openInputStream = null;
                    }
                    if (openInputStream == null) {
                        e41.g(uri, "'.", "Unable to find a contact photo associated with '");
                        return null;
                    }
                } else if (Build.VERSION.SDK_INT >= 29 && nb3.k(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && nb3.k(pathSegments.get(size - 3), "audio") && nb3.k(pathSegments.get(size - 2), "albums")) {
                    wi6 wi6Var = fo4Var.d;
                    ge7 ge7Var = wi6Var.a;
                    if (ge7Var instanceof pj1) {
                        pj1Var = (pj1) ge7Var;
                    } else {
                        pj1Var = null;
                    }
                    if (pj1Var != null) {
                        int i2 = pj1Var.m;
                        ge7 ge7Var2 = wi6Var.b;
                        if (ge7Var2 instanceof pj1) {
                            pj1Var2 = (pj1) ge7Var2;
                        } else {
                            pj1Var2 = null;
                        }
                        if (pj1Var2 != null) {
                            int i3 = pj1Var2.m;
                            bundle = new Bundle(1);
                            bundle.putParcelable("android.content.extra.SIZE", new Point(i2, i3));
                            openTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                            if (openTypedAssetFile == null) {
                                openInputStream = openTypedAssetFile.createInputStream();
                            } else {
                                openInputStream = null;
                            }
                            if (openInputStream == null) {
                                e41.g(uri, "'.", "Unable to find a music thumbnail associated with '");
                                return null;
                            }
                        }
                    }
                    bundle = null;
                    openTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                    if (openTypedAssetFile == null) {
                    }
                    if (openInputStream == null) {
                    }
                } else {
                    openInputStream = contentResolver.openInputStream(uri);
                    if (openInputStream == null) {
                        e41.g(uri, "'.", "Unable to open '");
                        return null;
                    }
                }
                return new mn6(new jn6(new fe5(hi2.P(openInputStream)), new Object()), contentResolver.getType(uri), zb1.DISK);
            default:
                String authority = uri.getAuthority();
                if (authority != null) {
                    if (qs6.v0(authority)) {
                        authority = null;
                    }
                    if (authority != null) {
                        String str = (String) gt0.R0(uri.getPathSegments());
                        if (str != null && (h0 = xs6.h0(str)) != null) {
                            int intValue = h0.intValue();
                            Context context = fo4Var.a;
                            if (authority.equals(context.getPackageName())) {
                                resourcesForApplication = context.getResources();
                            } else {
                                resourcesForApplication = context.getPackageManager().getResourcesForApplication(authority);
                            }
                            TypedValue typedValue = new TypedValue();
                            resourcesForApplication.getValue(intValue, typedValue, true);
                            CharSequence charSequence = typedValue.string;
                            String b = k.b(MimeTypeMap.getSingleton(), charSequence.subSequence(qs6.x0('/', 0, 6, charSequence), charSequence.length()).toString());
                            if (nb3.k(b, "text/xml")) {
                                if (authority.equals(context.getPackageName())) {
                                    drawable = hf.S(context, intValue);
                                    if (drawable == null) {
                                        u34.f(lb1.g(intValue, "Invalid resource ID: "));
                                        return null;
                                    }
                                } else {
                                    XmlResourceParser xml = resourcesForApplication.getXml(intValue);
                                    int next = xml.next();
                                    while (next != 2 && next != 1) {
                                        next = xml.next();
                                    }
                                    if (next == 2) {
                                        Resources.Theme theme = context.getTheme();
                                        ThreadLocal threadLocal = sl5.a;
                                        drawable = resourcesForApplication.getDrawable(intValue, theme);
                                        if (drawable == null) {
                                            u34.f(lb1.g(intValue, "Invalid resource ID: "));
                                            return null;
                                        }
                                    } else {
                                        throw new XmlPullParserException("No start tag found.");
                                    }
                                }
                                if (!(drawable instanceof VectorDrawable) && !(drawable instanceof bl7)) {
                                    z = false;
                                }
                                BitmapDrawable bitmapDrawable = drawable;
                                if (z) {
                                    bitmapDrawable = new BitmapDrawable(context.getResources(), g04.A(drawable, fo4Var.b, fo4Var.d, fo4Var.e, fo4Var.f));
                                }
                                return new wo1(bitmapDrawable, z, zb1.DISK);
                            }
                            TypedValue typedValue2 = new TypedValue();
                            return new mn6(new jn6(new fe5(hi2.P(resourcesForApplication.openRawResource(intValue, typedValue2))), new pl5(typedValue2.density)), b, zb1.DISK);
                        }
                        i.m(xg6.n(uri, "Invalid android.resource URI: "));
                        return null;
                    }
                }
                i.m(xg6.n(uri, "Invalid android.resource URI: "));
                return null;
        }
    }
}

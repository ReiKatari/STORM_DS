package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import androidx.preference.Preference;
import java.io.Closeable;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k  reason: default package */
/* loaded from: classes.dex */
public abstract class k {
    public static final Bitmap.Config[] a;
    public static final Bitmap.Config b;
    public static final xq2 c;

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, config2};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        a = configArr;
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        b = config;
        c = new xq2((String[]) new ArrayList(20).toArray(new String[0]));
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str != null && !zg6.B0(str)) {
            String X0 = zg6.X0('#', str, str);
            String X02 = zg6.X0('?', X0, X0);
            return mimeTypeMap.getMimeTypeFromExtension(zg6.U0('.', zg6.U0('/', X02, X02), ""));
        }
        return null;
    }

    public static final boolean c(Uri uri) {
        if (b53.x(uri.getScheme(), "file") && b53.x((String) tq0.M0(uri.getPathSegments()), "android_asset")) {
            return true;
        }
        return false;
    }

    public static final int d(ct3 ct3Var, uu5 uu5Var) {
        if (ct3Var instanceof lf1) {
            return ((lf1) ct3Var).o0;
        }
        int i = j.a[uu5Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Preference.DEFAULT_ORDER;
            }
            i.c();
            return 0;
        }
        return Integer.MIN_VALUE;
    }
}

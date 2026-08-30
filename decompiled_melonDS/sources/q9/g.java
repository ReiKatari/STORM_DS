package q9;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import androidx.preference.Preference;
import java.io.Closeable;
import java.util.ArrayList;
import m9.o;
import pi.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Bitmap.Config[] f12393a;

    /* renamed from: b  reason: collision with root package name */
    public static final Bitmap.Config f12394b;

    /* renamed from: c  reason: collision with root package name */
    public static final q f12395c;

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, config2};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        f12393a = configArr;
        if (i2 >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        f12394b = config;
        f12395c = new q((String[]) new ArrayList(20).toArray(new String[0]));
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str != null && !vc.h.j0(str)) {
            String A0 = vc.h.A0(vc.h.A0(str, '#'), '?');
            return mimeTypeMap.getMimeTypeFromExtension(vc.h.x0('.', vc.h.x0('/', A0, A0), ""));
        }
        return null;
    }

    public static final boolean c(Uri uri) {
        if (nc.k.a(uri.getScheme(), "file") && nc.k.a((String) zb.l.T(uri.getPathSegments()), "android_asset")) {
            return true;
        }
        return false;
    }

    public static final int d(ij.a aVar, n9.f fVar) {
        if (aVar instanceof n9.a) {
            return ((n9.a) aVar).f10110e;
        }
        int i2 = f.f12392a[fVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return Preference.DEFAULT_ORDER;
            }
            o.o();
            return 0;
        }
        return Integer.MIN_VALUE;
    }
}

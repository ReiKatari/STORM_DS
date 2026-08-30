package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class m {
    public static final k7.a0 A = new k7.a0(new l0.a(1));
    public static int B = -100;
    public static u5.c L = null;
    public static u5.c R = null;
    public static Boolean X = null;
    public static boolean Y = false;
    public static final a1.f Z = new a1.f(0);

    /* renamed from: b0  reason: collision with root package name */
    public static final Object f8439b0 = new Object();

    /* renamed from: c0  reason: collision with root package name */
    public static final Object f8440c0 = new Object();

    public static boolean d(Context context) {
        if (X == null) {
            try {
                int i2 = c0.A;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, c0.class), b0.a() | 128).metaData;
                if (bundle != null) {
                    X = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                X = Boolean.FALSE;
            }
        }
        return X.booleanValue();
    }

    public static void h(x xVar) {
        synchronized (f8439b0) {
            try {
                a1.f fVar = Z;
                fVar.getClass();
                a1.a aVar = new a1.a(fVar);
                while (aVar.hasNext()) {
                    m mVar = (m) ((WeakReference) aVar.next()).get();
                    if (mVar == xVar || mVar == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void f();

    public abstract void g();

    public abstract boolean i(int i2);

    public abstract void j(int i2);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);
}

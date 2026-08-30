package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hq  reason: default package */
/* loaded from: classes.dex */
public abstract class hq {
    public static final k06 A = new k06(new qf1(1));
    public static int B = -100;
    public static gr3 L = null;
    public static gr3 R = null;
    public static Boolean X = null;
    public static boolean Y = false;
    public static final hu Z = new hu(0);
    public static final Object c0 = new Object();
    public static final Object d0 = new Object();

    public static boolean c(Context context) {
        if (X == null) {
            try {
                int i = qs.A;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, qs.class), ps.a() | 128).metaData;
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

    public static void f(tq tqVar) {
        synchronized (c0) {
            try {
                hu huVar = Z;
                huVar.getClass();
                au auVar = new au(huVar);
                while (auVar.hasNext()) {
                    hq hqVar = (hq) ((WeakReference) auVar.next()).get();
                    if (hqVar == tqVar || hqVar == null) {
                        auVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int i);

    public abstract void h(int i);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k(CharSequence charSequence);
}

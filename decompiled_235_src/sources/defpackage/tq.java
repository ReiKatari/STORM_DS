package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tq  reason: default package */
/* loaded from: classes.dex */
public abstract class tq {
    public static final zb6 A = new zb6(new uj1(1));
    public static int B = -100;
    public static hy3 L = null;
    public static hy3 R = null;
    public static Boolean X = null;
    public static boolean Y = false;
    public static final zu Z = new zu(0);
    public static final Object d0 = new Object();
    public static final Object e0 = new Object();

    public static void a() {
        hy3 hy3Var;
        zu zuVar = Z;
        zuVar.getClass();
        su suVar = new su(zuVar);
        while (suVar.hasNext()) {
            tq tqVar = (tq) ((WeakReference) suVar.next()).get();
            if (tqVar != null) {
                fr frVar = (fr) tqVar;
                Context context = frVar.g0;
                if (e(context) && (hy3Var = L) != null && !hy3Var.equals(R)) {
                    A.execute(new qq(context, 1));
                }
                frVar.q(true, true);
            }
        }
    }

    public static Object b() {
        Context context;
        zu zuVar = Z;
        zuVar.getClass();
        su suVar = new su(zuVar);
        while (suVar.hasNext()) {
            tq tqVar = (tq) ((WeakReference) suVar.next()).get();
            if (tqVar != null && (context = ((fr) tqVar).g0) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    public static boolean e(Context context) {
        if (X == null) {
            try {
                int i = dt.A;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, dt.class), ct.a() | 128).metaData;
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

    public static void h(fr frVar) {
        synchronized (d0) {
            try {
                zu zuVar = Z;
                zuVar.getClass();
                su suVar = new su(zuVar);
                while (suVar.hasNext()) {
                    tq tqVar = (tq) ((WeakReference) suVar.next()).get();
                    if (tqVar == frVar || tqVar == null) {
                        suVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void j(hy3 hy3Var) {
        Objects.requireNonNull(hy3Var);
        if (Build.VERSION.SDK_INT >= 33) {
            Object b = b();
            if (b != null) {
                sq.b(b, rq.a(hy3Var.a.a.toLanguageTags()));
            }
        } else if (!hy3Var.equals(L)) {
            synchronized (d0) {
                L = hy3Var;
                a();
            }
        }
    }

    public static void p(Context context) {
        if (e(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!Y) {
                    A.execute(new qq(context, 0));
                    return;
                }
                return;
            }
            synchronized (e0) {
                try {
                    hy3 hy3Var = L;
                    if (hy3Var == null) {
                        if (R == null) {
                            R = hy3.a(lb4.G(context));
                        }
                        if (R.a.a.isEmpty()) {
                            return;
                        }
                        L = R;
                    } else if (!hy3Var.equals(R)) {
                        hy3 hy3Var2 = L;
                        R = hy3Var2;
                        lb4.F(context, hy3Var2.a.a.toLanguageTags());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void c();

    public abstract void d();

    public abstract void f();

    public abstract void g();

    public abstract boolean i(int i);

    public abstract void k(int i);

    public abstract void l(View view);

    public abstract void m(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void o(CharSequence charSequence);
}

package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gj0  reason: default package */
/* loaded from: classes.dex */
public final class gj0 {
    public static final Object s = new Object();
    public static final SparseArray t = new SparseArray();
    public final ij0 c;
    public final Executor d;
    public final Handler e;
    public final HandlerThread f;
    public if0 g;
    public mi0 h;
    public aj0 i;
    public rr6 j;
    public eb k;
    public final jp5 l;
    public final tb0 m;
    public final gh0 n;
    public final ex6 o;
    public fj0 p;
    public final Integer r;
    public final kh0 a = new kh0();
    public final Object b = new Object();
    public gx3 q = n33.L;

    /* JADX WARN: Code restructure failed: missing block: B:131:0x028f, code lost:
        r5 = r9;
        r9 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Type inference failed for: r0v32, types: [hl5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, qb0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gj0(Context context, wt3 wt3Var) {
        Application application;
        hj0 hj0Var;
        String str;
        Bundle bundle;
        int i;
        jp5 f67Var;
        tb0 tb0Var;
        gj0 gj0Var;
        Executor executor;
        this.p = fj0.UNINITIALIZED;
        Context a = q41.a(context);
        Context applicationContext = context.getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application instanceof hj0) {
            hj0Var = (hj0) application;
        } else {
            try {
                Context a2 = q41.a(context);
                Bundle bundle2 = a2.getPackageManager().getServiceInfo(new ComponentName(a2, MetadataHolderService.class), 640).metaData;
                if (bundle2 != null) {
                    str = bundle2.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER");
                } else {
                    str = null;
                }
            } catch (PackageManager.NameNotFoundException e) {
                e = e;
                kj2.w("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                hj0Var = null;
                if (hj0Var == null) {
                }
            } catch (ClassNotFoundException e2) {
                e = e2;
                kj2.w("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                hj0Var = null;
                if (hj0Var == null) {
                }
            } catch (IllegalAccessException e3) {
                e = e3;
                kj2.w("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                hj0Var = null;
                if (hj0Var == null) {
                }
            } catch (InstantiationException e4) {
                e = e4;
                kj2.w("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                hj0Var = null;
                if (hj0Var == null) {
                }
            } catch (NoSuchMethodException e5) {
                e = e5;
                kj2.w("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                hj0Var = null;
                if (hj0Var == null) {
                }
            } catch (NullPointerException e6) {
                e = e6;
                kj2.w("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                hj0Var = null;
                if (hj0Var == null) {
                }
            } catch (InvocationTargetException e7) {
                e = e7;
                kj2.w("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                hj0Var = null;
                if (hj0Var == null) {
                }
            }
            if (str == null) {
                kj2.v("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                hj0Var = null;
            } else {
                hj0Var = (hj0) Class.forName(str).getDeclaredConstructor(null).newInstance(null);
            }
        }
        if (hj0Var == null) {
            ij0 cameraXConfig = hj0Var.getCameraXConfig();
            this.c = cameraXConfig;
            v65 v65Var = (v65) cameraXConfig.A.b(ij0.g0, null);
            if (v65Var != null) {
                kj2.t("CameraX", "QuirkSettings from CameraXConfig: " + v65Var);
            } else {
                try {
                    bundle = a.getPackageManager().getServiceInfo(new ComponentName(a, x65.class), 640).metaData;
                } catch (PackageManager.NameNotFoundException unused) {
                    kj2.t("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
                }
                if (bundle == null) {
                    kj2.f0("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
                    v65Var = null;
                    kj2.t("CameraX", "QuirkSettings from app metadata: " + v65Var);
                } else {
                    v65Var = bl2.m(a, bundle);
                    kj2.t("CameraX", "QuirkSettings from app metadata: " + v65Var);
                }
            }
            if (v65Var == null) {
                v65Var = w65.b;
                kj2.t("CameraX", "QuirkSettings by default: " + v65Var);
            }
            ra4 ra4Var = w65.c.a;
            synchronized (ra4Var.c) {
                try {
                    if (!Objects.equals(((AtomicReference) ra4Var.d).getAndSet(v65Var), v65Var)) {
                        int i2 = ra4Var.a + 1;
                        ra4Var.a = i2;
                        if (!ra4Var.b) {
                            ra4Var.b = true;
                            Iterator it = ((CopyOnWriteArraySet) ra4Var.f).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    ((gq6) it.next()).a(i2);
                                } else {
                                    synchronized (ra4Var.c) {
                                        if (ra4Var.a == i2) {
                                            break;
                                        }
                                        gj0 gj0Var2 = this;
                                        Iterator it2 = ((CopyOnWriteArraySet) ra4Var.f).iterator();
                                        i2 = ra4Var.a;
                                    }
                                }
                            }
                            ra4Var.b = false;
                        }
                    }
                } finally {
                }
            }
            Executor executor2 = (Executor) this.c.A.b(ij0.X, null);
            Handler handler = (Handler) this.c.A.b(ij0.Y, null);
            executor2 = executor2 == null ? new gf0() : executor2;
            this.d = executor2;
            if (handler == null) {
                HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
                this.f = handlerThread;
                handlerThread.start();
                this.e = uj2.u(handlerThread.getLooper());
            } else {
                this.f = null;
                this.e = handler;
            }
            Integer num = (Integer) this.c.b(ij0.Z, null);
            this.r = num;
            synchronized (s) {
                try {
                    if (num != null) {
                        np2.u(num.intValue(), 3, 6, "minLogLevel");
                        SparseArray sparseArray = t;
                        if (sparseArray.get(num.intValue()) != null) {
                            i = ((Integer) sparseArray.get(num.intValue())).intValue() + 1;
                        } else {
                            i = 1;
                        }
                        sparseArray.put(num.intValue(), Integer.valueOf(i));
                        c();
                    }
                } finally {
                }
            }
            jp5 jp5Var = (jp5) this.c.A.b(ij0.f0, jp5.a);
            Objects.requireNonNull(jp5Var);
            long a3 = jp5Var.a();
            if (jp5Var instanceof ih0) {
                switch (((ih0) jp5Var).b) {
                    case 0:
                        f67Var = new ih0(0, a3);
                        break;
                    default:
                        f67Var = new ih0(1, a3);
                        break;
                }
            } else {
                f67Var = new f67(a3, jp5Var);
            }
            this.l = f67Var;
            this.n = new gh0(executor2, new ov2(this.e));
            this.o = new ex6(new ej0(a, 0));
            synchronized (this.b) {
                np2.A("CameraX.initInternal() should only be called once per instance", this.p == fj0.UNINITIALIZED);
                this.p = fj0.INITIALIZING;
                ?? obj = new Object();
                obj.c = new Object();
                tb0Var = new tb0(obj);
                obj.b = tb0Var;
                obj.a = i61.class;
                try {
                    gj0Var = this;
                    executor = executor2;
                } catch (Exception e8) {
                    e = e8;
                    gj0Var = this;
                }
                try {
                    executor.execute(new dj0(gj0Var, a, executor, 1, (qb0) obj, SystemClock.elapsedRealtime()));
                    obj.a = "CameraX initInternal";
                } catch (Exception e9) {
                    e = e9;
                    tb0Var.b(e);
                    gj0Var.m = tb0Var;
                    return;
                }
            }
            gj0Var.m = tb0Var;
            return;
        }
        i.m("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
        throw null;
    }

    public static void a(Integer num) {
        synchronized (s) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = t;
                int intValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (intValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(intValue));
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(ou ouVar) {
        int i;
        if (ln2.H()) {
            if (ouVar != null) {
                i = ouVar.a;
            } else {
                i = -1;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                rp.t(i, ln2.f0("CX:CameraProvider-RetryStatus"));
                return;
            }
            String f0 = ln2.f0("CX:CameraProvider-RetryStatus");
            try {
                if (ln2.f == null) {
                    ln2.f = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                }
                Method method = ln2.f;
                if (method != null) {
                    method.invoke(null, Long.valueOf(ln2.b), f0, Integer.valueOf(i));
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            } catch (Exception e) {
                ln2.F("traceCounter", e);
            }
        }
    }

    public static void c() {
        SparseArray sparseArray = t;
        if (sparseArray.size() == 0) {
            kj2.c = 3;
        } else if (sparseArray.get(3) != null) {
            kj2.c = 3;
        } else if (sparseArray.get(4) != null) {
            kj2.c = 4;
        } else if (sparseArray.get(5) != null) {
            kj2.c = 5;
        } else if (sparseArray.get(6) != null) {
            kj2.c = 6;
        }
    }
}

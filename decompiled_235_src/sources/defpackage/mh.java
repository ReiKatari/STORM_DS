package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mh  reason: default package */
/* loaded from: classes.dex */
public final class mh implements sk0 {
    public final t57 a;
    public final kf0 b;
    public final jr6 c;
    public final ld0 d;
    public final ks6 e;

    public mh(t57 t57Var, kf0 kf0Var, jr6 jr6Var, ld0 ld0Var, ks6 ks6Var) {
        t57Var.getClass();
        kf0Var.getClass();
        ld0Var.getClass();
        ks6Var.getClass();
        this.a = t57Var;
        this.b = kf0Var;
        this.c = jr6Var;
        this.d = ld0Var;
        this.e = ks6Var;
    }

    @Override // defpackage.sk0
    public final rk0 a(bf0 bf0Var, Map map, yk0 yk0Var) {
        Integer num;
        nc0 nc0Var;
        bf0Var.getClass();
        map.getClass();
        yk0Var.getClass();
        kf0 kf0Var = this.b;
        if (kf0Var.h == 2) {
            Object obj = kf0Var.g.get(ug0.a);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                if (this.b.d == null) {
                    qc0 qc0Var = (qc0) this.d.d(bf0Var.h());
                    Set set = (Set) qc0Var.Z.getValue();
                    ks6 ks6Var = this.e;
                    if (!set.contains(Integer.valueOf(intValue))) {
                        ks6Var.getClass();
                        Log.w("CXCP", bf0Var + " does not support extension mode " + intValue + ". Supported extensions are " + set);
                    }
                    if (this.b.e != null) {
                        synchronized (qc0Var.Y) {
                            nc0Var = (nc0) qc0Var.Y.get(Integer.valueOf(intValue));
                        }
                        if (nc0Var == null) {
                            ld0 ld0Var = qc0Var.L;
                            String str = qc0Var.A;
                            str.getClass();
                            int i = Build.VERSION.SDK_INT;
                            if (i >= 31) {
                                try {
                                    Trace.beginSection(((Object) xf0.b(str)) + "#awaitExtensionMetadata");
                                    synchronized (ld0Var.g) {
                                        nc0 nc0Var2 = (nc0) ld0Var.g.get(str);
                                        if (nc0Var2 == null) {
                                            if (!ld0.c(ld0Var)) {
                                                nc0Var2 = ld0.a(ld0Var, str, false, intValue);
                                                ld0Var.g.put(str, nc0Var2);
                                            } else {
                                                nc0Var = ld0.a(ld0Var, str, true, intValue);
                                            }
                                        }
                                        nc0Var = nc0Var2;
                                    }
                                    Trace.endSection();
                                    synchronized (qc0Var.Y) {
                                        qc0Var.Y.put(Integer.valueOf(intValue), nc0Var);
                                    }
                                } catch (Throwable th) {
                                    Trace.endSection();
                                    throw th;
                                }
                            } else {
                                throw new Exception(lb1.g(i, "Extension sessions are only supported on Android S or higher. Device SDK is "));
                            }
                        }
                        ks6 ks6Var2 = this.e;
                        if (!((Boolean) nc0Var.R.getValue()).booleanValue()) {
                            ks6Var2.getClass();
                            Log.w("CXCP", bf0Var + " does not support Postview streams");
                        }
                        if (this.b.e.a.size() != 1) {
                            i.m("Postview streams can only have one OutputStream.config object");
                            return null;
                        }
                    }
                    cp4 k = l.k(this.b, this.c, map);
                    if (k.a.isEmpty()) {
                        Log.w("CXCP", "Failed to create OutputConfigurations for " + this.b);
                        yk0Var.a();
                        return d90.q0;
                    } else if (k.b.isEmpty()) {
                        l82 l82Var = new l82(yk0Var);
                        ArrayList arrayList = k.a;
                        pi piVar = new pi(this.a.a());
                        kf0 kf0Var2 = this.b;
                        if (!bf0Var.e0(new k82(arrayList, piVar, yk0Var, kf0Var2.f, kf0Var2.g, Integer.valueOf(intValue), l82Var, k.c))) {
                            Log.w("CXCP", "Failed to create ExtensionCaptureSession from " + bf0Var + " for " + yk0Var + '!');
                            yk0Var.a();
                            return d90.q0;
                        }
                        return new qk0(k.b, k.d);
                    } else {
                        i.m("Deferred output is not supported for Extensions");
                        return null;
                    }
                }
                i.m("Reprocessing is not supported for Extensions");
                return null;
            }
            i.m("The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph.");
            return null;
        }
        u34.h(q60.Z(this.b.h), " for Extension CameraGraph", "Unsupported session mode: ");
        return null;
    }
}

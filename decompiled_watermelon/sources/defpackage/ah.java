package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ah  reason: default package */
/* loaded from: classes.dex */
public final class ah implements ki0 {
    public final ct6 a;
    public final bd0 b;
    public final tf6 c;
    public final db0 d;
    public final tg6 e;

    public ah(ct6 ct6Var, bd0 bd0Var, tf6 tf6Var, db0 db0Var, tg6 tg6Var) {
        ct6Var.getClass();
        bd0Var.getClass();
        db0Var.getClass();
        tg6Var.getClass();
        this.a = ct6Var;
        this.b = bd0Var;
        this.c = tf6Var;
        this.d = db0Var;
        this.e = tg6Var;
    }

    @Override // defpackage.ki0
    public final ji0 a(sc0 sc0Var, Map map, qi0 qi0Var) {
        Integer num;
        fa0 fa0Var;
        sc0Var.getClass();
        map.getClass();
        qi0Var.getClass();
        bd0 bd0Var = this.b;
        if (bd0Var.h == 2) {
            Object obj = bd0Var.g.get(le0.a);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                if (this.b.d == null) {
                    ia0 ia0Var = (ia0) this.d.d(sc0Var.w());
                    Set set = (Set) ia0Var.Z.getValue();
                    tg6 tg6Var = this.e;
                    if (!set.contains(Integer.valueOf(intValue))) {
                        tg6Var.getClass();
                        Log.w("CXCP", sc0Var + " does not support extension mode " + intValue + ". Supported extensions are " + set);
                    }
                    if (this.b.e != null) {
                        synchronized (ia0Var.Y) {
                            fa0Var = (fa0) ia0Var.Y.get(Integer.valueOf(intValue));
                        }
                        if (fa0Var == null) {
                            db0 db0Var = ia0Var.L;
                            String str = ia0Var.A;
                            str.getClass();
                            int i = Build.VERSION.SDK_INT;
                            if (i >= 31) {
                                try {
                                    Trace.beginSection(((Object) od0.b(str)) + "#awaitExtensionMetadata");
                                    synchronized (db0Var.g) {
                                        fa0 fa0Var2 = (fa0) db0Var.g.get(str);
                                        if (fa0Var2 == null) {
                                            if (!db0.c(db0Var)) {
                                                fa0Var2 = db0.a(db0Var, str, false, intValue);
                                                db0Var.g.put(str, fa0Var2);
                                            } else {
                                                fa0Var = db0.a(db0Var, str, true, intValue);
                                            }
                                        }
                                        fa0Var = fa0Var2;
                                    }
                                    Trace.endSection();
                                    synchronized (ia0Var.Y) {
                                        ia0Var.Y.put(Integer.valueOf(intValue), fa0Var);
                                    }
                                } catch (Throwable th) {
                                    Trace.endSection();
                                    throw th;
                                }
                            } else {
                                throw new Exception(wh1.g(i, "Extension sessions are only supported on Android S or higher. Device SDK is "));
                            }
                        }
                        tg6 tg6Var2 = this.e;
                        if (!((Boolean) fa0Var.R.getValue()).booleanValue()) {
                            tg6Var2.getClass();
                            Log.w("CXCP", sc0Var + " does not support Postview streams");
                        }
                        if (this.b.e.a.size() != 1) {
                            i.n("Postview streams can only have one OutputStream.config object");
                            return null;
                        }
                    }
                    zf4 g = tq5.g(this.b, this.c, map);
                    if (g.a.isEmpty()) {
                        Log.w("CXCP", "Failed to create OutputConfigurations for " + this.b);
                        qi0Var.b();
                        return k45.X;
                    } else if (g.b.isEmpty()) {
                        t32 t32Var = new t32(qi0Var);
                        ArrayList arrayList = g.a;
                        di diVar = new di(this.a.a());
                        bd0 bd0Var2 = this.b;
                        if (!sc0Var.R(new s32(arrayList, diVar, qi0Var, bd0Var2.f, bd0Var2.g, Integer.valueOf(intValue), t32Var, g.c))) {
                            Log.w("CXCP", "Failed to create ExtensionCaptureSession from " + sc0Var + " for " + qi0Var + '!');
                            qi0Var.b();
                            return k45.X;
                        }
                        return new ii0(g.b, g.d);
                    } else {
                        i.n("Deferred output is not supported for Extensions");
                        return null;
                    }
                }
                i.n("Reprocessing is not supported for Extensions");
                return null;
            }
            i.n("The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph.");
            return null;
        }
        c44.g(mh7.i0(this.b.h), " for Extension CameraGraph", "Unsupported session mode: ");
        return null;
    }
}

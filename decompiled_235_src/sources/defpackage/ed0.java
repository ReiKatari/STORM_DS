package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ed0  reason: default package */
/* loaded from: classes.dex */
public final class ed0 {
    public final n55 a;
    public final t57 b;
    public final id0 c;
    public final n55 d;
    public final o41 e;
    public final Object f;
    public ArrayList g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;
    public final int j;
    public final be5 k;
    public final ex6 l;

    /* JADX WARN: Type inference failed for: r2v7, types: [int, boolean] */
    public ed0(n55 n55Var, t57 t57Var, Context context, PackageManager packageManager, id0 id0Var, n55 n55Var2, zg0 zg0Var, rc3 rc3Var) {
        n55Var.getClass();
        t57Var.getClass();
        packageManager.getClass();
        id0Var.getClass();
        n55Var2.getClass();
        zg0Var.getClass();
        rc3Var.getClass();
        this.a = n55Var;
        this.b = t57Var;
        this.c = id0Var;
        this.d = n55Var2;
        o41 i = g04.i(jw2.y(new tc3(rc3Var), t57Var.h).N(new r61("Camera2DeviceCache")));
        this.e = i;
        this.f = new Object();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        ?? hasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        int i2 = packageManager.hasSystemFeature("android.hardware.camera.front") ? hasSystemFeature + 1 : hasSystemFeature;
        this.j = i2;
        Log.d("CXCP", "Camera2DeviceCache: Expected minimum camera count = " + i2);
        zg0Var.a(wg0.SCOPE, new n0(this, 7));
        this.k = f04.P(f04.z(f04.p(new z(this, (r41) null, 12))), i, new mp6(0L, Long.MAX_VALUE), 1);
        this.l = new ex6(new a5(this, 11));
    }

    public static final void a(ed0 ed0Var, r35 r35Var, String str, boolean z) {
        ArrayList arrayList;
        synchronized (ed0Var.f) {
            arrayList = ed0Var.g;
        }
        int i = 0;
        ArrayList arrayList2 = null;
        if (z) {
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (nb3.k(((xf0) obj).a, str)) {
                        break;
                    }
                }
            }
            Log.i("CXCP", "New camera " + str + " detected");
            arrayList2 = ed0Var.d();
        } else if (!z) {
            if (arrayList != null) {
                if (!arrayList.isEmpty()) {
                    int size2 = arrayList.size();
                    while (i < size2) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        if (nb3.k(((xf0) obj2).a, str)) {
                            Log.i("CXCP", "Unavailable camera " + str + " detected");
                            arrayList2 = ed0Var.d();
                            break;
                        }
                    }
                }
            } else {
                Log.i("CXCP", "Unavailable camera " + str + " detected");
                arrayList2 = ed0Var.d();
                break;
            }
        } else {
            i.d();
            return;
        }
        if (arrayList2 != null && (arrayList2.size() >= ed0Var.j || arrayList == null)) {
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            e(r35Var, arrayList);
        }
    }

    public static void e(r35 r35Var, ArrayList arrayList) {
        Log.d("CXCP", "Emitting camera ID list: " + arrayList);
        if (f04.W(r35Var, arrayList) instanceof fm0) {
            Log.e("CXCP", "Failed to send camera ID list: " + arrayList + '!');
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, s41 s41Var) {
        bd0 bd0Var;
        int i;
        jg1 jg1Var;
        rb rbVar;
        if (s41Var instanceof bd0) {
            bd0Var = (bd0) s41Var;
            int i2 = bd0Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bd0Var.d0 = i2 - Integer.MIN_VALUE;
                Object obj = bd0Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = bd0Var.d0;
                if (i == 0) {
                    if (i == 1) {
                        jg1 jg1Var2 = bd0Var.X;
                        String str2 = bd0Var.R;
                        oi2.Y(obj);
                        jg1Var = jg1Var2;
                        str = str2;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (Build.VERSION.SDK_INT < 35) {
                        return null;
                    }
                    synchronized (this.f) {
                        try {
                            LinkedHashMap linkedHashMap = this.h;
                            xf0 xf0Var = new xf0(str);
                            Object obj2 = linkedHashMap.get(xf0Var);
                            if (obj2 == null) {
                                obj2 = hv.i(this.e, this.b.f, null, new cd0(str, this, null, 0), 2);
                                linkedHashMap.put(xf0Var, obj2);
                            }
                            jg1Var = (jg1) obj2;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    bd0Var.R = str;
                    bd0Var.X = jg1Var;
                    bd0Var.d0 = 1;
                    obj = jg1Var.X(bd0Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                rbVar = (rb) obj;
                if (rbVar != null) {
                    Log.d("CXCP", "Removing null CameraDeviceSetupCompat from cache for " + ((Object) xf0.b(str)));
                    synchronized (this.f) {
                        this.h.remove(new xf0(str), jg1Var);
                    }
                    return rbVar;
                }
                return rbVar;
            }
        }
        bd0Var = new bd0(this, s41Var);
        Object obj3 = bd0Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = bd0Var.d0;
        if (i == 0) {
        }
        rbVar = (rb) obj3;
        if (rbVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, s41 s41Var) {
        dd0 dd0Var;
        int i;
        jg1 jg1Var;
        hd0 hd0Var;
        if (s41Var instanceof dd0) {
            dd0Var = (dd0) s41Var;
            int i2 = dd0Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dd0Var.d0 = i2 - Integer.MIN_VALUE;
                Object obj = dd0Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = dd0Var.d0;
                if (i == 0) {
                    if (i == 1) {
                        jg1 jg1Var2 = dd0Var.X;
                        String str2 = dd0Var.R;
                        oi2.Y(obj);
                        jg1Var = jg1Var2;
                        str = str2;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    synchronized (this.f) {
                        try {
                            LinkedHashMap linkedHashMap = this.i;
                            xf0 xf0Var = new xf0(str);
                            Object obj2 = linkedHashMap.get(xf0Var);
                            if (obj2 == null) {
                                obj2 = hv.i(this.e, this.b.f, null, new cd0(str, this, null, 1), 2);
                                linkedHashMap.put(xf0Var, obj2);
                            }
                            jg1Var = (jg1) obj2;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    dd0Var.R = str;
                    dd0Var.X = jg1Var;
                    dd0Var.d0 = 1;
                    obj = jg1Var.X(dd0Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                hd0Var = (hd0) obj;
                if (hd0Var != null) {
                    Log.d("CXCP", "Removing null camera2DeviceSetupWrapper from cache for " + ((Object) xf0.b(str)));
                    synchronized (this.f) {
                        this.i.remove(new xf0(str), jg1Var);
                    }
                    return hd0Var;
                }
                return hd0Var;
            }
        }
        dd0Var = new dd0(this, s41Var);
        Object obj3 = dd0Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = dd0Var.d0;
        if (i == 0) {
        }
        hd0Var = (hd0) obj3;
        if (hd0Var != null) {
        }
    }

    public final ArrayList d() {
        try {
            String[] cameraIdList = ((CameraManager) this.a.get()).getCameraIdList();
            cameraIdList.getClass();
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList) {
                str.getClass();
                xf0.a(str);
                arrayList.add(new xf0(str));
            }
            if (arrayList.size() >= this.j) {
                synchronized (this.f) {
                    this.g = arrayList;
                }
                Log.i("CXCP", "Loaded CameraIdList " + arrayList);
                return arrayList;
            }
            Log.w("CXCP", "Failed to query camera ID list: Invalid list returned: " + arrayList + '.');
            return arrayList;
        } catch (CameraAccessException e) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!", e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!Unexpected ArrayIndexOutOfBoundsException thrown by framework.", e2);
            return null;
        } catch (NullPointerException e3) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!Null was returned by framework.", e3);
            return null;
        }
    }
}

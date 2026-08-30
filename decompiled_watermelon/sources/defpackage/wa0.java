package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wa0  reason: default package */
/* loaded from: classes.dex */
public final class wa0 {
    public final fw4 a;
    public final ct6 b;
    public final ab0 c;
    public final fw4 d;
    public final g11 e;
    public final Object f;
    public ArrayList g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;
    public final int j;
    public final o45 k;
    public final il6 l;

    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    public wa0(fw4 fw4Var, ct6 ct6Var, Context context, PackageManager packageManager, ab0 ab0Var, fw4 fw4Var2, qe0 qe0Var, c63 c63Var) {
        fw4Var.getClass();
        ct6Var.getClass();
        packageManager.getClass();
        ab0Var.getClass();
        fw4Var2.getClass();
        qe0Var.getClass();
        c63Var.getClass();
        this.a = fw4Var;
        this.b = ct6Var;
        this.c = ab0Var;
        this.d = fw4Var2;
        g11 c = iq2.c(se.O(new e63(c63Var), ct6Var.h).C(new j31("Camera2DeviceCache")));
        this.e = c;
        this.f = new Object();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        ?? hasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        int i = packageManager.hasSystemFeature("android.hardware.camera.front") ? hasSystemFeature + 1 : hasSystemFeature;
        this.j = i;
        Log.d("CXCP", "Camera2DeviceCache: Expected minimum camera count = " + i);
        qe0Var.a(ne0.SCOPE, new m0(7, this));
        this.k = se.U(se.q(se.k(new y(this, (j11) null, 12))), c, new xd6(0L, Long.MAX_VALUE), 1);
        this.l = new il6(new b5(11, this));
    }

    public static final void a(wa0 wa0Var, nu4 nu4Var, String str, boolean z) {
        ArrayList arrayList;
        synchronized (wa0Var.f) {
            arrayList = wa0Var.g;
        }
        int i = 0;
        ArrayList arrayList2 = null;
        if (z) {
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (b53.x(((od0) obj).a, str)) {
                        break;
                    }
                }
            }
            Log.i("CXCP", "New camera " + str + " detected");
            arrayList2 = wa0Var.d();
        } else if (!z) {
            if (arrayList != null) {
                if (!arrayList.isEmpty()) {
                    int size2 = arrayList.size();
                    while (i < size2) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        if (b53.x(((od0) obj2).a, str)) {
                            Log.i("CXCP", "Unavailable camera " + str + " detected");
                            arrayList2 = wa0Var.d();
                            break;
                        }
                    }
                }
            } else {
                Log.i("CXCP", "Unavailable camera " + str + " detected");
                arrayList2 = wa0Var.d();
                break;
            }
        } else {
            i.c();
            return;
        }
        if (arrayList2 != null && (arrayList2.size() >= wa0Var.j || arrayList == null)) {
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            e(nu4Var, arrayList);
        }
    }

    public static void e(nu4 nu4Var, ArrayList arrayList) {
        Log.d("CXCP", "Emitting camera ID list: " + arrayList);
        if (w81.I(nu4Var, arrayList) instanceof wj0) {
            Log.e("CXCP", "Failed to send camera ID list: " + arrayList + '!');
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r11, defpackage.k11 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.ta0
            if (r0 == 0) goto L13
            r0 = r12
            ta0 r0 = (defpackage.ta0) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            ta0 r0 = new ta0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.c0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            ic1 r11 = r0.X
            java.lang.String r0 = r0.R
            defpackage.me2.a0(r12)
            r2 = r11
            r11 = r0
            goto L76
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r10)
            return r3
        L34:
            defpackage.me2.a0(r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r12 >= r2) goto L3e
            return r3
        L3e:
            java.lang.Object r12 = r10.f
            monitor-enter(r12)
            java.util.LinkedHashMap r2 = r10.h     // Catch: java.lang.Throwable -> L63
            od0 r5 = new od0     // Catch: java.lang.Throwable -> L63
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L63
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L63
            if (r6 != 0) goto L65
            g11 r6 = r10.e     // Catch: java.lang.Throwable -> L63
            ct6 r7 = r10.b     // Catch: java.lang.Throwable -> L63
            g31 r7 = r7.f     // Catch: java.lang.Throwable -> L63
            ua0 r8 = new ua0     // Catch: java.lang.Throwable -> L63
            r9 = 0
            r8.<init>(r11, r10, r3, r9)     // Catch: java.lang.Throwable -> L63
            r9 = 2
            jc1 r6 = defpackage.tq5.e(r6, r7, r3, r8, r9)     // Catch: java.lang.Throwable -> L63
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            r10 = move-exception
            goto La4
        L65:
            r2 = r6
            ic1 r2 = (defpackage.ic1) r2     // Catch: java.lang.Throwable -> L63
            monitor-exit(r12)
            r0.R = r11
            r0.X = r2
            r0.c0 = r4
            java.lang.Object r12 = r2.F(r0)
            if (r12 != r1) goto L76
            return r1
        L76:
            lb r12 = (defpackage.lb) r12
            if (r12 != 0) goto La3
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Removing null CameraDeviceSetupCompat from cache for "
            r1.<init>(r3)
            java.lang.String r3 = defpackage.od0.b(r11)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            java.lang.Object r0 = r10.f
            monitor-enter(r0)
            java.util.LinkedHashMap r10 = r10.h     // Catch: java.lang.Throwable -> La0
            od0 r1 = new od0     // Catch: java.lang.Throwable -> La0
            r1.<init>(r11)     // Catch: java.lang.Throwable -> La0
            r10.remove(r1, r2)     // Catch: java.lang.Throwable -> La0
            monitor-exit(r0)
            return r12
        La0:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        La3:
            return r12
        La4:
            monitor-exit(r12)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa0.b(java.lang.String, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r11, defpackage.k11 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.va0
            if (r0 == 0) goto L13
            r0 = r12
            va0 r0 = (defpackage.va0) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            va0 r0 = new va0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.c0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            ic1 r11 = r0.X
            java.lang.String r0 = r0.R
            defpackage.me2.a0(r12)
            r2 = r11
            r11 = r0
            goto L6e
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r10)
            return r3
        L34:
            defpackage.me2.a0(r12)
            java.lang.Object r12 = r10.f
            monitor-enter(r12)
            java.util.LinkedHashMap r2 = r10.i     // Catch: java.lang.Throwable -> L5b
            od0 r5 = new od0     // Catch: java.lang.Throwable -> L5b
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L5b
            if (r6 != 0) goto L5d
            g11 r6 = r10.e     // Catch: java.lang.Throwable -> L5b
            ct6 r7 = r10.b     // Catch: java.lang.Throwable -> L5b
            g31 r7 = r7.f     // Catch: java.lang.Throwable -> L5b
            ua0 r8 = new ua0     // Catch: java.lang.Throwable -> L5b
            r8.<init>(r11, r10, r3, r4)     // Catch: java.lang.Throwable -> L5b
            r9 = 2
            jc1 r6 = defpackage.tq5.e(r6, r7, r3, r8, r9)     // Catch: java.lang.Throwable -> L5b
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r10 = move-exception
            goto L9c
        L5d:
            r2 = r6
            ic1 r2 = (defpackage.ic1) r2     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r12)
            r0.R = r11
            r0.X = r2
            r0.c0 = r4
            java.lang.Object r12 = r2.F(r0)
            if (r12 != r1) goto L6e
            return r1
        L6e:
            za0 r12 = (defpackage.za0) r12
            if (r12 != 0) goto L9b
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Removing null camera2DeviceSetupWrapper from cache for "
            r1.<init>(r3)
            java.lang.String r3 = defpackage.od0.b(r11)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            java.lang.Object r0 = r10.f
            monitor-enter(r0)
            java.util.LinkedHashMap r10 = r10.i     // Catch: java.lang.Throwable -> L98
            od0 r1 = new od0     // Catch: java.lang.Throwable -> L98
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L98
            r10.remove(r1, r2)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r0)
            return r12
        L98:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L9b:
            return r12
        L9c:
            monitor-exit(r12)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa0.c(java.lang.String, k11):java.lang.Object");
    }

    public final ArrayList d() {
        try {
            String[] cameraIdList = ((CameraManager) this.a.get()).getCameraIdList();
            cameraIdList.getClass();
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList) {
                str.getClass();
                od0.a(str);
                arrayList.add(new od0(str));
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

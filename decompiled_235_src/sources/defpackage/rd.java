package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rd  reason: default package */
/* loaded from: classes.dex */
public final class rd implements bf0 {
    public final lg0 A;
    public final CameraDevice B;
    public final String L;
    public final id0 R;
    public final u63 X;
    public final t57 Y;
    public final sw Z;
    public final xw d0;

    public rd(lg0 lg0Var, CameraDevice cameraDevice, String str, id0 id0Var, u63 u63Var, t57 t57Var) {
        lg0Var.getClass();
        str.getClass();
        id0Var.getClass();
        t57Var.getClass();
        this.A = lg0Var;
        this.B = cameraDevice;
        this.L = str;
        this.R = id0Var;
        this.X = u63Var;
        this.Y = t57Var;
        this.Z = g04.s(false);
        this.d0 = g04.u(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a A[Catch: all -> 0x00be, TryCatch #10 {all -> 0x00be, blocks: (B:27:0x00a4, B:29:0x00b0, B:31:0x00b6, B:36:0x00c7, B:39:0x00f2, B:40:0x0115, B:42:0x011b, B:43:0x0129, B:44:0x0133, B:46:0x0139, B:48:0x014b, B:50:0x0158, B:51:0x015c, B:53:0x016e, B:56:0x0178, B:57:0x017b, B:59:0x017d, B:60:0x0180, B:69:0x0196, B:71:0x019a, B:80:0x01c7, B:88:0x01ec, B:90:0x01f1, B:92:0x01f7, B:94:0x01fb, B:96:0x01ff, B:99:0x0204, B:101:0x0208, B:102:0x020e, B:103:0x020f), top: B:121:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f1 A[Catch: all -> 0x00be, TryCatch #10 {all -> 0x00be, blocks: (B:27:0x00a4, B:29:0x00b0, B:31:0x00b6, B:36:0x00c7, B:39:0x00f2, B:40:0x0115, B:42:0x011b, B:43:0x0129, B:44:0x0133, B:46:0x0139, B:48:0x014b, B:50:0x0158, B:51:0x015c, B:53:0x016e, B:56:0x0178, B:57:0x017b, B:59:0x017d, B:60:0x0180, B:69:0x0196, B:71:0x019a, B:80:0x01c7, B:88:0x01ec, B:90:0x01f1, B:92:0x01f7, B:94:0x01fb, B:96:0x01ff, B:99:0x0204, B:101:0x0208, B:102:0x020e, B:103:0x020f), top: B:121:0x003b }] */
    @Override // defpackage.bf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A(uc6 uc6Var) {
        String str;
        String str2;
        String str3;
        id0 id0Var;
        String str4;
        boolean z;
        jg7 jg7Var;
        id0 id0Var2;
        ArrayList arrayList;
        int i;
        Executor executor;
        CameraDevice cameraDevice = this.B;
        List list = uc6Var.b;
        vr4 a = a(uc6Var.e);
        boolean booleanValue = ((Boolean) a.A).booleanValue();
        zc6 zc6Var = (zc6) a.B;
        if (!booleanValue) {
            return false;
        }
        if (zc6Var != null) {
            b(zc6Var);
        }
        String str5 = this.L;
        String m = i61.m("CXCP#createCaptureSession-", str5);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(m);
                id0 id0Var3 = this.R;
                try {
                    int i2 = uc6Var.a;
                    ArrayList arrayList2 = uc6Var.c;
                    str3 = "%.3f ms";
                    try {
                        try {
                            arrayList = new ArrayList(ht0.v0(arrayList2, 10));
                            int size = arrayList2.size();
                            int i3 = 0;
                            while (i3 < size) {
                                try {
                                    Object obj = arrayList2.get(i3);
                                    i3++;
                                    int i4 = i2;
                                    arrayList.add((OutputConfiguration) ((xi) obj).e(gh5.a(OutputConfiguration.class)));
                                    i2 = i4;
                                } catch (Throwable th) {
                                    th = th;
                                    str2 = " - ";
                                    str = str3;
                                    Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, 1, null, str, i61.r(m, str2)));
                                    throw th;
                                }
                            }
                            i = i2;
                            executor = uc6Var.d;
                        } catch (Throwable th2) {
                            th = th2;
                            str = str3;
                            str2 = " - ";
                            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, 1, null, str, i61.r(m, str2)));
                            throw th;
                        }
                    } catch (Exception e) {
                        e = e;
                        id0Var = id0Var3;
                    }
                    try {
                        id0Var = id0Var3;
                        str4 = " - ";
                    } catch (Exception e2) {
                        e = e2;
                        id0Var = id0Var3;
                        str4 = " - ";
                        if (!(e instanceof CameraAccessException)) {
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            CameraAccessException cameraAccessException = (CameraAccessException) e;
                            int reason = cameraAccessException.getReason();
                            int i5 = 3;
                            boolean z2 = true;
                            if (reason != 1) {
                                if (reason != 2) {
                                    if (reason != 3) {
                                        if (reason != 4) {
                                            if (reason != 5) {
                                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                                i5 = 11;
                                            } else {
                                                i5 = 2;
                                            }
                                        } else {
                                            id0Var2 = id0Var;
                                            i5 = 1;
                                        }
                                    } else {
                                        id0Var2 = id0Var;
                                        i5 = 0;
                                    }
                                    z2 = true;
                                } else {
                                    i5 = 6;
                                }
                                id0Var2 = id0Var;
                                z2 = true;
                            } else {
                                id0Var2 = id0Var;
                            }
                            id0Var2.a(str5, i5, z2);
                        } else {
                            id0 id0Var4 = id0Var;
                            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                if (e instanceof IllegalStateException) {
                                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                } else {
                                    throw e;
                                }
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            z = false;
                            id0Var4.a(str5, 9, false);
                            jg7Var = null;
                            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, 1, null, str3, i61.r(m, str4)));
                            if (jg7Var == null) {
                            }
                            if (jg7Var == null) {
                            }
                        }
                        jg7Var = null;
                        z = false;
                        Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, 1, null, str3, i61.r(m, str4)));
                        if (jg7Var == null) {
                        }
                        if (jg7Var == null) {
                        }
                    }
                    try {
                        zd zdVar = new zd(this, uc6Var.e, zc6Var, this.R, this.X, this.Y.a());
                        executor.getClass();
                        SessionConfiguration c = j2.c(i, arrayList, executor, zdVar);
                        if (list != null) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                c.setInputConfiguration(vy7.q0(str5, list));
                            } else {
                                c.setInputConfiguration(new InputConfiguration(((j63) gt0.b1(list)).a, ((j63) gt0.b1(list)).b, ((j63) gt0.b1(list)).c));
                            }
                        }
                        try {
                            Trace.beginSection("createCaptureRequest");
                            CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(uc6Var.f);
                            Trace.endSection();
                            createCaptureRequest.getClass();
                            Set<CaptureRequest.Key> set = (Set) ((qc0) this.A).e0.getValue();
                            ArrayList arrayList3 = new ArrayList(ht0.v0(set, 10));
                            for (CaptureRequest.Key key : set) {
                                arrayList3.add(key.getName());
                            }
                            for (Map.Entry entry : uc6Var.g.entrySet()) {
                                Object key2 = entry.getKey();
                                Object value = entry.getValue();
                                if ((key2 instanceof CaptureRequest.Key) && arrayList3.contains(((CaptureRequest.Key) key2).getName())) {
                                    yh2.Q(createCaptureRequest, key2, value);
                                }
                            }
                            CaptureRequest build = createCaptureRequest.build();
                            build.getClass();
                            c.setSessionParameters(build);
                            try {
                                Trace.beginSection("Api28Compat.createCaptureSession");
                                cameraDevice.createCaptureSession(c);
                                Trace.endSection();
                                jg7Var = jg7.a;
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Exception e3) {
                        e = e3;
                        if (!(e instanceof CameraAccessException)) {
                        }
                        jg7Var = null;
                        z = false;
                        Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, 1, null, str3, i61.r(m, str4)));
                        if (jg7Var == null) {
                        }
                        if (jg7Var == null) {
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    id0Var = id0Var3;
                    str3 = "%.3f ms";
                } catch (Throwable th3) {
                    th = th3;
                    str3 = "%.3f ms";
                }
                z = false;
                Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, 1, null, str3, i61.r(m, str4)));
                if (jg7Var == null) {
                    Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                    if (zc6Var != null) {
                        c(zc6Var);
                    }
                }
                if (jg7Var == null) {
                    return true;
                }
                return z;
            } catch (Throwable th4) {
                th = th4;
                str = "%.3f ms";
                str2 = " - ";
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // defpackage.bf0
    public final CaptureRequest.Builder D(int i) {
        double d;
        CaptureRequest.Builder builder;
        StringBuilder sb = new StringBuilder("CXCP#createCaptureRequest-");
        String str = this.L;
        sb.append(str);
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            id0 id0Var = this.R;
            try {
                builder = this.B.createCaptureRequest(i);
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                int i2 = 0;
                try {
                    if (e instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        if (reason != 1) {
                            if (reason != 2) {
                                if (reason != 3) {
                                    if (reason != 4) {
                                        if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i2 = 11;
                                        } else {
                                            i2 = 2;
                                        }
                                    } else {
                                        i2 = 1;
                                    }
                                }
                            } else {
                                i2 = 6;
                            }
                        } else {
                            i2 = 3;
                        }
                        id0Var.a(str, i2, true);
                    } else {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                            if (e instanceof IllegalStateException) {
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            } else {
                                throw e;
                            }
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        id0Var.a(str, 9, false);
                    }
                    builder = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
            return builder;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0156  */
    @Override // defpackage.bf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F(ArrayList arrayList, le0 le0Var) {
        String str;
        int i;
        String str2;
        boolean z;
        zc6 zc6Var;
        boolean z2;
        jg7 jg7Var;
        int i2;
        t57 t57Var = this.Y;
        CameraDevice cameraDevice = this.B;
        le0Var.getClass();
        vr4 a = a(le0Var);
        boolean booleanValue = ((Boolean) a.A).booleanValue();
        zc6 zc6Var2 = (zc6) a.B;
        if (!booleanValue) {
            return false;
        }
        if (zc6Var2 != null) {
            b(zc6Var2);
        }
        String str3 = this.L;
        String m = i61.m("CXCP#createConstrainedHighSpeedCaptureSession-", str3);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(m);
            id0 id0Var = this.R;
            try {
                zc6Var = zc6Var2;
                try {
                    id0 id0Var2 = this.R;
                    u63 u63Var = this.X;
                    try {
                        Handler a2 = t57Var.a();
                        str2 = m;
                        z = 1;
                        try {
                            try {
                                cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, new zd(this, le0Var, zc6Var, id0Var2, u63Var, a2), t57Var.a());
                                jg7Var = jg7.a;
                                z2 = false;
                                i2 = z;
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof CameraAccessException) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i3 = 3;
                                    if (reason != z) {
                                        if (reason != 2) {
                                            if (reason != 3) {
                                                if (reason != 4) {
                                                    if (reason != 5) {
                                                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                                        i3 = 11;
                                                    } else {
                                                        i3 = 2;
                                                    }
                                                } else {
                                                    i3 = z ? 1 : 0;
                                                }
                                            } else {
                                                i3 = 0;
                                            }
                                        } else {
                                            i3 = 6;
                                        }
                                    }
                                    id0Var.a(str3, i3, z);
                                } else {
                                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                        if (e instanceof IllegalStateException) {
                                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                        } else {
                                            throw e;
                                        }
                                    }
                                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    z2 = false;
                                    id0Var.a(str3, 9, false);
                                    jg7Var = null;
                                    i2 = z;
                                    Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, i2, null, "%.3f ms", i61.r(str2, " - ")));
                                    if (jg7Var == null) {
                                    }
                                    if (jg7Var != null) {
                                    }
                                }
                                z2 = false;
                                jg7Var = null;
                                i2 = z;
                                Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, i2, null, "%.3f ms", i61.r(str2, " - ")));
                                if (jg7Var == null) {
                                }
                                if (jg7Var != null) {
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            str = str2;
                            i = z;
                            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, i, null, "%.3f ms", i61.r(str, " - ")));
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str2 = m;
                        z = 1;
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = m;
                        z = 1;
                    }
                } catch (Exception e3) {
                    e = e3;
                    z = 1;
                    str2 = m;
                } catch (Throwable th3) {
                    th = th3;
                    z = 1;
                    str2 = m;
                }
            } catch (Exception e4) {
                e = e4;
                str2 = m;
                zc6Var = zc6Var2;
                z = true;
            } catch (Throwable th4) {
                th = th4;
                str2 = m;
                z = 1;
            }
            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, i2, null, "%.3f ms", i61.r(str2, " - ")));
            if (jg7Var == null) {
                Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                if (zc6Var != null) {
                    c(zc6Var);
                }
            }
            if (jg7Var != null) {
                return i2;
            }
            return z2;
        } catch (Throwable th5) {
            th = th5;
            str = m;
            i = 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0156  */
    @Override // defpackage.bf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean N(List list, le0 le0Var) {
        String str;
        int i;
        String str2;
        boolean z;
        zc6 zc6Var;
        boolean z2;
        jg7 jg7Var;
        int i2;
        t57 t57Var = this.Y;
        CameraDevice cameraDevice = this.B;
        le0Var.getClass();
        vr4 a = a(le0Var);
        boolean booleanValue = ((Boolean) a.A).booleanValue();
        zc6 zc6Var2 = (zc6) a.B;
        if (!booleanValue) {
            return false;
        }
        if (zc6Var2 != null) {
            b(zc6Var2);
        }
        String str3 = this.L;
        String m = i61.m("CXCP#createCaptureSession-", str3);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(m);
            id0 id0Var = this.R;
            try {
                zc6Var = zc6Var2;
                try {
                    id0 id0Var2 = this.R;
                    u63 u63Var = this.X;
                    try {
                        Handler a2 = t57Var.a();
                        str2 = m;
                        z = 1;
                        try {
                            try {
                                cameraDevice.createCaptureSession(list, new zd(this, le0Var, zc6Var, id0Var2, u63Var, a2), t57Var.a());
                                jg7Var = jg7.a;
                                z2 = false;
                                i2 = z;
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof CameraAccessException) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i3 = 3;
                                    if (reason != z) {
                                        if (reason != 2) {
                                            if (reason != 3) {
                                                if (reason != 4) {
                                                    if (reason != 5) {
                                                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                                        i3 = 11;
                                                    } else {
                                                        i3 = 2;
                                                    }
                                                } else {
                                                    i3 = z ? 1 : 0;
                                                }
                                            } else {
                                                i3 = 0;
                                            }
                                        } else {
                                            i3 = 6;
                                        }
                                    }
                                    id0Var.a(str3, i3, z);
                                } else {
                                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                        if (e instanceof IllegalStateException) {
                                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                        } else {
                                            throw e;
                                        }
                                    }
                                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    z2 = false;
                                    id0Var.a(str3, 9, false);
                                    jg7Var = null;
                                    i2 = z;
                                    Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, i2, null, "%.3f ms", i61.r(str2, " - ")));
                                    if (jg7Var == null) {
                                    }
                                    if (jg7Var != null) {
                                    }
                                }
                                z2 = false;
                                jg7Var = null;
                                i2 = z;
                                Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, i2, null, "%.3f ms", i61.r(str2, " - ")));
                                if (jg7Var == null) {
                                }
                                if (jg7Var != null) {
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            str = str2;
                            i = z;
                            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, i, null, "%.3f ms", i61.r(str, " - ")));
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str2 = m;
                        z = 1;
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = m;
                        z = 1;
                    }
                } catch (Exception e3) {
                    e = e3;
                    z = 1;
                    str2 = m;
                } catch (Throwable th3) {
                    th = th3;
                    z = 1;
                    str2 = m;
                }
            } catch (Exception e4) {
                e = e4;
                str2 = m;
                zc6Var = zc6Var2;
                z = true;
            } catch (Throwable th4) {
                th = th4;
                str2 = m;
                z = 1;
            }
            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, i2, null, "%.3f ms", i61.r(str2, " - ")));
            if (jg7Var == null) {
                Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                if (zc6Var != null) {
                    c(zc6Var);
                }
            }
            if (jg7Var != null) {
                return i2;
            }
            return z2;
        } catch (Throwable th5) {
            th = th5;
            str = m;
            i = 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[Catch: all -> 0x009d, TryCatch #3 {all -> 0x009d, blocks: (B:21:0x008d, B:30:0x00a6, B:32:0x00aa, B:41:0x00d6, B:47:0x00f6, B:49:0x00fb, B:51:0x0101, B:53:0x0105, B:55:0x0109, B:58:0x010e, B:60:0x0112, B:61:0x0118, B:62:0x0119), top: B:75:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb A[Catch: all -> 0x009d, TryCatch #3 {all -> 0x009d, blocks: (B:21:0x008d, B:30:0x00a6, B:32:0x00aa, B:41:0x00d6, B:47:0x00f6, B:49:0x00fb, B:51:0x0101, B:53:0x0105, B:55:0x0109, B:58:0x010e, B:60:0x0112, B:61:0x0118, B:62:0x0119), top: B:75:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    @Override // defpackage.bf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U(ArrayList arrayList, le0 le0Var) {
        int i;
        id0 id0Var;
        boolean z;
        boolean z2;
        jg7 jg7Var;
        id0 id0Var2;
        ?? r9;
        boolean z3;
        ArrayList arrayList2;
        id0 id0Var3;
        u63 u63Var;
        ArrayList arrayList3 = arrayList;
        t57 t57Var = this.Y;
        CameraDevice cameraDevice = this.B;
        le0Var.getClass();
        vr4 a = a(le0Var);
        boolean booleanValue = ((Boolean) a.A).booleanValue();
        zc6 zc6Var = (zc6) a.B;
        if (!booleanValue) {
            return false;
        }
        if (zc6Var != null) {
            b(zc6Var);
        }
        String str = this.L;
        String m = i61.m("CXCP#createCaptureSessionByOutputConfigurations-", str);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(m);
            id0 id0Var4 = this.R;
            try {
                arrayList2 = new ArrayList(ht0.v0(arrayList3, 10));
                int size = arrayList3.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList3.get(i2);
                    i2++;
                    arrayList2.add((OutputConfiguration) ((xi) obj).e(gh5.a(OutputConfiguration.class)));
                    arrayList3 = arrayList;
                }
                id0Var3 = this.R;
                u63Var = this.X;
            } catch (Exception e) {
                e = e;
                id0Var = id0Var4;
            }
            try {
                Handler a2 = t57Var.a();
                id0Var = id0Var4;
                i = 1;
                z3 = true;
                z = true;
                try {
                    try {
                        cameraDevice.createCaptureSessionByOutputConfigurations(arrayList2, new zd(this, le0Var, zc6Var, id0Var3, u63Var, a2), t57Var.a());
                        jg7Var = jg7.a;
                    } catch (Exception e2) {
                        e = e2;
                        if (!(e instanceof CameraAccessException)) {
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            CameraAccessException cameraAccessException = (CameraAccessException) e;
                            int reason = cameraAccessException.getReason();
                            int i3 = 3;
                            if (reason != z) {
                                if (reason != 2) {
                                    if (reason != 3) {
                                        if (reason != 4) {
                                            if (reason != 5) {
                                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                                i3 = 11;
                                            } else {
                                                i3 = 2;
                                            }
                                        } else {
                                            i3 = z ? 1 : 0;
                                        }
                                    } else {
                                        id0Var2 = id0Var;
                                        i3 = 0;
                                        id0Var2.a(str, i3, z);
                                    }
                                } else {
                                    i3 = 6;
                                }
                            }
                            id0Var2 = id0Var;
                            id0Var2.a(str, i3, z);
                        } else {
                            id0 id0Var5 = id0Var;
                            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                if (e instanceof IllegalStateException) {
                                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                } else {
                                    throw e;
                                }
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            z2 = false;
                            id0Var5.a(str, 9, false);
                            jg7Var = null;
                            r9 = z;
                            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", i61.r(m, " - ")));
                            if (jg7Var == null) {
                            }
                            if (jg7Var == null) {
                            }
                        }
                        jg7Var = null;
                        z3 = z;
                        z2 = false;
                        r9 = z3;
                        Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", i61.r(m, " - ")));
                        if (jg7Var == null) {
                        }
                        if (jg7Var == null) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, i, null, "%.3f ms", i61.r(m, " - ")));
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                id0Var = id0Var4;
                z = true;
                if (!(e instanceof CameraAccessException)) {
                }
                jg7Var = null;
                z3 = z;
                z2 = false;
                r9 = z3;
                Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", i61.r(m, " - ")));
                if (jg7Var == null) {
                }
                if (jg7Var == null) {
                }
            }
            z2 = false;
            r9 = z3;
            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", i61.r(m, " - ")));
            if (jg7Var == null) {
                Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                if (zc6Var != null) {
                    c(zc6Var);
                }
            }
            if (jg7Var == null) {
                return r9;
            }
            return z2;
        } catch (Throwable th2) {
            th = th2;
            i = 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6 A[Catch: all -> 0x00ab, TryCatch #4 {all -> 0x00ab, blocks: (B:22:0x009c, B:30:0x00b2, B:32:0x00b6, B:41:0x00e3, B:47:0x0102, B:50:0x0108, B:52:0x010c, B:54:0x0110, B:56:0x0114, B:59:0x0119, B:61:0x011d, B:62:0x0123, B:63:0x0124), top: B:79:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108 A[Catch: all -> 0x00ab, TryCatch #4 {all -> 0x00ab, blocks: (B:22:0x009c, B:30:0x00b2, B:32:0x00b6, B:41:0x00e3, B:47:0x0102, B:50:0x0108, B:52:0x010c, B:54:0x0110, B:56:0x0114, B:59:0x0119, B:61:0x011d, B:62:0x0123, B:63:0x0124), top: B:79:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0180  */
    @Override // defpackage.bf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z(j63 j63Var, ArrayList arrayList, le0 le0Var) {
        long j;
        zc6 zc6Var;
        boolean z;
        jg7 jg7Var;
        InputConfiguration inputConfiguration;
        ArrayList arrayList2;
        ArrayList arrayList3 = arrayList;
        t57 t57Var = this.Y;
        CameraDevice cameraDevice = this.B;
        le0Var.getClass();
        vr4 a = a(le0Var);
        boolean booleanValue = ((Boolean) a.A).booleanValue();
        zc6 zc6Var2 = (zc6) a.B;
        if (!booleanValue) {
            return false;
        }
        if (zc6Var2 != null) {
            b(zc6Var2);
        }
        String str = this.L;
        String m = i61.m("CXCP#createReprocessableCaptureSessionByConfigurations-", str);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(m);
            id0 id0Var = this.R;
            try {
                inputConfiguration = new InputConfiguration(j63Var.a, j63Var.b, j63Var.c);
                arrayList2 = new ArrayList(ht0.v0(arrayList3, 10));
                int size = arrayList3.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList3.get(i);
                    i++;
                    arrayList2.add((OutputConfiguration) ((xi) obj).e(gh5.a(OutputConfiguration.class)));
                    arrayList3 = arrayList;
                }
                zc6Var = zc6Var2;
                try {
                    j = elapsedRealtimeNanos;
                } catch (Exception e) {
                    e = e;
                    j = elapsedRealtimeNanos;
                    if (!(e instanceof CameraAccessException)) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        int i2 = 3;
                        boolean z2 = true;
                        if (reason != 1) {
                            if (reason != 2) {
                                if (reason != 3) {
                                    if (reason != 4) {
                                        if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i2 = 11;
                                        } else {
                                            i2 = 2;
                                        }
                                    } else {
                                        z2 = true;
                                        i2 = 1;
                                    }
                                } else {
                                    z2 = true;
                                    i2 = 0;
                                }
                            } else {
                                i2 = 6;
                            }
                            z2 = true;
                        }
                        id0Var.a(str, i2, z2);
                    } else {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                            if (e instanceof IllegalStateException) {
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            } else {
                                throw e;
                            }
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        z = false;
                        id0Var.a(str, 9, false);
                        jg7Var = null;
                        Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(j) / 1000000.0d)}, 1, null, "%.3f ms", i61.r(m, " - ")));
                        if (jg7Var == null) {
                        }
                        if (jg7Var == null) {
                        }
                    }
                    z = false;
                    jg7Var = null;
                    Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(j) / 1000000.0d)}, 1, null, "%.3f ms", i61.r(m, " - ")));
                    if (jg7Var == null) {
                    }
                    if (jg7Var == null) {
                    }
                }
            } catch (Exception e2) {
                e = e2;
                zc6Var = zc6Var2;
            }
        } catch (Throwable th) {
            th = th;
            j = elapsedRealtimeNanos;
        }
        try {
            try {
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, arrayList2, new zd(this, le0Var, zc6Var, this.R, this.X, t57Var.a()), t57Var.a());
                jg7Var = jg7.a;
                z = false;
            } catch (Exception e3) {
                e = e3;
                if (!(e instanceof CameraAccessException)) {
                }
                z = false;
                jg7Var = null;
                Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(j) / 1000000.0d)}, 1, null, "%.3f ms", i61.r(m, " - ")));
                if (jg7Var == null) {
                }
                if (jg7Var == null) {
                }
            }
            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(j) / 1000000.0d)}, 1, null, "%.3f ms", i61.r(m, " - ")));
            if (jg7Var == null) {
                Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                if (zc6Var != null) {
                    c(zc6Var);
                }
            }
            if (jg7Var == null) {
                return true;
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(j) / 1000000.0d)}, 1, null, "%.3f ms", i61.r(m, " - ")));
            throw th;
        }
    }

    public final vr4 a(zc6 zc6Var) {
        if (this.Z.b()) {
            c(zc6Var);
            return new vr4(Boolean.FALSE, null);
        }
        return new vr4(Boolean.TRUE, this.d0.b(zc6Var));
    }

    @Override // defpackage.bf0
    public final void a0() {
        if (this.Z.b()) {
            zc6 zc6Var = (zc6) this.d0.b(null);
            if (zc6Var != null) {
                c(zc6Var);
                return;
            }
            return;
        }
        i.m("Check failed.");
    }

    public final void b(zc6 zc6Var) {
        try {
            Trace.beginSection(this + "#onSessionDisconnected");
            zc6Var.b();
        } finally {
            Trace.endSection();
        }
    }

    public final void c(zc6 zc6Var) {
        try {
            Trace.beginSection(this + "#onSessionFinalized");
            zc6Var.a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.hh7
    public final Object e(ar0 ar0Var) {
        if (ar0Var.equals(gh5.a(CameraDevice.class))) {
            return this.B;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[Catch: all -> 0x00b7, TryCatch #2 {all -> 0x00b7, blocks: (B:25:0x0096, B:27:0x00a1, B:29:0x00a7, B:31:0x00b3, B:36:0x00bd, B:37:0x00c4, B:38:0x00c5, B:46:0x00d9, B:48:0x00dd, B:57:0x010a, B:63:0x0129, B:66:0x012f, B:68:0x0133, B:70:0x0137, B:72:0x013b, B:75:0x0140, B:77:0x0144, B:78:0x014a, B:79:0x014b), top: B:95:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012f A[Catch: all -> 0x00b7, TryCatch #2 {all -> 0x00b7, blocks: (B:25:0x0096, B:27:0x00a1, B:29:0x00a7, B:31:0x00b3, B:36:0x00bd, B:37:0x00c4, B:38:0x00c5, B:46:0x00d9, B:48:0x00dd, B:57:0x010a, B:63:0x0129, B:66:0x012f, B:68:0x0133, B:70:0x0137, B:72:0x013b, B:75:0x0140, B:77:0x0144, B:78:0x014a, B:79:0x014b), top: B:95:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a7 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a9  */
    @Override // defpackage.bf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e0(k82 k82Var) {
        String str;
        long j;
        String str2;
        boolean z;
        jg7 jg7Var;
        pi piVar = k82Var.b;
        CameraDevice cameraDevice = this.B;
        Integer num = k82Var.f;
        l82 l82Var = k82Var.g;
        vr4 a = a(l82Var);
        boolean booleanValue = ((Boolean) a.A).booleanValue();
        zc6 zc6Var = (zc6) a.B;
        if (!booleanValue) {
            return false;
        }
        if (zc6Var != null) {
            b(zc6Var);
        }
        String str3 = this.L;
        String m = i61.m("CXCP#createExtensionSession-", str3);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(m);
                id0 id0Var = this.R;
                try {
                    int intValue = num.intValue();
                    ArrayList arrayList = k82Var.a;
                    j = elapsedRealtimeNanos;
                    try {
                        try {
                            ArrayList arrayList2 = new ArrayList(ht0.v0(arrayList, 10));
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                try {
                                    Object obj = arrayList.get(i);
                                    int i2 = i + 1;
                                    xi xiVar = (xi) obj;
                                    l82 l82Var2 = l82Var;
                                    arrayList2.add((OutputConfiguration) xiVar.e(gh5.a(OutputConfiguration.class)));
                                    l82Var = l82Var2;
                                    i = i2;
                                } catch (Throwable th) {
                                    th = th;
                                    str = "%.3f ms";
                                    Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(j) / 1000000.0d)}, 1, null, str, i61.r(m, " - ")));
                                    throw th;
                                }
                            }
                            str2 = "%.3f ms";
                            try {
                                ExtensionSessionConfiguration f = ma.f(intValue, arrayList2, piVar, new nh(this, l82Var, zc6Var, this.R, this.X, piVar));
                                xi xiVar2 = k82Var.h;
                                if (xiVar2 != null && Build.VERSION.SDK_INT >= 34) {
                                    OutputConfiguration outputConfiguration = (OutputConfiguration) xiVar2.e(gh5.a(OutputConfiguration.class));
                                    if (outputConfiguration != null) {
                                        f.setPostviewOutputConfiguration(outputConfiguration);
                                    } else {
                                        throw new IllegalStateException("Failed to unwrap Postview OutputConfiguration");
                                    }
                                }
                                cameraDevice.createExtensionSession(f);
                                jg7Var = jg7.a;
                                z = false;
                            } catch (Exception e) {
                                e = e;
                                if (!(e instanceof CameraAccessException)) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i3 = 3;
                                    boolean z2 = true;
                                    if (reason != 1) {
                                        if (reason != 2) {
                                            if (reason != 3) {
                                                if (reason != 4) {
                                                    if (reason != 5) {
                                                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                                        i3 = 11;
                                                    } else {
                                                        i3 = 2;
                                                    }
                                                } else {
                                                    z2 = true;
                                                    i3 = 1;
                                                }
                                            } else {
                                                z2 = true;
                                                i3 = 0;
                                            }
                                        } else {
                                            i3 = 6;
                                        }
                                        z2 = true;
                                    }
                                    id0Var.a(str3, i3, z2);
                                } else {
                                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                        if (e instanceof IllegalStateException) {
                                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                        } else {
                                            throw e;
                                        }
                                    }
                                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    z = false;
                                    id0Var.a(str3, 9, false);
                                    jg7Var = null;
                                    Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(j) / 1000000.0d)}, 1, null, str2, i61.r(m, " - ")));
                                    if (jg7Var == null) {
                                    }
                                    if (jg7Var == null) {
                                    }
                                }
                                z = false;
                                jg7Var = null;
                                Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(j) / 1000000.0d)}, 1, null, str2, i61.r(m, " - ")));
                                if (jg7Var == null) {
                                }
                                if (jg7Var == null) {
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str2 = "%.3f ms";
                            if (!(e instanceof CameraAccessException)) {
                            }
                            z = false;
                            jg7Var = null;
                            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(j) / 1000000.0d)}, 1, null, str2, i61.r(m, " - ")));
                            if (jg7Var == null) {
                            }
                            if (jg7Var == null) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str = "%.3f ms";
                        Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(j) / 1000000.0d)}, 1, null, str, i61.r(m, " - ")));
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    j = elapsedRealtimeNanos;
                } catch (Throwable th3) {
                    th = th3;
                    j = elapsedRealtimeNanos;
                }
                Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(j) / 1000000.0d)}, 1, null, str2, i61.r(m, " - ")));
                if (jg7Var == null) {
                    Log.w("CXCP", "Failed to create extension session from " + cameraDevice + ". Finalizing previous session");
                    if (zc6Var != null) {
                        c(zc6Var);
                    }
                }
                if (jg7Var == null) {
                    return true;
                }
                return z;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            str = "%.3f ms";
            j = elapsedRealtimeNanos;
        }
    }

    @Override // defpackage.bf0
    public final String h() {
        return this.L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0158  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    @Override // defpackage.bf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j0(InputConfiguration inputConfiguration, ArrayList arrayList, le0 le0Var) {
        String str;
        ?? r9;
        String str2;
        String str3;
        zc6 zc6Var;
        boolean z;
        boolean z2;
        jg7 jg7Var;
        ?? r92;
        t57 t57Var = this.Y;
        CameraDevice cameraDevice = this.B;
        le0Var.getClass();
        vr4 a = a(le0Var);
        boolean booleanValue = ((Boolean) a.A).booleanValue();
        zc6 zc6Var2 = (zc6) a.B;
        if (!booleanValue) {
            return false;
        }
        if (zc6Var2 != null) {
            b(zc6Var2);
        }
        String str4 = this.L;
        String m = i61.m("CXCP#createReprocessableCaptureSession-", str4);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(m);
                id0 id0Var = this.R;
                try {
                    zc6Var = zc6Var2;
                    try {
                        id0 id0Var2 = this.R;
                        u63 u63Var = this.X;
                        try {
                            Handler a2 = t57Var.a();
                            str3 = m;
                            z = true;
                            try {
                                cameraDevice.createReprocessableCaptureSession(inputConfiguration, arrayList, new zd(this, le0Var, zc6Var, id0Var2, u63Var, a2), t57Var.a());
                                jg7Var = jg7.a;
                                z2 = false;
                                r92 = z;
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof CameraAccessException) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i = 3;
                                    if (reason != z) {
                                        if (reason != 2) {
                                            if (reason != 3) {
                                                if (reason != 4) {
                                                    if (reason != 5) {
                                                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                                        i = 11;
                                                    } else {
                                                        i = 2;
                                                    }
                                                } else {
                                                    i = z ? 1 : 0;
                                                }
                                            } else {
                                                i = 0;
                                            }
                                        } else {
                                            i = 6;
                                        }
                                    }
                                    id0Var.a(str4, i, z);
                                } else {
                                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                        if (e instanceof IllegalStateException) {
                                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                        } else {
                                            throw e;
                                        }
                                    }
                                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    z2 = false;
                                    id0Var.a(str4, 9, false);
                                    jg7Var = null;
                                    r92 = z;
                                    Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, r92, null, "%.3f ms", i61.r(str3, " - ")));
                                    if (jg7Var == null) {
                                    }
                                    if (jg7Var != null) {
                                    }
                                }
                                z2 = false;
                                jg7Var = null;
                                r92 = z;
                                Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, r92, null, "%.3f ms", i61.r(str3, " - ")));
                                if (jg7Var == null) {
                                }
                                if (jg7Var != null) {
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = m;
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            str2 = m;
                            t57Var = 1;
                            str = str2;
                            r9 = t57Var;
                            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", i61.r(str, " - ")));
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        z = true;
                        str3 = m;
                    } catch (Throwable th2) {
                        th = th2;
                        t57Var = 1;
                        str2 = m;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str3 = m;
                    zc6Var = zc6Var2;
                    z = true;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = m;
                    t57Var = 1;
                }
                Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, r92, null, "%.3f ms", i61.r(str3, " - ")));
                if (jg7Var == null) {
                    Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                    if (zc6Var != null) {
                        c(zc6Var);
                    }
                }
                if (jg7Var != null) {
                    return r92;
                }
                return z2;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            str = m;
            r9 = 1;
            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, r9, null, "%.3f ms", i61.r(str, " - ")));
            throw th;
        }
    }

    @Override // defpackage.bf0
    public final CaptureRequest.Builder k(TotalCaptureResult totalCaptureResult) {
        double d;
        CaptureRequest.Builder builder;
        StringBuilder sb = new StringBuilder("CXCP#createReprocessCaptureRequest-");
        String str = this.L;
        sb.append(str);
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            id0 id0Var = this.R;
            try {
                builder = this.B.createReprocessCaptureRequest(totalCaptureResult);
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                int i = 0;
                try {
                    if (e instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        if (reason != 1) {
                            if (reason != 2) {
                                if (reason != 3) {
                                    if (reason != 4) {
                                        if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                    } else {
                                        i = 1;
                                    }
                                }
                            } else {
                                i = 6;
                            }
                        } else {
                            i = 3;
                        }
                        id0Var.a(str, i, true);
                    } else {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                            if (e instanceof IllegalStateException) {
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            } else {
                                throw e;
                            }
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        id0Var.a(str, 9, false);
                    }
                    builder = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
            return builder;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
            throw th;
        }
    }

    @Override // defpackage.bf0
    public final void n(int i) {
        try {
            Trace.beginSection("setCameraAudioRestriction");
            String str = this.L;
            id0 id0Var = this.R;
            try {
                this.B.setCameraAudioRestriction(i);
            } catch (Exception e) {
                int i2 = 0;
                if (e instanceof CameraAccessException) {
                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    if (reason != 1) {
                        if (reason != 2) {
                            if (reason != 3) {
                                if (reason != 4) {
                                    if (reason != 5) {
                                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                        i2 = 11;
                                    } else {
                                        i2 = 2;
                                    }
                                } else {
                                    i2 = 1;
                                }
                            }
                        } else {
                            i2 = 6;
                        }
                    } else {
                        i2 = 3;
                    }
                    id0Var.a(str, i2, true);
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        if (e instanceof IllegalStateException) {
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        } else {
                            throw e;
                        }
                    }
                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                    id0Var.a(str, 9, false);
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final String toString() {
        return "AndroidCameraDevice(camera=" + ((Object) xf0.b(this.L)) + ')';
    }

    @Override // defpackage.bf0
    public final void u() {
        zc6 zc6Var;
        if (this.Z.a() && (zc6Var = (zc6) this.d0.a) != null) {
            b(zc6Var);
        }
    }
}

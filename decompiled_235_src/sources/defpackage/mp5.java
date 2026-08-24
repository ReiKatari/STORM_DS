package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mp5  reason: default package */
/* loaded from: classes.dex */
public final class mp5 {
    public static final w31 i = new w31(23);
    public final ci0 a;
    public final id0 b;
    public final eb c;
    public final yx6 d;
    public final gg e;
    public final bx f;
    public final og0 g;
    public final t57 h;

    public mp5(ci0 ci0Var, id0 id0Var, eb ebVar, yx6 yx6Var, gg ggVar, bx bxVar, og0 og0Var, t57 t57Var) {
        id0Var.getClass();
        yx6Var.getClass();
        ggVar.getClass();
        bxVar.getClass();
        t57Var.getClass();
        this.a = ci0Var;
        this.b = id0Var;
        this.c = ebVar;
        this.d = yx6Var;
        this.e = ggVar;
        this.f = bxVar;
        this.g = og0Var;
        this.h = t57Var;
    }

    public final uz a(String str, gd0 gd0Var) {
        str.getClass();
        Log.d("CXCP", this + "#openAndAwaitCameraWithRetry(" + ((Object) xf0.b(str)) + ')');
        return (uz) hv.V(this.h.d, new kp5(this, str, gd0Var, null, 0));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(7:(2:3|(11:5|6|7|(1:(1:(1:(11:12|13|14|15|16|(1:18)|19|20|(4:22|23|24|(2:26|27)(2:29|(3:31|32|33)(6:34|35|36|(3:38|(1:40)|(6:46|47|(2:54|(1:56)(5:57|(1:59)(1:61)|60|50|(1:53)(7:52|15|16|(0)|19|20|(0))))|49|50|(0)(0))(3:43|44|45))(1:62)|41|(0)(0))))|63|64)(2:74|75))(6:76|77|78|23|24|(0)(0)))(1:79))(4:83|(1:85)|63|64)|80|81|82|20|(0)|63|64))|81|82|20|(0)|63|64)|88|6|7|(0)(0)|80|(2:(0)|(1:70))) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        r1 = r0;
        r5 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0184 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:14:0x0043, B:74:0x0250, B:76:0x0258, B:35:0x010d, B:42:0x0128, B:45:0x0131, B:47:0x015a, B:49:0x016f, B:53:0x017d, B:55:0x0184, B:59:0x01fc, B:70:0x022d, B:62:0x0209, B:65:0x0219, B:22:0x0070, B:46:0x014e), top: B:87:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0258 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:14:0x0043, B:74:0x0250, B:76:0x0258, B:35:0x010d, B:42:0x0128, B:45:0x0131, B:47:0x015a, B:49:0x016f, B:53:0x017d, B:55:0x0184, B:59:0x01fc, B:70:0x022d, B:62:0x0209, B:65:0x0219, B:22:0x0070, B:46:0x014e), top: B:87:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, bh5] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0249 -> B:16:0x004d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, gd0 gd0Var, qn2 qn2Var, s41 s41Var) {
        lp5 lp5Var;
        x61 x61Var;
        int i2;
        Throwable th;
        long elapsedRealtimeNanos;
        gd0 gd0Var2;
        qn2 qn2Var2;
        String str2;
        bh5 bh5Var;
        AutoCloseable autoCloseable;
        cc0 cc0Var;
        qn2 qn2Var3;
        long j;
        String str3;
        gd0 gd0Var3;
        bh5 bh5Var2;
        AutoCloseable autoCloseable2;
        vd vdVar;
        x61 x61Var2;
        long j2;
        long j3;
        Object l;
        try {
            if (s41Var instanceof lp5) {
                lp5Var = (lp5) s41Var;
                int i3 = lp5Var.i0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    lp5Var.i0 = i3 - Integer.MIN_VALUE;
                    Object obj = lp5Var.g0;
                    x61Var = x61.COROUTINE_SUSPENDED;
                    i2 = lp5Var.i0;
                    yx6 yx6Var = this.d;
                    int i4 = 1;
                    if (i2 == 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    long j4 = lp5Var.f0;
                                    cc0 cc0Var2 = lp5Var.e0;
                                    autoCloseable2 = lp5Var.d0;
                                    bh5 bh5Var3 = lp5Var.Z;
                                    qn2Var3 = lp5Var.Y;
                                    gd0Var3 = lp5Var.X;
                                    str3 = lp5Var.R;
                                    oi2.Y(obj);
                                    cc0 cc0Var3 = cc0Var2;
                                    x61 x61Var3 = x61Var;
                                    yx6 yx6Var2 = yx6Var;
                                    int i5 = 1;
                                    str2 = str3;
                                    elapsedRealtimeNanos = j4;
                                    if (!((Boolean) obj).booleanValue()) {
                                        Log.d("CXCP", "Timeout expired, retrying camera open for camera " + ((Object) xf0.b(str2)));
                                    }
                                    x61Var = x61Var3;
                                    autoCloseable = autoCloseable2;
                                    gd0Var2 = gd0Var3;
                                    bh5Var = bh5Var3;
                                    qn2Var2 = qn2Var3;
                                    yx6Var = yx6Var2;
                                    i4 = i5;
                                    th = null;
                                    cc0Var = cc0Var3;
                                    int i6 = bh5Var.A + i4;
                                    bh5Var.A = i6;
                                    ci0 ci0Var = this.a;
                                    bx bxVar = this.f;
                                    lp5Var.R = str2;
                                    lp5Var.X = gd0Var2;
                                    lp5Var.Y = qn2Var2;
                                    lp5Var.Z = bh5Var;
                                    lp5Var.d0 = autoCloseable;
                                    lp5Var.e0 = cc0Var;
                                    lp5Var.f0 = elapsedRealtimeNanos;
                                    bh5 bh5Var4 = bh5Var;
                                    lp5Var.i0 = 2;
                                    lp5 lp5Var2 = lp5Var;
                                    gd0 gd0Var4 = gd0Var2;
                                    long j5 = elapsedRealtimeNanos;
                                    String str4 = str2;
                                    l = ci0Var.l(str4, i6, j5, gd0Var4, bxVar, lp5Var2);
                                    if (l != x61Var) {
                                        bh5Var2 = bh5Var4;
                                        autoCloseable2 = autoCloseable;
                                        obj = l;
                                        qn2Var3 = qn2Var2;
                                        str3 = str4;
                                        j = j5;
                                        gd0Var3 = gd0Var4;
                                        lp5Var = lp5Var2;
                                        lm4 lm4Var = (lm4) obj;
                                        yx6Var.getClass();
                                        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - j;
                                        vdVar = lm4Var.a;
                                        df0 df0Var = lm4Var.b;
                                        if (vdVar == null) {
                                            lb4.p(autoCloseable2, th);
                                            return lm4Var;
                                        }
                                        Throwable th2 = th;
                                        if (df0Var == null) {
                                            Log.w("CXCP", "Camera open failed without an error. The CameraGraph may have been stopped or closed. Abandoning the camera open attempt.");
                                            lb4.p(autoCloseable2, th2);
                                            return lm4Var;
                                        }
                                        int i7 = df0Var.a;
                                        boolean booleanValue = ((Boolean) qn2Var3.g(jg7.a)).booleanValue();
                                        int i8 = df0Var.a;
                                        int i9 = bh5Var2.A;
                                        gg ggVar = this.e;
                                        ggVar.getClass();
                                        Trace.beginSection("DevicePolicyManager#getCameraDisabled");
                                        boolean cameraDisabled = ggVar.a.getCameraDisabled(null);
                                        Trace.endSection();
                                        boolean t = w31.t(i8, i9, elapsedRealtimeNanos2, cameraDisabled, booleanValue, this.g.c);
                                        long j6 = j;
                                        if (t) {
                                            yx6Var2 = yx6Var;
                                            x61Var2 = x61Var;
                                            if (bh5Var2.A > 1) {
                                            }
                                            if (!t) {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append("Failed to open camera ");
                                                sb.append((Object) xf0.b(str3));
                                                sb.append(" after ");
                                                sb.append(bh5Var2.A);
                                                sb.append(" attempts and ");
                                                sb.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{new Double((SystemClock.elapsedRealtimeNanos() - j6) / 1000000.0d)}, 1)));
                                                sb.append(". Last error was ");
                                                sb.append((Object) df0.a(i7));
                                                sb.append('.');
                                                Log.e("CXCP", sb.toString());
                                                lb4.p(autoCloseable2, null);
                                                return lm4Var;
                                            }
                                            if (w31.s(i7, booleanValue)) {
                                                sq1[] sq1VarArr = n16.o;
                                                if (sq1.a(elapsedRealtimeNanos2, sq1VarArr[0].a) >= 0) {
                                                    i5 = 1;
                                                    if (sq1.a(elapsedRealtimeNanos2, sq1VarArr[1].a) < 0) {
                                                        j2 = 2000;
                                                    } else {
                                                        j2 = 4000;
                                                    }
                                                    j3 = j2;
                                                    lp5Var.R = str3;
                                                    lp5Var.X = gd0Var3;
                                                    lp5Var.Y = qn2Var3;
                                                    lp5Var.Z = bh5Var2;
                                                    lp5Var.d0 = autoCloseable2;
                                                    lp5Var.e0 = cc0Var;
                                                    j4 = j6;
                                                    lp5Var.f0 = j4;
                                                    lp5Var.i0 = 3;
                                                    obj = cc0Var.e(j3, lp5Var);
                                                    x61Var3 = x61Var2;
                                                    if (obj != x61Var3) {
                                                        return x61Var3;
                                                    }
                                                    cc0 cc0Var4 = cc0Var;
                                                    bh5Var3 = bh5Var2;
                                                    cc0Var3 = cc0Var4;
                                                    str2 = str3;
                                                    elapsedRealtimeNanos = j4;
                                                    if (!((Boolean) obj).booleanValue()) {
                                                    }
                                                    x61Var = x61Var3;
                                                    autoCloseable = autoCloseable2;
                                                    gd0Var2 = gd0Var3;
                                                    bh5Var = bh5Var3;
                                                    qn2Var2 = qn2Var3;
                                                    yx6Var = yx6Var2;
                                                    i4 = i5;
                                                    th = null;
                                                    cc0Var = cc0Var3;
                                                    int i62 = bh5Var.A + i4;
                                                    bh5Var.A = i62;
                                                    ci0 ci0Var2 = this.a;
                                                    bx bxVar2 = this.f;
                                                    lp5Var.R = str2;
                                                    lp5Var.X = gd0Var2;
                                                    lp5Var.Y = qn2Var2;
                                                    lp5Var.Z = bh5Var;
                                                    lp5Var.d0 = autoCloseable;
                                                    lp5Var.e0 = cc0Var;
                                                    lp5Var.f0 = elapsedRealtimeNanos;
                                                    bh5 bh5Var42 = bh5Var;
                                                    lp5Var.i0 = 2;
                                                    lp5 lp5Var22 = lp5Var;
                                                    gd0 gd0Var42 = gd0Var2;
                                                    long j52 = elapsedRealtimeNanos;
                                                    String str42 = str2;
                                                    l = ci0Var2.l(str42, i62, j52, gd0Var42, bxVar2, lp5Var22);
                                                    if (l != x61Var) {
                                                    }
                                                }
                                            }
                                            j3 = 500;
                                            i5 = 1;
                                            lp5Var.R = str3;
                                            lp5Var.X = gd0Var3;
                                            lp5Var.Y = qn2Var3;
                                            lp5Var.Z = bh5Var2;
                                            lp5Var.d0 = autoCloseable2;
                                            lp5Var.e0 = cc0Var;
                                            j4 = j6;
                                            lp5Var.f0 = j4;
                                            lp5Var.i0 = 3;
                                            obj = cc0Var.e(j3, lp5Var);
                                            x61Var3 = x61Var2;
                                            if (obj != x61Var3) {
                                            }
                                        } else {
                                            x61Var2 = x61Var;
                                            yx6Var2 = yx6Var;
                                        }
                                        this.b.a(str3, i7, t);
                                        if (!t) {
                                        }
                                    }
                                    return x61Var;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            th = null;
                            long j7 = lp5Var.f0;
                            cc0 cc0Var5 = lp5Var.e0;
                            autoCloseable2 = lp5Var.d0;
                            bh5 bh5Var5 = lp5Var.Z;
                            qn2 qn2Var4 = lp5Var.Y;
                            gd0 gd0Var5 = lp5Var.X;
                            String str5 = lp5Var.R;
                            oi2.Y(obj);
                            cc0Var = cc0Var5;
                            bh5Var2 = bh5Var5;
                            gd0Var3 = gd0Var5;
                            qn2Var3 = qn2Var4;
                            j = j7;
                            str3 = str5;
                            lm4 lm4Var2 = (lm4) obj;
                            yx6Var.getClass();
                            long elapsedRealtimeNanos22 = SystemClock.elapsedRealtimeNanos() - j;
                            vdVar = lm4Var2.a;
                            df0 df0Var2 = lm4Var2.b;
                            if (vdVar == null) {
                            }
                        } else {
                            th = null;
                            elapsedRealtimeNanos = lp5Var.f0;
                            bh5Var = lp5Var.Z;
                            qn2 qn2Var5 = lp5Var.Y;
                            gd0 gd0Var6 = lp5Var.X;
                            str2 = lp5Var.R;
                            oi2.Y(obj);
                            qn2Var2 = qn2Var5;
                            gd0Var2 = gd0Var6;
                        }
                    } else {
                        th = null;
                        oi2.Y(obj);
                        yx6Var.getClass();
                        elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        ?? obj2 = new Object();
                        lp5Var.R = str;
                        gd0Var2 = gd0Var;
                        lp5Var.X = gd0Var2;
                        qn2Var2 = qn2Var;
                        lp5Var.Y = qn2Var2;
                        lp5Var.Z = obj2;
                        lp5Var.f0 = elapsedRealtimeNanos;
                        lp5Var.i0 = 1;
                        cc0 cc0Var6 = new cc0(this.c, str);
                        if (cc0Var6 != x61Var) {
                            str2 = str;
                            bh5Var = obj2;
                            obj = cc0Var6;
                        }
                        return x61Var;
                    }
                    autoCloseable = (AutoCloseable) obj;
                    cc0Var = (cc0) autoCloseable;
                    int i622 = bh5Var.A + i4;
                    bh5Var.A = i622;
                    ci0 ci0Var22 = this.a;
                    bx bxVar22 = this.f;
                    lp5Var.R = str2;
                    lp5Var.X = gd0Var2;
                    lp5Var.Y = qn2Var2;
                    lp5Var.Z = bh5Var;
                    lp5Var.d0 = autoCloseable;
                    lp5Var.e0 = cc0Var;
                    lp5Var.f0 = elapsedRealtimeNanos;
                    bh5 bh5Var422 = bh5Var;
                    lp5Var.i0 = 2;
                    lp5 lp5Var222 = lp5Var;
                    gd0 gd0Var422 = gd0Var2;
                    long j522 = elapsedRealtimeNanos;
                    String str422 = str2;
                    l = ci0Var22.l(str422, i622, j522, gd0Var422, bxVar22, lp5Var222);
                    if (l != x61Var) {
                    }
                    return x61Var;
                }
            }
            cc0Var = (cc0) autoCloseable;
            int i6222 = bh5Var.A + i4;
            bh5Var.A = i6222;
            ci0 ci0Var222 = this.a;
            bx bxVar222 = this.f;
            lp5Var.R = str2;
            lp5Var.X = gd0Var2;
            lp5Var.Y = qn2Var2;
            lp5Var.Z = bh5Var;
            lp5Var.d0 = autoCloseable;
            lp5Var.e0 = cc0Var;
            lp5Var.f0 = elapsedRealtimeNanos;
            bh5 bh5Var4222 = bh5Var;
            lp5Var.i0 = 2;
            lp5 lp5Var2222 = lp5Var;
            gd0 gd0Var4222 = gd0Var2;
            long j5222 = elapsedRealtimeNanos;
            String str4222 = str2;
            l = ci0Var222.l(str4222, i6222, j5222, gd0Var4222, bxVar222, lp5Var2222);
            if (l != x61Var) {
            }
            return x61Var;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            AutoCloseable autoCloseable3 = autoCloseable;
            try {
                throw th4;
            } catch (Throwable th5) {
                lb4.p(autoCloseable3, th4);
                throw th5;
            }
        }
        lp5Var = new lp5(this, s41Var);
        Object obj3 = lp5Var.g0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i2 = lp5Var.i0;
        yx6 yx6Var3 = this.d;
        int i42 = 1;
        if (i2 == 0) {
        }
        autoCloseable = (AutoCloseable) obj3;
    }
}

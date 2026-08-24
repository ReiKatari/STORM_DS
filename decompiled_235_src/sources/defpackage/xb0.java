package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xb0  reason: default package */
/* loaded from: classes.dex */
public final class xb0 {
    public final t57 a;
    public final ed0 b;
    public final ld0 c;
    public final e65 d;
    public final d51 e;
    public final Object f;
    public final LinkedHashSet g;

    public xb0(t57 t57Var, ed0 ed0Var, ld0 ld0Var, e65 e65Var, d51 d51Var, Context context) {
        t57Var.getClass();
        ed0Var.getClass();
        ld0Var.getClass();
        e65Var.getClass();
        this.a = t57Var;
        this.b = ed0Var;
        this.c = ld0Var;
        this.d = e65Var;
        this.e = d51Var;
        this.f = new Object();
        this.g = new LinkedHashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r2 == r4) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kf0 kf0Var, s41 s41Var) {
        wb0 wb0Var;
        x61 x61Var;
        int i;
        int i2;
        SessionConfiguration g;
        Object c;
        kf0 kf0Var2;
        rb rbVar;
        boolean equals;
        String str;
        OutputConfiguration outputConfiguration;
        hd0 hd0Var;
        CaptureRequest.Builder builder;
        Integer num;
        CaptureRequest.Key key;
        int i3;
        kf0 kf0Var3 = kf0Var;
        if (s41Var instanceof wb0) {
            wb0Var = (wb0) s41Var;
            int i4 = wb0Var.e0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                wb0Var.e0 = i4 - Integer.MIN_VALUE;
                Object obj = wb0Var.Z;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = wb0Var.e0;
                ed0 ed0Var = this.b;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            SessionConfiguration d = j2.d(wb0Var.Y);
                            rbVar = wb0Var.X;
                            kf0Var2 = wb0Var.R;
                            oi2.Y(obj);
                            g = d;
                            hd0Var = (hd0) obj;
                            if (hd0Var != null) {
                                int i5 = kf0Var2.f;
                                String str2 = hd0Var.b;
                                id0 id0Var = hd0Var.c;
                                try {
                                    builder = hd0Var.a.createCaptureRequest(i5);
                                } catch (Exception e) {
                                    if (e instanceof CameraAccessException) {
                                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                                        int reason = cameraAccessException.getReason();
                                        boolean z = true;
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
                                                        i3 = 1;
                                                    }
                                                } else {
                                                    i3 = 0;
                                                }
                                            } else {
                                                i3 = 6;
                                            }
                                            z = true;
                                        } else {
                                            i3 = 3;
                                        }
                                        id0Var.a(str2, i3, z);
                                    } else if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                        if (e instanceof IllegalStateException) {
                                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                        } else {
                                            throw e;
                                        }
                                    } else {
                                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                        id0Var.a(str2, 9, false);
                                    }
                                }
                                if (builder != null) {
                                    for (Map.Entry entry : kf0Var2.g.entrySet()) {
                                        Object key2 = entry.getKey();
                                        Object value = entry.getValue();
                                        if (key2 instanceof CaptureRequest.Key) {
                                            key = (CaptureRequest.Key) key2;
                                        } else {
                                            key = null;
                                        }
                                        if (key != null) {
                                            builder.set(key, value);
                                        }
                                    }
                                    CaptureRequest build = builder.build();
                                    build.getClass();
                                    g.getClass();
                                    g.setSessionParameters(build);
                                }
                                if (rbVar != null) {
                                    num = new Integer(rbVar.a(g).b);
                                } else {
                                    num = null;
                                }
                                if (num != null) {
                                    return new zy0(num.intValue());
                                }
                                return new zy0(0);
                            }
                            builder = null;
                            if (builder != null) {
                            }
                            if (rbVar != null) {
                            }
                            if (num != null) {
                            }
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        kf0Var3 = wb0Var.R;
                        oi2.Y(obj);
                    }
                } else {
                    oi2.Y(obj);
                    if (Build.VERSION.SDK_INT < 35) {
                        return new zy0(0);
                    }
                    String str3 = kf0Var3.a;
                    wb0Var.R = kf0Var3;
                    wb0Var.e0 = 1;
                    obj = ed0Var.b(str3, wb0Var);
                }
                rb rbVar2 = (rb) obj;
                i2 = kf0Var3.h;
                String str4 = kf0Var3.a;
                if (i2 != 0) {
                    i2 = 0;
                } else if (i2 == 1) {
                    i2 = 1;
                } else if (i2 == 2) {
                    Log.i("CXCP", "Unsupported session mode: " + ((Object) q60.Z(kf0Var3.h)));
                    return new zy0(0);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (ji0 ji0Var : kf0Var3.b) {
                    for (pp4 pp4Var : ji0Var.a) {
                        int i6 = pp4Var.b;
                        String str5 = pp4Var.c;
                        Integer valueOf = Integer.valueOf(i6);
                        vs0 vs0Var = vs0.p0;
                        rp4 rp4Var = pp4Var.d;
                        qp4 qp4Var = pp4Var.e;
                        sp4 sp4Var = pp4Var.f;
                        List list = pp4Var.h;
                        Size size = pp4Var.a;
                        if (str5 == null) {
                            equals = false;
                        } else {
                            equals = str5.equals(str4);
                        }
                        if (!equals) {
                            str = str5;
                        } else {
                            str = null;
                        }
                        xi q = cs1.q(null, valueOf, vs0Var, rp4Var, qp4Var, sp4Var, list, size, false, 0, str, 1536);
                        if (q != null && (outputConfiguration = (OutputConfiguration) q.e(gh5.a(OutputConfiguration.class))) != null) {
                            linkedHashSet.add(outputConfiguration);
                        }
                    }
                }
                g = xp.g(i2, gt0.k1(linkedHashSet));
                wb0Var.R = kf0Var3;
                wb0Var.X = rbVar2;
                wb0Var.Y = g;
                wb0Var.e0 = 2;
                c = ed0Var.c(str4, wb0Var);
                if (c != x61Var) {
                    kf0Var2 = kf0Var3;
                    rbVar = rbVar2;
                    obj = c;
                    hd0Var = (hd0) obj;
                    if (hd0Var != null) {
                    }
                    builder = null;
                    if (builder != null) {
                    }
                    if (rbVar != null) {
                    }
                    if (num != null) {
                    }
                }
                return x61Var;
            }
        }
        wb0Var = new wb0(this, s41Var);
        Object obj2 = wb0Var.Z;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = wb0Var.e0;
        ed0 ed0Var2 = this.b;
        if (i == 0) {
        }
        rb rbVar22 = (rb) obj2;
        i2 = kf0Var3.h;
        String str42 = kf0Var3.a;
        if (i2 != 0) {
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        while (r13.hasNext()) {
        }
        g = xp.g(i2, gt0.k1(linkedHashSet2));
        wb0Var.R = kf0Var3;
        wb0Var.X = rbVar22;
        wb0Var.Y = g;
        wb0Var.e0 = 2;
        c = ed0Var2.c(str42, wb0Var);
        if (c != x61Var) {
        }
        return x61Var;
    }
}

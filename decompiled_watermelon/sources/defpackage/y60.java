package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y60  reason: default package */
/* loaded from: classes.dex */
public final class y60 implements t11, jp0, sc5, d31, bi6, ea7, u70, s01 {
    public final /* synthetic */ int A;
    public static final y60 B = new y60(0);
    public static final j20 L = new j20(-1.0f, -1.0f);
    public static final j20 R = new j20(RecyclerView.A1, -1.0f);
    public static final j20 X = new j20(1.0f, -1.0f);
    public static final j20 Y = new j20(-1.0f, RecyclerView.A1);
    public static final j20 Z = new j20(RecyclerView.A1, RecyclerView.A1);
    public static final j20 c0 = new j20(1.0f, RecyclerView.A1);
    public static final j20 d0 = new j20(-1.0f, 1.0f);
    public static final j20 e0 = new j20(RecyclerView.A1, 1.0f);
    public static final j20 f0 = new j20(1.0f, 1.0f);
    public static final i20 g0 = new i20(-1.0f);
    public static final i20 h0 = new i20(RecyclerView.A1);
    public static final i20 i0 = new i20(1.0f);
    public static final h20 j0 = new h20(-1.0f);
    public static final h20 k0 = new h20(RecyclerView.A1);
    public static final h20 l0 = new h20(1.0f);
    public static final y60 m0 = new y60(2);
    public static final y60 n0 = new y60(3);
    public static final y60 o0 = new y60(4);
    public static final y60 p0 = new y60(5);
    public static final y60 q0 = new y60(6);
    public static final y60 r0 = new y60(7);
    public static final y60 s0 = new y60(8);
    public static final y60 t0 = new y60(9);
    public static final /* synthetic */ y60 u0 = new y60(10);
    public static final y60 v0 = new y60(11);
    public static final y60 w0 = new y60(12);
    public static final y60 x0 = new y60(13);
    public static final /* synthetic */ y60 y0 = new y60(14);
    public static final y60 z0 = new y60(15);
    public static final /* synthetic */ y60 A0 = new y60(16);
    public static final y60 B0 = new y60(17);
    public static final y60 C0 = new y60(18);
    public static final y60 D0 = new y60(19);

    public /* synthetic */ y60(int i) {
        this.A = i;
    }

    public static final ho0 e(y60 y60Var, String str) {
        ho0 ho0Var = new ho0(str);
        ho0.d.put(str, ho0Var);
        return ho0Var;
    }

    public static final void h(xv xvVar) {
        sb sbVar = xv.h;
        if (xv.i == null) {
            xv.i = new xv();
            wv wvVar = new wv("Okio Watchdog");
            wvVar.setDaemon(true);
            wvVar.start();
        }
        long nanoTime = System.nanoTime();
        long j = xvVar.c;
        boolean z = xvVar.a;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i != 0 && z) {
            xvVar.g = Math.min(j, xvVar.c() - nanoTime) + nanoTime;
        } else if (i != 0) {
            xvVar.g = nanoTime + j;
        } else if (z) {
            xvVar.g = xvVar.c();
        } else {
            throw new AssertionError();
        }
        sb sbVar2 = xv.h;
        int i2 = sbVar2.B + 1;
        sbVar2.B = i2;
        xv[] xvVarArr = (xv[]) sbVar2.L;
        if (i2 == xvVarArr.length) {
            xv[] xvVarArr2 = new xv[i2 * 2];
            nu.i0(xvVarArr, xvVarArr2, 0, 0, 14);
            sbVar2.L = xvVarArr2;
        }
        sbVar2.o(i2, xvVar);
        if (xvVar.f == 1) {
            xv.k.signal();
        }
    }

    public static xv j() {
        sb sbVar = xv.h;
        xv xvVar = ((xv[]) sbVar.L)[1];
        if (xvVar == null) {
            long nanoTime = System.nanoTime();
            xv.k.await(xv.l, TimeUnit.MILLISECONDS);
            if (((xv[]) sbVar.L)[1] != null || System.nanoTime() - nanoTime < xv.m) {
                return null;
            }
            return xv.i;
        }
        long nanoTime2 = xvVar.g - System.nanoTime();
        if (nanoTime2 > 0) {
            xv.k.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        sbVar.u(xvVar);
        xvVar.e = 2;
        return xvVar;
    }

    public static y60 l(Context context, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        nl2.y("Cannot create a CalendarItemStyle with a styleResId of 0", z);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, ay4.n);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        nk2.C(context, obtainStyledAttributes, 4);
        nk2.C(context, obtainStyledAttributes, 9);
        nk2.C(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        a36.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new s(RecyclerView.A1)).a();
        obtainStyledAttributes.recycle();
        y60 y60Var = new y60(25);
        nl2.B(rect.left);
        nl2.B(rect.top);
        nl2.B(rect.right);
        nl2.B(rect.bottom);
        return y60Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.hardware.camera2.params.OutputConfiguration] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.hardware.camera2.params.OutputConfiguration] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.hardware.camera2.params.OutputConfiguration] */
    public static li n(Surface surface, Integer num, sn1 sn1Var, og4 og4Var, ng4 ng4Var, pg4 pg4Var, List list, Size size, boolean z, int i, String str, int i2) {
        Integer num2;
        sn1 sn1Var2;
        boolean z2;
        int i3;
        ?? outputConfiguration;
        Class cls;
        OutputConfiguration outputConfiguration2;
        Surface surface2 = surface;
        sn1 sn1Var3 = sn1.k0;
        if ((i2 & 2) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i2 & 4) != 0) {
            sn1Var2 = sn1Var3;
        } else {
            sn1Var2 = sn1Var;
        }
        if ((i2 & 512) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i2 & 1024) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        sn1Var2.getClass();
        if (sn1Var2 == sn1.n0 && Build.VERSION.SDK_INT >= 35) {
            if (num2 != null) {
                if (size != null) {
                    outputConfiguration2 = lp.f(num2.intValue(), size);
                } else {
                    i.n("Required value was null.");
                    return null;
                }
            } else {
                i.n("Required value was null.");
                return null;
            }
        } else if (sn1Var2 != sn1Var3) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 26) {
                if (size != null) {
                    if (sn1Var2 != sn1.m0) {
                        if (sn1Var2 != sn1.l0) {
                            if (sn1Var2 != sn1.o0) {
                                if (sn1Var2 == sn1.p0) {
                                    if (i4 >= 35) {
                                        cls = MediaRecorder.class;
                                    } else {
                                        i.n("OutputType.MEDIA_RECORDER requires API 35 or higher.");
                                        return null;
                                    }
                                } else {
                                    f81.z(sn1Var2, "Unsupported OutputType: ");
                                    return null;
                                }
                            } else if (i4 >= 35) {
                                cls = MediaCodec.class;
                            } else {
                                i.n("OutputType.MEDIA_CODEC requires API 35 or higher.");
                                return null;
                            }
                        } else {
                            cls = SurfaceHolder.class;
                        }
                    } else {
                        cls = SurfaceTexture.class;
                    }
                    outputConfiguration2 = i2.d(size, cls);
                } else {
                    i.n("Size must defined when creating a deferred OutputConfiguration.");
                    return null;
                }
            } else {
                i.n(wh1.j("Deferred OutputConfigurations are not supported on API ", i4, " (requires API 26)"));
                return null;
            }
        } else if (surface2 != null) {
            try {
                if (i3 != -1) {
                    outputConfiguration = new OutputConfiguration(i3, surface2);
                } else {
                    outputConfiguration = new OutputConfiguration(surface2);
                }
                surface2 = outputConfiguration;
                outputConfiguration2 = surface2;
            } catch (Throwable th) {
                Log.w("CXCP", "Failed to create an OutputConfiguration for " + surface2 + '!', th);
                return null;
            }
        } else {
            i.n("non-null surface!");
            return null;
        }
        if (z2 && Build.VERSION.SDK_INT >= 26) {
            outputConfiguration2.enableSurfaceSharing();
        }
        if (str != null) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 28) {
                if (i5 >= 28) {
                    h2.p(outputConfiguration2, str);
                }
            } else {
                c44.e(wh1.j("physicalCameraId is not supported on API ", i5, " (requires API 28)"));
                return null;
            }
        }
        if (og4Var != null) {
            int i6 = og4Var.a;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33) {
                m2.r(outputConfiguration2, i6);
            } else if (i6 != 0) {
                StringBuilder s = wh1.s("Cannot set mirrorMode to a non-default value on API ", i7, ". This may result in unexpected behavior. Requested ");
                s.append((Object) og4.a(i6));
                Log.w("CXCP", s.toString());
            }
        }
        if (ng4Var != null) {
            long j = ng4Var.a;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 33) {
                m2.s(outputConfiguration2, j);
            } else if (j != 1) {
                StringBuilder s2 = wh1.s("Cannot set dynamicRangeProfile to a non-default value on API ", i8, ". This may result in unexpected behavior. Requested ");
                s2.append((Object) ng4.a(j));
                Log.w("CXCP", s2.toString());
            }
        }
        if (pg4Var != null && Build.VERSION.SDK_INT >= 33) {
            m2.B(outputConfiguration2, pg4Var.a);
        }
        if (!list.isEmpty()) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 31) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw b31.m(it);
                }
            } else {
                Log.w("CXCP", "Cannot add sensorPixelModeUsed value on API " + i9 + ". This may result in unexpected behavior. Requested " + list);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            h2.a(outputConfiguration2);
        }
        return new li(outputConfiguration2);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, n75] */
    @Override // defpackage.ea7
    public ki2 a(o0 o0Var) {
        if (o0Var.isAttachedToWindow()) {
            fn3 u = jk2.u(o0Var);
            if (u != null) {
                return ve2.h(o0Var, u.getLifecycle());
            }
            mz2.d("View tree for " + o0Var + " has no ViewTreeLifecycleOwner");
            f81.c();
            return null;
        }
        ?? obj = new Object();
        i66 i66Var = new i66(o0Var, obj, 2);
        o0Var.addOnAttachStateChangeListener(i66Var);
        obj.A = new wd(9, o0Var, i66Var);
        return new dj(21, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0135, code lost:
        if (r31 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015e, code lost:
        if (r31 != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0242 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(final defpackage.v03 r25, final long r26, final long r28, final defpackage.gp6 r30, final boolean r31, final defpackage.et0 r32, defpackage.tu0 r33, final int r34) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y60.b(v03, long, long, gp6, boolean, et0, tu0, int):void");
    }

    @Override // defpackage.u70
    public byte[] c(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // defpackage.s01
    public long d(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        int i = vu5.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.bi6
    public void f(ai6 ai6Var) {
        ai6Var.clear();
    }

    @Override // defpackage.jp0
    public l23 g() {
        return n23.a.g();
    }

    public zy3 i(zy3 zy3Var, j20 j20Var) {
        return zy3Var.f(new b50(j20Var, false));
    }

    @Override // defpackage.t11
    public Object k(Object obj) {
        switch (this.A) {
            case 0:
                return obj.toString();
            default:
                ((gc5) obj).close();
                return o27.a;
        }
    }

    @Override // defpackage.bi6
    public boolean m(Object obj, Object obj2) {
        return false;
    }

    public synchronized ho0 o(String str) {
        ho0 ho0Var;
        String str2;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = ho0.d;
            ho0Var = (ho0) linkedHashMap.get(str);
            if (ho0Var == null) {
                if (gh6.n0(str, "TLS_", false)) {
                    str2 = "SSL_".concat(str.substring(4));
                } else if (gh6.n0(str, "SSL_", false)) {
                    str2 = "TLS_".concat(str.substring(4));
                } else {
                    str2 = str;
                }
                ho0Var = (ho0) linkedHashMap.get(str2);
                if (ho0Var == null) {
                    ho0Var = new ho0(str);
                }
                linkedHashMap.put(str, ho0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return ho0Var;
    }

    public zy3 p() {
        return new b50(Z, true);
    }

    public String toString() {
        switch (this.A) {
            case 13:
                return "coil.request.NullRequestData";
            default:
                return super.toString();
        }
    }
}

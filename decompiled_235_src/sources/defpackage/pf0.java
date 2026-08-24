package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.SurfaceHolder;
import androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk;
import androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pf0  reason: default package */
/* loaded from: classes.dex */
public final class pf0 {
    public final ae0 a;
    public final ou0 b;
    public final gr1 c;
    public final jh0 d;
    public final sy7 e;
    public final tz6 f;
    public final lg0 g;
    public final ij0 h;
    public final u63 i;
    public final os0 j;
    public final DynamicRangeProfiles k;

    public pf0(ae0 ae0Var, ou0 ou0Var, gr1 gr1Var, jh0 jh0Var, sy7 sy7Var, tz6 tz6Var, lg0 lg0Var, ij0 ij0Var, u63 u63Var) {
        d51 T;
        ae0Var.getClass();
        ou0Var.getClass();
        gr1Var.getClass();
        jh0Var.getClass();
        sy7Var.getClass();
        this.a = ae0Var;
        this.b = ou0Var;
        this.c = gr1Var;
        this.d = jh0Var;
        this.e = sy7Var;
        this.f = tz6Var;
        this.g = lg0Var;
        this.h = ij0Var;
        this.i = u63Var;
        this.j = new os0(23);
        int i = Build.VERSION.SDK_INT;
        DynamicRangeProfiles dynamicRangeProfiles = null;
        if (i >= 33 && lg0Var != null && (T = ak7.T(lg0Var)) != null) {
            if (i >= 33) {
                dynamicRangeProfiles = ((br1) T.B).b();
            } else {
                u34.f(lb1.k("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher. is not supported on API ", i, " (requires API 33)"));
                throw null;
            }
        }
        this.k = dynamicRangeProfiles;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ab, code lost:
        if (defpackage.fv.n0(r1, r15.a) == true) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final of0 a(int i, rc6 rc6Var, boolean z, qt2 qt2Var, Integer num, Map map, Map map2) {
        boolean z2;
        rc6 rc6Var2;
        LinkedHashMap linkedHashMap;
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        Range range;
        LinkedHashMap linkedHashMap2;
        ji0 ji0Var;
        ij0 ij0Var;
        ArrayList arrayList;
        List list;
        ji0 ji0Var2;
        String str;
        rp4 rp4Var;
        rp4 rp4Var2;
        String str2;
        ji0 ji0Var3;
        qp4 qp4Var;
        String str3;
        rp4 rp4Var3;
        rp4 rp4Var4;
        vs0 vs0Var;
        Size size;
        int i3;
        LinkedHashMap linkedHashMap3;
        sp4 sp4Var;
        tp4 tp4Var;
        int size2;
        int i4;
        ArrayList arrayList2;
        tp4 tp4Var2;
        sp4 sp4Var2;
        CameraCharacteristics.Key key;
        vs0 vs0Var2;
        rc6 rc6Var3 = rc6Var;
        vs0 vs0Var3 = vs0.m0;
        Integer num2 = 0;
        map.getClass();
        map2.getClass();
        if (i == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        ArrayList arrayList3 = new ArrayList();
        boolean z6 = z2;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        if (rc6Var3 != null) {
            ek0 ek0Var = rc6Var3.g;
            u63 u63Var = this.i;
            if (u63Var != null) {
                jg0 jg0Var = (jg0) u63Var.B;
                jg0Var.getClass();
                xw xwVar = jg0Var.a;
                List list2 = rc6Var3.c;
                list2.getClass();
                xwVar.a = gt0.k1(list2);
                u63 u63Var2 = (u63) u63Var.L;
                u63Var2.getClass();
                List list3 = rc6Var3.d;
                list3.getClass();
                ((xw) u63Var2.L).a = gt0.k1(list3);
            }
            int i5 = ek0Var.c;
            if (i5 == -1) {
                i5 = 1;
            }
            linkedHashMap5.putAll(this.f.b(new bl5(i5)));
            linkedHashMap5.putAll(nw7.r0(ek0Var.b));
            if (i == 2) {
                k54 k54Var = ug0.a;
                num.getClass();
                linkedHashMap5.put(k54Var, num);
            }
            go4 go4Var = rc6Var3.g.b;
            new os0(go4Var);
            String str4 = (String) go4Var.b(kd0.h0, null);
            ArrayList arrayList4 = rc6Var3.a;
            int size3 = arrayList4.size();
            ji0 ji0Var4 = null;
            int i6 = 0;
            while (i6 < size3) {
                Object obj = arrayList4.get(i6);
                int i7 = i6 + 1;
                int i8 = i5;
                wy wyVar = (wy) obj;
                String str5 = str4;
                ig1 ig1Var = wyVar.a;
                int i9 = wyVar.d;
                ig1Var.getClass();
                if (str5 == null) {
                    str2 = null;
                } else {
                    str2 = str5;
                }
                yq1 yq1Var = wyVar.e;
                yq1Var.getClass();
                boolean z7 = z6;
                int i10 = wyVar.c;
                ArrayList arrayList5 = arrayList4;
                int i11 = Build.VERSION.SDK_INT;
                int i12 = size3;
                if (i11 >= 33) {
                    ji0Var3 = ji0Var4;
                    qp4 qp4Var2 = new qp4(1L);
                    DynamicRangeProfiles dynamicRangeProfiles = this.k;
                    if (dynamicRangeProfiles != null) {
                        Long a = zq1.a(yq1Var, dynamicRangeProfiles);
                        if (a != null) {
                            qp4Var = new qp4(a.longValue());
                        } else if (kj2.G()) {
                            Log.e("CXCP", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n " + yq1Var);
                        }
                    }
                    qp4Var = qp4Var2;
                } else {
                    ji0Var3 = ji0Var4;
                    qp4Var = null;
                }
                Size size4 = ig1Var.h;
                size4.getClass();
                int i13 = ig1Var.i;
                if (str2 == null) {
                    str3 = null;
                } else {
                    xf0.a(str2);
                    str3 = str2;
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        rp4Var4 = null;
                        if (z) {
                            Class cls = wyVar.a.j;
                            if (nb3.k(cls, MediaCodec.class)) {
                                vs0Var2 = vs0.q0;
                            } else if (nb3.k(cls, SurfaceHolder.class)) {
                                vs0Var2 = vs0.n0;
                            } else if (nb3.k(cls, SurfaceTexture.class)) {
                                vs0Var2 = vs0.o0;
                            }
                            vs0Var = vs0Var2;
                            if (!z7) {
                                lg0 lg0Var = this.g;
                                Long l = (Long) map.get(ig1Var);
                                size = size4;
                                i3 = i13;
                                if (l != null) {
                                    sp4Var2 = new sp4(l.longValue());
                                } else {
                                    sp4Var2 = null;
                                }
                                if (i11 >= 33 && sp4Var2 != null && lg0Var != null) {
                                    key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                                    key.getClass();
                                    long[] jArr = (long[]) ((qc0) lg0Var).c(key);
                                    if (jArr != null) {
                                        linkedHashMap3 = linkedHashMap5;
                                    }
                                }
                                linkedHashMap3 = linkedHashMap5;
                                if (kj2.L()) {
                                    Log.w("CXCP", "Expected stream use case for " + ig1Var + ", " + sp4Var2 + " cannot be set!");
                                }
                                sp4Var2 = null;
                                sp4Var = sp4Var2;
                            } else {
                                size = size4;
                                i3 = i13;
                                linkedHashMap3 = linkedHashMap5;
                                sp4Var = null;
                            }
                            if (!z7) {
                                Long l2 = (Long) map2.get(ig1Var);
                                if (l2 != null) {
                                    tp4Var2 = new tp4(l2.longValue());
                                } else {
                                    tp4Var2 = null;
                                }
                                tp4Var = tp4Var2;
                            } else {
                                tp4Var = null;
                            }
                            pp4 s = x31.s(i3, 544, vs0Var, qp4Var, rp4Var4, sp4Var, tp4Var, size, str3);
                            List list4 = wyVar.b;
                            list4.getClass();
                            ArrayList U0 = gt0.U0(ig1Var, list4);
                            size2 = U0.size();
                            i4 = 0;
                            while (i4 < size2) {
                                Object obj2 = U0.get(i4);
                                i4++;
                                ig1 ig1Var2 = (ig1) obj2;
                                LinkedHashMap linkedHashMap7 = linkedHashMap3;
                                ji0 ji0Var5 = new ji0(hf.b0(s));
                                linkedHashMap6.put(ji0Var5, ig1Var2);
                                if (i9 != -1) {
                                    List list5 = (List) linkedHashMap4.get(Integer.valueOf(i9));
                                    if (list5 == null) {
                                        arrayList2 = U0;
                                        linkedHashMap4.put(Integer.valueOf(i9), hf.d0(ji0Var5));
                                    } else {
                                        arrayList2 = U0;
                                        list5.add(ji0Var5);
                                    }
                                } else {
                                    arrayList2 = U0;
                                }
                                if (nb3.k(ig1Var2, ig1Var)) {
                                    sy7 sy7Var = this.e;
                                    ig1Var2.getClass();
                                    if (sy7Var.e(ig1Var2, rc6Var)) {
                                        ji0Var3 = ji0Var5;
                                        linkedHashMap3 = linkedHashMap7;
                                        U0 = arrayList2;
                                    }
                                }
                                linkedHashMap3 = linkedHashMap7;
                                U0 = arrayList2;
                            }
                            rc6Var3 = rc6Var;
                            str4 = str5;
                            linkedHashMap5 = linkedHashMap3;
                            i6 = i7;
                            i5 = i8;
                            z6 = z7;
                            arrayList4 = arrayList5;
                            size3 = i12;
                            ji0Var4 = ji0Var3;
                        }
                        vs0Var = vs0Var3;
                        if (!z7) {
                        }
                        if (!z7) {
                        }
                        pp4 s2 = x31.s(i3, 544, vs0Var, qp4Var, rp4Var4, sp4Var, tp4Var, size, str3);
                        List list42 = wyVar.b;
                        list42.getClass();
                        ArrayList U02 = gt0.U0(ig1Var, list42);
                        size2 = U02.size();
                        i4 = 0;
                        while (i4 < size2) {
                        }
                        rc6Var3 = rc6Var;
                        str4 = str5;
                        linkedHashMap5 = linkedHashMap3;
                        i6 = i7;
                        i5 = i8;
                        z6 = z7;
                        arrayList4 = arrayList5;
                        size3 = i12;
                        ji0Var4 = ji0Var3;
                    } else {
                        rp4Var3 = new rp4(2);
                    }
                } else {
                    rp4Var3 = new rp4(1);
                }
                rp4Var4 = rp4Var3;
                if (z) {
                }
                vs0Var = vs0Var3;
                if (!z7) {
                }
                if (!z7) {
                }
                pp4 s22 = x31.s(i3, 544, vs0Var, qp4Var, rp4Var4, sp4Var, tp4Var, size, str3);
                List list422 = wyVar.b;
                list422.getClass();
                ArrayList U022 = gt0.U0(ig1Var, list422);
                size2 = U022.size();
                i4 = 0;
                while (i4 < size2) {
                }
                rc6Var3 = rc6Var;
                str4 = str5;
                linkedHashMap5 = linkedHashMap3;
                i6 = i7;
                i5 = i8;
                z6 = z7;
                arrayList4 = arrayList5;
                size3 = i12;
                ji0Var4 = ji0Var3;
            }
            ji0 ji0Var6 = ji0Var4;
            int i14 = i5;
            linkedHashMap = linkedHashMap5;
            z3 = z6;
            rc6Var2 = rc6Var3;
            if (rc6Var2.i != null && ji0Var6 != null) {
                arrayList3.add(new y73(ji0Var6, ((pp4) gt0.b1(ji0Var6.a)).b));
            }
            i2 = i14;
        } else {
            rc6Var2 = rc6Var3;
            linkedHashMap = linkedHashMap5;
            z3 = z6;
            i2 = 1;
        }
        jh0 jh0Var = this.d;
        if (jh0Var.a().a(CaptureSessionStuckQuirk.class) && kj2.F("CXCP")) {
            Log.d("CXCP", "CameraPipe should be enabling CaptureSessionStuckQuirk by default");
        }
        String str6 = Build.MODEL;
        str6.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = str6.toLowerCase(locale);
        lowerCase.getClass();
        boolean g0 = xs6.g0(lowerCase, "cph", false);
        if (((CloseCameraDeviceOnCameraGraphCloseQuirk) this.j.B) != null) {
            if (!CloseCameraDeviceOnCameraGraphCloseQuirk.c && (!CloseCameraDeviceOnCameraGraphCloseQuirk.e || CloseCameraDeviceOnCameraGraphCloseQuirk.a || CloseCameraDeviceOnCameraGraphCloseQuirk.b)) {
                z4 = true;
            } else {
                z4 = z3;
            }
        } else {
            z4 = false;
        }
        if ((z3 && si1.a().b(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class) != null) || si1.a().b(DisableAbortCapturesOnStopQuirk.class) != null || Build.VERSION.SDK_INT < 30) {
            z5 = false;
        } else {
            z5 = true;
        }
        mf0 mf0Var = new mf0(z5, new zb(jh0Var.a().a(QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class) ? 1 : 0, nf0.AT_LEAST), g0 ? 1 : 0, z4, 9);
        if (rc6Var2 != null) {
            ek0 ek0Var2 = rc6Var2.g;
            ek0Var2.getClass();
            Integer num3 = (Integer) ek0Var2.b.b(zi7.U, num2);
            Objects.requireNonNull(num3);
            int intValue = num3.intValue();
            Integer num4 = (Integer) ek0Var2.b.b(zi7.V, num2);
            Objects.requireNonNull(num4);
            int intValue2 = num4.intValue();
            if (intValue != 1 && intValue2 != 1) {
                if (intValue == 2) {
                    num2 = 2;
                } else if (intValue2 == 2) {
                    num2 = 1;
                }
            }
            if (rc6Var2 == null) {
                range = rc6Var2.g.a();
            } else {
                range = null;
            }
            if (nb3.k(range, yy.h)) {
                range = null;
            }
            p04 p04Var = new p04();
            if (z3) {
                p04Var.put(ug0.c, Boolean.TRUE);
            }
            if (num2 != null) {
                p04Var.put(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(num2.intValue()));
            }
            p04Var.put(ug0.b, "android.hardware.camera2.CaptureRequest.setTag.CX");
            if (range != null) {
                p04Var.put(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
            }
            p04 b = p04Var.b();
            if (range == null) {
                linkedHashMap2 = linkedHashMap;
                linkedHashMap2.put(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
            } else {
                linkedHashMap2 = linkedHashMap;
            }
            if (num2 != null) {
                linkedHashMap2.put(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, num2);
            }
            if (rc6Var2 == null) {
                go4 go4Var2 = rc6Var2.g.b;
                new os0(go4Var2);
                String str7 = (String) go4Var2.b(kd0.h0, null);
                wy wyVar2 = rc6Var2.b;
                if (wyVar2 != null) {
                    ig1 ig1Var3 = wyVar2.a;
                    ig1Var3.getClass();
                    if (str7 == null) {
                        str7 = null;
                    }
                    int i15 = wyVar2.c;
                    Size size5 = ig1Var3.h;
                    size5.getClass();
                    int i16 = ig1Var3.i;
                    if (str7 == null) {
                        str = null;
                    } else {
                        xf0.a(str7);
                        str = str7;
                    }
                    if (i15 != 0) {
                        if (i15 != 1) {
                            rp4Var2 = null;
                            ji0Var2 = new ji0(hf.b0(x31.s(i16, 1000, null, null, rp4Var2, null, null, size5, str)));
                            linkedHashMap6.put(ji0Var2, ig1Var3);
                        } else {
                            rp4Var = new rp4(2);
                        }
                    } else {
                        rp4Var = new rp4(1);
                    }
                    rp4Var2 = rp4Var;
                    ji0Var2 = new ji0(hf.b0(x31.s(i16, 1000, null, null, rp4Var2, null, null, size5, str)));
                    linkedHashMap6.put(ji0Var2, ig1Var3);
                } else {
                    ji0Var2 = null;
                }
                ji0Var = ji0Var2;
            } else {
                ji0Var = null;
            }
            ij0Var = this.h;
            if (ij0Var == null) {
                xx xxVar = uc0.a;
                arrayList = null;
                if (ij0Var.A.b(uc0.a, null) != null) {
                    u34.a();
                    return null;
                }
            } else {
                arrayList = null;
            }
            String str8 = this.c.B;
            List k1 = gt0.k1(linkedHashMap6.keySet());
            List k12 = gt0.k1(linkedHashMap4.values());
            if (arrayList3.isEmpty()) {
                arrayList3 = arrayList;
            }
            List c0 = hf.c0(this.a, this.b);
            if (qt2Var == null) {
                list = hf.b0(qt2Var);
            } else {
                list = yt1.A;
            }
            return new of0(new kf0(str8, k1, k12, arrayList3, ji0Var, i2, linkedHashMap2, i, b, c0, list, mf0Var), c14.s0(linkedHashMap6));
        }
        num2 = null;
        if (rc6Var2 == null) {
        }
        if (nb3.k(range, yy.h)) {
        }
        p04 p04Var2 = new p04();
        if (z3) {
        }
        if (num2 != null) {
        }
        p04Var2.put(ug0.b, "android.hardware.camera2.CaptureRequest.setTag.CX");
        if (range != null) {
        }
        p04 b2 = p04Var2.b();
        if (range == null) {
        }
        if (num2 != null) {
        }
        if (rc6Var2 == null) {
        }
        ij0Var = this.h;
        if (ij0Var == null) {
        }
        String str82 = this.c.B;
        List k13 = gt0.k1(linkedHashMap6.keySet());
        List k122 = gt0.k1(linkedHashMap4.values());
        if (arrayList3.isEmpty()) {
        }
        List c02 = hf.c0(this.a, this.b);
        if (qt2Var == null) {
        }
        return new of0(new kf0(str82, k13, k122, arrayList3, ji0Var, i2, linkedHashMap2, i, b2, c02, list, mf0Var), c14.s0(linkedHashMap6));
    }

    public final String toString() {
        return "CameraGraphConfigProvider<" + ((Object) xf0.b(this.c.B)) + '>';
    }
}

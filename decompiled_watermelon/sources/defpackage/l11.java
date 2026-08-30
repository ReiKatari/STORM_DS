package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l11  reason: default package */
/* loaded from: classes.dex */
public final class l11 {
    public static final Map f;
    public static final gs0 g;
    public static final List h;
    public static final List i;
    public static final List j;
    public final an2 a;
    public final ce0 b;
    public final in2 c;
    public final nq3 d;
    public gs0 e;

    static {
        l07.c0(2, 4, 3);
        l07.c0(2, 3);
        l07.c0(2, 6, 4, 5);
        l07.b0(3);
        l07.b0(3);
        l07.c0(4, 5);
        l07.c0(2, 4, 3);
        l07.c0(2, 3);
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        Collections.singletonMap(key, 1).getClass();
        Map singletonMap = Collections.singletonMap(key, 2);
        singletonMap.getClass();
        f = singletonMap;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        Collections.singletonMap(key2, 1).getClass();
        zt3.l0(new ti4(key, 1), new ti4(key2, 1));
        g = a53.d(new lc5(4, null));
        h = l07.c0(0, 1, 2, 4);
        List c0 = l07.c0(0, 3, 1, 2, 6);
        i = c0;
        j = l07.c0(0, 1, 2);
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_LOCK;
        Boolean bool = Boolean.TRUE;
        Collections.singletonMap(key3, bool).getClass();
        zt3.l0(new ti4(key, 2), new ti4(key3, bool));
        Collections.singletonMap(key3, Boolean.FALSE).getClass();
        Collections.singletonMap(key2, 2).getClass();
        zt3.l0(new ti4(key, 2), new ti4(key2, 2));
        Map singletonMap2 = Collections.singletonMap(CaptureResult.CONTROL_AF_STATE, c0);
        singletonMap2.getClass();
        new n95(1, singletonMap2);
    }

    public l11(an2 an2Var, ce0 ce0Var, in2 in2Var, nq3 nq3Var) {
        an2Var.getClass();
        ce0Var.getClass();
        in2Var.getClass();
        nq3Var.getClass();
        this.a = an2Var;
        this.b = ce0Var;
        this.c = in2Var;
        this.d = nq3Var;
    }

    public static gs0 a(l11 l11Var, ja jaVar, kb kbVar, gy gyVar, x82 x82Var, List list, List list2, List list3, int i2) {
        kb kbVar2;
        gy gyVar2;
        x82 x82Var2;
        List list4;
        List list5;
        List list6;
        if ((i2 & 2) != 0) {
            kbVar2 = null;
        } else {
            kbVar2 = kbVar;
        }
        if ((i2 & 4) != 0) {
            gyVar2 = null;
        } else {
            gyVar2 = gyVar;
        }
        if ((i2 & 8) != 0) {
            x82Var2 = null;
        } else {
            x82Var2 = x82Var;
        }
        if ((i2 & 16) != 0) {
            list4 = null;
        } else {
            list4 = list;
        }
        if ((i2 & 32) != 0) {
            list5 = null;
        } else {
            list5 = list2;
        }
        if ((i2 & 64) != 0) {
            list6 = null;
        } else {
            list6 = list3;
        }
        if (l11Var.a.b.p() == null) {
            in2.b(l11Var.c, jaVar, kbVar2, gyVar2, x82Var2, list4, list5, list6, null, null, null, 896);
            l11Var.a.e(l11Var.c.a());
            return g;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jaVar != null) {
            int i3 = jaVar.a;
            CaptureResult.Key key = CaptureResult.CONTROL_AE_MODE;
            key.getClass();
            List list7 = (List) linkedHashMap.put(key, l07.b0(Integer.valueOf(i3)));
        }
        if (kbVar2 != null) {
            int i4 = kbVar2.a;
            CaptureResult.Key key2 = CaptureResult.CONTROL_AF_MODE;
            key2.getClass();
            List list8 = (List) linkedHashMap.put(key2, l07.b0(Integer.valueOf(i4)));
        }
        if (gyVar2 != null) {
            int i5 = gyVar2.a;
            CaptureResult.Key key3 = CaptureResult.CONTROL_AWB_MODE;
            key3.getClass();
            List list9 = (List) linkedHashMap.put(key3, l07.b0(Integer.valueOf(i5)));
        }
        if (x82Var2 != null) {
            int i6 = x82Var2.a;
            CaptureResult.Key key4 = CaptureResult.FLASH_MODE;
            key4.getClass();
            List list10 = (List) linkedHashMap.put(key4, l07.b0(Integer.valueOf(i6)));
        }
        mc5 mc5Var = new mc5(new n95(1, zt3.r0(linkedHashMap)), null, null);
        nq3 nq3Var = l11Var.d;
        nq3Var.getClass();
        nq3Var.A.add(mc5Var);
        in2.b(l11Var.c, jaVar, kbVar2, gyVar2, x82Var2, list4, list5, list6, null, null, null, 896);
        l11Var.a.e(l11Var.c.a());
        gs0 gs0Var = mc5Var.R;
        synchronized (l11Var) {
            try {
                Log.d("CXCP", "Controller3A#update3A: cancelling previous request " + l11Var.e);
                gs0 gs0Var2 = l11Var.e;
                if (gs0Var2 != null) {
                    CancellationException cancellationException = new CancellationException("A newer call for 3A state update initiated.");
                    cancellationException.initCause(null);
                    gs0Var2.i(cancellationException);
                }
                l11Var.e = gs0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gs0Var;
    }
}

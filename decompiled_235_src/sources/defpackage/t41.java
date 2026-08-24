package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t41  reason: default package */
/* loaded from: classes.dex */
public final class t41 {
    public static final List f = hf.c0(2, 4, 3);
    public static final List g = hf.c0(2, 3);
    public static final List h = hf.c0(2, 6, 4, 5);
    public static final List i = hf.b0(3);
    public static final List j = hf.b0(3);
    public static final List k = hf.c0(4, 5);
    public static final List l = hf.c0(2, 4, 3);
    public static final List m = hf.c0(2, 3);
    public static final Map n;
    public static final tu0 o;
    public static final List p;
    public static final List q;
    public static final List r;
    public final gt2 a;
    public final lg0 b;
    public final ot2 c;
    public final ox3 d;
    public tu0 e;

    static {
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        Collections.singletonMap(key, 1).getClass();
        Map singletonMap = Collections.singletonMap(key, 2);
        singletonMap.getClass();
        n = singletonMap;
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        Collections.singletonMap(key2, 1).getClass();
        c14.m0(new vr4(key, 1), new vr4(key2, 1));
        o = u24.b(new fm5(4, null));
        p = hf.c0(0, 1, 2, 4);
        List c0 = hf.c0(0, 3, 1, 2, 6);
        q = c0;
        r = hf.c0(0, 1, 2);
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_LOCK;
        Boolean bool = Boolean.TRUE;
        Collections.singletonMap(key3, bool).getClass();
        c14.m0(new vr4(key, 2), new vr4(key3, bool));
        Collections.singletonMap(key3, Boolean.FALSE).getClass();
        Collections.singletonMap(key2, 2).getClass();
        c14.m0(new vr4(key, 2), new vr4(key2, 2));
        Map singletonMap2 = Collections.singletonMap(CaptureResult.CONTROL_AF_STATE, c0);
        singletonMap2.getClass();
        new bg2(singletonMap2, 29);
    }

    public t41(gt2 gt2Var, lg0 lg0Var, ot2 ot2Var, ox3 ox3Var) {
        gt2Var.getClass();
        lg0Var.getClass();
        ot2Var.getClass();
        ox3Var.getClass();
        this.a = gt2Var;
        this.b = lg0Var;
        this.c = ot2Var;
        this.d = ox3Var;
    }

    public static tu0 a(t41 t41Var, oa oaVar, qb qbVar, xz xzVar, pd2 pd2Var, List list, List list2, List list3, int i2) {
        qb qbVar2;
        xz xzVar2;
        pd2 pd2Var2;
        List list4;
        List list5;
        List list6;
        if ((i2 & 2) != 0) {
            qbVar2 = null;
        } else {
            qbVar2 = qbVar;
        }
        if ((i2 & 4) != 0) {
            xzVar2 = null;
        } else {
            xzVar2 = xzVar;
        }
        if ((i2 & 8) != 0) {
            pd2Var2 = null;
        } else {
            pd2Var2 = pd2Var;
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
        if (t41Var.a.b.k() == null) {
            ot2.b(t41Var.c, oaVar, qbVar2, xzVar2, pd2Var2, list4, list5, list6, null, null, null, 896);
            t41Var.a.e(t41Var.c.a());
            return o;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (oaVar != null) {
            int i3 = oaVar.a;
            CaptureResult.Key key = CaptureResult.CONTROL_AE_MODE;
            key.getClass();
            List list7 = (List) linkedHashMap.put(key, hf.b0(Integer.valueOf(i3)));
        }
        if (qbVar2 != null) {
            int i4 = qbVar2.a;
            CaptureResult.Key key2 = CaptureResult.CONTROL_AF_MODE;
            key2.getClass();
            List list8 = (List) linkedHashMap.put(key2, hf.b0(Integer.valueOf(i4)));
        }
        if (xzVar2 != null) {
            int i5 = xzVar2.a;
            CaptureResult.Key key3 = CaptureResult.CONTROL_AWB_MODE;
            key3.getClass();
            List list9 = (List) linkedHashMap.put(key3, hf.b0(Integer.valueOf(i5)));
        }
        if (pd2Var2 != null) {
            int i6 = pd2Var2.a;
            CaptureResult.Key key4 = CaptureResult.FLASH_MODE;
            key4.getClass();
            List list10 = (List) linkedHashMap.put(key4, hf.b0(Integer.valueOf(i6)));
        }
        gm5 gm5Var = new gm5(new bg2(c14.s0(linkedHashMap), 29), null, null);
        ox3 ox3Var = t41Var.d;
        ox3Var.getClass();
        ox3Var.A.add(gm5Var);
        ot2.b(t41Var.c, oaVar, qbVar2, xzVar2, pd2Var2, list4, list5, list6, null, null, null, 896);
        t41Var.a.e(t41Var.c.a());
        tu0 tu0Var = gm5Var.R;
        synchronized (t41Var) {
            try {
                Log.d("CXCP", "Controller3A#update3A: cancelling previous request " + t41Var.e);
                tu0 tu0Var2 = t41Var.e;
                if (tu0Var2 != null) {
                    CancellationException cancellationException = new CancellationException("A newer call for 3A state update initiated.");
                    cancellationException.initCause(null);
                    tu0Var2.h(cancellationException);
                }
                t41Var.e = tu0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tu0Var;
    }
}

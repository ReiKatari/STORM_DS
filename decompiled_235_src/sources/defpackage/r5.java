package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r5  reason: default package */
/* loaded from: classes.dex */
public final class r5 implements qn2, nb0 {
    public final /* synthetic */ int A;
    public final Object B;
    public final Object L;

    public /* synthetic */ r5(int i, Object obj, Object obj2) {
        this.A = i;
        this.L = obj;
        this.B = obj2;
    }

    @Override // defpackage.nb0
    public void f(je5 je5Var, wl5 wl5Var) {
        ((rj0) this.B).i(wl5Var);
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        long j;
        boolean z = true;
        switch (this.A) {
            case 0:
                return ((k4) this.L).g(((List) this.B).get(((Number) obj).intValue()));
            case 1:
                ((k4) this.L).g(((List) this.B).get(((Number) obj).intValue()));
                return "leaderboard";
            case 2:
                ((k4) this.L).g(((List) this.B).get(((Number) obj).intValue()));
                return "achievement";
            case 3:
                return ((k0) this.L).g(((ArrayList) this.B).get(((Number) obj).intValue()));
            case 4:
                ((k4) this.L).g(((ArrayList) this.B).get(((Number) obj).intValue()));
                return "leaderboard";
            case 5:
                return ((k4) this.L).g(((List) this.B).get(((Number) obj).intValue()));
            case 6:
                int intValue = ((Number) obj).intValue();
                return ((fn0) this.L).o(Integer.valueOf(intValue), ((List) this.B).get(intValue));
            case 7:
                Throwable th = (Throwable) obj;
                try {
                    ((je5) this.L).cancel();
                } catch (Throwable unused) {
                }
                return jg7.a;
            case 8:
                KeyEvent keyEvent = ((wg3) obj).a;
                if (((jt3) this.L).a() == hv2.Selection && keyEvent.getKeyCode() == 4 && xk2.u(keyEvent) == 1) {
                    ((p27) this.B).g(null);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                return ((vn0) this.L).g(((List) this.B).get(((Number) obj).intValue()));
            case 10:
                return ((bz1) this.L).g(((List) this.B).get(((Number) obj).intValue()));
            case 11:
                zl6 zl6Var = (zl6) obj;
                synchronized (bm6.c) {
                    j = bm6.e;
                    bm6.e = 1 + j;
                }
                return new oa4(j, zl6Var, (qn2) this.L, (qn2) this.B);
            case 12:
                return ((bz1) this.L).g(((List) this.B).get(((Number) obj).intValue()));
            case 13:
                return ((bz1) this.L).g(((List) this.B).get(((Number) obj).intValue()));
            case 14:
                Throwable th2 = (Throwable) obj;
                bk1 bk1Var = (bk1) this.L;
                Object obj2 = bk1Var.L;
                rj0 rj0Var = (rj0) this.B;
                synchronized (obj2) {
                    ((ArrayList) bk1Var.B).remove(rj0Var);
                }
                return jg7.a;
            case 15:
                return ((v83) this.L).g(((List) this.B).get(((Number) obj).intValue()));
            case 16:
                Throwable th3 = (Throwable) obj;
                tu0 tu0Var = (tu0) this.L;
                wz3 wz3Var = (wz3) this.B;
                if (tu0Var == wz3Var.h) {
                    wz3Var.h = null;
                }
                return jg7.a;
            case 17:
                KeyEvent keyEvent2 = ((wg3) obj).a;
                qa4 qa4Var = (qa4) this.B;
                keyEvent2.getClass();
                if (xk2.u(keyEvent2) == 2 && (kg3.a(qo2.e(keyEvent2.getKeyCode()), kg3.H) || kg3.a(qo2.e(keyEvent2.getKeyCode()), kg3.a))) {
                    if (((nu4) qa4Var.getValue()) != null) {
                        qa4Var.setValue(null);
                    } else {
                        ((on2) this.L).c();
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                return ((x84) this.L).g(((List) this.B).get(((Number) obj).intValue()));
            case 19:
                int intValue2 = ((Number) obj).intValue();
                return ((ep3) this.L).o(Integer.valueOf(intValue2), ((List) this.B).get(intValue2));
            case 20:
                return ((gn5) this.L).g(((List) this.B).get(((Number) obj).intValue()));
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return ((gn5) this.L).g(((List) this.B).get(((Number) obj).intValue()));
            case 22:
                int intValue3 = ((Number) obj).intValue();
                return ((ep3) this.L).o(Integer.valueOf(intValue3), ((ArrayList) this.B).get(intValue3));
            case ConnectionResult.API_DISABLED /* 23 */:
                int intValue4 = ((Number) obj).intValue();
                return ((ep3) this.L).o(Integer.valueOf(intValue4), ((List) this.B).get(intValue4));
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return ((gn5) this.L).g(((ArrayList) this.B).get(((Number) obj).intValue()));
            case 25:
                return ((gn5) this.L).g(((List) this.B).get(((Number) obj).intValue()));
            case SubAllocator.N4 /* 26 */:
                KeyEvent keyEvent3 = ((wg3) obj).a;
                ah2 ah2Var = (ah2) this.L;
                InputDevice device = keyEvent3.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent3.getSource() == 33554433) && xk2.u(keyEvent3) == 2 && keyEvent3.getSource() != 257)) {
                    if (kj2.h(19, keyEvent3)) {
                        z = ((eh2) ah2Var).g(5, true);
                    } else if (kj2.h(20, keyEvent3)) {
                        z = ((eh2) ah2Var).g(6, true);
                    } else if (kj2.h(21, keyEvent3)) {
                        z = ((eh2) ah2Var).g(3, true);
                    } else if (kj2.h(22, keyEvent3)) {
                        z = ((eh2) ah2Var).g(4, true);
                    } else if (kj2.h(23, keyEvent3)) {
                        xm6 xm6Var = ((jt3) this.B).c;
                        if (xm6Var != null) {
                            ((bh1) xm6Var).b();
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            case 27:
                return ((rk7) this.L).g(((List) this.B).get(((Number) obj).intValue()));
            case 28:
                return ((rk7) this.L).g(((List) this.B).get(((Number) obj).intValue()));
            default:
                Throwable th4 = (Throwable) obj;
                if (th4 instanceof ix7) {
                    ((nx3) this.L).c.compareAndSet(-256, ((ix7) th4).A);
                }
                ((gx3) this.B).cancel(false);
                return jg7.a;
        }
    }

    @Override // defpackage.nb0
    public void k(je5 je5Var, IOException iOException) {
        if (!je5Var.m0) {
            ((rj0) this.B).i(new em5(iOException));
        }
    }
}

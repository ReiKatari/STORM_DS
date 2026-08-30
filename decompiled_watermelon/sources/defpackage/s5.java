package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s5  reason: default package */
/* loaded from: classes.dex */
public final class s5 implements mi2, f90 {
    public final /* synthetic */ int A;
    public final Object B;
    public final Object L;

    public /* synthetic */ s5(int i, Object obj, Object obj2) {
        this.A = i;
        this.L = obj;
        this.B = obj2;
    }

    @Override // defpackage.f90
    public void d(w45 w45Var, ec5 ec5Var) {
        ((ih0) this.B).k(ec5Var);
    }

    @Override // defpackage.f90
    public void k(w45 w45Var, IOException iOException) {
        if (!w45Var.k0) {
            ((ih0) this.B).k(new kc5(iOException));
        }
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        long j;
        boolean z = true;
        switch (this.A) {
            case 0:
                return ((k4) this.L).n(((List) this.B).get(((Number) obj).intValue()));
            case 1:
                ((k4) this.L).n(((List) this.B).get(((Number) obj).intValue()));
                return "leaderboard";
            case 2:
                ((k4) this.L).n(((List) this.B).get(((Number) obj).intValue()));
                return "achievement";
            case 3:
                return ((j0) this.L).n(((ArrayList) this.B).get(((Number) obj).intValue()));
            case 4:
                ((k4) this.L).n(((ArrayList) this.B).get(((Number) obj).intValue()));
                return "leaderboard";
            case 5:
                return ((k4) this.L).n(((List) this.B).get(((Number) obj).intValue()));
            case ig7.b /* 6 */:
                int intValue = ((Number) obj).intValue();
                return ((xk0) this.L).j(Integer.valueOf(intValue), ((List) this.B).get(intValue));
            case 7:
                Throwable th = (Throwable) obj;
                try {
                    ((w45) this.L).cancel();
                } catch (Throwable unused) {
                }
                return o27.a;
            case 8:
                KeyEvent keyEvent = ((da3) obj).a;
                if (((hm3) this.L).a() == gp2.Selection && keyEvent.getKeyCode() == 4 && hi2.C(keyEvent) == 1) {
                    ((bq6) this.B).g(null);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                return ((nl0) this.L).n(((List) this.B).get(((Number) obj).intValue()));
            case 10:
                return ((qu1) this.L).n(((List) this.B).get(((Number) obj).intValue()));
            case 11:
                ka6 ka6Var = (ka6) obj;
                synchronized (ma6.c) {
                    j = ma6.e;
                    ma6.e = 1 + j;
                }
                return new i24(j, ka6Var, (mi2) this.L, (mi2) this.B);
            case mj2.L /* 12 */:
                return ((qu1) this.L).n(((List) this.B).get(((Number) obj).intValue()));
            case 13:
                Throwable th2 = (Throwable) obj;
                xf1 xf1Var = (xf1) this.L;
                Object obj2 = xf1Var.L;
                ih0 ih0Var = (ih0) this.B;
                synchronized (obj2) {
                    ((ArrayList) xf1Var.B).remove(ih0Var);
                }
                return o27.a;
            case 14:
                return ((qu1) this.L).n(((List) this.B).get(((Number) obj).intValue()));
            case ig7.e /* 15 */:
                Throwable th3 = (Throwable) obj;
                gs0 gs0Var = (gs0) this.L;
                rs3 rs3Var = (rs3) this.B;
                if (gs0Var == rs3Var.h) {
                    rs3Var.h = null;
                }
                return o27.a;
            case 16:
                KeyEvent keyEvent2 = ((da3) obj).a;
                k24 k24Var = (k24) this.B;
                keyEvent2.getClass();
                if (hi2.C(keyEvent2) == 2 && (r93.a(jk2.f(keyEvent2.getKeyCode()), r93.H) || r93.a(jk2.f(keyEvent2.getKeyCode()), r93.a))) {
                    if (((ll4) k24Var.getValue()) != null) {
                        k24Var.setValue(null);
                    } else {
                        ((ki2) this.L).c();
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                return ((n44) this.L).n(((List) this.B).get(((Number) obj).intValue()));
            case 18:
                int intValue2 = ((Number) obj).intValue();
                return ((qt0) this.L).j(Integer.valueOf(intValue2), ((List) this.B).get(intValue2));
            case 19:
                return ((vu4) this.L).n(((List) this.B).get(((Number) obj).intValue()));
            case 20:
                int intValue3 = ((Number) obj).intValue();
                return ((qt0) this.L).j(Integer.valueOf(intValue3), ((ArrayList) this.B).get(intValue3));
            case 21:
                int intValue4 = ((Number) obj).intValue();
                return ((qt0) this.L).j(Integer.valueOf(intValue4), ((List) this.B).get(intValue4));
            case 22:
                return ((nh5) this.L).n(((List) this.B).get(((Number) obj).intValue()));
            case 23:
                KeyEvent keyEvent3 = ((da3) obj).a;
                jc2 jc2Var = (jc2) this.L;
                InputDevice device = keyEvent3.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent3.getSource() == 33554433) && hi2.C(keyEvent3) == 2 && keyEvent3.getSource() != 257)) {
                    if (hk2.d(19, keyEvent3)) {
                        z = ((nc2) jc2Var).g(5, true);
                    } else if (hk2.d(20, keyEvent3)) {
                        z = ((nc2) jc2Var).g(6, true);
                    } else if (hk2.d(21, keyEvent3)) {
                        z = ((nc2) jc2Var).g(3, true);
                    } else if (hk2.d(22, keyEvent3)) {
                        z = ((nc2) jc2Var).g(4, true);
                    } else if (hk2.d(23, keyEvent3)) {
                        ib6 ib6Var = ((hm3) this.B).c;
                        if (ib6Var != null) {
                            ((zc1) ib6Var).b();
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                Throwable th4 = (Throwable) obj;
                if (th4 instanceof li7) {
                    ((mq3) this.L).c.compareAndSet(-256, ((li7) th4).A);
                }
                ((fq3) this.B).cancel(false);
                return o27.a;
        }
    }
}

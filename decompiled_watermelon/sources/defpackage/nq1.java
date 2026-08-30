package defpackage;

import android.os.Handler;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nq1 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ nq1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        o27 o27Var = o27.a;
        EmulatorActivity emulatorActivity = this.B;
        switch (i) {
            case 0:
                int i2 = EmulatorActivity.P1;
                emulatorActivity.F0();
                return o27Var;
            case 1:
                int i3 = EmulatorActivity.P1;
                emulatorActivity.D0();
                return o27Var;
            case 2:
                int i4 = EmulatorActivity.P1;
                emulatorActivity.A0();
                return o27Var;
            case 3:
                int i5 = EmulatorActivity.P1;
                emulatorActivity.y0();
                return o27Var;
            case 4:
                k42 k42Var = emulatorActivity.J0;
                if (k42Var != null) {
                    k42Var.a(null);
                }
                return o27Var;
            case 5:
                Handler handler = emulatorActivity.K0;
                if (handler != null) {
                    handler.post(new kq1(emulatorActivity, 10));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case ig7.b /* 6 */:
                Handler handler2 = emulatorActivity.K0;
                if (handler2 != null) {
                    handler2.post(new wp1(emulatorActivity, 1));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case 7:
                Handler handler3 = emulatorActivity.K0;
                if (handler3 != null) {
                    handler3.post(new kq1(emulatorActivity, 11));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case 8:
                Handler handler4 = emulatorActivity.K0;
                if (handler4 != null) {
                    handler4.post(new kq1(emulatorActivity, 12));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case 9:
                Handler handler5 = emulatorActivity.K0;
                if (handler5 != null) {
                    handler5.post(new wp1(emulatorActivity, 2));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case 10:
                int i6 = EmulatorActivity.P1;
                emulatorActivity.getClass();
                if (emulatorActivity.W()) {
                    RendererDebugBridge.INSTANCE.setRenderer2DDebugControls(-1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 524287);
                    emulatorActivity.Y();
                }
                return o27Var;
            case 11:
                int i7 = EmulatorActivity.P1;
                emulatorActivity.H0();
                return o27Var;
            case mj2.L /* 12 */:
                int i8 = EmulatorActivity.P1;
                hv1 U = emulatorActivity.U();
                tq5.w(U.z, null, null, new gw1(U, null), 3);
                return o27Var;
            case 13:
                int i9 = EmulatorActivity.P1;
                emulatorActivity.M0();
                Handler handler6 = emulatorActivity.K0;
                if (handler6 != null) {
                    handler6.post(new kq1(emulatorActivity, 9));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case 14:
                int i10 = EmulatorActivity.P1;
                emulatorActivity.L0();
                Handler handler7 = emulatorActivity.K0;
                if (handler7 != null) {
                    handler7.post(new wp1(emulatorActivity, 0));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case ig7.e /* 15 */:
                int i11 = EmulatorActivity.P1;
                emulatorActivity.L0();
                Handler handler8 = emulatorActivity.K0;
                if (handler8 != null) {
                    handler8.post(new wp1(emulatorActivity, 3));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case 16:
                emulatorActivity.O1.M(ts1.PRESETS_DIALOG);
                emulatorActivity.y1.setValue(Boolean.FALSE);
                emulatorActivity.g0();
                return o27Var;
            case 17:
                int i12 = EmulatorActivity.P1;
                emulatorActivity.Z();
                return o27Var;
            case 18:
                int i13 = EmulatorActivity.P1;
                emulatorActivity.Z();
                return o27Var;
            case 19:
                int i14 = EmulatorActivity.P1;
                emulatorActivity.Q();
                emulatorActivity.g0();
                return o27Var;
            case 20:
                int i15 = EmulatorActivity.P1;
                tj4 tj4Var = emulatorActivity.z1;
                if (tj4Var.getValue() != null) {
                    tj4Var.setValue(null);
                    emulatorActivity.O1.M(ts1.PAUSE_MENU);
                }
                emulatorActivity.U().V0();
                return o27Var;
            case 21:
                emulatorActivity.A1.setValue(Boolean.FALSE);
                return o27Var;
            case 22:
                emulatorActivity.A1.setValue(Boolean.FALSE);
                return o27Var;
            case 23:
                int i16 = EmulatorActivity.P1;
                emulatorActivity.N();
                return o27Var;
            case 24:
                emulatorActivity.O1.M(ts1.ACHIEVEMENTS_DIALOG);
                emulatorActivity.w1.setValue(Boolean.FALSE);
                k42 k42Var2 = emulatorActivity.J0;
                if (k42Var2 != null) {
                    k42Var2.a(null);
                }
                emulatorActivity.g0();
                return o27Var;
            case 25:
                emulatorActivity.O1.M(ts1.PENDING_SUBMISSION_CONFIRM_EXIT);
                emulatorActivity.x1.setValue(Boolean.FALSE);
                emulatorActivity.U().t0(true);
                return o27Var;
            case 26:
                int i17 = EmulatorActivity.P1;
                emulatorActivity.getWindow().addFlags(128);
                k42 k42Var3 = emulatorActivity.J0;
                if (k42Var3 != null) {
                    k42Var3.R.setVisibility(8);
                }
                return o27Var;
            case 27:
                emulatorActivity.O1.M(ts1.PENDING_SUBMISSION_CONFIRM_EXIT);
                emulatorActivity.U().V0();
                emulatorActivity.x1.setValue(Boolean.FALSE);
                return o27Var;
            default:
                int i18 = EmulatorActivity.P1;
                emulatorActivity.getWindow().clearFlags(128);
                k42 k42Var4 = emulatorActivity.J0;
                if (k42Var4 != null) {
                    k42Var4.R.setVisibility(0);
                }
                return o27Var;
        }
    }
}

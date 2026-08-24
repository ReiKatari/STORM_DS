package defpackage;

import android.os.Handler;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bv1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bv1 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ bv1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        EmulatorActivity emulatorActivity = this.B;
        switch (i) {
            case 0:
                int i2 = EmulatorActivity.Z1;
                emulatorActivity.J0();
                return jg7Var;
            case 1:
                int i3 = EmulatorActivity.Z1;
                emulatorActivity.H0();
                return jg7Var;
            case 2:
                int i4 = EmulatorActivity.Z1;
                emulatorActivity.E0();
                return jg7Var;
            case 3:
                int i5 = EmulatorActivity.Z1;
                emulatorActivity.C0();
                return jg7Var;
            case 4:
                int i6 = EmulatorActivity.Z1;
                emulatorActivity.getWindow().addFlags(128);
                c92 c92Var = emulatorActivity.K0;
                if (c92Var != null) {
                    c92Var.R.setVisibility(8);
                }
                return jg7Var;
            case 5:
                int i7 = EmulatorActivity.Z1;
                emulatorActivity.getWindow().clearFlags(128);
                c92 c92Var2 = emulatorActivity.K0;
                if (c92Var2 != null) {
                    c92Var2.R.setVisibility(0);
                }
                return jg7Var;
            case 6:
                s8 s8Var = emulatorActivity.B0;
                if (s8Var != null) {
                    return s8Var.h;
                }
                nb3.a0("binding");
                throw null;
            case 7:
                int i8 = EmulatorActivity.Z1;
                emulatorActivity.W().M0(false);
                return jg7Var;
            case 8:
                int i9 = EmulatorActivity.Z1;
                emulatorActivity.W().T0();
                return jg7Var;
            case 9:
                c92 c92Var3 = emulatorActivity.K0;
                if (c92Var3 != null) {
                    c92Var3.a(null);
                }
                return jg7Var;
            case 10:
                int i10 = EmulatorActivity.Z1;
                EmulatorActivity emulatorActivity2 = this.B;
                return new hq2(emulatorActivity2, new bv1(emulatorActivity2, 6), new wc0(emulatorActivity2, null, 1), new bv1(emulatorActivity2, 7), new bv1(emulatorActivity2, 8));
            case 11:
                Handler handler = emulatorActivity.N0;
                if (handler != null) {
                    handler.post(new gu1(emulatorActivity, 1));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 12:
                Handler handler2 = emulatorActivity.N0;
                if (handler2 != null) {
                    handler2.post(new gu1(emulatorActivity, 5));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 13:
                Handler handler3 = emulatorActivity.N0;
                if (handler3 != null) {
                    handler3.post(new gu1(emulatorActivity, 2));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 14:
                Handler handler4 = emulatorActivity.N0;
                if (handler4 != null) {
                    handler4.post(new gu1(emulatorActivity, 3));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 15:
                Handler handler5 = emulatorActivity.N0;
                if (handler5 != null) {
                    handler5.post(new gu1(emulatorActivity, 6));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 16:
                int i11 = EmulatorActivity.Z1;
                emulatorActivity.getClass();
                if (emulatorActivity.Y()) {
                    RendererDebugBridge.INSTANCE.setRenderer2DDebugControls(-1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 524287);
                    emulatorActivity.a0();
                }
                return jg7Var;
            case 17:
                int i12 = EmulatorActivity.Z1;
                emulatorActivity.L0();
                return jg7Var;
            case 18:
                int i13 = EmulatorActivity.Z1;
                return new e84(emulatorActivity);
            case 19:
                int i14 = EmulatorActivity.Z1;
                emulatorActivity.b0();
                emulatorActivity.E1.setValue(Boolean.TRUE);
                emulatorActivity.V1.z(ex1.PRESETS_DIALOG);
                return jg7Var;
            case 20:
                int i15 = EmulatorActivity.Z1;
                sz1 W = emulatorActivity.W();
                hv.L(W.z, null, null, new r02(W, null), 3);
                return jg7Var;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                int i16 = EmulatorActivity.Z1;
                emulatorActivity.Q0();
                Handler handler6 = emulatorActivity.N0;
                if (handler6 != null) {
                    handler6.post(new gu1(emulatorActivity, 0));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 22:
                int i17 = EmulatorActivity.Z1;
                emulatorActivity.P0();
                Handler handler7 = emulatorActivity.N0;
                if (handler7 != null) {
                    handler7.post(new gu1(emulatorActivity, 4));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case ConnectionResult.API_DISABLED /* 23 */:
                int i18 = EmulatorActivity.Z1;
                emulatorActivity.P0();
                Handler handler8 = emulatorActivity.N0;
                if (handler8 != null) {
                    handler8.post(new gu1(emulatorActivity, 7));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                emulatorActivity.V1.T(ex1.PRESETS_DIALOG);
                emulatorActivity.E1.setValue(Boolean.FALSE);
                emulatorActivity.i0();
                return jg7Var;
            case 25:
                int i19 = EmulatorActivity.Z1;
                emulatorActivity.b0();
                return jg7Var;
            case SubAllocator.N4 /* 26 */:
                int i20 = EmulatorActivity.Z1;
                emulatorActivity.b0();
                return jg7Var;
            case 27:
                int i21 = EmulatorActivity.Z1;
                emulatorActivity.Q();
                emulatorActivity.i0();
                return jg7Var;
            case 28:
                int i22 = EmulatorActivity.Z1;
                vs4 vs4Var = emulatorActivity.F1;
                if (vs4Var.getValue() != null) {
                    vs4Var.setValue(null);
                    emulatorActivity.V1.T(ex1.PAUSE_MENU);
                }
                emulatorActivity.W().T0();
                return jg7Var;
            default:
                emulatorActivity.G1.setValue(Boolean.FALSE);
                return jg7Var;
        }
    }
}

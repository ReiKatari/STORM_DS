package defpackage;

import android.os.Handler;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ou1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ou1 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ ou1(EmulatorActivity emulatorActivity, int i) {
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
                Handler handler = emulatorActivity.N0;
                if (handler != null) {
                    handler.post(new gu1(emulatorActivity, 22));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 1:
                Handler handler2 = emulatorActivity.N0;
                if (handler2 != null) {
                    handler2.post(new gu1(emulatorActivity, 29));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 2:
                Handler handler3 = emulatorActivity.N0;
                if (handler3 != null) {
                    handler3.post(new gu1(emulatorActivity, 25));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 3:
                Handler handler4 = emulatorActivity.N0;
                if (handler4 != null) {
                    handler4.post(new gu1(emulatorActivity, 19));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 4:
                Handler handler5 = emulatorActivity.N0;
                if (handler5 != null) {
                    handler5.post(new gu1(emulatorActivity, 10));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 5:
                Handler handler6 = emulatorActivity.N0;
                if (handler6 != null) {
                    handler6.post(new gu1(emulatorActivity, 27));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 6:
                int i2 = EmulatorActivity.Z1;
                emulatorActivity.y0();
                return jg7Var;
            case 7:
                Handler handler7 = emulatorActivity.N0;
                if (handler7 != null) {
                    handler7.post(new gu1(emulatorActivity, 18));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 8:
                Handler handler8 = emulatorActivity.N0;
                if (handler8 != null) {
                    handler8.post(new gu1(emulatorActivity, 16));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 9:
                int i3 = EmulatorActivity.Z1;
                emulatorActivity.y0();
                return jg7Var;
            case 10:
                Handler handler9 = emulatorActivity.N0;
                if (handler9 != null) {
                    handler9.post(new gu1(emulatorActivity, 20));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 11:
                Handler handler10 = emulatorActivity.N0;
                if (handler10 != null) {
                    handler10.post(new gu1(emulatorActivity, 23));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 12:
                Handler handler11 = emulatorActivity.N0;
                if (handler11 != null) {
                    handler11.post(new gu1(emulatorActivity, 14));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 13:
                Handler handler12 = emulatorActivity.N0;
                if (handler12 != null) {
                    handler12.post(new gu1(emulatorActivity, 12));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 14:
                int i4 = EmulatorActivity.Z1;
                emulatorActivity.y0();
                return jg7Var;
            case 15:
                Handler handler13 = emulatorActivity.N0;
                if (handler13 != null) {
                    handler13.post(new gu1(emulatorActivity, 17));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 16:
                Handler handler14 = emulatorActivity.N0;
                if (handler14 != null) {
                    handler14.post(new gu1(emulatorActivity, 21));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 17:
                Handler handler15 = emulatorActivity.N0;
                if (handler15 != null) {
                    handler15.post(new gu1(emulatorActivity, 15));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 18:
                int i5 = EmulatorActivity.Z1;
                emulatorActivity.y0();
                return jg7Var;
            case 19:
                Handler handler16 = emulatorActivity.N0;
                if (handler16 != null) {
                    handler16.post(new gu1(emulatorActivity, 11));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 20:
                Handler handler17 = emulatorActivity.N0;
                if (handler17 != null) {
                    handler17.post(new gu1(emulatorActivity, 13));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                int i6 = EmulatorActivity.Z1;
                emulatorActivity.y0();
                return jg7Var;
            case 22:
                Handler handler18 = emulatorActivity.N0;
                if (handler18 != null) {
                    handler18.post(new gu1(emulatorActivity, 28));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case ConnectionResult.API_DISABLED /* 23 */:
                Handler handler19 = emulatorActivity.N0;
                if (handler19 != null) {
                    handler19.post(new gu1(emulatorActivity, 26));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                Handler handler20 = emulatorActivity.N0;
                if (handler20 != null) {
                    handler20.post(new gu1(emulatorActivity, 24));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 25:
                int i7 = EmulatorActivity.Z1;
                emulatorActivity.getClass();
                if (emulatorActivity.Y()) {
                    RendererDebugBridge.INSTANCE.setRenderer3DDebugControls(524287);
                    emulatorActivity.a0();
                }
                return jg7Var;
            case SubAllocator.N4 /* 26 */:
                int i8 = EmulatorActivity.Z1;
                emulatorActivity.L0();
                return jg7Var;
            case 27:
                int i9 = EmulatorActivity.Z1;
                emulatorActivity.w0();
                return jg7Var;
            case 28:
                int i10 = EmulatorActivity.Z1;
                emulatorActivity.s0();
                return jg7Var;
            default:
                Handler handler21 = emulatorActivity.N0;
                if (handler21 != null) {
                    handler21.post(new yu1(emulatorActivity, 6));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
        }
    }
}

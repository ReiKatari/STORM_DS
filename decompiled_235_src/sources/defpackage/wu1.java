package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.LinkedHashMap;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wu1 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ wu1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // defpackage.on2
    public final Object c() {
        Bundle bundle;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        EmulatorActivity emulatorActivity = this.B;
        switch (i) {
            case 0:
                Handler handler = emulatorActivity.N0;
                if (handler != null) {
                    handler.post(new yu1(emulatorActivity, 5));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 1:
                int i2 = EmulatorActivity.Z1;
                emulatorActivity.G0();
                return jg7Var;
            case 2:
                Handler handler2 = emulatorActivity.N0;
                if (handler2 != null) {
                    handler2.post(new yu1(emulatorActivity, 3));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 3:
                Handler handler3 = emulatorActivity.N0;
                if (handler3 != null) {
                    handler3.post(new yu1(emulatorActivity, 8));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 4:
                int i3 = EmulatorActivity.Z1;
                emulatorActivity.B0();
                return jg7Var;
            case 5:
                int i4 = EmulatorActivity.Z1;
                emulatorActivity.B0();
                return jg7Var;
            case 6:
                int i5 = EmulatorActivity.Z1;
                emulatorActivity.t0();
                return jg7Var;
            case 7:
                int i6 = EmulatorActivity.Z1;
                emulatorActivity.s0();
                return jg7Var;
            case 8:
                int i7 = EmulatorActivity.Z1;
                emulatorActivity.A0();
                return jg7Var;
            case 9:
                Handler handler4 = emulatorActivity.N0;
                if (handler4 != null) {
                    handler4.post(new yu1(emulatorActivity, 1));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 10:
                int i8 = EmulatorActivity.Z1;
                m94 m94Var = new m94(emulatorActivity.getDefaultViewModelCreationExtras());
                Uri data = emulatorActivity.getIntent().getData();
                if (data != null) {
                    LinkedHashMap linkedHashMap = m94Var.a;
                    w31 w31Var = y46.c;
                    Bundle bundle2 = (Bundle) linkedHashMap.get(w31Var);
                    if (bundle2 != null) {
                        bundle = new Bundle(bundle2);
                    } else {
                        bundle = new Bundle();
                    }
                    bundle.putString("uri", data.toString());
                    linkedHashMap.put(w31Var, bundle);
                }
                return m94Var;
            case 11:
                Handler handler5 = emulatorActivity.N0;
                if (handler5 != null) {
                    handler5.post(new yu1(emulatorActivity, 4));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 12:
                int i9 = EmulatorActivity.Z1;
                emulatorActivity.B0();
                return jg7Var;
            case 13:
                int i10 = EmulatorActivity.Z1;
                emulatorActivity.s0();
                return jg7Var;
            case 14:
                Handler handler6 = emulatorActivity.N0;
                if (handler6 != null) {
                    handler6.post(new yu1(emulatorActivity, 10));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 15:
                Handler handler7 = emulatorActivity.N0;
                if (handler7 != null) {
                    handler7.post(new yu1(emulatorActivity, 2));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 16:
                Handler handler8 = emulatorActivity.N0;
                if (handler8 != null) {
                    handler8.post(new yu1(emulatorActivity, 9));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 17:
                int i11 = EmulatorActivity.Z1;
                emulatorActivity.G0();
                return jg7Var;
            case 18:
                int i12 = EmulatorActivity.Z1;
                emulatorActivity.B0();
                return jg7Var;
            case 19:
                Handler handler9 = emulatorActivity.N0;
                if (handler9 != null) {
                    handler9.post(new yu1(emulatorActivity, 0));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 20:
                Handler handler10 = emulatorActivity.N0;
                if (handler10 != null) {
                    handler10.post(new yu1(emulatorActivity, 7));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                int i13 = EmulatorActivity.Z1;
                emulatorActivity.G0();
                return jg7Var;
            case 22:
                int i14 = EmulatorActivity.Z1;
                emulatorActivity.B0();
                return jg7Var;
            case ConnectionResult.API_DISABLED /* 23 */:
                int i15 = EmulatorActivity.Z1;
                emulatorActivity.t0();
                return jg7Var;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                int i16 = EmulatorActivity.Z1;
                emulatorActivity.B0();
                return jg7Var;
            case 25:
                int i17 = EmulatorActivity.Z1;
                emulatorActivity.I0();
                return jg7Var;
            case SubAllocator.N4 /* 26 */:
                int i18 = EmulatorActivity.Z1;
                emulatorActivity.J0();
                return jg7Var;
            case 27:
                int i19 = EmulatorActivity.Z1;
                emulatorActivity.I0();
                return jg7Var;
            case 28:
                int i20 = EmulatorActivity.Z1;
                emulatorActivity.J0();
                return jg7Var;
            default:
                int i21 = EmulatorActivity.Z1;
                emulatorActivity.H0();
                return jg7Var;
        }
    }
}

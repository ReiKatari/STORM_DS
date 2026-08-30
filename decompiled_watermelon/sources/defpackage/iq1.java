package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import java.util.LinkedHashMap;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class iq1 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ iq1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // defpackage.ki2
    public final Object c() {
        Bundle bundle;
        int i = this.A;
        o27 o27Var = o27.a;
        EmulatorActivity emulatorActivity = this.B;
        switch (i) {
            case 0:
                Handler handler = emulatorActivity.K0;
                if (handler != null) {
                    handler.post(new kq1(emulatorActivity, 2));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case 1:
                int i2 = EmulatorActivity.P1;
                emulatorActivity.C0();
                return o27Var;
            case 2:
                Handler handler2 = emulatorActivity.K0;
                if (handler2 != null) {
                    handler2.post(new kq1(emulatorActivity, 0));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case 3:
                Handler handler3 = emulatorActivity.K0;
                if (handler3 != null) {
                    handler3.post(new kq1(emulatorActivity, 5));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case 4:
                int i3 = EmulatorActivity.P1;
                emulatorActivity.x0();
                return o27Var;
            case 5:
                int i4 = EmulatorActivity.P1;
                emulatorActivity.x0();
                return o27Var;
            case ig7.b /* 6 */:
                int i5 = EmulatorActivity.P1;
                emulatorActivity.p0();
                return o27Var;
            case 7:
                int i6 = EmulatorActivity.P1;
                emulatorActivity.o0();
                return o27Var;
            case 8:
                int i7 = EmulatorActivity.P1;
                emulatorActivity.w0();
                return o27Var;
            case 9:
                Handler handler4 = emulatorActivity.K0;
                if (handler4 != null) {
                    handler4.post(new wp1(emulatorActivity, 28));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case 10:
                Handler handler5 = emulatorActivity.K0;
                if (handler5 != null) {
                    handler5.post(new kq1(emulatorActivity, 1));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case 11:
                int i8 = EmulatorActivity.P1;
                emulatorActivity.x0();
                return o27Var;
            case mj2.L /* 12 */:
                int i9 = EmulatorActivity.P1;
                emulatorActivity.o0();
                return o27Var;
            case 13:
                Handler handler6 = emulatorActivity.K0;
                if (handler6 != null) {
                    handler6.post(new kq1(emulatorActivity, 7));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case 14:
                Handler handler7 = emulatorActivity.K0;
                if (handler7 != null) {
                    handler7.post(new wp1(emulatorActivity, 29));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case ig7.e /* 15 */:
                Handler handler8 = emulatorActivity.K0;
                if (handler8 != null) {
                    handler8.post(new kq1(emulatorActivity, 6));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case 16:
                int i10 = EmulatorActivity.P1;
                emulatorActivity.C0();
                return o27Var;
            case 17:
                int i11 = EmulatorActivity.P1;
                g14 g14Var = new g14(emulatorActivity.getDefaultViewModelCreationExtras());
                Uri data = emulatorActivity.getIntent().getData();
                if (data != null) {
                    LinkedHashMap linkedHashMap = g14Var.a;
                    so1 so1Var = st5.c;
                    Bundle bundle2 = (Bundle) linkedHashMap.get(so1Var);
                    if (bundle2 != null) {
                        bundle = new Bundle(bundle2);
                    } else {
                        bundle = new Bundle();
                    }
                    bundle.putString("uri", data.toString());
                    linkedHashMap.put(so1Var, bundle);
                }
                return g14Var;
            case 18:
                int i12 = EmulatorActivity.P1;
                emulatorActivity.x0();
                return o27Var;
            case 19:
                Handler handler9 = emulatorActivity.K0;
                if (handler9 != null) {
                    handler9.post(new wp1(emulatorActivity, 27));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case 20:
                Handler handler10 = emulatorActivity.K0;
                if (handler10 != null) {
                    handler10.post(new kq1(emulatorActivity, 4));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case 21:
                int i13 = EmulatorActivity.P1;
                emulatorActivity.C0();
                return o27Var;
            case 22:
                int i14 = EmulatorActivity.P1;
                emulatorActivity.x0();
                return o27Var;
            case 23:
                int i15 = EmulatorActivity.P1;
                emulatorActivity.p0();
                return o27Var;
            case 24:
                int i16 = EmulatorActivity.P1;
                emulatorActivity.x0();
                return o27Var;
            case 25:
                int i17 = EmulatorActivity.P1;
                emulatorActivity.E0();
                return o27Var;
            case 26:
                int i18 = EmulatorActivity.P1;
                emulatorActivity.F0();
                return o27Var;
            case 27:
                int i19 = EmulatorActivity.P1;
                emulatorActivity.E0();
                return o27Var;
            case 28:
                int i20 = EmulatorActivity.P1;
                emulatorActivity.F0();
                return o27Var;
            default:
                int i21 = EmulatorActivity.P1;
                emulatorActivity.D0();
                return o27Var;
        }
    }
}

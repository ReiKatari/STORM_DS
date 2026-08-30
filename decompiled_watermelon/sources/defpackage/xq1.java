package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import java.util.Locale;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xq1 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ xq1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        boolean z;
        int i = this.A;
        boolean z2 = false;
        o27 o27Var = o27.a;
        EmulatorActivity emulatorActivity = this.B;
        switch (i) {
            case 0:
                gv5 gv5Var = (gv5) obj;
                int i2 = EmulatorActivity.P1;
                hv1 U = emulatorActivity.U();
                U.j1.k(gv5Var);
                ((b56) U.c).K(gv5Var);
                return o27Var;
            case 1:
                gv5 gv5Var2 = (gv5) obj;
                int i3 = EmulatorActivity.P1;
                hv1 U2 = emulatorActivity.U();
                U2.l1.k(gv5Var2);
                ((b56) U2.c).J(gv5Var2);
                return o27Var;
            case 2:
                RewindSaveState rewindSaveState = (RewindSaveState) obj;
                int i4 = EmulatorActivity.P1;
                rewindSaveState.getClass();
                emulatorActivity.O1.M(ts1.REWIND_WINDOW);
                emulatorActivity.F1.setValue(null);
                emulatorActivity.N1 = false;
                emulatorActivity.U().X0(rewindSaveState);
                emulatorActivity.U().V0();
                return o27Var;
            case 3:
                tj4 tj4Var = emulatorActivity.z1;
                ll4 ll4Var = (ll4) obj;
                int i5 = EmulatorActivity.P1;
                ll4Var.getClass();
                if (ll4Var != cp5.RESET && ll4Var != cp5.EXIT && ll4Var != k82.RESET && ll4Var != k82.EXIT) {
                    z = false;
                } else {
                    z = true;
                }
                if (ll4Var == cp5.REWIND) {
                    z2 = true;
                }
                if (z) {
                    if (tj4Var.getValue() != null) {
                        tj4Var.setValue(null);
                        emulatorActivity.O1.M(ts1.PAUSE_MENU);
                    }
                } else if (z2) {
                    tj4Var.setValue(null);
                    emulatorActivity.N1 = true;
                }
                emulatorActivity.U().M0(ll4Var);
                return o27Var;
            case 4:
                cm1 cm1Var = (cm1) obj;
                int i6 = EmulatorActivity.P1;
                cm1Var.getClass();
                hv1 U3 = emulatorActivity.U();
                U3.getClass();
                ee6 ee6Var = U3.X0;
                ee6Var.getClass();
                ee6Var.l(null, cm1Var);
                b56 b56Var = (b56) U3.c;
                b56Var.getClass();
                SharedPreferences.Editor edit = b56Var.b.edit();
                String lowerCase = cm1Var.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                edit.putString("dual_screen_preset", lowerCase);
                edit.apply();
                Handler handler = emulatorActivity.K0;
                if (handler != null) {
                    handler.post(new we(21, emulatorActivity, cm1Var));
                    return o27Var;
                }
                b53.g0("handler");
                throw null;
            case 5:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                int i7 = EmulatorActivity.P1;
                hv1 U4 = emulatorActivity.U();
                ee6 ee6Var2 = U4.V0;
                ee6Var2.getClass();
                ee6Var2.l(null, bool);
                SharedPreferences.Editor edit2 = ((b56) U4.c).b.edit();
                edit2.putBoolean("external_display_keep_ratio", booleanValue);
                edit2.apply();
                return o27Var;
            case ig7.b /* 6 */:
                RewindSaveState rewindSaveState2 = (RewindSaveState) obj;
                int i8 = EmulatorActivity.P1;
                rewindSaveState2.getClass();
                emulatorActivity.U().X0(rewindSaveState2);
                emulatorActivity.N();
                return o27Var;
            case 7:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue2 = bool2.booleanValue();
                int i9 = EmulatorActivity.P1;
                hv1 U5 = emulatorActivity.U();
                ee6 ee6Var3 = U5.Z0;
                ee6Var3.getClass();
                ee6Var3.l(null, bool2);
                SharedPreferences.Editor edit3 = ((b56) U5.c).b.edit();
                edit3.putBoolean("dual_screen_integer_scale", booleanValue2);
                edit3.apply();
                return o27Var;
            case 8:
                Boolean bool3 = (Boolean) obj;
                boolean booleanValue3 = bool3.booleanValue();
                int i10 = EmulatorActivity.P1;
                hv1 U6 = emulatorActivity.U();
                ee6 ee6Var4 = U6.b1;
                ee6Var4.getClass();
                ee6Var4.l(null, bool3);
                SharedPreferences.Editor edit4 = ((b56) U6.c).b.edit();
                edit4.putBoolean("dual_screen_internal_fill_height", booleanValue3);
                edit4.apply();
                return o27Var;
            case 9:
                Boolean bool4 = (Boolean) obj;
                boolean booleanValue4 = bool4.booleanValue();
                int i11 = EmulatorActivity.P1;
                hv1 U7 = emulatorActivity.U();
                ee6 ee6Var5 = U7.d1;
                ee6Var5.getClass();
                ee6Var5.l(null, bool4);
                SharedPreferences.Editor edit5 = ((b56) U7.c).b.edit();
                edit5.putBoolean("dual_screen_internal_fill_width", booleanValue4);
                edit5.apply();
                return o27Var;
            case 10:
                Boolean bool5 = (Boolean) obj;
                boolean booleanValue5 = bool5.booleanValue();
                int i12 = EmulatorActivity.P1;
                hv1 U8 = emulatorActivity.U();
                ee6 ee6Var6 = U8.f1;
                ee6Var6.getClass();
                ee6Var6.l(null, bool5);
                SharedPreferences.Editor edit6 = ((b56) U8.c).b.edit();
                edit6.putBoolean("dual_screen_external_fill_height", booleanValue5);
                edit6.apply();
                return o27Var;
            case 11:
                Boolean bool6 = (Boolean) obj;
                boolean booleanValue6 = bool6.booleanValue();
                int i13 = EmulatorActivity.P1;
                hv1 U9 = emulatorActivity.U();
                ee6 ee6Var7 = U9.h1;
                ee6Var7.getClass();
                ee6Var7.l(null, bool6);
                SharedPreferences.Editor edit7 = ((b56) U9.c).b.edit();
                edit7.putBoolean("dual_screen_external_fill_width", booleanValue6);
                edit7.apply();
                return o27Var;
            default:
                n6 n6Var = (n6) obj;
                int i14 = EmulatorActivity.P1;
                n6Var.getClass();
                k42 k42Var = emulatorActivity.J0;
                if (k42Var != null) {
                    k42Var.a(new et0(-689688603, true, new zq1(n6Var)));
                }
                return o27Var;
        }
    }
}

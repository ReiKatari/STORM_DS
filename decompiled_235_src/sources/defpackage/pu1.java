package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import java.util.Locale;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pu1 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ pu1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        boolean z;
        dy1 dy1Var;
        pq5 pq5Var;
        pq5 pq5Var2;
        pq5 pq5Var3;
        int i = this.A;
        boolean z2 = false;
        dy1 dy1Var2 = null;
        jg7 jg7Var = jg7.a;
        EmulatorActivity emulatorActivity = this.B;
        switch (i) {
            case 0:
                RewindSaveState rewindSaveState = (RewindSaveState) obj;
                int i2 = EmulatorActivity.Z1;
                rewindSaveState.getClass();
                emulatorActivity.W().V0(rewindSaveState);
                emulatorActivity.N();
                return jg7Var;
            case 1:
                Intent intent = (Intent) obj;
                int i3 = EmulatorActivity.Z1;
                intent.getClass();
                emulatorActivity.p1.a(intent);
                return jg7Var;
            case 2:
                p66 p66Var = (p66) obj;
                int i4 = EmulatorActivity.Z1;
                sz1 W = emulatorActivity.W();
                W.j1.l(p66Var);
                ((ng6) W.c).N(p66Var);
                return jg7Var;
            case 3:
                p66 p66Var2 = (p66) obj;
                int i5 = EmulatorActivity.Z1;
                sz1 W2 = emulatorActivity.W();
                W2.l1.l(p66Var2);
                ((ng6) W2.c).M(p66Var2);
                return jg7Var;
            case 4:
                RewindSaveState rewindSaveState2 = (RewindSaveState) obj;
                int i6 = EmulatorActivity.Z1;
                rewindSaveState2.getClass();
                emulatorActivity.V1.T(ex1.REWIND_WINDOW);
                emulatorActivity.L1.setValue(null);
                emulatorActivity.U1 = false;
                emulatorActivity.W().V0(rewindSaveState2);
                emulatorActivity.W().T0();
                return jg7Var;
            case 5:
                vs4 vs4Var = emulatorActivity.F1;
                nu4 nu4Var = (nu4) obj;
                int i7 = EmulatorActivity.Z1;
                nu4Var.getClass();
                if (nu4Var != xz5.RESET && nu4Var != xz5.EXIT && nu4Var != cd2.RESET && nu4Var != cd2.EXIT) {
                    z = false;
                } else {
                    z = true;
                }
                if (nu4Var == xz5.REWIND) {
                    z2 = true;
                }
                if (z) {
                    if (vs4Var.getValue() != null) {
                        vs4Var.setValue(null);
                        emulatorActivity.V1.T(ex1.PAUSE_MENU);
                    }
                } else if (z2) {
                    vs4Var.setValue(null);
                    emulatorActivity.U1 = true;
                }
                emulatorActivity.W().K0(nu4Var);
                return jg7Var;
            case 6:
                jq1 jq1Var = (jq1) obj;
                int i8 = EmulatorActivity.Z1;
                jq1Var.getClass();
                sz1 W3 = emulatorActivity.W();
                W3.getClass();
                tp6 tp6Var = W3.X0;
                tp6Var.getClass();
                tp6Var.m(null, jq1Var);
                Object value = W3.p0.getValue();
                if (value instanceof dy1) {
                    dy1Var = (dy1) value;
                } else {
                    dy1Var = null;
                }
                if (dy1Var == null || (pq5Var = dy1Var.a) == null) {
                    pq5Var = W3.n1;
                }
                if (pq5Var != null) {
                    jt5 a = jt5.a(pq5Var.f, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, jq1Var, null, null, 229375);
                    ((xb2) W3.e).B(pq5Var, a);
                    W3.n1 = pq5.a(pq5Var, null, null, a, null, false, null, 0L, false, null, 8159);
                } else {
                    ng6 ng6Var = (ng6) W3.c;
                    ng6Var.getClass();
                    SharedPreferences.Editor edit = ng6Var.b.edit();
                    String lowerCase = jq1Var.name().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    edit.putString("dual_screen_preset", lowerCase);
                    edit.apply();
                }
                Handler handler = emulatorActivity.N0;
                if (handler != null) {
                    handler.post(new mf(21, emulatorActivity, jq1Var));
                    return jg7Var;
                }
                nb3.a0("handler");
                throw null;
            case 7:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                int i9 = EmulatorActivity.Z1;
                sz1 W4 = emulatorActivity.W();
                tp6 tp6Var2 = W4.V0;
                tp6Var2.getClass();
                tp6Var2.m(null, bool);
                Object value2 = W4.p0.getValue();
                if (value2 instanceof dy1) {
                    dy1Var2 = (dy1) value2;
                }
                if (dy1Var2 == null || (pq5Var2 = dy1Var2.a) == null) {
                    pq5Var2 = W4.n1;
                }
                if (pq5Var2 != null) {
                    jt5 a2 = jt5.a(pq5Var2.f, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, bool, null, 196607);
                    ((xb2) W4.e).B(pq5Var2, a2);
                    W4.n1 = pq5.a(pq5Var2, null, null, a2, null, false, null, 0L, false, null, 8159);
                } else {
                    SharedPreferences.Editor edit2 = ((ng6) W4.c).b.edit();
                    edit2.putBoolean("external_display_keep_ratio", booleanValue);
                    edit2.apply();
                }
                return jg7Var;
            case 8:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue2 = bool2.booleanValue();
                int i10 = EmulatorActivity.Z1;
                sz1 W5 = emulatorActivity.W();
                tp6 tp6Var3 = W5.Z0;
                tp6Var3.getClass();
                tp6Var3.m(null, bool2);
                Object value3 = W5.p0.getValue();
                if (value3 instanceof dy1) {
                    dy1Var2 = (dy1) value3;
                }
                if (dy1Var2 == null || (pq5Var3 = dy1Var2.a) == null) {
                    pq5Var3 = W5.n1;
                }
                if (pq5Var3 != null) {
                    jt5 a3 = jt5.a(pq5Var3.f, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, bool2, 131071);
                    ((xb2) W5.e).B(pq5Var3, a3);
                    W5.n1 = pq5.a(pq5Var3, null, null, a3, null, false, null, 0L, false, null, 8159);
                } else {
                    SharedPreferences.Editor edit3 = ((ng6) W5.c).b.edit();
                    edit3.putBoolean("dual_screen_integer_scale", booleanValue2);
                    edit3.apply();
                }
                return jg7Var;
            case 9:
                Boolean bool3 = (Boolean) obj;
                boolean booleanValue3 = bool3.booleanValue();
                int i11 = EmulatorActivity.Z1;
                sz1 W6 = emulatorActivity.W();
                tp6 tp6Var4 = W6.b1;
                tp6Var4.getClass();
                tp6Var4.m(null, bool3);
                SharedPreferences.Editor edit4 = ((ng6) W6.c).b.edit();
                edit4.putBoolean("dual_screen_internal_fill_height", booleanValue3);
                edit4.apply();
                return jg7Var;
            case 10:
                Boolean bool4 = (Boolean) obj;
                boolean booleanValue4 = bool4.booleanValue();
                int i12 = EmulatorActivity.Z1;
                sz1 W7 = emulatorActivity.W();
                tp6 tp6Var5 = W7.d1;
                tp6Var5.getClass();
                tp6Var5.m(null, bool4);
                SharedPreferences.Editor edit5 = ((ng6) W7.c).b.edit();
                edit5.putBoolean("dual_screen_internal_fill_width", booleanValue4);
                edit5.apply();
                return jg7Var;
            case 11:
                Boolean bool5 = (Boolean) obj;
                boolean booleanValue5 = bool5.booleanValue();
                int i13 = EmulatorActivity.Z1;
                sz1 W8 = emulatorActivity.W();
                tp6 tp6Var6 = W8.f1;
                tp6Var6.getClass();
                tp6Var6.m(null, bool5);
                SharedPreferences.Editor edit6 = ((ng6) W8.c).b.edit();
                edit6.putBoolean("dual_screen_external_fill_height", booleanValue5);
                edit6.apply();
                return jg7Var;
            case 12:
                Boolean bool6 = (Boolean) obj;
                boolean booleanValue6 = bool6.booleanValue();
                int i14 = EmulatorActivity.Z1;
                sz1 W9 = emulatorActivity.W();
                tp6 tp6Var7 = W9.h1;
                tp6Var7.getClass();
                tp6Var7.m(null, bool6);
                SharedPreferences.Editor edit7 = ((ng6) W9.c).b.edit();
                edit7.putBoolean("dual_screen_external_fill_width", booleanValue6);
                edit7.apply();
                return jg7Var;
            default:
                o6 o6Var = (o6) obj;
                int i15 = EmulatorActivity.Z1;
                o6Var.getClass();
                c92 c92Var = emulatorActivity.K0;
                if (c92Var != null) {
                    c92Var.a(new zv0(-689688603, true, new ju1(o6Var)));
                }
                return jg7Var;
        }
    }
}

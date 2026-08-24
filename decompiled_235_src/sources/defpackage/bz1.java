package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement;
import me.magnum.melonds.ui.inputsetup.InputSetupActivity;
import me.magnum.melonds.ui.settings.preferences.FirmwareColourPickerPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bz1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bz1 implements qn2 {
    public final /* synthetic */ int A;

    public /* synthetic */ bz1(InputSetupActivity inputSetupActivity) {
        this.A = 23;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        Long valueOf;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        switch (this.A) {
            case 0:
                ta5 ta5Var = (ta5) obj;
                ta5Var.getClass();
                return new yj4(ta5Var.a, ta5Var.d, ta5Var.e);
            case 1:
                yj4 yj4Var = (yj4) obj;
                yj4Var.getClass();
                return Long.valueOf(yj4Var.a);
            case 2:
                sj4 sj4Var = (sj4) obj;
                sj4Var.getClass();
                return new RASimpleAchievement(sj4Var.a, sj4Var.b);
            case 3:
                String lowerCase = ((vb5) obj).a.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return lowerCase;
            case 4:
                co0 co0Var = (co0) obj;
                co0Var.getClass();
                Cheat cheat = co0Var.a;
                Long id = cheat.getId();
                if (id == null) {
                    return cheat.getCode();
                }
                return id;
            case 5:
                View view = (View) obj;
                List list = FirmwareColourPickerPreference.B;
                view.getClass();
                return new ev((ViewGroup) view, 5);
            case 6:
                eb6.d((gb6) obj, 0);
                return jg7.a;
            case 7:
                e36 e36Var = (e36) obj;
                e36Var.getClass();
                j36 i0 = e36Var.i0("DELETE FROM game WHERE id NOT IN (SELECT DISTINCT game_id FROM cheat_folder)");
                try {
                    i0.f0();
                    i0.close();
                    return jg7.a;
                } finally {
                }
            case 8:
                e36 e36Var2 = (e36) obj;
                e36Var2.getClass();
                j36 i02 = e36Var2.i0("SELECT * FROM game");
                try {
                    int B = ej2.B(i02, "id");
                    int B2 = ej2.B(i02, "name");
                    int B3 = ej2.B(i02, "game_code");
                    int B4 = ej2.B(i02, "game_checksum");
                    ArrayList arrayList = new ArrayList();
                    while (i02.f0()) {
                        if (i02.isNull(B)) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(i02.getLong(B));
                        }
                        arrayList.add(new lp2(valueOf, i02.R(B2), i02.R(B3), i02.R(B4)));
                    }
                    return arrayList;
                } finally {
                }
            case 9:
                ((yn) obj).getClass();
                return f04.U(i52.a(13), z72.b);
            case 10:
                n14 n14Var = (n14) obj;
                n14Var.getClass();
                return ((l14) n14Var.a()).get(1) + "l" + ((l14) n14Var.a()).get(2);
            case 11:
                n14 n14Var2 = (n14) obj;
                n14Var2.getClass();
                return ((l14) n14Var2.a()).get(1) + "l" + ((l14) n14Var2.a()).get(2);
            case 12:
                n14 n14Var3 = (n14) obj;
                n14Var3.getClass();
                return "l" + ((l14) n14Var3.a()).get(1);
            case 13:
                n14 n14Var4 = (n14) obj;
                n14Var4.getClass();
                return ((l14) n14Var4.a()).get(1) + "l";
            case 14:
                n14 n14Var5 = (n14) obj;
                n14Var5.getClass();
                return ((l14) n14Var5.a()).get(1) + "o" + ((l14) n14Var5.a()).get(2);
            case 15:
                n14 n14Var6 = (n14) obj;
                n14Var6.getClass();
                return "S" + ((l14) n14Var6.a()).get(1);
            case 16:
                n14 n14Var7 = (n14) obj;
                n14Var7.getClass();
                return "B" + ((l14) n14Var7.a()).get(1);
            case 17:
                n14 n14Var8 = (n14) obj;
                n14Var8.getClass();
                Object obj2 = ((l14) n14Var8.a()).get(1);
                String upperCase = ((String) ((l14) n14Var8.a()).get(2)).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                return obj2 + upperCase;
            case 18:
                return qs6.T0(((ta7) obj).a).toString();
            case 19:
                return ((ta7) obj).b;
            case 20:
                ki5 ki5Var = (ki5) obj;
                ki5Var.getClass();
                return Boolean.valueOf(ki5Var.g);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                synchronized (bm6.c) {
                    List list2 = bm6.i;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ((qn2) list2.get(i)).g(obj);
                    }
                }
                return jg7.a;
            case 22:
                cx4 cx4Var = (cx4) obj;
                return jg7.a;
            case ConnectionResult.API_DISABLED /* 23 */:
                InputDevice.MotionRange motionRange = (InputDevice.MotionRange) obj;
                int i2 = InputSetupActivity.D0;
                motionRange.getClass();
                return Boolean.valueOf((motionRange.isFromSource(16) || motionRange.isFromSource(16777232) || motionRange.isFromSource(1025)) ? true : true);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                int i3 = InputSetupActivity.D0;
                return Integer.valueOf(((InputDevice.MotionRange) obj).getAxis());
            case 25:
                i63 i63Var = (i63) obj;
                i63Var.getClass();
                return i63Var.a;
            case SubAllocator.N4 /* 26 */:
                h63 h63Var = (h63) obj;
                String str = "";
                h63Var.getClass();
                if (h63Var instanceof f63) {
                    String keyCodeToString = KeyEvent.keyCodeToString(((f63) h63Var).b);
                    keyCodeToString.getClass();
                    return qs6.T0(xs6.e0(xs6.e0(keyCodeToString, "KEYCODE", ""), "_", " ")).toString();
                } else if (h63Var instanceof e63) {
                    e63 e63Var = (e63) h63Var;
                    String axisToString = MotionEvent.axisToString(e63Var.b);
                    axisToString.getClass();
                    String obj3 = qs6.T0(xs6.e0(axisToString, "_", " ")).toString();
                    if (e63Var.c == d63.NEGATIVE) {
                        str = "-";
                    }
                    return str + obj3;
                } else if (h63Var.equals(g63.a)) {
                    return "";
                } else {
                    i.d();
                    return null;
                }
            case 27:
                i63 i63Var2 = (i63) obj;
                i63Var2.getClass();
                return i63Var2.a;
            case 28:
                if (((Character) obj).charValue() == '-') {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            default:
                if (((Character) obj).charValue() == '-') {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ bz1(int i) {
        this.A = i;
    }
}

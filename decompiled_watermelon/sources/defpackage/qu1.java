package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
import me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement;
import me.magnum.melonds.ui.inputsetup.InputSetupActivity;
import me.magnum.melonds.ui.settings.preferences.FirmwareColourPickerPreference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qu1 implements mi2 {
    public final /* synthetic */ int A;

    public /* synthetic */ qu1(InputSetupActivity inputSetupActivity) {
        this.A = 12;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        ns5 i0;
        Long valueOf;
        UUID uuid;
        k17 k17Var;
        mv5 mv5Var;
        k17 k17Var2;
        mv5 mv5Var2;
        UUID uuid2;
        k17 k17Var3;
        mv5 mv5Var3;
        k17 k17Var4;
        mv5 mv5Var4;
        BackgroundMode backgroundMode = null;
        boolean z = true;
        switch (this.A) {
            case 0:
                bb4 bb4Var = (bb4) obj;
                bb4Var.getClass();
                return Long.valueOf(bb4Var.a);
            case 1:
                va4 va4Var = (va4) obj;
                va4Var.getClass();
                return new RASimpleAchievement(va4Var.a, va4Var.b);
            case 2:
                String lowerCase = ((l25) obj).a.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return lowerCase;
            case 3:
                ul0 ul0Var = (ul0) obj;
                ul0Var.getClass();
                Cheat cheat = ul0Var.a;
                Long id = cheat.getId();
                if (id == null) {
                    return cheat.getCode();
                }
                return id;
            case 4:
                View view = (View) obj;
                Map map = FirmwareColourPickerPreference.B;
                view.getClass();
                return new mu(5, (ViewGroup) view);
            case 5:
                pz5.d((rz5) obj, 0);
                return o27.a;
            case ig7.b /* 6 */:
                ls5 ls5Var = (ls5) obj;
                ls5Var.getClass();
                i0 = ls5Var.i0("DELETE FROM game WHERE id NOT IN (SELECT DISTINCT game_id FROM cheat_folder)");
                try {
                    i0.a0();
                    i0.close();
                    return o27.a;
                } finally {
                }
            case 7:
                ls5 ls5Var2 = (ls5) obj;
                ls5Var2.getClass();
                i0 = ls5Var2.i0("SELECT * FROM game");
                try {
                    int r = hi2.r(i0, "id");
                    int r2 = hi2.r(i0, "name");
                    int r3 = hi2.r(i0, "game_code");
                    int r4 = hi2.r(i0, "game_checksum");
                    ArrayList arrayList = new ArrayList();
                    while (i0.a0()) {
                        if (i0.isNull(r)) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(i0.getLong(r));
                        }
                        arrayList.add(new fk2(valueOf, i0.q(r2), i0.q(r3), i0.q(r4)));
                    }
                    return arrayList;
                } finally {
                }
            case 8:
                ((mn) obj).getClass();
                return b53.m0(t02.a(13), h32.b);
            case 9:
                v85 v85Var = (v85) obj;
                v85Var.getClass();
                return Boolean.valueOf(v85Var.g);
            case 10:
                synchronized (ma6.c) {
                    List list = ma6.i;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((mi2) list.get(i)).n(obj);
                    }
                }
                return o27.a;
            case 11:
                xn4 xn4Var = (xn4) obj;
                return o27.a;
            case mj2.L /* 12 */:
                InputDevice.MotionRange motionRange = (InputDevice.MotionRange) obj;
                int i2 = InputSetupActivity.C0;
                motionRange.getClass();
                if (!motionRange.isFromSource(16) && !motionRange.isFromSource(16777232) && !motionRange.isFromSource(1025)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                int i3 = InputSetupActivity.C0;
                return Integer.valueOf(((InputDevice.MotionRange) obj).getAxis());
            case 14:
                e03 e03Var = (e03) obj;
                String str = "";
                e03Var.getClass();
                if (e03Var instanceof c03) {
                    String keyCodeToString = KeyEvent.keyCodeToString(((c03) e03Var).b);
                    keyCodeToString.getClass();
                    return zg6.Z0(gh6.l0(gh6.l0(keyCodeToString, "KEYCODE", ""), "_", " ")).toString();
                } else if (e03Var instanceof b03) {
                    b03 b03Var = (b03) e03Var;
                    String axisToString = MotionEvent.axisToString(b03Var.b);
                    axisToString.getClass();
                    String obj2 = zg6.Z0(gh6.l0(axisToString, "_", " ")).toString();
                    if (b03Var.c == a03.NEGATIVE) {
                        str = "-";
                    }
                    return str + obj2;
                } else if (e03Var.equals(d03.a)) {
                    return "";
                } else {
                    i.c();
                    return null;
                }
            case ig7.e /* 15 */:
                f03 f03Var = (f03) obj;
                f03Var.getClass();
                return f03Var.a;
            case 16:
                if (((Character) obj).charValue() != '-') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (((Character) obj).charValue() != '-') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                char charValue = ((Character) obj).charValue();
                if (charValue != 'T' && charValue != 't') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                if (((Character) obj).charValue() != ':') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                if (((Character) obj).charValue() != ':') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                char charValue2 = ((Character) obj).charValue();
                return Boolean.valueOf(('0' > charValue2 || charValue2 >= ':') ? false : false);
            case 22:
                ro0 ro0Var = (ro0) obj;
                ro0Var.getClass();
                ro0.a(ro0Var, "JsonPrimitive", new p73(new do1(21)));
                ro0.a(ro0Var, "JsonNull", new p73(new do1(22)));
                ro0.a(ro0Var, "JsonLiteral", new p73(new do1(23)));
                ro0.a(ro0Var, "JsonObject", new p73(new do1(24)));
                ro0.a(ro0Var, "JsonArray", new p73(new do1(25)));
                return o27.a;
            case 23:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                xg6.a(sb, (String) entry.getKey());
                sb.append(':');
                sb.append((k73) entry.getValue());
                return sb.toString();
            case 24:
                m41 m41Var = (m41) obj;
                if (m41Var != null && (k17Var2 = m41Var.a) != null && (mv5Var2 = k17Var2.a) != null) {
                    uuid = mv5Var2.a;
                } else {
                    uuid = null;
                }
                if (m41Var != null && (k17Var = m41Var.a) != null && (mv5Var = k17Var.a) != null) {
                    backgroundMode = mv5Var.b;
                }
                return new ti4(uuid, backgroundMode);
            case 25:
                m41 m41Var2 = (m41) obj;
                if (m41Var2 != null && (k17Var4 = m41Var2.a) != null && (mv5Var4 = k17Var4.b) != null) {
                    uuid2 = mv5Var4.a;
                } else {
                    uuid2 = null;
                }
                if (m41Var2 != null && (k17Var3 = m41Var2.a) != null && (mv5Var3 = k17Var3.b) != null) {
                    backgroundMode = mv5Var3.b;
                }
                return new ti4(uuid2, backgroundMode);
            case 26:
                ((String) obj).getClass();
                return Boolean.TRUE;
            case 27:
                ((y8) obj).getClass();
                return o27.a;
            case 28:
                nd3 nd3Var = (nd3) obj;
                nd3Var.getClass();
                UUID uuid3 = nd3Var.a;
                if (uuid3 == null) {
                    UUID randomUUID = UUID.randomUUID();
                    randomUUID.getClass();
                    return randomUUID;
                }
                return uuid3;
            default:
                ((Integer) obj).getClass();
                return null;
        }
    }

    public /* synthetic */ qu1(int i) {
        this.A = i;
    }
}

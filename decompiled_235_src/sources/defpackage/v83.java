package defpackage;

import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.mlkit.common.MlKitException;
import defpackage.xw5;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v83  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class v83 implements qn2 {
    public final /* synthetic */ int A;

    public /* synthetic */ v83(int i, jr3 jr3Var) {
        this.A = 16;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        UUID uuid;
        ff7 ff7Var;
        z66 z66Var;
        ff7 ff7Var2;
        z66 z66Var2;
        UUID uuid2;
        ff7 ff7Var3;
        z66 z66Var3;
        ff7 ff7Var4;
        z66 z66Var4;
        String e0;
        xw5.a aVar;
        int i = this.A;
        BackgroundMode backgroundMode = null;
        boolean z = true;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                char charValue = ((Character) obj).charValue();
                if (charValue != 'T' && charValue != 't') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (((Character) obj).charValue() != ':') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (((Character) obj).charValue() != ':') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                char charValue2 = ((Character) obj).charValue();
                if ('0' > charValue2 || charValue2 >= ':') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                br0 br0Var = (br0) obj;
                br0Var.getClass();
                br0.a(br0Var, "JsonPrimitive", new ie3(new ns1(25)));
                br0.a(br0Var, "JsonNull", new ie3(new ns1(26)));
                br0.a(br0Var, "JsonLiteral", new ie3(new ns1(27)));
                br0.a(br0Var, "JsonObject", new ie3(new ns1(28)));
                br0.a(br0Var, "JsonArray", new ie3(new ns1(29)));
                return jg7Var;
            case 5:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                os6.a(sb, (String) entry.getKey());
                sb.append(':');
                sb.append((de3) entry.getValue());
                return sb.toString();
            case 6:
                w71 w71Var = (w71) obj;
                if (w71Var != null && (ff7Var2 = w71Var.a) != null && (z66Var2 = ff7Var2.a) != null) {
                    uuid = z66Var2.a;
                } else {
                    uuid = null;
                }
                if (w71Var != null && (ff7Var = w71Var.a) != null && (z66Var = ff7Var.a) != null) {
                    backgroundMode = z66Var.b;
                }
                return new vr4(uuid, backgroundMode);
            case 7:
                w71 w71Var2 = (w71) obj;
                if (w71Var2 != null && (ff7Var4 = w71Var2.a) != null && (z66Var4 = ff7Var4.b) != null) {
                    uuid2 = z66Var4.a;
                } else {
                    uuid2 = null;
                }
                if (w71Var2 != null && (ff7Var3 = w71Var2.a) != null && (z66Var3 = ff7Var3.b) != null) {
                    backgroundMode = z66Var3.b;
                }
                return new vr4(uuid2, backgroundMode);
            case 8:
                ((String) obj).getClass();
                return Boolean.TRUE;
            case 9:
                ((z8) obj).getClass();
                return jg7Var;
            case 10:
                fk3 fk3Var = (fk3) obj;
                fk3Var.getClass();
                UUID uuid3 = fk3Var.a;
                if (uuid3 == null) {
                    UUID randomUUID = UUID.randomUUID();
                    randomUUID.getClass();
                    return randomUUID;
                }
                return uuid3;
            case 11:
                ((Integer) obj).getClass();
                return null;
            case 12:
                List list = (List) obj;
                return new ip3(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 13:
                ((Integer) obj).getClass();
                wo3 wo3Var = kp3.a;
                return yt1.A;
            case 14:
                ((Integer) obj).getClass();
                wo3 wo3Var2 = kp3.a;
                return -1;
            case 15:
                List list2 = (List) obj;
                return new pr3(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 16:
                a25 a25Var = (a25) obj;
                return jg7Var;
            case 17:
                c37 c37Var = (c37) obj;
                return jg7Var;
            case 18:
                List list3 = (List) obj;
                return jg7Var;
            case 19:
                k33 k33Var = (k33) obj;
                return jg7Var;
            case 20:
                wv3 wv3Var = (wv3) obj;
                wv3Var.getClass();
                qo2 qo2Var = wv3Var.d;
                if (!(qo2Var instanceof wv3)) {
                    return null;
                }
                return (wv3) qo2Var;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                wv3 wv3Var2 = (wv3) obj;
                wv3Var2.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(wv3Var2.b);
                sb2.append('=');
                sb2.append(wv3Var2.c);
                return sb2.toString();
            case 22:
                g04.y(16);
                String num = Integer.toString(((ze7) obj).A & 255, 16);
                num.getClass();
                return qs6.B0(2, num);
            case ConnectionResult.API_DISABLED /* 23 */:
                ((Long) obj).getClass();
                return jg7Var;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                w34 w34Var = (w34) obj;
                w34Var.getClass();
                String str = w34Var.a;
                String str2 = w34Var.b;
                Set set = y34.a;
                str.getClass();
                str2.getClass();
                if (y34.a.contains(str)) {
                    e0 = "<redacted>";
                } else {
                    e0 = xs6.e0(xs6.e0(str2, "\r", "\\r"), "\n", "\\n");
                    if (e0.length() > 200) {
                        e0 = qs6.S0(MlKitException.CODE_SCANNER_UNAVAILABLE, e0) + "…(len=" + e0.length() + ")";
                    }
                }
                return lb1.m(str, "=", e0);
            case 25:
                ek3 ek3Var = (ek3) obj;
                ek3Var.getClass();
                try {
                    return new hk3(ek3Var.k(), ek3Var.m(), ek3Var.q(), ek3Var.o(), ek3Var.r(), ek3Var.n(), c64.d(ek3Var.p()), c64.d(ek3Var.l()));
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            case SubAllocator.N4 /* 26 */:
                nw5 nw5Var = (nw5) obj;
                nw5Var.getClass();
                String p = nw5Var.p();
                String m = nw5Var.m();
                String n = nw5Var.n();
                String s = nw5Var.s();
                String q = nw5Var.q();
                u26 m2 = nw5Var.l().m();
                a36 n2 = nw5Var.l().n();
                String k = nw5Var.l().k();
                nt5 l = nw5Var.l();
                if (l.l()) {
                    aVar = xw5.a.GbaRom;
                } else {
                    aVar = xw5.a.None;
                }
                return new ow5(p, m, n, s, q, new ot5(m2, n2, k, new xw5(aVar, l.i(), l.j())), nw5Var.o(), nw5Var.t(), nw5Var.r());
            case 27:
                rd3 rd3Var = (rd3) obj;
                rd3Var.getClass();
                rd3Var.a = false;
                return jg7Var;
            case 28:
                mw5 mw5Var = (mw5) obj;
                mw5Var.getClass();
                if (mw5Var.c()) {
                    return mw5.a(mw5Var, mt5.a(mw5Var.b(), u26.DSi));
                }
                return mw5Var;
            default:
                rd3 rd3Var2 = (rd3) obj;
                rd3Var2.getClass();
                rd3Var2.a = false;
                return jg7Var;
        }
    }

    public /* synthetic */ v83(int i) {
        this.A = i;
    }
}

package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j4 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ qa4 B;

    public /* synthetic */ j4(qa4 qa4Var, int i) {
        this.A = i;
        this.B = qa4Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        fp fpVar;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        qa4 qa4Var = this.B;
        switch (i) {
            case 0:
                l6 l6Var = (l6) obj;
                l6Var.getClass();
                qa4Var.setValue(l6Var);
                return jg7Var;
            case 1:
                g6 g6Var = (g6) obj;
                g6Var.getClass();
                qa4Var.setValue(g6Var);
                return jg7Var;
            case 2:
                h3 h3Var = (h3) obj;
                h3Var.getClass();
                return Boolean.valueOf(((g6) qa4Var.getValue()).matches(h3Var.a));
            case 3:
                qa4Var.setValue(Integer.valueOf((int) (((q93) obj).a & 4294967295L)));
                return jg7Var;
            case 4:
                qa4Var.setValue((jk3) obj);
                return jg7Var;
            case 5:
                qa4Var.setValue((jk3) obj);
                return jg7Var;
            case 6:
                b07 b07Var = (b07) obj;
                if (b07Var.c) {
                    fpVar = b07Var.b;
                } else {
                    fpVar = b07Var.a;
                }
                qa4Var.setValue(fpVar);
                return jg7Var;
            case 7:
                List list = (List) obj;
                if (qa4Var != null) {
                    qa4Var.setValue(list);
                }
                return jg7Var;
            case 8:
                i91 i91Var = (i91) obj;
                i91Var.getClass();
                qa4Var.setValue(i91Var);
                return jg7Var;
            case 9:
                String str = (String) obj;
                str.getClass();
                qa4Var.setValue(str);
                return jg7Var;
            case 10:
                String str2 = (String) obj;
                str2.getClass();
                qa4Var.setValue(str2);
                return jg7Var;
            case 11:
                String str3 = (String) obj;
                str3.getClass();
                qa4Var.setValue(str3);
                return jg7Var;
            case 12:
                qa4Var.setValue((ck3) ((u52) ck3.getEntries()).get(((Integer) obj).intValue()));
                return jg7Var;
            case 13:
                qa4Var.setValue(Boolean.valueOf(!((Boolean) obj).booleanValue()));
                return jg7Var;
            case 14:
                String str4 = (String) obj;
                str4.getClass();
                if (!qs6.v0(str4)) {
                    qa4Var.setValue(str4);
                }
                return jg7Var;
            case 15:
                qa4Var.setValue((jk3) obj);
                return jg7Var;
            case 16:
                String str5 = (String) obj;
                str5.getClass();
                qa4Var.setValue(str5);
                return jg7Var;
            case 17:
                String str6 = (String) obj;
                str6.getClass();
                qa4Var.setValue(str6);
                return jg7Var;
            case 18:
                qa4Var.setValue(Integer.valueOf((int) (((q93) obj).a & 4294967295L)));
                return jg7Var;
            case 19:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                qa4Var.setValue(bool);
                return jg7Var;
            case 20:
                ((qe4) obj).getClass();
                qa4Var.setValue(Boolean.FALSE);
                return jg7Var;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                pq5 pq5Var = (pq5) obj;
                pq5Var.getClass();
                qa4Var.setValue(pq5Var.d.toString());
                return jg7Var;
            case 22:
                pq5 pq5Var2 = (pq5) obj;
                pq5Var2.getClass();
                qa4Var.setValue(pq5Var2.d.toString());
                return jg7Var;
            case ConnectionResult.API_DISABLED /* 23 */:
                String str7 = (String) obj;
                str7.getClass();
                qa4Var.setValue(str7);
                return jg7Var;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((qn2) qa4Var.getValue()).g(f)).floatValue());
            case 25:
                no1 no1Var = (no1) obj;
                long j = ((kt0) qa4Var.getValue()).a;
                float e0 = no1Var.e0(34.0f);
                float e02 = no1Var.e0(14.0f);
                float f2 = e02 / 2.0f;
                long floatToRawIntBits = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (no1Var.t0() & 4294967295L))) & 4294967295L);
                float f3 = e0 - f2;
                float intBitsToFloat = Float.intBitsToFloat((int) (no1Var.t0() & 4294967295L));
                no1.p0(no1Var, j, floatToRawIntBits, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), e02, 1, 480);
                return jg7Var;
            default:
                ((qn2) qa4Var.getValue()).g((jk4) obj);
                return jg7Var;
        }
    }
}

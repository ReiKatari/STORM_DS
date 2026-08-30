package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j4 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ k24 B;

    public /* synthetic */ j4(k24 k24Var, int i) {
        this.A = i;
        this.B = k24Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        to toVar;
        int i = this.A;
        o27 o27Var = o27.a;
        k24 k24Var = this.B;
        switch (i) {
            case 0:
                k6 k6Var = (k6) obj;
                k6Var.getClass();
                k24Var.setValue(k6Var);
                return o27Var;
            case 1:
                f6 f6Var = (f6) obj;
                f6Var.getClass();
                k24Var.setValue(f6Var);
                return o27Var;
            case 2:
                f3 f3Var = (f3) obj;
                f3Var.getClass();
                return Boolean.valueOf(((f6) k24Var.getValue()).matches(f3Var.a));
            case 3:
                k24Var.setValue(Integer.valueOf((int) (((i33) obj).a & 4294967295L)));
                return o27Var;
            case 4:
                k24Var.setValue((rd3) obj);
                return o27Var;
            case 5:
                k24Var.setValue((rd3) obj);
                return o27Var;
            case ig7.b /* 6 */:
                pn6 pn6Var = (pn6) obj;
                if (pn6Var.c) {
                    toVar = pn6Var.b;
                } else {
                    toVar = pn6Var.a;
                }
                k24Var.setValue(toVar);
                return o27Var;
            case 7:
                List list = (List) obj;
                if (k24Var != null) {
                    k24Var.setValue(list);
                }
                return o27Var;
            case 8:
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                k24Var.setValue(u51Var);
                return o27Var;
            case 9:
                String str = (String) obj;
                str.getClass();
                k24Var.setValue(str);
                return o27Var;
            case 10:
                String str2 = (String) obj;
                str2.getClass();
                k24Var.setValue(str2);
                return o27Var;
            case 11:
                String str3 = (String) obj;
                str3.getClass();
                k24Var.setValue(str3);
                return o27Var;
            case mj2.L /* 12 */:
                k24Var.setValue((kd3) ((f12) kd3.getEntries()).get(((Integer) obj).intValue()));
                return o27Var;
            case 13:
                k24Var.setValue(Boolean.valueOf(!((Boolean) obj).booleanValue()));
                return o27Var;
            case 14:
                String str4 = (String) obj;
                str4.getClass();
                if (!zg6.B0(str4)) {
                    k24Var.setValue(str4);
                }
                return o27Var;
            case ig7.e /* 15 */:
                k24Var.setValue((rd3) obj);
                return o27Var;
            case 16:
                String str5 = (String) obj;
                str5.getClass();
                k24Var.setValue(str5);
                return o27Var;
            case 17:
                String str6 = (String) obj;
                str6.getClass();
                k24Var.setValue(str6);
                return o27Var;
            case 18:
                k24Var.setValue(Integer.valueOf((int) (((i33) obj).a & 4294967295L)));
                return o27Var;
            case 19:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                k24Var.setValue(bool);
                return o27Var;
            case 20:
                rg5 rg5Var = (rg5) obj;
                rg5Var.getClass();
                k24Var.setValue(rg5Var.d.toString());
                return o27Var;
            case 21:
                rg5 rg5Var2 = (rg5) obj;
                rg5Var2.getClass();
                k24Var.setValue(rg5Var2.d.toString());
                return o27Var;
            case 22:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((mi2) k24Var.getValue()).n(f)).floatValue());
            case 23:
                hk1 hk1Var = (hk1) obj;
                long j = ((xq0) k24Var.getValue()).a;
                float C = hk1Var.C(34.0f);
                float C2 = hk1Var.C(14.0f);
                float f2 = C2 / 2.0f;
                long floatToRawIntBits = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (hk1Var.f0() & 4294967295L))) & 4294967295L);
                float f3 = C - f2;
                float intBitsToFloat = Float.intBitsToFloat((int) (hk1Var.f0() & 4294967295L));
                hk1.W(hk1Var, j, floatToRawIntBits, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), C2, 1, 480);
                return o27Var;
            default:
                ((mi2) k24Var.getValue()).n((mb4) obj);
                return o27Var;
        }
    }
}

package defpackage;

import java.util.Comparator;
import java.util.Date;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pj implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ pj(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return b53.E(((au4) obj2).a, ((au4) obj).a);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                return b53.E(((k53) obj).b, ((k53) obj2).b);
            case 3:
                d33 d33Var = (d33) obj;
                d33 d33Var2 = (d33) obj2;
                return (d33Var.B - d33Var.A) - (d33Var2.B - d33Var2.A);
            case 4:
                vf3 vf3Var = (vf3) obj;
                vf3 vf3Var2 = (vf3) obj2;
                float f = vf3Var.B0.p.z0;
                float f2 = vf3Var2.B0.p.z0;
                if (f == f2) {
                    return b53.E(vf3Var.v(), vf3Var2.v());
                }
                return Float.compare(f, f2);
            case 5:
                return b53.E(((hj3) obj).getIndex(), ((hj3) obj2).getIndex());
            case ig7.b /* 6 */:
                zo3 zo3Var = (zo3) obj;
                zo3 zo3Var2 = (zo3) obj2;
                int i2 = zo3Var.c;
                int i3 = zo3Var2.c;
                if (i2 < i3) {
                    return -1;
                }
                if (i2 > i3) {
                    return 1;
                }
                return Integer.compare(zo3Var2.d, zo3Var.d);
            case 7:
                return ((uw) obj).a.compareTo(((uw) obj2).a);
            case 8:
                rg5 rg5Var = (rg5) obj;
                rg5 rg5Var2 = (rg5) obj2;
                h85 h85Var = yo5.I;
                rg5Var.getClass();
                rg5Var2.getClass();
                Date date = rg5Var.g;
                if (date == null) {
                    return -1;
                }
                Date date2 = rg5Var2.g;
                if (date2 == null) {
                    return 1;
                }
                return date.compareTo(date2);
            case 9:
                rg5 rg5Var3 = (rg5) obj;
                rg5 rg5Var4 = (rg5) obj2;
                h85 h85Var2 = yo5.I;
                rg5Var3.getClass();
                rg5Var4.getClass();
                Date date3 = rg5Var4.g;
                if (date3 == null) {
                    return -1;
                }
                Date date4 = rg5Var3.g;
                if (date4 == null) {
                    return 1;
                }
                return date3.compareTo(date4);
            case 10:
                h85 h85Var3 = yo5.I;
                return im1.c(((rg5) obj).j, ((rg5) obj2).j);
            case 11:
                h85 h85Var4 = yo5.I;
                return im1.c(((rg5) obj2).j, ((rg5) obj).j);
            case mj2.L /* 12 */:
                rg5 rg5Var5 = (rg5) obj;
                rg5 rg5Var6 = (rg5) obj2;
                h85 h85Var5 = yo5.I;
                rg5Var5.getClass();
                rg5Var6.getClass();
                String str = rg5Var5.a;
                String str2 = rg5Var6.a;
                str.getClass();
                str2.getClass();
                return str.compareToIgnoreCase(str2);
            default:
                rg5 rg5Var7 = (rg5) obj;
                rg5 rg5Var8 = (rg5) obj2;
                h85 h85Var6 = yo5.I;
                rg5Var7.getClass();
                rg5Var8.getClass();
                String str3 = rg5Var8.a;
                String str4 = rg5Var7.a;
                str3.getClass();
                str4.getClass();
                return str3.compareToIgnoreCase(str4);
        }
    }
}

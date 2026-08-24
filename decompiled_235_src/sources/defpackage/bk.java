package defpackage;

import java.util.Comparator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bk implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ bk(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return nb3.p(((e35) obj2).a, ((e35) obj).a);
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
                return nb3.p(((xb3) obj).b, ((xb3) obj2).b);
            case 3:
                l93 l93Var = (l93) obj;
                l93 l93Var2 = (l93) obj2;
                return (l93Var.B - l93Var.A) - (l93Var2.B - l93Var2.A);
            case 4:
                sm3 sm3Var = (sm3) obj;
                sm3 sm3Var2 = (sm3) obj2;
                float f = sm3Var.C0.p.A0;
                float f2 = sm3Var2.C0.p.A0;
                if (f == f2) {
                    return nb3.p(sm3Var.w(), sm3Var2.w());
                }
                return Float.compare(f, f2);
            case 5:
                return nb3.p(((gq3) obj).getIndex(), ((gq3) obj2).getIndex());
            case 6:
                bw3 bw3Var = (bw3) obj;
                bw3 bw3Var2 = (bw3) obj2;
                int i2 = bw3Var.c;
                int i3 = bw3Var2.c;
                if (i2 < i3) {
                    return -1;
                }
                if (i2 > i3) {
                    return 1;
                }
                return Integer.compare(bw3Var2.d, bw3Var.d);
            default:
                return ((xx) obj).a.compareTo(((xx) obj2).a);
        }
    }
}

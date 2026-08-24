package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yj2  reason: default package */
/* loaded from: classes.dex */
public final class yj2 implements Comparable {
    public final int A;
    public final int B;
    public final String L;
    public final String R;

    public yj2(String str, int i, int i2, String str2) {
        str.getClass();
        str2.getClass();
        this.A = i;
        this.B = i2;
        this.L = str;
        this.R = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        yj2 yj2Var = (yj2) obj;
        yj2Var.getClass();
        int i = this.A - yj2Var.A;
        if (i == 0) {
            return this.B - yj2Var.B;
        }
        return i;
    }
}

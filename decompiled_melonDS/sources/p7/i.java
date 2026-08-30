package p7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements Comparable {
    public final int A;
    public final int B;
    public final String L;
    public final String R;

    public i(int i2, int i10, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.A = i2;
        this.B = i10;
        this.L = str;
        this.R = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        iVar.getClass();
        int i2 = this.A - iVar.A;
        if (i2 == 0) {
            return this.B - iVar.B;
        }
        return i2;
    }
}

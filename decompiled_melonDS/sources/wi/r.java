package wi;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class r {
    public static int a(int i2, int i10, int i11) {
        if ((i10 & 8) != 0) {
            i2--;
        }
        if (i11 <= i2) {
            return i2 - i11;
        }
        fj.j.h(kc.a.d(i11, i2, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }
}

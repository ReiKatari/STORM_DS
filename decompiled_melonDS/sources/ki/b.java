package ki;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements mc.l {
    public static final b B = new b(0);
    public static final b L = new b(1);
    public final /* synthetic */ int A;

    public /* synthetic */ b(int i2) {
        this.A = i2;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.A) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    str = "Unknown reason";
                }
                throw new Exception(str);
            default:
                String str2 = (String) obj;
                if (str2 == null) {
                    str2 = "Unknown reason";
                }
                throw new Exception(str2);
        }
    }
}

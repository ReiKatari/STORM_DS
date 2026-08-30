package zc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f15043a;

    static {
        String str;
        boolean z10;
        a0 a0Var;
        int i2 = ed.t.f4468a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z10 = Boolean.parseBoolean(str);
        } else {
            z10 = false;
        }
        if (!z10) {
            a0Var = y.f15041d0;
        } else {
            gd.f fVar = g0.f15015a;
            ad.e eVar = ed.n.f4465a;
            ad.e eVar2 = eVar.Y;
            a0Var = eVar;
            if (eVar == null) {
                a0Var = y.f15041d0;
            }
        }
        f15043a = a0Var;
    }
}

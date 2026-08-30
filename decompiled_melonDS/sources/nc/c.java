package nc;

import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c implements tc.a, Serializable {
    public transient tc.a A;
    public final Object B;
    public final Class L;
    public final String R;
    public final String X;
    public final boolean Y;

    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.B = obj;
        this.L = cls;
        this.R = str;
        this.X = str2;
        this.Y = z10;
    }

    public abstract tc.a a();

    public final d e() {
        boolean z10 = this.Y;
        Class cls = this.L;
        if (z10) {
            u.f10262a.getClass();
            return new n(cls);
        }
        return u.a(cls);
    }
}

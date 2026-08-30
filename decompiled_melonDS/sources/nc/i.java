package nc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class i extends c implements h, tc.a, yb.d {
    public final int Z;

    public i(int i2, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.Z = i2;
    }

    @Override // nc.c
    public final tc.a a() {
        u.f10262a.getClass();
        return this;
    }

    @Override // nc.h
    public final int c() {
        return this.Z;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (this.R.equals(iVar.R) && this.X.equals(iVar.X) && k.a(this.B, iVar.B) && e().equals(iVar.e())) {
                    return true;
                }
                return false;
            } else if (obj instanceof i) {
                tc.a aVar = this.A;
                if (aVar == null) {
                    a();
                    this.A = this;
                    aVar = this;
                }
                return obj.equals(aVar);
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        e();
        return this.X.hashCode() + w.d.d(e().hashCode() * 31, 31, this.R);
    }

    public final String toString() {
        tc.a aVar = this.A;
        if (aVar == null) {
            a();
            this.A = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.R;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return kc.a.g("function ", str, " (Kotlin reflection is not available)");
    }

    public i(int i2, Class cls, String str, String str2, int i10) {
        this(i2, b.A, cls, str, str2, i10, 0);
    }
}

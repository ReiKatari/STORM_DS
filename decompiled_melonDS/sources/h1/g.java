package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final r1.f f5900a;

    /* renamed from: b  reason: collision with root package name */
    public final zc.h f5901b;

    public g(r1.f fVar, zc.h hVar) {
        this.f5900a = fVar;
        this.f5901b = hVar;
    }

    public final String toString() {
        String str;
        String str2;
        zc.h hVar = this.f5901b;
        zc.t tVar = (zc.t) hVar.X.t(zc.t.L);
        if (tVar != null) {
            str = tVar.B;
        } else {
            str = null;
        }
        StringBuilder sb2 = new StringBuilder("Request@");
        int hashCode = hashCode();
        p7.k.f(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        sb2.append(num);
        if (str != null) {
            str2 = kc.a.g("[", str, "](");
        } else {
            str2 = "(";
        }
        sb2.append(str2);
        sb2.append("currentBounds()=");
        sb2.append(this.f5900a.b());
        sb2.append(", continuation=");
        sb2.append(hVar);
        sb2.append(')');
        return sb2.toString();
    }
}

package nd;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z implements jd.a {

    /* renamed from: a  reason: collision with root package name */
    public final Enum[] f10396a;

    /* renamed from: b  reason: collision with root package name */
    public final yb.n f10397b;

    public z(String str, Enum[] enumArr) {
        enumArr.getClass();
        this.f10396a = enumArr;
        this.f10397b = new yb.n(new a3.e(25, this, str));
    }

    @Override // jd.a
    public final Object a(md.c cVar) {
        int p10 = cVar.p(e());
        Enum[] enumArr = this.f10396a;
        if (p10 >= 0 && p10 < enumArr.length) {
            return enumArr[p10];
        }
        String b10 = e().b();
        int length = enumArr.length;
        throw new IllegalArgumentException(p10 + " is not among valid " + b10 + " enum values, values size is " + length);
    }

    @Override // jd.a
    public final void d(md.d dVar, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        Enum[] enumArr = this.f10396a;
        int A = zb.k.A(enumArr, r5);
        if (A != -1) {
            dVar.e(e(), A);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r5);
        String b10 = e().b();
        String arrays = Arrays.toString(enumArr);
        arrays.getClass();
        sb2.append(" is not a valid enum ");
        sb2.append(b10);
        sb2.append(", must be one of ");
        sb2.append(arrays);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // jd.a
    public final ld.e e() {
        return (ld.e) this.f10397b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + e().b() + '>';
    }
}

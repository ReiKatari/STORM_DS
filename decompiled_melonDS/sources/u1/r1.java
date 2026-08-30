package u1;

import d1.g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class r1 {

    /* renamed from: a  reason: collision with root package name */
    public static final g2 f13423a = new g2(q4.p.f12260a, 0, 0);

    public static final q4.e0 a(q4.g0 g0Var, l4.h hVar) {
        q4.e0 a10 = g0Var.a(hVar);
        int length = hVar.B.length();
        l4.h hVar2 = a10.f12244a;
        q4.q qVar = a10.f12245b;
        int length2 = hVar2.B.length();
        int min = Math.min(length, 100);
        for (int i2 = 0; i2 < min; i2++) {
            b(qVar.m(i2), length2, i2);
        }
        b(qVar.m(length), length2, length);
        int min2 = Math.min(length2, 100);
        for (int i10 = 0; i10 < min2; i10++) {
            c(qVar.l(i10), length, i10);
        }
        c(qVar.l(length2), length, length2);
        return new q4.e0(hVar2, new g2(qVar, hVar.B.length(), hVar2.B.length()));
    }

    public static final void b(int i2, int i10, int i11) {
        boolean z10 = false;
        if (i2 >= 0 && i2 <= i10) {
            z10 = true;
        }
        if (!z10) {
            StringBuilder j2 = kc.a.j("OffsetMapping.originalToTransformed returned invalid mapping: ", i11, " -> ", i2, " is not in range of transformed text [0, ");
            j2.append(i10);
            j2.append(']');
            k1.b.c(j2.toString());
        }
    }

    public static final void c(int i2, int i10, int i11) {
        boolean z10 = false;
        if (i2 >= 0 && i2 <= i10) {
            z10 = true;
        }
        if (!z10) {
            StringBuilder j2 = kc.a.j("OffsetMapping.transformedToOriginal returned invalid mapping: ", i11, " -> ", i2, " is not in range of original text [0, ");
            j2.append(i10);
            j2.append(']');
            k1.b.c(j2.toString());
        }
    }
}

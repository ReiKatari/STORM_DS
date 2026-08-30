package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements f, h {

    /* renamed from: a  reason: collision with root package name */
    public final float f8556a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8557b;

    /* renamed from: c  reason: collision with root package name */
    public final mc.p f8558c;

    /* renamed from: d  reason: collision with root package name */
    public final float f8559d;

    public g(float f8, boolean z10, mc.p pVar) {
        this.f8556a = f8;
        this.f8557b = z10;
        this.f8558c = pVar;
        this.f8559d = f8;
    }

    @Override // l1.f, l1.h
    public final float a() {
        return this.f8559d;
    }

    @Override // l1.h
    public final void b(int i2, y3.x0 x0Var, int[] iArr, int[] iArr2) {
        c(x0Var, i2, iArr, x4.m.Ltr, iArr2);
    }

    @Override // l1.f
    public final void c(x4.c cVar, int i2, int[] iArr, x4.m mVar, int[] iArr2) {
        boolean z10;
        int i10;
        int i11;
        if (iArr.length != 0) {
            int O = cVar.O(this.f8556a);
            if (this.f8557b && mVar == x4.m.Rtl) {
                z10 = true;
            } else {
                z10 = false;
            }
            s sVar = i.f8571a;
            if (!z10) {
                int length = iArr.length;
                int i12 = 0;
                i10 = 0;
                i11 = 0;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = iArr[i12];
                    int min = Math.min(i10, i2 - i14);
                    iArr2[i13] = min;
                    int min2 = Math.min(O, (i2 - min) - i14);
                    i12++;
                    i11 = min2;
                    i10 = iArr2[i13] + i14 + min2;
                    i13++;
                }
            } else {
                i10 = 0;
                i11 = 0;
                for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                    int i15 = iArr[length2];
                    int min3 = Math.min(i10, i2 - i15);
                    iArr2[length2] = min3;
                    i11 = Math.min(O, (i2 - min3) - i15);
                    i10 = iArr2[length2] + i15 + i11;
                }
            }
            int i16 = i10 - i11;
            mc.p pVar = this.f8558c;
            if (pVar != null && i16 < i2) {
                int intValue = ((Number) pVar.j(Integer.valueOf(i2 - i16), mVar)).intValue();
                int length3 = iArr2.length;
                for (int i17 = 0; i17 < length3; i17++) {
                    iArr2[i17] = iArr2[i17] + intValue;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (!x4.f.b(this.f8556a, gVar.f8556a) || this.f8557b != gVar.f8557b || !nc.k.a(this.f8558c, gVar.f8558c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int e6 = w.d.e(Float.hashCode(this.f8556a) * 31, this.f8557b, 31);
        mc.p pVar = this.f8558c;
        if (pVar == null) {
            hashCode = 0;
        } else {
            hashCode = pVar.hashCode();
        }
        return e6 + hashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f8557b) {
            str = "";
        } else {
            str = "Absolute";
        }
        sb2.append(str);
        sb2.append("Arrangement#spacedAligned(");
        sb2.append((Object) x4.f.c(this.f8556a));
        sb2.append(", ");
        sb2.append(this.f8558c);
        sb2.append(')');
        return sb2.toString();
    }
}

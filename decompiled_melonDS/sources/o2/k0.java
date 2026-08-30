package o2;

import java.util.Arrays;
import n2.h2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k0 extends pc.a {

    /* renamed from: e  reason: collision with root package name */
    public int f10645e;

    /* renamed from: g  reason: collision with root package name */
    public int f10647g;

    /* renamed from: i  reason: collision with root package name */
    public int f10649i;

    /* renamed from: d  reason: collision with root package name */
    public ek.a[] f10644d = new ek.a[16];

    /* renamed from: f  reason: collision with root package name */
    public int[] f10646f = new int[16];

    /* renamed from: h  reason: collision with root package name */
    public Object[] f10648h = new Object[16];

    public final void R() {
        this.f10645e = 0;
        this.f10647g = 0;
        Arrays.fill(this.f10648h, 0, this.f10649i, (Object) null);
        this.f10649i = 0;
    }

    public final void S(n2.c cVar, h2 h2Var, v2.i iVar, j0 j0Var) {
        if (U()) {
            f2.s sVar = new f2.s(this);
            k0 k0Var = (k0) sVar.f4792e;
            while (true) {
                ek.a aVar = k0Var.f10644d[sVar.f4789b];
                n2.a d4 = aVar.d(sVar);
                n2.c cVar2 = cVar;
                h2 h2Var2 = h2Var;
                v2.i iVar2 = iVar;
                j0 j0Var2 = j0Var;
                try {
                    aVar.c(sVar, cVar2, h2Var2, iVar2, j0Var2);
                    int i2 = sVar.f4789b;
                    int i10 = k0Var.f10645e;
                    if (i2 < i10) {
                        ek.a aVar2 = k0Var.f10644d[i2];
                        sVar.f4790c += aVar2.f4506b;
                        sVar.f4791d += aVar2.f4507c;
                        int i11 = i2 + 1;
                        sVar.f4789b = i11;
                        if (i11 >= i10) {
                            break;
                        }
                        cVar = cVar2;
                        h2Var = h2Var2;
                        iVar = iVar2;
                        j0Var = j0Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    if (j0Var2 != null) {
                        d0.d.k0(th2, new ai.p(d4, h2Var2, j0Var2, 6));
                    }
                    throw th2;
                }
            }
        }
        R();
    }

    public final boolean T() {
        if (this.f10645e == 0) {
            return true;
        }
        return false;
    }

    public final boolean U() {
        if (this.f10645e != 0) {
            return true;
        }
        return false;
    }

    public final void V(ek.a aVar) {
        int i2;
        int i10;
        int i11 = this.f10645e;
        ek.a[] aVarArr = this.f10644d;
        int i12 = 1024;
        if (i11 == aVarArr.length) {
            if (i11 > 1024) {
                i10 = 1024;
            } else {
                i10 = i11;
            }
            ek.a[] aVarArr2 = new ek.a[i10 + i11];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, i11);
            this.f10644d = aVarArr2;
        }
        int i13 = this.f10647g;
        int i14 = aVar.f4506b;
        int i15 = aVar.f4507c;
        int i16 = i13 + i14;
        int[] iArr = this.f10646f;
        int length = iArr.length;
        if (i16 > length) {
            if (length > 1024) {
                i2 = 1024;
            } else {
                i2 = length;
            }
            int i17 = i2 + length;
            if (i17 >= i16) {
                i16 = i17;
            }
            int[] iArr2 = new int[i16];
            zb.k.g(0, 0, length, iArr, iArr2);
            this.f10646f = iArr2;
        }
        int i18 = this.f10649i + i15;
        Object[] objArr = this.f10648h;
        int length2 = objArr.length;
        if (i18 > length2) {
            if (length2 <= 1024) {
                i12 = length2;
            }
            int i19 = i12 + length2;
            if (i19 >= i18) {
                i18 = i19;
            }
            Object[] objArr2 = new Object[i18];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f10648h = objArr2;
        }
        ek.a[] aVarArr3 = this.f10644d;
        int i20 = this.f10645e;
        this.f10645e = i20 + 1;
        aVarArr3[i20] = aVar;
        this.f10647g += aVar.f4506b;
        this.f10649i += i15;
    }
}

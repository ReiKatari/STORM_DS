package n2;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f9946a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9947b;

    /* renamed from: c  reason: collision with root package name */
    public int f9948c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f9949d;

    /* renamed from: e  reason: collision with root package name */
    public final a1.x f9950e;

    /* renamed from: f  reason: collision with root package name */
    public final yb.n f9951f;

    public k1(int i2, ArrayList arrayList) {
        this.f9946a = arrayList;
        this.f9947b = i2;
        if (i2 < 0) {
            l1.a("Invalid start index");
        }
        this.f9949d = new ArrayList();
        a1.x xVar = new a1.x();
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            q0 q0Var = (q0) this.f9946a.get(i11);
            int i12 = q0Var.f9992c;
            int i13 = q0Var.f9993d;
            xVar.i(i12, new k0(i11, i10, i13));
            i10 += i13;
        }
        this.f9950e = xVar;
        this.f9951f = new yb.n(new ah.y(2, this));
    }

    public final boolean a(int i2, int i10) {
        int i11;
        a1.x xVar = this.f9950e;
        k0 k0Var = (k0) xVar.b(i2);
        if (k0Var == null) {
            return false;
        }
        int i12 = k0Var.f9944b;
        int i13 = i10 - k0Var.f9945c;
        k0Var.f9945c = i10;
        if (i13 != 0) {
            Object[] objArr = xVar.f63c;
            long[] jArr = xVar.f61a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j2 = jArr[i14];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((255 & j2) < 128) {
                                k0 k0Var2 = (k0) objArr[(i14 << 3) + i16];
                                if (k0Var2.f9944b >= i12 && !k0Var2.equals(k0Var) && (i11 = k0Var2.f9944b + i13) >= 0) {
                                    k0Var2.f9944b = i11;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i15 != 8) {
                            return true;
                        }
                    }
                    if (i14 != length) {
                        i14++;
                    } else {
                        return true;
                    }
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}

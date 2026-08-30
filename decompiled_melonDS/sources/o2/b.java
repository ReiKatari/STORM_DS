package o2;

import java.util.ArrayList;
import n2.d2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final n2.r f10614a;

    /* renamed from: b  reason: collision with root package name */
    public a f10615b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10616c;

    /* renamed from: f  reason: collision with root package name */
    public int f10619f;

    /* renamed from: g  reason: collision with root package name */
    public int f10620g;

    /* renamed from: l  reason: collision with root package name */
    public int f10625l;

    /* renamed from: d  reason: collision with root package name */
    public final a4.w f10617d = new a4.w();

    /* renamed from: e  reason: collision with root package name */
    public boolean f10618e = true;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f10621h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public int f10622i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f10623j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f10624k = -1;

    public b(n2.r rVar, a aVar) {
        this.f10614a = rVar;
        this.f10615b = aVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.f10621h;
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            this.f10620g++;
        }
    }

    public final void b() {
        int i2 = this.f10620g;
        if (i2 > 0) {
            k0 k0Var = this.f10615b.f10612d;
            k0Var.V(h0.f10639d);
            k0Var.f10646f[k0Var.f10647g - k0Var.f10644d[k0Var.f10645e - 1].f4506b] = i2;
            this.f10620g = 0;
        }
        ArrayList arrayList = this.f10621h;
        if (!arrayList.isEmpty()) {
            a aVar = this.f10615b;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = arrayList.get(i10);
            }
            aVar.getClass();
            if (size != 0) {
                k0 k0Var2 = aVar.f10612d;
                k0Var2.V(k.f10643d);
                l0.f.C(k0Var2, 0, objArr);
            }
            arrayList.clear();
        }
    }

    public final void c() {
        int i2 = this.f10625l;
        if (i2 > 0) {
            int i10 = this.f10622i;
            if (i10 >= 0) {
                b();
                k0 k0Var = this.f10615b.f10612d;
                k0Var.V(z.f10668d);
                int i11 = k0Var.f10647g - k0Var.f10644d[k0Var.f10645e - 1].f4506b;
                int[] iArr = k0Var.f10646f;
                iArr[i11] = i10;
                iArr[i11 + 1] = i2;
                this.f10622i = -1;
            } else {
                int i12 = this.f10624k;
                int i13 = this.f10623j;
                b();
                k0 k0Var2 = this.f10615b.f10612d;
                k0Var2.V(v.f10664d);
                int i14 = k0Var2.f10647g - k0Var2.f10644d[k0Var2.f10645e - 1].f4506b;
                int[] iArr2 = k0Var2.f10646f;
                iArr2[i14 + 1] = i12;
                iArr2[i14] = i13;
                iArr2[i14 + 2] = i2;
                this.f10623j = -1;
                this.f10624k = -1;
            }
            this.f10625l = 0;
        }
    }

    public final void d(boolean z10) {
        int i2;
        d2 d2Var = this.f10614a.G;
        if (z10) {
            i2 = d2Var.f9894i;
        } else {
            i2 = d2Var.f9892g;
        }
        int i10 = i2 - this.f10619f;
        if (i10 < 0) {
            n2.t.a("Tried to seek backward");
        }
        if (i10 > 0) {
            k0 k0Var = this.f10615b.f10612d;
            k0Var.V(d.f10630d);
            k0Var.f10646f[k0Var.f10647g - k0Var.f10644d[k0Var.f10645e - 1].f4506b] = i10;
            this.f10619f = i2;
        }
    }

    public final void e(int i2, int i10) {
        boolean z10;
        if (i10 > 0) {
            if (i2 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                n2.t.a("Invalid remove index " + i2);
            }
            if (this.f10622i == i2) {
                this.f10625l += i10;
                return;
            }
            c();
            this.f10622i = i2;
            this.f10625l = i10;
        }
    }
}

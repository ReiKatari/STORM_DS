package ui;

import fj.j;
import java.util.ArrayList;
import nc.k;
import pi.d0;
import pi.r;
import pi.s;
import ti.n;
import ti.q;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final n f13556a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f13557b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13558c;

    /* renamed from: d  reason: collision with root package name */
    public final e9.a f13559d;

    /* renamed from: e  reason: collision with root package name */
    public final x0 f13560e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13561f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13562g;

    /* renamed from: h  reason: collision with root package name */
    public final int f13563h;

    /* renamed from: i  reason: collision with root package name */
    public int f13564i;

    public g(n nVar, ArrayList arrayList, int i2, e9.a aVar, x0 x0Var, int i10, int i11, int i12) {
        x0Var.getClass();
        this.f13556a = nVar;
        this.f13557b = arrayList;
        this.f13558c = i2;
        this.f13559d = aVar;
        this.f13560e = x0Var;
        this.f13561f = i10;
        this.f13562g = i11;
        this.f13563h = i12;
    }

    public static g a(g gVar, int i2, e9.a aVar, x0 x0Var, int i10) {
        if ((i10 & 1) != 0) {
            i2 = gVar.f13558c;
        }
        int i11 = i2;
        if ((i10 & 2) != 0) {
            aVar = gVar.f13559d;
        }
        e9.a aVar2 = aVar;
        if ((i10 & 4) != 0) {
            x0Var = gVar.f13560e;
        }
        x0 x0Var2 = x0Var;
        int i12 = gVar.f13561f;
        int i13 = gVar.f13562g;
        int i14 = gVar.f13563h;
        x0Var2.getClass();
        return new g(gVar.f13556a, gVar.f13557b, i11, aVar2, x0Var2, i12, i13, i14);
    }

    public final d0 b(x0 x0Var) {
        x0Var.getClass();
        ArrayList arrayList = this.f13557b;
        int size = arrayList.size();
        int i2 = this.f13558c;
        if (i2 < size) {
            this.f13564i++;
            e9.a aVar = this.f13559d;
            if (aVar != null) {
                q g10 = ((ti.g) aVar.f4416c).g();
                r rVar = (r) x0Var.f14089b;
                g10.getClass();
                rVar.getClass();
                r rVar2 = g10.f13256i.f11665h;
                if (rVar.f11785e == rVar2.f11785e && k.a(rVar.f11784d, rVar2.f11784d)) {
                    if (this.f13564i != 1) {
                        j.f(arrayList.get(i2 - 1), " must call proceed() exactly once", "network interceptor ");
                        return null;
                    }
                } else {
                    j.f(arrayList.get(i2 - 1), " must retain the same host and port", "network interceptor ");
                    return null;
                }
            }
            int i10 = i2 + 1;
            g a10 = a(this, i10, null, x0Var, 58);
            s sVar = (s) arrayList.get(i2);
            d0 a11 = sVar.a(a10);
            if (a11 != null) {
                if (aVar != null && i10 < arrayList.size() && a10.f13564i != 1) {
                    j.f(sVar, " must call proceed() exactly once", "network interceptor ");
                    return null;
                }
                return a11;
            }
            throw new NullPointerException("interceptor " + sVar + " returned null");
        }
        a0.j.p("Check failed.");
        return null;
    }
}

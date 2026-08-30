package e7;

import a7.k0;
import android.os.Bundle;
import java.util.LinkedHashMap;
import m9.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends d0.d {

    /* renamed from: o  reason: collision with root package name */
    public final a0.g f4392o;

    /* renamed from: p  reason: collision with root package name */
    public int f4393p;

    /* renamed from: q  reason: collision with root package name */
    public String f4394q;

    /* renamed from: r  reason: collision with root package name */
    public final k0.g f4395r;

    public i(Bundle bundle, LinkedHashMap linkedHashMap) {
        super(25);
        this.f4393p = -1;
        this.f4394q = "";
        this.f4395r = qd.a.f12509a;
        this.f4392o = new a0.g(13, bundle, linkedHashMap);
    }

    @Override // d0.d
    public final Object P() {
        return n0();
    }

    @Override // md.a
    public final k0.g c() {
        return this.f4395r;
    }

    @Override // d0.d, md.c
    public final md.c d(ld.e eVar) {
        eVar.getClass();
        if (d.e(eVar)) {
            this.f4394q = eVar.e(0);
            this.f4393p = 0;
        }
        return this;
    }

    @Override // md.a
    public final int g(ld.e eVar) {
        String e6;
        a0.g gVar;
        eVar.getClass();
        int i2 = this.f4393p;
        do {
            i2++;
            if (i2 >= eVar.d()) {
                return -1;
            }
            e6 = eVar.e(i2);
            gVar = this.f4392o;
            gVar.getClass();
            e6.getClass();
        } while (!((Bundle) gVar.B).containsKey(e6));
        this.f4393p = i2;
        this.f4394q = e6;
        return i2;
    }

    @Override // d0.d, md.c
    public final boolean i() {
        Object obj;
        String str = this.f4394q;
        a0.g gVar = this.f4392o;
        gVar.getClass();
        str.getClass();
        k0 k0Var = (k0) ((LinkedHashMap) gVar.L).get(str);
        if (k0Var != null) {
            obj = k0Var.a((Bundle) gVar.B, str);
        } else {
            obj = null;
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final Object n0() {
        Object obj;
        String str = this.f4394q;
        a0.g gVar = this.f4392o;
        gVar.getClass();
        str.getClass();
        k0 k0Var = (k0) ((LinkedHashMap) gVar.L).get(str);
        if (k0Var != null) {
            obj = k0Var.a((Bundle) gVar.B, str);
        } else {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        o.u(this.f4394q, "Unexpected null value for non-nullable argument ");
        return null;
    }

    @Override // md.c
    public final Object t(jd.a aVar) {
        aVar.getClass();
        return n0();
    }
}

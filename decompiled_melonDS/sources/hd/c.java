package hd;

import ec.j;
import ed.r;
import mc.q;
import zc.i0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6446a;

    /* renamed from: b  reason: collision with root package name */
    public final q f6447b;

    /* renamed from: c  reason: collision with root package name */
    public final q f6448c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f6449d;

    /* renamed from: e  reason: collision with root package name */
    public final j f6450e;

    /* renamed from: f  reason: collision with root package name */
    public final q f6451f;

    /* renamed from: g  reason: collision with root package name */
    public Object f6452g;

    /* renamed from: h  reason: collision with root package name */
    public int f6453h = -1;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ e f6454i;

    public c(e eVar, Object obj, q qVar, q qVar2, a0.c cVar, j jVar, q qVar3) {
        this.f6454i = eVar;
        this.f6446a = obj;
        this.f6447b = qVar;
        this.f6448c = qVar2;
        this.f6449d = cVar;
        this.f6450e = jVar;
        this.f6451f = qVar3;
    }

    public final void a() {
        i0 i0Var;
        Object obj = this.f6452g;
        if (obj instanceof r) {
            ((r) obj).h(this.f6453h, this.f6454i.A);
            return;
        }
        if (obj instanceof i0) {
            i0Var = (i0) obj;
        } else {
            i0Var = null;
        }
        if (i0Var != null) {
            i0Var.dispose();
        }
    }
}

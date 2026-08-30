package v0;

import d0.v1;
import j0.k;
import j0.l2;
import j0.t1;
import j0.u1;
import j0.w1;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements t1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f13585a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13586b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f13587c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l2 f13588d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k f13589e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f13590f;

    public /* synthetic */ c(d dVar, String str, String str2, l2 l2Var, k kVar, k kVar2) {
        this.f13585a = dVar;
        this.f13586b = str;
        this.f13587c = str2;
        this.f13588d = l2Var;
        this.f13589e = kVar;
        this.f13590f = kVar2;
    }

    @Override // j0.t1
    public final void a(w1 w1Var, u1 u1Var) {
        d dVar = this.f13585a;
        if (dVar.c() != null) {
            dVar.C();
            dVar.B(dVar.D(this.f13586b, this.f13587c, this.f13588d, this.f13589e, this.f13590f));
            dVar.o();
            g gVar = dVar.f13592q;
            gVar.getClass();
            l0.f.e();
            Iterator it = gVar.A.iterator();
            while (it.hasNext()) {
                gVar.l((v1) it.next());
            }
        }
    }
}

package m9;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {
    public final c A;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9403a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9404b;

    /* renamed from: c  reason: collision with root package name */
    public final o9.a f9405c;

    /* renamed from: d  reason: collision with root package name */
    public final i f9406d;

    /* renamed from: e  reason: collision with root package name */
    public final Bitmap.Config f9407e;

    /* renamed from: f  reason: collision with root package name */
    public final n9.d f9408f;

    /* renamed from: g  reason: collision with root package name */
    public final List f9409g;

    /* renamed from: h  reason: collision with root package name */
    public final p9.e f9410h;

    /* renamed from: i  reason: collision with root package name */
    public final pi.q f9411i;

    /* renamed from: j  reason: collision with root package name */
    public final r f9412j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f9413k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f9414l;
    public final boolean m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f9415n;

    /* renamed from: o  reason: collision with root package name */
    public final b f9416o;

    /* renamed from: p  reason: collision with root package name */
    public final b f9417p;

    /* renamed from: q  reason: collision with root package name */
    public final b f9418q;

    /* renamed from: r  reason: collision with root package name */
    public final zc.q f9419r;

    /* renamed from: s  reason: collision with root package name */
    public final zc.q f9420s;

    /* renamed from: t  reason: collision with root package name */
    public final zc.q f9421t;

    /* renamed from: u  reason: collision with root package name */
    public final zc.q f9422u;

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.r f9423v;

    /* renamed from: w  reason: collision with root package name */
    public final n9.h f9424w;

    /* renamed from: x  reason: collision with root package name */
    public final n9.f f9425x;

    /* renamed from: y  reason: collision with root package name */
    public final p f9426y;

    /* renamed from: z  reason: collision with root package name */
    public final d f9427z;

    public j(Context context, Object obj, o9.a aVar, i iVar, Bitmap.Config config, n9.d dVar, List list, p9.e eVar, pi.q qVar, r rVar, boolean z10, boolean z11, boolean z12, boolean z13, b bVar, b bVar2, b bVar3, zc.q qVar2, zc.q qVar3, zc.q qVar4, zc.q qVar5, androidx.lifecycle.r rVar2, n9.h hVar, n9.f fVar, p pVar, d dVar2, c cVar) {
        this.f9403a = context;
        this.f9404b = obj;
        this.f9405c = aVar;
        this.f9406d = iVar;
        this.f9407e = config;
        this.f9408f = dVar;
        this.f9409g = list;
        this.f9410h = eVar;
        this.f9411i = qVar;
        this.f9412j = rVar;
        this.f9413k = z10;
        this.f9414l = z11;
        this.m = z12;
        this.f9415n = z13;
        this.f9416o = bVar;
        this.f9417p = bVar2;
        this.f9418q = bVar3;
        this.f9419r = qVar2;
        this.f9420s = qVar3;
        this.f9421t = qVar4;
        this.f9422u = qVar5;
        this.f9423v = rVar2;
        this.f9424w = hVar;
        this.f9425x = fVar;
        this.f9426y = pVar;
        this.f9427z = dVar2;
        this.A = cVar;
    }

    public static h a(j jVar) {
        Context context = jVar.f9403a;
        jVar.getClass();
        return new h(jVar, context);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (nc.k.a(this.f9403a, jVar.f9403a) && this.f9404b.equals(jVar.f9404b) && nc.k.a(this.f9405c, jVar.f9405c) && nc.k.a(this.f9406d, jVar.f9406d) && this.f9407e == jVar.f9407e && this.f9408f == jVar.f9408f && nc.k.a(this.f9409g, jVar.f9409g) && nc.k.a(this.f9410h, jVar.f9410h) && nc.k.a(this.f9411i, jVar.f9411i) && this.f9412j.equals(jVar.f9412j) && this.f9413k == jVar.f9413k && this.f9414l == jVar.f9414l && this.m == jVar.m && this.f9415n == jVar.f9415n && this.f9416o == jVar.f9416o && this.f9417p == jVar.f9417p && this.f9418q == jVar.f9418q && nc.k.a(this.f9419r, jVar.f9419r) && nc.k.a(this.f9420s, jVar.f9420s) && nc.k.a(this.f9421t, jVar.f9421t) && nc.k.a(this.f9422u, jVar.f9422u) && nc.k.a(this.f9423v, jVar.f9423v) && this.f9424w.equals(jVar.f9424w) && this.f9425x == jVar.f9425x && this.f9426y.equals(jVar.f9426y) && this.f9427z.equals(jVar.f9427z) && nc.k.a(this.A, jVar.A)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int hashCode = (this.f9404b.hashCode() + (this.f9403a.hashCode() * 31)) * 31;
        int i10 = 0;
        o9.a aVar = this.f9405c;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (hashCode + i2) * 31;
        i iVar = this.f9406d;
        if (iVar != null) {
            i10 = iVar.hashCode();
        }
        int hashCode2 = this.f9407e.hashCode();
        int hashCode3 = this.f9408f.hashCode();
        int hashCode4 = this.f9409g.hashCode();
        int e6 = w.d.e(w.d.e(w.d.e(w.d.e((this.f9412j.f9451a.hashCode() + ((((this.f9410h.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((i11 + i10) * 29791)) * 961)) * 29791)) * 31)) * 31) + Arrays.hashCode(this.f9411i.A)) * 31)) * 31, this.f9413k, 31), this.f9414l, 31), this.m, 31), this.f9415n, 31);
        int hashCode5 = this.f9417p.hashCode();
        int hashCode6 = this.f9418q.hashCode();
        int hashCode7 = this.f9419r.hashCode();
        int hashCode8 = this.f9420s.hashCode();
        int hashCode9 = this.f9421t.hashCode();
        int hashCode10 = this.f9422u.hashCode();
        int hashCode11 = this.f9423v.hashCode();
        int hashCode12 = this.f9424w.hashCode();
        int hashCode13 = this.f9425x.hashCode();
        int hashCode14 = this.f9426y.A.hashCode();
        return this.A.hashCode() + ((this.f9427z.hashCode() + ((hashCode14 + ((hashCode13 + ((hashCode12 + ((hashCode11 + ((hashCode10 + ((hashCode9 + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((this.f9416o.hashCode() + e6) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * (-1807454463))) * 31);
    }
}

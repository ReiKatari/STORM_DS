package r0;

import android.graphics.Matrix;
import android.graphics.Rect;
import d0.m1;
import d0.p1;
import d0.r1;
import j0.t0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final int f12582a;

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f12583b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12584c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f12585d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f12586e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12587f;

    /* renamed from: g  reason: collision with root package name */
    public final j0.k f12588g;

    /* renamed from: h  reason: collision with root package name */
    public int f12589h;

    /* renamed from: i  reason: collision with root package name */
    public int f12590i;

    /* renamed from: k  reason: collision with root package name */
    public r1 f12592k;

    /* renamed from: l  reason: collision with root package name */
    public k f12593l;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12591j = false;
    public final HashSet m = new HashSet();

    /* renamed from: n  reason: collision with root package name */
    public boolean f12594n = false;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f12595o = new ArrayList();

    public l(int i2, int i10, j0.k kVar, Matrix matrix, boolean z10, Rect rect, int i11, int i12, boolean z11) {
        this.f12587f = i2;
        this.f12582a = i10;
        this.f12588g = kVar;
        this.f12583b = matrix;
        this.f12584c = z10;
        this.f12585d = rect;
        this.f12590i = i11;
        this.f12589h = i12;
        this.f12586e = z11;
        this.f12593l = new k(kVar.f7235a, i10);
    }

    public final void a() {
        p7.m.o("Edge is already closed.", !this.f12594n);
    }

    public final void b() {
        l0.f.e();
        this.f12593l.a();
        this.f12594n = true;
        this.f12595o.clear();
        this.m.clear();
    }

    public final r1 c(boolean z10) {
        l0.f.e();
        a();
        j0.k kVar = this.f12588g;
        r1 r1Var = new r1(kVar.f7235a, z10, kVar.f7237c, new f(this, 0));
        try {
            p1 p1Var = r1Var.f3454j;
            k kVar2 = this.f12593l;
            Objects.requireNonNull(kVar2);
            if (kVar2.g(p1Var, new g(kVar2, 0))) {
                m0.i.d(kVar2.f7299e).a(new h(p1Var, 0), ij.a.D());
            }
            this.f12592k = r1Var;
            e();
            return r1Var;
        } catch (t0 e6) {
            throw new AssertionError("Surface is somehow already closed", e6);
        } catch (RuntimeException e10) {
            r1Var.b();
            throw e10;
        }
    }

    public final void d() {
        boolean z10;
        l0.f.e();
        a();
        k kVar = this.f12593l;
        kVar.getClass();
        l0.f.e();
        if (kVar.f12580q == null) {
            synchronized (kVar.f7295a) {
                z10 = kVar.f7297c;
            }
            if (!z10) {
                return;
            }
        }
        this.f12591j = false;
        this.f12593l.a();
        this.f12593l = new k(this.f12588g.f7235a, this.f12582a);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void e() {
        bi.h hVar;
        l0.d dVar;
        l0.f.e();
        d0.k kVar = new d0.k(this.f12585d, this.f12590i, this.f12589h, this.f12584c, this.f12583b, this.f12586e);
        r1 r1Var = this.f12592k;
        if (r1Var != null) {
            synchronized (r1Var.f3445a) {
                r1Var.f3455k = kVar;
                hVar = r1Var.f3456l;
                dVar = r1Var.m;
            }
            if (hVar != null && dVar != null) {
                dVar.execute(new m1(hVar, kVar, 0));
            }
        }
        ArrayList arrayList = this.f12595o;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((z5.a) obj).accept(kVar);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SurfaceEdge{targets=");
        sb2.append(this.f12587f);
        sb2.append(", format=");
        sb2.append(this.f12582a);
        sb2.append(", resolution=");
        sb2.append(this.f12588g.f7235a);
        sb2.append(", cropRect=");
        sb2.append(this.f12585d);
        sb2.append(", rotationDegrees=");
        sb2.append(this.f12590i);
        sb2.append(", mirroring=");
        sb2.append(this.f12586e);
        sb2.append(", sensorToBufferTransform= ");
        Matrix matrix = this.f12583b;
        sb2.append(matrix);
        sb2.append(", rotationInTransform= ");
        sb2.append(k0.h.b(matrix));
        sb2.append(", isMirrorInTransform= ");
        sb2.append(k0.h.e(matrix));
        sb2.append(", isClosed=");
        sb2.append(this.f12594n);
        sb2.append('}');
        return sb2.toString();
    }
}

package o3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends c0 {

    /* renamed from: b  reason: collision with root package name */
    public i3.o f10744b;

    /* renamed from: c  reason: collision with root package name */
    public float f10745c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public List f10746d;

    /* renamed from: e  reason: collision with root package name */
    public float f10747e;

    /* renamed from: f  reason: collision with root package name */
    public float f10748f;

    /* renamed from: g  reason: collision with root package name */
    public i3.o f10749g;

    /* renamed from: h  reason: collision with root package name */
    public int f10750h;

    /* renamed from: i  reason: collision with root package name */
    public int f10751i;

    /* renamed from: j  reason: collision with root package name */
    public float f10752j;

    /* renamed from: k  reason: collision with root package name */
    public float f10753k;

    /* renamed from: l  reason: collision with root package name */
    public float f10754l;
    public float m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f10755n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f10756o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10757p;

    /* renamed from: q  reason: collision with root package name */
    public k3.h f10758q;

    /* renamed from: r  reason: collision with root package name */
    public final i3.h f10759r;

    /* renamed from: s  reason: collision with root package name */
    public i3.h f10760s;

    /* renamed from: t  reason: collision with root package name */
    public i3.h f10761t;

    /* renamed from: u  reason: collision with root package name */
    public final Object f10762u;

    public h() {
        int i2 = h0.f10763a;
        this.f10746d = zb.q.A;
        this.f10747e = 1.0f;
        this.f10750h = 0;
        this.f10751i = 0;
        this.f10752j = 4.0f;
        this.f10754l = 1.0f;
        this.f10755n = true;
        this.f10756o = true;
        i3.h a10 = i3.k.a();
        this.f10759r = a10;
        this.f10760s = a10;
        this.f10762u = p7.a.s(yb.h.NONE, g.L);
    }

    @Override // o3.c0
    public final void a(k3.d dVar) {
        k3.d dVar2;
        k3.h hVar;
        if (this.f10755n) {
            b.e(this.f10746d, this.f10759r);
            e();
        } else if (this.f10757p) {
            e();
        }
        this.f10755n = false;
        this.f10757p = false;
        i3.o oVar = this.f10744b;
        if (oVar != null) {
            dVar2 = dVar;
            k3.d.o0(dVar2, this.f10760s, oVar, this.f10745c, null, 56);
        } else {
            dVar2 = dVar;
        }
        i3.o oVar2 = this.f10749g;
        if (oVar2 != null) {
            k3.h hVar2 = this.f10758q;
            if (!this.f10756o && hVar2 != null) {
                hVar = hVar2;
            } else {
                k3.h hVar3 = new k3.h(this.f10748f, this.f10752j, this.f10750h, this.f10751i, 16);
                this.f10758q = hVar3;
                this.f10756o = false;
                hVar = hVar3;
            }
            k3.d.o0(dVar2, this.f10760s, oVar2, this.f10747e, hVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [yb.f, java.lang.Object] */
    public final void e() {
        boolean z10;
        Path path;
        int i2 = (this.f10753k > 0.0f ? 1 : (this.f10753k == 0.0f ? 0 : -1));
        i3.h hVar = this.f10759r;
        if (i2 == 0 && this.f10754l == 1.0f) {
            this.f10760s = hVar;
            return;
        }
        if (nc.k.a(this.f10760s, hVar)) {
            this.f10760s = i3.k.a();
        } else {
            Path.FillType fillType = this.f10760s.f6635a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            if (fillType == fillType2) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f10760s.f6635a.rewind();
            Path path2 = this.f10760s.f6635a;
            if (!z10) {
                fillType2 = Path.FillType.WINDING;
            }
            path2.setFillType(fillType2);
        }
        ?? r02 = this.f10762u;
        PathMeasure pathMeasure = ((i3.i) r02.getValue()).f6641a;
        if (hVar != null) {
            path = hVar.f6635a;
        } else {
            path = null;
        }
        pathMeasure.setPath(path, false);
        float length = ((i3.i) r02.getValue()).f6641a.getLength();
        float f8 = this.f10753k;
        float f10 = this.m;
        float f11 = ((f8 + f10) % 1.0f) * length;
        float f12 = ((this.f10754l + f10) % 1.0f) * length;
        if (f11 > f12) {
            i3.h hVar2 = this.f10761t;
            if (hVar2 == null) {
                hVar2 = i3.k.a();
                this.f10761t = hVar2;
            }
            hVar2.f();
            ((i3.i) r02.getValue()).a(f11, length, hVar2);
            i3.h.a(this.f10760s, hVar2);
            hVar2.f();
            ((i3.i) r02.getValue()).a(0.0f, f12, hVar2);
            i3.h.a(this.f10760s, hVar2);
            return;
        }
        ((i3.i) r02.getValue()).a(f11, f12, this.f10760s);
    }

    public final String toString() {
        return this.f10759r.toString();
    }
}

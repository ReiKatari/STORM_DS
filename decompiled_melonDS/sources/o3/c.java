package o3;

import i3.p0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends c0 {

    /* renamed from: b  reason: collision with root package name */
    public float[] f10679b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f10680c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f10681d = true;

    /* renamed from: e  reason: collision with root package name */
    public long f10682e = i3.s.f6687h;

    /* renamed from: f  reason: collision with root package name */
    public List f10683f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10684g;

    /* renamed from: h  reason: collision with root package name */
    public i3.h f10685h;

    /* renamed from: i  reason: collision with root package name */
    public mc.l f10686i;

    /* renamed from: j  reason: collision with root package name */
    public final a4.a f10687j;

    /* renamed from: k  reason: collision with root package name */
    public String f10688k;

    /* renamed from: l  reason: collision with root package name */
    public float f10689l;
    public float m;

    /* renamed from: n  reason: collision with root package name */
    public float f10690n;

    /* renamed from: o  reason: collision with root package name */
    public float f10691o;

    /* renamed from: p  reason: collision with root package name */
    public float f10692p;

    /* renamed from: q  reason: collision with root package name */
    public float f10693q;

    /* renamed from: r  reason: collision with root package name */
    public float f10694r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f10695s;

    public c() {
        int i2 = h0.f10763a;
        this.f10683f = zb.q.A;
        this.f10684g = true;
        this.f10687j = new a4.a(20, this);
        this.f10688k = "";
        this.f10691o = 1.0f;
        this.f10692p = 1.0f;
        this.f10695s = true;
    }

    @Override // o3.c0
    public final void a(k3.d dVar) {
        if (this.f10695s) {
            float[] fArr = this.f10679b;
            if (fArr == null) {
                fArr = i3.e0.a();
                this.f10679b = fArr;
            } else {
                i3.e0.d(fArr);
            }
            i3.e0.f(fArr, this.f10693q + this.m, this.f10694r + this.f10690n);
            float f8 = this.f10689l;
            if (fArr.length >= 16) {
                double d4 = f8 * 0.017453292519943295d;
                float sin = (float) Math.sin(d4);
                float cos = (float) Math.cos(d4);
                float f10 = fArr[0];
                float f11 = fArr[4];
                float f12 = (sin * f11) + (cos * f10);
                float f13 = -sin;
                float f14 = (f11 * cos) + (f10 * f13);
                float f15 = fArr[1];
                float f16 = fArr[5];
                float f17 = (sin * f16) + (cos * f15);
                float f18 = (f16 * cos) + (f15 * f13);
                float f19 = fArr[2];
                float f20 = fArr[6];
                float f21 = (sin * f20) + (cos * f19);
                float f22 = (f20 * cos) + (f19 * f13);
                float f23 = fArr[3];
                float f24 = fArr[7];
                fArr[0] = f12;
                fArr[1] = f17;
                fArr[2] = f21;
                fArr[3] = (sin * f24) + (cos * f23);
                fArr[4] = f14;
                fArr[5] = f18;
                fArr[6] = f22;
                fArr[7] = (cos * f24) + (f13 * f23);
            }
            float f25 = this.f10691o;
            float f26 = this.f10692p;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f25;
                fArr[1] = fArr[1] * f25;
                fArr[2] = fArr[2] * f25;
                fArr[3] = fArr[3] * f25;
                fArr[4] = fArr[4] * f26;
                fArr[5] = fArr[5] * f26;
                fArr[6] = fArr[6] * f26;
                fArr[7] = fArr[7] * f26;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            i3.e0.f(fArr, -this.m, -this.f10690n);
            this.f10695s = false;
        }
        if (this.f10684g) {
            if (!this.f10683f.isEmpty()) {
                i3.h hVar = this.f10685h;
                if (hVar == null) {
                    hVar = i3.k.a();
                    this.f10685h = hVar;
                }
                b.e(this.f10683f, hVar);
            }
            this.f10684g = false;
        }
        a4.n E = dVar.E();
        long t5 = E.t();
        E.p().p();
        try {
            a4.n nVar = (a4.n) ((d2.t) E.B).B;
            float[] fArr2 = this.f10679b;
            if (fArr2 != null) {
                nVar.p().s(fArr2);
            }
            i3.h hVar2 = this.f10685h;
            if (!this.f10683f.isEmpty() && hVar2 != null) {
                nVar.p().h(hVar2);
            }
            ArrayList arrayList = this.f10680c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((c0) arrayList.get(i2)).a(dVar);
            }
        } finally {
            w.d.y(E, t5);
        }
    }

    @Override // o3.c0
    public final mc.l b() {
        return this.f10686i;
    }

    @Override // o3.c0
    public final void d(a4.a aVar) {
        this.f10686i = aVar;
    }

    public final void e(int i2, c0 c0Var) {
        ArrayList arrayList = this.f10680c;
        if (i2 < arrayList.size()) {
            arrayList.set(i2, c0Var);
        } else {
            arrayList.add(c0Var);
        }
        g(c0Var);
        c0Var.d(this.f10687j);
        c();
    }

    public final void f(long j2) {
        if (this.f10681d && j2 != 16) {
            long j10 = this.f10682e;
            if (j10 == 16) {
                this.f10682e = j2;
                return;
            }
            int i2 = h0.f10763a;
            if (i3.s.h(j10) != i3.s.h(j2) || i3.s.g(j10) != i3.s.g(j2) || i3.s.e(j10) != i3.s.e(j2)) {
                this.f10681d = false;
                this.f10682e = i3.s.f6687h;
            }
        }
    }

    public final void g(c0 c0Var) {
        if (c0Var instanceof h) {
            h hVar = (h) c0Var;
            i3.o oVar = hVar.f10744b;
            if (this.f10681d && oVar != null) {
                if (oVar instanceof p0) {
                    f(((p0) oVar).f6676a);
                } else {
                    this.f10681d = false;
                    this.f10682e = i3.s.f6687h;
                }
            }
            i3.o oVar2 = hVar.f10749g;
            if (this.f10681d && oVar2 != null) {
                if (oVar2 instanceof p0) {
                    f(((p0) oVar2).f6676a);
                    return;
                }
                this.f10681d = false;
                this.f10682e = i3.s.f6687h;
            }
        } else if (c0Var instanceof c) {
            c cVar = (c) c0Var;
            if (cVar.f10681d && this.f10681d) {
                f(cVar.f10682e);
                return;
            }
            this.f10681d = false;
            this.f10682e = i3.s.f6687h;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f10688k);
        ArrayList arrayList = this.f10680c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb2.append("\t");
            sb2.append(((c0) arrayList.get(i2)).toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}

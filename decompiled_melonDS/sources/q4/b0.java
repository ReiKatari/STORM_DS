package q4;

import a4.m0;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l4.o0;
import l4.q0;
import p1.c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 implements s {

    /* renamed from: a  reason: collision with root package name */
    public final View f12210a;

    /* renamed from: b  reason: collision with root package name */
    public final c1 f12211b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f12212c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12213d;

    /* renamed from: e  reason: collision with root package name */
    public mc.l f12214e;

    /* renamed from: f  reason: collision with root package name */
    public mc.l f12215f;

    /* renamed from: g  reason: collision with root package name */
    public x f12216g;

    /* renamed from: h  reason: collision with root package name */
    public j f12217h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f12218i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f12219j;

    /* renamed from: k  reason: collision with root package name */
    public Rect f12220k;

    /* renamed from: l  reason: collision with root package name */
    public final c f12221l;
    public final p2.b m;

    /* renamed from: n  reason: collision with root package name */
    public a8.f f12222n;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p1.c1] */
    public b0(View view, b4.x xVar) {
        ?? obj = new Object();
        obj.A = view;
        obj.B = p7.a.s(yb.h.NONE, new m0(12, obj));
        obj.L = new a0.b(view);
        c0 c0Var = new c0(Choreographer.getInstance());
        this.f12210a = view;
        this.f12211b = obj;
        this.f12212c = c0Var;
        this.f12214e = b.X;
        this.f12215f = b.Y;
        this.f12216g = new x("", 4, q0.f8883b);
        this.f12217h = j.f12249g;
        this.f12218i = new ArrayList();
        this.f12219j = p7.a.s(yb.h.NONE, new m0(13, this));
        this.f12221l = new c(xVar, obj);
        this.m = new p2.b(new z[16]);
    }

    @Override // q4.s
    public final void a(x xVar, j jVar, ai.c0 c0Var, u1.s sVar) {
        this.f12213d = true;
        this.f12216g = xVar;
        this.f12217h = jVar;
        this.f12214e = c0Var;
        this.f12215f = sVar;
        i(z.StartInput);
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [yb.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v22, types: [yb.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [yb.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [yb.f, java.lang.Object] */
    @Override // q4.s
    public final void b(x xVar, x xVar2) {
        boolean z10;
        int i2;
        int i10;
        int i11;
        if (q0.b(this.f12216g.f12277b, xVar2.f12277b) && nc.k.a(this.f12216g.f12278c, xVar2.f12278c)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f12216g = xVar2;
        int size = this.f12218i.size();
        for (int i12 = 0; i12 < size; i12++) {
            t tVar = (t) ((WeakReference) this.f12218i.get(i12)).get();
            if (tVar != null) {
                tVar.f12264d = xVar2;
            }
        }
        c cVar = this.f12221l;
        synchronized (cVar.f12225c) {
            cVar.f12232j = null;
            cVar.f12234l = null;
            cVar.f12233k = null;
            cVar.m = b.L;
            cVar.f12235n = null;
            cVar.f12236o = null;
        }
        int i13 = -1;
        if (nc.k.a(xVar, xVar2)) {
            if (z10) {
                c1 c1Var = this.f12211b;
                int f8 = q0.f(xVar2.f12277b);
                int e6 = q0.e(xVar2.f12277b);
                q0 q0Var = this.f12216g.f12278c;
                if (q0Var != null) {
                    i11 = q0.f(q0Var.f8885a);
                } else {
                    i11 = -1;
                }
                q0 q0Var2 = this.f12216g.f12278c;
                if (q0Var2 != null) {
                    i13 = q0.e(q0Var2.f8885a);
                }
                ((InputMethodManager) c1Var.B.getValue()).updateSelection((View) c1Var.A, f8, e6, i11, i13);
            }
        } else if (xVar != null && (!nc.k.a(xVar.f12276a.B, xVar2.f12276a.B) || (q0.b(xVar.f12277b, xVar2.f12277b) && !nc.k.a(xVar.f12278c, xVar2.f12278c)))) {
            c1 c1Var2 = this.f12211b;
            ((InputMethodManager) c1Var2.B.getValue()).restartInput((View) c1Var2.A);
        } else {
            int size2 = this.f12218i.size();
            for (int i14 = 0; i14 < size2; i14++) {
                t tVar2 = (t) ((WeakReference) this.f12218i.get(i14)).get();
                if (tVar2 != null) {
                    x xVar3 = this.f12216g;
                    c1 c1Var3 = this.f12211b;
                    if (tVar2.f12268h) {
                        tVar2.f12264d = xVar3;
                        if (tVar2.f12266f) {
                            ((InputMethodManager) c1Var3.B.getValue()).updateExtractedText((View) c1Var3.A, tVar2.f12265e, zb.k.M(xVar3));
                        }
                        q0 q0Var3 = xVar3.f12278c;
                        long j2 = xVar3.f12277b;
                        if (q0Var3 != null) {
                            i2 = q0.f(q0Var3.f8885a);
                        } else {
                            i2 = -1;
                        }
                        q0 q0Var4 = xVar3.f12278c;
                        if (q0Var4 != null) {
                            i10 = q0.e(q0Var4.f8885a);
                        } else {
                            i10 = -1;
                        }
                        ((InputMethodManager) c1Var3.B.getValue()).updateSelection((View) c1Var3.A, q0.f(j2), q0.e(j2), i2, i10);
                    }
                }
            }
        }
    }

    @Override // q4.s
    public final void c() {
        i(z.StartInput);
    }

    @Override // q4.s
    public final void d(h3.c cVar) {
        Rect rect;
        this.f12220k = new Rect(pc.a.M(cVar.f6052a), pc.a.M(cVar.f6053b), pc.a.M(cVar.f6054c), pc.a.M(cVar.f6055d));
        if (this.f12218i.isEmpty() && (rect = this.f12220k) != null) {
            this.f12210a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // q4.s
    public final void e() {
        i(z.ShowKeyboard);
    }

    @Override // q4.s
    public final void f() {
        i(z.HideKeyboard);
    }

    @Override // q4.s
    public final void g(x xVar, q qVar, o0 o0Var, bd.u uVar, h3.c cVar, h3.c cVar2) {
        c cVar3 = this.f12221l;
        synchronized (cVar3.f12225c) {
            try {
                cVar3.f12232j = xVar;
                cVar3.f12234l = qVar;
                cVar3.f12233k = o0Var;
                cVar3.m = uVar;
                cVar3.f12235n = cVar;
                cVar3.f12236o = cVar2;
                if (!cVar3.f12227e) {
                    if (cVar3.f12226d) {
                    }
                }
                cVar3.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // q4.s
    public final void h() {
        this.f12213d = false;
        this.f12214e = b.Z;
        this.f12215f = b.f12209b0;
        this.f12220k = null;
        i(z.StopInput);
    }

    public final void i(z zVar) {
        this.m.b(zVar);
        if (this.f12222n == null) {
            a8.f fVar = new a8.f(26, this);
            this.f12212c.execute(fVar);
            this.f12222n = fVar;
        }
    }
}

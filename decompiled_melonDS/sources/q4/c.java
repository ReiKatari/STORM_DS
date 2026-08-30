package q4;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import l4.i0;
import l4.o0;
import l4.q0;
import p1.c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b4.x f12223a;

    /* renamed from: b  reason: collision with root package name */
    public final c1 f12224b;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12226d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12227e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12228f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12229g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12230h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12231i;

    /* renamed from: j  reason: collision with root package name */
    public x f12232j;

    /* renamed from: k  reason: collision with root package name */
    public o0 f12233k;

    /* renamed from: l  reason: collision with root package name */
    public q f12234l;

    /* renamed from: n  reason: collision with root package name */
    public h3.c f12235n;

    /* renamed from: o  reason: collision with root package name */
    public h3.c f12236o;

    /* renamed from: c  reason: collision with root package name */
    public final Object f12225c = new Object();
    public mc.l m = b.R;

    /* renamed from: p  reason: collision with root package name */
    public final CursorAnchorInfo.Builder f12237p = new CursorAnchorInfo.Builder();

    /* renamed from: q  reason: collision with root package name */
    public final float[] f12238q = i3.e0.a();

    /* renamed from: r  reason: collision with root package name */
    public final Matrix f12239r = new Matrix();

    public c(b4.x xVar, c1 c1Var) {
        this.f12223a = xVar;
        this.f12224b = c1Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [yb.f, java.lang.Object] */
    public final void a() {
        View view;
        CursorAnchorInfo.Builder builder;
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        int i2;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        int i14;
        c1 c1Var = this.f12224b;
        ?? r22 = c1Var.B;
        View view2 = (View) c1Var.A;
        if (!((InputMethodManager) r22.getValue()).isActive(view2)) {
            return;
        }
        mc.l lVar = this.m;
        float[] fArr = this.f12238q;
        lVar.k(new i3.e0(fArr));
        this.f12223a.p(fArr);
        Matrix matrix = this.f12239r;
        i3.z.s(matrix, fArr);
        x xVar = this.f12232j;
        xVar.getClass();
        long j2 = xVar.f12277b;
        q qVar = this.f12234l;
        qVar.getClass();
        o0 o0Var = this.f12233k;
        o0Var.getClass();
        l4.q qVar2 = o0Var.f8866b;
        h3.c cVar = this.f12235n;
        cVar.getClass();
        float f8 = cVar.f6055d;
        float f10 = cVar.f6053b;
        h3.c cVar2 = this.f12236o;
        cVar2.getClass();
        boolean z11 = this.f12228f;
        boolean z12 = this.f12229g;
        boolean z13 = this.f12230h;
        boolean z14 = this.f12231i;
        CursorAnchorInfo.Builder builder2 = this.f12237p;
        builder2.reset();
        builder2.setMatrix(matrix);
        q0 q0Var = xVar.f12278c;
        int f11 = q0.f(j2);
        builder2.setSelectionRange(f11, q0.e(j2));
        if (z11 && f11 >= 0) {
            int m = qVar.m(f11);
            h3.c c4 = o0Var.c(m);
            view = view2;
            float f12 = p7.j.f(c4.f6052a, 0.0f, (int) (o0Var.f8867c >> 32));
            boolean d4 = p7.n.d(cVar, f12, c4.f6053b);
            boolean d10 = p7.n.d(cVar, f12, c4.f6055d);
            if (o0Var.a(m) == w4.j.Rtl) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!d4 && !d10) {
                i14 = 0;
            } else {
                i14 = 1;
            }
            if (!d4 || !d10) {
                i14 |= 2;
            }
            if (z10) {
                i14 |= 4;
            }
            float f13 = c4.f6053b;
            float f14 = c4.f6055d;
            builder2.setInsertionMarkerLocation(f12, f13, f14, f14, i14);
            builder = builder2;
        } else {
            view = view2;
            builder = builder2;
        }
        if (z12) {
            int i15 = -1;
            if (q0Var != null) {
                i2 = q0.f(q0Var.f8885a);
            } else {
                i2 = -1;
            }
            if (q0Var != null) {
                i15 = q0.e(q0Var.f8885a);
            }
            if (i2 >= 0 && i2 < i15) {
                builder.setComposingText(i2, xVar.f12276a.B.subSequence(i2, i15));
                int m10 = qVar.m(i2);
                int m11 = qVar.m(i15);
                float[] fArr2 = new float[(m11 - m10) * 4];
                qVar2.a(i0.b(m10, m11), fArr2);
                while (i2 < i15) {
                    int m12 = qVar.m(i2);
                    int i16 = (m12 - m10) * 4;
                    float f15 = fArr2[i16];
                    float f16 = fArr2[i16 + 1];
                    CursorAnchorInfo.Builder builder3 = builder;
                    float f17 = fArr2[i16 + 2];
                    float f18 = fArr2[i16 + 3];
                    int i17 = i15;
                    if (cVar.f6052a < f17) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if (f15 < cVar.f6054c) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int i18 = i10 & i11;
                    if (f10 < f18) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    int i19 = i18 & i12;
                    if (f16 < f8) {
                        i13 = 1;
                    } else {
                        i13 = 0;
                    }
                    int i20 = i19 & i13;
                    if (!p7.n.d(cVar, f15, f16) || !p7.n.d(cVar, f17, f18)) {
                        i20 |= 2;
                    }
                    if (o0Var.a(m12) == w4.j.Rtl) {
                        i20 |= 4;
                    }
                    int i21 = i2;
                    builder3.addCharacterBounds(i21, f15, f16, f17, f18, i20);
                    builder = builder3;
                    i2 = i21 + 1;
                    i15 = i17;
                }
            }
        }
        int i22 = Build.VERSION.SDK_INT;
        if (i22 >= 33 && z13) {
            editorBounds = b6.c.l().setEditorBounds(i3.z.x(cVar2));
            handwritingBounds = editorBounds.setHandwritingBounds(i3.z.x(cVar2));
            build = handwritingBounds.build();
            builder.setEditorBoundsInfo(build);
        }
        if (i22 >= 34 && z14 && !cVar.f()) {
            int i23 = qVar2.f8880f - 1;
            if (i23 < 0) {
                i23 = 0;
            }
            int g10 = p7.j.g(qVar2.e(f10), 0, i23);
            int g11 = p7.j.g(qVar2.e(f8), 0, i23);
            if (g10 <= g11) {
                while (true) {
                    builder.addVisibleLineBounds(o0Var.d(g10), qVar2.f(g10), o0Var.e(g10), qVar2.b(g10));
                    if (g10 == g11) {
                        break;
                    }
                    g10++;
                }
            }
        }
        ((InputMethodManager) r22.getValue()).updateCursorAnchorInfo(view, builder.build());
        this.f12227e = false;
    }
}

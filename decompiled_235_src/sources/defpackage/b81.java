package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b81  reason: default package */
/* loaded from: classes.dex */
public final class b81 {
    public final te a;
    public final bt b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public c37 j;
    public a47 k;
    public mk4 l;
    public of5 n;
    public of5 o;
    public final Object c = new Object();
    public qn2 m = ne.t0;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = v24.a();
    public final Matrix r = new Matrix();

    public b81(te teVar, bt btVar) {
        this.a = teVar;
        this.b = btVar;
    }

    public final void a() {
        View view;
        CursorAnchorInfo.Builder builder;
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        bt btVar = this.b;
        go3 go3Var = (go3) btVar.L;
        View view2 = (View) btVar.B;
        if (!((InputMethodManager) go3Var.getValue()).isActive(view2)) {
            return;
        }
        qn2 qn2Var = this.m;
        float[] fArr = this.q;
        qn2Var.g(new v24(fArr));
        this.a.q(fArr);
        Matrix matrix = this.r;
        hv.X(matrix, fArr);
        c37 c37Var = this.j;
        c37Var.getClass();
        long j = c37Var.b;
        mk4 mk4Var = this.l;
        mk4Var.getClass();
        a47 a47Var = this.k;
        a47Var.getClass();
        v84 v84Var = a47Var.b;
        of5 of5Var = this.n;
        of5Var.getClass();
        float f = of5Var.d;
        float f2 = of5Var.b;
        of5 of5Var2 = this.o;
        of5Var2.getClass();
        boolean z2 = this.f;
        boolean z3 = this.g;
        boolean z4 = this.h;
        boolean z5 = this.i;
        CursorAnchorInfo.Builder builder2 = this.p;
        builder2.reset();
        builder2.setMatrix(matrix);
        k47 k47Var = c37Var.c;
        int f3 = k47.f(j);
        builder2.setSelectionRange(f3, k47.e(j));
        if (z2 && f3 >= 0) {
            int s = mk4Var.s(f3);
            of5 c = a47Var.c(s);
            view = view2;
            float p = gi2.p(c.a, RecyclerView.B1, (int) (a47Var.c >> 32));
            boolean v = ge7.v(of5Var, p, c.b);
            boolean v2 = ge7.v(of5Var, p, c.d);
            if (a47Var.a(s) == jl5.Rtl) {
                z = true;
            } else {
                z = false;
            }
            if (!v && !v2) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            if (!v || !v2) {
                i6 |= 2;
            }
            if (z) {
                i6 |= 4;
            }
            float f4 = c.b;
            float f5 = c.d;
            builder2.setInsertionMarkerLocation(p, f4, f5, f5, i6);
            builder = builder2;
        } else {
            view = view2;
            builder = builder2;
        }
        if (z3) {
            int i7 = -1;
            if (k47Var != null) {
                i = k47.f(k47Var.a);
            } else {
                i = -1;
            }
            if (k47Var != null) {
                i7 = k47.e(k47Var.a);
            }
            if (i >= 0 && i < i7) {
                builder.setComposingText(i, c37Var.a.B.subSequence(i, i7));
                int s2 = mk4Var.s(i);
                int s3 = mk4Var.s(i7);
                float[] fArr2 = new float[(s3 - s2) * 4];
                v84Var.a(jx2.f(s2, s3), fArr2);
                while (i < i7) {
                    int s4 = mk4Var.s(i);
                    int i8 = (s4 - s2) * 4;
                    float f6 = fArr2[i8];
                    float f7 = fArr2[i8 + 1];
                    CursorAnchorInfo.Builder builder3 = builder;
                    float f8 = fArr2[i8 + 2];
                    float f9 = fArr2[i8 + 3];
                    int i9 = i7;
                    if (of5Var.a < f8) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    if (f6 < of5Var.c) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    int i10 = i2 & i3;
                    if (f2 < f9) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    int i11 = i10 & i4;
                    if (f7 < f) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    int i12 = i11 & i5;
                    if (!ge7.v(of5Var, f6, f7) || !ge7.v(of5Var, f8, f9)) {
                        i12 |= 2;
                    }
                    if (a47Var.a(s4) == jl5.Rtl) {
                        i12 |= 4;
                    }
                    int i13 = i;
                    builder3.addCharacterBounds(i13, f6, f7, f8, f9, i12);
                    builder = builder3;
                    i = i13 + 1;
                    i7 = i9;
                }
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33 && z4) {
            editorBounds = a81.h().setEditorBounds(ej2.a0(of5Var2));
            handwritingBounds = editorBounds.setHandwritingBounds(ej2.a0(of5Var2));
            build = handwritingBounds.build();
            builder.setEditorBoundsInfo(build);
        }
        if (i14 >= 34 && z5 && !of5Var.f()) {
            int i15 = v84Var.f - 1;
            if (i15 < 0) {
                i15 = 0;
            }
            int q = gi2.q(v84Var.e(f2), 0, i15);
            int q2 = gi2.q(v84Var.e(f), 0, i15);
            if (q <= q2) {
                while (true) {
                    builder.addVisibleLineBounds(a47Var.e(q), v84Var.f(q), a47Var.f(q), v84Var.b(q));
                    if (q == q2) {
                        break;
                    }
                    q++;
                }
            }
        }
        ((InputMethodManager) go3Var.getValue()).updateCursorAnchorInfo(view, builder.build());
        this.e = false;
    }
}

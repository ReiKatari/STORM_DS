package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ft3  reason: default package */
/* loaded from: classes.dex */
public final class ft3 {
    public final ii a;
    public final u63 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public c37 j;
    public a47 k;
    public mk4 l;
    public of5 m;
    public of5 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = v24.a();
    public final Matrix q = new Matrix();

    public ft3(ii iiVar, u63 u63Var) {
        this.a = iiVar;
        this.b = u63Var;
    }

    public final void a() {
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
        u63 u63Var = this.b;
        InputMethodManager n = u63Var.n();
        View view = (View) u63Var.B;
        if (n.isActive(view) && this.j != null && this.l != null && this.k != null && this.m != null && this.n != null) {
            float[] fArr = this.p;
            v24.d(fArr);
            jk3 jk3Var = (jk3) this.a.d0.n0.getValue();
            if (jk3Var != null) {
                if (!jk3Var.t()) {
                    jk3Var = null;
                }
                if (jk3Var != null) {
                    jk3Var.k(fArr);
                }
            }
            of5 of5Var = this.n;
            of5Var.getClass();
            of5 of5Var2 = this.n;
            of5Var2.getClass();
            v24.f(fArr, -of5Var.a, -of5Var2.b);
            Matrix matrix = this.q;
            hv.X(matrix, fArr);
            c37 c37Var = this.j;
            c37Var.getClass();
            long j = c37Var.b;
            mk4 mk4Var = this.l;
            mk4Var.getClass();
            a47 a47Var = this.k;
            a47Var.getClass();
            v84 v84Var = a47Var.b;
            of5 of5Var3 = this.m;
            of5Var3.getClass();
            float f = of5Var3.d;
            float f2 = of5Var3.b;
            of5 of5Var4 = this.n;
            of5Var4.getClass();
            boolean z2 = this.f;
            boolean z3 = this.g;
            boolean z4 = this.h;
            boolean z5 = this.i;
            CursorAnchorInfo.Builder builder2 = this.o;
            builder2.reset();
            builder2.setMatrix(matrix);
            k47 k47Var = c37Var.c;
            int f3 = k47.f(j);
            builder2.setSelectionRange(f3, k47.e(j));
            if (z2 && f3 >= 0) {
                int s = mk4Var.s(f3);
                of5 c = a47Var.c(s);
                float p = gi2.p(c.a, RecyclerView.B1, (int) (a47Var.c >> 32));
                boolean j2 = nj2.j(of5Var3, p, c.b);
                boolean j3 = nj2.j(of5Var3, p, c.d);
                if (a47Var.a(s) == jl5.Rtl) {
                    z = true;
                } else {
                    z = false;
                }
                if (!j2 && !j3) {
                    i6 = 0;
                } else {
                    i6 = 1;
                }
                if (!j2 || !j3) {
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
                        CursorAnchorInfo.Builder builder3 = builder;
                        float f7 = fArr2[i8 + 1];
                        int i9 = i7;
                        float f8 = fArr2[i8 + 2];
                        float f9 = fArr2[i8 + 3];
                        int i10 = s2;
                        if (of5Var3.a < f8) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        if (f6 < of5Var3.c) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        int i11 = i2 & i3;
                        if (f2 < f9) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        int i12 = i11 & i4;
                        if (f7 < f) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        int i13 = i12 & i5;
                        if (!nj2.j(of5Var3, f6, f7) || !nj2.j(of5Var3, f8, f9)) {
                            i13 |= 2;
                        }
                        if (a47Var.a(s4) == jl5.Rtl) {
                            i13 |= 4;
                        }
                        int i14 = i;
                        builder3.addCharacterBounds(i14, f6, f7, f8, f9, i13);
                        builder = builder3;
                        i = i14 + 1;
                        i7 = i9;
                        s2 = i10;
                    }
                }
            }
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 33 && z4) {
                editorBounds = a81.h().setEditorBounds(ej2.a0(of5Var4));
                handwritingBounds = editorBounds.setHandwritingBounds(ej2.a0(of5Var4));
                build = handwritingBounds.build();
                builder.setEditorBoundsInfo(build);
            }
            if (i15 >= 34 && z5 && !of5Var3.f()) {
                int i16 = v84Var.f - 1;
                if (i16 < 0) {
                    i16 = 0;
                }
                int q = gi2.q(v84Var.e(f2), 0, i16);
                int q2 = gi2.q(v84Var.e(f), 0, i16);
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
            u63Var.n().updateCursorAnchorInfo(view, builder.build());
            this.e = false;
        }
    }
}

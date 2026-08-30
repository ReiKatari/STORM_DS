package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r41  reason: default package */
/* loaded from: classes.dex */
public final class r41 {
    public final ee a;
    public final os b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public oq6 j;
    public lr6 k;
    public pb4 l;
    public y55 n;
    public y55 o;
    public final Object c = new Object();
    public mi2 m = yd.r0;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = kv3.a();
    public final Matrix r = new Matrix();

    public r41(ee eeVar, os osVar) {
        this.a = eeVar;
        this.b = osVar;
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
        os osVar = this.b;
        gh3 gh3Var = (gh3) osVar.L;
        View view2 = (View) osVar.B;
        if (!((InputMethodManager) gh3Var.getValue()).isActive(view2)) {
            return;
        }
        mi2 mi2Var = this.m;
        float[] fArr = this.q;
        mi2Var.n(new kv3(fArr));
        this.a.q(fArr);
        Matrix matrix = this.r;
        l07.p0(matrix, fArr);
        oq6 oq6Var = this.j;
        oq6Var.getClass();
        long j = oq6Var.b;
        pb4 pb4Var = this.l;
        pb4Var.getClass();
        lr6 lr6Var = this.k;
        lr6Var.getClass();
        q04 q04Var = lr6Var.b;
        y55 y55Var = this.n;
        y55Var.getClass();
        float f = y55Var.d;
        float f2 = y55Var.b;
        y55 y55Var2 = this.o;
        y55Var2.getClass();
        boolean z2 = this.f;
        boolean z3 = this.g;
        boolean z4 = this.h;
        boolean z5 = this.i;
        CursorAnchorInfo.Builder builder2 = this.p;
        builder2.reset();
        builder2.setMatrix(matrix);
        vr6 vr6Var = oq6Var.c;
        int f3 = vr6.f(j);
        builder2.setSelectionRange(f3, vr6.e(j));
        if (z2 && f3 >= 0) {
            int r = pb4Var.r(f3);
            y55 c = lr6Var.c(r);
            view = view2;
            float l = io2.l(c.a, RecyclerView.A1, (int) (lr6Var.c >> 32));
            boolean X = dt3.X(y55Var, l, c.b);
            boolean X2 = dt3.X(y55Var, l, c.d);
            if (lr6Var.a(r) == rb5.Rtl) {
                z = true;
            } else {
                z = false;
            }
            if (!X && !X2) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            if (!X || !X2) {
                i6 |= 2;
            }
            if (z) {
                i6 |= 4;
            }
            float f4 = c.b;
            float f5 = c.d;
            builder2.setInsertionMarkerLocation(l, f4, f5, f5, i6);
            builder = builder2;
        } else {
            view = view2;
            builder = builder2;
        }
        if (z3) {
            int i7 = -1;
            if (vr6Var != null) {
                i = vr6.f(vr6Var.a);
            } else {
                i = -1;
            }
            if (vr6Var != null) {
                i7 = vr6.e(vr6Var.a);
            }
            if (i >= 0 && i < i7) {
                builder.setComposingText(i, oq6Var.a.B.subSequence(i, i7));
                int r2 = pb4Var.r(i);
                int r3 = pb4Var.r(i7);
                float[] fArr2 = new float[(r3 - r2) * 4];
                q04Var.a(ve2.g(r2, r3), fArr2);
                while (i < i7) {
                    int r4 = pb4Var.r(i);
                    int i8 = (r4 - r2) * 4;
                    float f6 = fArr2[i8];
                    float f7 = fArr2[i8 + 1];
                    CursorAnchorInfo.Builder builder3 = builder;
                    float f8 = fArr2[i8 + 2];
                    float f9 = fArr2[i8 + 3];
                    int i9 = i7;
                    if (y55Var.a < f8) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    if (f6 < y55Var.c) {
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
                    if (!dt3.X(y55Var, f6, f7) || !dt3.X(y55Var, f8, f9)) {
                        i12 |= 2;
                    }
                    if (lr6Var.a(r4) == rb5.Rtl) {
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
            editorBounds = q41.h().setEditorBounds(ve2.U(y55Var2));
            handwritingBounds = editorBounds.setHandwritingBounds(ve2.U(y55Var2));
            build = handwritingBounds.build();
            builder.setEditorBoundsInfo(build);
        }
        if (i14 >= 34 && z5 && !y55Var.f()) {
            int i15 = q04Var.f - 1;
            if (i15 < 0) {
                i15 = 0;
            }
            int m = io2.m(q04Var.e(f2), 0, i15);
            int m2 = io2.m(q04Var.e(f), 0, i15);
            if (m <= m2) {
                while (true) {
                    builder.addVisibleLineBounds(lr6Var.e(m), q04Var.f(m), lr6Var.f(m), q04Var.b(m));
                    if (m == m2) {
                        break;
                    }
                    m++;
                }
            }
        }
        ((InputMethodManager) gh3Var.getValue()).updateCursorAnchorInfo(view, builder.build());
        this.e = false;
    }
}

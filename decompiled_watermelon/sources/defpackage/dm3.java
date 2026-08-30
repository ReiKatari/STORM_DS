package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dm3  reason: default package */
/* loaded from: classes.dex */
public final class dm3 {
    public final wh a;
    public final q03 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public oq6 j;
    public lr6 k;
    public pb4 l;
    public y55 m;
    public y55 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = kv3.a();
    public final Matrix q = new Matrix();

    public dm3(wh whVar, q03 q03Var) {
        this.a = whVar;
        this.b = q03Var;
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
        q03 q03Var = this.b;
        InputMethodManager l = q03Var.l();
        View view = (View) q03Var.B;
        if (l.isActive(view) && this.j != null && this.l != null && this.k != null && this.m != null && this.n != null) {
            float[] fArr = this.p;
            kv3.d(fArr);
            rd3 rd3Var = (rd3) this.a.c0.m0.getValue();
            if (rd3Var != null) {
                if (!rd3Var.c0()) {
                    rd3Var = null;
                }
                if (rd3Var != null) {
                    rd3Var.H(fArr);
                }
            }
            y55 y55Var = this.n;
            y55Var.getClass();
            y55 y55Var2 = this.n;
            y55Var2.getClass();
            kv3.f(fArr, -y55Var.a, -y55Var2.b);
            Matrix matrix = this.q;
            l07.p0(matrix, fArr);
            oq6 oq6Var = this.j;
            oq6Var.getClass();
            long j = oq6Var.b;
            pb4 pb4Var = this.l;
            pb4Var.getClass();
            lr6 lr6Var = this.k;
            lr6Var.getClass();
            q04 q04Var = lr6Var.b;
            y55 y55Var3 = this.m;
            y55Var3.getClass();
            float f = y55Var3.d;
            float f2 = y55Var3.b;
            y55 y55Var4 = this.n;
            y55Var4.getClass();
            boolean z2 = this.f;
            boolean z3 = this.g;
            boolean z4 = this.h;
            boolean z5 = this.i;
            CursorAnchorInfo.Builder builder2 = this.o;
            builder2.reset();
            builder2.setMatrix(matrix);
            vr6 vr6Var = oq6Var.c;
            int f3 = vr6.f(j);
            builder2.setSelectionRange(f3, vr6.e(j));
            if (z2 && f3 >= 0) {
                int r = pb4Var.r(f3);
                y55 c = lr6Var.c(r);
                float l2 = io2.l(c.a, RecyclerView.A1, (int) (lr6Var.c >> 32));
                boolean i7 = hi2.i(y55Var3, l2, c.b);
                boolean i8 = hi2.i(y55Var3, l2, c.d);
                if (lr6Var.a(r) == rb5.Rtl) {
                    z = true;
                } else {
                    z = false;
                }
                if (!i7 && !i8) {
                    i6 = 0;
                } else {
                    i6 = 1;
                }
                if (!i7 || !i8) {
                    i6 |= 2;
                }
                if (z) {
                    i6 |= 4;
                }
                float f4 = c.b;
                float f5 = c.d;
                builder2.setInsertionMarkerLocation(l2, f4, f5, f5, i6);
                builder = builder2;
            } else {
                builder = builder2;
            }
            if (z3) {
                int i9 = -1;
                if (vr6Var != null) {
                    i = vr6.f(vr6Var.a);
                } else {
                    i = -1;
                }
                if (vr6Var != null) {
                    i9 = vr6.e(vr6Var.a);
                }
                if (i >= 0 && i < i9) {
                    builder.setComposingText(i, oq6Var.a.B.subSequence(i, i9));
                    int r2 = pb4Var.r(i);
                    int r3 = pb4Var.r(i9);
                    float[] fArr2 = new float[(r3 - r2) * 4];
                    q04Var.a(ve2.g(r2, r3), fArr2);
                    while (i < i9) {
                        int r4 = pb4Var.r(i);
                        int i10 = (r4 - r2) * 4;
                        float f6 = fArr2[i10];
                        CursorAnchorInfo.Builder builder3 = builder;
                        float f7 = fArr2[i10 + 1];
                        int i11 = i9;
                        float f8 = fArr2[i10 + 2];
                        float f9 = fArr2[i10 + 3];
                        int i12 = r2;
                        if (y55Var3.a < f8) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        if (f6 < y55Var3.c) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        int i13 = i2 & i3;
                        if (f2 < f9) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        int i14 = i13 & i4;
                        if (f7 < f) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        int i15 = i14 & i5;
                        if (!hi2.i(y55Var3, f6, f7) || !hi2.i(y55Var3, f8, f9)) {
                            i15 |= 2;
                        }
                        if (lr6Var.a(r4) == rb5.Rtl) {
                            i15 |= 4;
                        }
                        int i16 = i;
                        builder3.addCharacterBounds(i16, f6, f7, f8, f9, i15);
                        builder = builder3;
                        i = i16 + 1;
                        i9 = i11;
                        r2 = i12;
                    }
                }
            }
            int i17 = Build.VERSION.SDK_INT;
            if (i17 >= 33 && z4) {
                editorBounds = q41.h().setEditorBounds(ve2.U(y55Var4));
                handwritingBounds = editorBounds.setHandwritingBounds(ve2.U(y55Var4));
                build = handwritingBounds.build();
                builder.setEditorBoundsInfo(build);
            }
            if (i17 >= 34 && z5 && !y55Var3.f()) {
                int i18 = q04Var.f - 1;
                if (i18 < 0) {
                    i18 = 0;
                }
                int m = io2.m(q04Var.e(f2), 0, i18);
                int m2 = io2.m(q04Var.e(f), 0, i18);
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
            q03Var.l().updateCursorAnchorInfo(view, builder.build());
            this.e = false;
        }
    }
}

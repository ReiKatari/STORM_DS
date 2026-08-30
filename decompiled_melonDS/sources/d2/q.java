package d2;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import i3.e0;
import l4.i0;
import l4.o0;
import l4.q0;
import q4.x;
import y3.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final b f3755a;

    /* renamed from: b  reason: collision with root package name */
    public final m f3756b;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3758d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3759e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3760f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3761g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3762h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3763i;

    /* renamed from: j  reason: collision with root package name */
    public x f3764j;

    /* renamed from: k  reason: collision with root package name */
    public o0 f3765k;

    /* renamed from: l  reason: collision with root package name */
    public q4.q f3766l;
    public h3.c m;

    /* renamed from: n  reason: collision with root package name */
    public h3.c f3767n;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3757c = new Object();

    /* renamed from: o  reason: collision with root package name */
    public final CursorAnchorInfo.Builder f3768o = new CursorAnchorInfo.Builder();

    /* renamed from: p  reason: collision with root package name */
    public final float[] f3769p = e0.a();

    /* renamed from: q  reason: collision with root package name */
    public final Matrix f3770q = new Matrix();

    public q(b bVar, m mVar) {
        this.f3755a = bVar;
        this.f3756b = mVar;
    }

    public final void a() {
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
        m mVar = this.f3756b;
        InputMethodManager a10 = mVar.a();
        View view = mVar.f3747b;
        if (a10.isActive(view) && this.f3764j != null && this.f3766l != null && this.f3765k != null && this.m != null && this.f3767n != null) {
            float[] fArr = this.f3769p;
            e0.d(fArr);
            z zVar = (z) this.f3755a.f3718b0.f3754l0.getValue();
            if (zVar != null) {
                if (!zVar.U()) {
                    zVar = null;
                }
                if (zVar != null) {
                    zVar.V(fArr);
                }
            }
            h3.c cVar = this.f3767n;
            cVar.getClass();
            h3.c cVar2 = this.f3767n;
            cVar2.getClass();
            e0.f(fArr, -cVar.f6052a, -cVar2.f6053b);
            Matrix matrix = this.f3770q;
            i3.z.s(matrix, fArr);
            x xVar = this.f3764j;
            xVar.getClass();
            long j2 = xVar.f12277b;
            q4.q qVar = this.f3766l;
            qVar.getClass();
            o0 o0Var = this.f3765k;
            o0Var.getClass();
            l4.q qVar2 = o0Var.f8866b;
            h3.c cVar3 = this.m;
            cVar3.getClass();
            float f8 = cVar3.f6055d;
            float f10 = cVar3.f6053b;
            h3.c cVar4 = this.f3767n;
            cVar4.getClass();
            boolean z11 = this.f3760f;
            boolean z12 = this.f3761g;
            boolean z13 = this.f3762h;
            boolean z14 = this.f3763i;
            CursorAnchorInfo.Builder builder2 = this.f3768o;
            builder2.reset();
            builder2.setMatrix(matrix);
            q0 q0Var = xVar.f12278c;
            int f11 = q0.f(j2);
            builder2.setSelectionRange(f11, q0.e(j2));
            if (z11 && f11 >= 0) {
                int m = qVar.m(f11);
                h3.c c4 = o0Var.c(m);
                float f12 = p7.j.f(c4.f6052a, 0.0f, (int) (o0Var.f8867c >> 32));
                boolean f13 = p.f(cVar3, f12, c4.f6053b);
                boolean f14 = p.f(cVar3, f12, c4.f6055d);
                if (o0Var.a(m) == w4.j.Rtl) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!f13 && !f14) {
                    i14 = 0;
                } else {
                    i14 = 1;
                }
                if (!f13 || !f14) {
                    i14 |= 2;
                }
                if (z10) {
                    i14 |= 4;
                }
                float f15 = c4.f6053b;
                float f16 = c4.f6055d;
                builder2.setInsertionMarkerLocation(f12, f15, f16, f16, i14);
                builder = builder2;
            } else {
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
                        float f17 = fArr2[i16];
                        CursorAnchorInfo.Builder builder3 = builder;
                        float f18 = fArr2[i16 + 1];
                        int i17 = i15;
                        float f19 = fArr2[i16 + 2];
                        float f20 = fArr2[i16 + 3];
                        int i18 = m10;
                        if (cVar3.f6052a < f19) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if (f17 < cVar3.f6054c) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        int i19 = i10 & i11;
                        if (f10 < f20) {
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                        int i20 = i19 & i12;
                        if (f18 < f8) {
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        int i21 = i20 & i13;
                        if (!p.f(cVar3, f17, f18) || !p.f(cVar3, f19, f20)) {
                            i21 |= 2;
                        }
                        if (o0Var.a(m12) == w4.j.Rtl) {
                            i21 |= 4;
                        }
                        int i22 = i2;
                        builder3.addCharacterBounds(i22, f17, f18, f19, f20, i21);
                        builder = builder3;
                        i2 = i22 + 1;
                        i15 = i17;
                        m10 = i18;
                    }
                }
            }
            int i23 = Build.VERSION.SDK_INT;
            if (i23 >= 33 && z13) {
                editorBounds = b6.c.l().setEditorBounds(i3.z.x(cVar4));
                handwritingBounds = editorBounds.setHandwritingBounds(i3.z.x(cVar4));
                build = handwritingBounds.build();
                builder.setEditorBoundsInfo(build);
            }
            if (i23 >= 34 && z14 && !cVar3.f()) {
                int i24 = qVar2.f8880f - 1;
                if (i24 < 0) {
                    i24 = 0;
                }
                int g10 = p7.j.g(qVar2.e(f10), 0, i24);
                int g11 = p7.j.g(qVar2.e(f8), 0, i24);
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
            mVar.a().updateCursorAnchorInfo(view, builder.build());
            this.f3759e = false;
        }
    }
}

package c3;

import a1.m0;
import a1.y;
import a4.o0;
import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import b4.x;
import g3.g0;
import i4.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends k implements g3.j {
    public final a0.b A;
    public final r B;
    public final x L;
    public final j4.b R;
    public final String X;
    public final Rect Y = new Rect();
    public final AutofillId Z;

    /* renamed from: b0  reason: collision with root package name */
    public final y f2558b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f2559c0;

    public d(a0.b bVar, r rVar, x xVar, j4.b bVar2, String str) {
        AutofillId autofillId;
        this.A = bVar;
        this.B = rVar;
        this.L = xVar;
        this.R = bVar2;
        this.X = str;
        xVar.setImportantForAutofill(1);
        b6.f B = q8.r.B(xVar);
        if (B != null) {
            autofillId = p.i(B.f2075b);
        } else {
            autofillId = null;
        }
        if (autofillId != null) {
            this.Z = autofillId;
            this.f2558b0 = new y();
            return;
        }
        throw w.d.g("Required value was null.");
    }

    @Override // g3.j
    public final void a(g0 g0Var, g0 g0Var2) {
        o0 t5;
        i4.m x9;
        o0 t10;
        i4.m x10;
        if (g0Var != null && (t10 = a4.l.t(g0Var)) != null && (x10 = t10.x()) != null) {
            m0 m0Var = x10.A;
            if (m0Var.b(i4.l.f6746g) || m0Var.b(i4.l.f6747h)) {
                ((AutofillManager) this.A.B).notifyViewExited(this.L, t10.B);
            }
        }
        if (g0Var2 != null && (t5 = a4.l.t(g0Var2)) != null && (x9 = t5.x()) != null) {
            m0 m0Var2 = x9.A;
            if (!m0Var2.b(i4.l.f6746g) && !m0Var2.b(i4.l.f6747h)) {
                return;
            }
            int i2 = t5.B;
            this.R.f7417a.o(i2, new b(this, i2));
        }
    }
}

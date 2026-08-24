package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nd  reason: default package */
/* loaded from: classes.dex */
public final class nd extends lz implements yg2 {
    public final s63 A;
    public final ab6 B;
    public final te L;
    public final rf5 R;
    public final String X;
    public final Rect Y = new Rect();
    public final AutofillId Z;
    public final q94 d0;
    public boolean e0;

    public nd(s63 s63Var, ab6 ab6Var, te teVar, rf5 rf5Var, String str) {
        AutofillId autofillId;
        this.A = s63Var;
        this.B = ab6Var;
        this.L = teVar;
        this.R = rf5Var;
        this.X = str;
        teVar.setImportantForAutofill(1);
        u2 z = hi2.z(teVar);
        if (z != null) {
            autofillId = au.b(z.b);
        } else {
            autofillId = null;
        }
        if (autofillId != null) {
            this.Z = autofillId;
            this.d0 = new q94();
            return;
        }
        throw i61.e("Required value was null.");
    }

    @Override // defpackage.yg2
    public final void a(vh2 vh2Var, vh2 vh2Var2) {
        sm3 f0;
        ta6 x;
        sm3 f02;
        ta6 x2;
        if (vh2Var != null && (f02 = nc1.f0(vh2Var)) != null && (x2 = f02.x()) != null) {
            ja4 ja4Var = x2.A;
            if (ja4Var.b(sa6.g) || ja4Var.b(sa6.h)) {
                ((AutofillManager) this.A.B).notifyViewExited(this.L, f02.B);
            }
        }
        if (vh2Var2 != null && (f0 = nc1.f0(vh2Var2)) != null && (x = f0.x()) != null) {
            ja4 ja4Var2 = x.A;
            if (!ja4Var2.b(sa6.g) && !ja4Var2.b(sa6.h)) {
                return;
            }
            int i = f0.B;
            this.R.b.m(i, new ld(this, i));
        }
    }
}

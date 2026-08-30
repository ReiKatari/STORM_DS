package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yc  reason: default package */
/* loaded from: classes.dex */
public final class yc extends wx implements hc2 {
    public final ka3 A;
    public final lz5 B;
    public final ee L;
    public final b65 R;
    public final String X;
    public final Rect Y = new Rect();
    public final AutofillId Z;
    public final k14 c0;
    public boolean d0;

    public yc(ka3 ka3Var, lz5 lz5Var, ee eeVar, b65 b65Var, String str) {
        AutofillId autofillId;
        this.A = ka3Var;
        this.B = lz5Var;
        this.L = eeVar;
        this.R = b65Var;
        this.X = str;
        eeVar.setImportantForAutofill(1);
        s2 u = me2.u(eeVar);
        if (u != null) {
            autofillId = rx.b(u.b);
        } else {
            autofillId = null;
        }
        if (autofillId != null) {
            this.Z = autofillId;
            this.c0 = new k14();
            return;
        }
        throw b31.e("Required value was null.");
    }

    @Override // defpackage.hc2
    public final void a(ed2 ed2Var, ed2 ed2Var2) {
        vf3 P;
        ez5 w;
        vf3 P2;
        ez5 w2;
        if (ed2Var != null && (P2 = l.P(ed2Var)) != null && (w2 = P2.w()) != null) {
            d24 d24Var = w2.A;
            if (d24Var.b(dz5.g) || d24Var.b(dz5.h)) {
                ((AutofillManager) this.A.B).notifyViewExited(this.L, P2.B);
            }
        }
        if (ed2Var2 != null && (P = l.P(ed2Var2)) != null && (w = P.w()) != null) {
            d24 d24Var2 = w.A;
            if (!d24Var2.b(dz5.g) && !d24Var2.b(dz5.h)) {
                return;
            }
            int i = P.B;
            this.R.b.m(i, new wc(this, i));
        }
    }
}

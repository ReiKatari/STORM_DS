package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p9  reason: default package */
/* loaded from: classes.dex */
public final class p9 implements dl2 {
    public final ys0 A;
    public final ys0 B;
    public volatile y71 L;
    public final Object R = new Object();

    public p9(ys0 ys0Var) {
        this.A = ys0Var;
        this.B = ys0Var;
    }

    public static bq0 a(ab7 ab7Var, Context context) {
        z31 z31Var;
        l9 l9Var = new l9(0, context);
        ab7Var.getClass();
        za7 viewModelStore = ab7Var.getViewModelStore();
        if (ab7Var instanceof lq2) {
            z31Var = ((lq2) ab7Var).getDefaultViewModelCreationExtras();
        } else {
            z31Var = x31.b;
        }
        return new bq0(viewModelStore, l9Var, z31Var);
    }

    @Override // defpackage.dl2
    public final Object d() {
        if (this.L == null) {
            synchronized (this.R) {
                try {
                    if (this.L == null) {
                        this.L = ((n9) a(this.A, this.B).X(q75.a(n9.class))).b;
                    }
                } finally {
                }
            }
        }
        return this.L;
    }
}

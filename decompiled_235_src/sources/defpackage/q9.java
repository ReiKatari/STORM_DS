package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q9  reason: default package */
/* loaded from: classes.dex */
public final class q9 implements jr2 {
    public final mv0 A;
    public final mv0 B;
    public volatile pb1 L;
    public final Object R = new Object();

    public q9(mv0 mv0Var) {
        this.A = mv0Var;
        this.B = mv0Var;
    }

    public static os0 a(bp7 bp7Var, Context context) {
        j71 j71Var;
        m9 m9Var = new m9(context, 0);
        bp7Var.getClass();
        ap7 viewModelStore = bp7Var.getViewModelStore();
        if (bp7Var instanceof mw2) {
            j71Var = ((mw2) bp7Var).getDefaultViewModelCreationExtras();
        } else {
            j71Var = h71.b;
        }
        return new os0(viewModelStore, m9Var, j71Var);
    }

    @Override // defpackage.jr2
    public final Object c() {
        if (this.L == null) {
            synchronized (this.R) {
                try {
                    if (this.L == null) {
                        this.L = ((o9) a(this.A, this.B).Z(gh5.a(o9.class))).b;
                    }
                } finally {
                }
            }
        }
        return this.L;
    }
}

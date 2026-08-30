package defpackage;

import androidx.fragment.app.b0;
import androidx.fragment.app.h;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hb1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hb1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ h B;
    public final /* synthetic */ b0 L;

    public /* synthetic */ hb1(h hVar, b0 b0Var, int i) {
        this.A = i;
        this.B = hVar;
        this.L = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        b0 b0Var = this.L;
        h hVar = this.B;
        switch (i) {
            case 0:
                hVar.a(b0Var);
                return;
            default:
                hVar.b.remove(b0Var);
                hVar.c.remove(b0Var);
                return;
        }
    }
}

package defpackage;

import androidx.fragment.app.b0;
import androidx.fragment.app.h;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ff1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ff1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ h B;
    public final /* synthetic */ b0 L;

    public /* synthetic */ ff1(h hVar, b0 b0Var, int i) {
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

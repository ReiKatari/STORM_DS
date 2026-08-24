package defpackage;

import androidx.fragment.app.o;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qk2  reason: default package */
/* loaded from: classes.dex */
public final class qk2 extends sk2 {
    public final /* synthetic */ mo2 a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ b9 c;
    public final /* synthetic */ a9 d;
    public final /* synthetic */ o e;

    public qk2(o oVar, mo2 mo2Var, AtomicReference atomicReference, b9 b9Var, a9 a9Var) {
        this.e = oVar;
        this.a = mo2Var;
        this.b = atomicReference;
        this.c = b9Var;
        this.d = a9Var;
    }

    @Override // defpackage.sk2
    public final void a() {
        o oVar = this.e;
        this.b.set(((j9) this.a.apply(null)).d(oVar.generateActivityResultKey(), oVar, this.c, this.d));
    }
}

package defpackage;

import me.magnum.melonds.domain.model.layout.BackgroundMode;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dl3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dl3 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ b B;

    public /* synthetic */ dl3(b bVar, int i) {
        this.A = i;
        this.B = bVar;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        b bVar = this.B;
        switch (i) {
            case 0:
                b.a(bVar, (String) obj);
                return jg7Var;
            case 1:
                b.e(bVar, (String) obj);
                return jg7Var;
            case 2:
                b.m(bVar, (BackgroundMode) obj);
                return jg7Var;
            case 3:
                ((zj3) obj).getClass();
                bVar.u(true);
                return jg7Var;
            default:
                b.i(bVar, (uj3) obj);
                return jg7Var;
        }
    }
}

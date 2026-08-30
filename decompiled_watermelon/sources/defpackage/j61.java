package defpackage;

import me.magnum.melonds.domain.model.DSiWareTitle;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j61  reason: default package */
/* loaded from: classes.dex */
public final class j61 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ mi2 B;
    public final /* synthetic */ DSiWareTitle L;

    public /* synthetic */ j61(int i, mi2 mi2Var, DSiWareTitle dSiWareTitle) {
        this.A = i;
        this.B = mi2Var;
        this.L = dSiWareTitle;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        DSiWareTitle dSiWareTitle = this.L;
        mi2 mi2Var = this.B;
        switch (i) {
            case 0:
                mi2Var.n(dSiWareTitle);
                return o27.a;
            default:
                return (tm5) mi2Var.n(dSiWareTitle);
        }
    }
}

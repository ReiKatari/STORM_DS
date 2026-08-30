package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ah3  reason: default package */
/* loaded from: classes.dex */
public final class ah3 implements ki2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ nd3 B;
    public final /* synthetic */ mi2 L;

    public ah3(mi2 mi2Var, nd3 nd3Var) {
        this.L = mi2Var;
        this.B = nd3Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        o27 o27Var = o27.a;
        mi2 mi2Var = this.L;
        nd3 nd3Var = this.B;
        switch (i) {
            case 0:
                mi2Var.n(nd3Var.a);
                return o27Var;
            default:
                UUID uuid = nd3Var.a;
                if (uuid != null) {
                    mi2Var.n(uuid);
                }
                return o27Var;
        }
    }

    public ah3(nd3 nd3Var, mi2 mi2Var) {
        this.B = nd3Var;
        this.L = mi2Var;
    }
}

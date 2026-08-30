package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y82  reason: default package */
/* loaded from: classes.dex */
public final class y82 implements b06 {
    public final /* synthetic */ int a;
    public final b06 b;
    public final mi2 c;

    public y82(b06 b06Var, mi2 mi2Var) {
        this.a = 0;
        e06 e06Var = e06.c0;
        this.b = b06Var;
        this.c = mi2Var;
    }

    @Override // defpackage.b06
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new v72(this);
            case 1:
                return new v72(this, (byte) 0);
            default:
                return new vw6(this);
        }
    }

    public /* synthetic */ y82(b06 b06Var, mi2 mi2Var, int i) {
        this.a = i;
        this.b = b06Var;
        this.c = mi2Var;
    }
}

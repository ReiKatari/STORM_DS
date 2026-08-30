package defpackage;

import android.util.Size;
import android.view.Surface;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kx2  reason: default package */
/* loaded from: classes.dex */
public final class kx2 extends hc1 {
    public final /* synthetic */ int n = 0;
    public final Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx2(hk6 hk6Var, Size size) {
        super(34, size);
        this.o = hk6Var;
    }

    @Override // defpackage.hc1
    public final fq3 f() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return jv3.K((Surface) obj);
            default:
                return ((hk6) obj).e;
        }
    }

    public kx2(Surface surface, Size size, int i) {
        super(i, size);
        this.o = surface;
    }
}

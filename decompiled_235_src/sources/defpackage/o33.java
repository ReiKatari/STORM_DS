package defpackage;

import android.util.Size;
import android.view.Surface;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o33  reason: default package */
/* loaded from: classes.dex */
public final class o33 extends ig1 {
    public final /* synthetic */ int n = 0;
    public final Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o33(bw6 bw6Var, Size size) {
        super(34, size);
        this.o = bw6Var;
    }

    @Override // defpackage.ig1
    public final gx3 f() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return l.z((Surface) obj);
            default:
                return ((bw6) obj).e;
        }
    }

    public o33(Surface surface, Size size, int i) {
        super(i, size);
        this.o = surface;
    }
}

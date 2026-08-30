package j0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v0 implements m0.c {
    public final /* synthetic */ int A;
    public final /* synthetic */ b5.i B;

    public /* synthetic */ v0(b5.i iVar, int i2) {
        this.A = i2;
        this.B = iVar;
    }

    @Override // m0.c
    public final void D(Object obj) {
        switch (this.A) {
            case 0:
                List list = (List) obj;
                list.getClass();
                this.B.b(new ArrayList(list));
                return;
            default:
                b5.i iVar = this.B;
                try {
                    iVar.b(obj);
                    return;
                } catch (Throwable th2) {
                    iVar.c(th2);
                    return;
                }
        }
    }

    @Override // m0.c
    public final void z(Throwable th2) {
        switch (this.A) {
            case 0:
                boolean z10 = th2 instanceof TimeoutException;
                b5.i iVar = this.B;
                if (z10) {
                    iVar.c(th2);
                    return;
                } else {
                    iVar.b(Collections.EMPTY_LIST);
                    return;
                }
            default:
                this.B.c(th2);
                return;
        }
    }
}

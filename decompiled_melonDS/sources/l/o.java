package l;

import android.view.Window;
import q.g1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o implements a6.v, g1, p.w {
    public final /* synthetic */ int A;
    public final /* synthetic */ x B;

    public /* synthetic */ o(x xVar, int i2) {
        this.A = i2;
        this.B = xVar;
    }

    @Override // p.w
    public void a(p.l lVar, boolean z10) {
        boolean z11;
        int i2;
        w wVar;
        switch (this.A) {
            case 2:
                this.B.r(lVar);
                return;
            default:
                p.l k10 = lVar.k();
                int i10 = 0;
                if (k10 != lVar) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    lVar = k10;
                }
                x xVar = this.B;
                w[] wVarArr = xVar.F0;
                if (wVarArr != null) {
                    i2 = wVarArr.length;
                } else {
                    i2 = 0;
                }
                while (true) {
                    if (i10 < i2) {
                        wVar = wVarArr[i10];
                        if (wVar == null || wVar.f8454h != lVar) {
                            i10++;
                        }
                    } else {
                        wVar = null;
                    }
                }
                if (wVar != null) {
                    if (z11) {
                        xVar.q(wVar.f8447a, wVar, k10);
                        xVar.s(wVar, true);
                        return;
                    }
                    xVar.s(wVar, z10);
                    return;
                }
                return;
        }
    }

    @Override // p.w
    public boolean l(p.l lVar) {
        Window.Callback callback;
        switch (this.A) {
            case 2:
                Window.Callback callback2 = this.B.f8468f0.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, lVar);
                    return true;
                }
                return true;
            default:
                if (lVar == lVar.k()) {
                    x xVar = this.B;
                    if (xVar.f8487z0 && (callback = xVar.f8468f0.getCallback()) != null && !xVar.K0) {
                        callback.onMenuOpened(108, lVar);
                        return true;
                    }
                    return true;
                }
                return true;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:27:0x009b
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // a6.v
    public a6.i2 s(android.view.View r19, a6.i2 r20) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.o.s(android.view.View, a6.i2):a6.i2");
    }
}

package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ig0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ig0 implements wz0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ig0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.wz0
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                mx mxVar = (mx) obj;
                ((Surface) obj3).release();
                ((SurfaceTexture) obj2).release();
                return;
            case 1:
                sb1 sb1Var = (sb1) obj3;
                ck6 ck6Var = (ck6) obj2;
                lx lxVar = (lx) obj;
                ck6Var.close();
                Surface surface = (Surface) sb1Var.h.remove(ck6Var);
                if (surface != null) {
                    pd4 pd4Var = sb1Var.a;
                    xj2.d((AtomicBoolean) pd4Var.L, true);
                    xj2.c((Thread) pd4Var.X);
                    pd4Var.s(surface, true);
                    return;
                }
                return;
            case 2:
                fm1 fm1Var = (fm1) obj3;
                ck6 ck6Var2 = (ck6) obj2;
                lx lxVar2 = (lx) obj;
                ck6Var2.close();
                Surface surface2 = (Surface) fm1Var.h.remove(ck6Var2);
                if (surface2 != null) {
                    bm1 bm1Var = fm1Var.a;
                    xj2.d((AtomicBoolean) bm1Var.L, true);
                    xj2.c((Thread) bm1Var.X);
                    bm1Var.s(surface2, true);
                    return;
                }
                return;
            default:
                j66 j66Var = (j66) obj3;
                Activity activity = (Activity) obj2;
                Configuration configuration = (Configuration) obj;
                n85 n85Var = j66Var.e;
                if (n85Var != null) {
                    n85Var.r(activity, j66Var.a(activity));
                    return;
                }
                return;
        }
    }
}

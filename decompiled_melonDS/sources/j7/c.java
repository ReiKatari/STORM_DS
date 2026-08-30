package j7;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ArrayList B;
    public final /* synthetic */ i L;

    public /* synthetic */ c(i iVar, ArrayList arrayList, int i2) {
        this.A = i2;
        this.L = iVar;
        this.B = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.A) {
            case 0:
                ArrayList arrayList = this.B;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    i iVar = this.L;
                    if (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        h hVar = (h) obj;
                        j1 j1Var = hVar.f7573a;
                        int i10 = hVar.f7574b;
                        int i11 = hVar.f7575c;
                        int i12 = hVar.f7576d;
                        int i13 = hVar.f7577e;
                        iVar.getClass();
                        View view2 = j1Var.f7594a;
                        int i14 = i12 - i10;
                        int i15 = i13 - i11;
                        if (i14 != 0) {
                            view2.animate().translationX(0.0f);
                        }
                        if (i15 != 0) {
                            view2.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view2.animate();
                        iVar.f7587p.add(j1Var);
                        animate.setDuration(iVar.f7654e).setListener(new e(iVar, j1Var, i14, view2, i15, animate)).start();
                    } else {
                        arrayList.clear();
                        iVar.m.remove(arrayList);
                        return;
                    }
                }
            case DSiCameraSource.FrontCamera /* 1 */:
                ArrayList arrayList2 = this.B;
                int size2 = arrayList2.size();
                int i16 = 0;
                while (true) {
                    i iVar2 = this.L;
                    if (i16 < size2) {
                        Object obj2 = arrayList2.get(i16);
                        i16++;
                        g gVar = (g) obj2;
                        ArrayList arrayList3 = iVar2.f7589r;
                        long j2 = iVar2.f7655f;
                        j1 j1Var2 = gVar.f7563a;
                        View view3 = null;
                        if (j1Var2 == null) {
                            view = null;
                        } else {
                            view = j1Var2.f7594a;
                        }
                        j1 j1Var3 = gVar.f7564b;
                        if (j1Var3 != null) {
                            view3 = j1Var3.f7594a;
                        }
                        View view4 = view3;
                        if (view != null) {
                            ViewPropertyAnimator duration = view.animate().setDuration(j2);
                            arrayList3.add(gVar.f7563a);
                            duration.translationX(gVar.f7567e - gVar.f7565c);
                            duration.translationY(gVar.f7568f - gVar.f7566d);
                            duration.alpha(0.0f).setListener(new f(iVar2, gVar, duration, view, 0)).start();
                        }
                        if (view4 != null) {
                            ViewPropertyAnimator animate2 = view4.animate();
                            arrayList3.add(gVar.f7564b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new f(iVar2, gVar, animate2, view4, 1)).start();
                        }
                    } else {
                        arrayList2.clear();
                        iVar2.f7585n.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList4 = this.B;
                int size3 = arrayList4.size();
                int i17 = 0;
                while (true) {
                    i iVar3 = this.L;
                    if (i17 < size3) {
                        Object obj3 = arrayList4.get(i17);
                        i17++;
                        j1 j1Var4 = (j1) obj3;
                        iVar3.getClass();
                        View view5 = j1Var4.f7594a;
                        ViewPropertyAnimator animate3 = view5.animate();
                        iVar3.f7586o.add(j1Var4);
                        animate3.alpha(1.0f).setDuration(iVar3.f7652c).setListener(new d(iVar3, j1Var4, view5, animate3)).start();
                    } else {
                        arrayList4.clear();
                        iVar3.f7584l.remove(arrayList4);
                        return;
                    }
                }
        }
    }
}

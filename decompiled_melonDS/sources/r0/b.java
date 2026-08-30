package r0;

import a7.v;
import android.hardware.camera2.CameraDevice;
import android.view.ActionMode;
import androidx.lifecycle.x0;
import com.google.android.material.button.MaterialButton;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import p1.c1;
import w.g1;
import w.p0;
import w.u;
import w.w;
import w.x;
import x.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ b(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.A) {
            case 0:
                ((m) this.B).close();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                d dVar = (d) this.B;
                dVar.f12574j = true;
                dVar.d();
                return;
            case 2:
                ij.g gVar = (ij.g) ((c1) this.B).L;
                if (gVar != null) {
                    for (V v10 : gVar.values()) {
                        v10.b();
                    }
                    return;
                }
                return;
            case 3:
                int i2 = LayoutEditorActivity.K0;
                ((LayoutEditorActivity) this.B).C();
                return;
            case 4:
                s0.e eVar = (s0.e) this.B;
                eVar.f12799f = true;
                eVar.d();
                return;
            case l1.c.f8511g /* 5 */:
                ij.g gVar2 = (ij.g) ((v) this.B).R;
                if (gVar2 != null) {
                    for (V v11 : gVar2.values()) {
                        v11.b();
                    }
                    return;
                }
                return;
            case l1.c.f8509e /* 6 */:
                ((CameraDevice) this.B).close();
                return;
            case 7:
                x0 x0Var = (x0) this.B;
                if (!x0Var.B) {
                    if (((w) x0Var.R).f14063f.X != u.REOPENING && ((w) x0Var.R).f14063f.X != u.REOPENING_QUIRK) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    p7.m.o(null, z10);
                    boolean c4 = ((w) x0Var.R).c();
                    x xVar = ((w) x0Var.R).f14063f;
                    if (c4) {
                        xVar.J(true);
                        return;
                    } else {
                        xVar.K(true);
                        return;
                    }
                }
                return;
            case 8:
                p0 p0Var = (p0) this.B;
                synchronized (p0Var.f14010a) {
                    if (!p0Var.f14011b.isEmpty()) {
                        p0Var.i(p0Var.f14011b);
                        p0Var.f14011b.clear();
                        return;
                    }
                    return;
                }
            case l1.c.f8508d /* 9 */:
                for (g1 g1Var : (LinkedHashSet) this.B) {
                    g1Var.getClass();
                    g1Var.c(g1Var);
                }
                return;
            case l1.c.f8510f /* 10 */:
                ((o) this.B).f14303b.onCameraAccessPrioritiesChanged();
                return;
            case 11:
                d5.f fVar = (d5.f) this.B;
                fVar.f();
                x0.e eVar2 = (x0.e) fVar.f3842d;
                Set<x0.a> set = (HashSet) fVar.f3846h;
                synchronized (eVar2.f14314a) {
                    if (set == null) {
                        try {
                            set = eVar2.f14315b.keySet();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    for (x0.a aVar : set) {
                        if (eVar2.f14315b.containsKey(aVar)) {
                            eVar2.j((x0.b) eVar2.f14315b.get(aVar));
                        }
                    }
                }
                return;
            case 12:
                ActionMode actionMode = ((z1.f) this.B).f14874h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            default:
                MaterialButton.a((MaterialButton) this.B);
                return;
        }
    }
}

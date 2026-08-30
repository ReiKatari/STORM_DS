package i0;

import a4.n;
import android.util.Log;
import d0.c0;
import d0.d0;
import d0.i1;
import j0.d1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import m9.o;
import na.f;
import p7.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements c0 {
    public b9.e B;
    public final ArrayList L;
    public final ArrayDeque A = new ArrayDeque();
    public boolean R = false;

    public e(f fVar) {
        l0.f.e();
        this.L = new ArrayList();
    }

    public final void a() {
        l0.f.e();
        new Exception("Camera is closed.", null);
        ArrayDeque arrayDeque = this.A;
        Iterator it = arrayDeque.iterator();
        if (!it.hasNext()) {
            arrayDeque.clear();
            ArrayList arrayList = new ArrayList(this.L);
            if (arrayList.size() <= 0) {
                return;
            }
            w.d.A(arrayList.get(0));
            throw null;
        }
        throw w.d.k(it);
    }

    public final void b() {
        boolean z10;
        int n10;
        l0.f.e();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (this.R) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        b9.e eVar = this.B;
        eVar.getClass();
        l0.f.e();
        n nVar = (n) eVar.L;
        nVar.getClass();
        l0.f.e();
        if (((i1) nVar.B) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        m.o("The ImageReader is not initialized.", z10);
        i1 i1Var = (i1) nVar.B;
        synchronized (i1Var.L) {
            n10 = ((d1) i1Var.R).n() - i1Var.A;
        }
        if (n10 == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
        } else if (this.A.poll() == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
        } else {
            o.b();
        }
    }

    @Override // d0.c0
    public final void d(d0 d0Var) {
        ij.a.p0().execute(new a8.f(12, this));
    }
}

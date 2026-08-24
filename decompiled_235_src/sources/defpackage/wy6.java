package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wy6  reason: default package */
/* loaded from: classes.dex */
public final class wy6 implements fk2 {
    public eb B;
    public final ArrayList L;
    public final ArrayDeque A = new ArrayDeque();
    public boolean R = false;

    public wy6(x31 x31Var) {
        nj2.h();
        this.L = new ArrayList();
    }

    public final void a() {
        nj2.h();
        new f23("Camera is closed.", 3, null);
        ArrayDeque arrayDeque = this.A;
        Iterator it = arrayDeque.iterator();
        if (!it.hasNext()) {
            arrayDeque.clear();
            ArrayList arrayList = new ArrayList(this.L);
            if (arrayList.size() <= 0) {
                return;
            }
            xg6.A(arrayList.get(0));
            throw null;
        }
        throw i61.j(it);
    }

    public final void b() {
        boolean z;
        int f;
        nj2.h();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (this.R) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        eb ebVar = this.B;
        ebVar.getClass();
        nj2.h();
        bt btVar = (bt) ebVar.L;
        btVar.getClass();
        nj2.h();
        if (((re5) btVar.B) != null) {
            z = true;
        } else {
            z = false;
        }
        np2.A("The ImageReader is not initialized.", z);
        re5 re5Var = (re5) btVar.B;
        synchronized (re5Var.R) {
            f = ((v23) re5Var.X).f() - re5Var.L;
        }
        if (f == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
        } else if (this.A.poll() == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
        } else {
            u34.a();
        }
    }

    @Override // defpackage.fk2
    public final void c(gk2 gk2Var) {
        u24.x().execute(new rk3(this, 15));
    }
}

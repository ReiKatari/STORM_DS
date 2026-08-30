package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mm6  reason: default package */
/* loaded from: classes.dex */
public final class mm6 implements gf2 {
    public q9 B;
    public final ArrayList L;
    public final ArrayDeque A = new ArrayDeque();
    public boolean R = false;

    public mm6(jo1 jo1Var) {
        nk2.s();
        this.L = new ArrayList();
    }

    public final void a() {
        nk2.s();
        new bw2(3, "Camera is closed.", null);
        ArrayDeque arrayDeque = this.A;
        Iterator it = arrayDeque.iterator();
        if (!it.hasNext()) {
            arrayDeque.clear();
            ArrayList arrayList = new ArrayList(this.L);
            if (arrayList.size() <= 0) {
                return;
            }
            ej6.j(arrayList.get(0));
            throw null;
        }
        throw b31.m(it);
    }

    public final void b() {
        boolean z;
        int n;
        nk2.s();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (this.R) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        q9 q9Var = this.B;
        q9Var.getClass();
        nk2.s();
        os osVar = (os) q9Var.L;
        osVar.getClass();
        nk2.s();
        if (((e55) osVar.B) != null) {
            z = true;
        } else {
            z = false;
        }
        nl2.D("The ImageReader is not initialized.", z);
        e55 e55Var = (e55) osVar.B;
        synchronized (e55Var.R) {
            n = ((rw2) e55Var.X).n() - e55Var.L;
        }
        if (n == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
        } else if (this.A.poll() == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
        } else {
            c44.b();
        }
    }

    @Override // defpackage.gf2
    public final void e(hf2 hf2Var) {
        iq2.x().execute(new tm3(13, this));
    }
}

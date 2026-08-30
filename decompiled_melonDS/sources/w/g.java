package w;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import j0.j2;
import j0.t1;
import j0.u1;
import j0.w1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ g(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Throwable, d0.t, java.lang.Exception] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) this.L;
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = (HashSet) ((a0.k) this.B).f9b;
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (hVar.b(totalCaptureResult)) {
                        hashSet.add(hVar);
                    }
                }
                if (!hashSet.isEmpty()) {
                    hashSet2.removeAll(hashSet);
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Surface) this.B).release();
                ((SurfaceTexture) this.L).release();
                return;
            case 2:
                x xVar = (x) this.B;
                String str = (String) this.L;
                xVar.v("Use case " + str + " INACTIVE", null);
                LinkedHashMap linkedHashMap = (LinkedHashMap) xVar.A.L;
                if (linkedHashMap.containsKey(str)) {
                    j2 j2Var = (j2) linkedHashMap.get(str);
                    j2Var.f7233f = false;
                    if (!j2Var.f7232e) {
                        linkedHashMap.remove(str);
                    }
                }
                xVar.L();
                return;
            case 3:
                ((t1) this.B).a((w1) this.L, u1.SESSION_ERROR_SURFACE_NEEDS_RESET);
                return;
            case 4:
                d0.b1 b1Var = (d0.b1) this.B;
                b5.i iVar = (b5.i) this.L;
                try {
                    String[] c4 = ((x.p) b1Var.f3336f).c();
                    c4.getClass();
                    ArrayList arrayList = new ArrayList(c4.length);
                    for (String str2 : c4) {
                        str2.getClass();
                        arrayList.add(new d0.q(p7.t.A(str2), null));
                    }
                    Log.d("Camera2PresenceSrc", "[FetchData] Refreshed camera list: " + zb.l.Y(arrayList, null, null, null, null, 63));
                    b1Var.l(arrayList, null);
                    iVar.b(arrayList);
                    return;
                } catch (x.a e6) {
                    Log.e("Camera2PresenceSrc", "[FetchData] Failed to get camera list for refresh.", e6);
                    ?? exc = new Exception(e6);
                    b1Var.l(null, exc);
                    iVar.c(exc);
                    return;
                }
            case l1.c.f8511g /* 5 */:
                p1.a0 a0Var = (p1.a0) this.L;
                ((d0.i1) this.B).o();
                ((AtomicBoolean) a0Var.L).set(false);
                ImageWriter imageWriter = (ImageWriter) a0Var.B;
                if (imageWriter != null) {
                    imageWriter.close();
                    return;
                }
                return;
            case l1.c.f8509e /* 6 */:
                f0.c cVar = (f0.c) this.B;
                d0.b1 b1Var2 = (d0.b1) this.L;
                HashSet hashSet3 = new HashSet();
                if (cVar != null) {
                    hashSet3.addAll(cVar.f4515a);
                }
                ((d0.j1) b1Var2.f3337g).getClass();
                return;
            default:
                String uuid = ((UUID) this.L).toString();
                uuid.getClass();
                y8.g.a((q8.p) this.B, uuid);
                return;
        }
    }
}

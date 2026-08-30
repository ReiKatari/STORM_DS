package w;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 extends CameraDevice.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13971a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f13972b;

    public i0(ArrayList arrayList) {
        this.f13971a = 0;
        this.f13972b = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) obj;
            if (!(stateCallback instanceof j0)) {
                ((ArrayList) this.f13972b).add(stateCallback);
            }
        }
    }

    public void a() {
        ArrayList i2;
        synchronized (((x0) this.f13972b).f14090c) {
            i2 = ((x0) this.f13972b).i();
            ((LinkedHashSet) ((x0) this.f13972b).f14093f).clear();
            ((LinkedHashSet) ((x0) this.f13972b).f14091d).clear();
            ((LinkedHashSet) ((x0) this.f13972b).f14092e).clear();
        }
        int size = i2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = i2.get(i10);
            i10++;
            g1 g1Var = (g1) obj;
            synchronized (g1Var.f13926a) {
                try {
                    List<j0.u0> list = g1Var.f13936k;
                    if (list != null) {
                        for (j0.u0 u0Var : list) {
                            u0Var.b();
                        }
                        g1Var.f13936k = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g1Var.f13945u.u();
        }
    }

    public void b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((x0) this.f13972b).f14090c) {
            linkedHashSet.addAll((LinkedHashSet) ((x0) this.f13972b).f14093f);
            linkedHashSet.addAll((LinkedHashSet) ((x0) this.f13972b).f14091d);
        }
        ((l0.h) ((x0) this.f13972b).f14089b).execute(new r0.b(9, linkedHashSet));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f13971a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f13972b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((CameraDevice.StateCallback) obj).onClosed(cameraDevice);
                }
                return;
            default:
                b();
                a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f13971a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f13972b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((CameraDevice.StateCallback) obj).onDisconnected(cameraDevice);
                }
                return;
            default:
                b();
                a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i2) {
        switch (this.f13971a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f13972b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((CameraDevice.StateCallback) obj).onError(cameraDevice, i2);
                }
                return;
            default:
                b();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                synchronized (((x0) this.f13972b).f14090c) {
                    linkedHashSet.addAll((LinkedHashSet) ((x0) this.f13972b).f14093f);
                    linkedHashSet.addAll((LinkedHashSet) ((x0) this.f13972b).f14091d);
                }
                ((l0.h) ((x0) this.f13972b).f14089b).execute(new d2.d(i2, 5, linkedHashSet));
                a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.f13971a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f13972b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((CameraDevice.StateCallback) obj).onOpened(cameraDevice);
                }
                return;
            default:
                return;
        }
    }

    private final void c(CameraDevice cameraDevice) {
    }

    public i0(x0 x0Var) {
        this.f13971a = 1;
        this.f13972b = x0Var;
    }
}

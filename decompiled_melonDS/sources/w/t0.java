package w;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: e  reason: collision with root package name */
    public static final Range f14049e = new Range(120, 120);

    /* renamed from: a  reason: collision with root package name */
    public final x.j f14050a;

    /* renamed from: b  reason: collision with root package name */
    public final yb.n f14051b;

    /* renamed from: c  reason: collision with root package name */
    public final yb.n f14052c;

    /* renamed from: d  reason: collision with root package name */
    public final yb.n f14053d;

    public t0(x.j jVar) {
        jVar.getClass();
        this.f14050a = jVar;
        this.f14051b = new yb.n(new mc.a(this) { // from class: w.s0
            public final /* synthetic */ t0 B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                switch (r2) {
                    case 0:
                        int[] iArr = (int[]) this.B.f14050a.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z10 = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    if (iArr[i2] == 9) {
                                        z10 = true;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z10);
                    case DSiCameraSource.FrontCamera /* 1 */:
                        List list = (List) this.B.f14053d.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (it.hasNext()) {
                                int a10 = q0.a.a((Size) next);
                                do {
                                    Object next2 = it.next();
                                    int a11 = q0.a.a((Size) next2);
                                    if (a10 < a11) {
                                        next = next2;
                                        a10 = a11;
                                    }
                                } while (it.hasNext());
                                return (Size) next;
                            }
                            return (Size) next;
                        }
                        fj.j.l();
                        return null;
                    default:
                        Size[] highSpeedVideoSizes = ((StreamConfigurationMap) ((rd.k) this.B.f14050a.c().A).B).getHighSpeedVideoSizes();
                        if (highSpeedVideoSizes != null) {
                            return zb.k.v(highSpeedVideoSizes);
                        }
                        return zb.q.A;
                }
            }
        });
        this.f14052c = new yb.n(new mc.a(this) { // from class: w.s0
            public final /* synthetic */ t0 B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                switch (r2) {
                    case 0:
                        int[] iArr = (int[]) this.B.f14050a.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z10 = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    if (iArr[i2] == 9) {
                                        z10 = true;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z10);
                    case DSiCameraSource.FrontCamera /* 1 */:
                        List list = (List) this.B.f14053d.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (it.hasNext()) {
                                int a10 = q0.a.a((Size) next);
                                do {
                                    Object next2 = it.next();
                                    int a11 = q0.a.a((Size) next2);
                                    if (a10 < a11) {
                                        next = next2;
                                        a10 = a11;
                                    }
                                } while (it.hasNext());
                                return (Size) next;
                            }
                            return (Size) next;
                        }
                        fj.j.l();
                        return null;
                    default:
                        Size[] highSpeedVideoSizes = ((StreamConfigurationMap) ((rd.k) this.B.f14050a.c().A).B).getHighSpeedVideoSizes();
                        if (highSpeedVideoSizes != null) {
                            return zb.k.v(highSpeedVideoSizes);
                        }
                        return zb.q.A;
                }
            }
        });
        this.f14053d = new yb.n(new mc.a(this) { // from class: w.s0
            public final /* synthetic */ t0 B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                switch (r2) {
                    case 0:
                        int[] iArr = (int[]) this.B.f14050a.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z10 = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    if (iArr[i2] == 9) {
                                        z10 = true;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z10);
                    case DSiCameraSource.FrontCamera /* 1 */:
                        List list = (List) this.B.f14053d.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (it.hasNext()) {
                                int a10 = q0.a.a((Size) next);
                                do {
                                    Object next2 = it.next();
                                    int a11 = q0.a.a((Size) next2);
                                    if (a10 < a11) {
                                        next = next2;
                                        a10 = a11;
                                    }
                                } while (it.hasNext());
                                return (Size) next;
                            }
                            return (Size) next;
                        }
                        fj.j.l();
                        return null;
                    default:
                        Size[] highSpeedVideoSizes = ((StreamConfigurationMap) ((rd.k) this.B.f14050a.c().A).B).getHighSpeedVideoSizes();
                        if (highSpeedVideoSizes != null) {
                            return zb.k.v(highSpeedVideoSizes);
                        }
                        return zb.q.A;
                }
            }
        });
    }

    public static List a(List list) {
        if (list.isEmpty()) {
            return zb.q.A;
        }
        ArrayList q02 = zb.l.q0((Collection) zb.l.R(list));
        for (List list2 : zb.l.P(list)) {
            q02.retainAll(list2);
        }
        return q02;
    }

    public final Range[] b(List list) {
        list.getClass();
        int size = list.size();
        if (1 <= size && size < 3 && zb.l.O(list).size() == 1) {
            ArrayList c4 = c((Size) list.get(0));
            if (c4.isEmpty()) {
                c4 = null;
            }
            if (c4 != null) {
                if (list.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : c4) {
                        Range range = (Range) obj;
                        if (nc.k.a(range.getLower(), range.getUpper())) {
                            arrayList.add(obj);
                        }
                    }
                    c4 = arrayList;
                }
                return (Range[]) c4.toArray(new Range[0]);
            }
        }
        return null;
    }

    public final List c(Size size) {
        Range<Integer>[] kVar;
        try {
            kVar = ((StreamConfigurationMap) ((rd.k) this.f14050a.c().A).B).getHighSpeedVideoFpsRangesFor(size);
        } catch (Throwable th2) {
            kVar = new yb.k(th2);
        }
        boolean z10 = kVar instanceof yb.k;
        yb.k kVar2 = kVar;
        if (z10) {
            kVar2 = null;
        }
        Range[] rangeArr = (Range[]) kVar2;
        if (rangeArr != null) {
            return zb.l.p0(zb.k.v(rangeArr));
        }
        return zb.q.A;
    }
}

package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mr2  reason: default package */
/* loaded from: classes.dex */
public final class mr2 {
    public static final Range f = new Range(120, 120);
    public final ce0 a;
    public final il6 b;
    public final il6 c;
    public final il6 d;
    public final il6 e;

    public mr2(ce0 ce0Var) {
        ce0Var.getClass();
        this.a = ce0Var;
        this.b = new il6(new ki2(this) { // from class: lr2
            public final /* synthetic */ mr2 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                Size[] sizeArr = null;
                mr2 mr2Var = this.B;
                switch (i) {
                    case 0:
                        ce0 ce0Var2 = mr2Var.a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((ia0) ce0Var2).c(key);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    if (iArr[i2] == 9) {
                                        z = true;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) mr2Var.e.getValue();
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
                                int a = x76.a((Size) next);
                                do {
                                    Object next2 = it.next();
                                    int a2 = x76.a((Size) next2);
                                    if (a < a2) {
                                        next = next2;
                                        a = a2;
                                    }
                                } while (it.hasNext());
                                return (Size) next;
                            }
                            return (Size) next;
                        }
                        vd6.b();
                        return null;
                    case 2:
                        ce0 ce0Var3 = mr2Var.a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ia0) ce0Var3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new nf6(streamConfigurationMap, new ig4(ce0Var3));
                        }
                        i.i("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((nf6) mr2Var.d.getValue()).c.A;
                        if (streamConfigurationMap2 != null) {
                            sizeArr = streamConfigurationMap2.getHighSpeedVideoSizes();
                        }
                        if (sizeArr != null) {
                            return nu.F0(sizeArr);
                        }
                        return pp1.A;
                }
            }
        });
        this.c = new il6(new ki2(this) { // from class: lr2
            public final /* synthetic */ mr2 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                Size[] sizeArr = null;
                mr2 mr2Var = this.B;
                switch (i) {
                    case 0:
                        ce0 ce0Var2 = mr2Var.a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((ia0) ce0Var2).c(key);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    if (iArr[i2] == 9) {
                                        z = true;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) mr2Var.e.getValue();
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
                                int a = x76.a((Size) next);
                                do {
                                    Object next2 = it.next();
                                    int a2 = x76.a((Size) next2);
                                    if (a < a2) {
                                        next = next2;
                                        a = a2;
                                    }
                                } while (it.hasNext());
                                return (Size) next;
                            }
                            return (Size) next;
                        }
                        vd6.b();
                        return null;
                    case 2:
                        ce0 ce0Var3 = mr2Var.a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ia0) ce0Var3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new nf6(streamConfigurationMap, new ig4(ce0Var3));
                        }
                        i.i("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((nf6) mr2Var.d.getValue()).c.A;
                        if (streamConfigurationMap2 != null) {
                            sizeArr = streamConfigurationMap2.getHighSpeedVideoSizes();
                        }
                        if (sizeArr != null) {
                            return nu.F0(sizeArr);
                        }
                        return pp1.A;
                }
            }
        });
        this.d = new il6(new ki2(this) { // from class: lr2
            public final /* synthetic */ mr2 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                Size[] sizeArr = null;
                mr2 mr2Var = this.B;
                switch (i) {
                    case 0:
                        ce0 ce0Var2 = mr2Var.a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((ia0) ce0Var2).c(key);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    if (iArr[i2] == 9) {
                                        z = true;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) mr2Var.e.getValue();
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
                                int a = x76.a((Size) next);
                                do {
                                    Object next2 = it.next();
                                    int a2 = x76.a((Size) next2);
                                    if (a < a2) {
                                        next = next2;
                                        a = a2;
                                    }
                                } while (it.hasNext());
                                return (Size) next;
                            }
                            return (Size) next;
                        }
                        vd6.b();
                        return null;
                    case 2:
                        ce0 ce0Var3 = mr2Var.a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ia0) ce0Var3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new nf6(streamConfigurationMap, new ig4(ce0Var3));
                        }
                        i.i("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((nf6) mr2Var.d.getValue()).c.A;
                        if (streamConfigurationMap2 != null) {
                            sizeArr = streamConfigurationMap2.getHighSpeedVideoSizes();
                        }
                        if (sizeArr != null) {
                            return nu.F0(sizeArr);
                        }
                        return pp1.A;
                }
            }
        });
        this.e = new il6(new ki2(this) { // from class: lr2
            public final /* synthetic */ mr2 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                Size[] sizeArr = null;
                mr2 mr2Var = this.B;
                switch (i) {
                    case 0:
                        ce0 ce0Var2 = mr2Var.a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((ia0) ce0Var2).c(key);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    if (iArr[i2] == 9) {
                                        z = true;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) mr2Var.e.getValue();
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
                                int a = x76.a((Size) next);
                                do {
                                    Object next2 = it.next();
                                    int a2 = x76.a((Size) next2);
                                    if (a < a2) {
                                        next = next2;
                                        a = a2;
                                    }
                                } while (it.hasNext());
                                return (Size) next;
                            }
                            return (Size) next;
                        }
                        vd6.b();
                        return null;
                    case 2:
                        ce0 ce0Var3 = mr2Var.a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ia0) ce0Var3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new nf6(streamConfigurationMap, new ig4(ce0Var3));
                        }
                        i.i("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((nf6) mr2Var.d.getValue()).c.A;
                        if (streamConfigurationMap2 != null) {
                            sizeArr = streamConfigurationMap2.getHighSpeedVideoSizes();
                        }
                        if (sizeArr != null) {
                            return nu.F0(sizeArr);
                        }
                        return pp1.A;
                }
            }
        });
    }

    public static List a(List list) {
        if (list.isEmpty()) {
            return pp1.A;
        }
        ArrayList p1 = tq0.p1((Collection) tq0.K0(list));
        for (List list2 : tq0.G0(1, list)) {
            p1.retainAll(list2);
        }
        return p1;
    }

    public final Range[] b(List list) {
        int size = list.size();
        if (1 <= size && size < 3 && tq0.n1(tq0.r1(list)).size() == 1) {
            ArrayList c = c((Size) list.get(0));
            if (c.isEmpty()) {
                c = null;
            }
            if (c != null) {
                if (list.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : c) {
                        Range range = (Range) obj;
                        if (b53.x(range.getLower(), range.getUpper())) {
                            arrayList.add(obj);
                        }
                    }
                    c = arrayList;
                }
                return (Range[]) c.toArray(new Range[0]);
            }
        }
        return null;
    }

    public final List c(Size size) {
        Object kc5Var;
        Object obj = null;
        try {
            nf6 nf6Var = (nf6) this.d.getValue();
            nf6Var.getClass();
            size.getClass();
            dz4 dz4Var = nf6Var.c;
            dz4Var.getClass();
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) dz4Var.A;
            if (streamConfigurationMap != null) {
                kc5Var = streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size);
            } else {
                kc5Var = null;
            }
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        if (!(kc5Var instanceof kc5)) {
            obj = kc5Var;
        }
        Range<Integer>[] rangeArr = (Range[]) obj;
        if (rangeArr != null) {
            return tq0.n1(nu.o0(rangeArr));
        }
        return pp1.A;
    }
}

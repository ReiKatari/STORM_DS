package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nx2  reason: default package */
/* loaded from: classes.dex */
public final class nx2 {
    public static final Range f = new Range(120, 120);
    public final lg0 a;
    public final ex6 b;
    public final ex6 c;
    public final ex6 d;
    public final ex6 e;

    public nx2(lg0 lg0Var) {
        lg0Var.getClass();
        this.a = lg0Var;
        this.b = new ex6(new on2(this) { // from class: mx2
            public final /* synthetic */ nx2 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                Size[] sizeArr = null;
                nx2 nx2Var = this.B;
                switch (i) {
                    case 0:
                        lg0 lg0Var2 = nx2Var.a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((qc0) lg0Var2).c(key);
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
                        List list = (List) nx2Var.e.getValue();
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
                                int a = mj6.a((Size) next);
                                do {
                                    Object next2 = it.next();
                                    int a2 = mj6.a((Size) next2);
                                    if (a < a2) {
                                        next = next2;
                                        a = a2;
                                    }
                                } while (it.hasNext());
                                return (Size) next;
                            }
                            return (Size) next;
                        }
                        fa6.c();
                        return null;
                    case 2:
                        lg0 lg0Var3 = nx2Var.a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((qc0) lg0Var3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new dr6(streamConfigurationMap, new lp4(lg0Var3));
                        }
                        i.h("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((dr6) nx2Var.d.getValue()).c.A;
                        if (streamConfigurationMap2 != null) {
                            sizeArr = streamConfigurationMap2.getHighSpeedVideoSizes();
                        }
                        if (sizeArr != null) {
                            return fv.T0(sizeArr);
                        }
                        return yt1.A;
                }
            }
        });
        this.c = new ex6(new on2(this) { // from class: mx2
            public final /* synthetic */ nx2 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                Size[] sizeArr = null;
                nx2 nx2Var = this.B;
                switch (i) {
                    case 0:
                        lg0 lg0Var2 = nx2Var.a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((qc0) lg0Var2).c(key);
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
                        List list = (List) nx2Var.e.getValue();
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
                                int a = mj6.a((Size) next);
                                do {
                                    Object next2 = it.next();
                                    int a2 = mj6.a((Size) next2);
                                    if (a < a2) {
                                        next = next2;
                                        a = a2;
                                    }
                                } while (it.hasNext());
                                return (Size) next;
                            }
                            return (Size) next;
                        }
                        fa6.c();
                        return null;
                    case 2:
                        lg0 lg0Var3 = nx2Var.a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((qc0) lg0Var3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new dr6(streamConfigurationMap, new lp4(lg0Var3));
                        }
                        i.h("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((dr6) nx2Var.d.getValue()).c.A;
                        if (streamConfigurationMap2 != null) {
                            sizeArr = streamConfigurationMap2.getHighSpeedVideoSizes();
                        }
                        if (sizeArr != null) {
                            return fv.T0(sizeArr);
                        }
                        return yt1.A;
                }
            }
        });
        this.d = new ex6(new on2(this) { // from class: mx2
            public final /* synthetic */ nx2 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                Size[] sizeArr = null;
                nx2 nx2Var = this.B;
                switch (i) {
                    case 0:
                        lg0 lg0Var2 = nx2Var.a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((qc0) lg0Var2).c(key);
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
                        List list = (List) nx2Var.e.getValue();
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
                                int a = mj6.a((Size) next);
                                do {
                                    Object next2 = it.next();
                                    int a2 = mj6.a((Size) next2);
                                    if (a < a2) {
                                        next = next2;
                                        a = a2;
                                    }
                                } while (it.hasNext());
                                return (Size) next;
                            }
                            return (Size) next;
                        }
                        fa6.c();
                        return null;
                    case 2:
                        lg0 lg0Var3 = nx2Var.a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((qc0) lg0Var3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new dr6(streamConfigurationMap, new lp4(lg0Var3));
                        }
                        i.h("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((dr6) nx2Var.d.getValue()).c.A;
                        if (streamConfigurationMap2 != null) {
                            sizeArr = streamConfigurationMap2.getHighSpeedVideoSizes();
                        }
                        if (sizeArr != null) {
                            return fv.T0(sizeArr);
                        }
                        return yt1.A;
                }
            }
        });
        this.e = new ex6(new on2(this) { // from class: mx2
            public final /* synthetic */ nx2 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                Size[] sizeArr = null;
                nx2 nx2Var = this.B;
                switch (i) {
                    case 0:
                        lg0 lg0Var2 = nx2Var.a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((qc0) lg0Var2).c(key);
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
                        List list = (List) nx2Var.e.getValue();
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
                                int a = mj6.a((Size) next);
                                do {
                                    Object next2 = it.next();
                                    int a2 = mj6.a((Size) next2);
                                    if (a < a2) {
                                        next = next2;
                                        a = a2;
                                    }
                                } while (it.hasNext());
                                return (Size) next;
                            }
                            return (Size) next;
                        }
                        fa6.c();
                        return null;
                    case 2:
                        lg0 lg0Var3 = nx2Var.a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((qc0) lg0Var3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new dr6(streamConfigurationMap, new lp4(lg0Var3));
                        }
                        i.h("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((dr6) nx2Var.d.getValue()).c.A;
                        if (streamConfigurationMap2 != null) {
                            sizeArr = streamConfigurationMap2.getHighSpeedVideoSizes();
                        }
                        if (sizeArr != null) {
                            return fv.T0(sizeArr);
                        }
                        return yt1.A;
                }
            }
        });
    }

    public static List a(List list) {
        if (list.isEmpty()) {
            return yt1.A;
        }
        ArrayList m1 = gt0.m1((Collection) gt0.H0(list));
        for (List list2 : gt0.D0(list, 1)) {
            m1.retainAll(list2);
        }
        return m1;
    }

    public final Range[] b(List list) {
        int size = list.size();
        if (1 <= size && size < 3 && gt0.k1(gt0.o1(list)).size() == 1) {
            ArrayList c = c((Size) list.get(0));
            if (c.isEmpty()) {
                c = null;
            }
            if (c != null) {
                if (list.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : c) {
                        Range range = (Range) obj;
                        if (nb3.k(range.getLower(), range.getUpper())) {
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
        Object em5Var;
        Object obj = null;
        try {
            dr6 dr6Var = (dr6) this.d.getValue();
            dr6Var.getClass();
            size.getClass();
            s35 s35Var = dr6Var.c;
            s35Var.getClass();
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) s35Var.A;
            if (streamConfigurationMap != null) {
                em5Var = streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size);
            } else {
                em5Var = null;
            }
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (!(em5Var instanceof em5)) {
            obj = em5Var;
        }
        Range<Integer>[] rangeArr = (Range[]) obj;
        if (rangeArr != null) {
            return gt0.k1(fv.C0(rangeArr));
        }
        return yt1.A;
    }
}

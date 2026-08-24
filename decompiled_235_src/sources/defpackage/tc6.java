package defpackage;

import android.media.MediaCodec;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tc6  reason: default package */
/* loaded from: classes.dex */
public final class tc6 {
    public final Collection a;
    public final boolean b;
    public final ex6 c = new ex6(new on2(this) { // from class: sc6
        public final /* synthetic */ tc6 B;

        {
            this.B = this;
        }

        @Override // defpackage.on2
        public final Object c() {
            List b;
            rc6 rc6Var;
            long j;
            rc6 rc6Var2;
            rc6 rc6Var3;
            int i = r2;
            int i2 = 0;
            tc6 tc6Var = this.B;
            switch (i) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (di7 di7Var : tc6Var.a) {
                        boolean z = tc6Var.b;
                        di7Var.getClass();
                        if (z) {
                            rc6Var = di7Var.o;
                        } else {
                            rc6Var = di7Var.p;
                        }
                        rc6Var.getClass();
                        arrayList.add(rc6Var);
                        zi7 zi7Var = di7Var.h;
                        zi7Var.getClass();
                        arrayList2.add(zi7Var);
                    }
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            if (((rc6) obj).g.c == 5) {
                                if (kj2.G()) {
                                    Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                }
                                return zt1.A;
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    xx xxVar = vr6.a;
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size2) {
                            Object obj2 = arrayList.get(i4);
                            i4++;
                            rc6 rc6Var4 = (rc6) obj2;
                            if (rc6Var4.g.b.A.containsKey(xxVar) && rc6Var4.b().size() != 1) {
                                if (kj2.G()) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + rc6Var4.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                    return linkedHashMap;
                                }
                                return linkedHashMap;
                            } else if (rc6Var4.g.b.A.containsKey(xxVar)) {
                                int size3 = arrayList.size();
                                int i5 = 0;
                                int i6 = 0;
                                while (i6 < size3) {
                                    Object obj3 = arrayList.get(i6);
                                    i6++;
                                    rc6 rc6Var5 = (rc6) obj3;
                                    if (((zi7) arrayList3.get(i5)).x() == bj7.METERING_REPEATING) {
                                        rc6Var5.b().getClass();
                                        np2.A("MeteringRepeating should contain a surface", !b.isEmpty());
                                        linkedHashMap.put(rc6Var5.b().get(0), 1L);
                                    } else if (rc6Var5.g.b.A.containsKey(xxVar)) {
                                        List b2 = rc6Var5.b();
                                        b2.getClass();
                                        if (!b2.isEmpty()) {
                                            Object obj4 = rc6Var5.b().get(0);
                                            Object e = rc6Var5.g.b.e(xxVar);
                                            e.getClass();
                                            linkedHashMap.put(obj4, e);
                                        }
                                    }
                                    i5++;
                                }
                            }
                        }
                    }
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    }
                    return linkedHashMap;
                case 1:
                    Collection<di7> collection = tc6Var.a;
                    ArrayList arrayList4 = new ArrayList(ht0.v0(collection, 10));
                    for (di7 di7Var2 : collection) {
                        boolean z2 = tc6Var.b;
                        di7Var2.getClass();
                        if (z2) {
                            rc6Var2 = di7Var2.o;
                        } else {
                            rc6Var2 = di7Var2.p;
                        }
                        rc6Var2.getClass();
                        arrayList4.add(rc6Var2);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    int size4 = arrayList4.size();
                    while (i2 < size4) {
                        Object obj5 = arrayList4.get(i2);
                        i2++;
                        rc6 rc6Var6 = (rc6) obj5;
                        List<ig1> b3 = rc6Var6.b();
                        ek0 ek0Var = rc6Var6.g;
                        for (ig1 ig1Var : b3) {
                            go4 go4Var = ek0Var.b;
                            xx xxVar2 = kd0.g0;
                            if (go4Var.A.containsKey(xxVar2) && go4Var.e(xxVar2) != null) {
                                Object e2 = go4Var.e(xxVar2);
                                e2.getClass();
                                linkedHashMap2.put(ig1Var, e2);
                            } else {
                                if (nb3.k(ig1Var.j, MediaCodec.class)) {
                                    j = 1;
                                } else {
                                    j = 0;
                                }
                                linkedHashMap2.put(ig1Var, Long.valueOf(j));
                            }
                        }
                    }
                    return linkedHashMap2;
                case 2:
                    pc6 pc6Var = new pc6();
                    for (di7 di7Var3 : tc6Var.a) {
                        boolean z3 = tc6Var.b;
                        di7Var3.getClass();
                        if (z3) {
                            rc6Var3 = di7Var3.o;
                        } else {
                            rc6Var3 = di7Var3.p;
                        }
                        rc6Var3.getClass();
                        pc6Var.a(rc6Var3);
                    }
                    return pc6Var;
                case 3:
                    ex6 ex6Var = tc6Var.e;
                    if (((pc6) ex6Var.getValue()).c()) {
                        return ((pc6) ex6Var.getValue()).b();
                    }
                    i.m("Check failed.");
                    return null;
                default:
                    ex6 ex6Var2 = tc6Var.f;
                    if (((pc6) tc6Var.e.getValue()).c()) {
                        wy wyVar = ((rc6) ex6Var2.getValue()).b;
                        if (wyVar != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List b4 = ((rc6) ex6Var2.getValue()).b();
                            b4.getClass();
                            arrayList5.addAll(b4);
                            ig1 ig1Var2 = wyVar.a;
                            ig1Var2.getClass();
                            arrayList5.add(ig1Var2);
                            List unmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (unmodifiableList != null) {
                                return unmodifiableList;
                            }
                        }
                        return ((rc6) ex6Var2.getValue()).b();
                    }
                    i.m("Check failed.");
                    return null;
            }
        }
    });
    public final ex6 d = new ex6(new on2(this) { // from class: sc6
        public final /* synthetic */ tc6 B;

        {
            this.B = this;
        }

        @Override // defpackage.on2
        public final Object c() {
            List b;
            rc6 rc6Var;
            long j;
            rc6 rc6Var2;
            rc6 rc6Var3;
            int i = r2;
            int i2 = 0;
            tc6 tc6Var = this.B;
            switch (i) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (di7 di7Var : tc6Var.a) {
                        boolean z = tc6Var.b;
                        di7Var.getClass();
                        if (z) {
                            rc6Var = di7Var.o;
                        } else {
                            rc6Var = di7Var.p;
                        }
                        rc6Var.getClass();
                        arrayList.add(rc6Var);
                        zi7 zi7Var = di7Var.h;
                        zi7Var.getClass();
                        arrayList2.add(zi7Var);
                    }
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            if (((rc6) obj).g.c == 5) {
                                if (kj2.G()) {
                                    Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                }
                                return zt1.A;
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    xx xxVar = vr6.a;
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size2) {
                            Object obj2 = arrayList.get(i4);
                            i4++;
                            rc6 rc6Var4 = (rc6) obj2;
                            if (rc6Var4.g.b.A.containsKey(xxVar) && rc6Var4.b().size() != 1) {
                                if (kj2.G()) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + rc6Var4.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                    return linkedHashMap;
                                }
                                return linkedHashMap;
                            } else if (rc6Var4.g.b.A.containsKey(xxVar)) {
                                int size3 = arrayList.size();
                                int i5 = 0;
                                int i6 = 0;
                                while (i6 < size3) {
                                    Object obj3 = arrayList.get(i6);
                                    i6++;
                                    rc6 rc6Var5 = (rc6) obj3;
                                    if (((zi7) arrayList3.get(i5)).x() == bj7.METERING_REPEATING) {
                                        rc6Var5.b().getClass();
                                        np2.A("MeteringRepeating should contain a surface", !b.isEmpty());
                                        linkedHashMap.put(rc6Var5.b().get(0), 1L);
                                    } else if (rc6Var5.g.b.A.containsKey(xxVar)) {
                                        List b2 = rc6Var5.b();
                                        b2.getClass();
                                        if (!b2.isEmpty()) {
                                            Object obj4 = rc6Var5.b().get(0);
                                            Object e = rc6Var5.g.b.e(xxVar);
                                            e.getClass();
                                            linkedHashMap.put(obj4, e);
                                        }
                                    }
                                    i5++;
                                }
                            }
                        }
                    }
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    }
                    return linkedHashMap;
                case 1:
                    Collection<di7> collection = tc6Var.a;
                    ArrayList arrayList4 = new ArrayList(ht0.v0(collection, 10));
                    for (di7 di7Var2 : collection) {
                        boolean z2 = tc6Var.b;
                        di7Var2.getClass();
                        if (z2) {
                            rc6Var2 = di7Var2.o;
                        } else {
                            rc6Var2 = di7Var2.p;
                        }
                        rc6Var2.getClass();
                        arrayList4.add(rc6Var2);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    int size4 = arrayList4.size();
                    while (i2 < size4) {
                        Object obj5 = arrayList4.get(i2);
                        i2++;
                        rc6 rc6Var6 = (rc6) obj5;
                        List<ig1> b3 = rc6Var6.b();
                        ek0 ek0Var = rc6Var6.g;
                        for (ig1 ig1Var : b3) {
                            go4 go4Var = ek0Var.b;
                            xx xxVar2 = kd0.g0;
                            if (go4Var.A.containsKey(xxVar2) && go4Var.e(xxVar2) != null) {
                                Object e2 = go4Var.e(xxVar2);
                                e2.getClass();
                                linkedHashMap2.put(ig1Var, e2);
                            } else {
                                if (nb3.k(ig1Var.j, MediaCodec.class)) {
                                    j = 1;
                                } else {
                                    j = 0;
                                }
                                linkedHashMap2.put(ig1Var, Long.valueOf(j));
                            }
                        }
                    }
                    return linkedHashMap2;
                case 2:
                    pc6 pc6Var = new pc6();
                    for (di7 di7Var3 : tc6Var.a) {
                        boolean z3 = tc6Var.b;
                        di7Var3.getClass();
                        if (z3) {
                            rc6Var3 = di7Var3.o;
                        } else {
                            rc6Var3 = di7Var3.p;
                        }
                        rc6Var3.getClass();
                        pc6Var.a(rc6Var3);
                    }
                    return pc6Var;
                case 3:
                    ex6 ex6Var = tc6Var.e;
                    if (((pc6) ex6Var.getValue()).c()) {
                        return ((pc6) ex6Var.getValue()).b();
                    }
                    i.m("Check failed.");
                    return null;
                default:
                    ex6 ex6Var2 = tc6Var.f;
                    if (((pc6) tc6Var.e.getValue()).c()) {
                        wy wyVar = ((rc6) ex6Var2.getValue()).b;
                        if (wyVar != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List b4 = ((rc6) ex6Var2.getValue()).b();
                            b4.getClass();
                            arrayList5.addAll(b4);
                            ig1 ig1Var2 = wyVar.a;
                            ig1Var2.getClass();
                            arrayList5.add(ig1Var2);
                            List unmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (unmodifiableList != null) {
                                return unmodifiableList;
                            }
                        }
                        return ((rc6) ex6Var2.getValue()).b();
                    }
                    i.m("Check failed.");
                    return null;
            }
        }
    });
    public final ex6 e = new ex6(new on2(this) { // from class: sc6
        public final /* synthetic */ tc6 B;

        {
            this.B = this;
        }

        @Override // defpackage.on2
        public final Object c() {
            List b;
            rc6 rc6Var;
            long j;
            rc6 rc6Var2;
            rc6 rc6Var3;
            int i = r2;
            int i2 = 0;
            tc6 tc6Var = this.B;
            switch (i) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (di7 di7Var : tc6Var.a) {
                        boolean z = tc6Var.b;
                        di7Var.getClass();
                        if (z) {
                            rc6Var = di7Var.o;
                        } else {
                            rc6Var = di7Var.p;
                        }
                        rc6Var.getClass();
                        arrayList.add(rc6Var);
                        zi7 zi7Var = di7Var.h;
                        zi7Var.getClass();
                        arrayList2.add(zi7Var);
                    }
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            if (((rc6) obj).g.c == 5) {
                                if (kj2.G()) {
                                    Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                }
                                return zt1.A;
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    xx xxVar = vr6.a;
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size2) {
                            Object obj2 = arrayList.get(i4);
                            i4++;
                            rc6 rc6Var4 = (rc6) obj2;
                            if (rc6Var4.g.b.A.containsKey(xxVar) && rc6Var4.b().size() != 1) {
                                if (kj2.G()) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + rc6Var4.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                    return linkedHashMap;
                                }
                                return linkedHashMap;
                            } else if (rc6Var4.g.b.A.containsKey(xxVar)) {
                                int size3 = arrayList.size();
                                int i5 = 0;
                                int i6 = 0;
                                while (i6 < size3) {
                                    Object obj3 = arrayList.get(i6);
                                    i6++;
                                    rc6 rc6Var5 = (rc6) obj3;
                                    if (((zi7) arrayList3.get(i5)).x() == bj7.METERING_REPEATING) {
                                        rc6Var5.b().getClass();
                                        np2.A("MeteringRepeating should contain a surface", !b.isEmpty());
                                        linkedHashMap.put(rc6Var5.b().get(0), 1L);
                                    } else if (rc6Var5.g.b.A.containsKey(xxVar)) {
                                        List b2 = rc6Var5.b();
                                        b2.getClass();
                                        if (!b2.isEmpty()) {
                                            Object obj4 = rc6Var5.b().get(0);
                                            Object e = rc6Var5.g.b.e(xxVar);
                                            e.getClass();
                                            linkedHashMap.put(obj4, e);
                                        }
                                    }
                                    i5++;
                                }
                            }
                        }
                    }
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    }
                    return linkedHashMap;
                case 1:
                    Collection<di7> collection = tc6Var.a;
                    ArrayList arrayList4 = new ArrayList(ht0.v0(collection, 10));
                    for (di7 di7Var2 : collection) {
                        boolean z2 = tc6Var.b;
                        di7Var2.getClass();
                        if (z2) {
                            rc6Var2 = di7Var2.o;
                        } else {
                            rc6Var2 = di7Var2.p;
                        }
                        rc6Var2.getClass();
                        arrayList4.add(rc6Var2);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    int size4 = arrayList4.size();
                    while (i2 < size4) {
                        Object obj5 = arrayList4.get(i2);
                        i2++;
                        rc6 rc6Var6 = (rc6) obj5;
                        List<ig1> b3 = rc6Var6.b();
                        ek0 ek0Var = rc6Var6.g;
                        for (ig1 ig1Var : b3) {
                            go4 go4Var = ek0Var.b;
                            xx xxVar2 = kd0.g0;
                            if (go4Var.A.containsKey(xxVar2) && go4Var.e(xxVar2) != null) {
                                Object e2 = go4Var.e(xxVar2);
                                e2.getClass();
                                linkedHashMap2.put(ig1Var, e2);
                            } else {
                                if (nb3.k(ig1Var.j, MediaCodec.class)) {
                                    j = 1;
                                } else {
                                    j = 0;
                                }
                                linkedHashMap2.put(ig1Var, Long.valueOf(j));
                            }
                        }
                    }
                    return linkedHashMap2;
                case 2:
                    pc6 pc6Var = new pc6();
                    for (di7 di7Var3 : tc6Var.a) {
                        boolean z3 = tc6Var.b;
                        di7Var3.getClass();
                        if (z3) {
                            rc6Var3 = di7Var3.o;
                        } else {
                            rc6Var3 = di7Var3.p;
                        }
                        rc6Var3.getClass();
                        pc6Var.a(rc6Var3);
                    }
                    return pc6Var;
                case 3:
                    ex6 ex6Var = tc6Var.e;
                    if (((pc6) ex6Var.getValue()).c()) {
                        return ((pc6) ex6Var.getValue()).b();
                    }
                    i.m("Check failed.");
                    return null;
                default:
                    ex6 ex6Var2 = tc6Var.f;
                    if (((pc6) tc6Var.e.getValue()).c()) {
                        wy wyVar = ((rc6) ex6Var2.getValue()).b;
                        if (wyVar != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List b4 = ((rc6) ex6Var2.getValue()).b();
                            b4.getClass();
                            arrayList5.addAll(b4);
                            ig1 ig1Var2 = wyVar.a;
                            ig1Var2.getClass();
                            arrayList5.add(ig1Var2);
                            List unmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (unmodifiableList != null) {
                                return unmodifiableList;
                            }
                        }
                        return ((rc6) ex6Var2.getValue()).b();
                    }
                    i.m("Check failed.");
                    return null;
            }
        }
    });
    public final ex6 f = new ex6(new on2(this) { // from class: sc6
        public final /* synthetic */ tc6 B;

        {
            this.B = this;
        }

        @Override // defpackage.on2
        public final Object c() {
            List b;
            rc6 rc6Var;
            long j;
            rc6 rc6Var2;
            rc6 rc6Var3;
            int i = r2;
            int i2 = 0;
            tc6 tc6Var = this.B;
            switch (i) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (di7 di7Var : tc6Var.a) {
                        boolean z = tc6Var.b;
                        di7Var.getClass();
                        if (z) {
                            rc6Var = di7Var.o;
                        } else {
                            rc6Var = di7Var.p;
                        }
                        rc6Var.getClass();
                        arrayList.add(rc6Var);
                        zi7 zi7Var = di7Var.h;
                        zi7Var.getClass();
                        arrayList2.add(zi7Var);
                    }
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            if (((rc6) obj).g.c == 5) {
                                if (kj2.G()) {
                                    Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                }
                                return zt1.A;
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    xx xxVar = vr6.a;
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size2) {
                            Object obj2 = arrayList.get(i4);
                            i4++;
                            rc6 rc6Var4 = (rc6) obj2;
                            if (rc6Var4.g.b.A.containsKey(xxVar) && rc6Var4.b().size() != 1) {
                                if (kj2.G()) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + rc6Var4.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                    return linkedHashMap;
                                }
                                return linkedHashMap;
                            } else if (rc6Var4.g.b.A.containsKey(xxVar)) {
                                int size3 = arrayList.size();
                                int i5 = 0;
                                int i6 = 0;
                                while (i6 < size3) {
                                    Object obj3 = arrayList.get(i6);
                                    i6++;
                                    rc6 rc6Var5 = (rc6) obj3;
                                    if (((zi7) arrayList3.get(i5)).x() == bj7.METERING_REPEATING) {
                                        rc6Var5.b().getClass();
                                        np2.A("MeteringRepeating should contain a surface", !b.isEmpty());
                                        linkedHashMap.put(rc6Var5.b().get(0), 1L);
                                    } else if (rc6Var5.g.b.A.containsKey(xxVar)) {
                                        List b2 = rc6Var5.b();
                                        b2.getClass();
                                        if (!b2.isEmpty()) {
                                            Object obj4 = rc6Var5.b().get(0);
                                            Object e = rc6Var5.g.b.e(xxVar);
                                            e.getClass();
                                            linkedHashMap.put(obj4, e);
                                        }
                                    }
                                    i5++;
                                }
                            }
                        }
                    }
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    }
                    return linkedHashMap;
                case 1:
                    Collection<di7> collection = tc6Var.a;
                    ArrayList arrayList4 = new ArrayList(ht0.v0(collection, 10));
                    for (di7 di7Var2 : collection) {
                        boolean z2 = tc6Var.b;
                        di7Var2.getClass();
                        if (z2) {
                            rc6Var2 = di7Var2.o;
                        } else {
                            rc6Var2 = di7Var2.p;
                        }
                        rc6Var2.getClass();
                        arrayList4.add(rc6Var2);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    int size4 = arrayList4.size();
                    while (i2 < size4) {
                        Object obj5 = arrayList4.get(i2);
                        i2++;
                        rc6 rc6Var6 = (rc6) obj5;
                        List<ig1> b3 = rc6Var6.b();
                        ek0 ek0Var = rc6Var6.g;
                        for (ig1 ig1Var : b3) {
                            go4 go4Var = ek0Var.b;
                            xx xxVar2 = kd0.g0;
                            if (go4Var.A.containsKey(xxVar2) && go4Var.e(xxVar2) != null) {
                                Object e2 = go4Var.e(xxVar2);
                                e2.getClass();
                                linkedHashMap2.put(ig1Var, e2);
                            } else {
                                if (nb3.k(ig1Var.j, MediaCodec.class)) {
                                    j = 1;
                                } else {
                                    j = 0;
                                }
                                linkedHashMap2.put(ig1Var, Long.valueOf(j));
                            }
                        }
                    }
                    return linkedHashMap2;
                case 2:
                    pc6 pc6Var = new pc6();
                    for (di7 di7Var3 : tc6Var.a) {
                        boolean z3 = tc6Var.b;
                        di7Var3.getClass();
                        if (z3) {
                            rc6Var3 = di7Var3.o;
                        } else {
                            rc6Var3 = di7Var3.p;
                        }
                        rc6Var3.getClass();
                        pc6Var.a(rc6Var3);
                    }
                    return pc6Var;
                case 3:
                    ex6 ex6Var = tc6Var.e;
                    if (((pc6) ex6Var.getValue()).c()) {
                        return ((pc6) ex6Var.getValue()).b();
                    }
                    i.m("Check failed.");
                    return null;
                default:
                    ex6 ex6Var2 = tc6Var.f;
                    if (((pc6) tc6Var.e.getValue()).c()) {
                        wy wyVar = ((rc6) ex6Var2.getValue()).b;
                        if (wyVar != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List b4 = ((rc6) ex6Var2.getValue()).b();
                            b4.getClass();
                            arrayList5.addAll(b4);
                            ig1 ig1Var2 = wyVar.a;
                            ig1Var2.getClass();
                            arrayList5.add(ig1Var2);
                            List unmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (unmodifiableList != null) {
                                return unmodifiableList;
                            }
                        }
                        return ((rc6) ex6Var2.getValue()).b();
                    }
                    i.m("Check failed.");
                    return null;
            }
        }
    });
    public final ex6 g = new ex6(new on2(this) { // from class: sc6
        public final /* synthetic */ tc6 B;

        {
            this.B = this;
        }

        @Override // defpackage.on2
        public final Object c() {
            List b;
            rc6 rc6Var;
            long j;
            rc6 rc6Var2;
            rc6 rc6Var3;
            int i = r2;
            int i2 = 0;
            tc6 tc6Var = this.B;
            switch (i) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (di7 di7Var : tc6Var.a) {
                        boolean z = tc6Var.b;
                        di7Var.getClass();
                        if (z) {
                            rc6Var = di7Var.o;
                        } else {
                            rc6Var = di7Var.p;
                        }
                        rc6Var.getClass();
                        arrayList.add(rc6Var);
                        zi7 zi7Var = di7Var.h;
                        zi7Var.getClass();
                        arrayList2.add(zi7Var);
                    }
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            if (((rc6) obj).g.c == 5) {
                                if (kj2.G()) {
                                    Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                }
                                return zt1.A;
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    xx xxVar = vr6.a;
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size2) {
                            Object obj2 = arrayList.get(i4);
                            i4++;
                            rc6 rc6Var4 = (rc6) obj2;
                            if (rc6Var4.g.b.A.containsKey(xxVar) && rc6Var4.b().size() != 1) {
                                if (kj2.G()) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + rc6Var4.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                    return linkedHashMap;
                                }
                                return linkedHashMap;
                            } else if (rc6Var4.g.b.A.containsKey(xxVar)) {
                                int size3 = arrayList.size();
                                int i5 = 0;
                                int i6 = 0;
                                while (i6 < size3) {
                                    Object obj3 = arrayList.get(i6);
                                    i6++;
                                    rc6 rc6Var5 = (rc6) obj3;
                                    if (((zi7) arrayList3.get(i5)).x() == bj7.METERING_REPEATING) {
                                        rc6Var5.b().getClass();
                                        np2.A("MeteringRepeating should contain a surface", !b.isEmpty());
                                        linkedHashMap.put(rc6Var5.b().get(0), 1L);
                                    } else if (rc6Var5.g.b.A.containsKey(xxVar)) {
                                        List b2 = rc6Var5.b();
                                        b2.getClass();
                                        if (!b2.isEmpty()) {
                                            Object obj4 = rc6Var5.b().get(0);
                                            Object e = rc6Var5.g.b.e(xxVar);
                                            e.getClass();
                                            linkedHashMap.put(obj4, e);
                                        }
                                    }
                                    i5++;
                                }
                            }
                        }
                    }
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    }
                    return linkedHashMap;
                case 1:
                    Collection<di7> collection = tc6Var.a;
                    ArrayList arrayList4 = new ArrayList(ht0.v0(collection, 10));
                    for (di7 di7Var2 : collection) {
                        boolean z2 = tc6Var.b;
                        di7Var2.getClass();
                        if (z2) {
                            rc6Var2 = di7Var2.o;
                        } else {
                            rc6Var2 = di7Var2.p;
                        }
                        rc6Var2.getClass();
                        arrayList4.add(rc6Var2);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    int size4 = arrayList4.size();
                    while (i2 < size4) {
                        Object obj5 = arrayList4.get(i2);
                        i2++;
                        rc6 rc6Var6 = (rc6) obj5;
                        List<ig1> b3 = rc6Var6.b();
                        ek0 ek0Var = rc6Var6.g;
                        for (ig1 ig1Var : b3) {
                            go4 go4Var = ek0Var.b;
                            xx xxVar2 = kd0.g0;
                            if (go4Var.A.containsKey(xxVar2) && go4Var.e(xxVar2) != null) {
                                Object e2 = go4Var.e(xxVar2);
                                e2.getClass();
                                linkedHashMap2.put(ig1Var, e2);
                            } else {
                                if (nb3.k(ig1Var.j, MediaCodec.class)) {
                                    j = 1;
                                } else {
                                    j = 0;
                                }
                                linkedHashMap2.put(ig1Var, Long.valueOf(j));
                            }
                        }
                    }
                    return linkedHashMap2;
                case 2:
                    pc6 pc6Var = new pc6();
                    for (di7 di7Var3 : tc6Var.a) {
                        boolean z3 = tc6Var.b;
                        di7Var3.getClass();
                        if (z3) {
                            rc6Var3 = di7Var3.o;
                        } else {
                            rc6Var3 = di7Var3.p;
                        }
                        rc6Var3.getClass();
                        pc6Var.a(rc6Var3);
                    }
                    return pc6Var;
                case 3:
                    ex6 ex6Var = tc6Var.e;
                    if (((pc6) ex6Var.getValue()).c()) {
                        return ((pc6) ex6Var.getValue()).b();
                    }
                    i.m("Check failed.");
                    return null;
                default:
                    ex6 ex6Var2 = tc6Var.f;
                    if (((pc6) tc6Var.e.getValue()).c()) {
                        wy wyVar = ((rc6) ex6Var2.getValue()).b;
                        if (wyVar != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List b4 = ((rc6) ex6Var2.getValue()).b();
                            b4.getClass();
                            arrayList5.addAll(b4);
                            ig1 ig1Var2 = wyVar.a;
                            ig1Var2.getClass();
                            arrayList5.add(ig1Var2);
                            List unmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (unmodifiableList != null) {
                                return unmodifiableList;
                            }
                        }
                        return ((rc6) ex6Var2.getValue()).b();
                    }
                    i.m("Check failed.");
                    return null;
            }
        }
    });

    public tc6(Collection collection, boolean z) {
        this.a = collection;
        this.b = z;
    }

    public final void a(ig1 ig1Var) {
        Object obj;
        rc6 rc6Var;
        rc6 rc6Var2;
        ig1Var.getClass();
        if (kj2.F("CXCP")) {
            Log.d("CXCP", "Unavailable " + ig1Var + ", notify SessionConfig invalid");
        }
        Iterator it = this.a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                di7 di7Var = (di7) obj;
                di7Var.getClass();
                if (this.b) {
                    rc6Var2 = di7Var.o;
                } else {
                    rc6Var2 = di7Var.p;
                }
                rc6Var2.getClass();
                if (rc6Var2.b().contains(ig1Var)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        di7 di7Var2 = (di7) obj;
        if (di7Var2 != null) {
            rc6Var = di7Var2.o;
        } else {
            rc6Var = null;
        }
        xe1 xe1Var = xk1.a;
        hv.L(g04.i(e04.a.Y), null, null, new y3(rc6Var, (r41) null, 15), 3);
    }
}

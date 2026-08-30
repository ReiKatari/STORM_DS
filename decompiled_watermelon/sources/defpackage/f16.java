package defpackage;

import android.media.MediaCodec;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f16  reason: default package */
/* loaded from: classes.dex */
public final class f16 {
    public final Collection a;
    public final boolean b;
    public final il6 c = new il6(new ki2(this) { // from class: e16
        public final /* synthetic */ f16 B;

        {
            this.B = this;
        }

        @Override // defpackage.ki2
        public final Object c() {
            List b;
            d16 d16Var;
            long j;
            d16 d16Var2;
            d16 d16Var3;
            int i = r2;
            int i2 = 0;
            f16 f16Var = this.B;
            switch (i) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (f47 f47Var : f16Var.a) {
                        boolean z = f16Var.b;
                        f47Var.getClass();
                        if (z) {
                            d16Var = f47Var.o;
                        } else {
                            d16Var = f47Var.p;
                        }
                        d16Var.getClass();
                        arrayList.add(d16Var);
                        b57 b57Var = f47Var.h;
                        b57Var.getClass();
                        arrayList2.add(b57Var);
                    }
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            if (((d16) obj).g.c == 5) {
                                if (ve2.E()) {
                                    Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                }
                                return qp1.A;
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    uw uwVar = eg6.a;
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size2) {
                            Object obj2 = arrayList.get(i4);
                            i4++;
                            d16 d16Var4 = (d16) obj2;
                            if (d16Var4.g.b.A.containsKey(uwVar) && d16Var4.b().size() != 1) {
                                if (ve2.E()) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + d16Var4.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                    return linkedHashMap;
                                }
                                return linkedHashMap;
                            } else if (d16Var4.g.b.A.containsKey(uwVar)) {
                                int size3 = arrayList.size();
                                int i5 = 0;
                                int i6 = 0;
                                while (i6 < size3) {
                                    Object obj3 = arrayList.get(i6);
                                    i6++;
                                    d16 d16Var5 = (d16) obj3;
                                    if (((b57) arrayList3.get(i5)).n() == d57.METERING_REPEATING) {
                                        d16Var5.b().getClass();
                                        nl2.D("MeteringRepeating should contain a surface", !b.isEmpty());
                                        linkedHashMap.put(d16Var5.b().get(0), 1L);
                                    } else if (d16Var5.g.b.A.containsKey(uwVar)) {
                                        List b2 = d16Var5.b();
                                        b2.getClass();
                                        if (!b2.isEmpty()) {
                                            Object obj4 = d16Var5.b().get(0);
                                            Object g = d16Var5.g.b.g(uwVar);
                                            g.getClass();
                                            linkedHashMap.put(obj4, g);
                                        }
                                    }
                                    i5++;
                                }
                            }
                        }
                    }
                    if (ve2.D("CXCP")) {
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    }
                    return linkedHashMap;
                case 1:
                    Collection<f47> collection = f16Var.a;
                    ArrayList arrayList4 = new ArrayList(uq0.y0(collection, 10));
                    for (f47 f47Var2 : collection) {
                        boolean z2 = f16Var.b;
                        f47Var2.getClass();
                        if (z2) {
                            d16Var2 = f47Var2.o;
                        } else {
                            d16Var2 = f47Var2.p;
                        }
                        d16Var2.getClass();
                        arrayList4.add(d16Var2);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    int size4 = arrayList4.size();
                    while (i2 < size4) {
                        Object obj5 = arrayList4.get(i2);
                        i2++;
                        d16 d16Var6 = (d16) obj5;
                        List<hc1> b3 = d16Var6.b();
                        wh0 wh0Var = d16Var6.g;
                        for (hc1 hc1Var : b3) {
                            ef4 ef4Var = wh0Var.b;
                            uw uwVar2 = cb0.f0;
                            if (ef4Var.A.containsKey(uwVar2) && ef4Var.g(uwVar2) != null) {
                                Object g2 = ef4Var.g(uwVar2);
                                g2.getClass();
                                linkedHashMap2.put(hc1Var, g2);
                            } else {
                                if (b53.x(hc1Var.j, MediaCodec.class)) {
                                    j = 1;
                                } else {
                                    j = 0;
                                }
                                linkedHashMap2.put(hc1Var, Long.valueOf(j));
                            }
                        }
                    }
                    return linkedHashMap2;
                case 2:
                    b16 b16Var = new b16();
                    for (f47 f47Var3 : f16Var.a) {
                        boolean z3 = f16Var.b;
                        f47Var3.getClass();
                        if (z3) {
                            d16Var3 = f47Var3.o;
                        } else {
                            d16Var3 = f47Var3.p;
                        }
                        d16Var3.getClass();
                        b16Var.a(d16Var3);
                    }
                    return b16Var;
                case 3:
                    il6 il6Var = f16Var.e;
                    if (((b16) il6Var.getValue()).c()) {
                        return ((b16) il6Var.getValue()).b();
                    }
                    i.n("Check failed.");
                    return null;
                default:
                    il6 il6Var2 = f16Var.f;
                    if (((b16) f16Var.e.getValue()).c()) {
                        hx hxVar = ((d16) il6Var2.getValue()).b;
                        if (hxVar != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List b4 = ((d16) il6Var2.getValue()).b();
                            b4.getClass();
                            arrayList5.addAll(b4);
                            hc1 hc1Var2 = hxVar.a;
                            hc1Var2.getClass();
                            arrayList5.add(hc1Var2);
                            List unmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (unmodifiableList != null) {
                                return unmodifiableList;
                            }
                        }
                        return ((d16) il6Var2.getValue()).b();
                    }
                    i.n("Check failed.");
                    return null;
            }
        }
    });
    public final il6 d = new il6(new ki2(this) { // from class: e16
        public final /* synthetic */ f16 B;

        {
            this.B = this;
        }

        @Override // defpackage.ki2
        public final Object c() {
            List b;
            d16 d16Var;
            long j;
            d16 d16Var2;
            d16 d16Var3;
            int i = r2;
            int i2 = 0;
            f16 f16Var = this.B;
            switch (i) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (f47 f47Var : f16Var.a) {
                        boolean z = f16Var.b;
                        f47Var.getClass();
                        if (z) {
                            d16Var = f47Var.o;
                        } else {
                            d16Var = f47Var.p;
                        }
                        d16Var.getClass();
                        arrayList.add(d16Var);
                        b57 b57Var = f47Var.h;
                        b57Var.getClass();
                        arrayList2.add(b57Var);
                    }
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            if (((d16) obj).g.c == 5) {
                                if (ve2.E()) {
                                    Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                }
                                return qp1.A;
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    uw uwVar = eg6.a;
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size2) {
                            Object obj2 = arrayList.get(i4);
                            i4++;
                            d16 d16Var4 = (d16) obj2;
                            if (d16Var4.g.b.A.containsKey(uwVar) && d16Var4.b().size() != 1) {
                                if (ve2.E()) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + d16Var4.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                    return linkedHashMap;
                                }
                                return linkedHashMap;
                            } else if (d16Var4.g.b.A.containsKey(uwVar)) {
                                int size3 = arrayList.size();
                                int i5 = 0;
                                int i6 = 0;
                                while (i6 < size3) {
                                    Object obj3 = arrayList.get(i6);
                                    i6++;
                                    d16 d16Var5 = (d16) obj3;
                                    if (((b57) arrayList3.get(i5)).n() == d57.METERING_REPEATING) {
                                        d16Var5.b().getClass();
                                        nl2.D("MeteringRepeating should contain a surface", !b.isEmpty());
                                        linkedHashMap.put(d16Var5.b().get(0), 1L);
                                    } else if (d16Var5.g.b.A.containsKey(uwVar)) {
                                        List b2 = d16Var5.b();
                                        b2.getClass();
                                        if (!b2.isEmpty()) {
                                            Object obj4 = d16Var5.b().get(0);
                                            Object g = d16Var5.g.b.g(uwVar);
                                            g.getClass();
                                            linkedHashMap.put(obj4, g);
                                        }
                                    }
                                    i5++;
                                }
                            }
                        }
                    }
                    if (ve2.D("CXCP")) {
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    }
                    return linkedHashMap;
                case 1:
                    Collection<f47> collection = f16Var.a;
                    ArrayList arrayList4 = new ArrayList(uq0.y0(collection, 10));
                    for (f47 f47Var2 : collection) {
                        boolean z2 = f16Var.b;
                        f47Var2.getClass();
                        if (z2) {
                            d16Var2 = f47Var2.o;
                        } else {
                            d16Var2 = f47Var2.p;
                        }
                        d16Var2.getClass();
                        arrayList4.add(d16Var2);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    int size4 = arrayList4.size();
                    while (i2 < size4) {
                        Object obj5 = arrayList4.get(i2);
                        i2++;
                        d16 d16Var6 = (d16) obj5;
                        List<hc1> b3 = d16Var6.b();
                        wh0 wh0Var = d16Var6.g;
                        for (hc1 hc1Var : b3) {
                            ef4 ef4Var = wh0Var.b;
                            uw uwVar2 = cb0.f0;
                            if (ef4Var.A.containsKey(uwVar2) && ef4Var.g(uwVar2) != null) {
                                Object g2 = ef4Var.g(uwVar2);
                                g2.getClass();
                                linkedHashMap2.put(hc1Var, g2);
                            } else {
                                if (b53.x(hc1Var.j, MediaCodec.class)) {
                                    j = 1;
                                } else {
                                    j = 0;
                                }
                                linkedHashMap2.put(hc1Var, Long.valueOf(j));
                            }
                        }
                    }
                    return linkedHashMap2;
                case 2:
                    b16 b16Var = new b16();
                    for (f47 f47Var3 : f16Var.a) {
                        boolean z3 = f16Var.b;
                        f47Var3.getClass();
                        if (z3) {
                            d16Var3 = f47Var3.o;
                        } else {
                            d16Var3 = f47Var3.p;
                        }
                        d16Var3.getClass();
                        b16Var.a(d16Var3);
                    }
                    return b16Var;
                case 3:
                    il6 il6Var = f16Var.e;
                    if (((b16) il6Var.getValue()).c()) {
                        return ((b16) il6Var.getValue()).b();
                    }
                    i.n("Check failed.");
                    return null;
                default:
                    il6 il6Var2 = f16Var.f;
                    if (((b16) f16Var.e.getValue()).c()) {
                        hx hxVar = ((d16) il6Var2.getValue()).b;
                        if (hxVar != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List b4 = ((d16) il6Var2.getValue()).b();
                            b4.getClass();
                            arrayList5.addAll(b4);
                            hc1 hc1Var2 = hxVar.a;
                            hc1Var2.getClass();
                            arrayList5.add(hc1Var2);
                            List unmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (unmodifiableList != null) {
                                return unmodifiableList;
                            }
                        }
                        return ((d16) il6Var2.getValue()).b();
                    }
                    i.n("Check failed.");
                    return null;
            }
        }
    });
    public final il6 e = new il6(new ki2(this) { // from class: e16
        public final /* synthetic */ f16 B;

        {
            this.B = this;
        }

        @Override // defpackage.ki2
        public final Object c() {
            List b;
            d16 d16Var;
            long j;
            d16 d16Var2;
            d16 d16Var3;
            int i = r2;
            int i2 = 0;
            f16 f16Var = this.B;
            switch (i) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (f47 f47Var : f16Var.a) {
                        boolean z = f16Var.b;
                        f47Var.getClass();
                        if (z) {
                            d16Var = f47Var.o;
                        } else {
                            d16Var = f47Var.p;
                        }
                        d16Var.getClass();
                        arrayList.add(d16Var);
                        b57 b57Var = f47Var.h;
                        b57Var.getClass();
                        arrayList2.add(b57Var);
                    }
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            if (((d16) obj).g.c == 5) {
                                if (ve2.E()) {
                                    Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                }
                                return qp1.A;
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    uw uwVar = eg6.a;
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size2) {
                            Object obj2 = arrayList.get(i4);
                            i4++;
                            d16 d16Var4 = (d16) obj2;
                            if (d16Var4.g.b.A.containsKey(uwVar) && d16Var4.b().size() != 1) {
                                if (ve2.E()) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + d16Var4.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                    return linkedHashMap;
                                }
                                return linkedHashMap;
                            } else if (d16Var4.g.b.A.containsKey(uwVar)) {
                                int size3 = arrayList.size();
                                int i5 = 0;
                                int i6 = 0;
                                while (i6 < size3) {
                                    Object obj3 = arrayList.get(i6);
                                    i6++;
                                    d16 d16Var5 = (d16) obj3;
                                    if (((b57) arrayList3.get(i5)).n() == d57.METERING_REPEATING) {
                                        d16Var5.b().getClass();
                                        nl2.D("MeteringRepeating should contain a surface", !b.isEmpty());
                                        linkedHashMap.put(d16Var5.b().get(0), 1L);
                                    } else if (d16Var5.g.b.A.containsKey(uwVar)) {
                                        List b2 = d16Var5.b();
                                        b2.getClass();
                                        if (!b2.isEmpty()) {
                                            Object obj4 = d16Var5.b().get(0);
                                            Object g = d16Var5.g.b.g(uwVar);
                                            g.getClass();
                                            linkedHashMap.put(obj4, g);
                                        }
                                    }
                                    i5++;
                                }
                            }
                        }
                    }
                    if (ve2.D("CXCP")) {
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    }
                    return linkedHashMap;
                case 1:
                    Collection<f47> collection = f16Var.a;
                    ArrayList arrayList4 = new ArrayList(uq0.y0(collection, 10));
                    for (f47 f47Var2 : collection) {
                        boolean z2 = f16Var.b;
                        f47Var2.getClass();
                        if (z2) {
                            d16Var2 = f47Var2.o;
                        } else {
                            d16Var2 = f47Var2.p;
                        }
                        d16Var2.getClass();
                        arrayList4.add(d16Var2);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    int size4 = arrayList4.size();
                    while (i2 < size4) {
                        Object obj5 = arrayList4.get(i2);
                        i2++;
                        d16 d16Var6 = (d16) obj5;
                        List<hc1> b3 = d16Var6.b();
                        wh0 wh0Var = d16Var6.g;
                        for (hc1 hc1Var : b3) {
                            ef4 ef4Var = wh0Var.b;
                            uw uwVar2 = cb0.f0;
                            if (ef4Var.A.containsKey(uwVar2) && ef4Var.g(uwVar2) != null) {
                                Object g2 = ef4Var.g(uwVar2);
                                g2.getClass();
                                linkedHashMap2.put(hc1Var, g2);
                            } else {
                                if (b53.x(hc1Var.j, MediaCodec.class)) {
                                    j = 1;
                                } else {
                                    j = 0;
                                }
                                linkedHashMap2.put(hc1Var, Long.valueOf(j));
                            }
                        }
                    }
                    return linkedHashMap2;
                case 2:
                    b16 b16Var = new b16();
                    for (f47 f47Var3 : f16Var.a) {
                        boolean z3 = f16Var.b;
                        f47Var3.getClass();
                        if (z3) {
                            d16Var3 = f47Var3.o;
                        } else {
                            d16Var3 = f47Var3.p;
                        }
                        d16Var3.getClass();
                        b16Var.a(d16Var3);
                    }
                    return b16Var;
                case 3:
                    il6 il6Var = f16Var.e;
                    if (((b16) il6Var.getValue()).c()) {
                        return ((b16) il6Var.getValue()).b();
                    }
                    i.n("Check failed.");
                    return null;
                default:
                    il6 il6Var2 = f16Var.f;
                    if (((b16) f16Var.e.getValue()).c()) {
                        hx hxVar = ((d16) il6Var2.getValue()).b;
                        if (hxVar != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List b4 = ((d16) il6Var2.getValue()).b();
                            b4.getClass();
                            arrayList5.addAll(b4);
                            hc1 hc1Var2 = hxVar.a;
                            hc1Var2.getClass();
                            arrayList5.add(hc1Var2);
                            List unmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (unmodifiableList != null) {
                                return unmodifiableList;
                            }
                        }
                        return ((d16) il6Var2.getValue()).b();
                    }
                    i.n("Check failed.");
                    return null;
            }
        }
    });
    public final il6 f = new il6(new ki2(this) { // from class: e16
        public final /* synthetic */ f16 B;

        {
            this.B = this;
        }

        @Override // defpackage.ki2
        public final Object c() {
            List b;
            d16 d16Var;
            long j;
            d16 d16Var2;
            d16 d16Var3;
            int i = r2;
            int i2 = 0;
            f16 f16Var = this.B;
            switch (i) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (f47 f47Var : f16Var.a) {
                        boolean z = f16Var.b;
                        f47Var.getClass();
                        if (z) {
                            d16Var = f47Var.o;
                        } else {
                            d16Var = f47Var.p;
                        }
                        d16Var.getClass();
                        arrayList.add(d16Var);
                        b57 b57Var = f47Var.h;
                        b57Var.getClass();
                        arrayList2.add(b57Var);
                    }
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            if (((d16) obj).g.c == 5) {
                                if (ve2.E()) {
                                    Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                }
                                return qp1.A;
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    uw uwVar = eg6.a;
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size2) {
                            Object obj2 = arrayList.get(i4);
                            i4++;
                            d16 d16Var4 = (d16) obj2;
                            if (d16Var4.g.b.A.containsKey(uwVar) && d16Var4.b().size() != 1) {
                                if (ve2.E()) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + d16Var4.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                    return linkedHashMap;
                                }
                                return linkedHashMap;
                            } else if (d16Var4.g.b.A.containsKey(uwVar)) {
                                int size3 = arrayList.size();
                                int i5 = 0;
                                int i6 = 0;
                                while (i6 < size3) {
                                    Object obj3 = arrayList.get(i6);
                                    i6++;
                                    d16 d16Var5 = (d16) obj3;
                                    if (((b57) arrayList3.get(i5)).n() == d57.METERING_REPEATING) {
                                        d16Var5.b().getClass();
                                        nl2.D("MeteringRepeating should contain a surface", !b.isEmpty());
                                        linkedHashMap.put(d16Var5.b().get(0), 1L);
                                    } else if (d16Var5.g.b.A.containsKey(uwVar)) {
                                        List b2 = d16Var5.b();
                                        b2.getClass();
                                        if (!b2.isEmpty()) {
                                            Object obj4 = d16Var5.b().get(0);
                                            Object g = d16Var5.g.b.g(uwVar);
                                            g.getClass();
                                            linkedHashMap.put(obj4, g);
                                        }
                                    }
                                    i5++;
                                }
                            }
                        }
                    }
                    if (ve2.D("CXCP")) {
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    }
                    return linkedHashMap;
                case 1:
                    Collection<f47> collection = f16Var.a;
                    ArrayList arrayList4 = new ArrayList(uq0.y0(collection, 10));
                    for (f47 f47Var2 : collection) {
                        boolean z2 = f16Var.b;
                        f47Var2.getClass();
                        if (z2) {
                            d16Var2 = f47Var2.o;
                        } else {
                            d16Var2 = f47Var2.p;
                        }
                        d16Var2.getClass();
                        arrayList4.add(d16Var2);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    int size4 = arrayList4.size();
                    while (i2 < size4) {
                        Object obj5 = arrayList4.get(i2);
                        i2++;
                        d16 d16Var6 = (d16) obj5;
                        List<hc1> b3 = d16Var6.b();
                        wh0 wh0Var = d16Var6.g;
                        for (hc1 hc1Var : b3) {
                            ef4 ef4Var = wh0Var.b;
                            uw uwVar2 = cb0.f0;
                            if (ef4Var.A.containsKey(uwVar2) && ef4Var.g(uwVar2) != null) {
                                Object g2 = ef4Var.g(uwVar2);
                                g2.getClass();
                                linkedHashMap2.put(hc1Var, g2);
                            } else {
                                if (b53.x(hc1Var.j, MediaCodec.class)) {
                                    j = 1;
                                } else {
                                    j = 0;
                                }
                                linkedHashMap2.put(hc1Var, Long.valueOf(j));
                            }
                        }
                    }
                    return linkedHashMap2;
                case 2:
                    b16 b16Var = new b16();
                    for (f47 f47Var3 : f16Var.a) {
                        boolean z3 = f16Var.b;
                        f47Var3.getClass();
                        if (z3) {
                            d16Var3 = f47Var3.o;
                        } else {
                            d16Var3 = f47Var3.p;
                        }
                        d16Var3.getClass();
                        b16Var.a(d16Var3);
                    }
                    return b16Var;
                case 3:
                    il6 il6Var = f16Var.e;
                    if (((b16) il6Var.getValue()).c()) {
                        return ((b16) il6Var.getValue()).b();
                    }
                    i.n("Check failed.");
                    return null;
                default:
                    il6 il6Var2 = f16Var.f;
                    if (((b16) f16Var.e.getValue()).c()) {
                        hx hxVar = ((d16) il6Var2.getValue()).b;
                        if (hxVar != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List b4 = ((d16) il6Var2.getValue()).b();
                            b4.getClass();
                            arrayList5.addAll(b4);
                            hc1 hc1Var2 = hxVar.a;
                            hc1Var2.getClass();
                            arrayList5.add(hc1Var2);
                            List unmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (unmodifiableList != null) {
                                return unmodifiableList;
                            }
                        }
                        return ((d16) il6Var2.getValue()).b();
                    }
                    i.n("Check failed.");
                    return null;
            }
        }
    });
    public final il6 g = new il6(new ki2(this) { // from class: e16
        public final /* synthetic */ f16 B;

        {
            this.B = this;
        }

        @Override // defpackage.ki2
        public final Object c() {
            List b;
            d16 d16Var;
            long j;
            d16 d16Var2;
            d16 d16Var3;
            int i = r2;
            int i2 = 0;
            f16 f16Var = this.B;
            switch (i) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (f47 f47Var : f16Var.a) {
                        boolean z = f16Var.b;
                        f47Var.getClass();
                        if (z) {
                            d16Var = f47Var.o;
                        } else {
                            d16Var = f47Var.p;
                        }
                        d16Var.getClass();
                        arrayList.add(d16Var);
                        b57 b57Var = f47Var.h;
                        b57Var.getClass();
                        arrayList2.add(b57Var);
                    }
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            if (((d16) obj).g.c == 5) {
                                if (ve2.E()) {
                                    Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                }
                                return qp1.A;
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    uw uwVar = eg6.a;
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size2) {
                            Object obj2 = arrayList.get(i4);
                            i4++;
                            d16 d16Var4 = (d16) obj2;
                            if (d16Var4.g.b.A.containsKey(uwVar) && d16Var4.b().size() != 1) {
                                if (ve2.E()) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + d16Var4.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                    return linkedHashMap;
                                }
                                return linkedHashMap;
                            } else if (d16Var4.g.b.A.containsKey(uwVar)) {
                                int size3 = arrayList.size();
                                int i5 = 0;
                                int i6 = 0;
                                while (i6 < size3) {
                                    Object obj3 = arrayList.get(i6);
                                    i6++;
                                    d16 d16Var5 = (d16) obj3;
                                    if (((b57) arrayList3.get(i5)).n() == d57.METERING_REPEATING) {
                                        d16Var5.b().getClass();
                                        nl2.D("MeteringRepeating should contain a surface", !b.isEmpty());
                                        linkedHashMap.put(d16Var5.b().get(0), 1L);
                                    } else if (d16Var5.g.b.A.containsKey(uwVar)) {
                                        List b2 = d16Var5.b();
                                        b2.getClass();
                                        if (!b2.isEmpty()) {
                                            Object obj4 = d16Var5.b().get(0);
                                            Object g = d16Var5.g.b.g(uwVar);
                                            g.getClass();
                                            linkedHashMap.put(obj4, g);
                                        }
                                    }
                                    i5++;
                                }
                            }
                        }
                    }
                    if (ve2.D("CXCP")) {
                        Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        return linkedHashMap;
                    }
                    return linkedHashMap;
                case 1:
                    Collection<f47> collection = f16Var.a;
                    ArrayList arrayList4 = new ArrayList(uq0.y0(collection, 10));
                    for (f47 f47Var2 : collection) {
                        boolean z2 = f16Var.b;
                        f47Var2.getClass();
                        if (z2) {
                            d16Var2 = f47Var2.o;
                        } else {
                            d16Var2 = f47Var2.p;
                        }
                        d16Var2.getClass();
                        arrayList4.add(d16Var2);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    int size4 = arrayList4.size();
                    while (i2 < size4) {
                        Object obj5 = arrayList4.get(i2);
                        i2++;
                        d16 d16Var6 = (d16) obj5;
                        List<hc1> b3 = d16Var6.b();
                        wh0 wh0Var = d16Var6.g;
                        for (hc1 hc1Var : b3) {
                            ef4 ef4Var = wh0Var.b;
                            uw uwVar2 = cb0.f0;
                            if (ef4Var.A.containsKey(uwVar2) && ef4Var.g(uwVar2) != null) {
                                Object g2 = ef4Var.g(uwVar2);
                                g2.getClass();
                                linkedHashMap2.put(hc1Var, g2);
                            } else {
                                if (b53.x(hc1Var.j, MediaCodec.class)) {
                                    j = 1;
                                } else {
                                    j = 0;
                                }
                                linkedHashMap2.put(hc1Var, Long.valueOf(j));
                            }
                        }
                    }
                    return linkedHashMap2;
                case 2:
                    b16 b16Var = new b16();
                    for (f47 f47Var3 : f16Var.a) {
                        boolean z3 = f16Var.b;
                        f47Var3.getClass();
                        if (z3) {
                            d16Var3 = f47Var3.o;
                        } else {
                            d16Var3 = f47Var3.p;
                        }
                        d16Var3.getClass();
                        b16Var.a(d16Var3);
                    }
                    return b16Var;
                case 3:
                    il6 il6Var = f16Var.e;
                    if (((b16) il6Var.getValue()).c()) {
                        return ((b16) il6Var.getValue()).b();
                    }
                    i.n("Check failed.");
                    return null;
                default:
                    il6 il6Var2 = f16Var.f;
                    if (((b16) f16Var.e.getValue()).c()) {
                        hx hxVar = ((d16) il6Var2.getValue()).b;
                        if (hxVar != null) {
                            ArrayList arrayList5 = new ArrayList();
                            List b4 = ((d16) il6Var2.getValue()).b();
                            b4.getClass();
                            arrayList5.addAll(b4);
                            hc1 hc1Var2 = hxVar.a;
                            hc1Var2.getClass();
                            arrayList5.add(hc1Var2);
                            List unmodifiableList = Collections.unmodifiableList(arrayList5);
                            if (unmodifiableList != null) {
                                return unmodifiableList;
                            }
                        }
                        return ((d16) il6Var2.getValue()).b();
                    }
                    i.n("Check failed.");
                    return null;
            }
        }
    });

    public f16(Collection collection, boolean z) {
        this.a = collection;
        this.b = z;
    }

    public final void a(hc1 hc1Var) {
        Object obj;
        d16 d16Var;
        d16 d16Var2;
        hc1Var.getClass();
        if (ve2.D("CXCP")) {
            Log.d("CXCP", "Unavailable " + hc1Var + ", notify SessionConfig invalid");
        }
        Iterator it = this.a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                f47 f47Var = (f47) obj;
                f47Var.getClass();
                if (this.b) {
                    d16Var2 = f47Var.o;
                } else {
                    d16Var2 = f47Var.p;
                }
                d16Var2.getClass();
                if (d16Var2.b().contains(hc1Var)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        f47 f47Var2 = (f47) obj;
        if (f47Var2 != null) {
            d16Var = f47Var2.o;
        } else {
            d16Var = null;
        }
        bb1 bb1Var = tg1.a;
        tq5.w(iq2.c(bt3.a.Y), null, null, new x3(d16Var, (j11) null, 14), 3);
    }
}

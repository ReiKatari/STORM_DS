package j0;

import android.hardware.camera2.params.InputConfiguration;
import android.media.MediaCodec;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v1 extends q1 {

    /* renamed from: j  reason: collision with root package name */
    public final a0.m f7309j = new a0.m(4);

    /* renamed from: k  reason: collision with root package name */
    public boolean f7310k = true;

    /* renamed from: l  reason: collision with root package name */
    public final StringBuilder f7311l = new StringBuilder();
    public boolean m = false;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f7312n = new ArrayList();

    public final void a(w1 w1Var) {
        p0 p0Var = w1Var.f7322g;
        int i2 = p0Var.f7276c;
        d0.i1 i1Var = this.f7282b;
        if (i2 != -1) {
            this.m = true;
            int i10 = i1Var.A;
            List list = w1.f7315j;
            if (list.indexOf(Integer.valueOf(i2)) < list.indexOf(Integer.valueOf(i10))) {
                i2 = i10;
            }
            i1Var.A = i2;
        }
        Range a10 = p0Var.a();
        Range range = k.f7234h;
        boolean equals = a10.equals(range);
        StringBuilder sb2 = this.f7311l;
        if (!equals) {
            g gVar = p0.f7273j;
            boolean equals2 = ((Range) ((g1) i1Var.R).h(gVar, range)).equals(range);
            g1 g1Var = (g1) i1Var.R;
            if (equals2) {
                g1Var.o(gVar, a10);
            } else if (!((Range) g1Var.h(gVar, range)).equals(a10)) {
                this.f7310k = false;
                String str = "Different ExpectedFrameRateRange values; current = " + ((Range) ((g1) i1Var.R).h(gVar, range)) + ", new = " + a10;
                aj.g.s("ValidatingBuilder", str);
                sb2.append(str);
            }
        }
        int b10 = p0Var.b();
        if (b10 != 0) {
            i1Var.getClass();
            if (b10 != 0) {
                ((g1) i1Var.R).o(l2.O, Integer.valueOf(b10));
            }
        }
        int c4 = p0Var.c();
        if (c4 != 0) {
            i1Var.getClass();
            if (c4 != 0) {
                ((g1) i1Var.R).o(l2.P, Integer.valueOf(c4));
            }
        }
        h2 h2Var = p0Var.f7279f;
        HashSet hashSet = (HashSet) i1Var.L;
        ((h1) i1Var.Y).f7212a.putAll((Map) h2Var.f7212a);
        this.f7283c.addAll(w1Var.f7318c);
        this.f7284d.addAll(w1Var.f7319d);
        i1Var.d(p0Var.f7277d);
        this.f7285e.addAll(w1Var.f7320e);
        t1 t1Var = w1Var.f7321f;
        if (t1Var != null) {
            this.f7312n.add(t1Var);
        }
        InputConfiguration inputConfiguration = w1Var.f7324i;
        if (inputConfiguration != null) {
            this.f7287g = inputConfiguration;
        }
        ArrayList arrayList = w1Var.f7316a;
        LinkedHashSet<i> linkedHashSet = this.f7281a;
        linkedHashSet.addAll(arrayList);
        hashSet.addAll(Collections.unmodifiableList(p0Var.f7274a));
        ArrayList arrayList2 = new ArrayList();
        for (i iVar : linkedHashSet) {
            arrayList2.add(iVar.f7213a);
            for (u0 u0Var : iVar.f7214b) {
                arrayList2.add(u0Var);
            }
        }
        if (!arrayList2.containsAll(hashSet)) {
            aj.g.o("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.f7310k = false;
            sb2.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
        }
        int i11 = w1Var.f7323h;
        int i12 = this.f7288h;
        if (i11 != i12 && i11 != 0 && i12 != 0) {
            aj.g.o("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
            this.f7310k = false;
            sb2.append("Invalid configuration due to that two non-default session types are set");
        } else if (i11 != 0) {
            this.f7288h = i11;
        }
        i iVar2 = w1Var.f7317b;
        if (iVar2 != null) {
            i iVar3 = this.f7289i;
            if (iVar3 != iVar2 && iVar3 != null) {
                aj.g.o("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                this.f7310k = false;
                sb2.append("Invalid configuration due to that two different postview output configs are set");
            } else {
                this.f7289i = iVar2;
            }
        }
        i1Var.i(p0Var.f7275b);
    }

    public final w1 b() {
        if (this.f7310k) {
            ArrayList arrayList = new ArrayList(this.f7281a);
            a0.m mVar = this.f7309j;
            if (mVar.f11a) {
                Collections.sort(arrayList, new bc.a(2, mVar));
            }
            int i2 = this.f7288h;
            d0.p0 p0Var = null;
            d0.i1 i1Var = this.f7282b;
            if (i2 == 1) {
                i1Var.getClass();
                if (arrayList.size() == 2 && !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i10);
                        i10++;
                        u0 u0Var = ((i) obj).f7213a;
                        u0Var.getClass();
                        if (nc.k.a(u0Var.f7304j, MediaCodec.class)) {
                            HashSet hashSet = (HashSet) i1Var.L;
                            hashSet.getClass();
                            if (!hashSet.isEmpty()) {
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    u0 u0Var2 = (u0) it.next();
                                    u0Var2.getClass();
                                    if (nc.k.a(u0Var2.f7304j, MediaCodec.class)) {
                                        break;
                                    }
                                }
                            }
                            g gVar = p0.f7273j;
                            Range range = (Range) ((g1) i1Var.R).h(gVar, k.f7234h);
                            if (range != null) {
                                if (((Number) range.getUpper()).intValue() < 120 || !nc.k.a(range.getLower(), range.getUpper())) {
                                    range = null;
                                }
                                if (range != null) {
                                    Range range2 = new Range(30, range.getUpper());
                                    aj.g.o("HighSpeedFpsModifier", "Modified high-speed FPS range from " + range + " to " + range2);
                                    ((g1) i1Var.R).o(gVar, range2);
                                }
                            }
                        }
                    }
                }
            }
            if (!this.f7312n.isEmpty()) {
                p0Var = new d0.p0(2, this);
            }
            return new w1(arrayList, new ArrayList(this.f7283c), new ArrayList(this.f7284d), new ArrayList(this.f7285e), i1Var.j(), p0Var, this.f7287g, this.f7288h, this.f7289i);
        }
        a0.j.h("Unsupported session configuration combination");
        return null;
    }

    public final boolean c() {
        if (this.m && this.f7310k) {
            return true;
        }
        return false;
    }
}

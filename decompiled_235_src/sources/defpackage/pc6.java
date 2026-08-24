package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.media.MediaCodec;
import android.util.Range;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pc6  reason: default package */
/* loaded from: classes.dex */
public final class pc6 extends kc6 {
    public final q33 j;
    public boolean k;
    public final StringBuilder l;
    public boolean m;
    public final ArrayList n;

    /* JADX WARN: Type inference failed for: r0v0, types: [q33, java.lang.Object] */
    public pc6() {
        boolean z;
        ?? obj = new Object();
        if (ri1.a.b(SurfaceOrderQuirk.class) != null) {
            z = true;
        } else {
            z = false;
        }
        obj.A = z;
        this.j = obj;
        this.k = true;
        this.l = new StringBuilder();
        this.m = false;
        this.n = new ArrayList();
    }

    public final void a(rc6 rc6Var) {
        ek0 ek0Var = rc6Var.g;
        int i = ek0Var.c;
        go4 go4Var = ek0Var.b;
        dk0 dk0Var = this.b;
        if (i != -1) {
            this.m = true;
            int i2 = dk0Var.L;
            List list = rc6.j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            dk0Var.L = i;
        }
        Range a = ek0Var.a();
        Range range = yy.h;
        boolean equals = a.equals(range);
        StringBuilder sb = this.l;
        if (!equals) {
            xx xxVar = ek0.f;
            boolean equals2 = ((Range) ((da4) dk0Var.X).b(xxVar, range)).equals(range);
            da4 da4Var = (da4) dk0Var.X;
            if (equals2) {
                da4Var.m(xxVar, a);
            } else if (!((Range) da4Var.b(xxVar, range)).equals(a)) {
                this.k = false;
                String str = "Different ExpectedFrameRateRange values; current = " + ((Range) ((da4) dk0Var.X).b(xxVar, range)) + ", new = " + a;
                kj2.v("ValidatingBuilder", str);
                sb.append(str);
            }
        }
        xx xxVar2 = zi7.U;
        Integer num = (Integer) go4Var.b(xxVar2, 0);
        Objects.requireNonNull(num);
        int intValue = num.intValue();
        if (intValue != 0) {
            dk0Var.getClass();
            if (intValue != 0) {
                ((da4) dk0Var.X).m(xxVar2, num);
            }
        }
        xx xxVar3 = zi7.V;
        Integer num2 = (Integer) go4Var.b(xxVar3, 0);
        Objects.requireNonNull(num2);
        int intValue2 = num2.intValue();
        if (intValue2 != 0) {
            dk0Var.getClass();
            if (intValue2 != 0) {
                ((da4) dk0Var.X).m(xxVar3, num2);
            }
        }
        sy6 sy6Var = ek0Var.e;
        HashSet hashSet = (HashSet) dk0Var.R;
        ((sa4) dk0Var.Y).a.putAll((Map) sy6Var.a);
        this.c.addAll(rc6Var.c);
        this.d.addAll(rc6Var.d);
        dk0Var.c(ek0Var.d);
        this.e.addAll(rc6Var.e);
        nc6 nc6Var = rc6Var.f;
        if (nc6Var != null) {
            this.n.add(nc6Var);
        }
        InputConfiguration inputConfiguration = rc6Var.i;
        if (inputConfiguration != null) {
            this.g = inputConfiguration;
        }
        ArrayList arrayList = rc6Var.a;
        LinkedHashSet<wy> linkedHashSet = this.a;
        linkedHashSet.addAll(arrayList);
        hashSet.addAll(Collections.unmodifiableList(ek0Var.a));
        ArrayList arrayList2 = new ArrayList();
        for (wy wyVar : linkedHashSet) {
            arrayList2.add(wyVar.a);
            for (ig1 ig1Var : wyVar.b) {
                arrayList2.add(ig1Var);
            }
        }
        if (!arrayList2.containsAll(hashSet)) {
            kj2.t("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.k = false;
            sb.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
        }
        int i3 = rc6Var.h;
        int i4 = this.h;
        if (i3 != i4 && i3 != 0 && i4 != 0) {
            kj2.t("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
            this.k = false;
            sb.append("Invalid configuration due to that two non-default session types are set");
        } else if (i3 != 0) {
            this.h = i3;
        }
        wy wyVar2 = rc6Var.b;
        if (wyVar2 != null) {
            wy wyVar3 = this.i;
            if (wyVar3 != wyVar2 && wyVar3 != null) {
                kj2.t("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                this.k = false;
                sb.append("Invalid configuration due to that two different postview output configs are set");
            } else {
                this.i = wyVar2;
            }
        }
        dk0Var.e(go4Var);
    }

    public final rc6 b() {
        a23 a23Var = null;
        if (this.k) {
            ArrayList arrayList = new ArrayList(this.a);
            q33 q33Var = this.j;
            if (q33Var.A) {
                Collections.sort(arrayList, new su0(q33Var, 5));
            }
            int i = this.h;
            dk0 dk0Var = this.b;
            if (i == 1) {
                dk0Var.getClass();
                if (arrayList.size() == 2 && !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i2);
                        i2++;
                        ig1 ig1Var = ((wy) obj).a;
                        ig1Var.getClass();
                        if (nb3.k(ig1Var.j, MediaCodec.class)) {
                            HashSet hashSet = (HashSet) dk0Var.R;
                            hashSet.getClass();
                            if (!hashSet.isEmpty()) {
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    ig1 ig1Var2 = (ig1) it.next();
                                    ig1Var2.getClass();
                                    if (nb3.k(ig1Var2.j, MediaCodec.class)) {
                                        break;
                                    }
                                }
                            }
                            xx xxVar = ek0.f;
                            Range range = (Range) ((da4) dk0Var.X).b(xxVar, yy.h);
                            if (range != null) {
                                if (((Number) range.getUpper()).intValue() < 120 || !nb3.k(range.getLower(), range.getUpper())) {
                                    range = null;
                                }
                                if (range != null) {
                                    Range range2 = new Range(30, range.getUpper());
                                    kj2.t("HighSpeedFpsModifier", "Modified high-speed FPS range from " + range + " to " + range2);
                                    ((da4) dk0Var.X).m(xxVar, range2);
                                }
                            }
                        }
                    }
                }
            }
            if (!this.n.isEmpty()) {
                a23Var = new a23(this, 2);
            }
            return new rc6(arrayList, new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), dk0Var.i(), a23Var, this.g, this.h, this.i);
        }
        i.h("Unsupported session configuration combination");
        return null;
    }

    public final boolean c() {
        if (this.m && this.k) {
            return true;
        }
        return false;
    }
}

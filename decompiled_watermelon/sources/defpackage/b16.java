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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b16  reason: default package */
/* loaded from: classes.dex */
public final class b16 extends w06 {
    public final mx2 j;
    public boolean k;
    public final StringBuilder l;
    public boolean m;
    public final ArrayList n;

    /* JADX WARN: Type inference failed for: r0v0, types: [mx2, java.lang.Object] */
    public b16() {
        boolean z;
        ?? obj = new Object();
        if (ne1.a.b(SurfaceOrderQuirk.class) != null) {
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

    public final void a(d16 d16Var) {
        wh0 wh0Var = d16Var.g;
        int i = wh0Var.c;
        ef4 ef4Var = wh0Var.b;
        vh0 vh0Var = this.b;
        if (i != -1) {
            this.m = true;
            int i2 = vh0Var.c;
            List list = d16.j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            vh0Var.c = i;
        }
        Range a = wh0Var.a();
        Range range = jx.h;
        boolean equals = a.equals(range);
        StringBuilder sb = this.l;
        if (!equals) {
            uw uwVar = wh0.f;
            boolean equals2 = ((Range) ((x14) vh0Var.e).d(uwVar, range)).equals(range);
            x14 x14Var = (x14) vh0Var.e;
            if (equals2) {
                x14Var.r(uwVar, a);
            } else if (!((Range) x14Var.d(uwVar, range)).equals(a)) {
                this.k = false;
                String str = "Different ExpectedFrameRateRange values; current = " + ((Range) ((x14) vh0Var.e).d(uwVar, range)) + ", new = " + a;
                ve2.w("ValidatingBuilder", str);
                sb.append(str);
            }
        }
        uw uwVar2 = b57.T;
        Integer num = (Integer) ef4Var.d(uwVar2, 0);
        Objects.requireNonNull(num);
        int intValue = num.intValue();
        if (intValue != 0) {
            vh0Var.getClass();
            if (intValue != 0) {
                ((x14) vh0Var.e).r(uwVar2, num);
            }
        }
        uw uwVar3 = b57.U;
        Integer num2 = (Integer) ef4Var.d(uwVar3, 0);
        Objects.requireNonNull(num2);
        int intValue2 = num2.intValue();
        if (intValue2 != 0) {
            vh0Var.getClass();
            if (intValue2 != 0) {
                ((x14) vh0Var.e).r(uwVar3, num2);
            }
        }
        im6 im6Var = wh0Var.e;
        HashSet hashSet = (HashSet) vh0Var.d;
        ((m24) vh0Var.f).a.putAll((Map) im6Var.a);
        this.c.addAll(d16Var.c);
        this.d.addAll(d16Var.d);
        vh0Var.b(wh0Var.d);
        this.e.addAll(d16Var.e);
        z06 z06Var = d16Var.f;
        if (z06Var != null) {
            this.n.add(z06Var);
        }
        InputConfiguration inputConfiguration = d16Var.i;
        if (inputConfiguration != null) {
            this.g = inputConfiguration;
        }
        ArrayList arrayList = d16Var.a;
        LinkedHashSet<hx> linkedHashSet = this.a;
        linkedHashSet.addAll(arrayList);
        hashSet.addAll(Collections.unmodifiableList(wh0Var.a));
        ArrayList arrayList2 = new ArrayList();
        for (hx hxVar : linkedHashSet) {
            arrayList2.add(hxVar.a);
            for (hc1 hc1Var : hxVar.b) {
                arrayList2.add(hc1Var);
            }
        }
        if (!arrayList2.containsAll(hashSet)) {
            ve2.v("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.k = false;
            sb.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
        }
        int i3 = d16Var.h;
        int i4 = this.h;
        if (i3 != i4 && i3 != 0 && i4 != 0) {
            ve2.v("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
            this.k = false;
            sb.append("Invalid configuration due to that two non-default session types are set");
        } else if (i3 != 0) {
            this.h = i3;
        }
        hx hxVar2 = d16Var.b;
        if (hxVar2 != null) {
            hx hxVar3 = this.i;
            if (hxVar3 != hxVar2 && hxVar3 != null) {
                ve2.v("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                this.k = false;
                sb.append("Invalid configuration due to that two different postview output configs are set");
            } else {
                this.i = hxVar2;
            }
        }
        vh0Var.d(ef4Var);
    }

    public final d16 b() {
        wv2 wv2Var = null;
        if (this.k) {
            ArrayList arrayList = new ArrayList(this.a);
            mx2 mx2Var = this.j;
            if (mx2Var.A) {
                Collections.sort(arrayList, new fs0(4, mx2Var));
            }
            int i = this.h;
            vh0 vh0Var = this.b;
            if (i == 1) {
                vh0Var.getClass();
                if (arrayList.size() == 2 && !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i2);
                        i2++;
                        hc1 hc1Var = ((hx) obj).a;
                        hc1Var.getClass();
                        if (b53.x(hc1Var.j, MediaCodec.class)) {
                            HashSet hashSet = (HashSet) vh0Var.d;
                            hashSet.getClass();
                            if (!hashSet.isEmpty()) {
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    hc1 hc1Var2 = (hc1) it.next();
                                    hc1Var2.getClass();
                                    if (b53.x(hc1Var2.j, MediaCodec.class)) {
                                        break;
                                    }
                                }
                            }
                            uw uwVar = wh0.f;
                            Range range = (Range) ((x14) vh0Var.e).d(uwVar, jx.h);
                            if (range != null) {
                                if (((Number) range.getUpper()).intValue() < 120 || !b53.x(range.getLower(), range.getUpper())) {
                                    range = null;
                                }
                                if (range != null) {
                                    Range range2 = new Range(30, range.getUpper());
                                    ve2.v("HighSpeedFpsModifier", "Modified high-speed FPS range from " + range + " to " + range2);
                                    ((x14) vh0Var.e).r(uwVar, range2);
                                }
                            }
                        }
                    }
                }
            }
            if (!this.n.isEmpty()) {
                wv2Var = new wv2(2, this);
            }
            return new d16(arrayList, new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), vh0Var.h(), wv2Var, this.g, this.h, this.i);
        }
        i.i("Unsupported session configuration combination");
        return null;
    }

    public final boolean c() {
        if (this.m && this.k) {
            return true;
        }
        return false;
    }
}

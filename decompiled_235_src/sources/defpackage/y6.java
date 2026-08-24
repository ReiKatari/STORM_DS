package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.InputDevice;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.inputsetup.InputSetupActivity;
import me.magnum.melonds.ui.layouts.LayoutSelectorActivity;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y6  reason: default package */
/* loaded from: classes.dex */
public final class y6 implements ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ y6(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x033d, code lost:
        if (r1 == null) goto L161;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    @Override // defpackage.ne2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, r41 r41Var) {
        bt a;
        bt a2;
        o3 o3Var;
        ls3 ls3Var;
        Object obj2;
        o3 o3Var2;
        bt a3;
        r3 r3Var;
        boolean z;
        o3 o3Var3;
        boolean z2;
        Object obj3;
        o3 o3Var4;
        bt a4;
        r3 r3Var2;
        boolean z3;
        o3 o3Var5;
        boolean z4;
        Object obj4;
        bt a5;
        r3 r3Var3;
        boolean z5;
        bt a6;
        o3 o3Var6;
        boolean z6;
        o3 o3Var7;
        ls3 ls3Var2;
        bt a7;
        l3 l3Var;
        l3 l3Var2;
        k3 k3Var;
        bt a8;
        bt a9;
        k3 k3Var2;
        k3 k3Var3;
        Object a10;
        DSiCameraSource dSiCameraSource;
        String string;
        te2 te2Var;
        int i;
        Object obj5;
        List<InputDevice.MotionRange> motionRanges;
        int i2 = -1;
        int i3 = 0;
        v3 v3Var = null;
        String str = null;
        DSiCameraSource dSiCameraSource2 = null;
        v3 v3Var2 = null;
        v3 v3Var3 = null;
        v3 v3Var4 = null;
        Object obj6 = null;
        v3 v3Var5 = null;
        v3 v3Var6 = null;
        v3 v3Var7 = null;
        v3 v3Var8 = null;
        switch (this.A) {
            case 0:
                ca5 ca5Var = (ca5) obj;
                final w6 w6Var = (w6) this.B;
                LinkedHashSet linkedHashSet = w6Var.b;
                mm6 mm6Var = w6Var.a;
                ca5Var.getClass();
                if (ca5Var.equals(ba5.a)) {
                    linkedHashSet.clear();
                    ListIterator listIterator = mm6Var.listIterator();
                    while (true) {
                        xx2 xx2Var = (xx2) listIterator;
                        if (xx2Var.hasNext()) {
                            v3 v3Var9 = (v3) xx2Var.next();
                            if (!(v3Var9 instanceof u3) || !((u3) v3Var9).b) {
                                v3Var9.a().E();
                            }
                        }
                    }
                } else if (ca5Var instanceof m95) {
                    m95 m95Var = (m95) ca5Var;
                    o75 o75Var = m95Var.a;
                    ListIterator listIterator2 = mm6Var.listIterator();
                    int i4 = 0;
                    while (true) {
                        xx2 xx2Var2 = (xx2) listIterator2;
                        if (xx2Var2.hasNext()) {
                            v3 v3Var10 = (v3) xx2Var2.next();
                            if (v3Var10 instanceof k3) {
                                k3Var3 = (k3) v3Var10;
                            } else {
                                k3Var3 = null;
                            }
                            if (k3Var3 == null || k3Var3.a.a != o75Var.a) {
                                i4++;
                            }
                        } else {
                            i4 = -1;
                        }
                    }
                    if (i4 != -1) {
                        ((ta4) ((v3) mm6Var.get(i4)).a().L).c.setValue(Boolean.TRUE);
                    } else {
                        mm6Var.add(0, new k3(o75Var, new bt(new q6(0, w6Var, m95Var)), w6Var.f()));
                    }
                } else if (ca5Var instanceof r95) {
                    o75 o75Var2 = ((r95) ca5Var).a;
                    long j = o75Var2.a;
                    ListIterator listIterator3 = mm6Var.listIterator();
                    while (true) {
                        xx2 xx2Var3 = (xx2) listIterator3;
                        if (xx2Var3.hasNext()) {
                            Object next = xx2Var3.next();
                            v3 v3Var11 = (v3) next;
                            if (v3Var11 instanceof k3) {
                                k3Var2 = (k3) v3Var11;
                            } else {
                                k3Var2 = null;
                            }
                            if (k3Var2 != null && k3Var2.a.a == j) {
                                v3Var2 = next;
                            }
                        }
                    }
                    v3 v3Var12 = v3Var2;
                    if (linkedHashSet.remove(Long.valueOf(j))) {
                        if (v3Var12 != null && (a9 = v3Var12.a()) != null) {
                            a9.E();
                        }
                    } else {
                        if (v3Var12 != null && (a8 = v3Var12.a()) != null) {
                            a8.E();
                        }
                        if (v3Var12 != null) {
                            w6Var.a(o75Var2, n3.FAILURE);
                        }
                    }
                } else if (ca5Var instanceof q95) {
                    o75 o75Var3 = ((q95) ca5Var).a;
                    ListIterator listIterator4 = mm6Var.listIterator();
                    while (true) {
                        xx2 xx2Var4 = (xx2) listIterator4;
                        if (xx2Var4.hasNext()) {
                            Object next2 = xx2Var4.next();
                            v3 v3Var13 = (v3) next2;
                            if (v3Var13 instanceof k3) {
                                k3Var = (k3) v3Var13;
                            } else {
                                k3Var = null;
                            }
                            if (k3Var != null && k3Var.a.a == o75Var3.a) {
                                v3Var3 = next2;
                            }
                        }
                    }
                    v3 v3Var14 = v3Var3;
                    if (v3Var14 != null) {
                        linkedHashSet.add(Long.valueOf(o75Var3.a));
                        v3Var14.a().E();
                        w6Var.a(o75Var3, n3.SUCCESS);
                    }
                } else if (ca5Var instanceof p95) {
                    p95 p95Var = (p95) ca5Var;
                    ListIterator listIterator5 = mm6Var.listIterator();
                    int i5 = 0;
                    while (true) {
                        xx2 xx2Var5 = (xx2) listIterator5;
                        if (xx2Var5.hasNext()) {
                            if (((v3) xx2Var5.next()) instanceof u3) {
                                i2 = i5;
                            } else {
                                i5++;
                            }
                        }
                    }
                    s3 s3Var = new s3(p95Var.a.a);
                    if (i2 < 0) {
                        mm6Var.add(0, new u3(s3Var, true, new bt(new on2() { // from class: v6
                            @Override // defpackage.on2
                            public final Object c() {
                                int i6 = r2;
                                jg7 jg7Var = jg7.a;
                                int i7 = -1;
                                int i8 = 0;
                                w6 w6Var2 = w6Var;
                                switch (i6) {
                                    case 0:
                                        mm6 mm6Var2 = w6Var2.a;
                                        mm6Var2.getClass();
                                        Iterator it = mm6Var2.iterator();
                                        while (true) {
                                            xx2 xx2Var6 = (xx2) it;
                                            if (xx2Var6.hasNext()) {
                                                v3 v3Var15 = (v3) xx2Var6.next();
                                                v3Var15.getClass();
                                                if (v3Var15 instanceof u3) {
                                                    i7 = i8;
                                                } else {
                                                    i8++;
                                                }
                                            }
                                        }
                                        if (i7 >= 0) {
                                            mm6Var2.remove(i7);
                                        }
                                        return jg7Var;
                                    default:
                                        mm6 mm6Var3 = w6Var2.a;
                                        mm6Var3.getClass();
                                        Iterator it2 = mm6Var3.iterator();
                                        while (true) {
                                            xx2 xx2Var7 = (xx2) it2;
                                            if (xx2Var7.hasNext()) {
                                                v3 v3Var16 = (v3) xx2Var7.next();
                                                v3Var16.getClass();
                                                if (v3Var16 instanceof u3) {
                                                    i7 = i8;
                                                } else {
                                                    i8++;
                                                }
                                            }
                                        }
                                        if (i7 >= 0) {
                                            mm6Var3.remove(i7);
                                        }
                                        return jg7Var;
                                }
                            }
                        }), w6Var.f()));
                    } else {
                        w6Var.d(i2, s3Var, true);
                    }
                } else if (ca5Var instanceof o95) {
                    o95 o95Var = (o95) ca5Var;
                    ListIterator listIterator6 = mm6Var.listIterator();
                    int i6 = 0;
                    while (true) {
                        xx2 xx2Var6 = (xx2) listIterator6;
                        if (xx2Var6.hasNext()) {
                            v3 v3Var15 = (v3) xx2Var6.next();
                            if (v3Var15 instanceof l3) {
                                l3Var2 = (l3) v3Var15;
                            } else {
                                l3Var2 = null;
                            }
                            if (l3Var2 == null || l3Var2.a.a != o95Var.a.a) {
                                i6++;
                            }
                        } else {
                            i6 = -1;
                        }
                    }
                    if (i6 != -1) {
                        w6Var.e(i6, o95Var);
                    } else {
                        ListIterator listIterator7 = mm6Var.listIterator();
                        while (true) {
                            xx2 xx2Var7 = (xx2) listIterator7;
                            if (xx2Var7.hasNext()) {
                                if (!(((v3) xx2Var7.next()) instanceof l3)) {
                                    i3++;
                                }
                            } else {
                                i3 = -1;
                            }
                        }
                        if (i3 != -1) {
                            w6Var.e(i3, o95Var);
                        } else {
                            w6Var.c(o95Var);
                        }
                    }
                } else if (ca5Var instanceof n95) {
                    n95 n95Var = (n95) ca5Var;
                    ListIterator listIterator8 = mm6Var.listIterator();
                    while (true) {
                        xx2 xx2Var8 = (xx2) listIterator8;
                        if (xx2Var8.hasNext()) {
                            Object next3 = xx2Var8.next();
                            v3 v3Var16 = (v3) next3;
                            if (v3Var16 instanceof l3) {
                                l3Var = (l3) v3Var16;
                            } else {
                                l3Var = null;
                            }
                            if (l3Var != null && l3Var.a.a == n95Var.a) {
                                v3Var4 = next3;
                            }
                        }
                    }
                    v3 v3Var17 = v3Var4;
                    if (v3Var17 != null && (a7 = v3Var17.a()) != null) {
                        a7.E();
                    }
                } else if (ca5Var instanceof u95) {
                    u95 u95Var = (u95) ca5Var;
                    gt0.W0(mm6Var, new r6(u95Var, 1));
                    mm6Var.add(0, new o3(u95Var.a, u95Var.b, u95Var.c, "", new bt(new q6(4, w6Var, u95Var)), w6Var.f()));
                } else if (ca5Var instanceof v95) {
                    v95 v95Var = (v95) ca5Var;
                    ListIterator listIterator9 = mm6Var.listIterator();
                    while (true) {
                        xx2 xx2Var9 = (xx2) listIterator9;
                        if (xx2Var9.hasNext()) {
                            v3 v3Var18 = (v3) xx2Var9.next();
                            if (v3Var18 instanceof o3) {
                                o3Var7 = (o3) v3Var18;
                            } else {
                                o3Var7 = null;
                            }
                            if (o3Var7 != null) {
                                ls3Var2 = o3Var7.a;
                            } else {
                                ls3Var2 = null;
                            }
                            if (!nb3.k(ls3Var2, v95Var.a)) {
                                i3++;
                            }
                        } else {
                            i3 = -1;
                        }
                    }
                    if (i3 != -1) {
                        Object obj7 = mm6Var.get(i3);
                        obj7.getClass();
                        o3 o3Var8 = (o3) obj7;
                        String str2 = v95Var.b;
                        ls3 ls3Var3 = o3Var8.a;
                        ta5 ta5Var = o3Var8.b;
                        URL url = o3Var8.c;
                        bt btVar = o3Var8.e;
                        long j2 = o3Var8.f;
                        ls3Var3.getClass();
                        ta5Var.getClass();
                        mm6Var.set(i3, new o3(ls3Var3, ta5Var, url, str2, btVar, j2));
                    }
                } else if (ca5Var instanceof y95) {
                    y95 y95Var = (y95) ca5Var;
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator10 = mm6Var.listIterator();
                    while (true) {
                        xx2 xx2Var10 = (xx2) listIterator10;
                        if (xx2Var10.hasNext()) {
                            Object next4 = xx2Var10.next();
                            if (next4 instanceof o3) {
                                arrayList.add(next4);
                            }
                        } else {
                            int size = arrayList.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 < size) {
                                    Object obj8 = arrayList.get(i7);
                                    i7++;
                                    if (nb3.k(((o3) obj8).a, y95Var.a)) {
                                        obj6 = obj8;
                                    }
                                }
                            }
                            o3 o3Var9 = (o3) obj6;
                            if (o3Var9 != null) {
                                o3Var9.e.E();
                            }
                            gt0.W0(mm6Var, new t6(y95Var, 1));
                            mm6Var.add(0, new r3(y95Var.a, y95Var.b, y95Var.c, y95Var.d, new bt(new q6(3, w6Var, y95Var)), w6Var.f()));
                        }
                    }
                } else if (ca5Var instanceof x95) {
                    x95 x95Var = (x95) ca5Var;
                    long j3 = x95Var.a;
                    ls3 ls3Var4 = x95Var.b;
                    ListIterator listIterator11 = mm6Var.listIterator();
                    while (true) {
                        xx2 xx2Var11 = (xx2) listIterator11;
                        if (xx2Var11.hasNext()) {
                            obj4 = xx2Var11.next();
                            v3 v3Var19 = (v3) obj4;
                            if (v3Var19 instanceof o3) {
                                o3Var6 = (o3) v3Var19;
                            } else {
                                o3Var6 = null;
                            }
                            if (o3Var6 != null) {
                                ls3 ls3Var5 = o3Var6.a;
                                if (ls3Var4 != null) {
                                    z6 = ls3Var4.equals(ls3Var5);
                                } else if (j3 == ls3Var5.a) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                }
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    v3 v3Var20 = (v3) obj4;
                    if (v3Var20 != null && (a6 = v3Var20.a()) != null) {
                        a6.E();
                    }
                    ListIterator listIterator12 = mm6Var.listIterator();
                    while (true) {
                        xx2 xx2Var12 = (xx2) listIterator12;
                        if (xx2Var12.hasNext()) {
                            Object next5 = xx2Var12.next();
                            v3 v3Var21 = (v3) next5;
                            if (v3Var21 instanceof r3) {
                                r3Var3 = (r3) v3Var21;
                            } else {
                                r3Var3 = null;
                            }
                            if (r3Var3 != null) {
                                ls3 ls3Var6 = r3Var3.a;
                                if (ls3Var4 != null) {
                                    z5 = ls3Var4.equals(ls3Var6);
                                } else if (j3 == ls3Var6.a) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    v3Var5 = next5;
                                }
                            }
                        }
                    }
                    v3 v3Var22 = v3Var5;
                    if (v3Var22 != null && (a5 = v3Var22.a()) != null) {
                        a5.E();
                    }
                    mm6Var.add(0, new q3(x95Var.a, x95Var.b, x95Var.c, x95Var.d, x95Var.e, x95Var.f, x95Var.g, x95Var.h, new bt(new q6(1, w6Var, x95Var)), w6Var.f()));
                } else if (ca5Var instanceof w95) {
                    w95 w95Var = (w95) ca5Var;
                    ls3 ls3Var7 = w95Var.b;
                    long j4 = w95Var.a;
                    ListIterator listIterator13 = mm6Var.listIterator();
                    while (true) {
                        xx2 xx2Var13 = (xx2) listIterator13;
                        if (xx2Var13.hasNext()) {
                            obj3 = xx2Var13.next();
                            v3 v3Var23 = (v3) obj3;
                            if (v3Var23 instanceof o3) {
                                o3Var5 = (o3) v3Var23;
                            } else {
                                o3Var5 = null;
                            }
                            if (o3Var5 != null) {
                                ls3 ls3Var8 = o3Var5.a;
                                if (ls3Var7 != null) {
                                    z4 = ls3Var7.equals(ls3Var8);
                                } else if (j4 == ls3Var8.a) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                }
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    if (obj3 instanceof o3) {
                        o3Var4 = (o3) obj3;
                    } else {
                        o3Var4 = null;
                    }
                    if (o3Var4 != null) {
                        o3Var4.e.E();
                    }
                    ListIterator listIterator14 = mm6Var.listIterator();
                    while (true) {
                        xx2 xx2Var14 = (xx2) listIterator14;
                        if (xx2Var14.hasNext()) {
                            Object next6 = xx2Var14.next();
                            v3 v3Var24 = (v3) next6;
                            if (v3Var24 instanceof r3) {
                                r3Var2 = (r3) v3Var24;
                            } else {
                                r3Var2 = null;
                            }
                            if (r3Var2 != null) {
                                ls3 ls3Var9 = r3Var2.a;
                                if (ls3Var7 != null) {
                                    z3 = ls3Var7.equals(ls3Var9);
                                } else if (j4 == ls3Var9.a) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    v3Var6 = next6;
                                }
                            }
                        }
                    }
                    v3 v3Var25 = v3Var6;
                    if (v3Var25 != null && (a4 = v3Var25.a()) != null) {
                        a4.E();
                    }
                    if (o3Var4 != null) {
                        w6Var.b(o3Var4, n3.FAILURE);
                    }
                    ListIterator listIterator15 = mm6Var.listIterator();
                    int i8 = 0;
                    while (true) {
                        xx2 xx2Var15 = (xx2) listIterator15;
                        if (xx2Var15.hasNext()) {
                            if (((v3) xx2Var15.next()) instanceof u3) {
                                i2 = i8;
                            } else {
                                i8++;
                            }
                        }
                    }
                    t3 t3Var = new t3(j4);
                    if (i2 < 0) {
                        mm6Var.add(0, new u3(t3Var, w95Var.c, new bt(new on2() { // from class: v6
                            @Override // defpackage.on2
                            public final Object c() {
                                int i62 = r2;
                                jg7 jg7Var = jg7.a;
                                int i72 = -1;
                                int i82 = 0;
                                w6 w6Var2 = w6Var;
                                switch (i62) {
                                    case 0:
                                        mm6 mm6Var2 = w6Var2.a;
                                        mm6Var2.getClass();
                                        Iterator it = mm6Var2.iterator();
                                        while (true) {
                                            xx2 xx2Var62 = (xx2) it;
                                            if (xx2Var62.hasNext()) {
                                                v3 v3Var152 = (v3) xx2Var62.next();
                                                v3Var152.getClass();
                                                if (v3Var152 instanceof u3) {
                                                    i72 = i82;
                                                } else {
                                                    i82++;
                                                }
                                            }
                                        }
                                        if (i72 >= 0) {
                                            mm6Var2.remove(i72);
                                        }
                                        return jg7Var;
                                    default:
                                        mm6 mm6Var3 = w6Var2.a;
                                        mm6Var3.getClass();
                                        Iterator it2 = mm6Var3.iterator();
                                        while (true) {
                                            xx2 xx2Var72 = (xx2) it2;
                                            if (xx2Var72.hasNext()) {
                                                v3 v3Var162 = (v3) xx2Var72.next();
                                                v3Var162.getClass();
                                                if (v3Var162 instanceof u3) {
                                                    i72 = i82;
                                                } else {
                                                    i82++;
                                                }
                                            }
                                        }
                                        if (i72 >= 0) {
                                            mm6Var3.remove(i72);
                                        }
                                        return jg7Var;
                                }
                            }
                        }), w6Var.f()));
                    } else {
                        w6Var.d(i2, t3Var, w95Var.c);
                    }
                } else if (ca5Var instanceof t95) {
                    t95 t95Var = (t95) ca5Var;
                    long j5 = t95Var.a;
                    ls3 ls3Var10 = t95Var.b;
                    ListIterator listIterator16 = mm6Var.listIterator();
                    while (true) {
                        xx2 xx2Var16 = (xx2) listIterator16;
                        if (xx2Var16.hasNext()) {
                            obj2 = xx2Var16.next();
                            v3 v3Var26 = (v3) obj2;
                            if (v3Var26 instanceof o3) {
                                o3Var3 = (o3) v3Var26;
                            } else {
                                o3Var3 = null;
                            }
                            if (o3Var3 != null) {
                                if (ls3Var10 != null) {
                                    z2 = nb3.k(o3Var3.a, ls3Var10);
                                } else if (o3Var3.b.a == j5) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                }
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    if (obj2 instanceof o3) {
                        o3Var2 = (o3) obj2;
                    } else {
                        o3Var2 = null;
                    }
                    if (o3Var2 != null) {
                        o3Var2.e.E();
                    }
                    ListIterator listIterator17 = mm6Var.listIterator();
                    while (true) {
                        xx2 xx2Var17 = (xx2) listIterator17;
                        if (xx2Var17.hasNext()) {
                            Object next7 = xx2Var17.next();
                            v3 v3Var27 = (v3) next7;
                            if (v3Var27 instanceof r3) {
                                r3Var = (r3) v3Var27;
                            } else {
                                r3Var = null;
                            }
                            if (r3Var != null) {
                                ls3 ls3Var11 = r3Var.a;
                                if (ls3Var10 != null) {
                                    z = nb3.k(ls3Var11, ls3Var10);
                                } else if (ls3Var11.a == j5) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    v3Var7 = next7;
                                }
                            }
                        }
                    }
                    v3 v3Var28 = v3Var7;
                    if (v3Var28 != null && (a3 = v3Var28.a()) != null) {
                        a3.E();
                    }
                    if (o3Var2 != null) {
                        w6Var.b(o3Var2, n3.FAILURE);
                    }
                } else if (ca5Var instanceof z95) {
                    z95 z95Var = (z95) ca5Var;
                    ListIterator listIterator18 = mm6Var.listIterator();
                    while (true) {
                        xx2 xx2Var18 = (xx2) listIterator18;
                        if (xx2Var18.hasNext()) {
                            Object next8 = xx2Var18.next();
                            v3 v3Var29 = (v3) next8;
                            if (v3Var29 instanceof o3) {
                                o3Var = (o3) v3Var29;
                            } else {
                                o3Var = null;
                            }
                            if (o3Var != null) {
                                ls3Var = o3Var.a;
                            } else {
                                ls3Var = null;
                            }
                            if (nb3.k(ls3Var, z95Var.a)) {
                                v3Var8 = next8;
                            }
                        }
                    }
                    v3 v3Var30 = v3Var8;
                    if (v3Var30 != null && (a2 = v3Var30.a()) != null) {
                        a2.E();
                    }
                } else if (ca5Var.equals(aa5.a)) {
                    ListIterator listIterator19 = mm6Var.listIterator();
                    while (true) {
                        xx2 xx2Var19 = (xx2) listIterator19;
                        if (xx2Var19.hasNext()) {
                            Object next9 = xx2Var19.next();
                            if (((v3) next9) instanceof u3) {
                                v3Var = next9;
                            }
                        }
                    }
                    v3 v3Var31 = v3Var;
                    if (v3Var31 != null && (a = v3Var31.a()) != null) {
                        a.E();
                    }
                } else if (!(ca5Var instanceof s95)) {
                    i.d();
                    return null;
                }
                return jg7.a;
            case 1:
                jg7 jg7Var = (jg7) obj;
                u63 u63Var = (u63) this.B;
                if (Build.VERSION.SDK_INT >= 34) {
                    u63Var.n().startStylusHandwriting((View) u63Var.B);
                }
                return jg7.a;
            case 2:
                tp6 tp6Var = ((v10) this.B).d;
                kw3 I = hf.I();
                I.add(null);
                I.addAll((List) obj);
                tp6Var.l(hf.A(I));
                return jg7.a;
            case 3:
                ii0 ii0Var = (ii0) obj;
                sc0 sc0Var = (sc0) this.B;
                tp6 tp6Var2 = sc0Var.Y;
                jg7 jg7Var2 = jg7.a;
                if (ii0Var instanceof ei0) {
                    tp6Var2.a(ii0Var, r41Var);
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    return jg7Var2;
                } else if (ii0Var instanceof gi0) {
                    tp6Var2.a(ii0Var, r41Var);
                    x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                    return jg7Var2;
                } else if ((ii0Var instanceof fi0) && (a10 = sc0Var.d0.a(jg7Var2, r41Var)) == x61.COROUTINE_SUSPENDED) {
                    return a10;
                } else {
                    return jg7Var2;
                }
            case 4:
                zn0 zn0Var = (zn0) obj;
                uo0 uo0Var = (uo0) this.B;
                int i9 = ro0.a[zn0Var.a.ordinal()];
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3 && i9 != 4 && i9 != 5) {
                            i.d();
                            return null;
                        }
                        uo0Var.dismiss();
                    } else {
                        bt btVar2 = uo0Var.Z;
                        if (btVar2 != null) {
                            ((ProgressBar) btVar2.L).setIndeterminate(false);
                            bt btVar3 = uo0Var.Z;
                            if (btVar3 != null) {
                                ((ProgressBar) btVar3.L).setProgress((int) (zn0Var.b * 100.0f));
                                bt btVar4 = uo0Var.Z;
                                if (btVar4 != null) {
                                    ((TextView) btVar4.R).setText(zn0Var.c);
                                } else {
                                    nb3.a0("binding");
                                    throw null;
                                }
                            } else {
                                nb3.a0("binding");
                                throw null;
                            }
                        } else {
                            nb3.a0("binding");
                            throw null;
                        }
                    }
                } else {
                    bt btVar5 = uo0Var.Z;
                    if (btVar5 != null) {
                        ((ProgressBar) btVar5.L).setIndeterminate(true);
                        bt btVar6 = uo0Var.Z;
                        if (btVar6 != null) {
                            ((TextView) btVar6.R).setText(R.string.starting);
                        } else {
                            nb3.a0("binding");
                            throw null;
                        }
                    } else {
                        nb3.a0("binding");
                        throw null;
                    }
                }
                return jg7.a;
            case 5:
                h91 h91Var = (h91) obj;
                g91 g91Var = (g91) this.B;
                nc1 nc1Var = g91Var.e;
                Map map = g91Var.a;
                boolean z7 = nc1Var instanceof e91;
                if (z7 && (dSiCameraSource = g91Var.d) != null) {
                    dSiCameraSource.stopCamera(((e91) nc1Var).t);
                }
                DSiCameraSource dSiCameraSource3 = (DSiCameraSource) map.get(h91Var);
                if (dSiCameraSource3 != null) {
                    if (!dSiCameraSource3.isAvailable()) {
                        dSiCameraSource3 = null;
                        break;
                    }
                }
                dSiCameraSource3 = (DSiCameraSource) map.get(h91.BLACK_SCREEN);
                if (dSiCameraSource3 != null) {
                    if (z7) {
                        dSiCameraSource3.startCamera(((e91) nc1Var).t);
                    }
                    dSiCameraSource2 = dSiCameraSource3;
                }
                g91Var.d = dSiCameraSource2;
                return jg7.a;
            case 6:
                hj3 hj3Var = (hj3) obj;
                s9 s9Var = (s9) this.B;
                ax1 ax1Var = (ax1) s9Var.b;
                jq jqVar = (jq) s9Var.a;
                if (hj3Var instanceof fj3) {
                    yc2 yc2Var = ((fj3) hj3Var).a;
                    if (yc2Var instanceof xc2) {
                        ax1Var.k(((xc2) yc2Var).a);
                    } else if (yc2Var instanceof uc2) {
                        zb zbVar = new zb(jqVar);
                        wb wbVar = (wb) zbVar.L;
                        zbVar.z(R.string.firmware_launch_failed);
                        zbVar.w(R.string.firmware_launch_bad_setup);
                        zbVar.y(R.string.settings, new xw1(s9Var, 5));
                        xw1 xw1Var = new xw1(s9Var, 6);
                        wbVar.k = wbVar.a.getText(R.string.delete_bios_paths);
                        wbVar.l = xw1Var;
                        zbVar.x(R.string.cancel, new xw1(s9Var, 7));
                        wbVar.n = new yw1(s9Var, 3);
                        zbVar.B();
                    } else if (yc2Var instanceof wc2) {
                        s9.f(s9Var, ((wc2) yc2Var).a);
                    } else if (yc2Var instanceof vc2) {
                        s9.e(s9Var, ((vc2) yc2Var).a);
                    } else {
                        i.d();
                        return null;
                    }
                } else if (hj3Var instanceof gj3) {
                    wx5 wx5Var = ((gj3) hj3Var).a;
                    if (wx5Var instanceof vx5) {
                        ax1Var.e(((vx5) wx5Var).a);
                    } else if (wx5Var instanceof sx5) {
                        oi2 oi2Var = ((sx5) wx5Var).a;
                        if (oi2Var.equals(rx5.e)) {
                            string = jqVar.getString(R.string.failed_launch_dsiware_title_check_failed);
                        } else if (oi2Var.equals(rx5.f)) {
                            string = jqVar.getString(R.string.failed_launch_dsiware_title_rom_failed);
                        } else if (oi2Var.equals(rx5.g)) {
                            string = jqVar.getString(R.string.failed_launch_dsiware_title_not_installed);
                        } else {
                            i.d();
                            return null;
                        }
                        string.getClass();
                        zb zbVar2 = new zb(jqVar);
                        wb wbVar2 = (wb) zbVar2.L;
                        zbVar2.z(R.string.failed_launch_dsiware_title);
                        wbVar2.f = string;
                        zbVar2.y(R.string.dsiware_manager, new xw1(s9Var, 8));
                        zbVar2.x(R.string.cancel, new xw1(s9Var, 9));
                        wbVar2.n = new yw1(s9Var, 4);
                        zbVar2.B();
                    } else if (wx5Var instanceof qx5) {
                        zb zbVar3 = new zb(jqVar);
                        zbVar3.z(R.string.rom_launch_failed);
                        zbVar3.w(R.string.rom_launch_custom_bios_firmware_bad_setup);
                        zbVar3.y(R.string.settings, new xw1(s9Var, 1));
                        zbVar3.x(R.string.cancel, new xw1(s9Var, 2));
                        ((wb) zbVar3.L).n = new yw1(s9Var, 1);
                        zbVar3.B();
                    } else if (wx5Var instanceof ux5) {
                        s9.f(s9Var, ((ux5) wx5Var).a);
                    } else if (wx5Var instanceof tx5) {
                        s9.e(s9Var, ((tx5) wx5Var).a);
                    } else {
                        i.d();
                        return null;
                    }
                } else {
                    i.d();
                    return null;
                }
                return jg7.a;
            case 7:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                op opVar = (op) ((bt) this.B).R;
                if (booleanValue) {
                    if (opVar != null) {
                        opVar.a();
                    }
                } else if (opVar != null) {
                    opVar.b();
                }
                return jg7.a;
            case 8:
                if (r41Var instanceof te2) {
                    te2Var = (te2) r41Var;
                    int i10 = te2Var.Y;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        te2Var.Y = i10 - Integer.MIN_VALUE;
                        Object obj9 = te2Var.R;
                        x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                        i = te2Var.Y;
                        if (i == 0) {
                            if (i == 1) {
                                oi2.Y(obj9);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj9);
                            r35 r35Var = (r35) this.B;
                            if (obj == null) {
                                obj5 = fh4.a;
                            } else {
                                obj5 = obj;
                            }
                            te2Var.Y = 1;
                            if (r35Var.Y.a(te2Var, obj5) == x61Var3) {
                                return x61Var3;
                            }
                        }
                        return jg7.a;
                    }
                }
                te2Var = new te2(this, r41Var);
                Object obj92 = te2Var.R;
                x61 x61Var32 = x61.COROUTINE_SUSPENDED;
                i = te2Var.Y;
                if (i == 0) {
                }
                return jg7.a;
            case 9:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                LinkedHashMap linkedHashMap = ((InputSetupActivity) this.B).C0;
                if (booleanValue2) {
                    linkedHashMap.clear();
                    int[] deviceIds = InputDevice.getDeviceIds();
                    deviceIds.getClass();
                    int length = deviceIds.length;
                    while (i3 < length) {
                        int i11 = deviceIds[i3];
                        InputDevice device = InputDevice.getDevice(i11);
                        if (device != null && (motionRanges = device.getMotionRanges()) != null) {
                            for (InputDevice.MotionRange motionRange : motionRanges) {
                                motionRange.getClass();
                                if (motionRange.isFromSource(16) || motionRange.isFromSource(16777232) || motionRange.isFromSource(1025)) {
                                    linkedHashMap.put(new vr4(new Integer(i11), new Integer(motionRange.getAxis())), new Float((float) RecyclerView.B1));
                                }
                            }
                        }
                        i3++;
                    }
                }
                return jg7.a;
            case 10:
                b63 b63Var = (b63) obj;
                ((eh2) ((ah2) this.B)).g(6, true);
                return jg7.a;
            case 11:
                ba6 ba6Var = (ba6) obj;
                LayoutSelectorActivity layoutSelectorActivity = (LayoutSelectorActivity) this.B;
                Intent intent = new Intent();
                UUID uuid = ba6Var.a;
                if (uuid != null) {
                    str = uuid.toString();
                }
                intent.putExtra("selected_layout_id", str);
                layoutSelectorActivity.setResult(-1, intent);
                if (ba6Var.b == aa6.SELECTED_BY_USER) {
                    layoutSelectorActivity.finish();
                }
                return jg7.a;
            case 12:
                ((o74) this.B).L.i(((Number) obj).floatValue());
                return jg7.a;
            case 13:
                int i12 = RomDetailsActivity.J0;
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse((String) obj));
                ((RomDetailsActivity) this.B).startActivity(intent2);
                return jg7.a;
            case 14:
                ((tp6) this.B).m(null, new bu5((zt5) obj));
                return jg7.a;
            default:
                oh0 oh0Var = (oh0) obj;
                pq7 pq7Var = (pq7) this.B;
                synchronized (pq7Var.e) {
                    try {
                        if (oh0Var instanceof vh0) {
                            kq7 kq7Var = new kq7((rd) ((vh0) oh0Var).a);
                            pq7Var.g = kq7Var;
                            pq7Var.b(new vh0(kq7Var));
                        } else {
                            pq7Var.b(oh0Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return jg7.a;
        }
    }
}

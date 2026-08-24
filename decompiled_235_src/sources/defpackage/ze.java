package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ze */
/* loaded from: classes.dex */
public final class ze extends b2 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final o94 J0;
    public final String A0;
    public final m44 B0;
    public final p94 C0;
    public ya6 D0;
    public boolean E0;
    public final n94 F0;
    public final n0 G0;
    public final ArrayList H0;
    public final ye I0;
    public final te R;
    public int X = Integer.MIN_VALUE;
    public final ye Y = new ye(this, 0);
    public final AccessibilityManager Z;
    public long d0;
    public List e0;
    public final ue f0;
    public int g0;
    public int h0;
    public v2 i0;
    public v2 j0;
    public boolean k0;
    public final p94 l0;
    public final p94 m0;
    public final un6 n0;
    public final un6 o0;
    public int p0;
    public Integer q0;
    public final zu r0;
    public final v80 s0;
    public boolean t0;
    public ve u0;
    public p94 v0;
    public final q94 w0;
    public final n94 x0;
    public final n94 y0;
    public final String z0;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        o94 o94Var = f93.a;
        o94 o94Var2 = new o94(32);
        int i = o94Var2.b;
        if (i >= 0) {
            int i2 = i + 32;
            o94Var2.b(i2);
            int[] iArr2 = o94Var2.a;
            int i3 = o94Var2.b;
            if (i != i3) {
                fv.r0(i2, i, i3, iArr2, iArr2);
            }
            fv.v0(i, 0, 12, iArr, iArr2);
            o94Var2.b += 32;
            J0 = o94Var2;
            return;
        }
        e41.q("");
    }

    public ze(te teVar) {
        this.R = teVar;
        Object systemService = teVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.Z = (AccessibilityManager) systemService;
        this.d0 = 100L;
        new Handler(Looper.getMainLooper());
        this.f0 = new ue(this, 0);
        this.g0 = Integer.MIN_VALUE;
        this.h0 = Integer.MIN_VALUE;
        this.l0 = new p94();
        this.m0 = new p94();
        this.n0 = new un6(0);
        this.o0 = new un6(0);
        this.p0 = -1;
        this.r0 = new zu(0);
        this.s0 = nb3.c(1, null, null, 6);
        this.t0 = true;
        p94 p94Var = h93.a;
        p94Var.getClass();
        this.v0 = p94Var;
        this.w0 = new q94();
        this.x0 = new n94();
        this.y0 = new n94();
        this.z0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.A0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.B0 = new m44(28, (byte) 0);
        this.C0 = new p94();
        this.D0 = new ya6(teVar.getSemanticsOwner().a(), p94Var);
        int i = c93.a;
        this.F0 = new n94();
        teVar.addOnAttachStateChangeListener(this);
        this.G0 = new n0(this, 2);
        this.H0 = new ArrayList();
        this.I0 = new ye(this, 1);
    }

    public static /* synthetic */ void E(ze zeVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        zeVar.D(i, i2, num, null);
    }

    public static Rect L(mp2 mp2Var, float f, float f2) {
        if (!(mp2Var instanceof qo4) && !(mp2Var instanceof ro4)) {
            return null;
        }
        of5 z = mp2Var.z();
        return new Rect((int) (z.a + f), (int) (z.b + f2), (int) (z.c + f), (int) (z.d + f2));
    }

    public static float[] N(mp2 mp2Var) {
        if (mp2Var instanceof ro4) {
            u16 u16Var = ((ro4) mp2Var).f;
            long j = u16Var.h;
            long j2 = u16Var.g;
            long j3 = u16Var.f;
            long j4 = u16Var.e;
            return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
        }
        return null;
    }

    public static Region O(mp2 mp2Var, float f, float f2) {
        if (mp2Var instanceof po4) {
            po4 po4Var = (po4) mp2Var;
            of5 h = po4Var.z().h(f, f2);
            Region region = new Region(new Rect((int) (h.a + RecyclerView.B1), (int) (h.b + RecyclerView.B1), (int) (h.c + RecyclerView.B1), (int) (h.d + RecyclerView.B1)));
            Region region2 = new Region();
            hj hjVar = po4Var.f;
            if (hjVar instanceof hj) {
                Path path = hjVar.a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            fa6.h("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String t(xa6 xa6Var) {
        fp fpVar;
        if (xa6Var != null) {
            ta6 ta6Var = xa6Var.d;
            ja4 ja4Var = ta6Var.A;
            fb6 fb6Var = bb6.a;
            if (ja4Var.c(fb6Var)) {
                return ex3.a(62, null, ",", (List) ta6Var.c(fb6Var));
            }
            fb6 fb6Var2 = bb6.G;
            if (ja4Var.c(fb6Var2)) {
                Object g = ja4Var.g(fb6Var2);
                if (g == null) {
                    g = null;
                }
                fp fpVar2 = (fp) g;
                if (fpVar2 != null) {
                    return fpVar2.B;
                }
            } else {
                Object g2 = ja4Var.g(bb6.C);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null && (fpVar = (fp) gt0.J0(list)) != null) {
                    return fpVar.B;
                }
            }
        }
        return null;
    }

    public static final boolean x(e76 e76Var, float f) {
        on2 on2Var = e76Var.a;
        if (f >= RecyclerView.B1 || ((Number) on2Var.c()).floatValue() <= RecyclerView.B1) {
            if (f > RecyclerView.B1 && ((Number) on2Var.c()).floatValue() < ((Number) e76Var.b.c()).floatValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean y(e76 e76Var) {
        on2 on2Var = e76Var.a;
        if (((Number) on2Var.c()).floatValue() > RecyclerView.B1) {
            return true;
        }
        ((Number) on2Var.c()).floatValue();
        ((Number) e76Var.b.c()).floatValue();
        return false;
    }

    public static final boolean z(e76 e76Var) {
        on2 on2Var = e76Var.a;
        if (((Number) on2Var.c()).floatValue() < ((Number) e76Var.b.c()).floatValue()) {
            return true;
        }
        ((Number) on2Var.c()).floatValue();
        return false;
    }

    public final int A(int i) {
        if (i == this.R.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    public final void B(xa6 xa6Var, ya6 ya6Var) {
        int[] iArr = p93.a;
        q94 q94Var = new q94();
        List j = xa6.j(4, xa6Var);
        sm3 sm3Var = xa6Var.c;
        int size = j.size();
        for (int i = 0; i < size; i++) {
            g93 s = s();
            int i2 = ((xa6) j.get(i)).f;
            if (s.a(i2)) {
                if (!ya6Var.b.c(i2)) {
                    w(sm3Var);
                    return;
                }
                q94Var.a(i2);
            }
        }
        q94 q94Var2 = ya6Var.b;
        int[] iArr2 = q94Var2.b;
        long[] jArr = q94Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128 && !q94Var.c(iArr2[(i3 << 3) + i5])) {
                            w(sm3Var);
                            return;
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        List j3 = xa6.j(4, xa6Var);
        int size2 = j3.size();
        for (int i6 = 0; i6 < size2; i6++) {
            xa6 xa6Var2 = (xa6) j3.get(i6);
            ya6 ya6Var2 = (ya6) this.C0.b(xa6Var2.f);
            if (ya6Var2 != null && s().a(xa6Var2.f)) {
                B(xa6Var2, ya6Var2);
            }
        }
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.k0 = true;
        }
        try {
            return ((Boolean) this.Y.g(accessibilityEvent)).booleanValue();
        } finally {
            this.k0 = false;
        }
    }

    public final boolean D(int i, int i2, Integer num, List list) {
        if (i != Integer.MIN_VALUE && v()) {
            AccessibilityEvent o = o(i, i2);
            if (num != null) {
                o.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                o.setContentDescription(ex3.a(62, null, ",", list));
            }
            return C(o);
        }
        return false;
    }

    public final void F(int i, int i2, String str) {
        AccessibilityEvent o = o(A(i), 32);
        o.setContentChangeTypes(i2);
        if (str != null) {
            o.getText().add(str);
        }
        C(o);
    }

    public final void G(int i) {
        ve veVar = this.u0;
        if (veVar != null) {
            xa6 xa6Var = veVar.a;
            if (i != xa6Var.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - veVar.f <= 1000) {
                AccessibilityEvent o = o(A(xa6Var.f), 131072);
                o.setFromIndex(veVar.d);
                o.setToIndex(veVar.e);
                o.setAction(veVar.b);
                o.setMovementGranularity(veVar.c);
                o.getText().add(t(xa6Var));
                C(o);
            }
        }
        this.u0 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:359:0x0127, code lost:
        if (defpackage.nb3.k(r1, r13) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x04c0, code lost:
        if (r1.isEmpty() == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x04ef, code lost:
        if (r5 != null) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x04f4, code lost:
        if (r5 == null) goto L200;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(g93 g93Var) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        Integer num2;
        int i2;
        int i3;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        Integer num4;
        int i7;
        xa6 xa6Var;
        ta6 ta6Var;
        xa6 xa6Var2;
        int i8;
        int i9;
        boolean z;
        int i10;
        ja4 ja4Var;
        sm3 sm3Var;
        int i11;
        ta6 ta6Var2;
        Integer num5;
        ArrayList arrayList3;
        long j;
        int i12;
        int i13;
        sm3 sm3Var2;
        int i14;
        Integer num6;
        int i15;
        ja4 ja4Var2;
        o76 o76Var;
        boolean z2;
        o76 o76Var2;
        int i16;
        String str;
        int i17;
        int i18;
        int i19;
        boolean z3;
        boolean z4;
        AccessibilityEvent p;
        String str2;
        ze zeVar = this;
        g93 g93Var2 = g93Var;
        Integer num7 = 64;
        ArrayList arrayList4 = zeVar.H0;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = g93Var2.b;
        long[] jArr3 = g93Var2.a;
        int i20 = 2;
        int length = jArr3.length - 2;
        int i21 = 0;
        Integer num8 = 0;
        if (length >= 0) {
            int i22 = 0;
            while (true) {
                long j2 = jArr3[i22];
                int i23 = i20;
                int i24 = length;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i25 = 8;
                    int i26 = 8 - ((~(i22 - i24)) >>> 31);
                    long j3 = j2;
                    int i27 = i21;
                    while (i27 < i26) {
                        if ((j3 & 255) < 128) {
                            int i28 = iArr3[(i22 << 3) + i27];
                            ya6 ya6Var = (ya6) zeVar.C0.b(i28);
                            if (ya6Var != null) {
                                ta6 ta6Var3 = ya6Var.a;
                                ja4 ja4Var3 = ta6Var3.A;
                                za6 za6Var = (za6) g93Var2.b(i28);
                                int i29 = i25;
                                if (za6Var != null) {
                                    xa6Var = za6Var.a;
                                } else {
                                    xa6Var = null;
                                }
                                if (xa6Var != null) {
                                    sm3 sm3Var3 = xa6Var.c;
                                    ta6 ta6Var4 = xa6Var.d;
                                    iArr2 = iArr3;
                                    int i30 = xa6Var.f;
                                    jArr2 = jArr3;
                                    ja4 ja4Var4 = ta6Var4.A;
                                    i6 = i22;
                                    Object[] objArr = ja4Var4.b;
                                    Object[] objArr2 = ja4Var4.c;
                                    long[] jArr4 = ja4Var4.a;
                                    i3 = i27;
                                    int length2 = jArr4.length - 2;
                                    if (length2 >= 0) {
                                        sm3 sm3Var4 = sm3Var3;
                                        i4 = i26;
                                        int i31 = 0;
                                        z = 0;
                                        while (true) {
                                            long j4 = jArr4[i31];
                                            xa6Var2 = xa6Var;
                                            int i32 = i31;
                                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i33 = 8 - ((~(i32 - length2)) >>> 31);
                                                int i34 = 0;
                                                while (i34 < i33) {
                                                    if ((j4 & 255) < 128) {
                                                        int i35 = (i32 << 3) + i34;
                                                        Object obj = objArr[i35];
                                                        int i36 = length2;
                                                        Object obj2 = objArr2[i35];
                                                        ta6Var2 = ta6Var3;
                                                        fb6 fb6Var = (fb6) obj;
                                                        j = j4;
                                                        fb6 fb6Var2 = bb6.v;
                                                        if (!nb3.k(fb6Var, fb6Var2) && !nb3.k(fb6Var, bb6.w)) {
                                                            i13 = i34;
                                                            z2 = false;
                                                        } else {
                                                            int size = arrayList5.size();
                                                            i13 = i34;
                                                            int i37 = 0;
                                                            while (true) {
                                                                if (i37 < size) {
                                                                    int i38 = size;
                                                                    if (((o76) arrayList5.get(i37)).A == i28) {
                                                                        o76Var = (o76) arrayList5.get(i37);
                                                                        break;
                                                                    } else {
                                                                        i37++;
                                                                        size = i38;
                                                                    }
                                                                } else {
                                                                    o76Var = null;
                                                                    break;
                                                                }
                                                            }
                                                            if (o76Var != null) {
                                                                z2 = false;
                                                            } else {
                                                                o76Var = new o76(i28, arrayList4);
                                                                z2 = true;
                                                            }
                                                            arrayList4.add(o76Var);
                                                        }
                                                        if (!z2) {
                                                            Object g = ja4Var3.g(fb6Var);
                                                            if (g == null) {
                                                                g = null;
                                                            }
                                                        }
                                                        fb6 fb6Var3 = bb6.d;
                                                        if (nb3.k(fb6Var, fb6Var3)) {
                                                            obj2.getClass();
                                                            String str3 = (String) obj2;
                                                            boolean c = ja4Var3.c(fb6Var3);
                                                            int i39 = i29;
                                                            if (c) {
                                                                zeVar.F(i28, i39, str3);
                                                            }
                                                        } else {
                                                            int i40 = i29;
                                                            if (nb3.k(fb6Var, bb6.b)) {
                                                                E(zeVar, zeVar.A(i28), 2048, num7, i40);
                                                                E(zeVar, zeVar.A(i28), 2048, num8, i40);
                                                            } else if (nb3.k(fb6Var, bb6.K)) {
                                                                E(zeVar, zeVar.A(i28), 2048, 8192, 8);
                                                                E(zeVar, zeVar.A(i28), 2048, num8, 8);
                                                            } else if (nb3.k(fb6Var, bb6.M)) {
                                                                E(zeVar, zeVar.A(i28), 2048, 3072, 8);
                                                            } else if (nb3.k(fb6Var, bb6.c)) {
                                                                E(zeVar, zeVar.A(i28), 2048, num7, 8);
                                                                E(zeVar, zeVar.A(i28), 2048, num8, 8);
                                                            } else {
                                                                fb6 fb6Var4 = bb6.J;
                                                                arrayList3 = arrayList5;
                                                                if (nb3.k(fb6Var, fb6Var4)) {
                                                                    Object g2 = ja4Var4.g(bb6.z);
                                                                    if (g2 == null) {
                                                                        g2 = null;
                                                                    }
                                                                    mq5 mq5Var = (mq5) g2;
                                                                    if (mq5Var == null || mq5Var.a != 4) {
                                                                        i12 = i33;
                                                                        sm3Var2 = sm3Var4;
                                                                        E(zeVar, zeVar.A(i28), 2048, num7, 8);
                                                                        E(zeVar, zeVar.A(i28), 2048, num8, 8);
                                                                    } else {
                                                                        Object g3 = ja4Var4.g(fb6Var4);
                                                                        if (g3 == null) {
                                                                            g3 = null;
                                                                        }
                                                                        if (nb3.k(g3, Boolean.TRUE)) {
                                                                            AccessibilityEvent o = zeVar.o(zeVar.A(i28), 4);
                                                                            xa6 xa6Var3 = xa6Var2;
                                                                            sm3Var2 = sm3Var4;
                                                                            xa6 xa6Var4 = new xa6(xa6Var3.a, true, sm3Var2, ta6Var4);
                                                                            Object g4 = xa6Var4.k().A.g(bb6.a);
                                                                            if (g4 == null) {
                                                                                g4 = null;
                                                                            }
                                                                            List list = (List) g4;
                                                                            xa6Var2 = xa6Var3;
                                                                            String str4 = null;
                                                                            if (list != null) {
                                                                                str4 = ex3.a(62, null, ",", list);
                                                                            }
                                                                            Object g5 = xa6Var4.k().A.g(bb6.C);
                                                                            if (g5 == null) {
                                                                                g5 = null;
                                                                            }
                                                                            List list2 = (List) g5;
                                                                            i12 = i33;
                                                                            if (list2 != null) {
                                                                                str2 = ex3.a(62, null, ",", list2);
                                                                            } else {
                                                                                str2 = null;
                                                                            }
                                                                            if (str4 != null) {
                                                                                o.setContentDescription(str4);
                                                                            }
                                                                            if (str2 != null) {
                                                                                o.getText().add(str2);
                                                                            }
                                                                            zeVar.C(o);
                                                                        } else {
                                                                            i12 = i33;
                                                                            sm3Var2 = sm3Var4;
                                                                            E(zeVar, zeVar.A(i28), 2048, num8, 8);
                                                                        }
                                                                    }
                                                                } else {
                                                                    i12 = i33;
                                                                    sm3Var2 = sm3Var4;
                                                                    if (nb3.k(fb6Var, bb6.a)) {
                                                                        int A = zeVar.A(i28);
                                                                        obj2.getClass();
                                                                        zeVar.D(A, 2048, 4, (List) obj2);
                                                                    } else {
                                                                        fb6 fb6Var5 = bb6.G;
                                                                        String str5 = "";
                                                                        if (nb3.k(fb6Var, fb6Var5)) {
                                                                            if (ja4Var4.c(sa6.k)) {
                                                                                Object g6 = ja4Var3.g(fb6Var5);
                                                                                if (g6 == null) {
                                                                                    g6 = null;
                                                                                }
                                                                                fp fpVar = (fp) g6;
                                                                                if (fpVar == null) {
                                                                                    fpVar = "";
                                                                                }
                                                                                Object g7 = ja4Var4.g(fb6Var5);
                                                                                if (g7 == null) {
                                                                                    g7 = null;
                                                                                }
                                                                                fp fpVar2 = (fp) g7;
                                                                                if (fpVar2 == null) {
                                                                                    fpVar2 = "";
                                                                                }
                                                                                CharSequence P = P(fpVar2);
                                                                                int length3 = fpVar.length();
                                                                                int length4 = fpVar2.length();
                                                                                if (length3 > length4) {
                                                                                    i17 = length4;
                                                                                } else {
                                                                                    i17 = length3;
                                                                                }
                                                                                Integer num9 = num8;
                                                                                int i41 = 0;
                                                                                while (true) {
                                                                                    num5 = num7;
                                                                                    if (i41 < i17) {
                                                                                        i18 = length3;
                                                                                        if (fpVar.charAt(i41) != fpVar2.charAt(i41)) {
                                                                                            break;
                                                                                        }
                                                                                        i41++;
                                                                                        length3 = i18;
                                                                                        num7 = num5;
                                                                                    } else {
                                                                                        i18 = length3;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                int i42 = 0;
                                                                                while (true) {
                                                                                    if (i42 < i17 - i41) {
                                                                                        i19 = i42;
                                                                                        if (fpVar.charAt((i18 - 1) - i42) != fpVar2.charAt((length4 - 1) - i19)) {
                                                                                            break;
                                                                                        }
                                                                                        i42 = i19 + 1;
                                                                                    } else {
                                                                                        i19 = i42;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                int i43 = (i18 - i19) - i41;
                                                                                int i44 = (length4 - i19) - i41;
                                                                                fb6 fb6Var6 = bb6.L;
                                                                                boolean c2 = ja4Var3.c(fb6Var6);
                                                                                boolean c3 = ja4Var4.c(fb6Var6);
                                                                                boolean c4 = ja4Var3.c(bb6.G);
                                                                                if (c4 && !c2 && c3) {
                                                                                    z3 = true;
                                                                                } else {
                                                                                    z3 = false;
                                                                                }
                                                                                if (c4 && c2 && !c3) {
                                                                                    z4 = true;
                                                                                } else {
                                                                                    z4 = false;
                                                                                }
                                                                                if (!z3 && !z4) {
                                                                                    p = zeVar.o(zeVar.A(i28), 16);
                                                                                    p.setFromIndex(i41);
                                                                                    p.setRemovedCount(i43);
                                                                                    p.setAddedCount(i44);
                                                                                    p.setBeforeText(fpVar);
                                                                                    p.getText().add(P);
                                                                                    i15 = i28;
                                                                                    ja4Var2 = ja4Var3;
                                                                                    num8 = num9;
                                                                                } else {
                                                                                    ja4Var2 = ja4Var3;
                                                                                    i15 = i28;
                                                                                    num8 = num9;
                                                                                    p = zeVar.p(zeVar.A(i28), num8, num9, Integer.valueOf(length4), P);
                                                                                }
                                                                                p.setClassName("android.widget.EditText");
                                                                                zeVar.C(p);
                                                                                if (z3 || z4) {
                                                                                    long j5 = ((k47) ta6Var4.c(bb6.H)).a;
                                                                                    p.setFromIndex((int) (j5 >> 32));
                                                                                    p.setToIndex((int) (j5 & 4294967295L));
                                                                                    zeVar.C(p);
                                                                                }
                                                                            } else {
                                                                                i15 = i28;
                                                                                ja4Var2 = ja4Var3;
                                                                                num5 = num7;
                                                                                E(zeVar, zeVar.A(i15), 2048, Integer.valueOf(i23), 8);
                                                                            }
                                                                            num6 = num8;
                                                                            i14 = i36;
                                                                        } else {
                                                                            i15 = i28;
                                                                            ja4Var2 = ja4Var3;
                                                                            num5 = num7;
                                                                            i14 = i36;
                                                                            fb6 fb6Var7 = bb6.H;
                                                                            if (nb3.k(fb6Var, fb6Var7)) {
                                                                                Object g8 = ja4Var4.g(fb6Var5);
                                                                                if (g8 == null) {
                                                                                    g8 = null;
                                                                                }
                                                                                fp fpVar3 = (fp) g8;
                                                                                if (fpVar3 != null && (str = fpVar3.B) != null) {
                                                                                    str5 = str;
                                                                                }
                                                                                long j6 = ((k47) ta6Var4.c(fb6Var7)).a;
                                                                                num6 = num8;
                                                                                zeVar = this;
                                                                                zeVar.C(zeVar.p(zeVar.A(i15), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str5.length()), P(str5)));
                                                                                zeVar.G(i30);
                                                                            } else {
                                                                                num6 = num8;
                                                                                if (!nb3.k(fb6Var, fb6Var2) && !nb3.k(fb6Var, bb6.w)) {
                                                                                    if (nb3.k(fb6Var, bb6.l)) {
                                                                                        obj2.getClass();
                                                                                        if (((Boolean) obj2).booleanValue()) {
                                                                                            i16 = 8;
                                                                                            zeVar.C(zeVar.o(zeVar.A(i30), 8));
                                                                                        } else {
                                                                                            i16 = 8;
                                                                                        }
                                                                                        E(zeVar, zeVar.A(i30), 2048, num6, i16);
                                                                                    } else {
                                                                                        fb6 fb6Var8 = sa6.x;
                                                                                        if (nb3.k(fb6Var, fb6Var8)) {
                                                                                            List list3 = (List) ta6Var4.c(fb6Var8);
                                                                                            Object g9 = ja4Var2.g(fb6Var8);
                                                                                            if (g9 == null) {
                                                                                                g9 = null;
                                                                                            }
                                                                                            List list4 = (List) g9;
                                                                                            if (list4 != null) {
                                                                                                ka4 ka4Var = c66.a;
                                                                                                ka4 ka4Var2 = new ka4();
                                                                                                if (list3.size() <= 0) {
                                                                                                    ka4 ka4Var3 = new ka4();
                                                                                                    if (list4.size() <= 0) {
                                                                                                        z = !ka4Var2.equals(ka4Var3);
                                                                                                    } else {
                                                                                                        list4.get(0).getClass();
                                                                                                        u34.a();
                                                                                                        return;
                                                                                                    }
                                                                                                } else {
                                                                                                    list3.get(0).getClass();
                                                                                                    u34.a();
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            if (obj2 instanceof y1) {
                                                                                                y1 y1Var = (y1) obj2;
                                                                                                Object g10 = ja4Var2.g(fb6Var);
                                                                                                if (g10 == null) {
                                                                                                    g10 = null;
                                                                                                }
                                                                                                if (y1Var != g10) {
                                                                                                    if (g10 instanceof y1) {
                                                                                                        String str6 = y1Var.a;
                                                                                                        y1 y1Var2 = (y1) g10;
                                                                                                        ao2 ao2Var = y1Var2.b;
                                                                                                        if (nb3.k(str6, y1Var2.a)) {
                                                                                                            ao2 ao2Var2 = y1Var.b;
                                                                                                            if (ao2Var2 == null) {
                                                                                                            }
                                                                                                            if (ao2Var2 != null) {
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                z = 0;
                                                                                            }
                                                                                            z = 1;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    zeVar.w(sm3Var2);
                                                                                    int size2 = arrayList4.size();
                                                                                    int i45 = 0;
                                                                                    while (true) {
                                                                                        if (i45 < size2) {
                                                                                            if (((o76) arrayList4.get(i45)).A == i15) {
                                                                                                o76Var2 = (o76) arrayList4.get(i45);
                                                                                                break;
                                                                                            }
                                                                                            i45++;
                                                                                        } else {
                                                                                            o76Var2 = null;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    o76Var2.getClass();
                                                                                    Object g11 = ja4Var4.g(fb6Var2);
                                                                                    if (g11 == null) {
                                                                                        g11 = null;
                                                                                    }
                                                                                    o76Var2.X = (e76) g11;
                                                                                    Object g12 = ja4Var4.g(bb6.w);
                                                                                    if (g12 == null) {
                                                                                        g12 = null;
                                                                                    }
                                                                                    o76Var2.Y = (e76) g12;
                                                                                    if (o76Var2.B.contains(o76Var2)) {
                                                                                        zeVar.R.getSnapshotObserver().a.d(o76Var2, zeVar.I0, new le(1, o76Var2, zeVar));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                num6 = num8;
                                                                i15 = i28;
                                                                ja4Var2 = ja4Var3;
                                                                num5 = num7;
                                                                i14 = i36;
                                                            }
                                                        }
                                                        i15 = i28;
                                                        num5 = num7;
                                                        arrayList3 = arrayList5;
                                                        i12 = i33;
                                                        sm3Var2 = sm3Var4;
                                                        i14 = i36;
                                                        num6 = num8;
                                                        ja4Var2 = ja4Var3;
                                                    } else {
                                                        ta6Var2 = ta6Var3;
                                                        num5 = num7;
                                                        arrayList3 = arrayList5;
                                                        j = j4;
                                                        i12 = i33;
                                                        i13 = i34;
                                                        sm3Var2 = sm3Var4;
                                                        i14 = length2;
                                                        num6 = num8;
                                                        i15 = i28;
                                                        ja4Var2 = ja4Var3;
                                                    }
                                                    i29 = 8;
                                                    i28 = i15;
                                                    sm3Var4 = sm3Var2;
                                                    ta6Var3 = ta6Var2;
                                                    j4 = j >> 8;
                                                    i34 = i13 + 1;
                                                    length2 = i14;
                                                    num8 = num6;
                                                    ja4Var3 = ja4Var2;
                                                    i33 = i12;
                                                    arrayList5 = arrayList3;
                                                    num7 = num5;
                                                }
                                                i9 = i28;
                                                ta6Var = ta6Var3;
                                                num3 = num7;
                                                arrayList2 = arrayList5;
                                                sm3Var = sm3Var4;
                                                i5 = 0;
                                                i8 = 1;
                                                i11 = length2;
                                                num4 = num8;
                                                int i46 = i33;
                                                ja4Var = ja4Var3;
                                                if (i46 != i29) {
                                                    break;
                                                }
                                            } else {
                                                i9 = i28;
                                                ta6Var = ta6Var3;
                                                ja4Var = ja4Var3;
                                                num3 = num7;
                                                arrayList2 = arrayList5;
                                                sm3Var = sm3Var4;
                                                i5 = 0;
                                                i8 = 1;
                                                i11 = length2;
                                                num4 = num8;
                                            }
                                            if (i32 == i11) {
                                                break;
                                            }
                                            num8 = num4;
                                            i28 = i9;
                                            ja4Var3 = ja4Var;
                                            sm3Var4 = sm3Var;
                                            xa6Var = xa6Var2;
                                            ta6Var3 = ta6Var;
                                            arrayList5 = arrayList2;
                                            i29 = 8;
                                            i31 = i32 + 1;
                                            length2 = i11;
                                            num7 = num3;
                                        }
                                    } else {
                                        ta6Var = ta6Var3;
                                        num3 = num7;
                                        arrayList2 = arrayList5;
                                        i4 = i26;
                                        xa6Var2 = xa6Var;
                                        i8 = 1;
                                        num4 = num8;
                                        i9 = i28;
                                        i5 = 0;
                                        z = 0;
                                    }
                                    if (!z) {
                                        Iterator it = ta6Var.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (!xa6Var2.k().A.c((fb6) ((Map.Entry) it.next()).getKey())) {
                                                    i10 = i8;
                                                    break;
                                                }
                                            } else {
                                                i10 = i5;
                                                break;
                                            }
                                        }
                                        z = i10;
                                    }
                                    if (z != 0) {
                                        int A2 = zeVar.A(i9);
                                        i7 = 8;
                                        E(zeVar, A2, 2048, num4, 8);
                                    } else {
                                        i7 = 8;
                                    }
                                    j3 >>= i7;
                                    i27 = i3 + 1;
                                    g93Var2 = g93Var;
                                    i21 = i5;
                                    num8 = num4;
                                    i25 = i7;
                                    iArr3 = iArr2;
                                    jArr3 = jArr2;
                                    i22 = i6;
                                    i26 = i4;
                                    arrayList5 = arrayList2;
                                    num7 = num3;
                                } else {
                                    throw i61.e("no value for specified key");
                                }
                            }
                        }
                        i3 = i27;
                        num3 = num7;
                        arrayList2 = arrayList5;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i4 = i26;
                        i5 = i21;
                        i6 = i22;
                        num4 = num8;
                        i7 = i25;
                        j3 >>= i7;
                        i27 = i3 + 1;
                        g93Var2 = g93Var;
                        i21 = i5;
                        num8 = num4;
                        i25 = i7;
                        iArr3 = iArr2;
                        jArr3 = jArr2;
                        i22 = i6;
                        i26 = i4;
                        arrayList5 = arrayList2;
                        num7 = num3;
                    }
                    num = num7;
                    arrayList = arrayList5;
                    iArr = iArr3;
                    jArr = jArr3;
                    i = i21;
                    int i47 = i22;
                    num2 = num8;
                    if (i26 == i25) {
                        i2 = i47;
                    } else {
                        return;
                    }
                } else {
                    num = num7;
                    arrayList = arrayList5;
                    iArr = iArr3;
                    jArr = jArr3;
                    i = i21;
                    num2 = num8;
                    i2 = i22;
                }
                if (i2 != i24) {
                    i22 = i2 + 1;
                    g93Var2 = g93Var;
                    length = i24;
                    i21 = i;
                    num8 = num2;
                    i20 = i23;
                    iArr3 = iArr;
                    jArr3 = jArr;
                    arrayList5 = arrayList;
                    num7 = num;
                } else {
                    return;
                }
            }
        }
    }

    public final void I(sm3 sm3Var, q94 q94Var) {
        ta6 x;
        if (sm3Var.H() && !this.R.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(sm3Var)) {
            sm3 sm3Var2 = null;
            if (!sm3Var.B0.g(8)) {
                sm3Var = sm3Var.v();
                while (true) {
                    if (sm3Var != null) {
                        if (sm3Var.B0.g(8)) {
                            break;
                        }
                        sm3Var = sm3Var.v();
                    } else {
                        sm3Var = null;
                        break;
                    }
                }
            }
            if (sm3Var != null && (x = sm3Var.x()) != null) {
                if (!x.L) {
                    sm3 v = sm3Var.v();
                    while (true) {
                        if (v != null) {
                            ta6 x2 = v.x();
                            if (x2 != null && x2.L) {
                                sm3Var2 = v;
                                break;
                            }
                            v = v.v();
                        } else {
                            break;
                        }
                    }
                    if (sm3Var2 != null) {
                        sm3Var = sm3Var2;
                    }
                }
                int i = sm3Var.B;
                if (q94Var.a(i)) {
                    E(this, A(i), 2048, 1, 8);
                }
            }
        }
    }

    public final void J(sm3 sm3Var) {
        if (sm3Var.H() && !this.R.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(sm3Var)) {
            int i = sm3Var.B;
            e76 e76Var = (e76) this.l0.b(i);
            e76 e76Var2 = (e76) this.m0.b(i);
            if (e76Var == null && e76Var2 == null) {
                return;
            }
            AccessibilityEvent o = o(i, 4096);
            if (e76Var != null) {
                o.setScrollX((int) ((Number) e76Var.a.c()).floatValue());
                o.setMaxScrollX((int) ((Number) e76Var.b.c()).floatValue());
            }
            if (e76Var2 != null) {
                o.setScrollY((int) ((Number) e76Var2.a.c()).floatValue());
                o.setMaxScrollY((int) ((Number) e76Var2.b.c()).floatValue());
            }
            C(o);
        }
    }

    public final boolean K(xa6 xa6Var, int i, int i2, boolean z) {
        String t;
        Integer num;
        Integer num2;
        ta6 ta6Var = xa6Var.d;
        int i3 = xa6Var.f;
        fb6 fb6Var = sa6.j;
        boolean z2 = false;
        if (ta6Var.A.c(fb6Var) && n16.i(xa6Var)) {
            fo2 fo2Var = (fo2) ((y1) xa6Var.d.c(fb6Var)).b;
            if (fo2Var != null) {
                return ((Boolean) fo2Var.e(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.p0) && (t = t(xa6Var)) != null) {
            this.p0 = (i < 0 || i != i2 || i2 > t.length()) ? -1 : -1;
            if (t.length() > 0) {
                z2 = true;
            }
            int A = A(i3);
            Integer num3 = null;
            if (z2) {
                num = Integer.valueOf(this.p0);
            } else {
                num = null;
            }
            if (z2) {
                num2 = Integer.valueOf(this.p0);
            } else {
                num2 = null;
            }
            if (z2) {
                num3 = Integer.valueOf(t.length());
            }
            C(p(A, num, num2, num3, t));
            G(i3);
            return true;
        }
        return false;
    }

    public final Rect M(float f, float f2, float f3, float f4) {
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        te teVar = this.R;
        long r = teVar.r((Float.floatToRawIntBits(f2) & 4294967295L) | (floatToRawIntBits << 32));
        long r2 = teVar.r((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (r >> 32);
        int i2 = (int) (r2 >> 32);
        int i3 = (int) (r & 4294967295L);
        int i4 = (int) (r2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x013f, code lost:
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0149, code lost:
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x014b, code lost:
        r25 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int i3;
        char c2;
        xa6 xa6Var;
        q94 q94Var = new q94();
        q94 q94Var2 = this.w0;
        int[] iArr = q94Var2.b;
        long[] jArr3 = q94Var2.a;
        int length = jArr3.length - 2;
        p94 p94Var = this.C0;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i5];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j5 & 255) < 128) {
                            int i8 = iArr[(i5 << 3) + i7];
                            c2 = c3;
                            za6 za6Var = (za6) s().b(i8);
                            String str = null;
                            if (za6Var != null) {
                                xa6Var = za6Var.a;
                            } else {
                                xa6Var = null;
                            }
                            if (xa6Var != null) {
                                if (xa6Var.d.A.c(bb6.d)) {
                                }
                            }
                            q94Var.a(i8);
                            ya6 ya6Var = (ya6) p94Var.b(i8);
                            if (ya6Var != null) {
                                Object g = ya6Var.a.A.g(bb6.d);
                                if (g != null) {
                                    str = g;
                                }
                                str = str;
                            }
                            F(i8, 32, str);
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i7++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = q94Var.b;
        long[] jArr4 = q94Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j6 = jArr4[i9];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j6 & j2) < j) {
                            int i12 = iArr2[(i9 << 3) + i11];
                            int hashCode = Integer.hashCode(i12) * (-862048943);
                            int i13 = hashCode ^ (hashCode << 16);
                            int i14 = i13 & 127;
                            int i15 = q94Var2.c;
                            int i16 = (i13 >>> 7) & i15;
                            i = i4;
                            int i17 = 0;
                            while (true) {
                                long[] jArr5 = q94Var2.a;
                                int i18 = i16 >> 3;
                                jArr2 = jArr4;
                                int i19 = (i16 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i18] >>> i19) | ((jArr5[i18 + 1] << (64 - i19)) & ((-i19) >> 63));
                                int i20 = i15;
                                long j8 = (i14 * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    i3 = (i16 + (Long.numberOfTrailingZeros(j9) >> 3)) & i20;
                                    int i21 = i20;
                                    if (q94Var2.b[i3] == i12) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i20 = i21;
                                }
                                i17 += 8;
                                i16 = (i16 + i17) & i2;
                                jArr4 = jArr2;
                                i15 = i2;
                                j6 = j4;
                            }
                            int i22 = i3;
                            if (i22 >= 0) {
                                q94Var2.g(i22);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i4;
                        }
                        j6 = j4 >> i;
                        i11++;
                        i4 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i10 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                jArr4 = jArr;
                i4 = 8;
            }
        }
        p94Var.c();
        g93 s = s();
        int[] iArr3 = s.b;
        Object[] objArr = s.c;
        long[] jArr6 = s.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i23 = 0;
            while (true) {
                long j10 = jArr6[i23];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i24 = 8 - ((~(i23 - length3)) >>> 31);
                    for (int i25 = 0; i25 < i24; i25++) {
                        if ((j10 & j2) < j) {
                            int i26 = (i23 << 3) + i25;
                            int i27 = iArr3[i26];
                            xa6 xa6Var2 = ((za6) objArr[i26]).a;
                            ta6 ta6Var = xa6Var2.d;
                            fb6 fb6Var = bb6.d;
                            if (ta6Var.A.c(fb6Var) && q94Var2.a(i27)) {
                                F(i27, 16, (String) xa6Var2.d.c(fb6Var));
                            }
                            p94Var.i(i27, new ya6(xa6Var2, s()));
                        }
                        j10 >>= 8;
                    }
                    if (i24 != 8) {
                        break;
                    }
                }
                if (i23 == length3) {
                    break;
                }
                i23++;
            }
        }
        this.D0 = new ya6(this.R.getSemanticsOwner().a(), s());
    }

    @Override // defpackage.b2
    public final os0 b(View view) {
        return this.f0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(int i, v2 v2Var, String str, Bundle bundle) {
        xa6 xa6Var;
        ke6 ke6Var;
        ke6 ke6Var2;
        ke6 ke6Var3;
        ke6 ke6Var4;
        CharSequence charSequence;
        int i2;
        of5 of5Var;
        int i3;
        int i4;
        te teVar;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = v2Var.a;
        za6 za6Var = (za6) s().b(i);
        if (za6Var != null && (xa6Var = za6Var.a) != null) {
            sm3 sm3Var = xa6Var.c;
            ta6 ta6Var = xa6Var.d;
            ja4 ja4Var = ta6Var.A;
            String t = t(xa6Var);
            if (nb3.k(str, this.z0)) {
                int d = this.x0.d(i);
                if (d != -1) {
                    accessibilityNodeInfo.getExtras().putInt(str, d);
                }
            } else if (nb3.k(str, this.A0)) {
                int d2 = this.y0.d(i);
                if (d2 != -1) {
                    accessibilityNodeInfo.getExtras().putInt(str, d2);
                }
            } else {
                boolean c = ja4Var.c(sa6.a);
                te teVar2 = this.R;
                eg4 eg4Var = null;
                if (c && bundle != null && nb3.k(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                    int i6 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                    if (i6 > 0 && i5 >= 0) {
                        if (t != null) {
                            i2 = t.length();
                        } else {
                            i2 = Integer.MAX_VALUE;
                        }
                        if (i5 < i2) {
                            a47 E = ln2.E(ta6Var);
                            if (E != null) {
                                ArrayList arrayList = new ArrayList();
                                int i7 = 0;
                                while (i7 < i6) {
                                    int i8 = i5 + i7;
                                    if (i8 >= E.a.a.B.length()) {
                                        arrayList.add(eg4Var);
                                        i3 = i5;
                                        i4 = i6;
                                        teVar = teVar2;
                                    } else {
                                        of5 b = E.b(i8);
                                        eg4 d3 = xa6Var.d();
                                        long j = 0;
                                        if (d3 != null) {
                                            if (!d3.Y0().j0) {
                                                d3 = eg4Var;
                                            }
                                            if (d3 != null) {
                                                j = d3.P(0L);
                                            }
                                        }
                                        of5 i9 = b.i(j);
                                        of5 g = xa6Var.g();
                                        if (i9.g(g)) {
                                            of5Var = i9.e(g);
                                        } else {
                                            of5Var = eg4Var;
                                        }
                                        if (of5Var != 0) {
                                            float f = of5Var.a;
                                            long r = teVar2.r((Float.floatToRawIntBits(of5Var.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                                            teVar = teVar2;
                                            long r2 = teVar.r((Float.floatToRawIntBits(of5Var.d) & 4294967295L) | (Float.floatToRawIntBits(of5Var.c) << 32));
                                            int i10 = (int) (r >> 32);
                                            i3 = i5;
                                            i4 = i6;
                                            int i11 = (int) (r2 >> 32);
                                            int i12 = (int) (r & 4294967295L);
                                            int i13 = (int) (r2 & 4294967295L);
                                            rectF = new RectF(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)));
                                        } else {
                                            i3 = i5;
                                            i4 = i6;
                                            teVar = teVar2;
                                            rectF = null;
                                        }
                                        arrayList.add(rectF);
                                    }
                                    i7++;
                                    i6 = i4;
                                    teVar2 = teVar;
                                    i5 = i3;
                                    eg4Var = null;
                                }
                                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                                return;
                            }
                            return;
                        }
                    }
                    Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                    return;
                }
                fb6 fb6Var = bb6.A;
                if (ja4Var.c(fb6Var) && bundle != null && nb3.k(str, "androidx.compose.ui.semantics.testTag")) {
                    Object g2 = ja4Var.g(fb6Var);
                    if (g2 == null) {
                        charSequence = null;
                    } else {
                        charSequence = g2;
                    }
                    String str2 = (String) charSequence;
                    if (str2 != null) {
                        accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    }
                } else if (nb3.k(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, xa6Var.f);
                } else if (nb3.k(str, "androidx.compose.ui.semantics.shapeType")) {
                    Object g3 = ja4Var.g(bb6.Q);
                    if (g3 == null) {
                        ke6Var4 = null;
                    } else {
                        ke6Var4 = g3;
                    }
                    ke6 ke6Var5 = ke6Var4;
                    if (ke6Var5 != null) {
                        Rect rect = new Rect();
                        accessibilityNodeInfo.getBoundsInScreen(rect);
                        of5 u = u(xa6Var, rect, ke6Var5);
                        float f2 = u.b;
                        float f3 = u.a;
                        mp2 a = ke6Var5.a(u.c(), sm3Var.v0, teVar2.getDensity());
                        if (a instanceof qo4) {
                            accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(a, f3, f2));
                        } else if (a instanceof ro4) {
                            accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(a, f3, f2));
                            accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(a));
                        } else if (a instanceof po4) {
                            accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O(a, f3, f2));
                        } else {
                            i.d();
                        }
                    }
                } else if (nb3.k(str, "androidx.compose.ui.semantics.shapeRect")) {
                    Object g4 = ja4Var.g(bb6.Q);
                    if (g4 == null) {
                        ke6Var3 = null;
                    } else {
                        ke6Var3 = g4;
                    }
                    ke6 ke6Var6 = ke6Var3;
                    if (ke6Var6 != null) {
                        Rect rect2 = new Rect();
                        accessibilityNodeInfo.getBoundsInScreen(rect2);
                        of5 u2 = u(xa6Var, rect2, ke6Var6);
                        Rect L = L(ke6Var6.a(u2.c(), sm3Var.v0, teVar2.getDensity()), u2.a, u2.b);
                        if (L != null) {
                            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L);
                        }
                    }
                } else if (nb3.k(str, "androidx.compose.ui.semantics.shapeCorners")) {
                    Object g5 = ja4Var.g(bb6.Q);
                    if (g5 == null) {
                        ke6Var2 = null;
                    } else {
                        ke6Var2 = g5;
                    }
                    ke6 ke6Var7 = ke6Var2;
                    if (ke6Var7 != null) {
                        Rect rect3 = new Rect();
                        accessibilityNodeInfo.getBoundsInScreen(rect3);
                        float[] N = N(ke6Var7.a(u(xa6Var, rect3, ke6Var7).c(), sm3Var.v0, teVar2.getDensity()));
                        if (N != null) {
                            accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N);
                        }
                    }
                } else if (nb3.k(str, "androidx.compose.ui.semantics.shapeRegion")) {
                    Object g6 = ja4Var.g(bb6.Q);
                    if (g6 == null) {
                        ke6Var = null;
                    } else {
                        ke6Var = g6;
                    }
                    ke6 ke6Var8 = ke6Var;
                    if (ke6Var8 != null) {
                        Rect rect4 = new Rect();
                        accessibilityNodeInfo.getBoundsInScreen(rect4);
                        of5 u3 = u(xa6Var, rect4, ke6Var8);
                        Region O = O(ke6Var8.a(u3.c(), sm3Var.v0, teVar2.getDensity()), u3.a, u3.b);
                        if (O != null) {
                            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O);
                        }
                    }
                }
            }
        }
    }

    public final Rect k(za6 za6Var) {
        m93 m93Var = za6Var.b;
        return M(m93Var.a, m93Var.b, m93Var.c, m93Var.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x00bb, code lost:
        if (defpackage.q60.t(r7, r0) == r1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x006f A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:62:0x002c, B:73:0x0056, B:77:0x0067, B:79:0x006f, B:81:0x0078, B:83:0x007d, B:84:0x008c, B:87:0x009b, B:88:0x00a2, B:69:0x0040, B:72:0x0047), top: B:95:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00be  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x00bb -> B:63:0x002f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(s41 s41Var) {
        we weVar;
        int i;
        zu zuVar;
        q94 q94Var;
        n80 n80Var;
        q94 q94Var2;
        n80 n80Var2;
        Object b;
        try {
            if (s41Var instanceof we) {
                weVar = (we) s41Var;
                int i2 = weVar.d0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    weVar.d0 = i2 - Integer.MIN_VALUE;
                    Object obj = weVar.Y;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = weVar.d0;
                    zuVar = this.r0;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                n80Var2 = weVar.X;
                                q94Var2 = weVar.R;
                                oi2.Y(obj);
                                q94Var = q94Var2;
                                n80Var = n80Var2;
                                weVar.R = q94Var;
                                weVar.X = n80Var;
                                weVar.d0 = 1;
                                b = n80Var.b(weVar);
                                if (b == x61Var) {
                                    n80 n80Var3 = n80Var;
                                    q94Var2 = q94Var;
                                    obj = b;
                                    n80Var2 = n80Var3;
                                    if (!((Boolean) obj).booleanValue()) {
                                        n80Var2.c();
                                        if (v()) {
                                            int i3 = zuVar.L;
                                            for (int i4 = 0; i4 < i3; i4++) {
                                                sm3 sm3Var = (sm3) zuVar.B[i4];
                                                I(sm3Var, q94Var2);
                                                J(sm3Var);
                                            }
                                            q94Var2.b();
                                            Handler handler = this.R.getHandler();
                                            if (!this.E0 && handler != null) {
                                                this.E0 = true;
                                                handler.post(this.G0);
                                            }
                                        }
                                        zuVar.clear();
                                        this.l0.c();
                                        this.m0.c();
                                        long j = this.d0;
                                        weVar.R = q94Var2;
                                        weVar.X = n80Var2;
                                        weVar.d0 = 2;
                                    } else {
                                        zuVar.clear();
                                        return jg7.a;
                                    }
                                } else {
                                    return x61Var;
                                }
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            n80Var2 = weVar.X;
                            q94Var2 = weVar.R;
                            oi2.Y(obj);
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        oi2.Y(obj);
                        q94Var = new q94();
                        v80 v80Var = this.s0;
                        v80Var.getClass();
                        n80Var = new n80(v80Var);
                        weVar.R = q94Var;
                        weVar.X = n80Var;
                        weVar.d0 = 1;
                        b = n80Var.b(weVar);
                        if (b == x61Var) {
                        }
                    }
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th) {
            zuVar.clear();
            throw th;
        }
        weVar = new we(this, s41Var);
        Object obj2 = weVar.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = weVar.d0;
        zuVar = this.r0;
    }

    public final boolean m(int i, long j, boolean z) {
        fb6 fb6Var;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (nb3.k(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            g93 s = s();
            if (!jk4.c(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    fb6Var = bb6.w;
                } else if (!z) {
                    fb6Var = bb6.v;
                } else {
                    i.d();
                    return false;
                }
                Object[] objArr = s.c;
                long[] jArr = s.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z6 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    za6 za6Var = (za6) objArr[(i3 << 3) + i6];
                                    m93 m93Var = za6Var.b;
                                    i2 = i4;
                                    float f = m93Var.b;
                                    float f2 = m93Var.c;
                                    float f3 = m93Var.d;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if (intBitsToFloat >= m93Var.a) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (intBitsToFloat < f2) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    boolean z7 = z2 & z3;
                                    if (intBitsToFloat2 >= f) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    boolean z8 = z7 & z4;
                                    if (intBitsToFloat2 < f3) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5 & z8) {
                                        Object g = za6Var.a.d.A.g(fb6Var);
                                        if (g == null) {
                                            g = null;
                                        }
                                        e76 e76Var = (e76) g;
                                        if (e76Var != null) {
                                            on2 on2Var = e76Var.a;
                                            if (i < 0) {
                                                if (((Number) on2Var.c()).floatValue() <= RecyclerView.B1) {
                                                }
                                                z6 = true;
                                            } else {
                                                if (((Number) on2Var.c()).floatValue() >= ((Number) e76Var.b.c()).floatValue()) {
                                                }
                                                z6 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z6;
                            }
                        }
                        if (i3 != length) {
                            i3++;
                        } else {
                            return z6;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.R.getSemanticsOwner().a(), this.D0);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                H(s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    Q();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent o(int i, int i2) {
        za6 za6Var;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        te teVar = this.R;
        obtain.setPackageName(teVar.getContext().getPackageName());
        obtain.setSource(teVar, i);
        if (v() && (za6Var = (za6) s().b(i)) != null) {
            xa6 xa6Var = za6Var.a;
            obtain.setPassword(xa6Var.d.A.c(bb6.L));
            Object g = xa6Var.d.A.g(bb6.o);
            if (g == null) {
                g = null;
            }
            boolean k = nb3.k(g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                c2.k(obtain, k);
            }
        }
        return obtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.e0 = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.e0 = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.Z;
        if (accessibilityManager.isEnabled()) {
            this.e0 = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.R.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.G0);
        AccessibilityManager accessibilityManager = this.Z;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final AccessibilityEvent p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent o = o(i, 8192);
        if (num != null) {
            o.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            o.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            o.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            o.getText().add(charSequence);
        }
        return o;
    }

    public final int q(xa6 xa6Var) {
        ta6 ta6Var = xa6Var.d;
        if (!ta6Var.A.c(bb6.a)) {
            fb6 fb6Var = bb6.H;
            if (ta6Var.A.c(fb6Var)) {
                return (int) (((k47) ta6Var.c(fb6Var)).a & 4294967295L);
            }
        }
        return this.p0;
    }

    public final int r(xa6 xa6Var) {
        ta6 ta6Var = xa6Var.d;
        if (!ta6Var.A.c(bb6.a)) {
            fb6 fb6Var = bb6.H;
            if (ta6Var.A.c(fb6Var)) {
                return (int) (((k47) ta6Var.c(fb6Var)).a >> 32);
            }
        }
        return this.p0;
    }

    public final g93 s() {
        xa6 xa6Var;
        if (this.t0) {
            this.t0 = false;
            te teVar = this.R;
            this.v0 = u24.n(teVar.getSemanticsOwner(), ne.R);
            if (v()) {
                p94 p94Var = this.v0;
                Resources resources = teVar.getContext().getResources();
                n94 n94Var = this.x0;
                n94Var.a();
                n94 n94Var2 = this.y0;
                n94Var2.a();
                za6 za6Var = (za6) p94Var.b(-1);
                if (za6Var != null) {
                    xa6Var = za6Var.a;
                } else {
                    xa6Var = null;
                }
                xa6Var.getClass();
                ArrayList b = hb6.b(xa6Var, new mc(p94Var, 3), new mc(resources, 4), hf.b0(xa6Var));
                int i = 1;
                int size = b.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((xa6) b.get(i - 1)).f;
                        int i3 = ((xa6) b.get(i)).f;
                        n94Var.f(i2, i3);
                        n94Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.v0;
    }

    public final of5 u(xa6 xa6Var, Rect rect, ke6 ke6Var) {
        xe xeVar = new xe(ke6Var);
        sm3 sm3Var = xa6Var.c;
        z64 z64Var = (z64) sm3Var.B0.g;
        va6 va6Var = null;
        if ((z64Var.R & 8) != 0) {
            loop0: while (true) {
                if (z64Var == null) {
                    break;
                }
                if ((z64Var.L & 8) != 0) {
                    z64 z64Var2 = z64Var;
                    ua4 ua4Var = null;
                    while (z64Var2 != null) {
                        if (z64Var2 instanceof va6) {
                            ((va6) z64Var2).A0(xeVar);
                            if (xeVar.A) {
                                va6Var = z64Var2;
                                break loop0;
                            }
                        } else if ((z64Var2.L & 8) != 0 && (z64Var2 instanceof zg1)) {
                            int i = 0;
                            for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                if ((z64Var3.L & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        z64Var2 = z64Var3;
                                    } else {
                                        if (ua4Var == null) {
                                            ua4Var = new ua4(new z64[16]);
                                        }
                                        if (z64Var2 != null) {
                                            ua4Var.b(z64Var2);
                                            z64Var2 = null;
                                        }
                                        ua4Var.b(z64Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        z64Var2 = nc1.A(ua4Var);
                    }
                }
                if ((z64Var.R & 8) == 0) {
                    break;
                }
                z64Var = z64Var.Y;
            }
        }
        va6 va6Var2 = va6Var;
        if (va6Var2 != null && ((z64) va6Var2).A.j0) {
            eg4 e0 = nc1.e0(va6Var2);
            of5 O = ej2.w(e0).O(e0, false);
            Rect M = M(O.a, O.b, O.c, O.d);
            float f = M.left - rect.left;
            float f2 = M.top - rect.top;
            return new of5(f, f2, M.width() + f, M.height() + f2);
        }
        return ej2.k((eg4) sm3Var.B0.e, false);
    }

    public final boolean v() {
        AccessibilityManager accessibilityManager = this.Z;
        if (accessibilityManager.isEnabled()) {
            List<AccessibilityServiceInfo> list = this.e0;
            if (list == null) {
                list = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                this.e0 = list;
            }
            if (!list.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void w(sm3 sm3Var) {
        if (this.r0.add(sm3Var)) {
            this.s0.c(jg7.a);
        }
    }
}

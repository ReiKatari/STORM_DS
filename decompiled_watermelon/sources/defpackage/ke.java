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
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ke */
/* loaded from: classes.dex */
public final class ke extends z1 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final i14 I0;
    public final n85 A0;
    public final j14 B0;
    public jz5 C0;
    public boolean D0;
    public final h14 E0;
    public final m0 F0;
    public final ArrayList G0;
    public final je H0;
    public final ee R;
    public int X = Integer.MIN_VALUE;
    public final je Y = new je(this, 0);
    public final AccessibilityManager Z;
    public long c0;
    public List d0;
    public final fe e0;
    public int f0;
    public int g0;
    public t2 h0;
    public t2 i0;
    public boolean j0;
    public final j14 k0;
    public final j14 l0;
    public final ec6 m0;
    public final ec6 n0;
    public int o0;
    public Integer p0;
    public final hu q0;
    public final q60 r0;
    public boolean s0;
    public ge t0;
    public j14 u0;
    public final k14 v0;
    public final h14 w0;
    public final h14 x0;
    public final String y0;
    public final String z0;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        i14 i14Var = x23.a;
        i14 i14Var2 = new i14(32);
        int i = i14Var2.b;
        if (i >= 0) {
            int i2 = i + 32;
            i14Var2.b(i2);
            int[] iArr2 = i14Var2.a;
            int i3 = i14Var2.b;
            if (i != i3) {
                nu.d0(i2, i, i3, iArr2, iArr2);
            }
            nu.h0(i, 0, 12, iArr, iArr2);
            i14Var2.b += 32;
            I0 = i14Var2;
            return;
        }
        f81.q("");
    }

    public ke(ee eeVar) {
        this.R = eeVar;
        Object systemService = eeVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.Z = (AccessibilityManager) systemService;
        this.c0 = 100L;
        new Handler(Looper.getMainLooper());
        this.e0 = new fe(this, 0);
        this.f0 = Integer.MIN_VALUE;
        this.g0 = Integer.MIN_VALUE;
        this.k0 = new j14();
        this.l0 = new j14();
        this.m0 = new ec6(0);
        this.n0 = new ec6(0);
        this.o0 = -1;
        this.q0 = new hu(0);
        this.r0 = n40.f(1, null, null, 6);
        this.s0 = true;
        j14 j14Var = z23.a;
        j14Var.getClass();
        this.u0 = j14Var;
        this.v0 = new k14();
        this.w0 = new h14();
        this.x0 = new h14();
        this.y0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.z0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.A0 = new n85(16, (byte) 0);
        this.B0 = new j14();
        this.C0 = new jz5(eeVar.getSemanticsOwner().a(), j14Var);
        int i = u23.a;
        this.E0 = new h14();
        eeVar.addOnAttachStateChangeListener(this);
        this.F0 = new m0(2, this);
        this.G0 = new ArrayList();
        this.H0 = new je(this, 1);
    }

    public static /* synthetic */ void E(ke keVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        keVar.D(i, i2, num, null);
    }

    public static Rect L(jk2 jk2Var, float f, float f2) {
        if (!(jk2Var instanceof of4) && !(jk2Var instanceof pf4)) {
            return null;
        }
        y55 v = jk2Var.v();
        return new Rect((int) (v.a + f), (int) (v.b + f2), (int) (v.c + f), (int) (v.d + f2));
    }

    public static float[] N(jk2 jk2Var) {
        if (jk2Var instanceof pf4) {
            ar5 ar5Var = ((pf4) jk2Var).d;
            long j = ar5Var.h;
            long j2 = ar5Var.g;
            long j3 = ar5Var.f;
            long j4 = ar5Var.e;
            return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
        }
        return null;
    }

    public static Region O(jk2 jk2Var, float f, float f2) {
        if (jk2Var instanceof nf4) {
            nf4 nf4Var = (nf4) jk2Var;
            y55 h = nf4Var.v().h(f, f2);
            Region region = new Region(new Rect((int) (h.a + RecyclerView.A1), (int) (h.b + RecyclerView.A1), (int) (h.c + RecyclerView.A1), (int) (h.d + RecyclerView.A1)));
            Region region2 = new Region();
            vi viVar = nf4Var.d;
            if (viVar instanceof vi) {
                Path path = viVar.a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            vd6.i("Unable to obtain android.graphics.Path");
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

    public static String t(iz5 iz5Var) {
        to toVar;
        if (iz5Var != null) {
            ez5 ez5Var = iz5Var.d;
            d24 d24Var = ez5Var.A;
            qz5 qz5Var = mz5.a;
            if (d24Var.c(qz5Var)) {
                return dq3.a(62, null, ",", (List) ez5Var.d(qz5Var));
            }
            qz5 qz5Var2 = mz5.G;
            if (d24Var.c(qz5Var2)) {
                Object g = d24Var.g(qz5Var2);
                if (g == null) {
                    g = null;
                }
                to toVar2 = (to) g;
                if (toVar2 != null) {
                    return toVar2.B;
                }
            } else {
                Object g2 = d24Var.g(mz5.C);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null && (toVar = (to) tq0.M0(list)) != null) {
                    return toVar.B;
                }
            }
        }
        return null;
    }

    public static final boolean x(rv5 rv5Var, float f) {
        ki2 ki2Var = rv5Var.a;
        if (f >= RecyclerView.A1 || ((Number) ki2Var.c()).floatValue() <= RecyclerView.A1) {
            if (f > RecyclerView.A1 && ((Number) ki2Var.c()).floatValue() < ((Number) rv5Var.b.c()).floatValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean y(rv5 rv5Var) {
        ki2 ki2Var = rv5Var.a;
        if (((Number) ki2Var.c()).floatValue() > RecyclerView.A1) {
            return true;
        }
        ((Number) ki2Var.c()).floatValue();
        ((Number) rv5Var.b.c()).floatValue();
        return false;
    }

    public static final boolean z(rv5 rv5Var) {
        ki2 ki2Var = rv5Var.a;
        if (((Number) ki2Var.c()).floatValue() < ((Number) rv5Var.b.c()).floatValue()) {
            return true;
        }
        ((Number) ki2Var.c()).floatValue();
        return false;
    }

    public final int A(int i) {
        if (i == this.R.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    public final void B(iz5 iz5Var, jz5 jz5Var) {
        int[] iArr = h33.a;
        k14 k14Var = new k14();
        List j = iz5.j(4, iz5Var);
        vf3 vf3Var = iz5Var.c;
        int size = j.size();
        for (int i = 0; i < size; i++) {
            y23 s = s();
            int i2 = ((iz5) j.get(i)).f;
            if (s.a(i2)) {
                if (!jz5Var.b.c(i2)) {
                    w(vf3Var);
                    return;
                }
                k14Var.a(i2);
            }
        }
        k14 k14Var2 = jz5Var.b;
        int[] iArr2 = k14Var2.b;
        long[] jArr = k14Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128 && !k14Var.c(iArr2[(i3 << 3) + i5])) {
                            w(vf3Var);
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
        List j3 = iz5.j(4, iz5Var);
        int size2 = j3.size();
        for (int i6 = 0; i6 < size2; i6++) {
            iz5 iz5Var2 = (iz5) j3.get(i6);
            jz5 jz5Var2 = (jz5) this.B0.b(iz5Var2.f);
            if (jz5Var2 != null && s().a(iz5Var2.f)) {
                B(iz5Var2, jz5Var2);
            }
        }
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.j0 = true;
        }
        try {
            return ((Boolean) this.Y.n(accessibilityEvent)).booleanValue();
        } finally {
            this.j0 = false;
        }
    }

    public final boolean D(int i, int i2, Integer num, List list) {
        if (i != Integer.MIN_VALUE && v()) {
            AccessibilityEvent o = o(i, i2);
            if (num != null) {
                o.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                o.setContentDescription(dq3.a(62, null, ",", list));
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
        ge geVar = this.t0;
        if (geVar != null) {
            iz5 iz5Var = geVar.a;
            if (i != iz5Var.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - geVar.f <= 1000) {
                AccessibilityEvent o = o(A(iz5Var.f), 131072);
                o.setFromIndex(geVar.d);
                o.setToIndex(geVar.e);
                o.setAction(geVar.b);
                o.setMovementGranularity(geVar.c);
                o.getText().add(t(iz5Var));
                C(o);
            }
        }
        this.t0 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:359:0x0127, code lost:
        if (defpackage.b53.x(r1, r13) != false) goto L36;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(defpackage.y23 r57) {
        /*
            Method dump skipped, instructions count: 1646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke.H(y23):void");
    }

    public final void I(vf3 vf3Var, k14 k14Var) {
        ez5 w;
        if (vf3Var.H() && !this.R.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(vf3Var)) {
            vf3 vf3Var2 = null;
            if (!vf3Var.A0.g(8)) {
                vf3Var = vf3Var.u();
                while (true) {
                    if (vf3Var != null) {
                        if (vf3Var.A0.g(8)) {
                            break;
                        }
                        vf3Var = vf3Var.u();
                    } else {
                        vf3Var = null;
                        break;
                    }
                }
            }
            if (vf3Var != null && (w = vf3Var.w()) != null) {
                if (!w.L) {
                    vf3 u = vf3Var.u();
                    while (true) {
                        if (u != null) {
                            ez5 w2 = u.w();
                            if (w2 != null && w2.L) {
                                vf3Var2 = u;
                                break;
                            }
                            u = u.u();
                        } else {
                            break;
                        }
                    }
                    if (vf3Var2 != null) {
                        vf3Var = vf3Var2;
                    }
                }
                int i = vf3Var.B;
                if (k14Var.a(i)) {
                    E(this, A(i), 2048, 1, 8);
                }
            }
        }
    }

    public final void J(vf3 vf3Var) {
        if (vf3Var.H() && !this.R.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(vf3Var)) {
            int i = vf3Var.B;
            rv5 rv5Var = (rv5) this.k0.b(i);
            rv5 rv5Var2 = (rv5) this.l0.b(i);
            if (rv5Var == null && rv5Var2 == null) {
                return;
            }
            AccessibilityEvent o = o(i, 4096);
            if (rv5Var != null) {
                o.setScrollX((int) ((Number) rv5Var.a.c()).floatValue());
                o.setMaxScrollX((int) ((Number) rv5Var.b.c()).floatValue());
            }
            if (rv5Var2 != null) {
                o.setScrollY((int) ((Number) rv5Var2.a.c()).floatValue());
                o.setMaxScrollY((int) ((Number) rv5Var2.b.c()).floatValue());
            }
            C(o);
        }
    }

    public final boolean K(iz5 iz5Var, int i, int i2, boolean z) {
        String t;
        Integer num;
        Integer num2;
        ez5 ez5Var = iz5Var.d;
        int i3 = iz5Var.f;
        qz5 qz5Var = dz5.j;
        boolean z2 = false;
        if (ez5Var.A.c(qz5Var) && a53.k(iz5Var)) {
            bj2 bj2Var = (bj2) ((w1) iz5Var.d.d(qz5Var)).b;
            if (bj2Var != null) {
                return ((Boolean) bj2Var.i(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.o0) && (t = t(iz5Var)) != null) {
            this.o0 = (i < 0 || i != i2 || i2 > t.length()) ? -1 : -1;
            if (t.length() > 0) {
                z2 = true;
            }
            int A = A(i3);
            Integer num3 = null;
            if (z2) {
                num = Integer.valueOf(this.o0);
            } else {
                num = null;
            }
            if (z2) {
                num2 = Integer.valueOf(this.o0);
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
        ee eeVar = this.R;
        long r = eeVar.r((Float.floatToRawIntBits(f2) & 4294967295L) | (floatToRawIntBits << 32));
        long r2 = eeVar.r((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke.Q():void");
    }

    @Override // defpackage.z1
    public final bq0 b(View view) {
        return this.e0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(int i, t2 t2Var, String str, Bundle bundle) {
        iz5 iz5Var;
        y26 y26Var;
        y26 y26Var2;
        y26 y26Var3;
        y26 y26Var4;
        CharSequence charSequence;
        int i2;
        y55 y55Var;
        int i3;
        int i4;
        ee eeVar;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = t2Var.a;
        kz5 kz5Var = (kz5) s().b(i);
        if (kz5Var != null && (iz5Var = kz5Var.a) != null) {
            vf3 vf3Var = iz5Var.c;
            ez5 ez5Var = iz5Var.d;
            d24 d24Var = ez5Var.A;
            String t = t(iz5Var);
            if (b53.x(str, this.y0)) {
                int d = this.w0.d(i);
                if (d != -1) {
                    accessibilityNodeInfo.getExtras().putInt(str, d);
                }
            } else if (b53.x(str, this.z0)) {
                int d2 = this.x0.d(i);
                if (d2 != -1) {
                    accessibilityNodeInfo.getExtras().putInt(str, d2);
                }
            } else {
                boolean c = d24Var.c(dz5.a);
                ee eeVar2 = this.R;
                m74 m74Var = null;
                if (c && bundle != null && b53.x(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                    int i6 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                    if (i6 > 0 && i5 >= 0) {
                        if (t != null) {
                            i2 = t.length();
                        } else {
                            i2 = Preference.DEFAULT_ORDER;
                        }
                        if (i5 < i2) {
                            lr6 B = sn2.B(ez5Var);
                            if (B != null) {
                                ArrayList arrayList = new ArrayList();
                                int i7 = 0;
                                while (i7 < i6) {
                                    int i8 = i5 + i7;
                                    if (i8 >= B.a.a.B.length()) {
                                        arrayList.add(m74Var);
                                        i3 = i5;
                                        i4 = i6;
                                        eeVar = eeVar2;
                                    } else {
                                        y55 b = B.b(i8);
                                        m74 d3 = iz5Var.d();
                                        long j = 0;
                                        if (d3 != null) {
                                            if (!d3.Y0().i0) {
                                                d3 = m74Var;
                                            }
                                            if (d3 != null) {
                                                j = d3.Q(0L);
                                            }
                                        }
                                        y55 i9 = b.i(j);
                                        y55 g = iz5Var.g();
                                        if (i9.g(g)) {
                                            y55Var = i9.e(g);
                                        } else {
                                            y55Var = m74Var;
                                        }
                                        if (y55Var != 0) {
                                            float f = y55Var.a;
                                            long r = eeVar2.r((Float.floatToRawIntBits(y55Var.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                                            eeVar = eeVar2;
                                            long r2 = eeVar.r((Float.floatToRawIntBits(y55Var.d) & 4294967295L) | (Float.floatToRawIntBits(y55Var.c) << 32));
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
                                            eeVar = eeVar2;
                                            rectF = null;
                                        }
                                        arrayList.add(rectF);
                                    }
                                    i7++;
                                    i6 = i4;
                                    eeVar2 = eeVar;
                                    i5 = i3;
                                    m74Var = null;
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
                qz5 qz5Var = mz5.A;
                if (d24Var.c(qz5Var) && bundle != null && b53.x(str, "androidx.compose.ui.semantics.testTag")) {
                    Object g2 = d24Var.g(qz5Var);
                    if (g2 == null) {
                        charSequence = null;
                    } else {
                        charSequence = g2;
                    }
                    String str2 = (String) charSequence;
                    if (str2 != null) {
                        accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    }
                } else if (b53.x(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, iz5Var.f);
                } else if (b53.x(str, "androidx.compose.ui.semantics.shapeType")) {
                    Object g3 = d24Var.g(mz5.Q);
                    if (g3 == null) {
                        y26Var4 = null;
                    } else {
                        y26Var4 = g3;
                    }
                    y26 y26Var5 = y26Var4;
                    if (y26Var5 != null) {
                        Rect rect = new Rect();
                        accessibilityNodeInfo.getBoundsInScreen(rect);
                        y55 u = u(iz5Var, rect, y26Var5);
                        float f2 = u.b;
                        float f3 = u.a;
                        jk2 a = y26Var5.a(u.c(), vf3Var.u0, eeVar2.getDensity());
                        if (a instanceof of4) {
                            accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(a, f3, f2));
                        } else if (a instanceof pf4) {
                            accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(a, f3, f2));
                            accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(a));
                        } else if (a instanceof nf4) {
                            accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O(a, f3, f2));
                        } else {
                            i.c();
                        }
                    }
                } else if (b53.x(str, "androidx.compose.ui.semantics.shapeRect")) {
                    Object g4 = d24Var.g(mz5.Q);
                    if (g4 == null) {
                        y26Var3 = null;
                    } else {
                        y26Var3 = g4;
                    }
                    y26 y26Var6 = y26Var3;
                    if (y26Var6 != null) {
                        Rect rect2 = new Rect();
                        accessibilityNodeInfo.getBoundsInScreen(rect2);
                        y55 u2 = u(iz5Var, rect2, y26Var6);
                        Rect L = L(y26Var6.a(u2.c(), vf3Var.u0, eeVar2.getDensity()), u2.a, u2.b);
                        if (L != null) {
                            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L);
                        }
                    }
                } else if (b53.x(str, "androidx.compose.ui.semantics.shapeCorners")) {
                    Object g5 = d24Var.g(mz5.Q);
                    if (g5 == null) {
                        y26Var2 = null;
                    } else {
                        y26Var2 = g5;
                    }
                    y26 y26Var7 = y26Var2;
                    if (y26Var7 != null) {
                        Rect rect3 = new Rect();
                        accessibilityNodeInfo.getBoundsInScreen(rect3);
                        float[] N = N(y26Var7.a(u(iz5Var, rect3, y26Var7).c(), vf3Var.u0, eeVar2.getDensity()));
                        if (N != null) {
                            accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N);
                        }
                    }
                } else if (b53.x(str, "androidx.compose.ui.semantics.shapeRegion")) {
                    Object g6 = d24Var.g(mz5.Q);
                    if (g6 == null) {
                        y26Var = null;
                    } else {
                        y26Var = g6;
                    }
                    y26 y26Var8 = y26Var;
                    if (y26Var8 != null) {
                        Rect rect4 = new Rect();
                        accessibilityNodeInfo.getBoundsInScreen(rect4);
                        y55 u3 = u(iz5Var, rect4, y26Var8);
                        Region O = O(y26Var8.a(u3.c(), vf3Var.u0, eeVar2.getDensity()), u3.a, u3.b);
                        if (O != null) {
                            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O);
                        }
                    }
                }
            }
        }
    }

    public final Rect k(kz5 kz5Var) {
        e33 e33Var = kz5Var.b;
        return M(e33Var.a, e33Var.b, e33Var.c, e33Var.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x00bb, code lost:
        if (defpackage.dk7.q(r7, r0) == r1) goto L17;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.k11 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.he
            if (r0 == 0) goto L13
            r0 = r11
            he r0 = (defpackage.he) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            he r0 = new he
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.c0
            r3 = 2
            hu r4 = r10.q0
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3c
            if (r2 != r3) goto L35
            i60 r2 = r0.X
            k14 r6 = r0.R
            defpackage.me2.a0(r11)     // Catch: java.lang.Throwable -> L32
        L2f:
            r11 = r6
            r6 = r2
            goto L56
        L32:
            r10 = move-exception
            goto Lc4
        L35:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r10)
            r10 = 0
            return r10
        L3c:
            i60 r2 = r0.X
            k14 r6 = r0.R
            defpackage.me2.a0(r11)     // Catch: java.lang.Throwable -> L32
            goto L67
        L44:
            defpackage.me2.a0(r11)
            k14 r11 = new k14     // Catch: java.lang.Throwable -> L32
            r11.<init>()     // Catch: java.lang.Throwable -> L32
            q60 r2 = r10.r0     // Catch: java.lang.Throwable -> L32
            r2.getClass()     // Catch: java.lang.Throwable -> L32
            i60 r6 = new i60     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L32
        L56:
            r0.R = r11     // Catch: java.lang.Throwable -> L32
            r0.X = r6     // Catch: java.lang.Throwable -> L32
            r0.c0 = r5     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r6.a(r0)     // Catch: java.lang.Throwable -> L32
            if (r2 != r1) goto L63
            goto Lbd
        L63:
            r9 = r6
            r6 = r11
            r11 = r2
            r2 = r9
        L67:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L32
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r11 == 0) goto Lbe
            r2.c()     // Catch: java.lang.Throwable -> L32
            boolean r11 = r10.v()     // Catch: java.lang.Throwable -> L32
            if (r11 == 0) goto La2
            int r11 = r4.L     // Catch: java.lang.Throwable -> L32
            r7 = 0
        L7b:
            if (r7 >= r11) goto L8c
            java.lang.Object[] r8 = r4.B     // Catch: java.lang.Throwable -> L32
            r8 = r8[r7]     // Catch: java.lang.Throwable -> L32
            vf3 r8 = (defpackage.vf3) r8     // Catch: java.lang.Throwable -> L32
            r10.I(r8, r6)     // Catch: java.lang.Throwable -> L32
            r10.J(r8)     // Catch: java.lang.Throwable -> L32
            int r7 = r7 + 1
            goto L7b
        L8c:
            r6.b()     // Catch: java.lang.Throwable -> L32
            ee r11 = r10.R     // Catch: java.lang.Throwable -> L32
            android.os.Handler r11 = r11.getHandler()     // Catch: java.lang.Throwable -> L32
            boolean r7 = r10.D0     // Catch: java.lang.Throwable -> L32
            if (r7 != 0) goto La2
            if (r11 == 0) goto La2
            r10.D0 = r5     // Catch: java.lang.Throwable -> L32
            m0 r7 = r10.F0     // Catch: java.lang.Throwable -> L32
            r11.post(r7)     // Catch: java.lang.Throwable -> L32
        La2:
            r4.clear()     // Catch: java.lang.Throwable -> L32
            j14 r11 = r10.k0     // Catch: java.lang.Throwable -> L32
            r11.c()     // Catch: java.lang.Throwable -> L32
            j14 r11 = r10.l0     // Catch: java.lang.Throwable -> L32
            r11.c()     // Catch: java.lang.Throwable -> L32
            long r7 = r10.c0     // Catch: java.lang.Throwable -> L32
            r0.R = r6     // Catch: java.lang.Throwable -> L32
            r0.X = r2     // Catch: java.lang.Throwable -> L32
            r0.c0 = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r11 = defpackage.dk7.q(r7, r0)     // Catch: java.lang.Throwable -> L32
            if (r11 != r1) goto L2f
        Lbd:
            return r1
        Lbe:
            r4.clear()
            o27 r10 = defpackage.o27.a
            return r10
        Lc4:
            r4.clear()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke.l(k11):java.lang.Object");
    }

    public final boolean m(boolean z, int i, long j) {
        qz5 qz5Var;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (b53.x(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            y23 s = s();
            if (!mb4.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    qz5Var = mz5.w;
                } else if (!z) {
                    qz5Var = mz5.v;
                } else {
                    i.c();
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
                                    kz5 kz5Var = (kz5) objArr[(i3 << 3) + i6];
                                    e33 e33Var = kz5Var.b;
                                    i2 = i4;
                                    float f = e33Var.b;
                                    float f2 = e33Var.c;
                                    float f3 = e33Var.d;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if (intBitsToFloat >= e33Var.a) {
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
                                        Object g = kz5Var.a.d.A.g(qz5Var);
                                        if (g == null) {
                                            g = null;
                                        }
                                        rv5 rv5Var = (rv5) g;
                                        if (rv5Var != null) {
                                            ki2 ki2Var = rv5Var.a;
                                            if (i < 0) {
                                                if (((Number) ki2Var.c()).floatValue() <= RecyclerView.A1) {
                                                }
                                                z6 = true;
                                            } else {
                                                if (((Number) ki2Var.c()).floatValue() >= ((Number) rv5Var.b.c()).floatValue()) {
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
                B(this.R.getSemanticsOwner().a(), this.C0);
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
        kz5 kz5Var;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        ee eeVar = this.R;
        obtain.setPackageName(eeVar.getContext().getPackageName());
        obtain.setSource(eeVar, i);
        if (v() && (kz5Var = (kz5) s().b(i)) != null) {
            iz5 iz5Var = kz5Var.a;
            obtain.setPassword(iz5Var.d.A.c(mz5.L));
            Object g = iz5Var.d.A.g(mz5.o);
            if (g == null) {
                g = null;
            }
            boolean x = b53.x(g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                a2.k(obtain, x);
            }
        }
        return obtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.d0 = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.d0 = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.Z;
        if (accessibilityManager.isEnabled()) {
            this.d0 = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.R.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.F0);
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

    public final int q(iz5 iz5Var) {
        ez5 ez5Var = iz5Var.d;
        if (!ez5Var.A.c(mz5.a)) {
            qz5 qz5Var = mz5.H;
            if (ez5Var.A.c(qz5Var)) {
                return (int) (((vr6) ez5Var.d(qz5Var)).a & 4294967295L);
            }
        }
        return this.o0;
    }

    public final int r(iz5 iz5Var) {
        ez5 ez5Var = iz5Var.d;
        if (!ez5Var.A.c(mz5.a)) {
            qz5 qz5Var = mz5.H;
            if (ez5Var.A.c(qz5Var)) {
                return (int) (((vr6) ez5Var.d(qz5Var)).a >> 32);
            }
        }
        return this.o0;
    }

    public final y23 s() {
        iz5 iz5Var;
        if (this.s0) {
            this.s0 = false;
            ee eeVar = this.R;
            this.u0 = w81.o(eeVar.getSemanticsOwner(), yd.R);
            if (v()) {
                j14 j14Var = this.u0;
                Resources resources = eeVar.getContext().getResources();
                h14 h14Var = this.w0;
                h14Var.a();
                h14 h14Var2 = this.x0;
                h14Var2.a();
                kz5 kz5Var = (kz5) j14Var.b(-1);
                if (kz5Var != null) {
                    iz5Var = kz5Var.a;
                } else {
                    iz5Var = null;
                }
                iz5Var.getClass();
                ArrayList b = sz5.b(iz5Var, new yb(3, j14Var), new yb(4, resources), l07.b0(iz5Var));
                int i = 1;
                int size = b.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((iz5) b.get(i - 1)).f;
                        int i3 = ((iz5) b.get(i)).f;
                        h14Var.f(i2, i3);
                        h14Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.u0;
    }

    public final y55 u(iz5 iz5Var, Rect rect, y26 y26Var) {
        ie ieVar = new ie(y26Var);
        vf3 vf3Var = iz5Var.c;
        yy3 yy3Var = (yy3) vf3Var.A0.g;
        gz5 gz5Var = null;
        if ((yy3Var.R & 8) != 0) {
            loop0: while (true) {
                if (yy3Var == null) {
                    break;
                }
                if ((yy3Var.L & 8) != 0) {
                    yy3 yy3Var2 = yy3Var;
                    o24 o24Var = null;
                    while (yy3Var2 != null) {
                        if (yy3Var2 instanceof gz5) {
                            ((gz5) yy3Var2).p0(ieVar);
                            if (ieVar.A) {
                                gz5Var = yy3Var2;
                                break loop0;
                            }
                        } else if ((yy3Var2.L & 8) != 0 && (yy3Var2 instanceof xc1)) {
                            int i = 0;
                            for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                if ((yy3Var3.L & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        yy3Var2 = yy3Var3;
                                    } else {
                                        if (o24Var == null) {
                                            o24Var = new o24(new yy3[16]);
                                        }
                                        if (yy3Var2 != null) {
                                            o24Var.b(yy3Var2);
                                            yy3Var2 = null;
                                        }
                                        o24Var.b(yy3Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        yy3Var2 = l.p(o24Var);
                    }
                }
                if ((yy3Var.R & 8) == 0) {
                    break;
                }
                yy3Var = yy3Var.Y;
            }
        }
        gz5 gz5Var2 = gz5Var;
        if (gz5Var2 != null && ((yy3) gz5Var2).A.i0) {
            m74 O = l.O(gz5Var2);
            y55 L = me2.s(O).L(O, false);
            Rect M = M(L.a, L.b, L.c, L.d);
            float f = M.left - rect.left;
            float f2 = M.top - rect.top;
            return new y55(f, f2, M.width() + f, M.height() + f2);
        }
        return me2.j((m74) vf3Var.A0.e, false);
    }

    public final boolean v() {
        AccessibilityManager accessibilityManager = this.Z;
        if (accessibilityManager.isEnabled()) {
            List<AccessibilityServiceInfo> list = this.d0;
            if (list == null) {
                list = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                this.d0 = list;
            }
            if (!list.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void w(vf3 vf3Var) {
        if (this.q0.add(vf3Var)) {
            this.r0.c(o27.a);
        }
    }
}

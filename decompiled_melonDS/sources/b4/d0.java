package b4;

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
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends a6.b implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final a1.w I0;
    public final p1.c1 A0;
    public final a1.x B0;
    public q2 C0;
    public boolean D0;
    public final a1.v E0;
    public final a8.f F0;
    public final ArrayList G0;
    public final c0 H0;
    public final x R;
    public int X = Integer.MIN_VALUE;
    public final c0 Y = new c0(this, 0);
    public final AccessibilityManager Z;

    /* renamed from: b0 */
    public long f1808b0;

    /* renamed from: c0 */
    public List f1809c0;

    /* renamed from: d0 */
    public final Handler f1810d0;

    /* renamed from: e0 */
    public final y f1811e0;

    /* renamed from: f0 */
    public int f1812f0;

    /* renamed from: g0 */
    public int f1813g0;

    /* renamed from: h0 */
    public b6.g f1814h0;

    /* renamed from: i0 */
    public b6.g f1815i0;

    /* renamed from: j0 */
    public boolean f1816j0;

    /* renamed from: k0 */
    public final a1.x f1817k0;

    /* renamed from: l0 */
    public final a1.x f1818l0;

    /* renamed from: m0 */
    public final a1.x0 f1819m0;

    /* renamed from: n0 */
    public final a1.x0 f1820n0;

    /* renamed from: o0 */
    public int f1821o0;
    public Integer p0;

    /* renamed from: q0 */
    public final a1.f f1822q0;

    /* renamed from: r0 */
    public final bd.h f1823r0;

    /* renamed from: s0 */
    public boolean f1824s0;

    /* renamed from: t0 */
    public z f1825t0;

    /* renamed from: u0 */
    public a1.x f1826u0;

    /* renamed from: v0 */
    public final a1.y f1827v0;

    /* renamed from: w0 */
    public final a1.v f1828w0;

    /* renamed from: x0 */
    public final a1.v f1829x0;

    /* renamed from: y0 */
    public final String f1830y0;

    /* renamed from: z0 */
    public final String f1831z0;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        a1.w wVar = a1.k.f60a;
        a1.w wVar2 = new a1.w(32);
        int i2 = wVar2.f112b;
        if (i2 >= 0) {
            int i10 = i2 + 32;
            wVar2.b(i10);
            int[] iArr2 = wVar2.f111a;
            int i11 = wVar2.f112b;
            if (i2 != i11) {
                zb.k.g(i10, i2, i11, iArr2, iArr2);
            }
            zb.k.j(i2, 0, 12, iArr, iArr2);
            wVar2.f112b += 32;
            I0 = wVar2;
            return;
        }
        wa.b.f("");
    }

    public d0(x xVar) {
        this.R = xVar;
        Object systemService = xVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.Z = (AccessibilityManager) systemService;
        this.f1808b0 = 100L;
        this.f1810d0 = new Handler(Looper.getMainLooper());
        this.f1811e0 = new y(this, 0);
        this.f1812f0 = Integer.MIN_VALUE;
        this.f1813g0 = Integer.MIN_VALUE;
        this.f1817k0 = new a1.x();
        this.f1818l0 = new a1.x();
        this.f1819m0 = new a1.x0(0);
        this.f1820n0 = new a1.x0(0);
        this.f1821o0 = -1;
        this.f1822q0 = new a1.f(0);
        this.f1823r0 = ij.a.s(1, 6, null);
        this.f1824s0 = true;
        a1.x xVar2 = a1.m.f66a;
        xVar2.getClass();
        this.f1826u0 = xVar2;
        this.f1827v0 = new a1.y();
        this.f1828w0 = new a1.v();
        this.f1829x0 = new a1.v();
        this.f1830y0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f1831z0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.A0 = new p1.c1(8);
        this.B0 = new a1.x();
        this.C0 = new q2(xVar.getSemanticsOwner().a(), xVar2);
        int i2 = a1.j.f56a;
        this.E0 = new a1.v();
        xVar.addOnAttachStateChangeListener(this);
        this.F0 = new a8.f(3, this);
        this.G0 = new ArrayList();
        this.H0 = new c0(this, 1);
    }

    public static /* synthetic */ void E(d0 d0Var, int i2, int i10, Integer num, int i11) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        d0Var.D(i2, i10, num, null);
    }

    public static Rect L(i3.z zVar, float f8, float f10) {
        if (!(zVar instanceof i3.g0) && !(zVar instanceof i3.h0)) {
            return null;
        }
        h3.c l10 = zVar.l();
        return new Rect((int) (l10.f6052a + f8), (int) (l10.f6053b + f10), (int) (l10.f6054c + f8), (int) (l10.f6055d + f10));
    }

    public static float[] N(i3.z zVar) {
        if (zVar instanceof i3.h0) {
            h3.d dVar = ((i3.h0) zVar).f6639f;
            long j2 = dVar.f6063h;
            long j10 = dVar.f6062g;
            long j11 = dVar.f6061f;
            long j12 = dVar.f6060e;
            return new float[]{Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L))};
        }
        return null;
    }

    public static Region O(i3.z zVar, float f8, float f10) {
        if (zVar instanceof i3.f0) {
            i3.f0 f0Var = (i3.f0) zVar;
            h3.c h2 = f0Var.l().h(f8, f10);
            Region region = new Region(new Rect((int) (h2.f6052a + 0.0f), (int) (h2.f6053b + 0.0f), (int) (h2.f6054c + 0.0f), (int) (h2.f6055d + 0.0f)));
            Region region2 = new Region();
            i3.h hVar = f0Var.f6631f;
            if (hVar instanceof i3.h) {
                Path path = hVar.f6635a;
                path.offset(f8, f10);
                region2.setPath(path, region);
                return region2;
            }
            m9.o.v("Unable to obtain android.graphics.Path");
            return null;
        }
        return null;
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i2 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i2 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i2);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String t(i4.p pVar) {
        l4.h hVar;
        if (pVar != null) {
            i4.m mVar = pVar.f6770d;
            a1.m0 m0Var = mVar.A;
            i4.w wVar = i4.t.f6781a;
            if (m0Var.c(wVar)) {
                return z4.a.a((List) mVar.c(wVar), ",", null, 62);
            }
            i4.w wVar2 = i4.t.F;
            if (m0Var.c(wVar2)) {
                Object g10 = m0Var.g(wVar2);
                if (g10 == null) {
                    g10 = null;
                }
                l4.h hVar2 = (l4.h) g10;
                if (hVar2 != null) {
                    return hVar2.B;
                }
            } else {
                Object g11 = m0Var.g(i4.t.B);
                if (g11 == null) {
                    g11 = null;
                }
                List list = (List) g11;
                if (list != null && (hVar = (l4.h) zb.l.T(list)) != null) {
                    return hVar.B;
                }
            }
        }
        return null;
    }

    public static final boolean x(i4.j jVar, float f8) {
        mc.a aVar = jVar.f6723a;
        if (f8 >= 0.0f || ((Number) aVar.b()).floatValue() <= 0.0f) {
            if (f8 > 0.0f && ((Number) aVar.b()).floatValue() < ((Number) jVar.f6724b.b()).floatValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean y(i4.j jVar) {
        mc.a aVar = jVar.f6723a;
        if (((Number) aVar.b()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) aVar.b()).floatValue();
        ((Number) jVar.f6724b.b()).floatValue();
        return false;
    }

    public static final boolean z(i4.j jVar) {
        mc.a aVar = jVar.f6723a;
        if (((Number) aVar.b()).floatValue() < ((Number) jVar.f6724b.b()).floatValue()) {
            return true;
        }
        ((Number) aVar.b()).floatValue();
        return false;
    }

    public final int A(int i2) {
        if (i2 == this.R.getSemanticsOwner().a().f6773g) {
            return -1;
        }
        return i2;
    }

    public final void B(i4.p pVar, q2 q2Var) {
        int[] iArr = a1.n.f73a;
        a1.y yVar = new a1.y();
        List j2 = i4.p.j(4, pVar);
        a4.o0 o0Var = pVar.f6769c;
        int size = j2.size();
        for (int i2 = 0; i2 < size; i2++) {
            a1.l s10 = s();
            int i10 = ((i4.p) j2.get(i2)).f6773g;
            if (s10.a(i10)) {
                if (!q2Var.f1935b.b(i10)) {
                    w(o0Var);
                    return;
                }
                yVar.a(i10);
            }
        }
        a1.y yVar2 = q2Var.f1935b;
        int[] iArr2 = yVar2.f115b;
        long[] jArr = yVar2.f114a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128 && !yVar.b(iArr2[(i11 << 3) + i13])) {
                            w(o0Var);
                            return;
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        List j11 = i4.p.j(4, pVar);
        int size2 = j11.size();
        for (int i14 = 0; i14 < size2; i14++) {
            i4.p pVar2 = (i4.p) j11.get(i14);
            q2 q2Var2 = (q2) this.B0.b(pVar2.f6773g);
            if (q2Var2 != null && s().a(pVar2.f6773g)) {
                B(pVar2, q2Var2);
            }
        }
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f1816j0 = true;
        }
        try {
            return ((Boolean) this.Y.k(accessibilityEvent)).booleanValue();
        } finally {
            this.f1816j0 = false;
        }
    }

    public final boolean D(int i2, int i10, Integer num, List list) {
        if (i2 != Integer.MIN_VALUE && v()) {
            AccessibilityEvent o5 = o(i2, i10);
            if (num != null) {
                o5.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                o5.setContentDescription(z4.a.a(list, ",", null, 62));
            }
            return C(o5);
        }
        return false;
    }

    public final void F(int i2, int i10, String str) {
        AccessibilityEvent o5 = o(A(i2), 32);
        o5.setContentChangeTypes(i10);
        if (str != null) {
            o5.getText().add(str);
        }
        C(o5);
    }

    public final void G(int i2) {
        z zVar = this.f1825t0;
        if (zVar != null) {
            i4.p pVar = zVar.f2028a;
            if (i2 != pVar.f6773g) {
                return;
            }
            if (SystemClock.uptimeMillis() - zVar.f2033f <= 1000) {
                AccessibilityEvent o5 = o(A(pVar.f6773g), 131072);
                o5.setFromIndex(zVar.f2031d);
                o5.setToIndex(zVar.f2032e);
                o5.setAction(zVar.f2029b);
                o5.setMovementGranularity(zVar.f2030c);
                o5.getText().add(t(pVar));
                C(o5);
            }
        }
        this.f1825t0 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:550:0x04ce, code lost:
        if (r1.isEmpty() == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x04fd, code lost:
        if (r12 != null) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0502, code lost:
        if (r12 == null) goto L226;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:575:0x050b  */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.util.Collection, java.util.Set, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.Collection, java.util.Set, java.util.LinkedHashSet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(a1.l r59) {
        /*
            Method dump skipped, instructions count: 1668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.d0.H(a1.l):void");
    }

    public final void I(a4.o0 o0Var, a1.y yVar) {
        i4.m x9;
        if (o0Var.H() && !this.R.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(o0Var)) {
            a4.o0 o0Var2 = null;
            if (!o0Var.A0.d(8)) {
                o0Var = o0Var.u();
                while (true) {
                    if (o0Var != null) {
                        if (o0Var.A0.d(8)) {
                            break;
                        }
                        o0Var = o0Var.u();
                    } else {
                        o0Var = null;
                        break;
                    }
                }
            }
            if (o0Var != null && (x9 = o0Var.x()) != null) {
                if (!x9.L) {
                    a4.o0 u4 = o0Var.u();
                    while (true) {
                        if (u4 != null) {
                            i4.m x10 = u4.x();
                            if (x10 != null && x10.L) {
                                o0Var2 = u4;
                                break;
                            }
                            u4 = u4.u();
                        } else {
                            break;
                        }
                    }
                    if (o0Var2 != null) {
                        o0Var = o0Var2;
                    }
                }
                int i2 = o0Var.B;
                if (yVar.a(i2)) {
                    E(this, A(i2), 2048, 1, 8);
                }
            }
        }
    }

    public final void J(a4.o0 o0Var) {
        if (o0Var.H() && !this.R.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(o0Var)) {
            int i2 = o0Var.B;
            i4.j jVar = (i4.j) this.f1817k0.b(i2);
            i4.j jVar2 = (i4.j) this.f1818l0.b(i2);
            if (jVar == null && jVar2 == null) {
                return;
            }
            AccessibilityEvent o5 = o(i2, 4096);
            if (jVar != null) {
                o5.setScrollX((int) ((Number) jVar.f6723a.b()).floatValue());
                o5.setMaxScrollX((int) ((Number) jVar.f6724b.b()).floatValue());
            }
            if (jVar2 != null) {
                o5.setScrollY((int) ((Number) jVar2.f6723a.b()).floatValue());
                o5.setMaxScrollY((int) ((Number) jVar2.f6724b.b()).floatValue());
            }
            C(o5);
        }
    }

    public final boolean K(i4.p pVar, int i2, int i10, boolean z10) {
        String t5;
        Integer num;
        Integer num2;
        i4.m mVar = pVar.f6770d;
        int i11 = pVar.f6773g;
        i4.w wVar = i4.l.f6749j;
        boolean z11 = false;
        if (mVar.A.c(wVar) && l0.a(pVar)) {
            mc.q qVar = (mc.q) ((i4.a) pVar.f6770d.c(wVar)).f6708b;
            if (qVar != null) {
                return ((Boolean) qVar.i(Integer.valueOf(i2), Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
            }
        } else if ((i2 != i10 || i10 != this.f1821o0) && (t5 = t(pVar)) != null) {
            this.f1821o0 = (i2 < 0 || i2 != i10 || i10 > t5.length()) ? -1 : -1;
            if (t5.length() > 0) {
                z11 = true;
            }
            int A = A(i11);
            Integer num3 = null;
            if (z11) {
                num = Integer.valueOf(this.f1821o0);
            } else {
                num = null;
            }
            if (z11) {
                num2 = Integer.valueOf(this.f1821o0);
            } else {
                num2 = null;
            }
            if (z11) {
                num3 = Integer.valueOf(t5.length());
            }
            C(p(A, num, num2, num3, t5));
            G(i11);
            return true;
        }
        return false;
    }

    public final Rect M(float f8, float f10, float f11, float f12) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
        x xVar = this.R;
        long q10 = xVar.q(floatToRawIntBits);
        long q11 = xVar.q((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
        int i2 = (int) (q10 >> 32);
        int i10 = (int) (q11 >> 32);
        int i11 = (int) (q10 & 4294967295L);
        int i12 = (int) (q11 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i10))), (int) Math.floor(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i10))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12))));
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
        throw new UnsupportedOperationException("Method not decompiled: b4.d0.Q():void");
    }

    @Override // a6.b
    public final a0.b b(View view) {
        return this.f1811e0;
    }

    public final void j(int i2, b6.g gVar, String str, Bundle bundle) {
        i4.p pVar;
        i3.n0 n0Var;
        i3.n0 n0Var2;
        i3.n0 n0Var3;
        i3.n0 n0Var4;
        CharSequence charSequence;
        int i10;
        h3.c cVar;
        x xVar;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f2077a;
        i4.q qVar = (i4.q) s().b(i2);
        if (qVar != null && (pVar = qVar.f6774a) != null) {
            a4.o0 o0Var = pVar.f6769c;
            i4.m mVar = pVar.f6770d;
            a1.m0 m0Var = mVar.A;
            String t5 = t(pVar);
            if (nc.k.a(str, this.f1830y0)) {
                int d4 = this.f1828w0.d(i2);
                if (d4 != -1) {
                    accessibilityNodeInfo.getExtras().putInt(str, d4);
                }
            } else if (nc.k.a(str, this.f1831z0)) {
                int d10 = this.f1829x0.d(i2);
                if (d10 != -1) {
                    accessibilityNodeInfo.getExtras().putInt(str, d10);
                }
            } else {
                boolean c4 = m0Var.c(i4.l.f6740a);
                x xVar2 = this.R;
                boolean z10 = false;
                if (c4 && bundle != null && nc.k.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                    int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                    if (i12 > 0 && i11 >= 0) {
                        if (t5 != null) {
                            i10 = t5.length();
                        } else {
                            i10 = Preference.DEFAULT_ORDER;
                        }
                        if (i11 < i10) {
                            l4.o0 l10 = l0.l(mVar);
                            if (l10 != null) {
                                ArrayList arrayList = new ArrayList();
                                int i13 = 0;
                                while (i13 < i12) {
                                    int i14 = i11 + i13;
                                    if (i14 >= l10.f8865a.f8853a.B.length()) {
                                        arrayList.add(z10);
                                        xVar = xVar2;
                                    } else {
                                        h3.c b10 = l10.b(i14);
                                        a4.r1 d11 = pVar.d();
                                        long j2 = 0;
                                        if (d11 != null) {
                                            if (!d11.X0().f1777h0) {
                                                d11 = null;
                                            }
                                            if (d11 != null) {
                                                j2 = d11.a0(0L);
                                            }
                                        }
                                        h3.c i15 = b10.i(j2);
                                        h3.c g10 = pVar.g();
                                        if (i15.g(g10)) {
                                            cVar = i15.e(g10);
                                        } else {
                                            cVar = null;
                                        }
                                        if (cVar != null) {
                                            float f8 = cVar.f6052a;
                                            long q10 = xVar2.q((Float.floatToRawIntBits(cVar.f6053b) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
                                            long q11 = xVar2.q((Float.floatToRawIntBits(cVar.f6054c) << 32) | (Float.floatToRawIntBits(cVar.f6055d) & 4294967295L));
                                            xVar = xVar2;
                                            int i16 = (int) (q10 >> 32);
                                            int i17 = (int) (q11 >> 32);
                                            float min = Math.min(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17));
                                            int i18 = (int) (q10 & 4294967295L);
                                            int i19 = (int) (q11 & 4294967295L);
                                            rectF = new RectF(min, Math.min(Float.intBitsToFloat(i18), Float.intBitsToFloat(i19)), Math.max(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17)), Math.max(Float.intBitsToFloat(i18), Float.intBitsToFloat(i19)));
                                        } else {
                                            xVar = xVar2;
                                            rectF = null;
                                        }
                                        arrayList.add(rectF);
                                    }
                                    i13++;
                                    xVar2 = xVar;
                                    z10 = false;
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
                i4.w wVar = i4.t.f6805z;
                if (m0Var.c(wVar) && bundle != null && nc.k.a(str, "androidx.compose.ui.semantics.testTag")) {
                    Object g11 = m0Var.g(wVar);
                    if (g11 == null) {
                        charSequence = null;
                    } else {
                        charSequence = g11;
                    }
                    String str2 = (String) charSequence;
                    if (str2 != null) {
                        accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    }
                } else if (nc.k.a(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, pVar.f6773g);
                } else if (nc.k.a(str, "androidx.compose.ui.semantics.shapeType")) {
                    Object g12 = m0Var.g(i4.t.P);
                    if (g12 == null) {
                        n0Var4 = null;
                    } else {
                        n0Var4 = g12;
                    }
                    i3.n0 n0Var5 = n0Var4;
                    if (n0Var5 != null) {
                        Rect rect = new Rect();
                        accessibilityNodeInfo.getBoundsInScreen(rect);
                        h3.c u4 = u(pVar, rect, n0Var5);
                        float f10 = u4.f6053b;
                        float f11 = u4.f6052a;
                        i3.z a10 = n0Var5.a(u4.c(), o0Var.f296u0, xVar2.getDensity());
                        if (a10 instanceof i3.g0) {
                            accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(a10, f11, f10));
                        } else if (a10 instanceof i3.h0) {
                            accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(a10, f11, f10));
                            accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(a10));
                        } else if (a10 instanceof i3.f0) {
                            accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O(a10, f11, f10));
                        } else {
                            m9.o.o();
                        }
                    }
                } else if (nc.k.a(str, "androidx.compose.ui.semantics.shapeRect")) {
                    Object g13 = m0Var.g(i4.t.P);
                    if (g13 == null) {
                        n0Var3 = null;
                    } else {
                        n0Var3 = g13;
                    }
                    i3.n0 n0Var6 = n0Var3;
                    if (n0Var6 != null) {
                        Rect rect2 = new Rect();
                        accessibilityNodeInfo.getBoundsInScreen(rect2);
                        h3.c u10 = u(pVar, rect2, n0Var6);
                        Rect L = L(n0Var6.a(u10.c(), o0Var.f296u0, xVar2.getDensity()), u10.f6052a, u10.f6053b);
                        if (L != null) {
                            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L);
                        }
                    }
                } else if (nc.k.a(str, "androidx.compose.ui.semantics.shapeCorners")) {
                    Object g14 = m0Var.g(i4.t.P);
                    if (g14 == null) {
                        n0Var2 = null;
                    } else {
                        n0Var2 = g14;
                    }
                    i3.n0 n0Var7 = n0Var2;
                    if (n0Var7 != null) {
                        Rect rect3 = new Rect();
                        accessibilityNodeInfo.getBoundsInScreen(rect3);
                        float[] N = N(n0Var7.a(u(pVar, rect3, n0Var7).c(), o0Var.f296u0, xVar2.getDensity()));
                        if (N != null) {
                            accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N);
                        }
                    }
                } else if (nc.k.a(str, "androidx.compose.ui.semantics.shapeRegion")) {
                    Object g15 = m0Var.g(i4.t.P);
                    if (g15 == null) {
                        n0Var = null;
                    } else {
                        n0Var = g15;
                    }
                    i3.n0 n0Var8 = n0Var;
                    if (n0Var8 != null) {
                        Rect rect4 = new Rect();
                        accessibilityNodeInfo.getBoundsInScreen(rect4);
                        h3.c u11 = u(pVar, rect4, n0Var8);
                        Region O = O(n0Var8.a(u11.c(), o0Var.f296u0, xVar2.getDensity()), u11.f6052a, u11.f6053b);
                        if (O != null) {
                            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O);
                        }
                    }
                }
            }
        }
    }

    public final Rect k(i4.q qVar) {
        x4.k kVar = qVar.f6775b;
        return M(kVar.f14342a, kVar.f14343b, kVar.f14344c, kVar.f14345d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00f1, code lost:
        if (zc.x.h(r5, r2) == r3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0076 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:73:0x0030, B:84:0x005c, B:88:0x006e, B:90:0x0076, B:92:0x007f, B:94:0x0084, B:95:0x0093, B:97:0x009c, B:80:0x0046, B:83:0x004d), top: B:117:0x0026 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x00f1 -> B:110:0x00f4). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(ec.c r17) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.d0.l(ec.c):java.lang.Object");
    }

    public final boolean m(boolean z10, int i2, long j2) {
        i4.w wVar;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (!nc.k.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        a1.l s10 = s();
        if (h3.b.b(j2, 9205357640488583168L) || (((9223372034707292159L & j2) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z10) {
            wVar = i4.t.f6801v;
        } else if (!z10) {
            wVar = i4.t.f6800u;
        } else {
            m9.o.o();
            return false;
        }
        Object[] objArr = s10.f63c;
        long[] jArr = s10.f61a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i11 = 0;
        boolean z15 = false;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j10) < 128) {
                        i4.q qVar = (i4.q) objArr[(i11 << 3) + i14];
                        x4.k kVar = qVar.f6775b;
                        i10 = i12;
                        float f8 = kVar.f14343b;
                        float f10 = kVar.f14344c;
                        float f11 = kVar.f14345d;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                        if (intBitsToFloat >= kVar.f14342a) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (intBitsToFloat < f10) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z16 = z11 & z12;
                        if (intBitsToFloat2 >= f8) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z17 = z16 & z13;
                        if (intBitsToFloat2 < f11) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14 & z17) {
                            Object g10 = qVar.f6774a.f6770d.A.g(wVar);
                            if (g10 == null) {
                                g10 = null;
                            }
                            i4.j jVar = (i4.j) g10;
                            if (jVar != null) {
                                mc.a aVar = jVar.f6723a;
                                if (i2 < 0) {
                                    if (((Number) aVar.b()).floatValue() <= 0.0f) {
                                    }
                                    z15 = true;
                                } else {
                                    if (((Number) aVar.b()).floatValue() >= ((Number) jVar.f6724b.b()).floatValue()) {
                                    }
                                    z15 = true;
                                }
                            }
                        }
                    } else {
                        i10 = i12;
                    }
                    j10 >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return z15;
                }
            }
            if (i11 != length) {
                i11++;
            } else {
                return z15;
            }
        }
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

    public final AccessibilityEvent o(int i2, int i10) {
        i4.q qVar;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        x xVar = this.R;
        obtain.setPackageName(xVar.getContext().getPackageName());
        obtain.setSource(xVar, i2);
        if (v() && (qVar = (i4.q) s().b(i2)) != null) {
            i4.p pVar = qVar.f6774a;
            obtain.setPassword(pVar.f6770d.A.c(i4.t.K));
            Object g10 = pVar.f6770d.A.g(i4.t.f6793n);
            if (g10 == null) {
                g10 = null;
            }
            boolean a10 = nc.k.a(g10, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                a6.g0.l(obtain, a10);
            }
        }
        return obtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z10) {
        this.f1809c0 = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        this.f1809c0 = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.Z;
        if (accessibilityManager.isEnabled()) {
            this.f1809c0 = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1810d0.removeCallbacks(this.F0);
        AccessibilityManager accessibilityManager = this.Z;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final AccessibilityEvent p(int i2, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent o5 = o(i2, 8192);
        if (num != null) {
            o5.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            o5.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            o5.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            o5.getText().add(charSequence);
        }
        return o5;
    }

    public final int q(i4.p pVar) {
        i4.m mVar = pVar.f6770d;
        if (!mVar.A.c(i4.t.f6781a)) {
            i4.w wVar = i4.t.G;
            if (mVar.A.c(wVar)) {
                return (int) (((l4.q0) mVar.c(wVar)).f8885a & 4294967295L);
            }
        }
        return this.f1821o0;
    }

    public final int r(i4.p pVar) {
        i4.m mVar = pVar.f6770d;
        if (!mVar.A.c(i4.t.f6781a)) {
            i4.w wVar = i4.t.G;
            if (mVar.A.c(wVar)) {
                return (int) (((l4.q0) mVar.c(wVar)).f8885a >> 32);
            }
        }
        return this.f1821o0;
    }

    public final a1.l s() {
        i4.p pVar;
        if (this.f1824s0) {
            this.f1824s0 = false;
            x xVar = this.R;
            this.f1826u0 = i4.s.b(xVar.getSemanticsOwner(), q.R);
            if (v()) {
                a1.x xVar2 = this.f1826u0;
                Resources resources = xVar.getContext().getResources();
                a1.v vVar = this.f1828w0;
                vVar.a();
                a1.v vVar2 = this.f1829x0;
                vVar2.a();
                i4.q qVar = (i4.q) xVar2.b(-1);
                if (qVar != null) {
                    pVar = qVar.f6774a;
                } else {
                    pVar = null;
                }
                pVar.getClass();
                ArrayList b10 = i4.y.b(pVar, new a4.a(4, xVar2), new a4.a(5, resources), p7.t.x(pVar));
                int i2 = 1;
                int size = b10.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i10 = ((i4.p) b10.get(i2 - 1)).f6773g;
                        int i11 = ((i4.p) b10.get(i2)).f6773g;
                        vVar.f(i10, i11);
                        vVar2.f(i11, i10);
                        if (i2 == size) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return this.f1826u0;
    }

    public final h3.c u(i4.p pVar, Rect rect, i3.n0 n0Var) {
        b0 b0Var = new b0(n0Var);
        a4.o0 o0Var = pVar.f6769c;
        b3.o oVar = o0Var.A0.f268f;
        a4.l2 l2Var = null;
        if ((oVar.R & 8) != 0) {
            loop0: while (true) {
                if (oVar == null) {
                    break;
                }
                if ((oVar.L & 8) != 0) {
                    b3.o oVar2 = oVar;
                    p2.b bVar = null;
                    while (oVar2 != null) {
                        if (oVar2 instanceof a4.l2) {
                            ((a4.l2) oVar2).f0(b0Var);
                            if (b0Var.A) {
                                l2Var = oVar2;
                                break loop0;
                            }
                        } else if ((oVar2.L & 8) != 0 && (oVar2 instanceof a4.k)) {
                            int i2 = 0;
                            for (b3.o oVar3 = ((a4.k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                                if ((oVar3.L & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        oVar2 = oVar3;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new p2.b(new b3.o[16]);
                                        }
                                        if (oVar2 != null) {
                                            bVar.b(oVar2);
                                            oVar2 = null;
                                        }
                                        bVar.b(oVar3);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        oVar2 = a4.l.e(bVar);
                    }
                }
                if ((oVar.R & 8) == 0) {
                    break;
                }
                oVar = oVar.Y;
            }
        }
        a4.l2 l2Var2 = l2Var;
        if (l2Var2 != null && ((b3.o) l2Var2).A.f1777h0) {
            a4.r1 s10 = a4.l.s(l2Var2);
            h3.c k10 = y3.c0.i(s10).k(s10, true);
            Rect M = M(k10.f6052a, k10.f6053b, k10.f6054c, k10.f6055d);
            float f8 = M.left - rect.left;
            float f10 = M.top - rect.top;
            return new h3.c(f8, f10, M.width() + f8, M.height() + f10);
        }
        return y3.c0.g(o0Var.A0.f266d, false);
    }

    public final boolean v() {
        AccessibilityManager accessibilityManager = this.Z;
        if (accessibilityManager.isEnabled()) {
            List<AccessibilityServiceInfo> list = this.f1809c0;
            if (list == null) {
                list = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                this.f1809c0 = list;
            }
            if (!list.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void w(a4.o0 o0Var) {
        if (this.f1822q0.add(o0Var)) {
            this.f1823r0.a(yb.y.f14813a);
        }
    }
}

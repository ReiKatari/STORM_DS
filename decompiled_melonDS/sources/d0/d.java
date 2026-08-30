package d0;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.text.LineBreakConfig;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d implements md.c, md.a {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f3341b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f3342c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static o3.f f3343d;

    /* renamed from: e  reason: collision with root package name */
    public static o3.f f3344e;

    /* renamed from: f  reason: collision with root package name */
    public static Thread f3345f;

    /* renamed from: g  reason: collision with root package name */
    public static Field f3346g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f3347h;

    /* renamed from: i  reason: collision with root package name */
    public static Class f3348i;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f3349j;

    /* renamed from: k  reason: collision with root package name */
    public static Field f3350k;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f3351l;
    public static Field m;

    /* renamed from: n  reason: collision with root package name */
    public static boolean f3352n;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3353a;

    public /* synthetic */ d(int i2) {
        this.f3353a = i2;
    }

    public static final void E(boolean z10, mc.p pVar, n2.m mVar, int i2) {
        int i10;
        boolean z11;
        f7.c cVar;
        b9.e eVar;
        d.b0 b0Var;
        int i11;
        int i12;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-642000585);
        if ((i2 & 6) == 0) {
            if (rVar.g(z10)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(pVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        boolean z12 = true;
        if ((i10 & 19) != 18) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i10 & 1, z11)) {
            Object a10 = g7.a.a(rVar);
            if (a10 == null) {
                rVar.X(1512740606);
                a10 = e.j.a(rVar);
                rVar.p(false);
            } else {
                rVar.X(1512737723);
                rVar.p(false);
            }
            if (a10 != null) {
                boolean f8 = rVar.f(a10);
                Object L = rVar.L();
                n2.e eVar2 = n2.l.f9953a;
                if (f8 || L == eVar2) {
                    d.a0 a0Var = null;
                    if (a10 instanceof f7.c) {
                        cVar = (f7.c) a10;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        eVar = cVar.b();
                    } else {
                        eVar = null;
                    }
                    if (a10 instanceof d.b0) {
                        b0Var = (d.b0) a10;
                    } else {
                        b0Var = null;
                    }
                    if (b0Var != null) {
                        a0Var = b0Var.a();
                    }
                    L = new f.b(eVar, a0Var);
                    rVar.h0(L);
                }
                f.b bVar = (f.b) L;
                Object L2 = rVar.L();
                if (L2 == eVar2) {
                    L2 = n2.s.o(rVar);
                    rVar.h0(L2);
                }
                zc.u uVar = (zc.u) L2;
                long j2 = rVar.T;
                boolean f10 = rVar.f(bVar) | rVar.e(j2);
                Object L3 = rVar.L();
                if (f10 || L3 == eVar2) {
                    L3 = new e.h(uVar, new e.l(j2, a10));
                    rVar.h0(L3);
                }
                e.h hVar = (e.h) L3;
                rVar.X(-348514256);
                boolean h2 = rVar.h(hVar) | rVar.h(pVar);
                Object L4 = rVar.L();
                if (h2 || L4 == eVar2) {
                    L4 = new a3.e(7, hVar, pVar);
                    rVar.h0(L4);
                }
                n2.s.h((mc.a) L4, rVar);
                Boolean valueOf = Boolean.valueOf(z10);
                boolean h10 = rVar.h(hVar);
                int i13 = i10 & 14;
                if (i13 != 4) {
                    z12 = false;
                }
                boolean z13 = h10 | z12;
                Object L5 = rVar.L();
                if (z13 || L5 == eVar2) {
                    L5 = new e.c(hVar, z10, 1);
                    rVar.h0(L5);
                }
                p7.k.b(valueOf, hVar, null, (mc.l) L5, rVar, i13);
                boolean h11 = rVar.h(bVar) | rVar.h(hVar);
                Object L6 = rVar.L();
                if (h11 || L6 == eVar2) {
                    L6 = new a7.l(14, bVar, hVar);
                    rVar.h0(L6);
                }
                n2.s.c(bVar, hVar, (mc.l) L6, rVar);
                rVar.p(false);
            } else {
                a0.j.p("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new e.d(z10, pVar, i2);
        }
    }

    public static final void F(mh.g gVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        mh.g0 g0Var = gVar.f9686a;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(849132524);
        if (rVar.f(gVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i2;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            boolean f8 = rVar.f(g0Var);
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (f8 || L == eVar) {
                L = d1.d.a(1.0f);
                rVar.h0(L);
            }
            d1.c cVar = (d1.c) L;
            boolean f10 = rVar.f(g0Var);
            Object L2 = rVar.L();
            if (f10 || L2 == eVar) {
                L2 = n2.s.w(Boolean.FALSE);
                rVar.h0(L2);
            }
            n2.w0 w0Var = (n2.w0) L2;
            b3.p t5 = l1.c.t(b3.m.f1770a, 8);
            boolean h2 = rVar.h(cVar);
            Object L3 = rVar.L();
            if (h2 || L3 == eVar) {
                L3 = new nh.b(cVar, 2);
                rVar.h0(L3);
            }
            b3.p m10 = i3.z.m(t5, (mc.l) L3);
            ThreadLocal threadLocal = p5.k.f11352a;
            Drawable drawable = ((Resources) rVar.j(b4.r0.f1938c)).getDrawable(R.drawable.ic_ra_error, null);
            drawable.getClass();
            l0.f.a(m10, drawable, gVar.f9687b, v2.h.c(-535521263, new ai.a0(gVar, w0Var, cVar, 3), rVar), rVar, 3072);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.s0(i2, 21, gVar);
        }
    }

    public static final boolean G(int i2, int i10, int i11, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12 + i2] != bArr2[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r9.bottom <= r11.top) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r9.right <= r11.left) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
        if (r9.top >= r11.bottom) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r9.left >= r11.right) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
        if (r8 == 17) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
        if (r8 != 66) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
        r10 = Z(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (r8 == 17) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
        if (r8 == 33) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
        if (r8 == 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
        if (r8 != 130) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0052, code lost:
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        a0.j.h("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean H(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = I(r8, r9, r10)
            boolean r1 = I(r8, r9, r11)
            if (r1 != 0) goto L72
            if (r0 != 0) goto Le
            goto L72
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3b
            if (r8 == r2) goto L34
            if (r8 == r3) goto L2d
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L71
            goto L41
        L28:
            a0.j.h(r0)
        L2b:
            r8 = 0
            return r8
        L2d:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L71
            goto L41
        L34:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L71
            goto L41
        L3b:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L71
        L41:
            if (r8 == r4) goto L71
            if (r8 != r3) goto L46
            goto L71
        L46:
            int r10 = Z(r8, r9, r10)
            if (r8 == r4) goto L66
            if (r8 == r2) goto L61
            if (r8 == r3) goto L5c
            if (r8 != r1) goto L58
            int r8 = r11.bottom
            int r9 = r9.bottom
        L56:
            int r8 = r8 - r9
            goto L6b
        L58:
            a0.j.h(r0)
            goto L2b
        L5c:
            int r8 = r11.right
            int r9 = r9.right
            goto L56
        L61:
            int r8 = r9.top
            int r9 = r11.top
            goto L56
        L66:
            int r8 = r9.left
            int r9 = r11.left
            goto L56
        L6b:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L72
        L71:
            return r5
        L72:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.d.H(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean I(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        a0.j.h("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
            return false;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public static final boolean J(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = zb.q.A;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    i4.p pVar = (i4.p) obj2;
                    i4.p pVar2 = (i4.p) obj;
                    arrayList2.add(new h3.b((Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (pVar2.g().b() >> 32)) - Float.intBitsToFloat((int) (pVar.g().b() >> 32)))) << 32) | (Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (pVar2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (pVar.g().b() & 4294967295L)))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((h3.b) zb.l.R(list)).f6050a;
            } else {
                if (list.isEmpty()) {
                    z4.a.c("Empty collection can't be reduced.");
                }
                Object R = zb.l.R(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i10 = 1;
                    while (true) {
                        R = new h3.b(h3.b.e(((h3.b) R).f6050a, ((h3.b) list.get(i10)).f6050a));
                        if (i10 == size2) {
                            break;
                        }
                        i10++;
                    }
                }
                j2 = ((h3.b) R).f6050a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final void K(long j2, long j10, long j11) {
        if ((j10 | j11) >= 0 && j10 <= j2 && j2 - j10 >= j11) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j10 + " byteCount=" + j11);
    }

    public static int L(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 == myUid && Objects.equals(packageName2, packageName)) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                        int callingUid = Binder.getCallingUid();
                        int i2 = 1;
                        if (appOpsManager == null) {
                            noteProxyOpNoThrow = 1;
                        } else {
                            noteProxyOpNoThrow = appOpsManager.checkOpNoThrow(permissionToOp, callingUid, packageName);
                        }
                        if (noteProxyOpNoThrow == 0) {
                            String a10 = m5.d.a(context);
                            if (appOpsManager != null) {
                                i2 = appOpsManager.checkOpNoThrow(permissionToOp, myUid, a10);
                            }
                            noteProxyOpNoThrow = i2;
                        }
                    } else {
                        noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static int M(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final Object N(cc.c cVar, k7.t tVar, mc.l lVar) {
        if (tVar.k() && tVar.n() && tVar.l()) {
            return lVar.k(cVar);
        }
        if (cVar.g().t(k7.x.A) == null) {
            return lVar.k(cVar);
        }
        return m0(cVar, tVar, lVar);
    }

    public static StaticLayout O(CharSequence charSequence, TextPaint textPaint, int i2, int i10, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, boolean z10, int i14, int i15, int i16, int i17) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        if (i10 < 0) {
            r4.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i10 < 0 || i10 > length) {
            r4.a.a("invalid end value");
        }
        if (i11 < 0) {
            r4.a.a("invalid maxLines value");
        }
        if (i2 < 0) {
            r4.a.a("invalid width value");
        }
        if (i12 < 0) {
            r4.a.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i10, textPaint, i2);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i11);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i12);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z10);
        obtain.setBreakStrategy(i14);
        obtain.setHyphenationFrequency(i17);
        obtain.setIndents(null, null);
        int i18 = Build.VERSION.SDK_INT;
        if (i18 >= 26) {
            obtain.setJustificationMode(i13);
        }
        if (i18 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i18 >= 33) {
            lineBreakStyle = b6.c.f().setLineBreakStyle(i15);
            lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i16);
            build = lineBreakWordStyle.build();
            obtain.setLineBreakConfig(build);
        }
        if (i18 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
        r4 = r4.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        r4 = r4.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Q(d3.e r6, android.util.LongSparseArray r7) {
        /*
            int r0 = r7.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L5b
            long r2 = r7.keyAt(r1)
            java.lang.Object r4 = r7.get(r2)
            android.view.translation.ViewTranslationResponse r4 = a6.c.r(r4)
            if (r4 == 0) goto L58
            android.view.translation.TranslationResponseValue r4 = a6.c.o(r4)
            if (r4 == 0) goto L58
            java.lang.CharSequence r4 = a6.c.s(r4)
            if (r4 == 0) goto L58
            a1.l r5 = r6.c()
            int r2 = (int) r2
            java.lang.Object r2 = r5.b(r2)
            i4.q r2 = (i4.q) r2
            if (r2 == 0) goto L58
            i4.p r2 = r2.f6774a
            if (r2 == 0) goto L58
            i4.m r2 = r2.f6770d
            i4.w r3 = i4.l.f6751l
            a1.m0 r2 = r2.A
            java.lang.Object r2 = r2.g(r3)
            if (r2 != 0) goto L3f
            r2 = 0
        L3f:
            i4.a r2 = (i4.a) r2
            if (r2 == 0) goto L58
            yb.d r2 = r2.f6708b
            mc.l r2 = (mc.l) r2
            if (r2 == 0) goto L58
            l4.h r3 = new l4.h
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            java.lang.Object r2 = r2.k(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L58:
            int r1 = r1 + 1
            goto L5
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.d.Q(d3.e, android.util.LongSparseArray):void");
    }

    public static final ArrayList R(a3.a aVar) {
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = aVar.f146a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < size) {
            int i10 = i2 + 1;
            a3.c cVar = (a3.c) list.get(i2);
            if (!zb.k.c(iArr, cVar.f148a)) {
                if (cVar.f148a == 100) {
                    int i11 = i2 + 2;
                    if (i11 < size && ((a3.c) list.get(i11)).f148a == 1000) {
                        break;
                    }
                    zb.l.i0(arrayList);
                } else {
                    arrayList.add(cVar);
                }
            }
            i2 = i10;
        }
        return arrayList;
    }

    public static String S(Context context, oe.o0 o0Var, int i2) {
        Object o0Var2;
        yb.j jVar;
        o0Var.getClass();
        long j2 = o0Var.A;
        if (j2 < 1024) {
            o0Var2 = new oe.o0(j2);
        } else {
            double d4 = j2 / 1024.0d;
            if (d4 < 1024.0d) {
                o0Var2 = new oe.o0(1024 * j2);
            } else if (d4 / 1024.0d < 1024.0d) {
                o0Var2 = new oe.n0(j2);
            } else {
                long j10 = 1024;
                o0Var2 = new oe.o0(j2 * j10 * j10 * 1024);
            }
        }
        if (o0Var2 instanceof oe.k0) {
            jVar = new yb.j(Double.valueOf(j2), context.getString(R.string.size_bytes));
        } else if (o0Var2 instanceof oe.m0) {
            jVar = new yb.j(Double.valueOf(j2 / 1024), context.getString(R.string.size_kb));
        } else if (o0Var2 instanceof oe.n0) {
            double d10 = 1024;
            jVar = new yb.j(Double.valueOf((j2 / d10) / d10), context.getString(R.string.size_mb));
        } else if (o0Var2 instanceof oe.l0) {
            double d11 = 1024;
            jVar = new yb.j(Double.valueOf(((j2 / d11) / d11) / d11), context.getString(R.string.size_gb));
        } else {
            m9.o.o();
            return null;
        }
        return new BigDecimal(((Number) jVar.A).doubleValue()).setScale(i2, RoundingMode.HALF_EVEN) + ((String) jVar.B);
    }

    public static String T() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String U() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String V(Context context, int i2) {
        if (i2 != -1) {
            try {
                return context.getResources().getResourceEntryName(i2);
            } catch (Exception unused) {
                return w.d.l(i2, "?");
            }
        }
        return "UNKNOWN";
    }

    public static String W(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static boolean X(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 == 130) {
                        int i10 = rect.top;
                        int i11 = rect2.top;
                        if ((i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom) {
                            return true;
                        }
                        return false;
                    }
                    a0.j.h("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                int i12 = rect.left;
                int i13 = rect2.left;
                if ((i12 < i13 || rect.right <= i13) && rect.right < rect2.right) {
                    return true;
                }
                return false;
            }
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if ((i14 > i15 || rect.top >= i15) && rect.top > rect2.top) {
                return true;
            }
            return false;
        }
        int i16 = rect.right;
        int i17 = rect2.right;
        if ((i16 > i17 || rect.left >= i17) && rect.left > rect2.left) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static final boolean Y(v3.k kVar) {
        MotionEvent a10;
        ?? r02 = kVar.f13678a;
        int size = r02.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            } else if (((v3.t) r02.get(i2)).f13699i == 2) {
                i2++;
            } else {
                MotionEvent a11 = kVar.a();
                if ((a11 == null || !a11.isFromSource(8194)) && ((a10 = kVar.a()) == null || !a10.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int Z(int i2, Rect rect, Rect rect2) {
        int i10;
        int i11;
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 == 130) {
                        i10 = rect2.top;
                        i11 = rect.bottom;
                    } else {
                        a0.j.h("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                } else {
                    i10 = rect2.left;
                    i11 = rect.right;
                }
            } else {
                i10 = rect.top;
                i11 = rect2.bottom;
            }
        } else {
            i10 = rect.left;
            i11 = rect2.right;
        }
        return Math.max(0, i10 - i11);
    }

    public static int a0(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        a0.j.h("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final ArrayList b0(Map map, mc.l lVar) {
        Boolean bool;
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            a7.h hVar = (a7.h) entry.getValue();
            if (hVar != null) {
                bool = Boolean.valueOf(hVar.f572b);
            } else {
                bool = null;
            }
            bool.getClass();
            if (!bool.booleanValue() && !hVar.f573c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashMap.keySet()) {
            if (((Boolean) lVar.k((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Class c0(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            return c0(rawType);
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            upperBounds.getClass();
            Object w10 = zb.k.w(upperBounds);
            w10.getClass();
            return c0((Type) w10);
        } else if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            genericComponentType.getClass();
            return c0(genericComponentType);
        } else {
            StringBuilder sb2 = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
            sb2.append(type);
            fj.j.k(sb2, " has type ", nc.u.a(type.getClass()));
            return null;
        }
    }

    public static final jd.a d0(k0.g gVar, Class cls, List list) {
        jd.a[] aVarArr = (jd.a[]) list.toArray(new jd.a[0]);
        jd.a d4 = nd.a1.d(cls, (jd.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        if (d4 != null) {
            return d4;
        }
        jd.a aVar = (jd.a) nd.h1.f10313a.get(nc.u.a(cls));
        if (aVar == null) {
            gVar.getClass();
            if (cls.isInterface()) {
                return new jd.d(nc.u.a(cls));
            }
            return null;
        }
        return aVar;
    }

    public static final jd.a e0(k0.g gVar, Type type, boolean z10) {
        ArrayList arrayList;
        jd.a e02;
        jd.a e03;
        nc.e eVar;
        int i2 = 0;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
                upperBounds.getClass();
                genericComponentType = (Type) zb.k.w(upperBounds);
            }
            genericComponentType.getClass();
            if (z10) {
                e03 = aj.g.X(gVar, genericComponentType);
            } else {
                gVar.getClass();
                e03 = e0(gVar, genericComponentType, false);
                if (e03 == null) {
                    return null;
                }
            }
            if (genericComponentType instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) genericComponentType).getRawType();
                rawType.getClass();
                eVar = nc.u.a((Class) rawType);
            } else if (genericComponentType instanceof nc.e) {
                eVar = (nc.e) genericComponentType;
            } else {
                a0.j.g(nc.u.a(genericComponentType.getClass()), "unsupported type in GenericArray: ");
                return null;
            }
            eVar.getClass();
            return new nd.i1(eVar, e03);
        } else if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray() && !cls.getComponentType().isPrimitive()) {
                Class<?> componentType = cls.getComponentType();
                componentType.getClass();
                if (z10) {
                    e02 = aj.g.X(gVar, componentType);
                } else {
                    gVar.getClass();
                    e02 = e0(gVar, componentType, false);
                    if (e02 == null) {
                        return null;
                    }
                }
                return new nd.i1(nc.u.a(componentType), e02);
            }
            return d0(gVar, cls, zb.q.A);
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType2 = parameterizedType.getRawType();
            rawType2.getClass();
            Class cls2 = (Class) rawType2;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            actualTypeArguments.getClass();
            if (z10) {
                arrayList = new ArrayList(actualTypeArguments.length);
                for (Type type2 : actualTypeArguments) {
                    type2.getClass();
                    arrayList.add(aj.g.X(gVar, type2));
                }
            } else {
                arrayList = new ArrayList(actualTypeArguments.length);
                for (Type type3 : actualTypeArguments) {
                    type3.getClass();
                    gVar.getClass();
                    jd.a e04 = e0(gVar, type3, false);
                    if (e04 == null) {
                        return null;
                    }
                    arrayList.add(e04);
                }
            }
            if (Set.class.isAssignableFrom(cls2)) {
                jd.a aVar = (jd.a) arrayList.get(0);
                aVar.getClass();
                return new nd.d(aVar, 2);
            } else if (!List.class.isAssignableFrom(cls2) && !Collection.class.isAssignableFrom(cls2)) {
                if (Map.class.isAssignableFrom(cls2)) {
                    jd.a aVar2 = (jd.a) arrayList.get(0);
                    jd.a aVar3 = (jd.a) arrayList.get(1);
                    aVar2.getClass();
                    aVar3.getClass();
                    return new nd.f0(aVar2, aVar3, 1);
                } else if (Map.Entry.class.isAssignableFrom(cls2)) {
                    jd.a aVar4 = (jd.a) arrayList.get(0);
                    jd.a aVar5 = (jd.a) arrayList.get(1);
                    aVar4.getClass();
                    aVar5.getClass();
                    return new nd.s0(aVar4, aVar5, 0);
                } else if (yb.j.class.isAssignableFrom(cls2)) {
                    jd.a aVar6 = (jd.a) arrayList.get(0);
                    jd.a aVar7 = (jd.a) arrayList.get(1);
                    aVar6.getClass();
                    aVar7.getClass();
                    return new nd.s0(aVar6, aVar7, 1);
                } else if (yb.o.class.isAssignableFrom(cls2)) {
                    jd.a aVar8 = (jd.a) arrayList.get(0);
                    jd.a aVar9 = (jd.a) arrayList.get(1);
                    jd.a aVar10 = (jd.a) arrayList.get(2);
                    aVar8.getClass();
                    aVar9.getClass();
                    aVar10.getClass();
                    return new nd.p1(aVar8, aVar9, aVar10);
                } else {
                    ArrayList arrayList2 = new ArrayList(zb.m.G(arrayList, 10));
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        jd.a aVar11 = (jd.a) obj;
                        aVar11.getClass();
                        arrayList2.add(aVar11);
                    }
                    return d0(gVar, cls2, arrayList2);
                }
            } else {
                jd.a aVar12 = (jd.a) arrayList.get(0);
                aVar12.getClass();
                return new nd.d(aVar12, 0);
            }
        } else if (type instanceof WildcardType) {
            Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
            upperBounds2.getClass();
            Object w10 = zb.k.w(upperBounds2);
            w10.getClass();
            return e0(gVar, (Type) w10, true);
        } else {
            StringBuilder sb2 = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
            sb2.append(type);
            fj.j.k(sb2, " has type ", nc.u.a(type.getClass()));
            return null;
        }
    }

    public static final void f0(b6.g gVar, i4.p pVar) {
        int i2;
        Object g10 = pVar.k().A.g(i4.t.f6787g);
        i4.c cVar = null;
        if (g10 == null) {
            g10 = null;
        }
        if (g10 == null) {
            i4.p l10 = pVar.l();
            if (l10 != null) {
                Object g11 = l10.k().A.g(i4.t.f6785e);
                if (g11 == null) {
                    g11 = null;
                }
                if (g11 != null) {
                    Object g12 = l10.k().A.g(i4.t.f6786f);
                    if (g12 != null) {
                        cVar = g12;
                    }
                    i4.c cVar2 = cVar;
                    if (cVar2 == null || (cVar2.f6711a >= 0 && cVar2.f6712b >= 0)) {
                        if (pVar.k().A.c(i4.t.I)) {
                            ArrayList arrayList = new ArrayList();
                            List j2 = i4.p.j(4, l10);
                            int size = j2.size();
                            int i10 = 0;
                            int i11 = 0;
                            for (int i12 = 0; i12 < size; i12++) {
                                i4.p pVar2 = (i4.p) j2.get(i12);
                                if (pVar2.k().A.c(i4.t.I)) {
                                    arrayList.add(pVar2);
                                    if (pVar2.f6769c.v() < pVar.f6769c.v()) {
                                        i11++;
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                boolean J = J(arrayList);
                                if (J) {
                                    i2 = 0;
                                } else {
                                    i2 = i11;
                                }
                                if (J) {
                                    i10 = i11;
                                }
                                Object g13 = pVar.k().A.g(i4.t.I);
                                if (g13 == null) {
                                    g13 = Boolean.FALSE;
                                }
                                gVar.k(b6.f.a(((Boolean) g13).booleanValue(), i2, 1, i10, 1));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        m9.o.b();
    }

    public static final void g0(Activity activity, ve.d dVar) {
        int i2;
        dVar.getClass();
        int i10 = ef.a.f4480a[dVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    i2 = 6;
                } else {
                    m9.o.o();
                    return;
                }
            } else {
                i2 = 7;
            }
        } else {
            i2 = -1;
        }
        if (activity.getRequestedOrientation() != i2) {
            activity.setRequestedOrientation(i2);
        }
    }

    public static final String h0(byte b10) {
        char[] cArr = gj.b.f5683a;
        return new String(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & 15]});
    }

    public static final String i0(int i2) {
        if (i2 == 0) {
            return "0";
        }
        char[] cArr = gj.b.f5683a;
        int i10 = 0;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i10 < 8 && cArr2[i10] == '0') {
            i10++;
        }
        return vc.o.M(cArr2, i10, 8);
    }

    public static String j0(long j2) {
        return "RASetId(id=" + j2 + ")";
    }

    public static final boolean k0(Throwable th2, mc.a aVar) {
        List asList;
        Object invoke;
        th2.getClass();
        Integer num = hc.a.f6443a;
        a3.i iVar = null;
        if (num != null && num.intValue() < 19) {
            Method method = gc.a.f5637b;
            if (method != null && (invoke = method.invoke(th2, null)) != null) {
                asList = Arrays.asList((Throwable[]) invoke);
                asList.getClass();
            } else {
                asList = zb.q.A;
            }
        } else {
            Throwable[] suppressed = th2.getSuppressed();
            suppressed.getClass();
            asList = Arrays.asList(suppressed);
            asList.getClass();
        }
        int size = asList.size();
        boolean z10 = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Throwable) asList.get(i2)) instanceof a3.i) {
                return false;
            }
        }
        try {
            a3.a aVar2 = (a3.a) aVar.b();
            if (aVar2 != null && !aVar2.f146a.isEmpty()) {
                z10 = true;
            }
            if (z10) {
                aVar2.getClass();
                iVar = new a3.i(aVar2);
            }
        } catch (Throwable th3) {
            iVar = th3;
        }
        if (iVar != null) {
            p7.t.a(th2, iVar);
        }
        return z10;
    }

    public static final boolean l0(String str, mc.a aVar) {
        try {
            boolean booleanValue = ((Boolean) aVar.b()).booleanValue();
            if (!booleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static final Object m0(cc.c cVar, k7.t tVar, mc.l lVar) {
        zc.q qVar;
        k7.a0 a0Var;
        k7.v vVar = new k7.v(lVar, null);
        k7.z zVar = (k7.z) cVar.g().t(k7.z.B);
        if (zVar != null) {
            qVar = zVar.A;
        } else {
            qVar = null;
        }
        if (qVar != null) {
            return zc.x.F(qVar, vVar, cVar);
        }
        zc.h hVar = new zc.h(1, pc.a.A(cVar));
        hVar.v();
        try {
            a0Var = tVar.f8076d;
        } catch (RejectedExecutionException e6) {
            hVar.n(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e6));
        }
        if (a0Var != null) {
            a0Var.execute(new k7.u(hVar, tVar, vVar));
            Object u4 = hVar.u();
            dc.a aVar = dc.a.COROUTINE_SUSPENDED;
            return u4;
        }
        nc.k.f("internalTransactionExecutor");
        throw null;
    }

    @Override // md.c
    public short A() {
        Object P = P();
        P.getClass();
        return ((Short) P).shortValue();
    }

    @Override // md.c
    public String B() {
        Object P = P();
        P.getClass();
        return (String) P;
    }

    @Override // md.c
    public float C() {
        Object P = P();
        P.getClass();
        return ((Float) P).floatValue();
    }

    @Override // md.c
    public double D() {
        Object P = P();
        P.getClass();
        return ((Double) P).doubleValue();
    }

    public Object P() {
        throw new IllegalArgumentException(nc.u.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // md.c
    public md.a a(ld.e eVar) {
        eVar.getClass();
        return this;
    }

    @Override // md.a
    public void b(ld.e eVar) {
        eVar.getClass();
    }

    @Override // md.c
    public md.c d(ld.e eVar) {
        eVar.getClass();
        return this;
    }

    @Override // md.c
    public long e() {
        Object P = P();
        P.getClass();
        return ((Long) P).longValue();
    }

    @Override // md.a
    public long f(ld.e eVar, int i2) {
        eVar.getClass();
        return e();
    }

    @Override // md.c
    public boolean h() {
        Object P = P();
        P.getClass();
        return ((Boolean) P).booleanValue();
    }

    public int hashCode() {
        switch (this.f3353a) {
            case 23:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // md.c
    public boolean i() {
        return true;
    }

    @Override // md.c
    public char j() {
        Object P = P();
        P.getClass();
        return ((Character) P).charValue();
    }

    @Override // md.a
    public md.c k(nd.e1 e1Var, int i2) {
        e1Var.getClass();
        return d(e1Var.j(i2));
    }

    @Override // md.a
    public short l(nd.e1 e1Var, int i2) {
        e1Var.getClass();
        return A();
    }

    @Override // md.a
    public String m(ld.e eVar, int i2) {
        eVar.getClass();
        return B();
    }

    @Override // md.a
    public int n(ld.e eVar, int i2) {
        eVar.getClass();
        return u();
    }

    @Override // md.a
    public Object o(ld.e eVar, int i2, jd.a aVar, Object obj) {
        eVar.getClass();
        aVar.getClass();
        return t(aVar);
    }

    @Override // md.c
    public int p(ld.e eVar) {
        eVar.getClass();
        Object P = P();
        P.getClass();
        return ((Integer) P).intValue();
    }

    @Override // md.a
    public float q(nd.e1 e1Var, int i2) {
        e1Var.getClass();
        return C();
    }

    @Override // md.a
    public Object r(ld.e eVar, int i2, jd.a aVar, Object obj) {
        eVar.getClass();
        aVar.getClass();
        if (!aVar.e().h() && !i()) {
            return null;
        }
        return t(aVar);
    }

    public String toString() {
        switch (this.f3353a) {
            case 23:
                String c4 = nc.u.a(getClass()).c();
                c4.getClass();
                return c4;
            default:
                return super.toString();
        }
    }

    @Override // md.c
    public int u() {
        Object P = P();
        P.getClass();
        return ((Integer) P).intValue();
    }

    @Override // md.c
    public byte v() {
        Object P = P();
        P.getClass();
        return ((Byte) P).byteValue();
    }

    @Override // md.a
    public boolean w(ld.e eVar, int i2) {
        eVar.getClass();
        return h();
    }

    @Override // md.a
    public char x(nd.e1 e1Var, int i2) {
        e1Var.getClass();
        return j();
    }

    @Override // md.a
    public double y(nd.e1 e1Var, int i2) {
        e1Var.getClass();
        return D();
    }

    @Override // md.a
    public byte z(nd.e1 e1Var, int i2) {
        e1Var.getClass();
        return v();
    }
}

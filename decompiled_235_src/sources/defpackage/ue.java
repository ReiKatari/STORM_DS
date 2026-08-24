package defpackage;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.stormds.emulator.R;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ue  reason: default package */
/* loaded from: classes.dex */
public final class ue extends os0 {
    public final /* synthetic */ int Y;
    public final /* synthetic */ b2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue(b2 b2Var, int i) {
        super(4);
        this.Y = i;
        this.Z = b2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:419:0x084b, code lost:
        if (r5 == false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012e, code lost:
        if (defpackage.xa6.j(4, r5).isEmpty() != false) goto L652;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0a56  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0a5a  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0a82  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0a8c  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0ae5  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0b0d  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0b17  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0b54  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0b63  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0c9f  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0ca3  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0cb0  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0cc4  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0cce  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0ce3  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0ceb  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x082d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v49, types: [yt1] */
    /* JADX WARN: Type inference failed for: r4v50, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v54, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final v2 y0(int i) {
        Integer num;
        AccessibilityManager accessibilityManager;
        un6 un6Var;
        boolean z;
        ze zeVar;
        te teVar;
        n94 n94Var;
        xa6 xa6Var;
        ta6 ta6Var;
        mq5 mq5Var;
        AccessibilityNodeInfo accessibilityNodeInfo;
        ja4 ja4Var;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        AccessibilityNodeInfo accessibilityNodeInfo4;
        mq5 mq5Var2;
        int i2;
        String str;
        int i3;
        int i4;
        ze zeVar2;
        boolean z2;
        xa6 xa6Var2;
        Object g;
        Object g2;
        y1 y1Var;
        y1 y1Var2;
        y1 y1Var3;
        String t;
        x35 x35Var;
        Object g3;
        e76 e76Var;
        e76 e76Var2;
        int i5;
        int d;
        te teVar2;
        int d2;
        String str2;
        v2 v2Var;
        boolean z3;
        Object g4;
        Object g5;
        sm3 sm3Var;
        p2 p2Var;
        p2 p2Var2;
        int i6;
        y1 y1Var4;
        String str3;
        List list;
        sm3 v;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ArrayList arrayList;
        e37 e37Var;
        oj2 oj2Var;
        int i7;
        int i8;
        boolean z9;
        xa6 xa6Var3;
        int i9;
        View view;
        boolean z10;
        ze zeVar3 = (ze) this.Z;
        AccessibilityManager accessibilityManager2 = zeVar3.Z;
        te teVar3 = zeVar3.R;
        if (teVar3.getComposeViewContext().c.getLifecycle().b() == tt3.DESTROYED) {
            if (!accessibilityManager2.isEnabled()) {
                v2Var = new v2(AccessibilityNodeInfo.obtain());
                zeVar2 = zeVar3;
                i3 = i;
                if (zeVar2.k0) {
                    if (i3 == zeVar2.g0) {
                        zeVar2.i0 = v2Var;
                    }
                    if (i3 == zeVar2.h0) {
                        zeVar2.j0 = v2Var;
                    }
                }
                return v2Var;
            }
            v2Var = null;
            zeVar2 = zeVar3;
            i3 = i;
            if (zeVar2.k0) {
            }
            return v2Var;
        }
        za6 za6Var = (za6) zeVar3.s().b(i);
        if (za6Var == null) {
            if (!accessibilityManager2.isEnabled()) {
                v2Var = new v2(AccessibilityNodeInfo.obtain());
                zeVar2 = zeVar3;
                i3 = i;
                if (zeVar2.k0) {
                }
                return v2Var;
            }
            v2Var = null;
            zeVar2 = zeVar3;
            i3 = i;
            if (zeVar2.k0) {
            }
            return v2Var;
        }
        xa6 xa6Var4 = za6Var.a;
        ta6 k = xa6Var4.k();
        sm3 sm3Var2 = xa6Var4.c;
        Object g6 = k.A.g(bb6.o);
        if (g6 == null) {
            g6 = null;
        }
        boolean k2 = nb3.k(g6, Boolean.TRUE);
        if (k2) {
            if (Build.VERSION.SDK_INT >= 34) {
                z10 = c2.j(accessibilityManager2);
            } else {
                z10 = true;
            }
            if (!z10) {
                zeVar2 = zeVar3;
                i3 = i;
                v2Var = null;
                if (zeVar2.k0) {
                }
                return v2Var;
            }
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        v2 v2Var2 = new v2(obtain);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            c2.l(obtain, k2);
        } else {
            v2Var2.h(64, k2);
        }
        if (i == -1) {
            ViewParent parentForAccessibility = teVar3.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                view = (View) parentForAccessibility;
            } else {
                view = null;
            }
            v2Var2.b = -1;
            obtain.setParent(view);
        } else {
            xa6 l = xa6Var4.l();
            if (l != null) {
                num = Integer.valueOf(l.f);
            } else {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == teVar3.getSemanticsOwner().a().f) {
                    intValue = -1;
                }
                v2Var2.b = intValue;
                obtain.setParent(teVar3, intValue);
            } else {
                p53.d("semanticsNode " + i + " has null parent");
                e41.c();
                return null;
            }
        }
        v2Var2.c = i;
        obtain.setSource(teVar3, i);
        obtain.setBoundsInScreen(zeVar3.k(za6Var));
        n94 n94Var2 = zeVar3.F0;
        un6 un6Var2 = zeVar3.o0;
        Resources resources = teVar3.getContext().getResources();
        v2Var2.i("android.view.View");
        ta6 ta6Var2 = xa6Var4.d;
        ja4 ja4Var2 = ta6Var2.A;
        if (ja4Var2.c(bb6.G)) {
            v2Var2.i("android.widget.EditText");
        }
        if (ja4Var2.c(bb6.C)) {
            v2Var2.i("android.widget.TextView");
        }
        Object g7 = ja4Var2.g(bb6.z);
        if (g7 == null) {
            g7 = null;
        }
        mq5 mq5Var3 = (mq5) g7;
        if (mq5Var3 != null) {
            int i11 = mq5Var3.a;
            if (!xa6Var4.o()) {
                accessibilityManager = accessibilityManager2;
                i9 = 4;
                un6Var = un6Var2;
            } else {
                accessibilityManager = accessibilityManager2;
                i9 = 4;
                un6Var = un6Var2;
            }
            if (i11 == i9) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
            } else if (i11 == 2) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
            } else {
                String d0 = ln2.d0(i11);
                if (i11 != 5 || xa6Var4.q() || ta6Var2.L) {
                    v2Var2.i(d0);
                }
            }
        } else {
            accessibilityManager = accessibilityManager2;
            un6Var = un6Var2;
        }
        obtain.setPackageName(teVar3.getContext().getPackageName());
        obtain.setImportantForAccessibility(u24.w(xa6Var4));
        if (i10 >= 34) {
            z = c2.j(accessibilityManager);
        } else {
            z = true;
        }
        List j = xa6.j(4, xa6Var4);
        int size = j.size();
        boolean z11 = z;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            AccessibilityNodeInfo accessibilityNodeInfo5 = v2Var2.a;
            if (i13 < size) {
                int i14 = size;
                xa6 xa6Var5 = (xa6) j.get(i13);
                List list2 = j;
                g93 s = zeVar3.s();
                int i15 = i13;
                int i16 = xa6Var5.f;
                if (s.a(i16)) {
                    if (teVar3.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(xa6Var5.c) == null) {
                        if (i16 != -1) {
                            za6 za6Var2 = (za6) zeVar3.s().b(i16);
                            if (za6Var2 != null && (xa6Var3 = za6Var2.a) != null) {
                                Object g8 = xa6Var3.k().A.g(bb6.o);
                                if (g8 == null) {
                                    g8 = null;
                                }
                                z9 = nb3.k(g8, Boolean.TRUE);
                            } else {
                                z9 = false;
                            }
                            if (z11 || !z9) {
                                accessibilityNodeInfo5.addChild(teVar3, i16);
                            }
                            n94Var2.f(i16, i12);
                            i12++;
                        }
                    } else {
                        u34.a();
                        return null;
                    }
                }
                i13 = i15 + 1;
                j = list2;
                size = i14;
            } else {
                if (i == zeVar3.g0) {
                    accessibilityNodeInfo5.setAccessibilityFocused(true);
                    v2Var2.b(p2.g);
                } else {
                    accessibilityNodeInfo5.setAccessibilityFocused(false);
                    v2Var2.b(p2.f);
                }
                fp B = n16.B(xa6Var4);
                if (B != null) {
                    teVar3.getFontFamilyResolver();
                    qh1 density = teVar3.getDensity();
                    m44 m44Var = zeVar3.B0;
                    String str4 = B.B;
                    teVar = teVar3;
                    List list3 = B.A;
                    SpannableString spannableString2 = new SpannableString(str4);
                    ArrayList arrayList2 = B.L;
                    zeVar = zeVar3;
                    if (arrayList2 != null) {
                        int size2 = arrayList2.size();
                        n94Var = n94Var2;
                        int i17 = 0;
                        while (i17 < size2) {
                            int i18 = size2;
                            ep epVar = (ep) arrayList2.get(i17);
                            int i19 = i17;
                            nn6 nn6Var = (nn6) epVar.a;
                            ArrayList arrayList3 = arrayList2;
                            int i20 = epVar.b;
                            int i21 = epVar.c;
                            ta6 ta6Var3 = ta6Var2;
                            mq5 mq5Var4 = mq5Var3;
                            long b = nn6Var.a.b();
                            ja4 ja4Var3 = ja4Var2;
                            AccessibilityNodeInfo accessibilityNodeInfo6 = obtain;
                            long j2 = nn6Var.b;
                            oj2 oj2Var2 = nn6Var.c;
                            ij2 ij2Var = nn6Var.d;
                            f37 f37Var = nn6Var.j;
                            gy3 gy3Var = nn6Var.k;
                            AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfo5;
                            m44 m44Var2 = m44Var;
                            long j3 = nn6Var.l;
                            b17 b17Var = nn6Var.m;
                            e37 e37Var2 = nn6Var.a;
                            xa6 xa6Var6 = xa6Var4;
                            if (kt0.d(b, e37Var2.b())) {
                                e37Var = e37Var2;
                            } else if (b != 16) {
                                e37Var = new st0(b);
                            } else {
                                e37Var = d37.a;
                            }
                            hi2.M(spannableString2, e37Var.b(), i20, i21);
                            SpannableString spannableString3 = spannableString2;
                            hi2.N(spannableString3, j2, density, i20, i21);
                            if (oj2Var2 == null && ij2Var == null) {
                                i8 = 33;
                            } else {
                                if (oj2Var2 == null) {
                                    oj2Var = oj2.Y;
                                } else {
                                    oj2Var = oj2Var2;
                                }
                                if (ij2Var != null) {
                                    i7 = ij2Var.a;
                                } else {
                                    i7 = 0;
                                }
                                StyleSpan styleSpan = new StyleSpan(vy7.j0(i7, oj2Var));
                                i8 = 33;
                                spannableString3.setSpan(styleSpan, i20, i21, 33);
                            }
                            if (b17Var != null) {
                                int i22 = b17Var.a;
                                if ((i22 | 1) == i22) {
                                    spannableString3.setSpan(new UnderlineSpan(), i20, i21, i8);
                                }
                                if ((i22 | 2) == i22) {
                                    spannableString3.setSpan(new StrikethroughSpan(), i20, i21, i8);
                                }
                            }
                            if (f37Var != null) {
                                spannableString3.setSpan(new ScaleXSpan(f37Var.a), i20, i21, i8);
                            }
                            hi2.O(spannableString3, gy3Var, i20, i21);
                            if (j3 != 16) {
                                spannableString3.setSpan(new BackgroundColorSpan(hv.b0(j3)), i20, i21, i8);
                            }
                            i17 = i19 + 1;
                            spannableString2 = spannableString3;
                            xa6Var4 = xa6Var6;
                            size2 = i18;
                            arrayList2 = arrayList3;
                            ta6Var2 = ta6Var3;
                            mq5Var3 = mq5Var4;
                            ja4Var2 = ja4Var3;
                            obtain = accessibilityNodeInfo6;
                            accessibilityNodeInfo5 = accessibilityNodeInfo7;
                            m44Var = m44Var2;
                        }
                    } else {
                        n94Var = n94Var2;
                    }
                    ta6Var = ta6Var2;
                    mq5Var = mq5Var3;
                    accessibilityNodeInfo = accessibilityNodeInfo5;
                    m44 m44Var3 = m44Var;
                    ja4Var = ja4Var2;
                    accessibilityNodeInfo2 = obtain;
                    SpannableString spannableString4 = spannableString2;
                    xa6Var = xa6Var4;
                    int length = str4.length();
                    ?? r4 = yt1.A;
                    if (list3 != null) {
                        arrayList = new ArrayList(list3.size());
                        int size3 = list3.size();
                        for (int i23 = 0; i23 < size3; i23++) {
                            Object obj = list3.get(i23);
                            ep epVar2 = (ep) obj;
                            if ((epVar2.a instanceof ul7) && gp.b(0, length, epVar2.b, epVar2.c)) {
                                arrayList.add(obj);
                            }
                        }
                    } else {
                        arrayList = r4;
                    }
                    int size4 = arrayList.size();
                    for (int i24 = 0; i24 < size4; i24++) {
                        ep epVar3 = (ep) arrayList.get(i24);
                        ul7 ul7Var = (ul7) epVar3.a;
                        int i25 = epVar3.b;
                        int i26 = epVar3.c;
                        if (ul7Var instanceof ul7) {
                            spannableString4.setSpan(new TtsSpan.VerbatimBuilder(ul7Var.a).build(), i25, i26, 33);
                        } else {
                            i.d();
                            return null;
                        }
                    }
                    int length2 = str4.length();
                    if (list3 != null) {
                        r4 = new ArrayList(list3.size());
                        int size5 = list3.size();
                        for (int i27 = 0; i27 < size5; i27++) {
                            Object obj2 = list3.get(i27);
                            ep epVar4 = (ep) obj2;
                            if ((epVar4.a instanceof zh7) && gp.b(0, length2, epVar4.b, epVar4.c)) {
                                r4.add(obj2);
                            }
                        }
                    }
                    int size6 = r4.size();
                    int i28 = 0;
                    while (i28 < size6) {
                        ep epVar5 = (ep) r4.get(i28);
                        zh7 zh7Var = (zh7) epVar5.a;
                        int i29 = epVar5.b;
                        int i30 = epVar5.c;
                        m44 m44Var4 = m44Var3;
                        WeakHashMap weakHashMap = (WeakHashMap) m44Var4.B;
                        Object obj3 = weakHashMap.get(zh7Var);
                        if (obj3 == null) {
                            obj3 = new URLSpan(zh7Var.a);
                            weakHashMap.put(zh7Var, obj3);
                        }
                        spannableString4.setSpan((URLSpan) obj3, i29, i30, 33);
                        i28++;
                        m44Var3 = m44Var4;
                    }
                    m44 m44Var5 = m44Var3;
                    List a = B.a(str4.length());
                    int size7 = a.size();
                    for (int i31 = 0; i31 < size7; i31++) {
                        ep epVar6 = (ep) a.get(i31);
                        int i32 = epVar6.b;
                        Object obj4 = epVar6.a;
                        int i33 = epVar6.c;
                        if (i32 != i33) {
                            pv3 pv3Var = (pv3) obj4;
                            if (pv3Var instanceof ov3) {
                                obj4.getClass();
                                ov3 ov3Var = (ov3) obj4;
                                ep epVar7 = new ep(ov3Var, i32, i33);
                                WeakHashMap weakHashMap2 = (WeakHashMap) m44Var5.L;
                                Object obj5 = weakHashMap2.get(epVar7);
                                if (obj5 == null) {
                                    obj5 = new URLSpan(ov3Var.a);
                                    weakHashMap2.put(epVar7, obj5);
                                }
                                spannableString4.setSpan((URLSpan) obj5, i32, i33, 33);
                            } else {
                                WeakHashMap weakHashMap3 = (WeakHashMap) m44Var5.R;
                                Object obj6 = weakHashMap3.get(epVar6);
                                if (obj6 == null) {
                                    obj6 = new qw0(pv3Var);
                                    weakHashMap3.put(epVar6, obj6);
                                }
                                spannableString4.setSpan((ClickableSpan) obj6, i32, i33, 33);
                            }
                        }
                    }
                    spannableString = (SpannableString) ze.P(spannableString4);
                } else {
                    zeVar = zeVar3;
                    teVar = teVar3;
                    n94Var = n94Var2;
                    xa6Var = xa6Var4;
                    ta6Var = ta6Var2;
                    mq5Var = mq5Var3;
                    accessibilityNodeInfo = accessibilityNodeInfo5;
                    ja4Var = ja4Var2;
                    accessibilityNodeInfo2 = obtain;
                    spannableString = null;
                }
                v2Var2.m(spannableString);
                fb6 fb6Var = bb6.M;
                ja4 ja4Var4 = ja4Var;
                if (ja4Var4.c(fb6Var)) {
                    accessibilityNodeInfo3 = accessibilityNodeInfo2;
                    accessibilityNodeInfo3.setContentInvalid(true);
                    Object g9 = ja4Var4.g(fb6Var);
                    if (g9 == null) {
                        g9 = null;
                    }
                    accessibilityNodeInfo4 = accessibilityNodeInfo;
                    accessibilityNodeInfo4.setError((CharSequence) g9);
                } else {
                    accessibilityNodeInfo3 = accessibilityNodeInfo2;
                    accessibilityNodeInfo4 = accessibilityNodeInfo;
                }
                String A = n16.A(xa6Var, resources);
                if (Build.VERSION.SDK_INT >= 30) {
                    q2.l(accessibilityNodeInfo4, A);
                } else {
                    accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", A);
                }
                accessibilityNodeInfo4.setCheckable(n16.z(xa6Var));
                Object g10 = ja4Var4.g(bb6.K);
                if (g10 == null) {
                    g10 = null;
                }
                a87 a87Var = (a87) g10;
                if (a87Var != null) {
                    if (a87Var == a87.On) {
                        accessibilityNodeInfo4.setChecked(true);
                    } else if (a87Var == a87.Off) {
                        accessibilityNodeInfo4.setChecked(false);
                    }
                }
                Object g11 = ja4Var4.g(bb6.J);
                if (g11 == null) {
                    g11 = null;
                }
                Boolean bool = (Boolean) g11;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (mq5Var == null) {
                        mq5Var2 = mq5Var;
                        i2 = 4;
                    } else {
                        mq5Var2 = mq5Var;
                        i2 = 4;
                        if (mq5Var2.a == 4) {
                            accessibilityNodeInfo3.setSelected(booleanValue);
                        }
                    }
                    accessibilityNodeInfo4.setChecked(booleanValue);
                } else {
                    mq5Var2 = mq5Var;
                    i2 = 4;
                }
                ta6 ta6Var4 = ta6Var;
                if (!ta6Var4.L || xa6.j(i2, xa6Var).isEmpty()) {
                    Object g12 = ja4Var4.g(bb6.a);
                    if (g12 == null) {
                        g12 = null;
                    }
                    List list4 = (List) g12;
                    if (list4 != null) {
                        str = (String) gt0.J0(list4);
                    } else {
                        str = null;
                    }
                    accessibilityNodeInfo4.setContentDescription(str);
                }
                Object g13 = ja4Var4.g(bb6.A);
                if (g13 == null) {
                    g13 = null;
                }
                String str5 = (String) g13;
                if (str5 != null) {
                    xa6 xa6Var7 = xa6Var;
                    while (true) {
                        if (xa6Var7 != null) {
                            ta6 ta6Var5 = xa6Var7.d;
                            fb6 fb6Var2 = cb6.a;
                            if (ta6Var5.A.c(fb6Var2)) {
                                z8 = ((Boolean) ta6Var5.c(fb6Var2)).booleanValue();
                                break;
                            }
                            xa6Var7 = xa6Var7.l();
                        } else {
                            z8 = false;
                            break;
                        }
                    }
                    if (z8) {
                        accessibilityNodeInfo3.setViewIdResourceName(str5);
                    }
                }
                Object g14 = ja4Var4.g(bb6.h);
                if (g14 == null) {
                    g14 = null;
                }
                if (((jg7) g14) != null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo4.setHeading(true);
                    } else {
                        v2Var2.h(2, true);
                    }
                }
                Object g15 = ja4Var4.g(bb6.i);
                if (g15 == null) {
                    g15 = null;
                }
                if (((jg7) g15) != null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        accessibilityNodeInfo3.setTextEntryKey(true);
                    } else {
                        v2Var2.h(8, true);
                    }
                }
                i3 = i;
                if (i3 != -1) {
                    int d3 = n94Var.d(xa6Var.f);
                    if (d3 != -1) {
                        accessibilityNodeInfo3.setDrawingOrder(d3);
                    } else {
                        Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                    }
                }
                accessibilityNodeInfo3.setPassword(ja4Var4.c(bb6.L));
                Object g16 = ja4Var4.g(bb6.O);
                if (g16 == null) {
                    g16 = null;
                }
                Boolean bool2 = Boolean.TRUE;
                accessibilityNodeInfo3.setEditable(nb3.k(g16, bool2));
                Object g17 = ja4Var4.g(bb6.P);
                if (g17 == null) {
                    g17 = null;
                }
                Integer num2 = (Integer) g17;
                if (num2 != null) {
                    i4 = num2.intValue();
                } else {
                    i4 = -1;
                }
                accessibilityNodeInfo4.setMaxTextLength(i4);
                accessibilityNodeInfo4.setEnabled(n16.i(xa6Var));
                fb6 fb6Var3 = bb6.l;
                accessibilityNodeInfo4.setFocusable(ja4Var4.c(fb6Var3));
                if (accessibilityNodeInfo3.isFocusable()) {
                    accessibilityNodeInfo4.setFocused(((Boolean) ta6Var4.c(fb6Var3)).booleanValue());
                    if (accessibilityNodeInfo3.isFocused()) {
                        v2Var2.a(2);
                        zeVar2 = zeVar;
                        zeVar2.h0 = i3;
                    } else {
                        zeVar2 = zeVar;
                        z2 = true;
                        v2Var2.a(1);
                        accessibilityNodeInfo4.setVisibleToUser(u24.v(xa6Var) ^ z2);
                        if (!xa6Var.o()) {
                            xa6Var2 = xa6Var.l();
                            xa6Var2.getClass();
                        } else {
                            xa6Var2 = xa6Var;
                        }
                        if (xa6Var2.m().f()) {
                            accessibilityNodeInfo4.setVisibleToUser(false);
                        }
                        g = ja4Var4.g(bb6.k);
                        if (g == null) {
                            g = null;
                        }
                        if (((rx3) g) != null) {
                            accessibilityNodeInfo3.setLiveRegion(1);
                        }
                        accessibilityNodeInfo4.setClickable(false);
                        g2 = ja4Var4.g(sa6.b);
                        if (g2 == null) {
                            g2 = null;
                        }
                        y1Var = (y1) g2;
                        if (y1Var != null) {
                            Object g18 = ja4Var4.g(bb6.J);
                            if (g18 == null) {
                                g18 = null;
                            }
                            boolean k3 = nb3.k(g18, bool2);
                            if ((mq5Var2 != null && mq5Var2.a == 4) || (mq5Var2 != null && mq5Var2.a == 3)) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6 && (!z6 || k3)) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            accessibilityNodeInfo4.setClickable(z7);
                            if (n16.i(xa6Var) && accessibilityNodeInfo3.isClickable()) {
                                v2Var2.b(new p2(16, y1Var.a));
                            }
                        }
                        accessibilityNodeInfo4.setLongClickable(false);
                        y1Var2 = (y1) xk2.r(ta6Var4, sa6.c);
                        if (y1Var2 != null) {
                            accessibilityNodeInfo4.setLongClickable(true);
                            if (n16.i(xa6Var)) {
                                v2Var2.b(new p2(32, y1Var2.a));
                            }
                        }
                        y1Var3 = (y1) xk2.r(ta6Var4, sa6.q);
                        if (y1Var3 != null) {
                            v2Var2.b(new p2(16384, y1Var3.a));
                        }
                        if (n16.i(xa6Var)) {
                            y1 y1Var5 = (y1) xk2.r(ta6Var4, sa6.k);
                            if (y1Var5 != null) {
                                v2Var2.b(new p2(2097152, y1Var5.a));
                            }
                            y1 y1Var6 = (y1) xk2.r(ta6Var4, sa6.p);
                            if (y1Var6 != null) {
                                v2Var2.b(new p2(16908372, y1Var6.a));
                            }
                            y1 y1Var7 = (y1) xk2.r(ta6Var4, sa6.r);
                            if (y1Var7 != null) {
                                v2Var2.b(new p2(65536, y1Var7.a));
                            }
                            y1 y1Var8 = (y1) xk2.r(ta6Var4, sa6.s);
                            if (y1Var8 != null && accessibilityNodeInfo3.isFocused()) {
                                ClipDescription primaryClipDescription = teVar.m15getClipboardManager().a().getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    z5 = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    v2Var2.b(new p2(32768, y1Var8.a));
                                }
                            }
                        }
                        t = ze.t(xa6Var);
                        if (t != null && t.length() != 0) {
                            accessibilityNodeInfo3.setTextSelection(zeVar2.r(xa6Var), zeVar2.q(xa6Var));
                            y1Var4 = (y1) xk2.r(ta6Var4, sa6.j);
                            if (y1Var4 == null) {
                                str3 = y1Var4.a;
                            } else {
                                str3 = null;
                            }
                            v2Var2.b(new p2(131072, str3));
                            v2Var2.a(256);
                            v2Var2.a(512);
                            accessibilityNodeInfo4.setMovementGranularities(11);
                            list = (List) xk2.r(ta6Var4, bb6.a);
                            if ((list != null || list.isEmpty()) && ja4Var4.c(sa6.a) && (!ja4Var4.c(bb6.G) || nb3.k(xk2.r(ta6Var4, fb6Var3), bool2))) {
                                v = sm3Var2.v();
                                while (true) {
                                    if (v != null) {
                                        ta6 x = v.x();
                                        if (x != null && x.L) {
                                            if (x.A.c(bb6.G)) {
                                                break;
                                            }
                                        }
                                        v = v.v();
                                    } else {
                                        v = null;
                                        break;
                                    }
                                }
                                if (v != null) {
                                    ta6 x2 = v.x();
                                    if (x2 != null) {
                                        Object g19 = x2.A.g(bb6.l);
                                        if (g19 == null) {
                                            g19 = null;
                                        }
                                        z4 = nb3.k(g19, Boolean.TRUE);
                                    } else {
                                        z4 = false;
                                    }
                                }
                                accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add("androidx.compose.ui.semantics.id");
                            CharSequence g20 = v2Var2.g();
                            if (g20 != null && g20.length() != 0 && ja4Var4.c(sa6.a)) {
                                arrayList4.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (ja4Var4.c(bb6.A)) {
                                arrayList4.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (ja4Var4.c(bb6.Q)) {
                                arrayList4.add("androidx.compose.ui.semantics.shapeType");
                                arrayList4.add("androidx.compose.ui.semantics.shapeRect");
                                arrayList4.add("androidx.compose.ui.semantics.shapeCorners");
                                arrayList4.add("androidx.compose.ui.semantics.shapeRegion");
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                accessibilityNodeInfo3.setAvailableExtraData(arrayList4);
                            }
                        }
                        x35Var = (x35) xk2.r(ta6Var4, bb6.c);
                        if (x35Var != null) {
                            float f = x35Var.a;
                            bs0 bs0Var = x35Var.b;
                            fb6 fb6Var4 = sa6.i;
                            if (ja4Var4.c(fb6Var4)) {
                                v2Var2.i("android.widget.SeekBar");
                            } else {
                                v2Var2.i("android.widget.ProgressBar");
                            }
                            if (x35Var != x35.d) {
                                accessibilityNodeInfo3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, bs0Var.a, bs0Var.b, f));
                            }
                            if (xa6Var.n().A.c(fb6Var4) && n16.i(xa6Var)) {
                                float floatValue = ((Number) bs0Var.a()).floatValue();
                                float floatValue2 = ((Number) bs0Var.b()).floatValue();
                                if (floatValue < floatValue2) {
                                    floatValue = floatValue2;
                                }
                                if (f < floatValue) {
                                    v2Var2.b(p2.h);
                                }
                                float floatValue3 = ((Number) bs0Var.b()).floatValue();
                                float floatValue4 = ((Number) bs0Var.a()).floatValue();
                                if (floatValue3 > floatValue4) {
                                    floatValue3 = floatValue4;
                                }
                                if (f > floatValue3) {
                                    v2Var2.b(p2.i);
                                }
                            }
                        }
                        if (n16.i(xa6Var)) {
                            Object g21 = xa6Var.d.A.g(sa6.i);
                            if (g21 == null) {
                                g21 = null;
                            }
                            y1 y1Var9 = (y1) g21;
                            if (y1Var9 != null) {
                                v2Var2.b(new p2(16908349, y1Var9.a));
                            }
                        }
                        l.L(v2Var2, xa6Var);
                        g3 = xa6Var.k().A.g(bb6.g);
                        if (g3 == null) {
                            g3 = null;
                        }
                        if (g3 != null) {
                            xa6 l2 = xa6Var.l();
                            if (l2 != null) {
                                Object g22 = l2.k().A.g(bb6.e);
                                if (g22 == null) {
                                    g22 = null;
                                }
                                if (g22 != null) {
                                    Object g23 = l2.k().A.g(bb6.f);
                                    if (g23 == null) {
                                        g23 = null;
                                    }
                                    bt0 bt0Var = (bt0) g23;
                                    if (bt0Var == null || (bt0Var.a >= 0 && bt0Var.b >= 0)) {
                                        if (xa6Var.k().A.c(bb6.J)) {
                                            ArrayList arrayList5 = new ArrayList();
                                            List j4 = xa6.j(4, l2);
                                            int size8 = j4.size();
                                            int i34 = 0;
                                            for (int i35 = 0; i35 < size8; i35++) {
                                                xa6 xa6Var8 = (xa6) j4.get(i35);
                                                if (xa6Var8.k().A.c(bb6.J)) {
                                                    arrayList5.add(xa6Var8);
                                                    if (xa6Var8.c.w() < xa6Var.c.w()) {
                                                        i34++;
                                                    }
                                                }
                                            }
                                            if (!arrayList5.isEmpty()) {
                                                boolean l3 = l.l(arrayList5);
                                                if (l3) {
                                                    i6 = 0;
                                                } else {
                                                    i6 = i34;
                                                }
                                                if (!l3) {
                                                    i34 = 0;
                                                }
                                                Object g24 = xa6Var.k().A.g(bb6.J);
                                                if (g24 == null) {
                                                    g24 = Boolean.FALSE;
                                                }
                                                v2Var2.k(u2.b(((Boolean) g24).booleanValue(), i6, 1, i34, 1));
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            u34.a();
                        }
                        e76Var = (e76) xk2.r(xa6Var.n(), bb6.v);
                        y1 y1Var10 = (y1) xk2.r(xa6Var.n(), sa6.d);
                        if (e76Var != null && y1Var10 != null) {
                            g5 = xa6Var.k().A.g(bb6.f);
                            if (g5 == null) {
                                g5 = null;
                            }
                            if (g5 == null) {
                                Object g25 = xa6Var.k().A.g(bb6.e);
                                if (g25 == null) {
                                    g25 = null;
                                }
                                if (g25 == null) {
                                    v2Var2.i("android.widget.HorizontalScrollView");
                                }
                            }
                            if (((Number) e76Var.b.c()).floatValue() > RecyclerView.B1) {
                                v2Var2.l(true);
                            }
                            if (n16.i(xa6Var)) {
                                if (ze.z(e76Var)) {
                                    v2Var2.b(p2.h);
                                    sm3Var = sm3Var2;
                                    if (sm3Var.v0 == kk3.Rtl) {
                                        p2Var2 = p2.o;
                                    } else {
                                        p2Var2 = p2.q;
                                    }
                                    v2Var2.b(p2Var2);
                                } else {
                                    sm3Var = sm3Var2;
                                }
                                if (ze.y(e76Var)) {
                                    v2Var2.b(p2.i);
                                    if (sm3Var.v0 == kk3.Rtl) {
                                        p2Var = p2.q;
                                    } else {
                                        p2Var = p2.o;
                                    }
                                    v2Var2.b(p2Var);
                                }
                            }
                        }
                        e76Var2 = (e76) xk2.r(xa6Var.n(), bb6.w);
                        if (e76Var2 != null && y1Var10 != null) {
                            g4 = xa6Var.k().A.g(bb6.f);
                            if (g4 == null) {
                                g4 = null;
                            }
                            if (g4 == null) {
                                Object g26 = xa6Var.k().A.g(bb6.e);
                                if (g26 == null) {
                                    g26 = null;
                                }
                                if (g26 == null) {
                                    v2Var2.i("android.widget.ScrollView");
                                }
                            }
                            if (((Number) e76Var2.b.c()).floatValue() > RecyclerView.B1) {
                                v2Var2.l(true);
                            }
                            if (n16.i(xa6Var)) {
                                if (ze.z(e76Var2)) {
                                    v2Var2.b(p2.h);
                                    v2Var2.b(p2.p);
                                }
                                if (ze.y(e76Var2)) {
                                    v2Var2.b(p2.i);
                                    v2Var2.b(p2.n);
                                }
                            }
                        }
                        i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 29) {
                            lb4.l(v2Var2, xa6Var);
                        }
                        CharSequence charSequence = (CharSequence) xk2.r(xa6Var.n(), bb6.d);
                        if (i5 < 28) {
                            accessibilityNodeInfo4.setPaneTitle(charSequence);
                        } else {
                            accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (n16.i(xa6Var)) {
                            y1 y1Var11 = (y1) xk2.r(xa6Var.n(), sa6.t);
                            if (y1Var11 != null) {
                                v2Var2.b(new p2(262144, y1Var11.a));
                            }
                            y1 y1Var12 = (y1) xk2.r(xa6Var.n(), sa6.u);
                            if (y1Var12 != null) {
                                v2Var2.b(new p2(524288, y1Var12.a));
                            }
                            y1 y1Var13 = (y1) xk2.r(xa6Var.n(), sa6.v);
                            if (y1Var13 != null) {
                                v2Var2.b(new p2(1048576, y1Var13.a));
                            }
                            ta6 n = xa6Var.n();
                            fb6 fb6Var5 = sa6.x;
                            if (n.A.c(fb6Var5)) {
                                List list5 = (List) xa6Var.n().c(fb6Var5);
                                int size9 = list5.size();
                                o94 o94Var = ze.J0;
                                if (size9 < o94Var.b) {
                                    un6 un6Var3 = new un6(0);
                                    y94 a2 = th4.a();
                                    un6 un6Var4 = un6Var;
                                    if (un6Var4.A) {
                                        vy7.I(un6Var4);
                                    }
                                    if (g04.v(un6Var4.R, i3, un6Var4.B) >= 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        y94 y94Var = (y94) un6Var4.c(i3);
                                        int[] iArr = o94Var.a;
                                        int i36 = o94Var.b;
                                        int[] iArr2 = new int[16];
                                        int i37 = 0;
                                        int i38 = 0;
                                        while (i37 < i36) {
                                            int i39 = iArr[i37];
                                            int i40 = i36;
                                            int i41 = i38 + 1;
                                            y94 y94Var2 = y94Var;
                                            if (iArr2.length < i41) {
                                                iArr2 = Arrays.copyOf(iArr2, Math.max(i41, (iArr2.length * 3) / 2));
                                            }
                                            iArr2[i38] = i39;
                                            i37++;
                                            i38 = i41;
                                            i36 = i40;
                                            y94Var = y94Var2;
                                        }
                                        y94 y94Var3 = y94Var;
                                        ArrayList arrayList6 = new ArrayList();
                                        if (list5.size() <= 0) {
                                            if (arrayList6.size() > 0) {
                                                xg6.A(arrayList6.get(0));
                                                if (i38 <= 0) {
                                                    e41.q("Index must be between 0 and size");
                                                    return null;
                                                }
                                                int i42 = iArr2[0];
                                                throw null;
                                            }
                                        } else {
                                            xg6.A(list5.get(0));
                                            y94Var3.getClass();
                                            throw null;
                                        }
                                    } else if (list5.size() > 0) {
                                        xg6.A(list5.get(0));
                                        o94Var.c(0);
                                        throw null;
                                    }
                                    zeVar2.n0.e(i3, un6Var3);
                                    un6Var4.e(i3, a2);
                                } else {
                                    i.m(lb1.o(new StringBuilder("Can't have more than "), o94Var.b, " custom actions for one widget"));
                                    return null;
                                }
                            }
                        }
                        boolean j5 = n16.j(xa6Var, resources);
                        if (Build.VERSION.SDK_INT < 28) {
                            accessibilityNodeInfo4.setScreenReaderFocusable(j5);
                        } else {
                            v2Var2.h(1, j5);
                        }
                        d = zeVar2.x0.d(i3);
                        if (d == -1) {
                            ln2.b0(teVar.getAndroidViewsHandler$ui(), d);
                            teVar2 = teVar;
                            accessibilityNodeInfo4.setTraversalBefore(teVar2, d);
                            zeVar2.j(i3, v2Var2, zeVar2.z0, null);
                        } else {
                            teVar2 = teVar;
                        }
                        d2 = zeVar2.y0.d(i3);
                        if (d2 != -1) {
                            ln2.b0(teVar2.getAndroidViewsHandler$ui(), d2);
                        }
                        str2 = (String) xk2.r(xa6Var.n(), cb6.b);
                        if (str2 != null) {
                            v2Var2.i(str2);
                        }
                        v2Var = v2Var2;
                    }
                } else {
                    zeVar2 = zeVar;
                }
                z2 = true;
                accessibilityNodeInfo4.setVisibleToUser(u24.v(xa6Var) ^ z2);
                if (!xa6Var.o()) {
                }
                if (xa6Var2.m().f()) {
                }
                g = ja4Var4.g(bb6.k);
                if (g == null) {
                }
                if (((rx3) g) != null) {
                }
                accessibilityNodeInfo4.setClickable(false);
                g2 = ja4Var4.g(sa6.b);
                if (g2 == null) {
                }
                y1Var = (y1) g2;
                if (y1Var != null) {
                }
                accessibilityNodeInfo4.setLongClickable(false);
                y1Var2 = (y1) xk2.r(ta6Var4, sa6.c);
                if (y1Var2 != null) {
                }
                y1Var3 = (y1) xk2.r(ta6Var4, sa6.q);
                if (y1Var3 != null) {
                }
                if (n16.i(xa6Var)) {
                }
                t = ze.t(xa6Var);
                if (t != null) {
                    accessibilityNodeInfo3.setTextSelection(zeVar2.r(xa6Var), zeVar2.q(xa6Var));
                    y1Var4 = (y1) xk2.r(ta6Var4, sa6.j);
                    if (y1Var4 == null) {
                    }
                    v2Var2.b(new p2(131072, str3));
                    v2Var2.a(256);
                    v2Var2.a(512);
                    accessibilityNodeInfo4.setMovementGranularities(11);
                    list = (List) xk2.r(ta6Var4, bb6.a);
                    if (list != null) {
                    }
                    v = sm3Var2.v();
                    while (true) {
                        if (v != null) {
                        }
                        v = v.v();
                    }
                    if (v != null) {
                    }
                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                }
                x35Var = (x35) xk2.r(ta6Var4, bb6.c);
                if (x35Var != null) {
                }
                if (n16.i(xa6Var)) {
                }
                l.L(v2Var2, xa6Var);
                g3 = xa6Var.k().A.g(bb6.g);
                if (g3 == null) {
                }
                if (g3 != null) {
                }
                e76Var = (e76) xk2.r(xa6Var.n(), bb6.v);
                y1 y1Var102 = (y1) xk2.r(xa6Var.n(), sa6.d);
                if (e76Var != null) {
                    g5 = xa6Var.k().A.g(bb6.f);
                    if (g5 == null) {
                    }
                    if (g5 == null) {
                    }
                    if (((Number) e76Var.b.c()).floatValue() > RecyclerView.B1) {
                    }
                    if (n16.i(xa6Var)) {
                    }
                }
                e76Var2 = (e76) xk2.r(xa6Var.n(), bb6.w);
                if (e76Var2 != null) {
                    g4 = xa6Var.k().A.g(bb6.f);
                    if (g4 == null) {
                    }
                    if (g4 == null) {
                    }
                    if (((Number) e76Var2.b.c()).floatValue() > RecyclerView.B1) {
                    }
                    if (n16.i(xa6Var)) {
                    }
                }
                i5 = Build.VERSION.SDK_INT;
                if (i5 >= 29) {
                }
                CharSequence charSequence2 = (CharSequence) xk2.r(xa6Var.n(), bb6.d);
                if (i5 < 28) {
                }
                if (n16.i(xa6Var)) {
                }
                boolean j52 = n16.j(xa6Var, resources);
                if (Build.VERSION.SDK_INT < 28) {
                }
                d = zeVar2.x0.d(i3);
                if (d == -1) {
                }
                d2 = zeVar2.y0.d(i3);
                if (d2 != -1) {
                }
                str2 = (String) xk2.r(xa6Var.n(), cb6.b);
                if (str2 != null) {
                }
                v2Var = v2Var2;
            }
        }
    }

    @Override // defpackage.os0
    public void N(int i, v2 v2Var, String str, Bundle bundle) {
        switch (this.Y) {
            case 0:
                ((ze) this.Z).j(i, v2Var, str, bundle);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.os0
    public final v2 R(int i) {
        switch (this.Y) {
            case 0:
                return y0(i);
            default:
                return new v2(AccessibilityNodeInfo.obtain(((mq0) this.Z).n(i).a));
        }
    }

    @Override // defpackage.os0
    public final v2 X(int i) {
        int i2;
        int i3 = this.Y;
        b2 b2Var = this.Z;
        switch (i3) {
            case 0:
                ze zeVar = (ze) b2Var;
                if (i != 1) {
                    if (i == 2) {
                        return R(zeVar.g0);
                    }
                    i.h(lb1.g(i, "Unknown focus type: "));
                    return null;
                }
                int i4 = zeVar.h0;
                if (i4 == Integer.MIN_VALUE) {
                    return null;
                }
                return R(i4);
            default:
                mq0 mq0Var = (mq0) b2Var;
                if (i == 2) {
                    i2 = mq0Var.g0;
                } else {
                    i2 = mq0Var.h0;
                }
                if (i2 == Integer.MIN_VALUE) {
                    return null;
                }
                return R(i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00da, code lost:
        if (r7 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x07f3, code lost:
        if (r1 != 16) goto L630;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v31, types: [h2, d2] */
    /* JADX WARN: Type inference failed for: r5v10, types: [f2, d2] */
    /* JADX WARN: Type inference failed for: r5v8, types: [g2, d2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x0241 -> B:159:0x0242). Please submit an issue!!! */
    @Override // defpackage.os0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d0(int i, int i2, Bundle bundle) {
        boolean z;
        xa6 xa6Var;
        boolean z2;
        int i3;
        boolean z3;
        h2 h2Var;
        int[] q;
        int i4;
        int i5;
        int i6;
        a47 E;
        Object obj;
        on2 on2Var;
        int i7;
        int i8;
        int i9;
        Object obj2;
        on2 on2Var2;
        Boolean bool;
        on2 on2Var3;
        Object obj3;
        on2 on2Var4;
        Object obj4;
        on2 on2Var5;
        Object obj5;
        on2 on2Var6;
        Object obj6;
        on2 on2Var7;
        Object obj7;
        on2 on2Var8;
        Object obj8;
        on2 on2Var9;
        String str;
        Object obj9;
        qn2 qn2Var;
        y1 y1Var;
        long j;
        long j2;
        eg4 d;
        long j3;
        float f;
        float f2;
        float f3;
        float f4;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        eo2 eo2Var;
        boolean z4;
        Object obj10;
        qn2 qn2Var2;
        Object obj11;
        on2 on2Var10;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        float f5;
        float f6;
        float f7;
        Float f8;
        Float f9;
        boolean z13;
        float intBitsToFloat;
        Object obj12;
        y1 y1Var2;
        on2 on2Var11;
        Object obj13;
        float intBitsToFloat2;
        Object obj14;
        y1 y1Var3;
        on2 on2Var12;
        Object obj15;
        qn2 qn2Var3;
        Object obj16;
        on2 on2Var13;
        Object obj17;
        on2 on2Var14;
        Object obj18;
        on2 on2Var15;
        Object obj19;
        on2 on2Var16;
        Object obj20;
        boolean z14;
        int i10;
        int i11 = this.Y;
        b2 b2Var = this.Z;
        boolean z15 = false;
        switch (i11) {
            case 0:
                ze zeVar = (ze) b2Var;
                AccessibilityManager accessibilityManager = zeVar.Z;
                Float valueOf = Float.valueOf((float) RecyclerView.B1);
                te teVar = zeVar.R;
                za6 za6Var = (za6) zeVar.s().b(i);
                if (za6Var == null || (xa6Var = za6Var.a) == null) {
                    z = false;
                } else {
                    sm3 sm3Var = xa6Var.c;
                    int i12 = xa6Var.f;
                    ta6 ta6Var = xa6Var.d;
                    ja4 ja4Var = ta6Var.A;
                    Object g = ja4Var.g(bb6.o);
                    if (g == null) {
                        g = null;
                    }
                    Boolean bool2 = Boolean.TRUE;
                    if (nb3.k(g, bool2)) {
                        if (Build.VERSION.SDK_INT >= 34) {
                            z14 = c2.j(accessibilityManager);
                            break;
                        } else {
                            z14 = true;
                            break;
                        }
                    }
                    if (i2 != 64) {
                        if (i2 != 128) {
                            if (i2 != 256 && i2 != 512) {
                                if (i2 != 16384) {
                                    if (i2 != 131072) {
                                        if (n16.i(xa6Var)) {
                                            if (i2 != 1) {
                                                if (i2 != 2) {
                                                    switch (i2) {
                                                        case 16:
                                                            Object g2 = ja4Var.g(sa6.b);
                                                            if (g2 == null) {
                                                                g2 = null;
                                                            }
                                                            y1 y1Var4 = (y1) g2;
                                                            if (y1Var4 != null && (on2Var3 = (on2) y1Var4.b) != null) {
                                                                bool = (Boolean) on2Var3.c();
                                                            } else {
                                                                bool = null;
                                                            }
                                                            ze.E(zeVar, i, 1, null, 12);
                                                            if (bool != null) {
                                                                return bool.booleanValue();
                                                            }
                                                            break;
                                                        case 32:
                                                            Object g3 = ja4Var.g(sa6.c);
                                                            if (g3 == null) {
                                                                obj3 = null;
                                                            } else {
                                                                obj3 = g3;
                                                            }
                                                            y1 y1Var5 = (y1) obj3;
                                                            if (y1Var5 != null && (on2Var4 = (on2) y1Var5.b) != null) {
                                                                return ((Boolean) on2Var4.c()).booleanValue();
                                                            }
                                                            break;
                                                        case 4096:
                                                        case 8192:
                                                            if (i2 == 4096) {
                                                                z5 = true;
                                                            } else {
                                                                z5 = false;
                                                            }
                                                            if (i2 == 8192) {
                                                                z6 = true;
                                                            } else {
                                                                z6 = false;
                                                            }
                                                            if (i2 == 16908345) {
                                                                z7 = true;
                                                            } else {
                                                                z7 = false;
                                                            }
                                                            if (i2 == 16908347) {
                                                                z8 = true;
                                                            } else {
                                                                z8 = false;
                                                            }
                                                            if (i2 == 16908344) {
                                                                z9 = true;
                                                            } else {
                                                                z9 = false;
                                                            }
                                                            if (i2 == 16908346) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = false;
                                                            }
                                                            if (!z7 && !z8 && !z5 && !z6) {
                                                                z11 = false;
                                                            } else {
                                                                z11 = true;
                                                            }
                                                            if (!z9 && !z10 && !z5 && !z6) {
                                                                z12 = false;
                                                            } else {
                                                                z12 = true;
                                                            }
                                                            if (z5 || z6) {
                                                                Object g4 = ja4Var.g(bb6.c);
                                                                if (g4 == null) {
                                                                    g4 = null;
                                                                }
                                                                x35 x35Var = (x35) g4;
                                                                Object g5 = ja4Var.g(sa6.i);
                                                                if (g5 == null) {
                                                                    g5 = null;
                                                                }
                                                                y1 y1Var6 = (y1) g5;
                                                                if (x35Var != null) {
                                                                    bs0 bs0Var = x35Var.b;
                                                                    if (y1Var6 != null) {
                                                                        float f10 = bs0Var.b;
                                                                        float f11 = bs0Var.a;
                                                                        if (f10 < f11) {
                                                                            f5 = f11;
                                                                        } else {
                                                                            f5 = f10;
                                                                        }
                                                                        if (f11 <= f10) {
                                                                            f10 = f11;
                                                                        }
                                                                        int i13 = x35Var.c;
                                                                        if (i13 > 0) {
                                                                            f6 = f5 - f10;
                                                                            f7 = i13 + 1;
                                                                        } else {
                                                                            f6 = f5 - f10;
                                                                            f7 = 20.0f;
                                                                        }
                                                                        float f12 = f6 / f7;
                                                                        if (z6) {
                                                                            f12 = -f12;
                                                                        }
                                                                        qn2 qn2Var4 = (qn2) y1Var6.b;
                                                                        if (qn2Var4 != null) {
                                                                            return ((Boolean) qn2Var4.g(Float.valueOf(x35Var.a + f12))).booleanValue();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            long c = ej2.j((y53) sm3Var.B0.d).c();
                                                            ArrayList arrayList = new ArrayList();
                                                            Object g6 = ja4Var.g(sa6.C);
                                                            if (g6 == null) {
                                                                g6 = null;
                                                            }
                                                            y1 y1Var7 = (y1) g6;
                                                            if (y1Var7 != null && (qn2Var3 = (qn2) y1Var7.b) != null && ((Boolean) qn2Var3.g(arrayList)).booleanValue()) {
                                                                f8 = (Float) arrayList.get(0);
                                                            } else {
                                                                f8 = null;
                                                            }
                                                            Object g7 = ja4Var.g(sa6.d);
                                                            if (g7 == null) {
                                                                g7 = null;
                                                            }
                                                            y1 y1Var8 = (y1) g7;
                                                            if (y1Var8 != null) {
                                                                ao2 ao2Var = y1Var8.b;
                                                                Object g8 = ja4Var.g(bb6.v);
                                                                if (g8 == null) {
                                                                    g8 = null;
                                                                }
                                                                e76 e76Var = (e76) g8;
                                                                if (e76Var != null && z11) {
                                                                    if (f8 != null) {
                                                                        intBitsToFloat2 = f8.floatValue();
                                                                        f9 = f8;
                                                                        z13 = z6;
                                                                    } else {
                                                                        f9 = f8;
                                                                        z13 = z6;
                                                                        intBitsToFloat2 = Float.intBitsToFloat((int) (c >> 32));
                                                                    }
                                                                    if (z7 || z13) {
                                                                        intBitsToFloat2 = -intBitsToFloat2;
                                                                    }
                                                                    if (sm3Var.v0 == kk3.Rtl && (z7 || z8)) {
                                                                        intBitsToFloat2 = -intBitsToFloat2;
                                                                    }
                                                                    if (ze.x(e76Var, intBitsToFloat2)) {
                                                                        fb6 fb6Var = sa6.z;
                                                                        if (!ja4Var.c(fb6Var) && !ja4Var.c(sa6.B)) {
                                                                            eo2 eo2Var2 = (eo2) ao2Var;
                                                                            if (eo2Var2 != null) {
                                                                                return ((Boolean) eo2Var2.o(Float.valueOf(intBitsToFloat2), valueOf)).booleanValue();
                                                                            }
                                                                        } else {
                                                                            if (intBitsToFloat2 > RecyclerView.B1) {
                                                                                Object g9 = ja4Var.g(sa6.B);
                                                                                if (g9 == null) {
                                                                                    obj15 = null;
                                                                                } else {
                                                                                    obj15 = g9;
                                                                                }
                                                                                y1Var3 = (y1) obj15;
                                                                            } else {
                                                                                Object g10 = ja4Var.g(fb6Var);
                                                                                if (g10 == null) {
                                                                                    obj14 = null;
                                                                                } else {
                                                                                    obj14 = g10;
                                                                                }
                                                                                y1Var3 = (y1) obj14;
                                                                            }
                                                                            if (y1Var3 != null && (on2Var12 = (on2) y1Var3.b) != null) {
                                                                                return ((Boolean) on2Var12.c()).booleanValue();
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    f9 = f8;
                                                                    z13 = z6;
                                                                }
                                                                Object g11 = ja4Var.g(bb6.w);
                                                                if (g11 == null) {
                                                                    g11 = null;
                                                                }
                                                                e76 e76Var2 = (e76) g11;
                                                                if (e76Var2 != null && z12) {
                                                                    if (f9 != null) {
                                                                        intBitsToFloat = f9.floatValue();
                                                                    } else {
                                                                        intBitsToFloat = Float.intBitsToFloat((int) (c & 4294967295L));
                                                                    }
                                                                    if (z9 || z13) {
                                                                        intBitsToFloat = -intBitsToFloat;
                                                                    }
                                                                    if (ze.x(e76Var2, intBitsToFloat)) {
                                                                        fb6 fb6Var2 = sa6.y;
                                                                        if (!ja4Var.c(fb6Var2) && !ja4Var.c(sa6.A)) {
                                                                            eo2 eo2Var3 = (eo2) ao2Var;
                                                                            if (eo2Var3 != null) {
                                                                                return ((Boolean) eo2Var3.o(valueOf, Float.valueOf(intBitsToFloat))).booleanValue();
                                                                            }
                                                                        } else {
                                                                            if (intBitsToFloat > RecyclerView.B1) {
                                                                                Object g12 = ja4Var.g(sa6.A);
                                                                                if (g12 == null) {
                                                                                    obj13 = null;
                                                                                } else {
                                                                                    obj13 = g12;
                                                                                }
                                                                                y1Var2 = (y1) obj13;
                                                                            } else {
                                                                                Object g13 = ja4Var.g(fb6Var2);
                                                                                if (g13 == null) {
                                                                                    obj12 = null;
                                                                                } else {
                                                                                    obj12 = g13;
                                                                                }
                                                                                y1Var2 = (y1) obj12;
                                                                            }
                                                                            if (y1Var2 != null && (on2Var11 = (on2) y1Var2.b) != null) {
                                                                                return ((Boolean) on2Var11.c()).booleanValue();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        case 32768:
                                                            Object g14 = ja4Var.g(sa6.s);
                                                            if (g14 == null) {
                                                                obj4 = null;
                                                            } else {
                                                                obj4 = g14;
                                                            }
                                                            y1 y1Var9 = (y1) obj4;
                                                            if (y1Var9 != null && (on2Var5 = (on2) y1Var9.b) != null) {
                                                                return ((Boolean) on2Var5.c()).booleanValue();
                                                            }
                                                            break;
                                                        case 65536:
                                                            Object g15 = ja4Var.g(sa6.r);
                                                            if (g15 == null) {
                                                                obj5 = null;
                                                            } else {
                                                                obj5 = g15;
                                                            }
                                                            y1 y1Var10 = (y1) obj5;
                                                            if (y1Var10 != null && (on2Var6 = (on2) y1Var10.b) != null) {
                                                                return ((Boolean) on2Var6.c()).booleanValue();
                                                            }
                                                            break;
                                                        case 262144:
                                                            Object g16 = ja4Var.g(sa6.t);
                                                            if (g16 == null) {
                                                                obj6 = null;
                                                            } else {
                                                                obj6 = g16;
                                                            }
                                                            y1 y1Var11 = (y1) obj6;
                                                            if (y1Var11 != null && (on2Var7 = (on2) y1Var11.b) != null) {
                                                                return ((Boolean) on2Var7.c()).booleanValue();
                                                            }
                                                            break;
                                                        case 524288:
                                                            Object g17 = ja4Var.g(sa6.u);
                                                            if (g17 == null) {
                                                                obj7 = null;
                                                            } else {
                                                                obj7 = g17;
                                                            }
                                                            y1 y1Var12 = (y1) obj7;
                                                            if (y1Var12 != null && (on2Var8 = (on2) y1Var12.b) != null) {
                                                                return ((Boolean) on2Var8.c()).booleanValue();
                                                            }
                                                            break;
                                                        case 1048576:
                                                            Object g18 = ja4Var.g(sa6.v);
                                                            if (g18 == null) {
                                                                obj8 = null;
                                                            } else {
                                                                obj8 = g18;
                                                            }
                                                            y1 y1Var13 = (y1) obj8;
                                                            if (y1Var13 != null && (on2Var9 = (on2) y1Var13.b) != null) {
                                                                return ((Boolean) on2Var9.c()).booleanValue();
                                                            }
                                                            break;
                                                        case 2097152:
                                                            if (bundle != null) {
                                                                str = bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                                                            } else {
                                                                str = null;
                                                            }
                                                            Object g19 = ja4Var.g(sa6.k);
                                                            if (g19 == null) {
                                                                obj9 = null;
                                                            } else {
                                                                obj9 = g19;
                                                            }
                                                            y1 y1Var14 = (y1) obj9;
                                                            if (y1Var14 != null && (qn2Var = (qn2) y1Var14.b) != null) {
                                                                if (str == null) {
                                                                    str = "";
                                                                }
                                                                return ((Boolean) qn2Var.g(new fp(str))).booleanValue();
                                                            }
                                                            break;
                                                        case 16908342:
                                                            xa6 l = xa6Var.l();
                                                            if (l != null) {
                                                                Object g20 = l.d.A.g(sa6.d);
                                                                if (g20 == null) {
                                                                    g20 = null;
                                                                }
                                                                y1Var = (y1) g20;
                                                                while (y1Var == null && l != null) {
                                                                    l = l.l();
                                                                    if (l == null) {
                                                                        Object g21 = l.d.A.g(sa6.d);
                                                                        if (g21 == null) {
                                                                            g21 = null;
                                                                        }
                                                                        y1Var = (y1) g21;
                                                                    }
                                                                }
                                                                if (l != null) {
                                                                    of5 g22 = xa6Var.g();
                                                                    return teVar.requestRectangleOnScreen(new Rect((int) Math.floor(g22.a), (int) Math.floor(g22.b), u24.E((float) Math.ceil(g22.c)), u24.E((float) Math.ceil(g22.d))));
                                                                }
                                                                long j4 = 0;
                                                                long j5 = 0;
                                                                boolean z16 = false;
                                                                while (l != null) {
                                                                    sm3 sm3Var2 = l.c;
                                                                    ja4 ja4Var2 = l.d.A;
                                                                    Object g23 = ja4Var2.g(sa6.d);
                                                                    if (g23 == null) {
                                                                        g23 = null;
                                                                    }
                                                                    y1 y1Var15 = (y1) g23;
                                                                    if (y1Var15 != null) {
                                                                        of5 j6 = ej2.j((y53) sm3Var2.B0.d);
                                                                        jk3 D = ((y53) sm3Var2.B0.d).D();
                                                                        if (D != null) {
                                                                            j = ((eg4) D).P(j4);
                                                                        } else {
                                                                            j = j4;
                                                                        }
                                                                        of5 i14 = j6.i(j);
                                                                        eg4 d2 = xa6Var.d();
                                                                        if (d2 != null) {
                                                                            if (!d2.Y0().j0) {
                                                                                d2 = null;
                                                                            }
                                                                            if (d2 != null) {
                                                                                j2 = d2.P(j4);
                                                                                long f13 = jk4.f(j2, j5);
                                                                                d = xa6Var.d();
                                                                                if (d == null) {
                                                                                    j3 = d.L;
                                                                                } else {
                                                                                    j3 = j4;
                                                                                }
                                                                                of5 b = kj2.b(f13, qo2.S(j3));
                                                                                f = b.a - i14.a;
                                                                                f2 = b.c - i14.c;
                                                                                if (Math.signum(f) != Math.signum(f2)) {
                                                                                    if (Math.abs(f) >= Math.abs(f2)) {
                                                                                        f = f2;
                                                                                    }
                                                                                } else {
                                                                                    f = 0.0f;
                                                                                }
                                                                                f3 = b.b - i14.b;
                                                                                f4 = b.d - i14.d;
                                                                                if (Math.signum(f3) != Math.signum(f4)) {
                                                                                    if (Math.abs(f3) >= Math.abs(f4)) {
                                                                                        f3 = f4;
                                                                                    }
                                                                                } else {
                                                                                    f3 = 0.0f;
                                                                                }
                                                                                floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                                                                                if (!jk4.c(floatToRawIntBits, j4)) {
                                                                                    floatToRawIntBits2 = floatToRawIntBits;
                                                                                } else {
                                                                                    float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                                                                                    float intBitsToFloat4 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                                                                                    Object g24 = ja4Var2.g(bb6.v);
                                                                                    if (g24 == null) {
                                                                                        g24 = null;
                                                                                    }
                                                                                    e76 e76Var3 = (e76) g24;
                                                                                    if (sm3Var.v0 == kk3.Rtl) {
                                                                                        intBitsToFloat3 = -intBitsToFloat3;
                                                                                    }
                                                                                    Object g25 = ja4Var2.g(bb6.w);
                                                                                    if (g25 == null) {
                                                                                        g25 = null;
                                                                                    }
                                                                                    e76 e76Var4 = (e76) g25;
                                                                                    floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
                                                                                }
                                                                                eo2Var = (eo2) y1Var15.b;
                                                                                if ((eo2Var == null && ((Boolean) eo2Var.o(Float.valueOf(Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L))))).booleanValue()) || z16) {
                                                                                    z4 = true;
                                                                                } else {
                                                                                    z4 = false;
                                                                                }
                                                                                j5 = jk4.e(j5, floatToRawIntBits);
                                                                                z16 = z4;
                                                                            }
                                                                        }
                                                                        j2 = j4;
                                                                        long f132 = jk4.f(j2, j5);
                                                                        d = xa6Var.d();
                                                                        if (d == null) {
                                                                        }
                                                                        of5 b2 = kj2.b(f132, qo2.S(j3));
                                                                        f = b2.a - i14.a;
                                                                        f2 = b2.c - i14.c;
                                                                        if (Math.signum(f) != Math.signum(f2)) {
                                                                        }
                                                                        f3 = b2.b - i14.b;
                                                                        f4 = b2.d - i14.d;
                                                                        if (Math.signum(f3) != Math.signum(f4)) {
                                                                        }
                                                                        floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                                                                        if (!jk4.c(floatToRawIntBits, j4)) {
                                                                        }
                                                                        eo2Var = (eo2) y1Var15.b;
                                                                        if (eo2Var == null) {
                                                                        }
                                                                        z4 = false;
                                                                        j5 = jk4.e(j5, floatToRawIntBits);
                                                                        z16 = z4;
                                                                    }
                                                                    l = l.l();
                                                                    j4 = 0;
                                                                }
                                                                return z16;
                                                            }
                                                            y1Var = null;
                                                            while (y1Var == null) {
                                                                l = l.l();
                                                                if (l == null) {
                                                                }
                                                            }
                                                            if (l != null) {
                                                            }
                                                        case 16908349:
                                                            if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                                                Object g26 = ja4Var.g(sa6.i);
                                                                if (g26 == null) {
                                                                    obj10 = null;
                                                                } else {
                                                                    obj10 = g26;
                                                                }
                                                                y1 y1Var16 = (y1) obj10;
                                                                if (y1Var16 != null && (qn2Var2 = (qn2) y1Var16.b) != null) {
                                                                    return ((Boolean) qn2Var2.g(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                                                }
                                                            }
                                                            break;
                                                        case 16908372:
                                                            Object g27 = ja4Var.g(sa6.p);
                                                            if (g27 == null) {
                                                                obj11 = null;
                                                            } else {
                                                                obj11 = g27;
                                                            }
                                                            y1 y1Var17 = (y1) obj11;
                                                            if (y1Var17 != null && (on2Var10 = (on2) y1Var17.b) != null) {
                                                                return ((Boolean) on2Var10.c()).booleanValue();
                                                            }
                                                            break;
                                                        default:
                                                            switch (i2) {
                                                                case 16908344:
                                                                case 16908345:
                                                                case 16908346:
                                                                case 16908347:
                                                                    break;
                                                                default:
                                                                    switch (i2) {
                                                                        case 16908358:
                                                                            Object g28 = ja4Var.g(sa6.y);
                                                                            if (g28 == null) {
                                                                                obj16 = null;
                                                                            } else {
                                                                                obj16 = g28;
                                                                            }
                                                                            y1 y1Var18 = (y1) obj16;
                                                                            if (y1Var18 != null && (on2Var13 = (on2) y1Var18.b) != null) {
                                                                                return ((Boolean) on2Var13.c()).booleanValue();
                                                                            }
                                                                            break;
                                                                        case 16908359:
                                                                            Object g29 = ja4Var.g(sa6.A);
                                                                            if (g29 == null) {
                                                                                obj17 = null;
                                                                            } else {
                                                                                obj17 = g29;
                                                                            }
                                                                            y1 y1Var19 = (y1) obj17;
                                                                            if (y1Var19 != null && (on2Var14 = (on2) y1Var19.b) != null) {
                                                                                return ((Boolean) on2Var14.c()).booleanValue();
                                                                            }
                                                                            break;
                                                                        case 16908360:
                                                                            Object g30 = ja4Var.g(sa6.z);
                                                                            if (g30 == null) {
                                                                                obj18 = null;
                                                                            } else {
                                                                                obj18 = g30;
                                                                            }
                                                                            y1 y1Var20 = (y1) obj18;
                                                                            if (y1Var20 != null && (on2Var15 = (on2) y1Var20.b) != null) {
                                                                                return ((Boolean) on2Var15.c()).booleanValue();
                                                                            }
                                                                            break;
                                                                        case 16908361:
                                                                            Object g31 = ja4Var.g(sa6.B);
                                                                            if (g31 == null) {
                                                                                obj19 = null;
                                                                            } else {
                                                                                obj19 = g31;
                                                                            }
                                                                            y1 y1Var21 = (y1) obj19;
                                                                            if (y1Var21 != null && (on2Var16 = (on2) y1Var21.b) != null) {
                                                                                return ((Boolean) on2Var16.c()).booleanValue();
                                                                            }
                                                                            break;
                                                                        default:
                                                                            un6 un6Var = (un6) zeVar.n0.c(i);
                                                                            if (un6Var != null && ((CharSequence) un6Var.c(i2)) != null) {
                                                                                Object g32 = ja4Var.g(sa6.x);
                                                                                if (g32 == null) {
                                                                                    obj20 = null;
                                                                                } else {
                                                                                    obj20 = g32;
                                                                                }
                                                                                List list = (List) obj20;
                                                                                if (list != null && list.size() > 0) {
                                                                                    list.get(0).getClass();
                                                                                    u34.a();
                                                                                    return false;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                                } else {
                                                    Object g33 = ja4Var.g(bb6.l);
                                                    if (g33 == null) {
                                                        g33 = null;
                                                    }
                                                    if (nb3.k(g33, bool2)) {
                                                        ((eh2) teVar.getFocusOwner()).b(8, false, true);
                                                        return true;
                                                    }
                                                }
                                            } else {
                                                if (teVar.isInTouchMode()) {
                                                    teVar.requestFocusFromTouch();
                                                }
                                                Object g34 = ja4Var.g(sa6.w);
                                                if (g34 == null) {
                                                    obj2 = null;
                                                } else {
                                                    obj2 = g34;
                                                }
                                                y1 y1Var22 = (y1) obj2;
                                                if (y1Var22 != null && (on2Var2 = (on2) y1Var22.b) != null) {
                                                    return ((Boolean) on2Var2.c()).booleanValue();
                                                }
                                            }
                                        }
                                    } else {
                                        if (bundle != null) {
                                            i7 = -1;
                                            i8 = bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                                        } else {
                                            i7 = -1;
                                            i8 = -1;
                                        }
                                        if (bundle != null) {
                                            i9 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", i7);
                                        } else {
                                            i9 = -1;
                                        }
                                        boolean K = zeVar.K(xa6Var, i8, i9, false);
                                        if (K) {
                                            ze.E(zeVar, zeVar.A(i12), 0, null, 12);
                                            return K;
                                        }
                                        return K;
                                    }
                                } else {
                                    Object g35 = ja4Var.g(sa6.q);
                                    if (g35 == null) {
                                        obj = null;
                                    } else {
                                        obj = g35;
                                    }
                                    y1 y1Var23 = (y1) obj;
                                    if (y1Var23 != null && (on2Var = (on2) y1Var23.b) != null) {
                                        return ((Boolean) on2Var.c()).booleanValue();
                                    }
                                }
                            } else if (bundle != null) {
                                int i15 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                                boolean z17 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                                if (i2 == 256) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                Integer num = zeVar.q0;
                                if (num == null || i12 != num.intValue()) {
                                    zeVar.p0 = -1;
                                    zeVar.q0 = Integer.valueOf(i12);
                                }
                                String t = ze.t(xa6Var);
                                if (t != null && t.length() != 0) {
                                    String t2 = ze.t(xa6Var);
                                    if (t2 != null && t2.length() != 0) {
                                        if (i15 != 1) {
                                            if (i15 != 2) {
                                                if (i15 != 4) {
                                                    if (i15 != 8) {
                                                        break;
                                                    } else {
                                                        if (h2.c == null) {
                                                            h2.c = new d2(0);
                                                        }
                                                        h2 h2Var2 = h2.c;
                                                        h2Var2.getClass();
                                                        h2Var2.a = t2;
                                                        h2Var = h2Var2;
                                                    }
                                                }
                                                if (ja4Var.c(sa6.a) && (E = ln2.E(ta6Var)) != null) {
                                                    if (i15 == 4) {
                                                        if (f2.d == null) {
                                                            f2.d = new d2(0);
                                                        }
                                                        f2 f2Var = f2.d;
                                                        f2Var.getClass();
                                                        f2Var.a = t2;
                                                        f2Var.c = E;
                                                        h2Var = f2Var;
                                                    } else {
                                                        if (g2.e == null) {
                                                            ?? d2Var = new d2(0);
                                                            new Rect();
                                                            g2.e = d2Var;
                                                        }
                                                        g2 g2Var = g2.e;
                                                        g2Var.getClass();
                                                        g2Var.a = t2;
                                                        g2Var.c = E;
                                                        g2Var.d = xa6Var;
                                                        h2Var = g2Var;
                                                    }
                                                }
                                            } else {
                                                Locale locale = teVar.getContext().getResources().getConfiguration().locale;
                                                if (e2.f == null) {
                                                    e2 e2Var = new e2(1);
                                                    e2Var.d = BreakIterator.getWordInstance(locale);
                                                    e2.f = e2Var;
                                                }
                                                e2 e2Var2 = e2.f;
                                                e2Var2.getClass();
                                                e2Var2.s(t2);
                                                h2Var = e2Var2;
                                            }
                                        } else {
                                            Locale locale2 = teVar.getContext().getResources().getConfiguration().locale;
                                            if (e2.e == null) {
                                                e2 e2Var3 = new e2(0);
                                                e2Var3.d = BreakIterator.getCharacterInstance(locale2);
                                                e2.e = e2Var3;
                                            }
                                            e2 e2Var4 = e2.e;
                                            e2Var4.getClass();
                                            e2Var4.s(t2);
                                            h2Var = e2Var4;
                                        }
                                        if (h2Var != null) {
                                            int q2 = zeVar.q(xa6Var);
                                            if (q2 == -1) {
                                                if (z3) {
                                                    q2 = 0;
                                                } else {
                                                    q2 = t.length();
                                                }
                                            }
                                            if (z3) {
                                                q = h2Var.f(q2);
                                            } else {
                                                q = h2Var.q(q2);
                                            }
                                            if (q != null) {
                                                int i16 = q[0];
                                                int i17 = q[1];
                                                if (z17 && !ja4Var.c(bb6.a) && ja4Var.c(bb6.G)) {
                                                    i4 = zeVar.r(xa6Var);
                                                    if (i4 == -1) {
                                                        if (z3) {
                                                            i4 = i16;
                                                        } else {
                                                            i4 = i17;
                                                        }
                                                    }
                                                    if (z3) {
                                                        i5 = i17;
                                                    } else {
                                                        i5 = i16;
                                                    }
                                                } else {
                                                    if (z3) {
                                                        i4 = i17;
                                                    } else {
                                                        i4 = i16;
                                                    }
                                                    i5 = i4;
                                                }
                                                if (z3) {
                                                    i6 = 256;
                                                } else {
                                                    i6 = 512;
                                                }
                                                zeVar.u0 = new ve(xa6Var, i6, i15, i16, i17, SystemClock.uptimeMillis());
                                                z2 = true;
                                                zeVar.K(xa6Var, i4, i5, true);
                                            }
                                        }
                                    }
                                    h2Var = null;
                                    if (h2Var != null) {
                                    }
                                }
                            }
                            z = false;
                        } else {
                            z2 = true;
                            z = false;
                            if (zeVar.g0 == i) {
                                zeVar.g0 = Integer.MIN_VALUE;
                                zeVar.i0 = null;
                                teVar.invalidate();
                                ze.E(zeVar, i, 65536, null, 12);
                            }
                        }
                        return z2;
                    }
                    z2 = true;
                    z = false;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = zeVar.g0) != i) {
                        if (i3 != Integer.MIN_VALUE) {
                            ze.E(zeVar, i3, 65536, null, 12);
                        }
                        zeVar.g0 = i;
                        teVar.invalidate();
                        ze.E(zeVar, i, 32768, null, 12);
                        return z2;
                    }
                }
                return z;
            default:
                mq0 mq0Var = (mq0) b2Var;
                Chip chip = mq0Var.e0;
                if (i != -1) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 64) {
                                if (i2 != 128) {
                                    Chip chip2 = mq0Var.j0;
                                    if (i2 == 16) {
                                        if (i == 0) {
                                            return chip2.performClick();
                                        }
                                        if (i == 1) {
                                            chip2.playSoundEffect(0);
                                            View.OnClickListener onClickListener = chip2.g0;
                                            if (onClickListener != null) {
                                                onClickListener.onClick(chip2);
                                                z15 = true;
                                            }
                                            if (chip2.r0) {
                                                chip2.q0.r(1, 1);
                                            }
                                        }
                                    }
                                } else if (mq0Var.g0 == i) {
                                    mq0Var.g0 = Integer.MIN_VALUE;
                                    chip.invalidate();
                                    mq0Var.r(i, 65536);
                                    return true;
                                }
                            } else {
                                AccessibilityManager accessibilityManager2 = mq0Var.d0;
                                if (accessibilityManager2.isEnabled() && accessibilityManager2.isTouchExplorationEnabled() && (i10 = mq0Var.g0) != i) {
                                    if (i10 != Integer.MIN_VALUE) {
                                        mq0Var.g0 = Integer.MIN_VALUE;
                                        chip.invalidate();
                                        mq0Var.r(i10, 65536);
                                    }
                                    mq0Var.g0 = i;
                                    chip.invalidate();
                                    mq0Var.r(i, 32768);
                                    return true;
                                }
                            }
                            return z15;
                        }
                        return mq0Var.j(i);
                    }
                    return mq0Var.q(i);
                }
                WeakHashMap weakHashMap = ao7.a;
                return chip.performAccessibilityAction(i2, bundle);
        }
    }
}

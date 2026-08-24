package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.ImageWriter;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.util.Linkify;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.Surface;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.stormds.emulator.R;
import java.io.File;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hf  reason: default package */
/* loaded from: classes.dex */
public abstract class hf {
    public static final i80 a = new i80();
    public static final zv0 b = new zv0(1106336085, false, new fn0(18));
    public static final zv0 c = new zv0(-77131700, false, new kw0(23));
    public static final zv0 d = new zv0(-762601867, false, new kw0(24));
    public static final zv0 e;
    public static final zv0 f;
    public static final zv0 g;
    public static final zv0 h;
    public static final zv0 i;
    public static final zv0 j;
    public static final zv0 k;
    public static final Class[] l;
    public static final bk m;
    public static final bk n;
    public static final StackTraceElement[] o;
    public static final StackTraceElement[] p;
    public static e33 q;
    public static final /* synthetic */ int r = 0;
    public static e33 s;
    public static final /* synthetic */ int t = 0;

    static {
        new zv0(866784315, false, new fn0(29));
        e = new zv0(1714259275, false, new lw0(0, (byte) 0));
        f = new zv0(-1836397928, false, new iw0(20));
        g = new zv0(-1406416085, false, new lw0(1, (byte) 0));
        h = new zv0(566090785, false, new lw0(2, (byte) 0));
        i = new zv0(-1624772335, false, new lw0(3, (byte) 0));
        j = new zv0(939725476, false, new iw0(21));
        k = new zv0(-1341284559, false, new lw0(4, (byte) 0));
        l = new Class[]{Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
        m = new bk(2);
        n = new bk(6);
        o = new StackTraceElement[0];
        p = new StackTraceElement[0];
    }

    public static kw3 A(List list) {
        list.getClass();
        kw3 kw3Var = (kw3) list;
        kw3Var.g();
        kw3Var.L = true;
        if (kw3Var.B > 0) {
            return kw3Var;
        }
        return kw3.R;
    }

    public static final boolean B(Object obj) {
        if (obj instanceof gm6) {
            gm6 gm6Var = (gm6) obj;
            if (gm6Var.d() == vs0.j0 || gm6Var.d() == xd5.s0 || gm6Var.d() == vs0.s0) {
                Object value = gm6Var.getValue();
                if (value != null) {
                    return B(value);
                }
                return true;
            }
        } else if (!(obj instanceof ao2) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (l[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void C(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            i.h(lb1.j("startIndex: ", i2, i3, " > endIndex: "));
            return;
        }
        u34.q(i61.q(i2, i3, "startIndex: ", ", endIndex: ", ", size: "), i4);
    }

    public static final void D(long j2, long j3, long j4) {
        if ((j3 | j4) >= 0 && j3 <= j2 && j2 - j3 >= j4) {
            return;
        }
        StringBuilder s2 = xg6.s(j2, "size=", " offset=");
        s2.append(j3);
        s2.append(" byteCount=");
        s2.append(j4);
        throw new ArrayIndexOutOfBoundsException(s2.toString());
    }

    public static void E(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            i.h(lb1.j("fromIndex: ", i2, i3, " > toIndex: "));
            return;
        }
        u34.q(i61.q(i2, i3, "fromIndex: ", ", toIndex: ", ", size: "), i4);
    }

    public static final void F(lk6 lk6Var, ArrayList arrayList, int i2) {
        boolean l2 = lk6Var.l(i2);
        int[] iArr = lk6Var.b;
        if (l2) {
            arrayList.add(lk6Var.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            F(lk6Var, arrayList, i4);
        }
    }

    public static final boolean G(String str, String... strArr) {
        for (String str2 : strArr) {
            if (qs6.j0(str, str2, false)) {
                return true;
            }
        }
        return false;
    }

    public static di H(Surface surface, int i2, fr6 fr6Var, Handler handler) {
        ImageWriter newInstance;
        handler.getClass();
        int i3 = Build.VERSION.SDK_INT;
        int i4 = fr6Var.a;
        if (i3 >= 29) {
            newInstance = od.d(i4, surface);
            newInstance.getClass();
        } else {
            Log.w("CXCP", "Ignoring format (" + ((Object) fr6.b(i4)) + ") for " + ((Object) ("Input-" + i2)) + ". Android " + i3 + " does not support creating ImageWriters with formats. This may lead to unexpected behaviors.");
            newInstance = ImageWriter.newInstance(surface, 1);
            newInstance.getClass();
        }
        di diVar = new di(newInstance, i2);
        newInstance.setOnImageReleasedListener(diVar, handler);
        return diVar;
    }

    public static kw3 I() {
        return new kw3(10);
    }

    public static final Object K(fy0 fy0Var, l55 l55Var) {
        if (!((z64) fy0Var).A.j0) {
            p53.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        xv4 xv4Var = (xv4) nc1.f0(fy0Var).x0;
        xv4Var.getClass();
        return q60.U(xv4Var, l55Var);
    }

    public static void L(ArrayList arrayList) {
        boolean z;
        boolean z2;
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            bv0 bv0Var = (bv0) obj;
            p81 p81Var = new p81(bv0Var);
            for (Class cls : bv0Var.a) {
                if (bv0Var.c == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                q81 q81Var = new q81(cls, !z2);
                if (!hashMap.containsKey(q81Var)) {
                    hashMap.put(q81Var, new HashSet());
                }
                Set set = (Set) hashMap.get(q81Var);
                if (!set.isEmpty() && z2) {
                    u34.C(cls, ".", "Multiple components provide ");
                    return;
                }
                set.add(p81Var);
            }
        }
        for (Set<p81> set2 : hashMap.values()) {
            for (p81 p81Var2 : set2) {
                for (wh1 wh1Var : p81Var2.a.b) {
                    if (wh1Var.c == 0) {
                        Class cls2 = wh1Var.a;
                        if (wh1Var.b == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Set<p81> set3 = (Set) hashMap.get(new q81(cls2, z));
                        if (set3 != null) {
                            for (p81 p81Var3 : set3) {
                                p81Var2.b.add(p81Var3);
                                p81Var3.c.add(p81Var2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            p81 p81Var4 = (p81) it.next();
            if (p81Var4.c.isEmpty()) {
                hashSet2.add(p81Var4);
            }
        }
        while (!hashSet2.isEmpty()) {
            p81 p81Var5 = (p81) hashSet2.iterator().next();
            hashSet2.remove(p81Var5);
            i2++;
            Iterator it2 = p81Var5.b.iterator();
            while (it2.hasNext()) {
                p81 p81Var6 = (p81) it2.next();
                p81Var6.c.remove(p81Var5);
                if (p81Var6.c.isEmpty()) {
                    hashSet2.add(p81Var6);
                }
            }
        }
        if (i2 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            p81 p81Var7 = (p81) it3.next();
            if (!p81Var7.c.isEmpty() && !p81Var7.b.isEmpty()) {
                arrayList2.add(p81Var7.a);
            }
        }
        throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static final float M(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        float f2 = (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + f2;
    }

    public static final void N(jt3 jt3Var) {
        t37 t37Var = jt3Var.e;
        if (t37Var != null) {
            jt3Var.v.g(c37.a((c37) jt3Var.d.A, null, 0L, 3));
            o37 o37Var = t37Var.a;
            AtomicReference atomicReference = o37Var.b;
            while (true) {
                if (atomicReference.compareAndSet(t37Var, null)) {
                    o37Var.a.c();
                    break;
                } else if (atomicReference.get() != t37Var) {
                    break;
                }
            }
        }
        jt3Var.e = null;
    }

    public static final int O(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int p2 = nb3.p(((xb3) list.get(i4)).b, i2);
            if (p2 < 0) {
                i3 = i4 + 1;
            } else if (p2 > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public static final String P(long j2) {
        StringBuilder sb;
        jd1 jd1Var = oq1.B;
        if (oq1.d(j2, 0L)) {
            return "";
        }
        long k2 = oq1.k(j2, uq1.HOURS);
        long k3 = oq1.k(j2, uq1.MINUTES) % 60;
        if (k2 > 0) {
            sb = new StringBuilder();
            sb.append(k2);
            sb.append("h ");
        } else {
            sb = new StringBuilder();
        }
        sb.append(k3);
        sb.append("m");
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, bw3] */
    public static void Q(ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter) {
        boolean z;
        Matcher matcher = pattern.matcher(spannableStringBuilder);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if ((matchFilter == null || matchFilter.acceptMatch(spannableStringBuilder, start, end)) && group != null) {
                ?? obj = new Object();
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        String str = strArr[i2];
                        if (group.regionMatches(true, 0, str, 0, str.length())) {
                            z = true;
                            if (!group.regionMatches(false, 0, str, 0, str.length())) {
                                group = str.concat(group.substring(str.length()));
                            }
                        } else {
                            i2++;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z && strArr.length > 0) {
                    group = i61.n(new StringBuilder(), strArr[0], group);
                }
                obj.b = group;
                obj.c = start;
                obj.d = end;
                arrayList.add(obj);
            }
        }
    }

    public static qx2 R(mv0 mv0Var, yo7 yo7Var) {
        yc1 a2 = ((ob1) ((cg1) q60.B(cg1.class, mv0Var))).a();
        yo7Var.getClass();
        return new qx2((io3) a2.A, yo7Var, (bt) a2.B);
    }

    public static Drawable S(Context context, int i2) {
        return ol5.b().c(context, i2);
    }

    public static qx2 T(o oVar, yo7 yo7Var) {
        yc1 a2 = ((qb1) ((dg1) q60.B(dg1.class, oVar))).b.a();
        yo7Var.getClass();
        return new qx2((io3) a2.A, yo7Var, (bt) a2.B);
    }

    public static int U(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final String V(zl1 zl1Var) {
        String i2 = zl1Var.i();
        if (i2 != null) {
            return qs6.R0('.', i2, i2);
        }
        return null;
    }

    public static final int W(String str) {
        int s0;
        char c2 = File.separatorChar;
        int s02 = qs6.s0(c2, 0, 4, str);
        if (s02 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c2 || (s0 = qs6.s0(c2, 2, 4, str)) < 0) {
                return 1;
            }
            int s03 = qs6.s0(c2, s0 + 1, 4, str);
            if (s03 >= 0) {
                return s03 + 1;
            }
            return str.length();
        } else if (s02 > 0 && str.charAt(s02 - 1) == ':') {
            return s02 + 1;
        } else {
            if (s02 != -1 || !qs6.m0(str, ':')) {
                return 0;
            }
            return str.length();
        }
    }

    public static final void a(pq5 pq5Var, String str, String str2, boolean z, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        boolean z4;
        gn gnVar;
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1644469026);
        if (xq2Var.h(pq5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (xq2Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (xq2Var.f(str2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i10 = i9 | i5;
        if (xq2Var.g(z)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        if (xq2Var.h(on2Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i12 = i11 | i7;
        if ((i12 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i12 & 1, z2)) {
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = nb3.b(RecyclerView.B1);
                xq2Var.l0(P);
            }
            gn gnVar2 = (gn) P;
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = np2.Y(Boolean.FALSE);
                xq2Var.l0(P2);
            }
            qa4 qa4Var = (qa4) P2;
            Object P3 = xq2Var.P();
            if (P3 == vs0Var) {
                P3 = new x5(qa4Var, null, 1);
                xq2Var.l0(P3);
            }
            mb3.i(xq2Var, (eo2) P3, jg7.a);
            Boolean valueOf = Boolean.valueOf(z);
            Boolean bool = (Boolean) qa4Var.getValue();
            bool.booleanValue();
            if ((i12 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h2 = z3 | xq2Var.h(gnVar2);
            if ((57344 & i12) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = h2 | z4;
            Object P4 = xq2Var.P();
            if (!z5 && P4 != vs0Var) {
                gnVar = gnVar2;
            } else {
                gnVar = gnVar2;
                v50 v50Var = new v50(z, gnVar, on2Var, qa4Var, null, 0);
                xq2Var.l0(v50Var);
                P4 = v50Var;
            }
            mb3.j(valueOf, bool, (eo2) P4, xq2Var);
            a74 j2 = jw2.j(dj6.c, 1.0f - ((Number) gnVar.d()).floatValue());
            e34 d2 = h70.d(d90.L, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, j2);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            g04.k(pq5Var, str, str2, xq2Var, i12 & 1022);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new si(pq5Var, str, str2, z, on2Var, i2, 1);
        }
    }

    public static final void b(a74 a74Var, y16 y16Var, long j2, float f2, zv0 zv0Var, px0 px0Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            y16Var = ((ye6) ((xq2) px0Var).j(ze6.a)).b;
        }
        y16 y16Var2 = y16Var;
        if ((i3 & 4) != 0) {
            j2 = ((ut0) ((xq2) px0Var).j(vt0.a)).j();
        }
        long j3 = j2;
        long b2 = vt0.b(j3, px0Var);
        if ((i3 & 32) != 0) {
            f2 = 1.0f;
        }
        ej2.c(a74Var, y16Var2, j3, b2, f2, zv0Var, px0Var, i2 & 4194302, 0);
    }

    public static List b0(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x04a1, code lost:
        if (r8 > ((r0 != null ? r0.longValue() : 0) + 5000)) goto L371;
     */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0698 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x075a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0824 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0865 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x088a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x08ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x099f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final c37 c37Var, qn2 qn2Var, a74 a74Var, final s47 s47Var, final wq7 wq7Var, final qn2 qn2Var2, final r94 r94Var, cn6 cn6Var, boolean z, final int i2, final int i3, l33 l33Var, vh3 vh3Var, final boolean z2, final zv0 zv0Var, px0 px0Var, int i4, int i5) {
        int i6;
        int i7;
        xq2 xq2Var;
        int i8;
        nh2 nh2Var;
        i27 i27Var;
        long j2;
        jt3 jt3Var;
        boolean z3;
        p97 p97Var;
        vs0 vs0Var;
        s47 s47Var2;
        int i9;
        fp fpVar;
        qh1 qh1Var;
        ki2 ki2Var;
        qh1 qh1Var2;
        mk4 mk4Var;
        ah2 ah2Var;
        boolean z4;
        boolean z5;
        c37 a2;
        Object P;
        xq2 xq2Var2;
        final fg7 fg7Var;
        Object P2;
        final w61 w61Var;
        Object P3;
        final s70 s70Var;
        Object P4;
        final p27 p27Var;
        final mk4 mk4Var2;
        nh2 nh2Var2;
        zx4 zx4Var;
        boolean z6;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean h2;
        qn2 qn2Var3;
        p97 p97Var2;
        final o37 o37Var;
        int i14;
        xq2 xq2Var3;
        ah2 ah2Var2;
        int i15;
        nh2 nh2Var3;
        i27 i27Var2;
        r94 r94Var2;
        final l33 l33Var2;
        vs0 vs0Var2;
        int i16;
        final jt3 jt3Var2;
        mk4 mk4Var3;
        s70 s70Var2;
        boolean z7;
        w61 w61Var2;
        c37 c37Var2;
        p27 p27Var2;
        jt3 jt3Var3;
        boolean z8;
        boolean z9;
        eo2 jiVar;
        nh2 nh2Var4;
        w61 w61Var3;
        a74 a74Var2;
        x64 x64Var;
        final jt3 jt3Var4;
        qa4 qa4Var;
        o37 o37Var2;
        mk4 mk4Var4;
        p27 p27Var3;
        boolean h3;
        Object P5;
        final mk4 mk4Var5;
        final p27 p27Var4;
        ot7 ot7Var;
        final p27 p27Var5;
        final jt3 jt3Var5;
        a74 a74Var3;
        boolean h4;
        Object P6;
        boolean h5;
        Object P7;
        l33 l33Var3;
        int i17;
        boolean z10;
        boolean booleanValue;
        boolean g2;
        Object P8;
        a74 a74Var4;
        f80 cn6Var2;
        boolean h6;
        Object P9;
        int i18;
        final boolean z11;
        String str;
        xq2 xq2Var4 = (xq2) px0Var;
        xq2Var4.d0(31062401);
        if ((i4 & 6) == 0) {
            i6 = i4 | (xq2Var4.f(c37Var) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= xq2Var4.h(qn2Var) ? 32 : 16;
        }
        if ((i4 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i6 |= xq2Var4.f(a74Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= xq2Var4.f(s47Var) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= xq2Var4.f(wq7Var) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= xq2Var4.h(qn2Var2) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= xq2Var4.f(r94Var) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= xq2Var4.f(cn6Var) ? 8388608 : Compress.MAXWINSIZE;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= xq2Var4.g(z) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= xq2Var4.d(i2) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (xq2Var4.d(i3) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= xq2Var4.f(l33Var) ? 32 : 16;
        }
        if ((i5 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i7 |= xq2Var4.f(vh3Var) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= xq2Var4.g(z2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= xq2Var4.g(false) ? 16384 : 8192;
        }
        if ((i5 & 196608) == 0) {
            i7 |= xq2Var4.h(zv0Var) ? 131072 : 65536;
        }
        int i19 = i7 | 1572864;
        if (xq2Var4.S(i6 & 1, ((i6 & 306783379) == 306783378 && (599187 & i19) == 599186) ? false : true)) {
            xq2Var4.X();
            if ((i4 & 1) != 0 && !xq2Var4.B()) {
                xq2Var4.V();
            }
            xq2Var4.q();
            Object P10 = xq2Var4.P();
            vs0 vs0Var3 = ox0.a;
            if (P10 == vs0Var3) {
                P10 = new nh2();
                xq2Var4.l0(P10);
            }
            nh2 nh2Var5 = (nh2) P10;
            Object P11 = xq2Var4.P();
            if (P11 == vs0Var3) {
                gt3 gt3Var = ht3.a;
                P11 = new Object();
                xq2Var4.l0(P11);
            }
            ki kiVar = (ki) P11;
            Object P12 = xq2Var4.P();
            if (P12 == vs0Var3) {
                P12 = new o37(kiVar);
                xq2Var4.l0(P12);
            }
            o37 o37Var3 = (o37) P12;
            qh1 qh1Var3 = (qh1) xq2Var4.j(ky0.h);
            ki2 ki2Var2 = (ki2) xq2Var4.j(ky0.k);
            long j3 = ((m47) xq2Var4.j(n47.a)).b;
            ah2 ah2Var3 = (ah2) xq2Var4.j(ky0.i);
            final ot7 ot7Var2 = (ot7) xq2Var4.j(ky0.u);
            xm6 xm6Var = (xm6) xq2Var4.j(ky0.q);
            lo4 lo4Var = (i2 == 1 && !z && l33Var.a) ? lo4.Horizontal : lo4.Vertical;
            xq2Var4.b0(-213744626);
            Object[] objArr = {lo4Var};
            ap3 ap3Var = i27.g;
            boolean d2 = xq2Var4.d(lo4Var.ordinal());
            Object P13 = xq2Var4.P();
            if (d2 || P13 == vs0Var3) {
                i8 = i19;
                P13 = new a5(lo4Var, 19);
                xq2Var4.l0(P13);
            } else {
                i8 = i19;
            }
            i27 i27Var3 = (i27) qo2.J(objArr, ap3Var, (on2) P13, xq2Var4, 0);
            xq2Var4.p(false);
            if (((lo4) i27Var3.f.getValue()) != lo4Var) {
                if (lo4Var == lo4.Vertical) {
                    str = "only single-line, non-wrap text fields can scroll horizontally";
                } else {
                    str = "single-line, non-wrap text fields can only scroll horizontally";
                }
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(str));
            }
            int i20 = i6 & 14;
            boolean z12 = ((i6 & 57344) == 16384) | (i20 == 4);
            p97 P14 = xq2Var4.P();
            if (z12 || P14 == vs0Var3) {
                p97 a3 = jk7.a(wq7Var, c37Var.a);
                mk4 mk4Var6 = a3.b;
                k47 k47Var = c37Var.c;
                if (k47Var != null) {
                    nh2Var = nh2Var5;
                    i27Var = i27Var3;
                    long j4 = k47Var.a;
                    int i21 = k47.c;
                    int s2 = mk4Var6.s((int) (j4 >> 32));
                    j2 = j3;
                    int s3 = mk4Var6.s((int) (j4 & 4294967295L));
                    int min = Math.min(s2, s3);
                    int max = Math.max(s2, s3);
                    dp dpVar = new dp(a3.a);
                    dpVar.L.add(new cp(new nn6(0L, 0L, (oj2) null, (ij2) null, (jj2) null, (li2) null, (String) null, 0L, (x20) null, (f37) null, (gy3) null, 0L, b17.c, (ge6) null, 61439), min, max, 8));
                    P14 = new p97(dpVar.f(), mk4Var6);
                } else {
                    nh2Var = nh2Var5;
                    i27Var = i27Var3;
                    j2 = j3;
                    P14 = a3;
                }
                xq2Var4.l0(P14);
            } else {
                nh2Var = nh2Var5;
                i27Var = i27Var3;
                j2 = j3;
            }
            p97 p97Var3 = (p97) P14;
            fp fpVar2 = p97Var3.a;
            mk4 mk4Var7 = p97Var3.b;
            cf5 A = xq2Var4.A();
            if (A != null) {
                A.b |= 1;
                boolean f2 = xq2Var4.f(xm6Var);
                Object P15 = xq2Var4.P();
                if (f2 || P15 == vs0Var3) {
                    z3 = z;
                    p97Var = p97Var3;
                    vs0Var = vs0Var3;
                    s47Var2 = s47Var;
                    i9 = i20;
                    fpVar = fpVar2;
                    qh1Var = qh1Var3;
                    ki2Var = ki2Var2;
                    jt3Var = new jt3(new d17(fpVar2, s47Var2, z3, qh1Var3, ki2Var2, 0), A, xm6Var);
                    xq2Var4.l0(jt3Var);
                } else {
                    z3 = z;
                    p97Var = p97Var3;
                    vs0Var = vs0Var3;
                    jt3Var = P15;
                    qh1Var = qh1Var3;
                    ki2Var = ki2Var2;
                    s47Var2 = s47Var;
                    i9 = i20;
                    fpVar = fpVar2;
                }
                jt3 jt3Var6 = jt3Var;
                fp fpVar3 = c37Var.a;
                long j5 = c37Var.b;
                jt3Var6.u = qn2Var;
                jt3Var6.z = j2;
                uh3 uh3Var = jt3Var6.r;
                uh3Var.b = vh3Var;
                uh3Var.c = ah2Var3;
                jt3Var6.j = fpVar3;
                d17 d17Var = jt3Var6.a;
                if (nb3.k(d17Var.a, fpVar) && nb3.k(d17Var.b, s47Var2) && d17Var.e == z3 && d17Var.f == 1 && d17Var.c == Integer.MAX_VALUE && d17Var.d == 1 && nb3.k(d17Var.g, qh1Var) && nb3.k(d17Var.i, yt1.A) && d17Var.h == ki2Var) {
                    qh1Var2 = qh1Var;
                } else {
                    qh1Var2 = qh1Var;
                    d17Var = new d17(fpVar, s47Var2, z3, qh1Var2, ki2Var, 0);
                }
                if (jt3Var6.a != d17Var) {
                    jt3Var6.p = true;
                }
                jt3Var6.a = d17Var;
                yc1 yc1Var = jt3Var6.d;
                t37 t37Var = jt3Var6.e;
                yc1Var.getClass();
                k47 k47Var2 = c37Var.c;
                boolean k2 = nb3.k(k47Var2, ((gs1) yc1Var.B).c());
                String str2 = ((c37) yc1Var.A).a.B;
                fp fpVar4 = c37Var.a;
                if (!nb3.k(str2, fpVar4.B)) {
                    yc1Var.B = new gs1(fpVar4, j5);
                    mk4Var = mk4Var7;
                    ah2Var = ah2Var3;
                    z4 = true;
                } else {
                    mk4Var = mk4Var7;
                    ah2Var = ah2Var3;
                    if (k47.b(((c37) yc1Var.A).b, j5)) {
                        z4 = false;
                    } else {
                        ((gs1) yc1Var.B).f(k47.f(j5), k47.e(j5));
                        z4 = false;
                        z5 = true;
                        if (k47Var2 != null) {
                            gs1 gs1Var = (gs1) yc1Var.B;
                            gs1Var.R = -1;
                            gs1Var.X = -1;
                        } else {
                            long j6 = k47Var2.a;
                            if (!k47.c(j6)) {
                                ((gs1) yc1Var.B).e(k47.f(j6), k47.e(j6));
                            }
                        }
                        if (z4 && (z5 || k2)) {
                            a2 = c37Var;
                        } else {
                            gs1 gs1Var2 = (gs1) yc1Var.B;
                            gs1Var2.R = -1;
                            gs1Var2.X = -1;
                            a2 = c37.a(c37Var, null, 0L, 3);
                        }
                        c37 c37Var3 = (c37) yc1Var.A;
                        yc1Var.A = a2;
                        if (t37Var != null) {
                            t37Var.a(c37Var3, a2);
                        }
                        P = xq2Var4.P();
                        if (P != vs0Var) {
                            P = new Object();
                            xq2Var2 = xq2Var4;
                            xq2Var2.l0(P);
                        } else {
                            xq2Var2 = xq2Var4;
                        }
                        fg7Var = (fg7) P;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!fg7Var.e) {
                            Long l2 = fg7Var.d;
                        }
                        fg7Var.d = Long.valueOf(currentTimeMillis);
                        fg7Var.a(c37Var);
                        P2 = xq2Var2.P();
                        if (P2 == vs0Var) {
                            P2 = mb3.w(xq2Var2);
                            xq2Var2.l0(P2);
                        }
                        w61Var = (w61) P2;
                        P3 = xq2Var2.P();
                        if (P3 == vs0Var) {
                            P3 = new s70();
                            xq2Var2.l0(P3);
                        }
                        s70Var = (s70) P3;
                        P4 = xq2Var2.P();
                        if (P4 == vs0Var) {
                            P4 = new p27(fg7Var);
                            xq2Var2.l0(P4);
                        }
                        p27Var = (p27) P4;
                        mk4Var2 = mk4Var;
                        p27Var.b = mk4Var2;
                        p27Var.f = wq7Var;
                        p27Var.c = jt3Var6.v;
                        p27Var.d = jt3Var6;
                        p27Var.e.setValue(c37Var);
                        p27Var.w = new k47(j5);
                        p27Var.h = (tr0) xq2Var2.j(ky0.f);
                        p27Var.i = w61Var;
                        u47 u47Var = (u47) xq2Var2.j(ky0.r);
                        p27Var.k = (tv2) xq2Var2.j(ky0.l);
                        nh2 nh2Var6 = nh2Var;
                        p27Var.l = nh2Var6;
                        p27Var.m.setValue(true);
                        p27Var.n.setValue(Boolean.valueOf(z2));
                        xq2Var2.b0(1966756105);
                        ca6 ca6Var = ca6.EditableText;
                        gy3 gy3Var = s47Var2.a.k;
                        nq6 nq6Var = by4.a;
                        xq2Var2.b0(430530635);
                        if (Build.VERSION.SDK_INT >= 28) {
                            z6 = false;
                            xq2Var2.p(false);
                            nh2Var2 = nh2Var6;
                            zx4Var = null;
                        } else {
                            Context context = (Context) xq2Var2.j(kf.b);
                            l61 l61Var = (l61) xq2Var2.j(by4.a);
                            boolean f3 = xq2Var2.f(l61Var) | xq2Var2.f(context) | xq2Var2.f(gy3Var);
                            nh2Var2 = nh2Var6;
                            Object P16 = xq2Var2.P();
                            if (f3 || P16 == vs0Var) {
                                by4.b.getClass();
                                P16 = new zx4(l61Var, context, ca6Var, gy3Var);
                                xq2Var2.l0(P16);
                            }
                            zx4Var = (zx4) P16;
                            z6 = false;
                            xq2Var2.p(false);
                        }
                        p27Var.j = zx4Var;
                        xq2Var2.p(z6);
                        jt3Var6.b();
                        i10 = i8;
                        i11 = i10 & 7168;
                        i12 = i9;
                        i13 = (i10 & 112) ^ 48;
                        h2 = ((i13 <= 32 && xq2Var2.f(l33Var)) || (i10 & 48) == 32) | xq2Var2.h(jt3Var6) | (i11 != 2048) | ((i10 & 57344) != 16384) | xq2Var2.h(o37Var3) | (i12 != 4) | xq2Var2.h(mk4Var2) | xq2Var2.h(w61Var) | xq2Var2.h(s70Var) | xq2Var2.h(p27Var);
                        Object P17 = xq2Var2.P();
                        if (!h2 || P17 == vs0Var) {
                            p97Var2 = p97Var;
                            o37Var = o37Var3;
                            i14 = i12;
                            xq2Var3 = xq2Var2;
                            ah2Var2 = ah2Var;
                            i15 = i10;
                            nh2Var3 = nh2Var2;
                            i27Var2 = i27Var;
                            r94Var2 = r94Var;
                            l33Var2 = l33Var;
                            vs0Var2 = vs0Var;
                            i16 = i11;
                            jt3Var2 = jt3Var6;
                            qn2Var3 = new qn2() { // from class: q51
                                @Override // defpackage.qn2
                                public final Object g(Object obj) {
                                    b47 d3;
                                    sh2 sh2Var = (sh2) obj;
                                    jt3 jt3Var7 = jt3.this;
                                    boolean b2 = jt3Var7.b();
                                    boolean isFocused = sh2Var.isFocused();
                                    jg7 jg7Var = jg7.a;
                                    if (b2 != isFocused) {
                                        jt3Var7.f.setValue(Boolean.valueOf(sh2Var.isFocused()));
                                        boolean b3 = jt3Var7.b();
                                        c37 c37Var4 = c37Var;
                                        mk4 mk4Var8 = mk4Var2;
                                        if (b3 && z2) {
                                            hf.o0(o37Var, jt3Var7, c37Var4, l33Var2, mk4Var8);
                                        } else {
                                            hf.N(jt3Var7);
                                        }
                                        if (sh2Var.isFocused() && (d3 = jt3Var7.d()) != null) {
                                            hv.L(w61Var, null, null, new ji(s70Var, c37Var4, jt3Var7, d3, mk4Var8, null, 5), 3);
                                        }
                                        if (!sh2Var.isFocused()) {
                                            p27Var.g(null);
                                        }
                                    }
                                    return jg7Var;
                                }
                            };
                            mk4Var3 = mk4Var2;
                            s70Var2 = s70Var;
                            z7 = z2;
                            w61Var2 = w61Var;
                            c37Var2 = c37Var;
                            p27Var2 = p27Var;
                            xq2Var3.l0(qn2Var3);
                        } else {
                            p97Var2 = p97Var;
                            i14 = i12;
                            xq2Var3 = xq2Var2;
                            w61Var2 = w61Var;
                            s70Var2 = s70Var;
                            mk4Var3 = mk4Var2;
                            ah2Var2 = ah2Var;
                            i15 = i10;
                            nh2Var3 = nh2Var2;
                            i27Var2 = i27Var;
                            c37Var2 = c37Var;
                            r94Var2 = r94Var;
                            z7 = z2;
                            vs0Var2 = vs0Var;
                            i16 = i11;
                            jt3Var2 = jt3Var6;
                            p27Var2 = p27Var;
                            qn2Var3 = P17;
                            o37Var = o37Var3;
                            l33Var2 = l33Var;
                        }
                        x64 x64Var2 = x64.a;
                        a74 d0 = nw7.d0(n16.G(ak7.S(x64Var2, nh2Var3), qn2Var3), z7, r94Var2);
                        qa4 b0 = np2.b0(Boolean.valueOf(z7), xq2Var3);
                        boolean f4 = xq2Var3.f(b0) | xq2Var3.h(jt3Var2) | xq2Var3.h(o37Var) | xq2Var3.h(p27Var2);
                        if (i13 > 32 || !xq2Var3.f(l33Var2)) {
                            jt3Var3 = jt3Var2;
                            if ((i15 & 48) != 32) {
                                z8 = false;
                                z9 = f4 | z8;
                                Object P18 = xq2Var3.P();
                                if (!z9 || P18 == vs0Var2) {
                                    nh2Var4 = nh2Var3;
                                    w61Var3 = w61Var2;
                                    a74Var2 = d0;
                                    x64Var = x64Var2;
                                    jt3Var4 = jt3Var3;
                                    jiVar = new ji(jt3Var4, b0, o37Var, p27Var2, l33Var2, null, 4);
                                    qa4Var = b0;
                                    o37Var2 = o37Var;
                                    xq2Var3.l0(jiVar);
                                } else {
                                    jiVar = P18;
                                    w61Var3 = w61Var2;
                                    qa4Var = b0;
                                    nh2Var4 = nh2Var3;
                                    a74Var2 = d0;
                                    jt3Var4 = jt3Var3;
                                    o37Var2 = o37Var;
                                    x64Var = x64Var2;
                                }
                                mb3.i(xq2Var3, jiVar, jg7.a);
                                a74 a4 = jw6.a(x64Var, 8675309, new rg(new w51(jt3Var4, 4), 3));
                                mk4Var4 = mk4Var3;
                                xb4 xb4Var = new xb4(jt3Var4, nh2Var4, z7, p27Var2, mk4Var4);
                                p27Var3 = p27Var2;
                                if (z2) {
                                    a4 = l.p(a4, new l4(17, xb4Var, r94Var2));
                                }
                                a74 d3 = a4.d(new iw6(p27Var3.A, p27Var3.z, null, new rg(p27Var3, 6), 4));
                                ty4.a.getClass();
                                a74 S = kj2.S(d3, jw2.y);
                                final a74 v = q60.v(x64Var, new t00(jt3Var4, c37Var2, mk4Var4, 5));
                                boolean h7 = xq2Var3.h(jt3Var4) | (i16 == 2048) | xq2Var3.f(ot7Var2) | xq2Var3.h(p27Var3);
                                int i22 = i14;
                                h3 = h7 | (i22 == 4) | xq2Var3.h(mk4Var4);
                                P5 = xq2Var3.P();
                                if (!h3 || P5 == vs0Var2) {
                                    mk4Var5 = mk4Var4;
                                    final c37 c37Var4 = c37Var2;
                                    p27Var4 = p27Var3;
                                    qn2 qn2Var4 = new qn2() { // from class: r51
                                        @Override // defpackage.qn2
                                        public final Object g(Object obj) {
                                            t37 t37Var2;
                                            jk3 jk3Var;
                                            jk3 jk3Var2;
                                            jt3 jt3Var7 = jt3.this;
                                            vs4 vs4Var = jt3Var7.o;
                                            jk3 jk3Var3 = (jk3) obj;
                                            jt3Var7.h = jk3Var3;
                                            b47 d4 = jt3Var7.d();
                                            if (d4 != null) {
                                                d4.b = jk3Var3;
                                            }
                                            if (z2) {
                                                hv2 a5 = jt3Var7.a();
                                                hv2 hv2Var = hv2.Selection;
                                                p27 p27Var6 = p27Var4;
                                                c37 c37Var5 = c37Var4;
                                                if (a5 == hv2Var) {
                                                    if (((Boolean) jt3Var7.l.getValue()).booleanValue() && ((Boolean) ((zr3) ot7Var2).c.getValue()).booleanValue()) {
                                                        p27Var6.r();
                                                    } else {
                                                        p27Var6.o();
                                                    }
                                                    jt3Var7.m.setValue(Boolean.valueOf(kn2.O(p27Var6, true)));
                                                    jt3Var7.n.setValue(Boolean.valueOf(kn2.O(p27Var6, false)));
                                                    vs4Var.setValue(Boolean.valueOf(k47.c(c37Var5.b)));
                                                } else if (jt3Var7.a() == hv2.Cursor) {
                                                    vs4Var.setValue(Boolean.valueOf(kn2.O(p27Var6, true)));
                                                }
                                                mk4 mk4Var8 = mk4Var5;
                                                hf.e0(jt3Var7, c37Var5, mk4Var8);
                                                b47 d5 = jt3Var7.d();
                                                if (d5 != null && (t37Var2 = jt3Var7.e) != null && jt3Var7.b() && (jk3Var = d5.b) != null && jk3Var.t() && (jk3Var2 = d5.c) != null) {
                                                    a47 a47Var = d5.a;
                                                    d80 d80Var = new d80(jk3Var, 2);
                                                    of5 f0 = uj2.f0(jk3Var);
                                                    of5 O = jk3Var.O(jk3Var2, false);
                                                    if (nb3.k((t37) t37Var2.a.b.get(), t37Var2)) {
                                                        t37Var2.b.d(c37Var5, mk4Var8, a47Var, d80Var, f0, O);
                                                    }
                                                }
                                            }
                                            return jg7.a;
                                        }
                                    };
                                    ot7Var = ot7Var2;
                                    xq2Var3.l0(qn2Var4);
                                    P5 = qn2Var4;
                                } else {
                                    ot7Var = ot7Var2;
                                    mk4Var5 = mk4Var4;
                                    p27Var4 = p27Var3;
                                }
                                final a74 z13 = u24.z(x64Var, (qn2) P5);
                                jt3 jt3Var7 = jt3Var4;
                                o37 o37Var4 = o37Var2;
                                p27Var5 = p27Var4;
                                b61 b61Var = new b61(p97Var2, c37Var, jt3Var7, z2, wq7Var instanceof jt4, mk4Var5, p27Var5, l33Var, nh2Var4);
                                jt3Var5 = jt3Var7;
                                if (!z2 && ((Boolean) ((zr3) ot7Var).c.getValue()).booleanValue() && k47.c(((k47) jt3Var5.A.getValue()).a) && k47.c(((k47) jt3Var5.B.getValue()).a)) {
                                    dq3 dq3Var = new dq3(cn6Var, jt3Var5, c37Var, mk4Var5, 7);
                                    jt3Var5 = jt3Var5;
                                    a74Var3 = l.p(x64Var, dq3Var);
                                } else {
                                    a74Var3 = x64Var;
                                }
                                h4 = xq2Var3.h(p27Var5);
                                P6 = xq2Var3.P();
                                if (!h4 || P6 == vs0Var2) {
                                    P6 = new s51(p27Var5, 0);
                                    xq2Var3.l0(P6);
                                }
                                mb3.d(p27Var5, (qn2) P6, xq2Var3);
                                h5 = xq2Var3.h(jt3Var5) | xq2Var3.h(o37Var4) | (i22 == 4) | ((i13 <= 32 && xq2Var3.f(l33Var)) || (i15 & 48) == 32);
                                P7 = xq2Var3.P();
                                if (!h5 || P7 == vs0Var2) {
                                    cn cnVar = new cn(jt3Var5, o37Var4, c37Var, l33Var, 3);
                                    l33Var3 = l33Var;
                                    xq2Var3.l0(cnVar);
                                    P7 = cnVar;
                                } else {
                                    l33Var3 = l33Var;
                                }
                                mb3.d(l33Var3, (qn2) P7, xq2Var3);
                                final w51 w51Var = jt3Var5.v;
                                final boolean z14 = i2 == 1;
                                final int i23 = l33Var3.e;
                                a74 p2 = l.p(x64Var, new fo2() { // from class: w17
                                    @Override // defpackage.fo2
                                    public final Object e(Object obj, Object obj2, Object obj3) {
                                        a74 a74Var5 = (a74) obj;
                                        ((Integer) obj3).getClass();
                                        xq2 xq2Var5 = (xq2) ((px0) obj2);
                                        xq2Var5.b0(851809892);
                                        Object P19 = xq2Var5.P();
                                        vs0 vs0Var4 = ox0.a;
                                        if (P19 == vs0Var4) {
                                            P19 = new Object();
                                            xq2Var5.l0(P19);
                                        }
                                        j47 j47Var = (j47) P19;
                                        Object P20 = xq2Var5.P();
                                        if (P20 == vs0Var4) {
                                            P20 = new Object();
                                            xq2Var5.l0(P20);
                                        }
                                        v17 v17Var = new v17(jt3.this, p27Var5, c37Var, r4, z14, j47Var, mk4Var5, fg7Var, (fc1) P20, w51Var, i23);
                                        boolean h8 = xq2Var5.h(v17Var);
                                        Object P21 = xq2Var5.P();
                                        if (h8 || P21 == vs0Var4) {
                                            xj5 xj5Var = new xj5(1, v17Var, v17.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 5);
                                            xq2Var5.l0(xj5Var);
                                            P21 = xj5Var;
                                        }
                                        a74 A2 = u24.A(x64.a, (qn2) ((po2) P21));
                                        xq2Var5.p(false);
                                        return A2;
                                    }
                                });
                                i17 = l33Var3.d;
                                if (i17 == 7 && i17 != 8) {
                                    z10 = true;
                                    booleanValue = ((Boolean) qa4Var.getValue()).booleanValue();
                                    g2 = xq2Var3.g(z10) | xq2Var3.h(kiVar);
                                    P8 = xq2Var3.P();
                                    if (!g2 || P8 == vs0Var2) {
                                        P8 = new sz0(z10, kiVar, 2);
                                        xq2Var3.l0(P8);
                                    }
                                    on2 on2Var = (on2) P8;
                                    if (booleanValue || !et6.a) {
                                        a74Var4 = x64Var;
                                    } else {
                                        a74Var4 = (z10 ? new ft6(l.h) : x64Var).d(new ct6(on2Var));
                                    }
                                    f80 f80Var = (f80) xq2Var3.j(kz.a);
                                    long j7 = ((kt0) xq2Var3.j(kz.b)).a;
                                    final mk4 mk4Var8 = mk4Var5;
                                    cn6Var2 = !kt0.d(j7, hv.b(1308617531)) ? new cn6(j7) : f80Var;
                                    h6 = xq2Var3.h(jt3Var5) | xq2Var3.f(cn6Var2);
                                    P9 = xq2Var3.P();
                                    if (!h6 || P9 == vs0Var2) {
                                        i18 = 16;
                                        P9 = new y(16, jt3Var5, cn6Var2);
                                        xq2Var3.l0(P9);
                                    } else {
                                        i18 = 16;
                                    }
                                    final i27 i27Var4 = i27Var2;
                                    a74 d4 = u24.z(u24.B(u24.B(a74Var.d(q60.y(x64Var, (qn2) P9)).d(new dt3(kiVar, jt3Var5, p27Var5)).d(a74Var4).d(a74Var2), new r5(26, ah2Var2, jt3Var5)), new r5(8, jt3Var5, p27Var5)).d(p2).d(new nx0(new fo2() { // from class: e27
                                        @Override // defpackage.fo2
                                        public final Object e(Object obj, Object obj2, Object obj3) {
                                            boolean z15;
                                            boolean z16;
                                            i27 i27Var5 = i27.this;
                                            vs4 vs4Var = i27Var5.f;
                                            a74 a74Var5 = (a74) obj;
                                            ((Integer) obj3).getClass();
                                            xq2 xq2Var5 = (xq2) ((px0) obj2);
                                            xq2Var5.b0(-2137546592);
                                            boolean z17 = true;
                                            if (xq2Var5.j(ky0.n) == kk3.Rtl) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            if (((lo4) vs4Var.getValue()) != lo4.Vertical && z15) {
                                                z16 = false;
                                            } else {
                                                z16 = true;
                                            }
                                            boolean f5 = xq2Var5.f(i27Var5);
                                            Object P19 = xq2Var5.P();
                                            vs0 vs0Var4 = ox0.a;
                                            if (f5 || P19 == vs0Var4) {
                                                P19 = new ro5(i27Var5, 19);
                                                xq2Var5.l0(P19);
                                            }
                                            qa4 b02 = np2.b0((qn2) P19, xq2Var5);
                                            Object P20 = xq2Var5.P();
                                            if (P20 == vs0Var4) {
                                                bf1 bf1Var = new bf1(new j4(b02, 24));
                                                xq2Var5.l0(bf1Var);
                                                P20 = bf1Var;
                                            }
                                            f86 f86Var = (f86) P20;
                                            boolean f6 = xq2Var5.f(f86Var) | xq2Var5.f(i27Var5);
                                            Object P21 = xq2Var5.P();
                                            if (f6 || P21 == vs0Var4) {
                                                P21 = new h27(f86Var, i27Var5);
                                                xq2Var5.l0(P21);
                                            }
                                            h27 h27Var = (h27) P21;
                                            lo4 lo4Var2 = (lo4) vs4Var.getValue();
                                            if (!z2 || i27Var5.b.h() == RecyclerView.B1) {
                                                z17 = false;
                                            }
                                            a74 b2 = y76.b(h27Var, lo4Var2, z17, z16, r94Var);
                                            xq2Var5.p(false);
                                            return b2;
                                        }
                                    })).d(S).d(b61Var), new w51(jt3Var5, 0)).d(new ba(new sa5(12, p27Var5, w61Var3)));
                                    z11 = !z2 && jt3Var5.b() && ((Boolean) jt3Var5.q.getValue()).booleanValue() && ((Boolean) ((zr3) ot7Var).c.getValue()).booleanValue();
                                    if (z11 && d04.a()) {
                                        x64Var = l.p(x64Var, new ov4(p27Var5, i18));
                                    }
                                    xq2 xq2Var5 = xq2Var3;
                                    final x64 x64Var3 = x64Var;
                                    final qh1 qh1Var4 = qh1Var2;
                                    final a74 a74Var5 = a74Var3;
                                    final s70 s70Var3 = s70Var2;
                                    final jt3 jt3Var8 = jt3Var5;
                                    eo2 eo2Var = new eo2() { // from class: p51
                                        @Override // defpackage.eo2
                                        public final Object o(Object obj, Object obj2) {
                                            boolean z15;
                                            px0 px0Var2 = (px0) obj;
                                            int intValue = ((Integer) obj2).intValue();
                                            if ((intValue & 3) != 2) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            xq2 xq2Var6 = (xq2) px0Var2;
                                            if (xq2Var6.S(intValue & 1, z15)) {
                                                final jt3 jt3Var9 = jt3Var8;
                                                final s47 s47Var3 = s47Var;
                                                final int i24 = i3;
                                                final int i25 = i2;
                                                final i27 i27Var5 = i27Var4;
                                                final c37 c37Var5 = c37Var;
                                                final wq7 wq7Var2 = wq7Var;
                                                final a74 a74Var6 = a74Var5;
                                                final a74 a74Var7 = v;
                                                final a74 a74Var8 = z13;
                                                final a74 a74Var9 = x64Var3;
                                                final s70 s70Var4 = s70Var3;
                                                final p27 p27Var6 = p27Var5;
                                                final boolean z16 = z11;
                                                final qn2 qn2Var5 = qn2Var2;
                                                final mk4 mk4Var9 = mk4Var8;
                                                final qh1 qh1Var5 = qh1Var4;
                                                zv0.this.e(n16.I(-44346382, new eo2() { // from class: t51
                                                    @Override // defpackage.eo2
                                                    public final Object o(Object obj3, Object obj4) {
                                                        boolean z17;
                                                        a74 jm7Var;
                                                        px0 px0Var3 = (px0) obj3;
                                                        int intValue2 = ((Integer) obj4).intValue();
                                                        if ((intValue2 & 3) != 2) {
                                                            z17 = true;
                                                        } else {
                                                            z17 = false;
                                                        }
                                                        xq2 xq2Var7 = (xq2) px0Var3;
                                                        if (xq2Var7.S(intValue2 & 1, z17)) {
                                                            jt3 jt3Var10 = jt3.this;
                                                            a74 f5 = dj6.f(x64.a, ((om1) jt3Var10.g.getValue()).A, RecyclerView.B1, 2);
                                                            int i26 = i24;
                                                            int i27 = i25;
                                                            qo2.W(i26, i27);
                                                            s47 s47Var4 = s47Var3;
                                                            if (i26 != 1 || i27 != Integer.MAX_VALUE) {
                                                                f5 = f5.d(new cx2(s47Var4, i26, i27));
                                                            }
                                                            boolean h8 = xq2Var7.h(jt3Var10);
                                                            Object P19 = xq2Var7.P();
                                                            if (h8 || P19 == ox0.a) {
                                                                P19 = new a5(jt3Var10, 20);
                                                                xq2Var7.l0(P19);
                                                            }
                                                            on2 on2Var2 = (on2) P19;
                                                            i27 i27Var6 = i27Var5;
                                                            lo4 lo4Var2 = (lo4) i27Var6.f.getValue();
                                                            c37 c37Var6 = c37Var5;
                                                            long j8 = c37Var6.b;
                                                            int i28 = k47.c;
                                                            int i29 = (int) (j8 >> 32);
                                                            long j9 = i27Var6.e;
                                                            if (i29 == ((int) (j9 >> 32)) && (i29 = (int) (j8 & 4294967295L)) == ((int) (j9 & 4294967295L))) {
                                                                i29 = k47.f(j8);
                                                            }
                                                            i27Var6.e = c37Var6.b;
                                                            p97 a5 = jk7.a(wq7Var2, c37Var6.a);
                                                            int i30 = f27.a[lo4Var2.ordinal()];
                                                            if (i30 != 1) {
                                                                if (i30 == 2) {
                                                                    jm7Var = new iy2(i27Var6, i29, a5, on2Var2);
                                                                } else {
                                                                    i.d();
                                                                    return null;
                                                                }
                                                            } else {
                                                                jm7Var = new jm7(i27Var6, i29, a5, on2Var2);
                                                            }
                                                            mp2.d(hv.j(u24.h(f5).d(jm7Var).d(a74Var6).d(a74Var7).d(new x27(s47Var4)).d(a74Var8).d(a74Var9), s70Var4), n16.I(1412697320, new u51(p27Var6, jt3Var10, z16, qn2Var5, c37Var6, mk4Var9, qh1Var5, i27), xq2Var7), xq2Var7, 48);
                                                        } else {
                                                            xq2Var7.V();
                                                        }
                                                        return jg7.a;
                                                    }
                                                }, xq2Var6), xq2Var6, 6);
                                            } else {
                                                xq2Var6.V();
                                            }
                                            return jg7.a;
                                        }
                                    };
                                    xq2Var = xq2Var5;
                                    d(d4, p27Var5, n16.I(-814563849, eo2Var, xq2Var), xq2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                                }
                                z10 = false;
                                booleanValue = ((Boolean) qa4Var.getValue()).booleanValue();
                                g2 = xq2Var3.g(z10) | xq2Var3.h(kiVar);
                                P8 = xq2Var3.P();
                                if (!g2) {
                                }
                                P8 = new sz0(z10, kiVar, 2);
                                xq2Var3.l0(P8);
                                on2 on2Var2 = (on2) P8;
                                if (booleanValue) {
                                }
                                a74Var4 = x64Var;
                                f80 f80Var2 = (f80) xq2Var3.j(kz.a);
                                long j72 = ((kt0) xq2Var3.j(kz.b)).a;
                                final mk4 mk4Var82 = mk4Var5;
                                if (!kt0.d(j72, hv.b(1308617531))) {
                                }
                                h6 = xq2Var3.h(jt3Var5) | xq2Var3.f(cn6Var2);
                                P9 = xq2Var3.P();
                                if (h6) {
                                }
                                i18 = 16;
                                P9 = new y(16, jt3Var5, cn6Var2);
                                xq2Var3.l0(P9);
                                final i27 i27Var42 = i27Var2;
                                a74 d42 = u24.z(u24.B(u24.B(a74Var.d(q60.y(x64Var, (qn2) P9)).d(new dt3(kiVar, jt3Var5, p27Var5)).d(a74Var4).d(a74Var2), new r5(26, ah2Var2, jt3Var5)), new r5(8, jt3Var5, p27Var5)).d(p2).d(new nx0(new fo2() { // from class: e27
                                    @Override // defpackage.fo2
                                    public final Object e(Object obj, Object obj2, Object obj3) {
                                        boolean z15;
                                        boolean z16;
                                        i27 i27Var5 = i27.this;
                                        vs4 vs4Var = i27Var5.f;
                                        a74 a74Var52 = (a74) obj;
                                        ((Integer) obj3).getClass();
                                        xq2 xq2Var52 = (xq2) ((px0) obj2);
                                        xq2Var52.b0(-2137546592);
                                        boolean z17 = true;
                                        if (xq2Var52.j(ky0.n) == kk3.Rtl) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if (((lo4) vs4Var.getValue()) != lo4.Vertical && z15) {
                                            z16 = false;
                                        } else {
                                            z16 = true;
                                        }
                                        boolean f5 = xq2Var52.f(i27Var5);
                                        Object P19 = xq2Var52.P();
                                        vs0 vs0Var4 = ox0.a;
                                        if (f5 || P19 == vs0Var4) {
                                            P19 = new ro5(i27Var5, 19);
                                            xq2Var52.l0(P19);
                                        }
                                        qa4 b02 = np2.b0((qn2) P19, xq2Var52);
                                        Object P20 = xq2Var52.P();
                                        if (P20 == vs0Var4) {
                                            bf1 bf1Var = new bf1(new j4(b02, 24));
                                            xq2Var52.l0(bf1Var);
                                            P20 = bf1Var;
                                        }
                                        f86 f86Var = (f86) P20;
                                        boolean f6 = xq2Var52.f(f86Var) | xq2Var52.f(i27Var5);
                                        Object P21 = xq2Var52.P();
                                        if (f6 || P21 == vs0Var4) {
                                            P21 = new h27(f86Var, i27Var5);
                                            xq2Var52.l0(P21);
                                        }
                                        h27 h27Var = (h27) P21;
                                        lo4 lo4Var2 = (lo4) vs4Var.getValue();
                                        if (!z2 || i27Var5.b.h() == RecyclerView.B1) {
                                            z17 = false;
                                        }
                                        a74 b2 = y76.b(h27Var, lo4Var2, z17, z16, r94Var);
                                        xq2Var52.p(false);
                                        return b2;
                                    }
                                })).d(S).d(b61Var), new w51(jt3Var5, 0)).d(new ba(new sa5(12, p27Var5, w61Var3)));
                                if (z2) {
                                }
                                if (z11) {
                                    x64Var = l.p(x64Var, new ov4(p27Var5, i18));
                                }
                                xq2 xq2Var52 = xq2Var3;
                                final a74 x64Var32 = x64Var;
                                final qh1 qh1Var42 = qh1Var2;
                                final a74 a74Var52 = a74Var3;
                                final s70 s70Var32 = s70Var2;
                                final jt3 jt3Var82 = jt3Var5;
                                eo2 eo2Var2 = new eo2() { // from class: p51
                                    @Override // defpackage.eo2
                                    public final Object o(Object obj, Object obj2) {
                                        boolean z15;
                                        px0 px0Var2 = (px0) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        if ((intValue & 3) != 2) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        xq2 xq2Var6 = (xq2) px0Var2;
                                        if (xq2Var6.S(intValue & 1, z15)) {
                                            final jt3 jt3Var9 = jt3Var82;
                                            final s47 s47Var3 = s47Var;
                                            final int i24 = i3;
                                            final int i25 = i2;
                                            final i27 i27Var5 = i27Var42;
                                            final c37 c37Var5 = c37Var;
                                            final wq7 wq7Var2 = wq7Var;
                                            final a74 a74Var6 = a74Var52;
                                            final a74 a74Var7 = v;
                                            final a74 a74Var8 = z13;
                                            final a74 a74Var9 = x64Var32;
                                            final s70 s70Var4 = s70Var32;
                                            final p27 p27Var6 = p27Var5;
                                            final boolean z16 = z11;
                                            final qn2 qn2Var5 = qn2Var2;
                                            final mk4 mk4Var9 = mk4Var82;
                                            final qh1 qh1Var5 = qh1Var42;
                                            zv0.this.e(n16.I(-44346382, new eo2() { // from class: t51
                                                @Override // defpackage.eo2
                                                public final Object o(Object obj3, Object obj4) {
                                                    boolean z17;
                                                    a74 jm7Var;
                                                    px0 px0Var3 = (px0) obj3;
                                                    int intValue2 = ((Integer) obj4).intValue();
                                                    if ((intValue2 & 3) != 2) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    xq2 xq2Var7 = (xq2) px0Var3;
                                                    if (xq2Var7.S(intValue2 & 1, z17)) {
                                                        jt3 jt3Var10 = jt3.this;
                                                        a74 f5 = dj6.f(x64.a, ((om1) jt3Var10.g.getValue()).A, RecyclerView.B1, 2);
                                                        int i26 = i24;
                                                        int i27 = i25;
                                                        qo2.W(i26, i27);
                                                        s47 s47Var4 = s47Var3;
                                                        if (i26 != 1 || i27 != Integer.MAX_VALUE) {
                                                            f5 = f5.d(new cx2(s47Var4, i26, i27));
                                                        }
                                                        boolean h8 = xq2Var7.h(jt3Var10);
                                                        Object P19 = xq2Var7.P();
                                                        if (h8 || P19 == ox0.a) {
                                                            P19 = new a5(jt3Var10, 20);
                                                            xq2Var7.l0(P19);
                                                        }
                                                        on2 on2Var22 = (on2) P19;
                                                        i27 i27Var6 = i27Var5;
                                                        lo4 lo4Var2 = (lo4) i27Var6.f.getValue();
                                                        c37 c37Var6 = c37Var5;
                                                        long j8 = c37Var6.b;
                                                        int i28 = k47.c;
                                                        int i29 = (int) (j8 >> 32);
                                                        long j9 = i27Var6.e;
                                                        if (i29 == ((int) (j9 >> 32)) && (i29 = (int) (j8 & 4294967295L)) == ((int) (j9 & 4294967295L))) {
                                                            i29 = k47.f(j8);
                                                        }
                                                        i27Var6.e = c37Var6.b;
                                                        p97 a5 = jk7.a(wq7Var2, c37Var6.a);
                                                        int i30 = f27.a[lo4Var2.ordinal()];
                                                        if (i30 != 1) {
                                                            if (i30 == 2) {
                                                                jm7Var = new iy2(i27Var6, i29, a5, on2Var22);
                                                            } else {
                                                                i.d();
                                                                return null;
                                                            }
                                                        } else {
                                                            jm7Var = new jm7(i27Var6, i29, a5, on2Var22);
                                                        }
                                                        mp2.d(hv.j(u24.h(f5).d(jm7Var).d(a74Var6).d(a74Var7).d(new x27(s47Var4)).d(a74Var8).d(a74Var9), s70Var4), n16.I(1412697320, new u51(p27Var6, jt3Var10, z16, qn2Var5, c37Var6, mk4Var9, qh1Var5, i27), xq2Var7), xq2Var7, 48);
                                                    } else {
                                                        xq2Var7.V();
                                                    }
                                                    return jg7.a;
                                                }
                                            }, xq2Var6), xq2Var6, 6);
                                        } else {
                                            xq2Var6.V();
                                        }
                                        return jg7.a;
                                    }
                                };
                                xq2Var = xq2Var52;
                                d(d42, p27Var5, n16.I(-814563849, eo2Var2, xq2Var), xq2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                            }
                        } else {
                            jt3Var3 = jt3Var2;
                        }
                        z8 = true;
                        z9 = f4 | z8;
                        Object P182 = xq2Var3.P();
                        if (z9) {
                        }
                        nh2Var4 = nh2Var3;
                        w61Var3 = w61Var2;
                        a74Var2 = d0;
                        x64Var = x64Var2;
                        jt3Var4 = jt3Var3;
                        jiVar = new ji(jt3Var4, b0, o37Var, p27Var2, l33Var2, null, 4);
                        qa4Var = b0;
                        o37Var2 = o37Var;
                        xq2Var3.l0(jiVar);
                        mb3.i(xq2Var3, jiVar, jg7.a);
                        a74 a42 = jw6.a(x64Var, 8675309, new rg(new w51(jt3Var4, 4), 3));
                        mk4Var4 = mk4Var3;
                        xb4 xb4Var2 = new xb4(jt3Var4, nh2Var4, z7, p27Var2, mk4Var4);
                        p27Var3 = p27Var2;
                        if (z2) {
                        }
                        a74 d32 = a42.d(new iw6(p27Var3.A, p27Var3.z, null, new rg(p27Var3, 6), 4));
                        ty4.a.getClass();
                        a74 S2 = kj2.S(d32, jw2.y);
                        final a74 v2 = q60.v(x64Var, new t00(jt3Var4, c37Var2, mk4Var4, 5));
                        boolean h72 = xq2Var3.h(jt3Var4) | (i16 == 2048) | xq2Var3.f(ot7Var2) | xq2Var3.h(p27Var3);
                        int i222 = i14;
                        h3 = h72 | (i222 == 4) | xq2Var3.h(mk4Var4);
                        P5 = xq2Var3.P();
                        if (h3) {
                        }
                        mk4Var5 = mk4Var4;
                        final c37 c37Var42 = c37Var2;
                        p27Var4 = p27Var3;
                        qn2 qn2Var42 = new qn2() { // from class: r51
                            @Override // defpackage.qn2
                            public final Object g(Object obj) {
                                t37 t37Var2;
                                jk3 jk3Var;
                                jk3 jk3Var2;
                                jt3 jt3Var72 = jt3.this;
                                vs4 vs4Var = jt3Var72.o;
                                jk3 jk3Var3 = (jk3) obj;
                                jt3Var72.h = jk3Var3;
                                b47 d43 = jt3Var72.d();
                                if (d43 != null) {
                                    d43.b = jk3Var3;
                                }
                                if (z2) {
                                    hv2 a5 = jt3Var72.a();
                                    hv2 hv2Var = hv2.Selection;
                                    p27 p27Var6 = p27Var4;
                                    c37 c37Var5 = c37Var42;
                                    if (a5 == hv2Var) {
                                        if (((Boolean) jt3Var72.l.getValue()).booleanValue() && ((Boolean) ((zr3) ot7Var2).c.getValue()).booleanValue()) {
                                            p27Var6.r();
                                        } else {
                                            p27Var6.o();
                                        }
                                        jt3Var72.m.setValue(Boolean.valueOf(kn2.O(p27Var6, true)));
                                        jt3Var72.n.setValue(Boolean.valueOf(kn2.O(p27Var6, false)));
                                        vs4Var.setValue(Boolean.valueOf(k47.c(c37Var5.b)));
                                    } else if (jt3Var72.a() == hv2.Cursor) {
                                        vs4Var.setValue(Boolean.valueOf(kn2.O(p27Var6, true)));
                                    }
                                    mk4 mk4Var83 = mk4Var5;
                                    hf.e0(jt3Var72, c37Var5, mk4Var83);
                                    b47 d5 = jt3Var72.d();
                                    if (d5 != null && (t37Var2 = jt3Var72.e) != null && jt3Var72.b() && (jk3Var = d5.b) != null && jk3Var.t() && (jk3Var2 = d5.c) != null) {
                                        a47 a47Var = d5.a;
                                        d80 d80Var = new d80(jk3Var, 2);
                                        of5 f0 = uj2.f0(jk3Var);
                                        of5 O = jk3Var.O(jk3Var2, false);
                                        if (nb3.k((t37) t37Var2.a.b.get(), t37Var2)) {
                                            t37Var2.b.d(c37Var5, mk4Var83, a47Var, d80Var, f0, O);
                                        }
                                    }
                                }
                                return jg7.a;
                            }
                        };
                        ot7Var = ot7Var2;
                        xq2Var3.l0(qn2Var42);
                        P5 = qn2Var42;
                        final a74 z132 = u24.z(x64Var, (qn2) P5);
                        jt3 jt3Var72 = jt3Var4;
                        o37 o37Var42 = o37Var2;
                        p27Var5 = p27Var4;
                        b61 b61Var2 = new b61(p97Var2, c37Var, jt3Var72, z2, wq7Var instanceof jt4, mk4Var5, p27Var5, l33Var, nh2Var4);
                        jt3Var5 = jt3Var72;
                        if (!z2 && ((Boolean) ((zr3) ot7Var).c.getValue()).booleanValue() && k47.c(((k47) jt3Var5.A.getValue()).a) && k47.c(((k47) jt3Var5.B.getValue()).a)) {
                        }
                        h4 = xq2Var3.h(p27Var5);
                        P6 = xq2Var3.P();
                        if (!h4) {
                        }
                        P6 = new s51(p27Var5, 0);
                        xq2Var3.l0(P6);
                        mb3.d(p27Var5, (qn2) P6, xq2Var3);
                        h5 = xq2Var3.h(jt3Var5) | xq2Var3.h(o37Var42) | (i222 == 4) | ((i13 <= 32 && xq2Var3.f(l33Var)) || (i15 & 48) == 32);
                        P7 = xq2Var3.P();
                        if (h5) {
                        }
                        cn cnVar2 = new cn(jt3Var5, o37Var42, c37Var, l33Var, 3);
                        l33Var3 = l33Var;
                        xq2Var3.l0(cnVar2);
                        P7 = cnVar2;
                        mb3.d(l33Var3, (qn2) P7, xq2Var3);
                        final qn2 w51Var2 = jt3Var5.v;
                        if (i2 == 1) {
                        }
                        final int i232 = l33Var3.e;
                        a74 p22 = l.p(x64Var, new fo2() { // from class: w17
                            @Override // defpackage.fo2
                            public final Object e(Object obj, Object obj2, Object obj3) {
                                a74 a74Var53 = (a74) obj;
                                ((Integer) obj3).getClass();
                                xq2 xq2Var53 = (xq2) ((px0) obj2);
                                xq2Var53.b0(851809892);
                                Object P19 = xq2Var53.P();
                                vs0 vs0Var4 = ox0.a;
                                if (P19 == vs0Var4) {
                                    P19 = new Object();
                                    xq2Var53.l0(P19);
                                }
                                j47 j47Var = (j47) P19;
                                Object P20 = xq2Var53.P();
                                if (P20 == vs0Var4) {
                                    P20 = new Object();
                                    xq2Var53.l0(P20);
                                }
                                v17 v17Var = new v17(jt3.this, p27Var5, c37Var, r4, z14, j47Var, mk4Var5, fg7Var, (fc1) P20, w51Var2, i232);
                                boolean h8 = xq2Var53.h(v17Var);
                                Object P21 = xq2Var53.P();
                                if (h8 || P21 == vs0Var4) {
                                    xj5 xj5Var = new xj5(1, v17Var, v17.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 5);
                                    xq2Var53.l0(xj5Var);
                                    P21 = xj5Var;
                                }
                                a74 A2 = u24.A(x64.a, (qn2) ((po2) P21));
                                xq2Var53.p(false);
                                return A2;
                            }
                        });
                        i17 = l33Var3.d;
                        if (i17 == 7) {
                            z10 = true;
                            booleanValue = ((Boolean) qa4Var.getValue()).booleanValue();
                            g2 = xq2Var3.g(z10) | xq2Var3.h(kiVar);
                            P8 = xq2Var3.P();
                            if (!g2) {
                            }
                            P8 = new sz0(z10, kiVar, 2);
                            xq2Var3.l0(P8);
                            on2 on2Var22 = (on2) P8;
                            if (booleanValue) {
                            }
                            a74Var4 = x64Var;
                            f80 f80Var22 = (f80) xq2Var3.j(kz.a);
                            long j722 = ((kt0) xq2Var3.j(kz.b)).a;
                            final mk4 mk4Var822 = mk4Var5;
                            if (!kt0.d(j722, hv.b(1308617531))) {
                            }
                            h6 = xq2Var3.h(jt3Var5) | xq2Var3.f(cn6Var2);
                            P9 = xq2Var3.P();
                            if (h6) {
                            }
                            i18 = 16;
                            P9 = new y(16, jt3Var5, cn6Var2);
                            xq2Var3.l0(P9);
                            final i27 i27Var422 = i27Var2;
                            a74 d422 = u24.z(u24.B(u24.B(a74Var.d(q60.y(x64Var, (qn2) P9)).d(new dt3(kiVar, jt3Var5, p27Var5)).d(a74Var4).d(a74Var2), new r5(26, ah2Var2, jt3Var5)), new r5(8, jt3Var5, p27Var5)).d(p22).d(new nx0(new fo2() { // from class: e27
                                @Override // defpackage.fo2
                                public final Object e(Object obj, Object obj2, Object obj3) {
                                    boolean z15;
                                    boolean z16;
                                    i27 i27Var5 = i27.this;
                                    vs4 vs4Var = i27Var5.f;
                                    a74 a74Var522 = (a74) obj;
                                    ((Integer) obj3).getClass();
                                    xq2 xq2Var522 = (xq2) ((px0) obj2);
                                    xq2Var522.b0(-2137546592);
                                    boolean z17 = true;
                                    if (xq2Var522.j(ky0.n) == kk3.Rtl) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (((lo4) vs4Var.getValue()) != lo4.Vertical && z15) {
                                        z16 = false;
                                    } else {
                                        z16 = true;
                                    }
                                    boolean f5 = xq2Var522.f(i27Var5);
                                    Object P19 = xq2Var522.P();
                                    vs0 vs0Var4 = ox0.a;
                                    if (f5 || P19 == vs0Var4) {
                                        P19 = new ro5(i27Var5, 19);
                                        xq2Var522.l0(P19);
                                    }
                                    qa4 b02 = np2.b0((qn2) P19, xq2Var522);
                                    Object P20 = xq2Var522.P();
                                    if (P20 == vs0Var4) {
                                        bf1 bf1Var = new bf1(new j4(b02, 24));
                                        xq2Var522.l0(bf1Var);
                                        P20 = bf1Var;
                                    }
                                    f86 f86Var = (f86) P20;
                                    boolean f6 = xq2Var522.f(f86Var) | xq2Var522.f(i27Var5);
                                    Object P21 = xq2Var522.P();
                                    if (f6 || P21 == vs0Var4) {
                                        P21 = new h27(f86Var, i27Var5);
                                        xq2Var522.l0(P21);
                                    }
                                    h27 h27Var = (h27) P21;
                                    lo4 lo4Var2 = (lo4) vs4Var.getValue();
                                    if (!z2 || i27Var5.b.h() == RecyclerView.B1) {
                                        z17 = false;
                                    }
                                    a74 b2 = y76.b(h27Var, lo4Var2, z17, z16, r94Var);
                                    xq2Var522.p(false);
                                    return b2;
                                }
                            })).d(S2).d(b61Var2), new w51(jt3Var5, 0)).d(new ba(new sa5(12, p27Var5, w61Var3)));
                            if (z2) {
                            }
                            if (z11) {
                            }
                            xq2 xq2Var522 = xq2Var3;
                            final a74 x64Var322 = x64Var;
                            final qh1 qh1Var422 = qh1Var2;
                            final a74 a74Var522 = a74Var3;
                            final s70 s70Var322 = s70Var2;
                            final jt3 jt3Var822 = jt3Var5;
                            eo2 eo2Var22 = new eo2() { // from class: p51
                                @Override // defpackage.eo2
                                public final Object o(Object obj, Object obj2) {
                                    boolean z15;
                                    px0 px0Var2 = (px0) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    if ((intValue & 3) != 2) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    xq2 xq2Var6 = (xq2) px0Var2;
                                    if (xq2Var6.S(intValue & 1, z15)) {
                                        final jt3 jt3Var9 = jt3Var822;
                                        final s47 s47Var3 = s47Var;
                                        final int i24 = i3;
                                        final int i25 = i2;
                                        final i27 i27Var5 = i27Var422;
                                        final c37 c37Var5 = c37Var;
                                        final wq7 wq7Var2 = wq7Var;
                                        final a74 a74Var6 = a74Var522;
                                        final a74 a74Var7 = v2;
                                        final a74 a74Var8 = z132;
                                        final a74 a74Var9 = x64Var322;
                                        final s70 s70Var4 = s70Var322;
                                        final p27 p27Var6 = p27Var5;
                                        final boolean z16 = z11;
                                        final qn2 qn2Var5 = qn2Var2;
                                        final mk4 mk4Var9 = mk4Var822;
                                        final qh1 qh1Var5 = qh1Var422;
                                        zv0.this.e(n16.I(-44346382, new eo2() { // from class: t51
                                            @Override // defpackage.eo2
                                            public final Object o(Object obj3, Object obj4) {
                                                boolean z17;
                                                a74 jm7Var;
                                                px0 px0Var3 = (px0) obj3;
                                                int intValue2 = ((Integer) obj4).intValue();
                                                if ((intValue2 & 3) != 2) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                xq2 xq2Var7 = (xq2) px0Var3;
                                                if (xq2Var7.S(intValue2 & 1, z17)) {
                                                    jt3 jt3Var10 = jt3.this;
                                                    a74 f5 = dj6.f(x64.a, ((om1) jt3Var10.g.getValue()).A, RecyclerView.B1, 2);
                                                    int i26 = i24;
                                                    int i27 = i25;
                                                    qo2.W(i26, i27);
                                                    s47 s47Var4 = s47Var3;
                                                    if (i26 != 1 || i27 != Integer.MAX_VALUE) {
                                                        f5 = f5.d(new cx2(s47Var4, i26, i27));
                                                    }
                                                    boolean h8 = xq2Var7.h(jt3Var10);
                                                    Object P19 = xq2Var7.P();
                                                    if (h8 || P19 == ox0.a) {
                                                        P19 = new a5(jt3Var10, 20);
                                                        xq2Var7.l0(P19);
                                                    }
                                                    on2 on2Var222 = (on2) P19;
                                                    i27 i27Var6 = i27Var5;
                                                    lo4 lo4Var2 = (lo4) i27Var6.f.getValue();
                                                    c37 c37Var6 = c37Var5;
                                                    long j8 = c37Var6.b;
                                                    int i28 = k47.c;
                                                    int i29 = (int) (j8 >> 32);
                                                    long j9 = i27Var6.e;
                                                    if (i29 == ((int) (j9 >> 32)) && (i29 = (int) (j8 & 4294967295L)) == ((int) (j9 & 4294967295L))) {
                                                        i29 = k47.f(j8);
                                                    }
                                                    i27Var6.e = c37Var6.b;
                                                    p97 a5 = jk7.a(wq7Var2, c37Var6.a);
                                                    int i30 = f27.a[lo4Var2.ordinal()];
                                                    if (i30 != 1) {
                                                        if (i30 == 2) {
                                                            jm7Var = new iy2(i27Var6, i29, a5, on2Var222);
                                                        } else {
                                                            i.d();
                                                            return null;
                                                        }
                                                    } else {
                                                        jm7Var = new jm7(i27Var6, i29, a5, on2Var222);
                                                    }
                                                    mp2.d(hv.j(u24.h(f5).d(jm7Var).d(a74Var6).d(a74Var7).d(new x27(s47Var4)).d(a74Var8).d(a74Var9), s70Var4), n16.I(1412697320, new u51(p27Var6, jt3Var10, z16, qn2Var5, c37Var6, mk4Var9, qh1Var5, i27), xq2Var7), xq2Var7, 48);
                                                } else {
                                                    xq2Var7.V();
                                                }
                                                return jg7.a;
                                            }
                                        }, xq2Var6), xq2Var6, 6);
                                    } else {
                                        xq2Var6.V();
                                    }
                                    return jg7.a;
                                }
                            };
                            xq2Var = xq2Var522;
                            d(d422, p27Var5, n16.I(-814563849, eo2Var22, xq2Var), xq2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                        }
                        z10 = false;
                        booleanValue = ((Boolean) qa4Var.getValue()).booleanValue();
                        g2 = xq2Var3.g(z10) | xq2Var3.h(kiVar);
                        P8 = xq2Var3.P();
                        if (!g2) {
                        }
                        P8 = new sz0(z10, kiVar, 2);
                        xq2Var3.l0(P8);
                        on2 on2Var222 = (on2) P8;
                        if (booleanValue) {
                        }
                        a74Var4 = x64Var;
                        f80 f80Var222 = (f80) xq2Var3.j(kz.a);
                        long j7222 = ((kt0) xq2Var3.j(kz.b)).a;
                        final mk4 mk4Var8222 = mk4Var5;
                        if (!kt0.d(j7222, hv.b(1308617531))) {
                        }
                        h6 = xq2Var3.h(jt3Var5) | xq2Var3.f(cn6Var2);
                        P9 = xq2Var3.P();
                        if (h6) {
                        }
                        i18 = 16;
                        P9 = new y(16, jt3Var5, cn6Var2);
                        xq2Var3.l0(P9);
                        final i27 i27Var4222 = i27Var2;
                        a74 d4222 = u24.z(u24.B(u24.B(a74Var.d(q60.y(x64Var, (qn2) P9)).d(new dt3(kiVar, jt3Var5, p27Var5)).d(a74Var4).d(a74Var2), new r5(26, ah2Var2, jt3Var5)), new r5(8, jt3Var5, p27Var5)).d(p22).d(new nx0(new fo2() { // from class: e27
                            @Override // defpackage.fo2
                            public final Object e(Object obj, Object obj2, Object obj3) {
                                boolean z15;
                                boolean z16;
                                i27 i27Var5 = i27.this;
                                vs4 vs4Var = i27Var5.f;
                                a74 a74Var5222 = (a74) obj;
                                ((Integer) obj3).getClass();
                                xq2 xq2Var5222 = (xq2) ((px0) obj2);
                                xq2Var5222.b0(-2137546592);
                                boolean z17 = true;
                                if (xq2Var5222.j(ky0.n) == kk3.Rtl) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (((lo4) vs4Var.getValue()) != lo4.Vertical && z15) {
                                    z16 = false;
                                } else {
                                    z16 = true;
                                }
                                boolean f5 = xq2Var5222.f(i27Var5);
                                Object P19 = xq2Var5222.P();
                                vs0 vs0Var4 = ox0.a;
                                if (f5 || P19 == vs0Var4) {
                                    P19 = new ro5(i27Var5, 19);
                                    xq2Var5222.l0(P19);
                                }
                                qa4 b02 = np2.b0((qn2) P19, xq2Var5222);
                                Object P20 = xq2Var5222.P();
                                if (P20 == vs0Var4) {
                                    bf1 bf1Var = new bf1(new j4(b02, 24));
                                    xq2Var5222.l0(bf1Var);
                                    P20 = bf1Var;
                                }
                                f86 f86Var = (f86) P20;
                                boolean f6 = xq2Var5222.f(f86Var) | xq2Var5222.f(i27Var5);
                                Object P21 = xq2Var5222.P();
                                if (f6 || P21 == vs0Var4) {
                                    P21 = new h27(f86Var, i27Var5);
                                    xq2Var5222.l0(P21);
                                }
                                h27 h27Var = (h27) P21;
                                lo4 lo4Var2 = (lo4) vs4Var.getValue();
                                if (!z2 || i27Var5.b.h() == RecyclerView.B1) {
                                    z17 = false;
                                }
                                a74 b2 = y76.b(h27Var, lo4Var2, z17, z16, r94Var);
                                xq2Var5222.p(false);
                                return b2;
                            }
                        })).d(S2).d(b61Var2), new w51(jt3Var5, 0)).d(new ba(new sa5(12, p27Var5, w61Var3)));
                        if (z2) {
                        }
                        if (z11) {
                        }
                        xq2 xq2Var5222 = xq2Var3;
                        final a74 x64Var3222 = x64Var;
                        final qh1 qh1Var4222 = qh1Var2;
                        final a74 a74Var5222 = a74Var3;
                        final s70 s70Var3222 = s70Var2;
                        final jt3 jt3Var8222 = jt3Var5;
                        eo2 eo2Var222 = new eo2() { // from class: p51
                            @Override // defpackage.eo2
                            public final Object o(Object obj, Object obj2) {
                                boolean z15;
                                px0 px0Var2 = (px0) obj;
                                int intValue = ((Integer) obj2).intValue();
                                if ((intValue & 3) != 2) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                xq2 xq2Var6 = (xq2) px0Var2;
                                if (xq2Var6.S(intValue & 1, z15)) {
                                    final jt3 jt3Var9 = jt3Var8222;
                                    final s47 s47Var3 = s47Var;
                                    final int i24 = i3;
                                    final int i25 = i2;
                                    final i27 i27Var5 = i27Var4222;
                                    final c37 c37Var5 = c37Var;
                                    final wq7 wq7Var2 = wq7Var;
                                    final a74 a74Var6 = a74Var5222;
                                    final a74 a74Var7 = v2;
                                    final a74 a74Var8 = z132;
                                    final a74 a74Var9 = x64Var3222;
                                    final s70 s70Var4 = s70Var3222;
                                    final p27 p27Var6 = p27Var5;
                                    final boolean z16 = z11;
                                    final qn2 qn2Var5 = qn2Var2;
                                    final mk4 mk4Var9 = mk4Var8222;
                                    final qh1 qh1Var5 = qh1Var4222;
                                    zv0.this.e(n16.I(-44346382, new eo2() { // from class: t51
                                        @Override // defpackage.eo2
                                        public final Object o(Object obj3, Object obj4) {
                                            boolean z17;
                                            a74 jm7Var;
                                            px0 px0Var3 = (px0) obj3;
                                            int intValue2 = ((Integer) obj4).intValue();
                                            if ((intValue2 & 3) != 2) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            xq2 xq2Var7 = (xq2) px0Var3;
                                            if (xq2Var7.S(intValue2 & 1, z17)) {
                                                jt3 jt3Var10 = jt3.this;
                                                a74 f5 = dj6.f(x64.a, ((om1) jt3Var10.g.getValue()).A, RecyclerView.B1, 2);
                                                int i26 = i24;
                                                int i27 = i25;
                                                qo2.W(i26, i27);
                                                s47 s47Var4 = s47Var3;
                                                if (i26 != 1 || i27 != Integer.MAX_VALUE) {
                                                    f5 = f5.d(new cx2(s47Var4, i26, i27));
                                                }
                                                boolean h8 = xq2Var7.h(jt3Var10);
                                                Object P19 = xq2Var7.P();
                                                if (h8 || P19 == ox0.a) {
                                                    P19 = new a5(jt3Var10, 20);
                                                    xq2Var7.l0(P19);
                                                }
                                                on2 on2Var2222 = (on2) P19;
                                                i27 i27Var6 = i27Var5;
                                                lo4 lo4Var2 = (lo4) i27Var6.f.getValue();
                                                c37 c37Var6 = c37Var5;
                                                long j8 = c37Var6.b;
                                                int i28 = k47.c;
                                                int i29 = (int) (j8 >> 32);
                                                long j9 = i27Var6.e;
                                                if (i29 == ((int) (j9 >> 32)) && (i29 = (int) (j8 & 4294967295L)) == ((int) (j9 & 4294967295L))) {
                                                    i29 = k47.f(j8);
                                                }
                                                i27Var6.e = c37Var6.b;
                                                p97 a5 = jk7.a(wq7Var2, c37Var6.a);
                                                int i30 = f27.a[lo4Var2.ordinal()];
                                                if (i30 != 1) {
                                                    if (i30 == 2) {
                                                        jm7Var = new iy2(i27Var6, i29, a5, on2Var2222);
                                                    } else {
                                                        i.d();
                                                        return null;
                                                    }
                                                } else {
                                                    jm7Var = new jm7(i27Var6, i29, a5, on2Var2222);
                                                }
                                                mp2.d(hv.j(u24.h(f5).d(jm7Var).d(a74Var6).d(a74Var7).d(new x27(s47Var4)).d(a74Var8).d(a74Var9), s70Var4), n16.I(1412697320, new u51(p27Var6, jt3Var10, z16, qn2Var5, c37Var6, mk4Var9, qh1Var5, i27), xq2Var7), xq2Var7, 48);
                                            } else {
                                                xq2Var7.V();
                                            }
                                            return jg7.a;
                                        }
                                    }, xq2Var6), xq2Var6, 6);
                                } else {
                                    xq2Var6.V();
                                }
                                return jg7.a;
                            }
                        };
                        xq2Var = xq2Var5222;
                        d(d4222, p27Var5, n16.I(-814563849, eo2Var222, xq2Var), xq2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                    }
                }
                z5 = false;
                if (k47Var2 != null) {
                }
                if (z4) {
                }
                gs1 gs1Var22 = (gs1) yc1Var.B;
                gs1Var22.R = -1;
                gs1Var22.X = -1;
                a2 = c37.a(c37Var, null, 0L, 3);
                c37 c37Var32 = (c37) yc1Var.A;
                yc1Var.A = a2;
                if (t37Var != null) {
                }
                P = xq2Var4.P();
                if (P != vs0Var) {
                }
                fg7Var = (fg7) P;
                long currentTimeMillis2 = System.currentTimeMillis();
                if (!fg7Var.e) {
                }
                fg7Var.d = Long.valueOf(currentTimeMillis2);
                fg7Var.a(c37Var);
                P2 = xq2Var2.P();
                if (P2 == vs0Var) {
                }
                w61Var = (w61) P2;
                P3 = xq2Var2.P();
                if (P3 == vs0Var) {
                }
                s70Var = (s70) P3;
                P4 = xq2Var2.P();
                if (P4 == vs0Var) {
                }
                p27Var = (p27) P4;
                mk4Var2 = mk4Var;
                p27Var.b = mk4Var2;
                p27Var.f = wq7Var;
                p27Var.c = jt3Var6.v;
                p27Var.d = jt3Var6;
                p27Var.e.setValue(c37Var);
                p27Var.w = new k47(j5);
                p27Var.h = (tr0) xq2Var2.j(ky0.f);
                p27Var.i = w61Var;
                u47 u47Var2 = (u47) xq2Var2.j(ky0.r);
                p27Var.k = (tv2) xq2Var2.j(ky0.l);
                nh2 nh2Var62 = nh2Var;
                p27Var.l = nh2Var62;
                p27Var.m.setValue(true);
                p27Var.n.setValue(Boolean.valueOf(z2));
                xq2Var2.b0(1966756105);
                ca6 ca6Var2 = ca6.EditableText;
                gy3 gy3Var2 = s47Var2.a.k;
                nq6 nq6Var2 = by4.a;
                xq2Var2.b0(430530635);
                if (Build.VERSION.SDK_INT >= 28) {
                }
                p27Var.j = zx4Var;
                xq2Var2.p(z6);
                jt3Var6.b();
                i10 = i8;
                i11 = i10 & 7168;
                i12 = i9;
                i13 = (i10 & 112) ^ 48;
                h2 = ((i13 <= 32 && xq2Var2.f(l33Var)) || (i10 & 48) == 32) | xq2Var2.h(jt3Var6) | (i11 != 2048) | ((i10 & 57344) != 16384) | xq2Var2.h(o37Var3) | (i12 != 4) | xq2Var2.h(mk4Var2) | xq2Var2.h(w61Var) | xq2Var2.h(s70Var) | xq2Var2.h(p27Var);
                Object P172 = xq2Var2.P();
                if (h2) {
                }
                p97Var2 = p97Var;
                o37Var = o37Var3;
                i14 = i12;
                xq2Var3 = xq2Var2;
                ah2Var2 = ah2Var;
                i15 = i10;
                nh2Var3 = nh2Var2;
                i27Var2 = i27Var;
                r94Var2 = r94Var;
                l33Var2 = l33Var;
                vs0Var2 = vs0Var;
                i16 = i11;
                jt3Var2 = jt3Var6;
                qn2Var3 = new qn2() { // from class: q51
                    @Override // defpackage.qn2
                    public final Object g(Object obj) {
                        b47 d33;
                        sh2 sh2Var = (sh2) obj;
                        jt3 jt3Var73 = jt3.this;
                        boolean b2 = jt3Var73.b();
                        boolean isFocused = sh2Var.isFocused();
                        jg7 jg7Var = jg7.a;
                        if (b2 != isFocused) {
                            jt3Var73.f.setValue(Boolean.valueOf(sh2Var.isFocused()));
                            boolean b3 = jt3Var73.b();
                            c37 c37Var43 = c37Var;
                            mk4 mk4Var83 = mk4Var2;
                            if (b3 && z2) {
                                hf.o0(o37Var, jt3Var73, c37Var43, l33Var2, mk4Var83);
                            } else {
                                hf.N(jt3Var73);
                            }
                            if (sh2Var.isFocused() && (d33 = jt3Var73.d()) != null) {
                                hv.L(w61Var, null, null, new ji(s70Var, c37Var43, jt3Var73, d33, mk4Var83, null, 5), 3);
                            }
                            if (!sh2Var.isFocused()) {
                                p27Var.g(null);
                            }
                        }
                        return jg7Var;
                    }
                };
                mk4Var3 = mk4Var2;
                s70Var2 = s70Var;
                z7 = z2;
                w61Var2 = w61Var;
                c37Var2 = c37Var;
                p27Var2 = p27Var;
                xq2Var3.l0(qn2Var3);
                x64 x64Var22 = x64.a;
                a74 d02 = nw7.d0(n16.G(ak7.S(x64Var22, nh2Var3), qn2Var3), z7, r94Var2);
                qa4 b02 = np2.b0(Boolean.valueOf(z7), xq2Var3);
                boolean f42 = xq2Var3.f(b02) | xq2Var3.h(jt3Var2) | xq2Var3.h(o37Var) | xq2Var3.h(p27Var2);
                if (i13 > 32) {
                }
                jt3Var3 = jt3Var2;
                if ((i15 & 48) != 32) {
                }
                z8 = true;
                z9 = f42 | z8;
                Object P1822 = xq2Var3.P();
                if (z9) {
                }
                nh2Var4 = nh2Var3;
                w61Var3 = w61Var2;
                a74Var2 = d02;
                x64Var = x64Var22;
                jt3Var4 = jt3Var3;
                jiVar = new ji(jt3Var4, b02, o37Var, p27Var2, l33Var2, null, 4);
                qa4Var = b02;
                o37Var2 = o37Var;
                xq2Var3.l0(jiVar);
                mb3.i(xq2Var3, jiVar, jg7.a);
                a74 a422 = jw6.a(x64Var, 8675309, new rg(new w51(jt3Var4, 4), 3));
                mk4Var4 = mk4Var3;
                xb4 xb4Var22 = new xb4(jt3Var4, nh2Var4, z7, p27Var2, mk4Var4);
                p27Var3 = p27Var2;
                if (z2) {
                }
                a74 d322 = a422.d(new iw6(p27Var3.A, p27Var3.z, null, new rg(p27Var3, 6), 4));
                ty4.a.getClass();
                a74 S22 = kj2.S(d322, jw2.y);
                final a74 v22 = q60.v(x64Var, new t00(jt3Var4, c37Var2, mk4Var4, 5));
                boolean h722 = xq2Var3.h(jt3Var4) | (i16 == 2048) | xq2Var3.f(ot7Var2) | xq2Var3.h(p27Var3);
                int i2222 = i14;
                h3 = h722 | (i2222 == 4) | xq2Var3.h(mk4Var4);
                P5 = xq2Var3.P();
                if (h3) {
                }
                mk4Var5 = mk4Var4;
                final c37 c37Var422 = c37Var2;
                p27Var4 = p27Var3;
                qn2 qn2Var422 = new qn2() { // from class: r51
                    @Override // defpackage.qn2
                    public final Object g(Object obj) {
                        t37 t37Var2;
                        jk3 jk3Var;
                        jk3 jk3Var2;
                        jt3 jt3Var722 = jt3.this;
                        vs4 vs4Var = jt3Var722.o;
                        jk3 jk3Var3 = (jk3) obj;
                        jt3Var722.h = jk3Var3;
                        b47 d43 = jt3Var722.d();
                        if (d43 != null) {
                            d43.b = jk3Var3;
                        }
                        if (z2) {
                            hv2 a5 = jt3Var722.a();
                            hv2 hv2Var = hv2.Selection;
                            p27 p27Var6 = p27Var4;
                            c37 c37Var5 = c37Var422;
                            if (a5 == hv2Var) {
                                if (((Boolean) jt3Var722.l.getValue()).booleanValue() && ((Boolean) ((zr3) ot7Var2).c.getValue()).booleanValue()) {
                                    p27Var6.r();
                                } else {
                                    p27Var6.o();
                                }
                                jt3Var722.m.setValue(Boolean.valueOf(kn2.O(p27Var6, true)));
                                jt3Var722.n.setValue(Boolean.valueOf(kn2.O(p27Var6, false)));
                                vs4Var.setValue(Boolean.valueOf(k47.c(c37Var5.b)));
                            } else if (jt3Var722.a() == hv2.Cursor) {
                                vs4Var.setValue(Boolean.valueOf(kn2.O(p27Var6, true)));
                            }
                            mk4 mk4Var83 = mk4Var5;
                            hf.e0(jt3Var722, c37Var5, mk4Var83);
                            b47 d5 = jt3Var722.d();
                            if (d5 != null && (t37Var2 = jt3Var722.e) != null && jt3Var722.b() && (jk3Var = d5.b) != null && jk3Var.t() && (jk3Var2 = d5.c) != null) {
                                a47 a47Var = d5.a;
                                d80 d80Var = new d80(jk3Var, 2);
                                of5 f0 = uj2.f0(jk3Var);
                                of5 O = jk3Var.O(jk3Var2, false);
                                if (nb3.k((t37) t37Var2.a.b.get(), t37Var2)) {
                                    t37Var2.b.d(c37Var5, mk4Var83, a47Var, d80Var, f0, O);
                                }
                            }
                        }
                        return jg7.a;
                    }
                };
                ot7Var = ot7Var2;
                xq2Var3.l0(qn2Var422);
                P5 = qn2Var422;
                final a74 z1322 = u24.z(x64Var, (qn2) P5);
                jt3 jt3Var722 = jt3Var4;
                o37 o37Var422 = o37Var2;
                p27Var5 = p27Var4;
                b61 b61Var22 = new b61(p97Var2, c37Var, jt3Var722, z2, wq7Var instanceof jt4, mk4Var5, p27Var5, l33Var, nh2Var4);
                jt3Var5 = jt3Var722;
                if (!z2 && ((Boolean) ((zr3) ot7Var).c.getValue()).booleanValue() && k47.c(((k47) jt3Var5.A.getValue()).a) && k47.c(((k47) jt3Var5.B.getValue()).a)) {
                }
                h4 = xq2Var3.h(p27Var5);
                P6 = xq2Var3.P();
                if (!h4) {
                }
                P6 = new s51(p27Var5, 0);
                xq2Var3.l0(P6);
                mb3.d(p27Var5, (qn2) P6, xq2Var3);
                h5 = xq2Var3.h(jt3Var5) | xq2Var3.h(o37Var422) | (i2222 == 4) | ((i13 <= 32 && xq2Var3.f(l33Var)) || (i15 & 48) == 32);
                P7 = xq2Var3.P();
                if (h5) {
                }
                cn cnVar22 = new cn(jt3Var5, o37Var422, c37Var, l33Var, 3);
                l33Var3 = l33Var;
                xq2Var3.l0(cnVar22);
                P7 = cnVar22;
                mb3.d(l33Var3, (qn2) P7, xq2Var3);
                final qn2 w51Var22 = jt3Var5.v;
                if (i2 == 1) {
                }
                final int i2322 = l33Var3.e;
                a74 p222 = l.p(x64Var, new fo2() { // from class: w17
                    @Override // defpackage.fo2
                    public final Object e(Object obj, Object obj2, Object obj3) {
                        a74 a74Var53 = (a74) obj;
                        ((Integer) obj3).getClass();
                        xq2 xq2Var53 = (xq2) ((px0) obj2);
                        xq2Var53.b0(851809892);
                        Object P19 = xq2Var53.P();
                        vs0 vs0Var4 = ox0.a;
                        if (P19 == vs0Var4) {
                            P19 = new Object();
                            xq2Var53.l0(P19);
                        }
                        j47 j47Var = (j47) P19;
                        Object P20 = xq2Var53.P();
                        if (P20 == vs0Var4) {
                            P20 = new Object();
                            xq2Var53.l0(P20);
                        }
                        v17 v17Var = new v17(jt3.this, p27Var5, c37Var, r4, z14, j47Var, mk4Var5, fg7Var, (fc1) P20, w51Var22, i2322);
                        boolean h8 = xq2Var53.h(v17Var);
                        Object P21 = xq2Var53.P();
                        if (h8 || P21 == vs0Var4) {
                            xj5 xj5Var = new xj5(1, v17Var, v17.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 5);
                            xq2Var53.l0(xj5Var);
                            P21 = xj5Var;
                        }
                        a74 A2 = u24.A(x64.a, (qn2) ((po2) P21));
                        xq2Var53.p(false);
                        return A2;
                    }
                });
                i17 = l33Var3.d;
                if (i17 == 7) {
                }
                z10 = false;
                booleanValue = ((Boolean) qa4Var.getValue()).booleanValue();
                g2 = xq2Var3.g(z10) | xq2Var3.h(kiVar);
                P8 = xq2Var3.P();
                if (!g2) {
                }
                P8 = new sz0(z10, kiVar, 2);
                xq2Var3.l0(P8);
                on2 on2Var2222 = (on2) P8;
                if (booleanValue) {
                }
                a74Var4 = x64Var;
                f80 f80Var2222 = (f80) xq2Var3.j(kz.a);
                long j72222 = ((kt0) xq2Var3.j(kz.b)).a;
                final mk4 mk4Var82222 = mk4Var5;
                if (!kt0.d(j72222, hv.b(1308617531))) {
                }
                h6 = xq2Var3.h(jt3Var5) | xq2Var3.f(cn6Var2);
                P9 = xq2Var3.P();
                if (h6) {
                }
                i18 = 16;
                P9 = new y(16, jt3Var5, cn6Var2);
                xq2Var3.l0(P9);
                final i27 i27Var42222 = i27Var2;
                a74 d42222 = u24.z(u24.B(u24.B(a74Var.d(q60.y(x64Var, (qn2) P9)).d(new dt3(kiVar, jt3Var5, p27Var5)).d(a74Var4).d(a74Var2), new r5(26, ah2Var2, jt3Var5)), new r5(8, jt3Var5, p27Var5)).d(p222).d(new nx0(new fo2() { // from class: e27
                    @Override // defpackage.fo2
                    public final Object e(Object obj, Object obj2, Object obj3) {
                        boolean z15;
                        boolean z16;
                        i27 i27Var5 = i27.this;
                        vs4 vs4Var = i27Var5.f;
                        a74 a74Var52222 = (a74) obj;
                        ((Integer) obj3).getClass();
                        xq2 xq2Var52222 = (xq2) ((px0) obj2);
                        xq2Var52222.b0(-2137546592);
                        boolean z17 = true;
                        if (xq2Var52222.j(ky0.n) == kk3.Rtl) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (((lo4) vs4Var.getValue()) != lo4.Vertical && z15) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        boolean f5 = xq2Var52222.f(i27Var5);
                        Object P19 = xq2Var52222.P();
                        vs0 vs0Var4 = ox0.a;
                        if (f5 || P19 == vs0Var4) {
                            P19 = new ro5(i27Var5, 19);
                            xq2Var52222.l0(P19);
                        }
                        qa4 b022 = np2.b0((qn2) P19, xq2Var52222);
                        Object P20 = xq2Var52222.P();
                        if (P20 == vs0Var4) {
                            bf1 bf1Var = new bf1(new j4(b022, 24));
                            xq2Var52222.l0(bf1Var);
                            P20 = bf1Var;
                        }
                        f86 f86Var = (f86) P20;
                        boolean f6 = xq2Var52222.f(f86Var) | xq2Var52222.f(i27Var5);
                        Object P21 = xq2Var52222.P();
                        if (f6 || P21 == vs0Var4) {
                            P21 = new h27(f86Var, i27Var5);
                            xq2Var52222.l0(P21);
                        }
                        h27 h27Var = (h27) P21;
                        lo4 lo4Var2 = (lo4) vs4Var.getValue();
                        if (!z2 || i27Var5.b.h() == RecyclerView.B1) {
                            z17 = false;
                        }
                        a74 b2 = y76.b(h27Var, lo4Var2, z17, z16, r94Var);
                        xq2Var52222.p(false);
                        return b2;
                    }
                })).d(S22).d(b61Var22), new w51(jt3Var5, 0)).d(new ba(new sa5(12, p27Var5, w61Var3)));
                if (z2) {
                }
                if (z11) {
                }
                xq2 xq2Var52222 = xq2Var3;
                final a74 x64Var32222 = x64Var;
                final qh1 qh1Var42222 = qh1Var2;
                final a74 a74Var52222 = a74Var3;
                final s70 s70Var32222 = s70Var2;
                final jt3 jt3Var82222 = jt3Var5;
                eo2 eo2Var2222 = new eo2() { // from class: p51
                    @Override // defpackage.eo2
                    public final Object o(Object obj, Object obj2) {
                        boolean z15;
                        px0 px0Var2 = (px0) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if ((intValue & 3) != 2) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        xq2 xq2Var6 = (xq2) px0Var2;
                        if (xq2Var6.S(intValue & 1, z15)) {
                            final jt3 jt3Var9 = jt3Var82222;
                            final s47 s47Var3 = s47Var;
                            final int i24 = i3;
                            final int i25 = i2;
                            final i27 i27Var5 = i27Var42222;
                            final c37 c37Var5 = c37Var;
                            final wq7 wq7Var2 = wq7Var;
                            final a74 a74Var6 = a74Var52222;
                            final a74 a74Var7 = v22;
                            final a74 a74Var8 = z1322;
                            final a74 a74Var9 = x64Var32222;
                            final s70 s70Var4 = s70Var32222;
                            final p27 p27Var6 = p27Var5;
                            final boolean z16 = z11;
                            final qn2 qn2Var5 = qn2Var2;
                            final mk4 mk4Var9 = mk4Var82222;
                            final qh1 qh1Var5 = qh1Var42222;
                            zv0.this.e(n16.I(-44346382, new eo2() { // from class: t51
                                @Override // defpackage.eo2
                                public final Object o(Object obj3, Object obj4) {
                                    boolean z17;
                                    a74 jm7Var;
                                    px0 px0Var3 = (px0) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    if ((intValue2 & 3) != 2) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    xq2 xq2Var7 = (xq2) px0Var3;
                                    if (xq2Var7.S(intValue2 & 1, z17)) {
                                        jt3 jt3Var10 = jt3.this;
                                        a74 f5 = dj6.f(x64.a, ((om1) jt3Var10.g.getValue()).A, RecyclerView.B1, 2);
                                        int i26 = i24;
                                        int i27 = i25;
                                        qo2.W(i26, i27);
                                        s47 s47Var4 = s47Var3;
                                        if (i26 != 1 || i27 != Integer.MAX_VALUE) {
                                            f5 = f5.d(new cx2(s47Var4, i26, i27));
                                        }
                                        boolean h8 = xq2Var7.h(jt3Var10);
                                        Object P19 = xq2Var7.P();
                                        if (h8 || P19 == ox0.a) {
                                            P19 = new a5(jt3Var10, 20);
                                            xq2Var7.l0(P19);
                                        }
                                        on2 on2Var22222 = (on2) P19;
                                        i27 i27Var6 = i27Var5;
                                        lo4 lo4Var2 = (lo4) i27Var6.f.getValue();
                                        c37 c37Var6 = c37Var5;
                                        long j8 = c37Var6.b;
                                        int i28 = k47.c;
                                        int i29 = (int) (j8 >> 32);
                                        long j9 = i27Var6.e;
                                        if (i29 == ((int) (j9 >> 32)) && (i29 = (int) (j8 & 4294967295L)) == ((int) (j9 & 4294967295L))) {
                                            i29 = k47.f(j8);
                                        }
                                        i27Var6.e = c37Var6.b;
                                        p97 a5 = jk7.a(wq7Var2, c37Var6.a);
                                        int i30 = f27.a[lo4Var2.ordinal()];
                                        if (i30 != 1) {
                                            if (i30 == 2) {
                                                jm7Var = new iy2(i27Var6, i29, a5, on2Var22222);
                                            } else {
                                                i.d();
                                                return null;
                                            }
                                        } else {
                                            jm7Var = new jm7(i27Var6, i29, a5, on2Var22222);
                                        }
                                        mp2.d(hv.j(u24.h(f5).d(jm7Var).d(a74Var6).d(a74Var7).d(new x27(s47Var4)).d(a74Var8).d(a74Var9), s70Var4), n16.I(1412697320, new u51(p27Var6, jt3Var10, z16, qn2Var5, c37Var6, mk4Var9, qh1Var5, i27), xq2Var7), xq2Var7, 48);
                                    } else {
                                        xq2Var7.V();
                                    }
                                    return jg7.a;
                                }
                            }, xq2Var6), xq2Var6, 6);
                        } else {
                            xq2Var6.V();
                        }
                        return jg7.a;
                    }
                };
                xq2Var = xq2Var52222;
                d(d42222, p27Var5, n16.I(-814563849, eo2Var2222, xq2Var), xq2Var, RendererDebugBridge.CAPTURE_HEIGHT);
            } else {
                i.m("no recompose scope found");
                return;
            }
        } else {
            xq2Var = xq2Var4;
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new j30(c37Var, qn2Var, a74Var, s47Var, wq7Var, qn2Var2, r94Var, cn6Var, z, i2, i3, l33Var, vh3Var, z2, zv0Var, i4, i5);
        }
    }

    public static List c0(Object... objArr) {
        objArr.getClass();
        if (objArr.length > 0) {
            List asList = Arrays.asList(objArr);
            asList.getClass();
            return asList;
        }
        return yt1.A;
    }

    public static final void d(a74 a74Var, p27 p27Var, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(2036174316);
        if (xq2Var.f(a74Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (xq2Var.h(p27Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i6 & 1, z)) {
            e34 d2 = h70.d(d90.L, true);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            nw7.m(p27Var, zv0Var, xq2Var, (i6 >> 3) & 126);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new x3(a74Var, p27Var, zv0Var, i2, 12);
        }
    }

    public static ArrayList d0(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new ku(objArr, true));
    }

    public static final void e(pq5 pq5Var, String str, a74 a74Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(938739646);
        if ((i2 & 6) == 0) {
            if (xq2Var.h(pq5Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.f(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.f(a74Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            es7 F = bl2.F(xq2Var);
            Context context = (Context) xq2Var.j(kf.b);
            e34 d2 = h70.d(d90.L, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, d2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            vs0 vs0Var = y31.a;
            if (str != null) {
                xq2Var.b0(-352975713);
                gi2.b(str, null, dj6.c, vs0Var, 0.75f, xq2Var, ((i3 >> 3) & 14) | 14156208, 3896);
                xq2Var.p(false);
                i4 = 14;
            } else {
                xq2Var.b0(-352717142);
                lc2 lc2Var = dj6.c;
                a74 J = vy7.J(lc2Var, l0(k0(pq5Var)));
                e34 d3 = h70.d(d90.Z, false);
                int hashCode2 = Long.hashCode(xq2Var.T);
                xv4 l3 = xq2Var.l();
                a74 E2 = l.E(xq2Var, J);
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar, d3);
                yh2.K(xq2Var, pnVar2, l3);
                i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
                yh2.K(xq2Var, pnVar4, E2);
                i4 = 14;
                gi2.b(m0(context, pq5Var), null, lc2Var, vs0Var, 0.35f, xq2Var, 14156208, 3896);
                xq2Var.p(true);
                xq2Var.p(false);
            }
            h70.a(vy7.J(dj6.c, d90.m(c0(new kt0(kt0.c(0.55f, kt0.b)), new kt0(F.b)), RecyclerView.B1, RecyclerView.B1, i4)), xq2Var, 0);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new rl(pq5Var, str, a74Var, i2, 20);
        }
    }

    public static final void e0(jt3 jt3Var, c37 c37Var, mk4 mk4Var) {
        qn2 qn2Var;
        vl6 t2 = ln2.t();
        if (t2 != null) {
            qn2Var = t2.e();
        } else {
            qn2Var = null;
        }
        qn2 qn2Var2 = qn2Var;
        vl6 N = ln2.N(t2);
        try {
            b47 d2 = jt3Var.d();
            if (d2 == null) {
                return;
            }
            t37 t37Var = jt3Var.e;
            if (t37Var == null) {
                return;
            }
            jk3 c2 = jt3Var.c();
            if (c2 == null) {
                return;
            }
            ej2.N(c37Var, jt3Var.a, d2.a, c2, t37Var, jt3Var.b(), mk4Var);
        } finally {
            ln2.V(t2, N, qn2Var2);
        }
    }

    public static final void f(e33 e33Var, on2 on2Var, a74 a74Var, px0 px0Var, int i2) {
        int i3;
        on2 on2Var2;
        boolean z;
        x64 x64Var;
        int i4;
        int i5;
        int i6;
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1857549676);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(e33Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.f(null)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            on2Var2 = on2Var;
            if (xq2Var.h(on2Var2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        } else {
            on2Var2 = on2Var;
        }
        int i7 = i3 | 3072;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i7 & 1, z)) {
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = i61.f(xq2Var);
            }
            r94 r94Var = (r94) P;
            qa4 a2 = bw7.a(r94Var, xq2Var, 6);
            es7 F = bl2.F(xq2Var);
            x64 x64Var2 = x64.a;
            a74 g2 = u24.g(dj6.i(x64Var2, 38.0f), z16.a);
            long c2 = kt0.c(0.28f, kt0.b);
            jy2 jy2Var = u24.m;
            a74 L = vy7.L(g2, c2, jy2Var);
            if (((Boolean) a2.getValue()).booleanValue()) {
                L = vy7.L(L, kt0.c(0.6f, F.j), jy2Var);
            }
            a74 t2 = mb3.t(L, r94Var, null, false, null, on2Var2, 28);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, t2);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            i13.a(e33Var, null, dj6.i(x64Var2, 20.0f), kt0.d, xq2Var, (i7 & 14) | 3456 | (i7 & 112), 0);
            xq2Var.p(true);
            x64Var = x64Var2;
        } else {
            xq2Var.V();
            x64Var = a74Var;
        }
        cf5 t3 = xq2Var.t();
        if (t3 != null) {
            t3.d = new rl(e33Var, on2Var, x64Var, i2, 21);
        }
    }

    public static final List f0(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return list;
            }
            return b0(list.get(0));
        }
        return yt1.A;
    }

    public static final void g(final pq5 pq5Var, final String str, final float f2, final long j2, final on2 on2Var, px0 px0Var, final int i2) {
        int i3;
        boolean z;
        x64 x64Var;
        a74 a74Var;
        vs0 vs0Var;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1222541722);
        if ((i2 & 6) == 0) {
            if (xq2Var.h(pq5Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.f(str)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.f(null)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var.c(f2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((196608 & i2) == 0) {
            if (xq2Var.h(on2Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        int i10 = i3;
        if ((66707 & i10) != 66706) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i10 & 1, z)) {
            Context context = (Context) xq2Var.j(kf.b);
            x64 x64Var2 = x64.a;
            a74 J = vy7.J(u24.g(nj2.E(ak7.H(dj6.l(x64Var2, f2), 1.117904f), 10.0f, z16.b(12.0f), false, 0L, 28), z16.b(12.0f)), l0(k0(pq5Var)));
            if (on2Var != null) {
                J = mb3.u(J, false, null, on2Var, 15);
            }
            e34 d2 = h70.d(d90.L, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, J);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, d2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            vs0 vs0Var2 = vs0.Y;
            if (str != null) {
                xq2Var.b0(-8384202);
                int i11 = 1573296 | ((i10 >> 3) & 14);
                x64Var = x64Var2;
                vs0Var = vs0Var2;
                gi2.b(str, null, dj6.c, y31.a, RecyclerView.B1, xq2Var, i11, 4024);
                xq2Var.p(false);
                i4 = 0;
                a74Var = null;
            } else {
                xq2Var.b0(-8154771);
                lc2 lc2Var = dj6.c;
                e34 d3 = h70.d(d90.Z, false);
                int hashCode2 = Long.hashCode(xq2Var.T);
                xv4 l3 = xq2Var.l();
                a74 E2 = l.E(xq2Var, lc2Var);
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar, d3);
                yh2.K(xq2Var, pnVar2, l3);
                i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
                yh2.K(xq2Var, pnVar4, E2);
                x64Var = x64Var2;
                a74Var = null;
                vs0Var = vs0Var2;
                gi2.b(m0(context, pq5Var), null, u24.g(dj6.i(x64Var2, 0.58f * f2), z16.b(12.0f)), y31.b, RecyclerView.B1, xq2Var, 1572912, 3512);
                xq2Var.p(true);
                i4 = 0;
                xq2Var.p(false);
            }
            r(a74Var, xq2Var, i4);
            if (str != null) {
                xq2Var.b0(-7533066);
                p(pq5Var, null, ge7.O(vs0Var.n(x64Var, d90.e0), 5.0f), 26.0f, xq2Var, (i10 & 14) | 3072 | ((i10 >> 3) & 112), 0);
                xq2Var = xq2Var;
                xq2Var.p(false);
            } else {
                xq2Var.b0(-7327102);
                xq2Var.p(false);
            }
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new eo2() { // from class: fx5
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hf.g(pq5.this, str, f2, j2, on2Var, (px0) obj, ii2.a0(i2 | 1));
                    return jg7.a;
                }
            };
        }
    }

    public static final void g0(float[] fArr, float[] fArr2) {
        float M = M(fArr2, 0, fArr, 0);
        float M2 = M(fArr2, 0, fArr, 1);
        float M3 = M(fArr2, 0, fArr, 2);
        float M4 = M(fArr2, 0, fArr, 3);
        float M5 = M(fArr2, 1, fArr, 0);
        float M6 = M(fArr2, 1, fArr, 1);
        float M7 = M(fArr2, 1, fArr, 2);
        float M8 = M(fArr2, 1, fArr, 3);
        float M9 = M(fArr2, 2, fArr, 0);
        float M10 = M(fArr2, 2, fArr, 1);
        float M11 = M(fArr2, 2, fArr, 2);
        float M12 = M(fArr2, 2, fArr, 3);
        float M13 = M(fArr2, 3, fArr, 0);
        float M14 = M(fArr2, 3, fArr, 1);
        float M15 = M(fArr2, 3, fArr, 2);
        float M16 = M(fArr2, 3, fArr, 3);
        fArr[0] = M;
        fArr[1] = M2;
        fArr[2] = M3;
        fArr[3] = M4;
        fArr[4] = M5;
        fArr[5] = M6;
        fArr[6] = M7;
        fArr[7] = M8;
        fArr[8] = M9;
        fArr[9] = M10;
        fArr[10] = M11;
        fArr[11] = M12;
        fArr[12] = M13;
        fArr[13] = M14;
        fArr[14] = M15;
        fArr[15] = M16;
    }

    public static final void h(pq5 pq5Var, a74 a74Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        x64 x64Var;
        int i4;
        int i5;
        pq5Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-945795646);
        if ((i2 & 6) == 0) {
            if (xq2Var.c(50.0f)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.h(pq5Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i6 = i3 | RendererDebugBridge.CAPTURE_HEIGHT;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i6 & 1, z)) {
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = np2.Y(Boolean.FALSE);
                xq2Var.l0(P);
            }
            qa4 qa4Var = (qa4) P;
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = i61.f(xq2Var);
            }
            r94 r94Var = (r94) P2;
            qa4 a2 = bw7.a(r94Var, xq2Var, 6);
            es7 F = bl2.F(xq2Var);
            if (((Boolean) qa4Var.getValue()).booleanValue()) {
                xq2Var.b0(-1212295749);
                Object P3 = xq2Var.P();
                if (P3 == vs0Var) {
                    P3 = new oe4(qa4Var, 8);
                    xq2Var.l0(P3);
                }
                on2 on2Var = (on2) P3;
                Object P4 = xq2Var.P();
                if (P4 == vs0Var) {
                    P4 = new j4(qa4Var, 20);
                    xq2Var.l0(P4);
                }
                bl2.f(pq5Var, on2Var, (qn2) P4, xq2Var, ((i6 >> 3) & 14) | 432);
                xq2Var.p(false);
            } else {
                xq2Var.b0(-1212137184);
                xq2Var.p(false);
            }
            x64 x64Var2 = x64.a;
            a74 g2 = u24.g(dj6.i(x64Var2, 50.0f), z16.b(13.0f));
            long c2 = kt0.c(0.3f, kt0.b);
            jy2 jy2Var = u24.m;
            a74 L = vy7.L(g2, c2, jy2Var);
            if (((Boolean) a2.getValue()).booleanValue()) {
                L = vy7.L(L, kt0.c(0.5f, F.j), jy2Var);
            }
            a74 a74Var2 = L;
            Object P5 = xq2Var.P();
            if (P5 == vs0Var) {
                P5 = new oe4(qa4Var, 9);
                xq2Var.l0(P5);
            }
            a74 t2 = mb3.t(a74Var2, r94Var, null, false, null, (on2) P5, 28);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, t2);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            x64Var = x64Var2;
            i13.a(dt7.a(), "Netplay / NiFi", dj6.i(x64Var2, 22.0f), hv.c(4278248959L), xq2Var, 3504, 0);
            xq2Var.p(true);
        } else {
            xq2Var.V();
            x64Var = a74Var;
        }
        cf5 t3 = xq2Var.t();
        if (t3 != null) {
            t3.d = new hp(pq5Var, i2, 10, x64Var);
        }
    }

    public static final void h0(int i2, int i3) {
        if (i3 >= 0) {
            if (i3 <= i2) {
                return;
            }
            e41.q(xg6.m(i3, i2, "toIndex (", ") is greater than size (", ")."));
            return;
        }
        i.h(lb1.k("fromIndex (0) is greater than toIndex (", i3, ")."));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(String str, a74 a74Var, long j2, px0 px0Var, int i2, int i3) {
        int i4;
        a74 a74Var2;
        int i5;
        int i6;
        long j3;
        int i7;
        boolean z;
        a74 a74Var3;
        long j4;
        cf5 t2;
        a74 a74Var4;
        long j5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-977644555);
        if (xq2Var.f(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i8 = i4 | i2;
        int i9 = i3 & 2;
        if (i9 != 0) {
            i6 = i8 | 48;
            a74Var2 = a74Var;
        } else {
            a74Var2 = a74Var;
            if (xq2Var.f(a74Var2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i6 = i8 | i5;
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i6 |= RendererDebugBridge.CAPTURE_HEIGHT;
        } else if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            j3 = j2;
            if (xq2Var.e(j3)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
            if ((i6 & 147) == 146) {
                z = true;
            } else {
                z = false;
            }
            if (!xq2Var.S(i6 & 1, z)) {
                if (i9 != 0) {
                    a74Var4 = x64.a;
                } else {
                    a74Var4 = a74Var2;
                }
                if (i10 != 0) {
                    j5 = hi2.E(8);
                } else {
                    j5 = j3;
                }
                a74 P = ge7.P(vy7.L(u24.g(a74Var4, z16.b(3.0f)), kt0.c(0.55f, kt0.b), u24.m), 4.0f, 1.5f);
                e34 d2 = h70.d(d90.L, false);
                int hashCode = Long.hashCode(xq2Var.T);
                xv4 l2 = xq2Var.l();
                a74 E = l.E(xq2Var, P);
                jx0.i.getClass();
                iy0 iy0Var = ix0.b;
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, ix0.f, d2);
                yh2.K(xq2Var, ix0.e, l2);
                yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                yh2.F(xq2Var, ix0.h);
                yh2.K(xq2Var, ix0.d, E);
                sr2 sr2Var = qs7.c;
                hi2.v(j5);
                long j6 = j5;
                x37.b(str, null, kt0.d, j6, oj2.e0, sr2Var, hi2.D(0.5d), null, hi2.J(x47.c(j5) * 1.15f, 1095216660480L & j5), 0, false, 0, 0, null, null, xq2Var, (i6 & 14) | 14352768 | ((i6 << 3) & 7168), 0, 129810);
                xq2Var.p(true);
                a74Var3 = a74Var4;
                j4 = j6;
            } else {
                xq2Var.V();
                a74Var3 = a74Var2;
                j4 = j3;
            }
            t2 = xq2Var.t();
            if (t2 == null) {
                t2.d = new o17(str, a74Var3, j4, i2, i3);
                return;
            }
            return;
        }
        j3 = j2;
        if ((i6 & 147) == 146) {
        }
        if (!xq2Var.S(i6 & 1, z)) {
        }
        t2 = xq2Var.t();
        if (t2 == null) {
        }
    }

    public static final void i0(pk6 pk6Var, int i2, Object obj) {
        int h2 = pk6Var.h(i2);
        Object[] objArr = pk6Var.c;
        Object obj2 = objArr[h2];
        objArr[h2] = ox0.a;
        if (obj == obj2) {
            return;
        }
        tx0.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void j(on2 on2Var, a74 a74Var, nh2 nh2Var, px0 px0Var, int i2) {
        int i3;
        on2 on2Var2;
        boolean z;
        float f2;
        int i4;
        int i5;
        int i6;
        int i7;
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(129269547);
        if ((i2 & 6) == 0) {
            if (xq2Var.c(50.0f)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            on2Var2 = on2Var;
            if (xq2Var.h(on2Var2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        } else {
            on2Var2 = on2Var;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.f(a74Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var.f(nh2Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            es7 F = bl2.F(xq2Var);
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = i61.f(xq2Var);
            }
            r94 r94Var = (r94) P;
            qa4 a2 = bw7.a(r94Var, xq2Var, 6);
            y16 b2 = z16.b(13.0f);
            a74 e2 = dj6.e(a74Var, 50.0f);
            if (((Boolean) a2.getValue()).booleanValue()) {
                f2 = 16.0f;
            } else {
                f2 = 8.0f;
            }
            a74 L = vy7.L(u24.g(nj2.E(e2, f2, b2, false, F.k, 12), b2), F.j, u24.m);
            if (nh2Var != null) {
                L = ak7.S(L, nh2Var);
            }
            a74 t2 = mb3.t(L, r94Var, null, false, null, on2Var2, 28);
            l26 a3 = k26.a(ju.d, d90.i0, xq2Var, 54);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, t2);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a3);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            e33 H = gi2.H();
            long j2 = kt0.d;
            x64 x64Var = x64.a;
            i13.a(H, null, dj6.i(x64Var, 19.0f), j2, xq2Var, 3504, 0);
            gi2.h(xq2Var, dj6.l(x64Var, 9.0f));
            String upperCase = yh2.O(xq2Var, R.string.play).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            x37.b(upperCase, null, j2, hi2.E(14), oj2.d0, qs7.a, hi2.D(0.3d), null, 0L, 0, false, 0, 0, null, null, xq2Var, 14355840, 0, 130834);
            xq2Var = xq2Var;
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t3 = xq2Var.t();
        if (t3 != null) {
            t3.d = new rl(on2Var, a74Var, nh2Var, i2, 22);
        }
    }

    public static final vr4 j0(pq5 pq5Var) {
        pq5Var.getClass();
        String str = pq5Var.c;
        String str2 = pq5Var.a;
        String lastPathSegment = pq5Var.d.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        for (String str3 : c0(str, str2, lastPathSegment)) {
            String upperCase = str3.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (G(upperCase, "(USA", "[USA", " (U)", " [U]", "(US)", "[US]", " USA.", " USA ", "_USA_", "-USA-", "(USA,", "[USA,", "(EN,JA,FR,DE,ES,IT)", "(EN,ES)", "(EN,FR)")) {
                return new vr4("🇺🇸", "USA");
            }
            if (G(upperCase, "(EUROPE", "[EUROPE", "(EUR", "[EUR", " (E)", " [E]", "(EU)", "[EU]", " EUR.", " EUR ", "_EUR_", "-EUR-", "(EN)", "[EN]", "(EN,", "[EN,", "EUROPEAN", "PAL")) {
                return new vr4("🇪🇺", "EUR");
            }
            if (G(upperCase, "(JAPAN", "[JAPAN", "(JAP", "[JAP", "(JPN", "[JPN", " (J)", " [J]", "(JP)", "[JP]", " JPN.", " JPN ", "_JPN_", "-JPN-", "NTSC-J")) {
                return new vr4("🇯🇵", "JPN");
            }
            if (G(upperCase, "(KOREA", "[KOREA", "(KOR", "[KOR", " (K)", " [K]", "(KO)", "[KO]", " KOR.", " KOR ")) {
                return new vr4("🇰🇷", "KOR");
            }
            if (G(upperCase, "(CHINA", "[CHINA", "(CHN", "[CHN", " (C)", " [C]", "(ZH)", "[ZH]", " CHN.", " CHN ")) {
                return new vr4("🇨🇳", "CHN");
            }
            if (G(upperCase, "(GERMANY", "[GERMANY", "(GER", "[GER", " (DE)", " [DE]", "(DE,", "[DE,")) {
                return new vr4("🇩🇪", "GER");
            }
            if (G(upperCase, "(FRANCE", "[FRANCE", "(FRA", "[FRA", " (FR)", " [FR]", "(FR,", "[FR,")) {
                return new vr4("🇫🇷", "FRA");
            }
            if (G(upperCase, "(ITALY", "[ITALY", "(ITA", "[ITA", " (IT)", " [IT]", "(IT,", "[IT,")) {
                return new vr4("🇮🇹", "ITA");
            }
            if (G(upperCase, "(SPAIN", "[SPAIN", "(SPA", "[SPA", " (ES)", " [ES]", "(ES,", "[ES,")) {
                return new vr4("🇪🇸", "SPA");
            }
            if (G(upperCase, "(RUSSIA", "[RUSSIA", "(RUS", "[RUS", " (RU)", " [RU]", "(RU,", "[RU,")) {
                return new vr4("🇷🇺", "RUS");
            }
            if (G(upperCase, "(AUSTRALIA", "[AUSTRALIA", "(AUS", "[AUS", " (AU)", " [AU]")) {
                return new vr4("🇦🇺", "AUS");
            }
            if (G(upperCase, "(WORLD", "[WORLD", "(GLOBAL", "[GLOBAL", "(WLD", "[WLD", " (W)", " [W]")) {
                return new vr4("🌐", "WLD");
            }
        }
        return new vr4("🌐", "DS");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(String str, String str2, a74 a74Var, px0 px0Var, int i2, int i3) {
        int i4;
        int i5;
        a74 a74Var2;
        int i6;
        boolean z;
        xq2 xq2Var;
        a74 a74Var3;
        cf5 t2;
        x64 x64Var;
        str.getClass();
        str2.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-52856312);
        if (xq2Var2.f(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i7 = i4 | i2;
        if (xq2Var2.f(str2)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i8 = i7 | i5;
        int i9 = i3 & 4;
        if (i9 != 0) {
            i8 |= RendererDebugBridge.CAPTURE_HEIGHT;
        } else if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            a74Var2 = a74Var;
            if (xq2Var2.f(a74Var2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i8 |= i6;
            if ((i8 & 147) == 146) {
                z = true;
            } else {
                z = false;
            }
            if (!xq2Var2.S(i8 & 1, z)) {
                x64 x64Var2 = x64.a;
                if (i9 != 0) {
                    x64Var = x64Var2;
                } else {
                    x64Var = a74Var2;
                }
                d40 d40Var = d90.i0;
                a74 P = ge7.P(vy7.L(u24.g(x64Var, z16.b(4.0f)), kt0.c(0.4f, kt0.b), u24.m), 4.5f, 2.0f);
                l26 a2 = k26.a(ju.a, d40Var, xq2Var2, 48);
                int hashCode = Long.hashCode(xq2Var2.T);
                xv4 l2 = xq2Var2.l();
                a74 E = l.E(xq2Var2, P);
                jx0.i.getClass();
                iy0 iy0Var = ix0.b;
                xq2Var2.f0();
                if (xq2Var2.S) {
                    xq2Var2.k(iy0Var);
                } else {
                    xq2Var2.o0();
                }
                yh2.K(xq2Var2, ix0.f, a2);
                yh2.K(xq2Var2, ix0.e, l2);
                yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode));
                yh2.F(xq2Var2, ix0.h);
                yh2.K(xq2Var2, ix0.d, E);
                a74 a74Var4 = x64Var;
                x37.b(str, null, 0L, hi2.D(10.5d), null, null, 0L, null, hi2.E(11), 0, false, 0, 0, null, null, xq2Var2, (i8 & 14) | 3072, 6, 130038);
                gi2.h(xq2Var2, dj6.l(x64Var2, 3.0f));
                x37.b(str2, null, hv.c(4293060848L), hi2.E(8), oj2.e0, qs7.c, hi2.D(0.5d), null, hi2.E(9), 0, false, 0, 0, null, null, xq2Var2, ((i8 >> 3) & 14) | 14355840, 6, 129810);
                xq2Var = xq2Var2;
                xq2Var.p(true);
                a74Var3 = a74Var4;
            } else {
                xq2Var = xq2Var2;
                xq2Var.V();
                a74Var3 = a74Var2;
            }
            t2 = xq2Var.t();
            if (t2 == null) {
                t2.d = new g4(str, str2, a74Var3, i2, i3, 2);
                return;
            }
            return;
        }
        a74Var2 = a74Var;
        if ((i8 & 147) == 146) {
        }
        if (!xq2Var2.S(i8 & 1, z)) {
        }
        t2 = xq2Var.t();
        if (t2 == null) {
        }
    }

    public static final String k0(pq5 pq5Var) {
        pq5Var.getClass();
        String str = pq5Var.a;
        String str2 = pq5Var.f.e;
        if (str2 != null && !qs6.v0(str2)) {
            String str3 = pq5Var.f.e;
            str3.getClass();
            return str3;
        } else if (gi2.c.equals("internal_name") && !qs6.v0(str)) {
            return str;
        } else {
            String str4 = pq5Var.c;
            String R0 = qs6.R0('.', str4, str4);
            if (!qs6.v0(R0)) {
                return R0;
            }
            return str;
        }
    }

    public static final void l(vv5 vv5Var, qn2 qn2Var, a74 a74Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        x64 x64Var;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        boolean z4;
        es7 es7Var;
        long j2;
        long j3;
        qn2 qn2Var2 = qn2Var;
        jy2 jy2Var = u24.m;
        c40 c40Var = d90.k0;
        vv5Var.getClass();
        qn2Var2.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1118519960);
        if (xq2Var.d(vv5Var.ordinal())) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (xq2Var.h(qn2Var2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4 | RendererDebugBridge.CAPTURE_HEIGHT;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i8 & 1, z)) {
            es7 F = bl2.F(xq2Var);
            x64 x64Var2 = x64.a;
            a74 L = vy7.L(dj6.c(x64Var2, 1.0f), F.b, jy2Var);
            eu euVar = ju.c;
            yt0 a2 = wt0.a(euVar, c40Var, xq2Var, 0);
            es7 es7Var2 = F;
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, L);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, a2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            int i9 = i8;
            gu guVar = new gu(16.0f, true, new i(1));
            jy2 jy2Var2 = jy2Var;
            a74 Q = ge7.Q(nb3.W(dj6.c(x64Var2, 1.0f), nb3.U(xq2Var), false), 16.0f, RecyclerView.B1, 2);
            l26 a3 = k26.a(guVar, d90.h0, xq2Var, 6);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E2 = l.E(xq2Var, Q);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a3);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            xq2Var.b0(-1278722642);
            Iterator it = vv5.getEntries().iterator();
            while (it.hasNext()) {
                vv5 vv5Var2 = (vv5) it.next();
                int i10 = hx5.a[vv5Var2.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                i5 = 1417562667;
                                i6 = R.string.rom_details_offline_achievements_tab;
                                z2 = false;
                            } else {
                                throw xg6.f(xq2Var, 1417551835, false);
                            }
                        } else {
                            z2 = false;
                            i5 = 1417559261;
                            i6 = R.string.retro_achievements_tab;
                        }
                    } else {
                        z2 = false;
                        i5 = 1417556429;
                        i6 = R.string.cheats;
                    }
                } else {
                    z2 = false;
                    i5 = 1417553284;
                    i6 = R.string.rom_details_configuration_tab;
                }
                String l4 = i61.l(xq2Var, i5, i6, xq2Var, z2);
                if (vv5Var2 == vv5Var) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object P = xq2Var.P();
                vs0 vs0Var = ox0.a;
                if (P == vs0Var) {
                    P = i61.f(xq2Var);
                }
                r94 r94Var = (r94) P;
                qa4 a4 = bw7.a(r94Var, xq2Var, 6);
                a74 Y = g04.Y(x64Var2, gb3.Max);
                if ((i9 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean d2 = z4 | xq2Var.d(vv5Var2.ordinal());
                Object P2 = xq2Var.P();
                if (d2 || P2 == vs0Var) {
                    P2 = new ci2(24, qn2Var2, vv5Var2);
                    xq2Var.l0(P2);
                }
                a74 t2 = mb3.t(Y, r94Var, null, false, null, (on2) P2, 28);
                yt0 a5 = wt0.a(euVar, c40Var, xq2Var, 0);
                int hashCode3 = Long.hashCode(xq2Var.T);
                xv4 l5 = xq2Var.l();
                a74 E3 = l.E(xq2Var, t2);
                jx0.i.getClass();
                iy0 iy0Var2 = ix0.b;
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var2);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, ix0.f, a5);
                yh2.K(xq2Var, ix0.e, l5);
                yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode3));
                yh2.F(xq2Var, ix0.h);
                yh2.K(xq2Var, ix0.d, E3);
                String upperCase = l4.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                if (((Boolean) a4.getValue()).booleanValue()) {
                    es7Var = es7Var2;
                    j2 = es7Var.j;
                } else {
                    es7Var = es7Var2;
                    if (z3) {
                        j2 = es7Var.g;
                    } else {
                        j2 = es7Var.i;
                    }
                }
                eu euVar2 = euVar;
                es7 es7Var3 = es7Var;
                int i11 = i9;
                xq2 xq2Var2 = xq2Var;
                Iterator it2 = it;
                c40 c40Var2 = c40Var;
                x64 x64Var3 = x64Var2;
                x37.b(upperCase, ge7.S(x64Var2, RecyclerView.B1, 12.0f, RecyclerView.B1, 10.0f, 5), j2, hi2.E(10), oj2.d0, qs7.c, hi2.D(0.7d), null, 0L, 0, false, 1, 0, null, null, xq2Var2, 14355504, 3456, 118544);
                xq2Var = xq2Var2;
                a74 e2 = dj6.e(dj6.c(x64Var3, 1.0f), 2.0f);
                if (z3) {
                    j3 = es7Var3.l;
                } else {
                    j3 = kt0.g;
                }
                jy2 jy2Var3 = jy2Var2;
                h70.a(vy7.L(e2, j3, jy2Var3), xq2Var, 0);
                xq2Var.p(true);
                it = it2;
                es7Var2 = es7Var3;
                qn2Var2 = qn2Var;
                x64Var2 = x64Var3;
                jy2Var2 = jy2Var3;
                c40Var = c40Var2;
                euVar = euVar2;
                i9 = i11;
            }
            x64Var = x64Var2;
            xq2Var.p(false);
            xq2Var.p(true);
            h70.a(vy7.L(dj6.e(dj6.c(x64Var, 1.0f), 1.0f), es7Var2.f, jy2Var2), xq2Var, 0);
            xq2Var.p(true);
        } else {
            xq2Var.V();
            x64Var = a74Var;
        }
        cf5 t3 = xq2Var.t();
        if (t3 != null) {
            t3.d = new x3(vv5Var, qn2Var, x64Var, i2, 29);
        }
    }

    public static final bv3 l0(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        int i2 = kt0.i;
        return new bv3(c0(new kt0(xd5.r(Math.abs(hashCode) % 360, 0.68f, 0.47f)), new kt0(xd5.r(Math.abs(hashCode / 360) % 360, 0.6f, 0.26f))), null, 0L, 9187343241974906880L, 0);
    }

    public static final void m(pq5 pq5Var, String str, nh2 nh2Var, on2 on2Var, on2 on2Var2, on2 on2Var3, on2 on2Var4, a74 a74Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        nh2 nh2Var2;
        xq2 xq2Var;
        pq5 pq5Var2;
        x64 x64Var;
        float f2;
        String str2;
        on2 on2Var5 = on2Var;
        on2 on2Var6 = on2Var4;
        pq5Var.getClass();
        long j2 = pq5Var.j;
        nh2Var.getClass();
        on2Var5.getClass();
        on2Var2.getClass();
        on2Var3.getClass();
        on2Var6.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(2084413518);
        if (xq2Var2.h(pq5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (xq2Var2.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (xq2Var2.f(null)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        if (xq2Var2.h(on2Var5)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (xq2Var2.h(on2Var2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7;
        if (xq2Var2.h(on2Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if (xq2Var2.h(on2Var6)) {
            i9 = 8388608;
        } else {
            i9 = Compress.MAXWINSIZE;
        }
        int i16 = i15 | i9 | 100663296;
        if ((38347923 & i16) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i16 & 1, z)) {
            Object P = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = np2.Y(Boolean.FALSE);
                xq2Var2.l0(P);
            }
            qa4 qa4Var = (qa4) P;
            if (((Boolean) qa4Var.getValue()).booleanValue()) {
                xq2Var2.b0(126341074);
                Object P2 = xq2Var2.P();
                if (P2 == vs0Var) {
                    P2 = new oe4(qa4Var, 11);
                    xq2Var2.l0(P2);
                }
                kn2.b(pq5Var, str, (on2) P2, xq2Var2, (i16 & 14) | RendererDebugBridge.CAPTURE_HEIGHT | (i16 & 112));
                xq2Var2.p(false);
            } else {
                xq2Var2.b0(126496756);
                xq2Var2.p(false);
            }
            x64 x64Var2 = x64.a;
            a74 b2 = dj6.b(dj6.l(x64Var2, 252.0f), 1.0f);
            e40 e40Var = d90.L;
            e34 d2 = h70.d(e40Var, false);
            int hashCode = Long.hashCode(xq2Var2.T);
            xv4 l2 = xq2Var2.l();
            a74 E = l.E(xq2Var2, b2);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var2, pnVar, d2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var2, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var2, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var2, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var2, pnVar4, E);
            int i17 = i16 & 14;
            int i18 = i16 & 112;
            e(pq5Var, str, vs0.Y.r(), xq2Var2, i16 & 126);
            a74 O = ge7.O(dj6.c, 16.0f);
            c40 c40Var = d90.k0;
            yt0 a2 = wt0.a(ju.e, c40Var, xq2Var2, 6);
            int hashCode2 = Long.hashCode(xq2Var2.T);
            xv4 l3 = xq2Var2.l();
            a74 E2 = l.E(xq2Var2, O);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, a2);
            yh2.K(xq2Var2, pnVar2, l3);
            i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E2);
            int i19 = i16 >> 9;
            f(jw2.q(), on2Var2, null, xq2Var2, (i19 & 896) | 48);
            a74 c2 = dj6.c(x64Var2, 1.0f);
            yt0 a3 = wt0.a(ju.c, d90.l0, xq2Var2, 48);
            int hashCode3 = Long.hashCode(xq2Var2.T);
            xv4 l4 = xq2Var2.l();
            a74 E3 = l.E(xq2Var2, c2);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, a3);
            yh2.K(xq2Var2, pnVar2, l4);
            i61.w(hashCode3, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E3);
            a74 P3 = ge7.P(vy7.L(u24.g(x64Var2, z16.b(5.0f)), kt0.c(0.45f, kt0.b), u24.m), 8.0f, 3.0f);
            e34 d3 = h70.d(e40Var, false);
            int hashCode4 = Long.hashCode(xq2Var2.T);
            xv4 l5 = xq2Var2.l();
            a74 E4 = l.E(xq2Var2, P3);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, d3);
            yh2.K(xq2Var2, pnVar2, l5);
            i61.w(hashCode4, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E4);
            String n0 = n0(pq5Var);
            long j3 = kt0.d;
            sr2 sr2Var = qs7.c;
            long E5 = hi2.E(9);
            long E6 = hi2.E(9);
            oj2 oj2Var = oj2.e0;
            x37.b(n0, null, j3, E5, oj2Var, sr2Var, 0L, null, E6, 0, false, 0, 0, null, null, xq2Var2, 1772928, 6, 129938);
            xq2Var2.p(true);
            gi2.h(xq2Var2, dj6.e(x64Var2, 8.0f));
            long E7 = hi2.E(22);
            Object P4 = xq2Var2.P();
            if (P4 == vs0Var) {
                P4 = new oe4(qa4Var, 12);
                xq2Var2.l0(P4);
            }
            g(pq5Var, str, 84.0f, E7, (on2) P4, xq2Var2, (i16 & 896) | i17 | 224256 | i18);
            xq2Var = xq2Var2;
            pq5Var2 = pq5Var;
            gi2.h(xq2Var, dj6.e(x64Var2, 8.0f));
            x37.b(k0(pq5Var2), null, j3, hi2.E(16), oj2Var, qs7.a, 0L, new wz6(3), hi2.E(19), 2, false, 3, 0, null, null, xq2Var, 1772928, 3126, 119186);
            if (!qs6.v0(pq5Var2.b)) {
                xq2Var.b0(-1439046280);
                x37.b(pq5Var2.b, ge7.S(x64Var2, RecyclerView.B1, 2.0f, RecyclerView.B1, RecyclerView.B1, 13), kt0.c(0.75f, j3), hi2.E(11), null, null, 0L, new wz6(3), 0L, 2, false, 1, 0, null, null, xq2Var, 3504, 3120, 120304);
                xq2Var.p(false);
            } else {
                xq2Var.b0(-1438615194);
                xq2Var.p(false);
            }
            vr4 j0 = j0(pq5Var2);
            xq2Var.b0(-1438508244);
            gi2.h(xq2Var, dj6.e(x64Var2, 6.0f));
            k((String) j0.A, (String) j0.B, null, xq2Var, 0, 4);
            xq2Var.p(false);
            if (!oq1.d(j2, 0L)) {
                xq2Var.b0(-1438270257);
                x64Var = x64Var2;
                f2 = 6.0f;
                x37.b(yh2.N(R.string.rom_total_play_time_format, new Object[]{P(j2)}, xq2Var), ge7.S(x64Var2, RecyclerView.B1, 6.0f, RecyclerView.B1, RecyclerView.B1, 13), kt0.c(0.75f, j3), hi2.D(10.5d), null, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1576368, 0, 130992);
                xq2Var.p(false);
            } else {
                x64Var = x64Var2;
                f2 = 6.0f;
                xq2Var.b0(-1437892026);
                xq2Var.p(false);
            }
            Object P5 = xq2Var.P();
            if (P5 == vs0Var) {
                P5 = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
                xq2Var.l0(P5);
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) P5;
            Date date = pq5Var2.g;
            if (date != null) {
                str2 = simpleDateFormat.format(date);
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = i61.l(xq2Var, 1893285603, R.string.rom_info_never, xq2Var, false);
            } else {
                xq2Var.b0(1893284084);
                xq2Var.p(false);
            }
            gi2.h(xq2Var, dj6.e(x64Var, f2));
            a74 c3 = dj6.c(x64Var, 1.0f);
            l26 a4 = k26.a(new gu(4.0f, true, new i(1)), d90.h0, xq2Var, 6);
            String str3 = str2;
            int hashCode5 = Long.hashCode(xq2Var.T);
            xv4 l6 = xq2Var.l();
            a74 E8 = l.E(xq2Var, c3);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a4);
            yh2.K(xq2Var, pnVar2, l6);
            i61.w(hashCode5, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E8);
            String O2 = yh2.O(xq2Var, R.string.rom_info_file);
            String str4 = pq5Var2.c;
            n26 n26Var = n26.a;
            o(O2, str4, n26Var.b(x64Var, 1.3f, true), 3, 5, c40Var, xq2Var, 199680, 0);
            o(yh2.O(xq2Var, R.string.rom_info_last_played), str3, n26Var.b(x64Var, 0.9f, true), 0, 0, null, xq2Var, 0, 56);
            xq2Var.p(true);
            xq2Var.p(true);
            a74 c4 = dj6.c(x64Var, 1.0f);
            l26 a5 = k26.a(new gu(6.0f, true, new i(1)), d90.i0, xq2Var, 54);
            int hashCode6 = Long.hashCode(xq2Var.T);
            xv4 l7 = xq2Var.l();
            a74 E9 = l.E(xq2Var, c4);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a5);
            yh2.K(xq2Var, pnVar2, l7);
            i61.w(hashCode6, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E9);
            nh2Var2 = nh2Var;
            on2Var5 = on2Var;
            j(on2Var5, n26Var.b(x64Var, 1.0f, true), nh2Var2, xq2Var, (i19 & 112) | 3078);
            h(pq5Var2, null, xq2Var, ((i16 << 3) & 112) | 6);
            int i20 = i16 >> 15;
            on2Var6 = on2Var4;
            q(on2Var3, on2Var6, null, xq2Var, (i20 & 896) | (i20 & 112) | 6);
            i61.y(xq2Var, true, true, true);
        } else {
            nh2Var2 = nh2Var;
            xq2Var = xq2Var2;
            pq5Var2 = pq5Var;
            xq2Var.V();
            x64Var = a74Var;
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new gx5(pq5Var2, str, nh2Var2, on2Var5, on2Var2, on2Var3, on2Var6, x64Var, i2, 1);
        }
    }

    public static final z23 m0(Context context, pq5 pq5Var) {
        context.getClass();
        pq5Var.getClass();
        x23 x23Var = new x23(context);
        x23Var.c = pq5Var;
        x23Var.f = new c44(xg6.n(pq5Var.d, "rom-icon:"));
        x23Var.b(false);
        return x23Var.a();
    }

    public static final void n(pq5 pq5Var, String str, nh2 nh2Var, on2 on2Var, on2 on2Var2, on2 on2Var3, on2 on2Var4, a74 a74Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        nh2 nh2Var2;
        xq2 xq2Var;
        on2 on2Var5;
        pq5 pq5Var2;
        boolean z2;
        x64 x64Var;
        String str2;
        String str3;
        on2 on2Var6 = on2Var;
        pq5Var.getClass();
        String str4 = pq5Var.i;
        long j2 = pq5Var.j;
        on2Var6.getClass();
        on2Var2.getClass();
        on2Var3.getClass();
        on2Var4.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-2076079537);
        if (xq2Var2.h(pq5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i11 = i2 | i3;
        if (xq2Var2.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i12 = i11 | i4;
        if (xq2Var2.f(null)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i13 = i12 | i5;
        if (xq2Var2.h(on2Var6)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i14 = i13 | i6;
        if (xq2Var2.h(on2Var2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i15 = i14 | i7;
        if (xq2Var2.h(on2Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i16 = i15 | i8;
        if (xq2Var2.h(on2Var4)) {
            i9 = 8388608;
        } else {
            i9 = Compress.MAXWINSIZE;
        }
        int i17 = i16 | i9;
        if (xq2Var2.f(a74Var)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i18 = i17 | i10;
        if ((38347923 & i18) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i18 & 1, z)) {
            Object P = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = np2.Y(Boolean.FALSE);
                xq2Var2.l0(P);
            }
            qa4 qa4Var = (qa4) P;
            if (((Boolean) qa4Var.getValue()).booleanValue()) {
                xq2Var2.b0(-956032463);
                Object P2 = xq2Var2.P();
                if (P2 == vs0Var) {
                    P2 = new oe4(qa4Var, 7);
                    xq2Var2.l0(P2);
                }
                kn2.b(pq5Var, str, (on2) P2, xq2Var2, (i18 & 14) | RendererDebugBridge.CAPTURE_HEIGHT | (i18 & 112));
                z2 = false;
                xq2Var2.p(false);
            } else {
                z2 = false;
                xq2Var2.b0(-955876781);
                xq2Var2.p(false);
            }
            a74 c2 = dj6.c(a74Var, 1.0f);
            e40 e40Var = d90.L;
            e34 d2 = h70.d(e40Var, z2);
            int hashCode = Long.hashCode(xq2Var2.T);
            xv4 l2 = xq2Var2.l();
            a74 E = l.E(xq2Var2, c2);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var2, pnVar, d2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var2, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var2, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var2, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var2, pnVar4, E);
            vs0 vs0Var2 = vs0.Y;
            int i19 = i18 & 14;
            int i20 = i18 & 112;
            e(pq5Var, str, vs0Var2.r(), xq2Var2, i18 & 126);
            x64 x64Var2 = x64.a;
            a74 S = ge7.S(vs0Var2.n(x64Var2, e40Var), 16.0f, 14.0f, RecyclerView.B1, RecyclerView.B1, 12);
            e34 d3 = h70.d(e40Var, false);
            int hashCode2 = Long.hashCode(xq2Var2.T);
            xv4 l3 = xq2Var2.l();
            a74 E2 = l.E(xq2Var2, S);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, d3);
            yh2.K(xq2Var2, pnVar2, l3);
            i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E2);
            int i21 = i18 >> 9;
            f(jw2.q(), on2Var2, null, xq2Var2, (i21 & 896) | 48);
            xq2Var2.p(true);
            a74 P3 = ge7.P(dj6.c(x64Var2, 1.0f), 16.0f, 14.0f);
            yt0 a2 = wt0.a(ju.c, d90.l0, xq2Var2, 48);
            int hashCode3 = Long.hashCode(xq2Var2.T);
            xv4 l4 = xq2Var2.l();
            a74 E3 = l.E(xq2Var2, P3);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, a2);
            yh2.K(xq2Var2, pnVar2, l4);
            i61.w(hashCode3, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E3);
            gi2.h(xq2Var2, dj6.e(x64Var2, 4.0f));
            a74 g2 = u24.g(x64Var2, z16.b(6.0f));
            int i22 = kt0.i;
            a74 P4 = ge7.P(vy7.L(g2, kt0.c(0.5f, kt0.b), u24.m), 10.0f, 3.5f);
            e34 d4 = h70.d(e40Var, false);
            int hashCode4 = Long.hashCode(xq2Var2.T);
            xv4 l5 = xq2Var2.l();
            a74 E4 = l.E(xq2Var2, P4);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, d4);
            yh2.K(xq2Var2, pnVar2, l5);
            i61.w(hashCode4, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E4);
            String n0 = n0(pq5Var);
            long j3 = kt0.d;
            sr2 sr2Var = qs7.c;
            long E5 = hi2.E(10);
            long E6 = hi2.E(10);
            oj2 oj2Var = oj2.e0;
            x37.b(n0, null, j3, E5, oj2Var, sr2Var, hi2.D(0.8d), null, E6, 0, false, 0, 0, null, null, xq2Var2, 14355840, 6, 129810);
            xq2Var2.p(true);
            gi2.h(xq2Var2, dj6.e(x64Var2, 10.0f));
            long E7 = hi2.E(36);
            Object P5 = xq2Var2.P();
            if (P5 == vs0Var) {
                P5 = new oe4(qa4Var, 10);
                xq2Var2.l0(P5);
            }
            g(pq5Var, str, 126.0f, E7, (on2) P5, xq2Var2, i19 | 224256 | i20 | (i18 & 896));
            xq2Var = xq2Var2;
            pq5Var2 = pq5Var;
            gi2.h(xq2Var, dj6.e(x64Var2, 12.0f));
            String k0 = k0(pq5Var2);
            pi2 pi2Var = qs7.a;
            x37.b(k0, dj6.c(x64Var2, 0.92f), j3, hi2.E(20), oj2Var, pi2Var, 0L, new wz6(3), hi2.E(24), 2, false, 3, 0, null, null, xq2Var, 1772976, 3126, 119184);
            if (!qs6.v0(pq5Var2.b)) {
                xq2Var.b0(-1204994524);
                String str5 = pq5Var2.b;
                long c3 = kt0.c(0.75f, j3);
                pi2 pi2Var2 = qs7.b;
                x64Var = x64Var2;
                x37.b(str5, ge7.S(x64Var2, RecyclerView.B1, 3.0f, RecyclerView.B1, RecyclerView.B1, 13), c3, hi2.E(12), null, pi2Var2, 0L, new wz6(3), 0L, 2, false, 1, 0, null, null, xq2Var, 1576368, 3120, 120240);
                xq2Var.p(false);
            } else {
                x64Var = x64Var2;
                xq2Var.b0(-1204531849);
                xq2Var.p(false);
            }
            gi2.h(xq2Var, dj6.e(x64Var, 8.0f));
            vr4 j0 = j0(pq5Var2);
            d40 d40Var = d90.i0;
            a74 c4 = dj6.c(x64Var, 1.0f);
            d90 d90Var = ju.d;
            x64 x64Var3 = x64Var;
            l26 a3 = k26.a(d90Var, d40Var, xq2Var, 54);
            int hashCode5 = Long.hashCode(xq2Var.T);
            xv4 l6 = xq2Var.l();
            a74 E8 = l.E(xq2Var, c4);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a3);
            yh2.K(xq2Var, pnVar2, l6);
            i61.w(hashCode5, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E8);
            xq2Var.b0(-2104459357);
            k((String) j0.A, (String) j0.B, ge7.S(x64Var3, RecyclerView.B1, RecyclerView.B1, 8.0f, RecyclerView.B1, 11), xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
            xq2Var.p(false);
            jd1 jd1Var = oq1.B;
            if (!oq1.d(j2, 0L)) {
                xq2Var.b0(-2104140801);
                x37.b(yh2.N(R.string.rom_total_play_time_format, new Object[]{P(j2)}, xq2Var), null, kt0.c(0.85f, j3), hi2.E(11), null, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1576320, 0, 130994);
                xq2Var.p(false);
            } else {
                xq2Var.b0(-2103826957);
                xq2Var.p(false);
            }
            xq2Var.p(true);
            gi2.h(xq2Var, dj6.e(x64Var3, 10.0f));
            Object P6 = xq2Var.P();
            if (P6 == vs0Var) {
                P6 = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
                xq2Var.l0(P6);
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) P6;
            Date date = pq5Var2.g;
            if (date != null) {
                str2 = simpleDateFormat.format(date);
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = i61.l(xq2Var, 1208115218, R.string.rom_info_never, xq2Var, false);
            } else {
                xq2Var.b0(1208113699);
                xq2Var.p(false);
            }
            if (!qs6.v0(str4)) {
                str3 = qs6.S0(8, str4).toUpperCase(Locale.ROOT);
                str3.getClass();
            } else {
                str3 = "NTR-ROM";
            }
            a74 c5 = dj6.c(x64Var3, 0.94f);
            l26 a4 = k26.a(new gu(6.0f, true, new i(1)), d90.h0, xq2Var, 6);
            int hashCode6 = Long.hashCode(xq2Var.T);
            xv4 l7 = xq2Var.l();
            a74 E9 = l.E(xq2Var, c5);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a4);
            yh2.K(xq2Var, pnVar2, l7);
            i61.w(hashCode6, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E9);
            String O = yh2.O(xq2Var, R.string.rom_info_file);
            String str6 = pq5Var2.c;
            c40 c40Var = d90.k0;
            n26 n26Var = n26.a;
            o(O, str6, n26Var.b(x64Var3, 1.3f, true), 3, 5, c40Var, xq2Var, 199680, 0);
            o(yh2.O(xq2Var, R.string.rom_info_last_played), str2, n26Var.b(x64Var3, 0.9f, true), 0, 0, null, xq2Var, 0, 56);
            o("ID / HASH", str3, n26Var.b(x64Var3, 0.8f, true), 0, 0, null, xq2Var, 6, 56);
            xq2Var.p(true);
            gi2.h(xq2Var, dj6.e(x64Var3, 12.0f));
            a74 c6 = dj6.c(x64Var3, 0.92f);
            l26 a5 = k26.a(d90Var, d40Var, xq2Var, 54);
            int hashCode7 = Long.hashCode(xq2Var.T);
            xv4 l8 = xq2Var.l();
            a74 E10 = l.E(xq2Var, c6);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a5);
            yh2.K(xq2Var, pnVar2, l8);
            i61.w(hashCode7, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E10);
            nh2Var2 = nh2Var;
            on2Var6 = on2Var;
            j(on2Var6, n26Var.b(x64Var3, 1.0f, true), nh2Var2, xq2Var, (i21 & 112) | 3078);
            gi2.h(xq2Var, dj6.l(x64Var3, 8.0f));
            h(pq5Var2, null, xq2Var, ((i18 << 3) & 112) | 6);
            gi2.h(xq2Var, dj6.l(x64Var3, 8.0f));
            int i23 = i18 >> 15;
            on2Var5 = on2Var4;
            q(on2Var3, on2Var5, null, xq2Var, (i23 & 896) | (i23 & 112) | 6);
            i61.y(xq2Var, true, true, true);
        } else {
            nh2Var2 = nh2Var;
            xq2Var = xq2Var2;
            on2Var5 = on2Var4;
            pq5Var2 = pq5Var;
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new gx5(pq5Var2, str, nh2Var2, on2Var6, on2Var2, on2Var3, on2Var5, a74Var, i2, 0);
        }
    }

    public static final String n0(pq5 pq5Var) {
        pq5Var.getClass();
        if (pq5Var.h) {
            return "DSi";
        }
        return "DS";
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(final String str, final String str2, final a74 a74Var, int i2, int i3, c40 c40Var, px0 px0Var, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        c40 c40Var2;
        int i15;
        boolean z;
        final int i16;
        final int i17;
        final c40 c40Var3;
        cf5 t2;
        c40 c40Var4;
        int i18;
        int i19;
        int i20;
        str.getClass();
        str2.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1195008272);
        if ((i4 & 6) == 0) {
            if (xq2Var.f(str)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i6 = i20 | i4;
        } else {
            i6 = i4;
        }
        if (xq2Var.f(str2)) {
            i7 = 32;
        } else {
            i7 = 16;
        }
        int i21 = i6 | i7;
        if (xq2Var.f(a74Var)) {
            i8 = 256;
        } else {
            i8 = 128;
        }
        int i22 = i21 | i8;
        int i23 = i5 & 8;
        if (i23 != 0) {
            i22 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i9 = i2;
            if (xq2Var.d(i9)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i22 |= i10;
            if ((i5 & 16) != 0) {
                i11 = i3;
                if (xq2Var.d(i11)) {
                    i12 = 16384;
                    i13 = i22 | i12;
                    i14 = i5 & 32;
                    if (i14 != 0) {
                        i13 |= 196608;
                    } else if ((196608 & i4) == 0) {
                        c40Var2 = c40Var;
                        if (xq2Var.f(c40Var2)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                        i13 |= i15;
                        if ((74899 & i13) == 74898) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!xq2Var.S(i13 & 1, z)) {
                            xq2Var.X();
                            if ((i4 & 1) != 0 && !xq2Var.B()) {
                                xq2Var.V();
                                if ((i5 & 16) != 0) {
                                    i13 &= -57345;
                                }
                            } else {
                                if (i23 != 0) {
                                    i9 = 1;
                                }
                                if ((i5 & 16) != 0) {
                                    i13 &= -57345;
                                    i11 = 3;
                                }
                                if (i14 != 0) {
                                    c40Var4 = d90.l0;
                                    int i24 = i11;
                                    i18 = i13;
                                    i19 = i24;
                                    xq2Var.q();
                                    a74 P = ge7.P(vy7.L(u24.g(a74Var, z16.b(8.0f)), kt0.c(0.38f, kt0.b), u24.m), 8.0f, 5.0f);
                                    yt0 a2 = wt0.a(ju.c, c40Var4, xq2Var, (((i18 >> 9) & 896) >> 3) & 112);
                                    int hashCode = Long.hashCode(xq2Var.T);
                                    xv4 l2 = xq2Var.l();
                                    a74 E = l.E(xq2Var, P);
                                    jx0.i.getClass();
                                    iy0 iy0Var = ix0.b;
                                    xq2Var.f0();
                                    if (!xq2Var.S) {
                                        xq2Var.k(iy0Var);
                                    } else {
                                        xq2Var.o0();
                                    }
                                    yh2.K(xq2Var, ix0.f, a2);
                                    yh2.K(xq2Var, ix0.e, l2);
                                    yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                                    yh2.F(xq2Var, ix0.h);
                                    yh2.K(xq2Var, ix0.d, E);
                                    String upperCase = str.toUpperCase(Locale.ROOT);
                                    upperCase.getClass();
                                    long j2 = kt0.d;
                                    long c2 = kt0.c(0.5f, j2);
                                    sr2 sr2Var = qs7.c;
                                    int i25 = i18;
                                    x37.b(upperCase, null, c2, hi2.D(8.5d), oj2.e0, sr2Var, hi2.D(0.4d), null, 0L, 0, false, 1, 0, null, null, xq2Var, 14355840, 3072, 122642);
                                    gi2.h(xq2Var, dj6.e(x64.a, 1.0f));
                                    int i26 = i9;
                                    x37.b(str2, null, kt0.c(0.95f, j2), hi2.D(9.5d), oj2.d0, sr2Var, 0L, new wz6(i19), hi2.D(11.5d), 2, false, i26, 0, null, null, xq2Var, ((i25 >> 3) & 14) | 1772928 | ((i25 << 15) & 1879048192), (i25 & 7168) | 54, 119186);
                                    xq2Var = xq2Var;
                                    xq2Var.p(true);
                                    c40Var3 = c40Var4;
                                    i16 = i26;
                                    i17 = i19;
                                }
                            }
                            int i27 = i11;
                            i18 = i13;
                            i19 = i27;
                            c40Var4 = c40Var2;
                            xq2Var.q();
                            a74 P2 = ge7.P(vy7.L(u24.g(a74Var, z16.b(8.0f)), kt0.c(0.38f, kt0.b), u24.m), 8.0f, 5.0f);
                            yt0 a22 = wt0.a(ju.c, c40Var4, xq2Var, (((i18 >> 9) & 896) >> 3) & 112);
                            int hashCode2 = Long.hashCode(xq2Var.T);
                            xv4 l22 = xq2Var.l();
                            a74 E2 = l.E(xq2Var, P2);
                            jx0.i.getClass();
                            iy0 iy0Var2 = ix0.b;
                            xq2Var.f0();
                            if (!xq2Var.S) {
                            }
                            yh2.K(xq2Var, ix0.f, a22);
                            yh2.K(xq2Var, ix0.e, l22);
                            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode2));
                            yh2.F(xq2Var, ix0.h);
                            yh2.K(xq2Var, ix0.d, E2);
                            String upperCase2 = str.toUpperCase(Locale.ROOT);
                            upperCase2.getClass();
                            long j22 = kt0.d;
                            long c22 = kt0.c(0.5f, j22);
                            sr2 sr2Var2 = qs7.c;
                            int i252 = i18;
                            x37.b(upperCase2, null, c22, hi2.D(8.5d), oj2.e0, sr2Var2, hi2.D(0.4d), null, 0L, 0, false, 1, 0, null, null, xq2Var, 14355840, 3072, 122642);
                            gi2.h(xq2Var, dj6.e(x64.a, 1.0f));
                            int i262 = i9;
                            x37.b(str2, null, kt0.c(0.95f, j22), hi2.D(9.5d), oj2.d0, sr2Var2, 0L, new wz6(i19), hi2.D(11.5d), 2, false, i262, 0, null, null, xq2Var, ((i252 >> 3) & 14) | 1772928 | ((i252 << 15) & 1879048192), (i252 & 7168) | 54, 119186);
                            xq2Var = xq2Var;
                            xq2Var.p(true);
                            c40Var3 = c40Var4;
                            i16 = i262;
                            i17 = i19;
                        } else {
                            xq2Var.V();
                            i16 = i9;
                            i17 = i11;
                            c40Var3 = c40Var2;
                        }
                        t2 = xq2Var.t();
                        if (t2 == null) {
                            t2.d = new eo2() { // from class: ex5
                                @Override // defpackage.eo2
                                public final Object o(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    hf.o(str, str2, a74Var, i16, i17, c40Var3, (px0) obj, ii2.a0(i4 | 1), i5);
                                    return jg7.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    c40Var2 = c40Var;
                    if ((74899 & i13) == 74898) {
                    }
                    if (!xq2Var.S(i13 & 1, z)) {
                    }
                    t2 = xq2Var.t();
                    if (t2 == null) {
                    }
                }
            } else {
                i11 = i3;
            }
            i12 = 8192;
            i13 = i22 | i12;
            i14 = i5 & 32;
            if (i14 != 0) {
            }
            c40Var2 = c40Var;
            if ((74899 & i13) == 74898) {
            }
            if (!xq2Var.S(i13 & 1, z)) {
            }
            t2 = xq2Var.t();
            if (t2 == null) {
            }
        }
        i9 = i2;
        if ((i5 & 16) != 0) {
        }
        i12 = 8192;
        i13 = i22 | i12;
        i14 = i5 & 32;
        if (i14 != 0) {
        }
        c40Var2 = c40Var;
        if ((74899 & i13) == 74898) {
        }
        if (!xq2Var.S(i13 & 1, z)) {
        }
        t2 = xq2Var.t();
        if (t2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [dh5, java.lang.Object] */
    public static final void o0(o37 o37Var, jt3 jt3Var, c37 c37Var, l33 l33Var, mk4 mk4Var) {
        yc1 yc1Var = jt3Var.d;
        w51 w51Var = jt3Var.v;
        w51 w51Var2 = jt3Var.w;
        ?? obj = new Object();
        t00 t00Var = new t00(yc1Var, w51Var, (Object) obj, 28);
        gy4 gy4Var = o37Var.a;
        gy4Var.e(c37Var, l33Var, t00Var, w51Var2);
        t37 t37Var = new t37(o37Var, gy4Var);
        o37Var.b.set(t37Var);
        obj.A = t37Var;
        jt3Var.e = t37Var;
        e0(jt3Var, c37Var, mk4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(final pq5 pq5Var, final String str, final a74 a74Var, float f2, px0 px0Var, final int i2, final int i3) {
        int i4;
        float f3;
        int i5;
        boolean z;
        final float f4;
        cf5 t2;
        float f5;
        int i6;
        int i7;
        pq5Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-686717490);
        if ((i2 & 6) == 0) {
            if (xq2Var.h(pq5Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i4 = i7 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.f(a74Var)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i4 |= i6;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            f3 = f2;
            if (xq2Var.c(f3)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i4 |= i5;
            if ((i4 & 1155) == 1154) {
                z = true;
            } else {
                z = false;
            }
            if (!xq2Var.S(i4 & 1, z)) {
                if (i8 != 0) {
                    f5 = 22.0f;
                } else {
                    f5 = f3;
                }
                String k0 = k0(pq5Var);
                Context context = (Context) xq2Var.j(kf.b);
                a74 J = vy7.J(u24.g(dj6.i(a74Var, f5), z16.a), l0(k0));
                e34 d2 = h70.d(d90.Z, false);
                int hashCode = Long.hashCode(xq2Var.T);
                xv4 l2 = xq2Var.l();
                a74 E = l.E(xq2Var, J);
                jx0.i.getClass();
                iy0 iy0Var = ix0.b;
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, ix0.f, d2);
                yh2.K(xq2Var, ix0.e, l2);
                yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                yh2.F(xq2Var, ix0.h);
                yh2.K(xq2Var, ix0.d, E);
                gi2.b(m0(context, pq5Var), null, dj6.c, y31.a, RecyclerView.B1, xq2Var, 1573296, 3512);
                xq2Var.p(true);
                f4 = f5;
            } else {
                xq2Var.V();
                f4 = f3;
            }
            t2 = xq2Var.t();
            if (t2 == null) {
                t2.d = new eo2() { // from class: ns7
                    @Override // defpackage.eo2
                    public final Object o(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        hf.p(pq5.this, str, a74Var, f4, (px0) obj, ii2.a0(i2 | 1), i3);
                        return jg7.a;
                    }
                };
                return;
            }
            return;
        }
        f3 = f2;
        if ((i4 & 1155) == 1154) {
        }
        if (!xq2Var.S(i4 & 1, z)) {
        }
        t2 = xq2Var.t();
        if (t2 == null) {
        }
    }

    public static void p0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void q(on2 on2Var, on2 on2Var2, a74 a74Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        on2 on2Var3;
        x64 x64Var;
        int i4;
        int i5;
        int i6;
        on2Var.getClass();
        on2Var2.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-913331571);
        if ((i2 & 6) == 0) {
            if (xq2Var.c(50.0f)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.h(on2Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(on2Var2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        int i7 = i3 | 3072;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i7 & 1, z)) {
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = np2.Y(Boolean.FALSE);
                xq2Var.l0(P);
            }
            qa4 qa4Var = (qa4) P;
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = i61.f(xq2Var);
            }
            r94 r94Var = (r94) P2;
            qa4 a2 = bw7.a(r94Var, xq2Var, 6);
            es7 F = bl2.F(xq2Var);
            e34 d2 = h70.d(d90.L, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            x64 x64Var2 = x64.a;
            a74 E = l.E(xq2Var, x64Var2);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, d2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            a74 g2 = u24.g(dj6.i(x64Var2, 50.0f), z16.b(13.0f));
            long c2 = kt0.c(0.3f, kt0.b);
            jy2 jy2Var = u24.m;
            a74 L = vy7.L(g2, c2, jy2Var);
            if (((Boolean) a2.getValue()).booleanValue()) {
                L = vy7.L(L, kt0.c(0.5f, F.j), jy2Var);
            }
            a74 a74Var2 = L;
            Object P3 = xq2Var.P();
            if (P3 == vs0Var) {
                P3 = new oe4(qa4Var, 13);
                xq2Var.l0(P3);
            }
            a74 t2 = mb3.t(a74Var2, r94Var, null, false, null, (on2) P3, 28);
            e34 d3 = h70.d(d90.Z, false);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E2 = l.E(xq2Var, t2);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d3);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            i13.a(kj2.C(), null, dj6.i(x64Var2, 20.0f), kt0.d, xq2Var, 3504, 0);
            xq2Var.p(true);
            boolean booleanValue = ((Boolean) qa4Var.getValue()).booleanValue();
            Object P4 = xq2Var.P();
            if (P4 == vs0Var) {
                P4 = new oe4(qa4Var, 14);
                xq2Var.l0(P4);
            }
            on2Var3 = on2Var;
            x64Var = x64Var2;
            ti.a(booleanValue, (on2) P4, null, 0L, null, null, n16.I(1640875462, new r00(on2Var3, on2Var2, qa4Var, 2), xq2Var), xq2Var, 1572912);
            xq2Var.p(true);
        } else {
            on2Var3 = on2Var;
            xq2Var.V();
            x64Var = a74Var;
        }
        cf5 t3 = xq2Var.t();
        if (t3 != null) {
            t3.d = new rl(on2Var3, on2Var2, x64Var, i2, 19);
        }
    }

    public static void q0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final void r(a74 a74Var, px0 px0Var, int i2) {
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-975475133);
        int i3 = i2 | 6;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            h70.a(vy7.J(dj6.c, d90.m(c0(new kt0(kt0.g), new kt0(kt0.c(0.12f, kt0.b))), RecyclerView.B1, RecyclerView.B1, 14)), xq2Var, 0);
            a74Var = x64.a;
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new v00(a74Var, i2, 5);
        }
    }

    public static final za2 r0(File file) {
        List list;
        String path = file.getPath();
        path.getClass();
        int W = W(path);
        String substring = path.substring(0, W);
        String substring2 = path.substring(W);
        if (substring2.length() == 0) {
            list = yt1.A;
        } else {
            List<String> J0 = qs6.J0(substring2, new char[]{File.separatorChar}, 6);
            ArrayList arrayList = new ArrayList(ht0.v0(J0, 10));
            for (String str : J0) {
                arrayList.add(new File(str));
            }
            list = arrayList;
        }
        return new za2(new File(substring), list);
    }

    public static final void s(p27 p27Var, boolean z, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        b47 d2;
        boolean z3;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(626339208);
        if (xq2Var.h(p27Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (xq2Var.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i6 & 1, z2)) {
            if (z) {
                xq2Var.b0(1530097388);
                jt3 jt3Var = p27Var.d;
                a47 a47Var = null;
                if (jt3Var != null && (d2 = jt3Var.d()) != null) {
                    a47 a47Var2 = d2.a;
                    jt3 jt3Var2 = p27Var.d;
                    if (jt3Var2 != null) {
                        z3 = jt3Var2.p;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        a47Var = a47Var2;
                    }
                }
                if (a47Var == null) {
                    xq2Var.b0(1530097387);
                    xq2Var.p(false);
                } else {
                    xq2Var.b0(1530097388);
                    if (!k47.c(p27Var.n().b)) {
                        xq2Var.b0(2109807302);
                        int s2 = p27Var.b.s((int) (p27Var.n().b >> 32));
                        int s3 = p27Var.b.s((int) (p27Var.n().b & 4294967295L));
                        jl5 a2 = a47Var.a(s2);
                        jl5 a3 = a47Var.a(Math.max(s3 - 1, 0));
                        jt3 jt3Var3 = p27Var.d;
                        if (jt3Var3 != null && ((Boolean) jt3Var3.m.getValue()).booleanValue()) {
                            xq2Var.b0(2110225306);
                            bl2.k(true, a2, p27Var, xq2Var, ((i6 << 6) & 896) | 6);
                            xq2Var.p(false);
                        } else {
                            xq2Var.b0(2110490542);
                            xq2Var.p(false);
                        }
                        jt3 jt3Var4 = p27Var.d;
                        if (jt3Var4 != null && ((Boolean) jt3Var4.n.getValue()).booleanValue()) {
                            xq2Var.b0(2110574459);
                            bl2.k(false, a3, p27Var, xq2Var, ((i6 << 6) & 896) | 6);
                            xq2Var.p(false);
                        } else {
                            xq2Var.b0(2110838734);
                            xq2Var.p(false);
                        }
                        xq2Var.p(false);
                    } else {
                        xq2Var.b0(2110860558);
                        xq2Var.p(false);
                    }
                    jt3 jt3Var5 = p27Var.d;
                    if (jt3Var5 != null) {
                        vs4 vs4Var = jt3Var5.l;
                        if (!nb3.k(p27Var.u.a.B, p27Var.n().a.B)) {
                            vs4Var.setValue(Boolean.FALSE);
                        }
                        if (jt3Var5.b()) {
                            if (((Boolean) vs4Var.getValue()).booleanValue()) {
                                p27Var.r();
                            } else {
                                p27Var.o();
                            }
                        }
                    }
                    xq2Var.p(false);
                }
                xq2Var.p(false);
            } else {
                xq2Var.b0(1989076778);
                xq2Var.p(false);
                p27Var.o();
            }
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new v51(p27Var, z, i2);
        }
    }

    public static final String s0(byte b2) {
        char[] cArr = l.a;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final void t(p27 p27Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        fp m2;
        b47 b47Var;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1436003720);
        if (xq2Var.h(p27Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i4 & 1, z)) {
            jt3 jt3Var = p27Var.d;
            if (jt3Var != null && ((Boolean) jt3Var.o.getValue()).booleanValue() && (m2 = p27Var.m()) != null && m2.B.length() > 0) {
                xq2Var.b0(-2112351432);
                boolean f2 = xq2Var.f(p27Var);
                Object P = xq2Var.P();
                vs0 vs0Var = ox0.a;
                if (f2 || P == vs0Var) {
                    P = new l27(p27Var);
                    xq2Var.l0(P);
                }
                g17 g17Var = (g17) P;
                qh1 qh1Var = (qh1) xq2Var.j(ky0.h);
                mk4 mk4Var = p27Var.b;
                long j2 = p27Var.n().b;
                int i5 = k47.c;
                int s2 = mk4Var.s((int) (j2 >> 32));
                jt3 jt3Var2 = p27Var.d;
                if (jt3Var2 != null) {
                    b47Var = jt3Var2.d();
                } else {
                    b47Var = null;
                }
                b47Var.getClass();
                a47 a47Var = b47Var.a;
                of5 c2 = a47Var.c(gi2.q(s2, 0, a47Var.a.a.B.length()));
                long floatToRawIntBits = (Float.floatToRawIntBits((qh1Var.e0(2.0f) / 2.0f) + c2.a) << 32) | (4294967295L & Float.floatToRawIntBits(c2.d));
                boolean e2 = xq2Var.e(floatToRawIntBits);
                Object P2 = xq2Var.P();
                if (e2 || P2 == vs0Var) {
                    P2 = new y51(floatToRawIntBits);
                    xq2Var.l0(P2);
                }
                ok4 ok4Var = (ok4) P2;
                boolean h2 = xq2Var.h(g17Var) | xq2Var.h(p27Var);
                Object P3 = xq2Var.P();
                if (h2 || P3 == vs0Var) {
                    P3 = new a61(0, g17Var, p27Var);
                    xq2Var.l0(P3);
                }
                a74 a2 = jw6.a(x64.a, g17Var, (PointerInputEventHandler) P3);
                boolean e3 = xq2Var.e(floatToRawIntBits);
                Object P4 = xq2Var.P();
                if (e3 || P4 == vs0Var) {
                    P4 = new t4(8, floatToRawIntBits);
                    xq2Var.l0(P4);
                }
                vf.a(ok4Var, ua6.a(a2, false, (qn2) P4), 0L, xq2Var, 0);
                xq2Var.p(false);
            } else {
                xq2Var.b0(-2111042550);
                xq2Var.p(false);
            }
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new z5(p27Var, i2, 6);
        }
    }

    public static final String t0(int i2) {
        if (i2 == 0) {
            return "0";
        }
        char[] cArr = l.a;
        int i3 = 0;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i3 < 8 && cArr2[i3] == '0') {
            i3++;
        }
        return xs6.V(cArr2, i3, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, ci0, y23] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void u(final pq5 pq5Var, final String str, final String str2, final a74 a74Var, final long j2, z31 z31Var, boolean z, qn2 qn2Var, px0 px0Var, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        qn2 qn2Var2;
        int i7;
        boolean z2;
        xq2 xq2Var;
        final vs0 vs0Var;
        final qn2 qn2Var3;
        cf5 t2;
        boolean z3;
        qn2 qn2Var4;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String str3;
        qa4 qa4Var;
        qa4 qa4Var2;
        String str4;
        x64 x64Var;
        Context context;
        float f2;
        vs0 vs0Var2;
        int i8;
        String upperCase;
        boolean z8;
        Iterator it;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        e40 e40Var = d90.Z;
        pq5Var.getClass();
        Uri uri = pq5Var.d;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(585301887);
        if ((i2 & 6) == 0) {
            if (xq2Var2.h(pq5Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i4 = i13 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var2.f(str)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i4 |= i12;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var2.f(str2)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i4 |= i11;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var2.f(a74Var)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i4 |= i10;
        }
        if ((i2 & 24576) == 0) {
            if (xq2Var2.e(j2)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i4 |= i9;
        }
        int i14 = 196608 | i4;
        int i15 = i3 & 64;
        if (i15 != 0) {
            i14 = 1769472 | i4;
        } else if ((1572864 & i2) == 0) {
            if (xq2Var2.g(z)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i14 |= i5;
            i6 = i3 & 128;
            if (i6 == 0) {
                i14 |= 12582912;
                qn2Var2 = qn2Var;
            } else {
                qn2Var2 = qn2Var;
                if ((i2 & 12582912) == 0) {
                    if (xq2Var2.h(qn2Var2)) {
                        i7 = 8388608;
                    } else {
                        i7 = Compress.MAXWINSIZE;
                    }
                    i14 |= i7;
                }
            }
            if ((i14 & 4793491) == 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!xq2Var2.S(i14 & 1, z2)) {
                if (i15 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
                vs0 vs0Var3 = ox0.a;
                if (i6 != 0) {
                    Object P = xq2Var2.P();
                    if (P == vs0Var3) {
                        P = new rk7(6);
                        xq2Var2.l0(P);
                    }
                    qn2Var4 = (qn2) P;
                } else {
                    qn2Var4 = qn2Var2;
                }
                Context context2 = (Context) xq2Var2.j(kf.b);
                boolean f3 = xq2Var2.f(uri);
                int i16 = i14 & 112;
                z = z3;
                if (i16 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z9 = f3 | z4;
                Object P2 = xq2Var2.P();
                if (z9 || P2 == vs0Var3) {
                    P2 = np2.Y(Boolean.FALSE);
                    xq2Var2.l0(P2);
                }
                qa4 qa4Var3 = (qa4) P2;
                boolean f4 = xq2Var2.f(uri);
                int i17 = i14 & 896;
                int i18 = i14;
                if (i17 == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z10 = f4 | z5;
                Object P3 = xq2Var2.P();
                if (z10 || P3 == vs0Var3) {
                    P3 = np2.Y(Boolean.FALSE);
                    xq2Var2.l0(P3);
                }
                qa4 qa4Var4 = (qa4) P3;
                boolean f5 = xq2Var2.f(uri);
                if (i16 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z11 = f5 | z6;
                if (i17 == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z12 = z11 | z7;
                Object P4 = xq2Var2.P();
                if (z12 || P4 == vs0Var3) {
                    P4 = np2.Y(Boolean.FALSE);
                    xq2Var2.l0(P4);
                }
                qa4 qa4Var5 = (qa4) P4;
                if (str != null && !((Boolean) qa4Var3.getValue()).booleanValue()) {
                    str3 = str;
                } else if (str2 != null && !((Boolean) qa4Var4.getValue()).booleanValue()) {
                    str3 = str2;
                } else {
                    str3 = null;
                }
                String k0 = k0(pq5Var);
                a74 J = vy7.J(a74Var, l0(k0));
                e34 d2 = h70.d(d90.L, false);
                int hashCode = Long.hashCode(xq2Var2.T);
                xv4 l2 = xq2Var2.l();
                a74 E = l.E(xq2Var2, J);
                jx0.i.getClass();
                iy0 iy0Var = ix0.b;
                xq2Var2.f0();
                if (xq2Var2.S) {
                    xq2Var2.k(iy0Var);
                } else {
                    xq2Var2.o0();
                }
                yh2.K(xq2Var2, ix0.f, d2);
                yh2.K(xq2Var2, ix0.e, l2);
                yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode));
                yh2.F(xq2Var2, ix0.h);
                yh2.K(xq2Var2, ix0.d, E);
                vs0 vs0Var4 = vs0.Y;
                boolean booleanValue = ((Boolean) qa4Var5.getValue()).booleanValue();
                x64 x64Var2 = x64.a;
                if (!booleanValue) {
                    xq2Var2.b0(-335724191);
                    List J0 = qs6.J0(k0, new char[]{' ', '-', ':', '_'}, 6);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = J0.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        String str5 = (String) next;
                        if (!qs6.v0(str5)) {
                            if (str5.length() != 0) {
                                it = it2;
                                if (Character.isLetterOrDigit(str5.charAt(0))) {
                                    arrayList.add(next);
                                }
                            } else {
                                fa6.e("Char sequence is empty.");
                                return;
                            }
                        } else {
                            it = it2;
                        }
                        it2 = it;
                    }
                    if (arrayList.isEmpty()) {
                        upperCase = qs6.S0(1, k0).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    } else if (arrayList.size() == 1) {
                        String upperCase2 = qs6.S0(1, (String) arrayList.get(0)).toUpperCase(Locale.ROOT);
                        upperCase2.getClass();
                        upperCase = upperCase2;
                    } else {
                        upperCase = qs6.S0(1, (String) arrayList.get(0)).concat(qs6.S0(1, (String) arrayList.get(1))).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    }
                    long j3 = kt0.d;
                    long c2 = kt0.c(0.18f, j3);
                    pi2 pi2Var = qs7.a;
                    str4 = k0;
                    qa4Var = qa4Var5;
                    qa4Var2 = qa4Var4;
                    String str6 = upperCase;
                    context = context2;
                    x64Var = x64Var2;
                    f2 = 22.0f;
                    x37.b(str6, vs0Var4.n(x64Var2, e40Var), c2, j2, oj2.e0, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, ((i18 >> 3) & 7168) | 1769856, 0, 130960);
                    xq2Var = xq2Var2;
                    if (str3 == null) {
                        xq2Var.b0(-335374697);
                        if (z) {
                            xq2Var.b0(-335353741);
                            e45.a(dj6.i(vs0Var4.n(x64Var, e40Var), 22.0f), kt0.c(0.85f, j3), 2.0f, 0L, 0, xq2Var, 432, 24);
                            xq2Var = xq2Var;
                            z8 = false;
                            xq2Var.p(false);
                        } else {
                            xq2Var.b0(-335046066);
                            gi2.b(m0(context, pq5Var), null, vs0Var4.n(x64Var, e40Var).d(dj6.c), y31.f, RecyclerView.B1, xq2Var, 1572912, 3512);
                            xq2Var = xq2Var;
                            z8 = false;
                            xq2Var.p(false);
                        }
                        xq2Var.p(z8);
                    } else {
                        z8 = false;
                        xq2Var.b0(-334619351);
                        xq2Var.p(false);
                    }
                    xq2Var.p(z8);
                } else {
                    qa4Var = qa4Var5;
                    qa4Var2 = qa4Var4;
                    str4 = k0;
                    x64Var = x64Var2;
                    context = context2;
                    f2 = 22.0f;
                    xq2Var = xq2Var2;
                    xq2Var.b0(-334609431);
                    xq2Var.p(false);
                }
                vs0 vs0Var5 = y31.a;
                if (str3 != null) {
                    xq2Var.b0(-334542905);
                    if (!((Boolean) qa4Var.getValue()).booleanValue()) {
                        xq2Var.b0(-334540053);
                        xq2 xq2Var3 = xq2Var;
                        e45.a(dj6.i(vs0Var4.n(x64Var, e40Var), f2), kt0.c(0.85f, kt0.d), 2.0f, 0L, 0, xq2Var3, 432, 24);
                        xq2Var = xq2Var3;
                        xq2Var.p(false);
                    } else {
                        xq2Var.b0(-334295959);
                        xq2Var.p(false);
                    }
                    x23 x23Var = new x23(context);
                    x23Var.c = str3;
                    x23Var.b(true);
                    ?? obj = new Object();
                    obj.a = str3;
                    obj.b = str;
                    obj.c = qn2Var4;
                    obj.d = qa4Var3;
                    obj.e = qa4Var2;
                    qa4 qa4Var6 = qa4Var;
                    obj.f = qa4Var6;
                    obj.g = qn2Var4;
                    obj.h = qa4Var6;
                    x23Var.e = obj;
                    vs0Var2 = vs0Var5;
                    xq2 xq2Var4 = xq2Var;
                    gi2.b(x23Var.a(), str4, dj6.c, vs0Var2, RecyclerView.B1, xq2Var4, (3670016 & (i18 << 3)) | RendererDebugBridge.CAPTURE_HEIGHT, 4024);
                    xq2Var = xq2Var4;
                    i8 = 0;
                    xq2Var.p(false);
                } else {
                    vs0Var2 = vs0Var5;
                    i8 = 0;
                    xq2Var.b0(-333464663);
                    xq2Var.p(false);
                }
                r(null, xq2Var, i8);
                xq2Var.p(true);
                qn2Var3 = qn2Var4;
                vs0Var = vs0Var2;
            } else {
                xq2Var = xq2Var2;
                xq2Var.V();
                vs0Var = z31Var;
                qn2Var3 = qn2Var2;
            }
            final boolean z13 = z;
            t2 = xq2Var.t();
            if (t2 == null) {
                t2.d = new eo2() { // from class: ms7
                    @Override // defpackage.eo2
                    public final Object o(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        hf.u(pq5.this, str, str2, a74Var, j2, vs0Var, z13, qn2Var3, (px0) obj2, ii2.a0(i2 | 1), i3);
                        return jg7.a;
                    }
                };
                return;
            }
            return;
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        if ((i14 & 4793491) == 4793490) {
        }
        if (!xq2Var2.S(i14 & 1, z2)) {
        }
        final boolean z132 = z;
        t2 = xq2Var.t();
        if (t2 == null) {
        }
    }

    public static final long u0(long j2, long j3) {
        boolean z;
        boolean z2;
        int d2;
        boolean z3;
        boolean z4;
        boolean z5;
        int f2 = k47.f(j2);
        int e2 = k47.e(j2);
        boolean z6 = false;
        if (k47.f(j3) < k47.e(j2)) {
            z = true;
        } else {
            z = false;
        }
        if (k47.f(j2) < k47.e(j3)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z & z2) {
            if (k47.f(j3) <= k47.f(j2)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (k47.e(j2) <= k47.e(j3)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 & z4) {
                f2 = k47.f(j3);
                e2 = f2;
            } else {
                if (k47.f(j2) <= k47.f(j3)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (k47.e(j3) <= k47.e(j2)) {
                    z6 = true;
                }
                if (z5 & z6) {
                    d2 = k47.d(j3);
                } else {
                    int f3 = k47.f(j3);
                    if (f2 < k47.e(j3) && f3 <= f2) {
                        f2 = k47.f(j3);
                        d2 = k47.d(j3);
                    } else {
                        e2 = k47.f(j3);
                    }
                }
                e2 -= d2;
            }
        } else if (e2 > k47.f(j3)) {
            f2 -= k47.d(j3);
            d2 = k47.d(j3);
            e2 -= d2;
        }
        return jx2.f(f2, e2);
    }

    public static final void v(int i2, List list, int i3) {
        int O = O(i2, list);
        if (O < 0) {
            O = -(O + 1);
        }
        while (O < list.size() && ((xb3) list.get(O)).b < i3) {
            xb3 xb3Var = (xb3) list.remove(O);
        }
    }

    public static ArrayList w(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new ku(objArr, true));
    }

    public static final boolean x(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static int y(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        h0(arrayList.size(), size);
        int i2 = size - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int z = g04.z((Comparable) arrayList.get(i4), comparable);
            if (z < 0) {
                i3 = i4 + 1;
            } else if (z > 0) {
                i2 = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public abstract String J();

    public void X(e36 e36Var, Iterable iterable) {
        e36Var.getClass();
        if (iterable == null) {
            return;
        }
        j36 i0 = e36Var.i0(J());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    z(i0, obj);
                    i0.f0();
                    i0.reset();
                }
            }
            lb4.p(i0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                lb4.p(i0, th);
                throw th2;
            }
        }
    }

    public void Y(e36 e36Var, Object obj) {
        e36Var.getClass();
        if (obj == null) {
            return;
        }
        j36 i0 = e36Var.i0(J());
        try {
            z(i0, obj);
            i0.f0();
            lb4.p(i0, null);
        } finally {
        }
    }

    public long Z(e36 e36Var, Object obj) {
        e36Var.getClass();
        if (obj == null) {
            return -1L;
        }
        j36 i0 = e36Var.i0(J());
        try {
            z(i0, obj);
            i0.f0();
            lb4.p(i0, null);
            return oi2.z(e36Var);
        } finally {
        }
    }

    public List a0(e36 e36Var, ArrayList arrayList) {
        e36Var.getClass();
        kw3 I = I();
        j36 i0 = e36Var.i0(J());
        try {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (obj != null) {
                    z(i0, obj);
                    i0.f0();
                    i0.reset();
                    I.add(Long.valueOf(oi2.z(e36Var)));
                } else {
                    I.add(-1L);
                }
            }
            lb4.p(i0, null);
            return A(I);
        } finally {
        }
    }

    public abstract void z(j36 j36Var, Object obj);
}

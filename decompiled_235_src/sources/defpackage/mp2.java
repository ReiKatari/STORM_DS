package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.Layout;
import android.text.Spanned;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mp2  reason: default package */
/* loaded from: classes.dex */
public abstract class mp2 {
    public static e33 a = null;
    public static final /* synthetic */ int b = 0;
    public static boolean c = true;
    public static Field d;
    public static boolean e;

    public static int A(Context context, int i, int i2) {
        Integer num;
        int i3;
        TypedValue M = qo2.M(context, i);
        if (M != null) {
            int i4 = M.resourceId;
            if (i4 != 0) {
                i3 = context.getColor(i4);
            } else {
                i3 = M.data;
            }
            num = Integer.valueOf(i3);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i2;
    }

    public static int B(View view, int i) {
        Context context = view.getContext();
        TypedValue O = qo2.O(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = O.resourceId;
        if (i2 != 0) {
            return context.getColor(i2);
        }
        return O.data;
    }

    public static String C(rh rhVar, int i) {
        rhVar.getClass();
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            Context context = rhVar.a;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static final float D(Layout layout, int i, Paint paint) {
        int i2;
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = d47.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= RecyclerView.B1) {
            return RecyclerView.B1;
        }
        int lineStart = layout.getLineStart(i);
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + lineStart) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null) {
            i2 = -1;
        } else {
            i2 = h43.a[paragraphAlignment.ordinal()];
        }
        if (i2 == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float E(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = d47.a;
        if (layout.getEllipsisCount(i) > 0) {
            int i2 = -1;
            if (layout.getParagraphDirection(i) == -1 && layout.getWidth() < layout.getLineRight(i)) {
                float primaryHorizontal = layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i));
                float measureText = paint.measureText("…") + (layout.getLineRight(i) - primaryHorizontal);
                Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
                if (paragraphAlignment != null) {
                    i2 = h43.a[paragraphAlignment.ordinal()];
                }
                if (i2 == 1) {
                    width = layout.getWidth() - layout.getLineRight(i);
                    width2 = (layout.getWidth() - measureText) / 2.0f;
                } else {
                    width = layout.getWidth() - layout.getLineRight(i);
                    width2 = layout.getWidth() - measureText;
                }
                return width - width2;
            }
            return RecyclerView.B1;
        }
        return RecyclerView.B1;
    }

    public static final ws1 F() {
        if (ws1.d()) {
            ws1 a2 = ws1.a();
            if (a2.c() == 1) {
                return a2;
            }
            return null;
        }
        return null;
    }

    public static qb6 G(ic4 ic4Var) {
        ic4Var.getClass();
        return sb6.Z(ic4Var, new x84(10));
    }

    public static String H(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "|");
            }
        }
        return sb.toString();
    }

    public static final q45 I(long j) {
        long j2 = j & 25769803776L;
        q45 q45Var = q45.DEFAULT;
        if (j2 == q45Var.getSignature$kotlinx_serialization_protobuf()) {
            return q45Var;
        }
        q45 q45Var2 = q45.SIGNED;
        if (j2 == q45Var2.getSignature$kotlinx_serialization_protobuf()) {
            return q45Var2;
        }
        return q45.FIXED;
    }

    public static final e33 J() {
        e33 e33Var = a;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new tt4(8.59f, 16.59f));
        arrayList.add(new st4(13.17f, 12.0f));
        arrayList.add(new st4(8.59f, 7.41f));
        arrayList.add(new st4(10.0f, 6.0f));
        arrayList.add(new au4(6.0f, 6.0f));
        arrayList.add(new au4(-6.0f, 6.0f));
        arrayList.add(new au4(-1.41f, -1.41f));
        arrayList.add(pt4.c);
        d33.a(d33Var, arrayList, 0, cn6Var);
        e33 b2 = d33Var.b();
        a = b2;
        return b2;
    }

    public static boolean L(int i) {
        double pow;
        double pow2;
        double pow3;
        if (i != 0) {
            ThreadLocal threadLocal = tt0.a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length == 3) {
                double d2 = red / 255.0d;
                if (d2 < 0.04045d) {
                    pow = d2 / 12.92d;
                } else {
                    pow = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
                }
                double d3 = green / 255.0d;
                if (d3 < 0.04045d) {
                    pow2 = d3 / 12.92d;
                } else {
                    pow2 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
                }
                double d4 = blue / 255.0d;
                if (d4 < 0.04045d) {
                    pow3 = d4 / 12.92d;
                } else {
                    pow3 = Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
                }
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d5 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d5;
                double d6 = pow3 * 0.9505d;
                dArr[2] = (d6 + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d5 / 100.0d <= 0.5d) {
                    return false;
                }
                return true;
            }
            i.h("outXyz must have a length of 3.");
            return false;
        }
        return false;
    }

    public static final boolean M(lr3 lr3Var, int i) {
        int c2 = lr3Var.c();
        if (i <= lr3Var.e() && c2 <= i) {
            return true;
        }
        return false;
    }

    public static final boolean N(long j) {
        if ((j & 68719476736L) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean O(wb6 wb6Var) {
        wb6Var.getClass();
        if (!wb6Var.h() ? !(!(wb6Var.e() instanceof v25) || nb3.k(wb6Var.e(), v25.m)) : !(wb6Var.f() != 1 || !O(wb6Var.j(0)))) {
            return true;
        }
        return false;
    }

    public static final boolean P(u16 u16Var) {
        long j = u16Var.e;
        if ((j >>> 32) == (4294967295L & j) && j == u16Var.f && j == u16Var.g && j == u16Var.h) {
            return true;
        }
        return false;
    }

    public static int Q(float f, int i, int i2) {
        return tt0.b(tt0.d(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static final void R(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        float s;
        if (i == 0) {
            p53.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        for (int i9 = 0; i9 < i3; i9++) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float s2 = s(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * s2);
                }
            }
            float sqrt = (float) Math.sqrt(s(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            for (int i13 = 0; i13 < i3; i13++) {
                if (i13 < i9) {
                    s = RecyclerView.B1;
                } else {
                    s = s(fArr7, fArr4[i13]);
                }
                fArr10[i13] = s;
            }
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float s3 = s(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    s3 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = s3 / fArr11[i14];
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [q54, o04] */
    public static q54 S(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    int i3 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i3) {
                        break;
                    }
                    i2++;
                } else {
                    j = -1;
                    break;
                }
            }
            if (j != -1) {
                duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j2 = duplicate.getInt() & 4294967295L;
                for (int i4 = 0; i4 < j2; i4++) {
                    int i5 = duplicate.getInt();
                    long j3 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i5 || 1701669481 == i5) {
                        duplicate.position((int) (j3 + j));
                        ?? o04Var = new o04();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        o04Var.R = duplicate;
                        o04Var.A = position;
                        int i6 = position - duplicate.getInt(position);
                        o04Var.B = i6;
                        o04Var.L = ((ByteBuffer) o04Var.R).getShort(i6);
                        return o04Var;
                    }
                }
            }
            e41.i("Cannot read metadata.");
            return null;
        }
        e41.i("Cannot read metadata.");
        return null;
    }

    public static final j37 T(px0 px0Var) {
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        if (P == ox0.a) {
            P = new j37();
            xq2Var.l0(P);
        }
        return (j37) P;
    }

    public static final boolean U(ja4 ja4Var, Object obj, Object obj2) {
        Object g = ja4Var.g(obj);
        if (g == null) {
            return false;
        }
        if (g instanceof ka4) {
            ka4 ka4Var = (ka4) g;
            boolean l = ka4Var.l(obj2);
            if (l && ka4Var.g()) {
                ja4Var.k(obj);
            }
            return l;
        } else if (!g.equals(obj2)) {
            return false;
        } else {
            ja4Var.k(obj);
            return true;
        }
    }

    public static final void V(List list, qn2 qn2Var) {
        list.getClass();
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (((Boolean) qn2Var.g(it.next())).booleanValue()) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            list.remove(i);
        }
    }

    public static final void W(ja4 ja4Var, Object obj) {
        boolean z;
        long[] jArr = ja4Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = ja4Var.b[i4];
                            Object obj3 = ja4Var.c[i4];
                            if (obj3 instanceof ka4) {
                                ka4 ka4Var = (ka4) obj3;
                                ka4Var.l(obj);
                                z = ka4Var.g();
                            } else if (obj3 == obj) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                ja4Var.l(i4);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public static final boolean X(VideoRenderer videoRenderer, boolean z) {
        videoRenderer.getClass();
        int i = tj5.a[videoRenderer.ordinal()];
        boolean z2 = true;
        if (i != 1) {
            if (i != 2) {
                z2 = false;
                if (i != 3 && i != 4) {
                    i.d();
                }
            }
            return z2;
        }
        return z;
    }

    public static final Object Z(o66 o66Var, boolean z, o66 o66Var2, eo2 eo2Var) {
        av0 av0Var;
        Object d0;
        try {
            if (!(eo2Var instanceof d20)) {
                av0Var = np2.k0(eo2Var, o66Var2, o66Var);
            } else {
                ge7.p(2, eo2Var);
                av0Var = eo2Var.o(o66Var2, o66Var);
            }
        } catch (mk1 e2) {
            Throwable th = e2.A;
            o66Var.b0(new av0(th, false));
            throw th;
        } catch (Throwable th2) {
            av0Var = new av0(th2, false);
        }
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        if (av0Var == x61Var || (d0 = o66Var.d0(av0Var)) == fd3.b) {
            return x61Var;
        }
        o66Var.w0();
        if (d0 instanceof av0) {
            if (!z) {
                Throwable th3 = ((av0) d0).a;
                if ((th3 instanceof c67) && ((c67) th3).A == o66Var) {
                    if (av0Var instanceof av0) {
                        throw ((av0) av0Var).a;
                    }
                    return av0Var;
                }
            }
            throw ((av0) d0).a;
        }
        return fd3.a(d0);
    }

    public static final void a(a74 a74Var, cp2 cp2Var, on2 on2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        xq2 xq2Var;
        long j;
        boolean z2;
        xq2 xq2Var2;
        a74Var.getClass();
        cp2Var.getClass();
        on2Var.getClass();
        xq2 xq2Var3 = (xq2) px0Var;
        xq2Var3.d0(-1995127703);
        if (xq2Var3.h(cp2Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i4 = i | i2;
        if (xq2Var3.h(on2Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i5 = i4 | i3;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var3.S(i5 & 1, z)) {
            es7 F = bl2.F(xq2Var3);
            Object P = xq2Var3.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = i61.f(xq2Var3);
            }
            r94 r94Var = (r94) P;
            qa4 a2 = bw7.a(r94Var, xq2Var3, 6);
            y16 b2 = z16.b(13.0f);
            a74 g = u24.g(a74Var, b2);
            if (((Boolean) a2.getValue()).booleanValue()) {
                xq2Var = xq2Var3;
                j = F.e;
            } else {
                xq2Var = xq2Var3;
                j = F.d;
            }
            jy2 jy2Var = u24.m;
            a74 L = vy7.L(g, j, jy2Var);
            if (((Boolean) a2.getValue()).booleanValue()) {
                L = ak7.I(L, 2.0f, F.j, b2);
            }
            a74 a74Var2 = L;
            if ((i5 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P2 = xq2Var.P();
            if (!z2 && P2 != vs0Var) {
                xq2Var2 = xq2Var;
            } else {
                P2 = new x7(9, on2Var);
                xq2Var2 = xq2Var;
                xq2Var2.l0(P2);
            }
            a74 P3 = ge7.P(mb3.t(a74Var2, r94Var, null, false, null, (on2) P2, 28), 14.0f, 13.0f);
            l26 a3 = k26.a(ju.a, d90.i0, xq2Var2, 48);
            int hashCode = Long.hashCode(xq2Var2.T);
            xv4 l = xq2Var2.l();
            a74 E = l.E(xq2Var2, P3);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var2, pnVar, a3);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var2, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var2, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var2, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var2, pnVar4, E);
            x64 x64Var = x64.a;
            a74 L2 = vy7.L(u24.g(dj6.i(x64Var, 34.0f), z16.b(9.0f)), kt0.c(0.13f, F.j), jy2Var);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode2 = Long.hashCode(xq2Var2.T);
            xv4 l2 = xq2Var2.l();
            a74 E2 = l.E(xq2Var2, L2);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, d2);
            yh2.K(xq2Var2, pnVar2, l2);
            i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E2);
            i13.a(yh2.v(), null, dj6.i(x64Var, 19.0f), F.j, xq2Var2, 432, 0);
            xq2Var2.p(true);
            gi2.h(xq2Var2, dj6.l(x64Var, 12.0f));
            xq2 xq2Var4 = xq2Var2;
            x37.b(cp2Var.b, new vn3(1.0f, true), F.g, hi2.D(13.5d), oj2.d0, null, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var4, 199680, 3120, 120784);
            xq2Var3 = xq2Var4;
            i13.a(J(), null, dj6.i(x64Var, 20.0f), F.i, xq2Var3, 432, 0);
            xq2Var3.p(true);
        } else {
            xq2Var3.V();
        }
        cf5 t = xq2Var3.t();
        if (t != null) {
            t.d = new x3(a74Var, cp2Var, on2Var, i, 18);
        }
    }

    public static String a0(long j) {
        return lb1.i(j, "RASetId(id=", ")");
    }

    public static final x25 b(String str, v25 v25Var) {
        if (!qs6.v0(str)) {
            Iterator it = ((r04) a35.a.values()).iterator();
            while (((o04) it).hasNext()) {
                gg3 gg3Var = (gg3) ((m04) it).next();
                if (str.equals(gg3Var.e().a())) {
                    StringBuilder t = i61.t("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                    t.append(gh5.a(gg3Var.getClass()).c());
                    t.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                    i.h(rs6.R(t.toString()));
                    return null;
                }
            }
            return new x25(str, v25Var);
        }
        i.h("Blank serial names are prohibited");
        return null;
    }

    public static final u16 c(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new u16(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final void d(a74 a74Var, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1854833411);
        if (xq2Var.f(a74Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = fc.k;
                xq2Var.l0(P);
            }
            e34 e34Var = (e34) P;
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, e34Var);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            zv0Var.o(xq2Var, 6);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new sa5(a74Var, i, 9, zv0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(String str, j37 j37Var, qn2 qn2Var, on2 on2Var, px0 px0Var, int i, int i2) {
        int i3;
        int i4;
        qn2 qn2Var2;
        int i5;
        int i6;
        on2 on2Var2;
        int i7;
        int i8;
        int i9;
        boolean z;
        j37 j37Var2;
        xq2 xq2Var;
        qn2 qn2Var3;
        on2 on2Var3;
        cf5 t;
        qn2 qn2Var4;
        on2 on2Var4;
        qa4 qa4Var;
        str.getClass();
        j37Var.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(1637213593);
        if (xq2Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i3 | i;
        if (xq2Var2.f(j37Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        int i12 = i2 & 4;
        if (i12 != 0) {
            i11 |= RendererDebugBridge.CAPTURE_HEIGHT;
        } else if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            qn2Var2 = qn2Var;
            if (xq2Var2.h(qn2Var2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i11 |= i5;
            i6 = i2 & 8;
            if (i6 == 0) {
                i8 = i11 | 3072;
                on2Var2 = on2Var;
            } else {
                on2Var2 = on2Var;
                if (xq2Var2.h(on2Var2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i8 = i11 | i7;
            }
            i9 = i8;
            boolean z2 = true;
            if ((i9 & 1171) == 1170) {
                z = true;
            } else {
                z = false;
            }
            if (!xq2Var2.S(i9 & 1, z)) {
                vs0 vs0Var = ox0.a;
                if (i12 != 0) {
                    Object P = xq2Var2.P();
                    if (P == vs0Var) {
                        P = new h37(0);
                        xq2Var2.l0(P);
                    }
                    qn2Var4 = (qn2) P;
                } else {
                    qn2Var4 = qn2Var2;
                }
                if (i6 != 0) {
                    on2Var4 = null;
                } else {
                    on2Var4 = on2Var2;
                }
                if (((Boolean) j37Var.a.getValue()).booleanValue()) {
                    xq2Var2.b0(581821416);
                    Object P2 = xq2Var2.P();
                    if (P2 == vs0Var) {
                        P2 = np2.Y(Boolean.FALSE);
                        xq2Var2.l0(P2);
                    }
                    qa4 qa4Var2 = (qa4) P2;
                    if ((i9 & 112) != 32) {
                        z2 = false;
                    }
                    Object P3 = xq2Var2.P();
                    if (!z2 && P3 != vs0Var) {
                        qa4Var = qa4Var2;
                        j37Var2 = j37Var;
                    } else {
                        qa4Var = qa4Var2;
                        i4 i4Var = new i4(0, j37Var, j37.class, "cancel", "cancel$app()V", 0, 0, 10);
                        j37Var2 = j37Var;
                        xq2Var2.l0(i4Var);
                        P3 = i4Var;
                    }
                    xq2Var = xq2Var2;
                    q60.a(str, (on2) ((po2) P3), n16.I(-111579201, new m4(j37Var2, qn2Var4, qa4Var), xq2Var2), n16.I(1254270461, new e46(j37Var2, on2Var4, qa4Var, 3), xq2Var2), false, xq2Var, (i9 & 14) | 3456, 16);
                    xq2Var.p(false);
                } else {
                    j37Var2 = j37Var;
                    xq2Var = xq2Var2;
                    xq2Var.b0(583975017);
                    xq2Var.p(false);
                }
                qn2Var3 = qn2Var4;
                on2Var3 = on2Var4;
            } else {
                j37Var2 = j37Var;
                xq2Var = xq2Var2;
                xq2Var.V();
                qn2Var3 = qn2Var2;
                on2Var3 = on2Var2;
            }
            t = xq2Var.t();
            if (t == null) {
                t.d = new sp5(str, j37Var2, qn2Var3, on2Var3, i, i2);
                return;
            }
            return;
        }
        qn2Var2 = qn2Var;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        i9 = i8;
        boolean z22 = true;
        if ((i9 & 1171) == 1170) {
        }
        if (!xq2Var2.S(i9 & 1, z)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public static final int f(int i, ua4 ua4Var) {
        int i2 = ua4Var.L - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = ua4Var.A;
            int i5 = ((bb3) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((bb3) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final void g(ja4 ja4Var, Object obj, Object obj2) {
        boolean z;
        Object obj3;
        int f = ja4Var.f(obj);
        if (f < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            obj3 = null;
        } else {
            obj3 = ja4Var.c[f];
        }
        if (obj3 != null) {
            if (obj3 instanceof ka4) {
                ((ka4) obj3).a(obj2);
            } else if (obj3 != obj2) {
                ka4 ka4Var = new ka4();
                ka4Var.a(obj3);
                ka4Var.a(obj2);
                obj2 = ka4Var;
            }
            obj2 = obj3;
        }
        if (z) {
            int i = ~f;
            ja4Var.b[i] = obj;
            ja4Var.c[i] = obj2;
            return;
        }
        ja4Var.c[f] = obj2;
    }

    public static final void h(j97 j97Var, vy4 vy4Var, long j) {
        bg1 bg1Var = (bg1) j97Var.B;
        bg1Var.getClass();
        rl7 rl7Var = (rl7) bg1Var.L;
        rl7 rl7Var2 = (rl7) bg1Var.B;
        boolean n = ej2.n(vy4Var);
        long j2 = vy4Var.b;
        if (n) {
            fv.z0(0, r6.length, null, rl7Var2.d);
            rl7Var2.e = 0;
            fv.z0(0, r6.length, null, rl7Var.d);
            rl7Var.e = 0;
            bg1Var.A = 0L;
        }
        if (!ej2.p(vy4Var)) {
            List b2 = vy4Var.b();
            int i = 0;
            for (int size = b2.size(); i < size; size = size) {
                vx2 vx2Var = (vx2) b2.get(i);
                bg1Var.e(vx2Var.a, jk4.f(vx2Var.e, j));
                i++;
            }
            bg1Var.e(j2, jk4.f(vy4Var.n, j));
        }
        if (ej2.p(vy4Var) && j2 - bg1Var.A > 40) {
            fv.z0(0, r0.length, null, rl7Var2.d);
            rl7Var2.e = 0;
            fv.z0(0, r2.length, null, rl7Var.d);
            rl7Var.e = 0;
            bg1Var.A = 0L;
        }
        bg1Var.A = j2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(11:18|19|20|21|22|23|24|25|(3:27|28|29)|13|14))(6:92|(1:94)|95|96|97|(11:99|100|(1:102)(1:105)|103|104|23|24|25|(0)|13|14)(2:106|107))))|113|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f8, code lost:
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd A[Catch: fc3 -> 0x01a1, TRY_ENTER, TRY_LEAVE, TryCatch #1 {fc3 -> 0x01a1, blocks: (B:35:0x00bf, B:42:0x00dd, B:56:0x0102, B:58:0x0116, B:62:0x012b, B:66:0x0133), top: B:104:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020f  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, bh5] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.Object, ah5] */
    /* JADX WARN: Type inference failed for: r8v2, types: [zg5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [dh5, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x017c -> B:76:0x0185). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(lr3 lr3Var, int i, int i2, qh1 qh1Var, s41 s41Var) {
        sq3 sq3Var;
        int i3;
        int i4;
        lr3 lr3Var2;
        sq3 sq3Var2;
        lr3 lr3Var3;
        sq3 sq3Var3;
        uo O;
        Float f;
        boolean z;
        uf ufVar;
        int i5;
        lr3 lr3Var4;
        float e0;
        float e02;
        float e03;
        ?? obj;
        ?? obj2;
        int i6;
        float f2;
        int i7;
        float f3;
        final int i8;
        final bh5 bh5Var;
        dh5 dh5Var;
        zg5 zg5Var;
        sq3 sq3Var4;
        final float f4;
        sq3 sq3Var5;
        int i9;
        float f5;
        boolean z2;
        final boolean z3;
        final int i10;
        final float f6;
        final zg5 zg5Var2;
        final dh5 dh5Var2;
        final lr3 lr3Var5;
        zg5 zg5Var3;
        bh5 bh5Var2;
        int i11;
        dh5 dh5Var3;
        sq3 sq3Var6;
        zg5 zg5Var4;
        int i12 = i;
        if (s41Var instanceof sq3) {
            sq3 sq3Var7 = (sq3) s41Var;
            int i13 = sq3Var7.k0;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                sq3Var7.k0 = i13 - Integer.MIN_VALUE;
                sq3Var = sq3Var7;
                Object obj3 = sq3Var.j0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i3 = sq3Var.k0;
                int i14 = 30;
                float f7 = RecyclerView.B1;
                if (i3 == 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            i5 = sq3Var.d0;
                            lr3Var4 = sq3Var.R;
                            oi2.Y(obj3);
                            lr3Var4.f(i5);
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i7 = sq3Var.f0;
                    float f8 = sq3Var.i0;
                    e02 = sq3Var.h0;
                    f3 = sq3Var.g0;
                    int i15 = sq3Var.e0;
                    int i16 = sq3Var.d0;
                    bh5 bh5Var3 = sq3Var.Z;
                    dh5 dh5Var4 = sq3Var.Y;
                    zg5 zg5Var5 = sq3Var.X;
                    lr3Var3 = sq3Var.R;
                    try {
                        oi2.Y(obj3);
                        lr3Var2 = lr3Var3;
                        dh5Var3 = dh5Var4;
                        f2 = f8;
                        i8 = i15;
                        i12 = i16;
                        sq3Var6 = sq3Var;
                        zg5Var4 = zg5Var5;
                        try {
                            bh5Var3.A++;
                            bh5Var = bh5Var3;
                            i14 = 30;
                            f7 = RecyclerView.B1;
                            sq3Var4 = sq3Var6;
                            zg5Var = zg5Var4;
                            dh5Var = dh5Var3;
                        } catch (fc3 e2) {
                            e = e2;
                            i4 = i12;
                            sq3Var2 = sq3Var4;
                            lr3Var3 = lr3Var2;
                            sq3Var3 = sq3Var2;
                            O = ak7.O(e.B, RecyclerView.B1, RecyclerView.B1, 30);
                            float f9 = e.A;
                            Object obj4 = new Object();
                            f = new Float(f9);
                            if (((Number) O.a()).floatValue() == RecyclerView.B1) {
                            }
                            ufVar = new uf(f9, obj4, lr3Var3, 1);
                            sq3Var3.R = lr3Var3;
                            sq3Var3.X = null;
                            sq3Var3.Y = null;
                            sq3Var3.Z = null;
                            sq3Var3.d0 = i4;
                            sq3Var3.k0 = 2;
                            if (kj2.o(O, f, null, !z, ufVar, sq3Var3, 2) != x61Var) {
                            }
                            return x61Var;
                        }
                        f4 = e02;
                    } catch (fc3 e3) {
                        e = e3;
                        i4 = i16;
                        sq3Var3 = sq3Var;
                        O = ak7.O(e.B, RecyclerView.B1, RecyclerView.B1, 30);
                        float f92 = e.A;
                        Object obj42 = new Object();
                        f = new Float(f92);
                        if (((Number) O.a()).floatValue() == RecyclerView.B1) {
                        }
                        ufVar = new uf(f92, obj42, lr3Var3, 1);
                        sq3Var3.R = lr3Var3;
                        sq3Var3.X = null;
                        sq3Var3.Y = null;
                        sq3Var3.Z = null;
                        sq3Var3.d0 = i4;
                        sq3Var3.k0 = 2;
                        if (kj2.o(O, f, null, !z, ufVar, sq3Var3, 2) != x61Var) {
                        }
                        return x61Var;
                    }
                    if (zg5Var.A) {
                        try {
                        } catch (fc3 e4) {
                            e = e4;
                            i4 = i12;
                            sq3Var5 = sq3Var4;
                            lr3Var3 = lr3Var2;
                        }
                        switch (lr3Var2.a) {
                            case 0:
                                i9 = ((pr3) lr3Var2.c).j().n;
                                if (i9 > 0) {
                                    try {
                                        try {
                                            try {
                                                int b2 = lr3Var2.b(i12);
                                                if (Math.abs(b2) < f3) {
                                                    f5 = Math.max(Math.abs(b2), f2);
                                                    if (i7 == 0) {
                                                        f5 = -f5;
                                                    }
                                                } else if (i7 != 0) {
                                                    f5 = f3;
                                                } else {
                                                    f5 = -f3;
                                                }
                                                uo O2 = ak7.O((uo) dh5Var.A, f7, f7, i14);
                                                dh5Var.A = O2;
                                                final ?? obj5 = new Object();
                                                Float f10 = new Float(f5);
                                                if (((Number) ((uo) dh5Var.A).a()).floatValue() == f7) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                boolean z4 = !z2;
                                                if (i7 != 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                qn2 qn2Var = new qn2() { // from class: rq3
                                                    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
                                                        if (r2 < r7) goto L8;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
                                                        r2 = r4;
                                                        r7 = r7 - r2.A;
                                                        r8 = r0.a(r7);
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
                                                        if (defpackage.mp2.M(r0, r1) == false) goto L10;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
                                                        if (defpackage.mp2.j(r4, r0, r1) != false) goto L37;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
                                                        if (r7 != r8) goto L32;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
                                                        r2.A += r7;
                                                        r2 = r7;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
                                                        if (r4 == false) goto L29;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
                                                        if (((java.lang.Number) r11.e.getValue()).floatValue() <= r2) goto L19;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
                                                        r11.a();
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
                                                        if (((java.lang.Number) r11.e.getValue()).floatValue() >= (-r2)) goto L19;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
                                                        r11.a();
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
                                                        r2 = r8.A;
                                                        r7 = r9;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
                                                        if (r4 == false) goto L25;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
                                                        if (r2 < 2) goto L37;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
                                                        if ((r1 - r0.e()) <= r7) goto L37;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
                                                        r0.f(r1 - r7);
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
                                                        if (r2 < 2) goto L37;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
                                                        if ((r0.c() - r1) <= r7) goto L37;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
                                                        r0.f(r7 + r1);
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
                                                        r11.a();
                                                        r3.A = false;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
                                                        return r5;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
                                                        if (r2 > r7) goto L8;
                                                     */
                                                    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
                                                        r7 = r2;
                                                     */
                                                    @Override // defpackage.qn2
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                    */
                                                    public final Object g(Object obj6) {
                                                        float floatValue;
                                                        so soVar = (so) obj6;
                                                        lr3 lr3Var6 = lr3.this;
                                                        int i17 = i10;
                                                        boolean M = mp2.M(lr3Var6, i17);
                                                        zg5 zg5Var6 = zg5Var2;
                                                        boolean z5 = z3;
                                                        jg7 jg7Var = jg7.a;
                                                        if (!M) {
                                                            float f11 = f6;
                                                            if (f11 > RecyclerView.B1) {
                                                                floatValue = ((Number) soVar.e.getValue()).floatValue();
                                                            } else {
                                                                floatValue = ((Number) soVar.e.getValue()).floatValue();
                                                            }
                                                        }
                                                        if (mp2.j(z5, lr3Var6, i17)) {
                                                            lr3Var6.f(i17);
                                                            zg5Var6.A = false;
                                                            soVar.a();
                                                            return jg7Var;
                                                        } else if (!mp2.M(lr3Var6, i17)) {
                                                            return jg7Var;
                                                        } else {
                                                            throw new fc3(lr3Var6.b(i17), (uo) dh5Var2.A);
                                                        }
                                                    }
                                                };
                                                sq3Var4.R = lr3Var3;
                                                sq3Var4.X = zg5Var3;
                                                sq3Var4.Y = dh5Var2;
                                                sq3Var4.Z = bh5Var2;
                                                sq3Var4.d0 = i4;
                                                sq3Var4.e0 = i11;
                                                sq3Var4.g0 = f3;
                                                sq3Var4.h0 = e02;
                                                sq3Var4.i0 = f2;
                                                sq3Var4.f0 = i7;
                                                sq3Var4.k0 = 1;
                                                if (kj2.o(O2, f10, null, z4, qn2Var, sq3Var5, 2) != x61Var) {
                                                    lr3Var2 = lr3Var3;
                                                    dh5Var3 = dh5Var2;
                                                    bh5Var3 = bh5Var2;
                                                    i12 = i4;
                                                    i8 = i11;
                                                    sq3Var6 = sq3Var5;
                                                    zg5Var4 = zg5Var3;
                                                    bh5Var3.A++;
                                                    bh5Var = bh5Var3;
                                                    i14 = 30;
                                                    f7 = RecyclerView.B1;
                                                    sq3Var4 = sq3Var6;
                                                    zg5Var = zg5Var4;
                                                    dh5Var = dh5Var3;
                                                    f4 = e02;
                                                    if (zg5Var.A) {
                                                    }
                                                }
                                            } catch (fc3 e5) {
                                                e = e5;
                                                sq3Var3 = sq3Var5;
                                                O = ak7.O(e.B, RecyclerView.B1, RecyclerView.B1, 30);
                                                float f922 = e.A;
                                                Object obj422 = new Object();
                                                f = new Float(f922);
                                                if (((Number) O.a()).floatValue() == RecyclerView.B1) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                ufVar = new uf(f922, obj422, lr3Var3, 1);
                                                sq3Var3.R = lr3Var3;
                                                sq3Var3.X = null;
                                                sq3Var3.Y = null;
                                                sq3Var3.Z = null;
                                                sq3Var3.d0 = i4;
                                                sq3Var3.k0 = 2;
                                                if (kj2.o(O, f, null, !z, ufVar, sq3Var3, 2) != x61Var) {
                                                    i5 = i4;
                                                    lr3Var4 = lr3Var3;
                                                    lr3Var4.f(i5);
                                                    return jg7.a;
                                                }
                                                return x61Var;
                                            }
                                            sq3Var5 = sq3Var4;
                                        } catch (fc3 e6) {
                                            e = e6;
                                            lr3Var3 = lr3Var5;
                                            i4 = i10;
                                            sq3Var3 = sq3Var4;
                                        }
                                        i10 = i12;
                                        f6 = f5;
                                        zg5Var2 = zg5Var;
                                        dh5Var2 = dh5Var;
                                        lr3Var5 = lr3Var2;
                                    } catch (fc3 e7) {
                                        e = e7;
                                        sq3Var3 = sq3Var4;
                                        O = ak7.O(e.B, RecyclerView.B1, RecyclerView.B1, 30);
                                        float f9222 = e.A;
                                        Object obj4222 = new Object();
                                        f = new Float(f9222);
                                        if (((Number) O.a()).floatValue() == RecyclerView.B1) {
                                        }
                                        ufVar = new uf(f9222, obj4222, lr3Var3, 1);
                                        sq3Var3.R = lr3Var3;
                                        sq3Var3.X = null;
                                        sq3Var3.Y = null;
                                        sq3Var3.Z = null;
                                        sq3Var3.d0 = i4;
                                        sq3Var3.k0 = 2;
                                        if (kj2.o(O, f, null, !z, ufVar, sq3Var3, 2) != x61Var) {
                                        }
                                        return x61Var;
                                    }
                                    lr3Var3 = lr3Var5;
                                    i4 = i10;
                                    zg5Var3 = zg5Var2;
                                    e02 = f4;
                                    bh5Var2 = bh5Var;
                                    i11 = i8;
                                    return x61Var;
                                }
                                break;
                            default:
                                i9 = ((nr4) lr3Var2.c).n();
                                if (i9 > 0) {
                                }
                                break;
                        }
                    }
                    return jg7.a;
                }
                oi2.Y(obj3);
                if (i12 < RecyclerView.B1) {
                    s53.a("Index should be non-negative");
                }
                try {
                    e0 = qh1Var.e0(2500.0f);
                    e02 = qh1Var.e0(1500.0f);
                    e03 = qh1Var.e0(50.0f);
                    obj = new Object();
                    obj.A = true;
                    obj2 = new Object();
                    obj2.A = ak7.f(RecyclerView.B1, RecyclerView.B1, 30);
                } catch (fc3 e8) {
                    e = e8;
                    lr3Var2 = lr3Var;
                    i4 = i12;
                    sq3Var2 = sq3Var;
                    lr3Var3 = lr3Var2;
                    sq3Var3 = sq3Var2;
                    O = ak7.O(e.B, RecyclerView.B1, RecyclerView.B1, 30);
                    float f92222 = e.A;
                    Object obj42222 = new Object();
                    f = new Float(f92222);
                    if (((Number) O.a()).floatValue() == RecyclerView.B1) {
                    }
                    ufVar = new uf(f92222, obj42222, lr3Var3, 1);
                    sq3Var3.R = lr3Var3;
                    sq3Var3.X = null;
                    sq3Var3.Y = null;
                    sq3Var3.Z = null;
                    sq3Var3.d0 = i4;
                    sq3Var3.k0 = 2;
                    if (kj2.o(O, f, null, !z, ufVar, sq3Var3, 2) != x61Var) {
                    }
                    return x61Var;
                }
                if (!M(lr3Var, i)) {
                    lr3Var2 = lr3Var;
                    if (i12 > ((pr3) lr3Var2.c).h()) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    ?? obj6 = new Object();
                    obj6.A = 1;
                    f2 = e03;
                    i7 = i6;
                    f3 = e0;
                    i8 = i2;
                    bh5Var = obj6;
                    sq3Var4 = sq3Var;
                    zg5Var = obj;
                    dh5Var = obj2;
                    f4 = e02;
                    if (zg5Var.A) {
                    }
                    return jg7.a;
                }
                throw new fc3(lr3Var.b(i), (uo) obj2.A);
            }
        }
        sq3Var = new s41(s41Var);
        Object obj32 = sq3Var.j0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i3 = sq3Var.k0;
        int i142 = 30;
        float f72 = RecyclerView.B1;
        if (i3 == 0) {
        }
    }

    public static final boolean j(boolean z, lr3 lr3Var, int i) {
        if (z) {
            if (lr3Var.c() <= i) {
                if (lr3Var.c() == i && lr3Var.d() > 0) {
                    return true;
                }
                return false;
            }
            return true;
        } else if (lr3Var.c() >= i) {
            if (lr3Var.c() == i && lr3Var.d() < 0) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    public static final int k(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            int i3 = (j > jArr[i2] ? 1 : (j == jArr[i2] ? 0 : -1));
            if (i3 > 0) {
                i = i2 + 1;
            } else if (i3 < 0) {
                length = i2 - 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    public static final yb6 l(String str, np2 np2Var, wb6[] wb6VarArr, qn2 qn2Var) {
        if (!qs6.v0(str)) {
            if (!np2Var.equals(bt6.e)) {
                br0 br0Var = new br0(str);
                qn2Var.g(br0Var);
                return new yb6(str, np2Var, br0Var.c.size(), fv.T0(wb6VarArr), br0Var);
            }
            i.h("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        i.h("Blank serial names are prohibited");
        return null;
    }

    public static yb6 m(String str, np2 np2Var, wb6[] wb6VarArr) {
        if (!qs6.v0(str)) {
            if (!np2Var.equals(bt6.e)) {
                br0 br0Var = new br0(str);
                return new yb6(str, np2Var, br0Var.c.size(), fv.T0(wb6VarArr), br0Var);
            }
            i.h("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        i.h("Blank serial names are prohibited");
        return null;
    }

    public static final void n(int i, int i2, wb6 wb6Var) {
        if (i > 0) {
            return;
        }
        String g = wb6Var.g(i2);
        String a2 = wb6Var.a();
        throw new IllegalArgumentException(i + " is not allowed in ProtoNumber for property '" + g + "' of '" + a2 + "', because protobuf supports field numbers in range 1..2147483647");
    }

    public static void o(Object obj) {
        if (obj != null) {
            return;
        }
        u34.x("Cannot return null from a non-@Nullable @Provides method");
    }

    public static int p(Context context, String str) {
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
                        int i = 1;
                        if (appOpsManager == null) {
                            noteProxyOpNoThrow = 1;
                        } else {
                            noteProxyOpNoThrow = appOpsManager.checkOpNoThrow(permissionToOp, callingUid, packageName);
                        }
                        if (noteProxyOpNoThrow == 0) {
                            String d2 = rp.d(context);
                            if (appOpsManager != null) {
                                i = appOpsManager.checkOpNoThrow(permissionToOp, myUid, d2);
                            }
                            noteProxyOpNoThrow = i;
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

    public static ja4 q() {
        long[] jArr = b66.a;
        return new ja4();
    }

    public static byte[] r(int i, int i2, int i3, int i4, short s, long j, byte[] bArr) {
        byte[] bArr2 = new byte[520];
        ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.BIG_ENDIAN);
        order.putInt(0, 65537);
        Charset charset = StandardCharsets.US_ASCII;
        charset.getClass();
        byte[] bytes = "Root-CA00000001-CP0000000b".getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        if (length > 64) {
            length = 64;
        }
        System.arraycopy(bytes, 0, bArr2, 320, length);
        order.putLong(388, 4294967296L);
        order.putInt(396, i);
        order.putInt(400, i2);
        order.putInt(410, i3);
        order.putInt(414, i4);
        order.putShort(476, s);
        order.putShort(478, (short) 1);
        order.putShort(480, (short) 0);
        order.putInt(484, 0);
        order.putShort(488, (short) 0);
        order.putShort(490, (short) 1);
        order.putLong(492, j);
        if (bArr != null && bArr.length >= 20) {
            System.arraycopy(bArr, 0, bArr2, 500, 20);
        }
        return bArr2;
    }

    public static final float s(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = RecyclerView.B1;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final long t(wb6 wb6Var, int i) {
        long j;
        wb6Var.getClass();
        List i2 = wb6Var.i(i);
        int i3 = i + 1;
        q45 q45Var = q45.DEFAULT;
        int size = i2.size();
        int i4 = i3;
        boolean z = false;
        boolean z2 = false;
        for (int i5 = 0; i5 < size; i5++) {
            Annotation annotation = (Annotation) i2.get(i5);
            if (annotation instanceof r45) {
                i4 = ((r45) annotation).number();
                n(i4, i5, wb6Var);
            } else if (annotation instanceof v45) {
                q45Var = ((v45) annotation).type();
            } else if (annotation instanceof t45) {
                z2 = true;
            } else if (annotation instanceof s45) {
                z = true;
            }
        }
        if (!z) {
            i3 = i4;
        }
        long j2 = 0;
        if (z2) {
            j = 4294967296L;
        } else {
            j = 0;
        }
        if (z) {
            j2 = 68719476736L;
        }
        return i3 | j2 | j | q45Var.getSignature$kotlinx_serialization_protobuf();
    }

    public static final int u(wb6 wb6Var, int i, boolean z) {
        wb6Var.getClass();
        List i2 = wb6Var.i(i);
        if (!z) {
            i++;
        }
        int size = i2.size();
        for (int i3 = 0; i3 < size; i3++) {
            Annotation annotation = (Annotation) i2.get(i3);
            if (annotation instanceof s45) {
                return -2;
            }
            if (annotation instanceof r45) {
                i = ((r45) annotation).number();
                if (!z) {
                    n(i, i3, wb6Var);
                }
            }
        }
        return i;
    }

    public static final long v(long j, boolean z, int i, float f) {
        int h;
        if ((z || i == 2 || i == 4 || i == 5) && q21.d(j)) {
            h = q21.h(j);
        } else {
            h = Integer.MAX_VALUE;
        }
        if (q21.j(j) != h) {
            h = gi2.q(ii2.q(f), q21.j(j), h);
        }
        return nb3.t(0, h, 0, q21.g(j));
    }

    public static final int w(int i, String str) {
        String str2;
        int i2;
        ws1 F = F();
        Integer num = null;
        if (F != null) {
            boolean z = true;
            if (F.c() != 1) {
                z = false;
            }
            np2.A("Not initialized yet", z);
            np2.x(str, "charSequence cannot be null");
            bt btVar = F.e.b;
            btVar.getClass();
            if (i < 0 || i >= str.length()) {
                str2 = str;
                i2 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    se7[] se7VarArr = (se7[]) spanned.getSpans(i, i + 1, se7.class);
                    if (se7VarArr.length > 0) {
                        i2 = spanned.getSpanEnd(se7VarArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i2 = ((ht1) btVar.Q(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new ht1(i))).L;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (i2 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    public static final int x(int i, String str) {
        ws1 F = F();
        Integer num = null;
        if (F != null) {
            Integer valueOf = Integer.valueOf(F.b(Math.max(0, i - 1), str));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final List y(wb6 wb6Var, jd1 jd1Var) {
        List<wb6> k1;
        wb6Var.getClass();
        jd1Var.getClass();
        np2 e2 = wb6Var.e();
        if (nb3.k(e2, dz4.e)) {
            ar0 x = n16.x(wb6Var);
            k1 = yt1.A;
            if (x != null) {
                k1 = new ArrayList(ht0.v0(k1, 10));
            }
        } else if (nb3.k(e2, dz4.f)) {
            wb6 j = wb6Var.j(1);
            j.getClass();
            k1 = gt0.k1(new dv(j, 4));
        } else {
            u34.h(wb6Var.a(), " should be abstract or sealed or interface to be used as @ProtoOneOf property.", "Class ");
            return null;
        }
        for (wb6 wb6Var2 : k1) {
            List<Annotation> i = wb6Var2.i(0);
            if (i == null || !i.isEmpty()) {
                for (Annotation annotation : i) {
                    if (annotation instanceof r45) {
                        break;
                    }
                }
            }
            String a2 = wb6Var2.a();
            String a3 = wb6Var.a();
            throw new IllegalArgumentException(a2 + " implementing oneOf type " + a3 + " should have @ProtoNumber annotation in its single property.");
        }
        return k1;
    }

    public float K(View view) {
        float transitionAlpha;
        if (c) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        return view.getAlpha();
    }

    public void Y(View view, float f) {
        if (c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        view.setAlpha(f);
    }

    public abstract of5 z();
}
